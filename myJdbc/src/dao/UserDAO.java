package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.PostVO;
import vo.UserVO;

public class UserDAO {
   
   public static Long session;
   
//   연결
   private Connection connection;
//   쿼리 작성 --> statement는 쿼리 전달 통로라고 생각하면 됨
   private PreparedStatement preparedStatement;
//   결과 --> 결과값을 사용자 화면에 보여주고 싶을 때 사용
   private ResultSet resultSet;
   
//   아이디 중복검사
   public boolean checkId(String userId) { //우선 사용자에게 아이디를 받아야하니깐 매개변수 설정하기
//     check에서 true가 나오면 아이디가 존재한다는 의미이므로, 중복되었다고 뜸
//	   false가 나오면 중복된 아이디가 존재하지 않다는 의미
	   boolean check = false;
//     쿼리 작성 --> select
	   String query = "SELECT USER_ID FROM TBL_USER WHERE USER_ID = ?";
//      연결
      connection = DBConnecter.getConnection();
	      try {
	//       쿼리 전달 : 그럼 이게 connection에 있는 prepareStatement라는 메소드를 통해 query를 전달한다는 의미
	         preparedStatement = connection.prepareStatement(query);
	//       쿼리 완성 --> ?로 나와 있는 부분을 완성시킨다고 생각하면 됨.
	         preparedStatement.setString(1, userId);
	//       쿼리 날리기
	//       1. SELECT : executeQuery()
	//       2. 그 외 : executeUpdate()
//	         뭔가 여기 부분 코드가 이해 안감. check 부분이 true, false를 전달받아서 실패 혹은 성공을 알려주기 위해서 선언한 건가?
	         resultSet = preparedStatement.executeQuery();
	         check = resultSet.next();
	         
	      } catch (SQLException e) {
	         System.out.println("checkId(String) SQL문 오류");
	         e.printStackTrace();
	      } finally {
	         try {
//	        	 역순으로 닫아주기
//	        	 여기부분에서 null이 아니다라는 이 코드도 잘 이해가 안감.
	            if(resultSet != null) {
	               resultSet.close();
	            }
	            if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            throw new RuntimeException(e.getMessage());
	         }
	      }
	      return check;
   }
   
//   회원가입
   public void join(UserVO user) {
      String query = "INSERT INTO TBL_USER "
            + "(ID, USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID) "
            + "VALUES(SEQ_USER.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?)";
     // 연결하기
      connection = DBConnecter.getConnection();
      
      try {
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getUserId());
        preparedStatement.setString(2, user.getUserPassword());
        preparedStatement.setString(3, user.getUserName());
        preparedStatement.setString(4, user.getUserPhone());
        preparedStatement.setString(5, user.getUserNickname());
        preparedStatement.setString(6, user.getUserEmail());
        preparedStatement.setString(7, user.getUserBirth());
        preparedStatement.setString(8, user.getUserRecommenderId());
        
		preparedStatement.executeUpdate();
		
	} catch (SQLException e) {
		 System.out.println("join(UserVO) SQL문 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
      
//   로그인
   public boolean login(String userId, String userPassword) {
      String query = "SELECT ID FROM TBL_USER WHERE USER_ID = ? AND USER_PASSWORD = ?";
      boolean check = false;
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userId);
         preparedStatement.setString(2, userPassword);
         resultSet = preparedStatement.executeQuery();
         check = resultSet.next();
         
         if(check) {
            session = resultSet.getLong(1);
         }
      } catch (SQLException e) {
         System.out.println("login(String, String) SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      
      return check;
   }
   
//   로그아웃
   public void logout() {
      session = null;
   }
   
//   마이 페이지
   public UserVO select() {
      String query = "SELECT ID, USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
            + "FROM TBL_USER WHERE ID = ?";
      UserVO userVO = null;
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session); //마이페이지면 번호를 기억한 상태에서 조회하는 것이니깐
         resultSet = preparedStatement.executeQuery();
         userVO = new UserVO();
         if(resultSet.next()) {
            userVO.setId(resultSet.getLong(1));
            userVO.setUserId(resultSet.getString(2));
            userVO.setUserPassword(resultSet.getString(3));
            userVO.setUserName(resultSet.getString(4));
            userVO.setUserPhone(resultSet.getString(5));
            userVO.setUserNickname(resultSet.getString(6));
            userVO.setUserEmail(resultSet.getString(7));
            userVO.setUserBirth(resultSet.getString(8));
            userVO.setUserRecommenderId(resultSet.getString(9));
            userVO.setUserStatus(resultSet.getString(10));
         }
      } catch (SQLException e) {
         System.out.println("select() SQL 오류");
         e.printStackTrace();
         
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return userVO;
   }
   
//   회원 전체 조회
   public List<UserVO> selectAll() {
      String query = "SELECT ID, USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
            + "FROM TBL_USER";
      List<UserVO> users = new ArrayList<UserVO>();
      UserVO userVO = null;
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         while(resultSet.next()) {
            userVO = new UserVO();
            userVO.setId(resultSet.getLong(1));
            userVO.setUserId(resultSet.getString(2));
            userVO.setUserPassword(resultSet.getString(3));
            userVO.setUserName(resultSet.getString(4));
            userVO.setUserPhone(resultSet.getString(5));
            userVO.setUserNickname(resultSet.getString(6));
            userVO.setUserEmail(resultSet.getString(7));
            userVO.setUserBirth(resultSet.getString(8));
            userVO.setUserRecommenderId(resultSet.getString(9));
            userVO.setUserStatus(resultSet.getString(10));
            
            users.add(userVO);
         }
      } catch (SQLException e) {
         System.out.println("selectAll() SQL 오류");
         e.printStackTrace();
         
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return users;
   }
   
//   회원 탈퇴
   public void withdraw() {
      String query = "UPDATE TBL_USER SET USER_STATUS = '탈퇴' WHERE ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         System.out.println("withdraw() SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
   
//   회원 복구
   public void restore() {
      String query = "UPDATE TBL_USER SET USER_STATUS = '일반' WHERE ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         System.out.println("restore() SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
   
//   추천인 조회
   public List<UserVO> selectRecommender(){
      String query = "SELECT ID, USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
            + "FROM TBL_USER WHERE USER_RECOMMENDER_ID = (SELECT USER_ID FROM TBL_USER WHERE ID = ?)";
      List<UserVO> users = new ArrayList<UserVO>();
      UserVO userVO = null;
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            userVO = new UserVO();
            userVO.setId(resultSet.getLong(1));
            userVO.setUserId(resultSet.getString(2));
            userVO.setUserPassword(resultSet.getString(3));
            userVO.setUserName(resultSet.getString(4));
            userVO.setUserPhone(resultSet.getString(5));
            userVO.setUserNickname(resultSet.getString(6));
            userVO.setUserEmail(resultSet.getString(7));
            userVO.setUserBirth(resultSet.getString(8));
            userVO.setUserRecommenderId(resultSet.getString(9));
            userVO.setUserStatus(resultSet.getString(10));
            users.add(userVO);
         }
      } catch (SQLException e) {
         System.out.println("selectRecommender() SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return users;
   }
   
   
//   추천수 조회
   public Long selectCountOfRecommender(){
      String query = "SELECT COUNT(ID) "
            + "FROM TBL_USER WHERE USER_RECOMMENDER_ID = (SELECT USER_ID FROM TBL_USER WHERE ID = ?)";
      Long count = 0L;
      List<UserVO> users = new ArrayList<UserVO>();
      UserVO userVO = null;
      
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, session);
         resultSet = preparedStatement.executeQuery();
         
         resultSet.next();
         count = resultSet.getLong(1);
      } catch (SQLException e) {
         System.out.println("selectRecommender() SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
      return count;
   }
   
   
//   회원 정보 수정
   public void update(UserVO userVO) {
      String query = "UPDATE TBL_USER SET USER_PASSWORD = ?, USER_NAME = ?, USER_PHONE = ?, USER_NICKNAME = ?, USER_EMAIL = ? WHERE ID = ?";
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, userVO.getUserPassword());
         preparedStatement.setString(2, userVO.getUserName());
         preparedStatement.setString(3, userVO.getUserPhone());
         preparedStatement.setString(4, userVO.getUserNickname());
         preparedStatement.setString(5, userVO.getUserEmail());
         preparedStatement.setLong(6, session);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         System.out.println("update(UserVO) SQL 오류");
         e.printStackTrace();
      } finally {
         try {
            if(resultSet != null) {
               resultSet.close();
            }
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
         }
      }
   }
}
























	
	
	
	
	
