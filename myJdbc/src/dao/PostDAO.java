package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.PostVO;
import vo.UserVO;

public class PostDAO {
	
//   연결
   private Connection connection;
//   쿼리 작성
   private PreparedStatement preparedStatement;
//   결과
   private ResultSet resultSet;
   
//   게시글 전체 조회
   public List<PostVO> selectAll() {
      String query = "SELECT ID, POST_TITLE, POST_CONTENT, POST_REGISTER_DATE, POST_UPDATE_DATE, USER_ID "
             + "FROM TBL_POST";
      List<PostVO> posts = new ArrayList<PostVO>(); //arraylist에 담고 화면에 보여줄 것임
//    이건 뭘까....?
      PostVO postVO = null;
      
      try {
         connection = DBConnecter.getConnection(); 
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
//       resultSet에서 next()메소드를 살펴보면
//       맨 마지막에 있는 행 다음으로 갈 때 false임
//       그래서 이렇게 할 경우, 마지막 행까지 값을 가져오게 되는 것임.
         while(resultSet.next()) {
            postVO = new PostVO(); // 객체로 만드는거긴 한데.....음.....?
            postVO.setId(resultSet.getLong(1));
            postVO.setPostTitle(resultSet.getString(2));
            postVO.setPostContent(resultSet.getString(3));
            postVO.setPostRegisterDate(resultSet.getString(4));
            postVO.setPostUpdateDate(resultSet.getString(5));
            postVO.setUserId(resultSet.getLong(6));

            posts.add(postVO);
         }
      } catch (SQLException e) {
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
      return posts;
   }
   
//   게시글 조회
   public PostVO select() {
      String query = "SELECT ID, POST_TITLE, POST_CONTENT, POST_REGISTER_DATE, POST_UPDATE_DATE, USER_ID "
             + "FROM TBL_POST WHERE ID = ?";
      PostVO postVO = null;
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            postVO = new PostVO();
            postVO.setId(resultSet.getLong(1));
               postVO.setPostTitle(resultSet.getString(2));
               postVO.setPostContent(resultSet.getString(3));
               postVO.setPostRegisterDate(resultSet.getString(4));
               postVO.setPostUpdateDate(resultSet.getString(5));
               postVO.setUserId(resultSet.getLong(6));
         }
      } catch (SQLException e) {
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

      return postVO;
      
   }
   
//   게시글 작성자 조회
   public UserVO selectUserByPost(Long id) {
      String query = "SELECT U.ID, U.USER_ID, USER_PASSWORD, USER_NAME, USER_PHONE, USER_NICKNAME, USER_EMAIL, USER_BIRTH, USER_RECOMMENDER_ID, USER_STATUS "
            + "FROM TBL_USER U JOIN TBL_POST P ON U.USER_ID = P.USER_ID AND P.ID = ?";
      UserVO userVO = null;
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         resultSet = preparedStatement.executeQuery();
         
         if(resultSet.next()) {
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
         }
      } catch (SQLException e) {
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
   
//   게시글 추가
   public void insert(PostVO postVO) {
      String query = "INSERT INTO TBL_POST "
            + "(ID, POST_TITLE, POST_CONTENT, USER_ID) "
            + "VALUES(SEQ_POST.NEXTVAL, ?, ?, ?)";
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
         preparedStatement.setLong(3, UserDAO.session);
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
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
   
//   게시글 수정
   public void update(PostVO postVO) {
      String query = "UPDATE TBL_POST SET POST_TITLE = ?, POST_CONTENT = ?, POST_UPDATE_DATE = SYSDATE WHERE ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, postVO.getPostTitle());
         preparedStatement.setString(2, postVO.getPostContent());
         preparedStatement.setLong(3, postVO.getId());
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
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
   
//   게시글 삭제
   public void delete(Long id) {
      String query = "DELETE FROM TBL_POST WHERE ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
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
   
//   조회수 증가(조회할 때 마다)
   public void updateReadCount(Long id) {
      String query = "UPDATE TBL_POST SET POST_READ_COUNT = POST_READ_COUNT + 1 WHERE ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
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
}
