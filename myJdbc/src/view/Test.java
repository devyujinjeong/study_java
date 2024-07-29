package view;

import dao.PostDAO;
import dao.UserDAO;
import oracle.net.aso.a;
import vo.PostVO;
import vo.UserVO;

public class Test {
   public static void main(String[] args) {
	   PostDAO postDAO = new PostDAO();
	   PostVO postVO = new PostVO();
	   UserDAO userDAO = new UserDAO();
	   UserVO userVO = new UserVO();
	   
	   
////   로그인
	   if(userDAO.login("jyj1234", "1234")) {
	      System.out.println("로그인 성공, " + UserDAO.session);
	   }else {
	      System.out.println("로그인 실패");
	   }
	   
//	   게시글 추가 --> 로그인을 해야 userId가 나오게 되니깐
//	   postVO.setPostTitle("학교");
//	   postVO.setPostContent("학교의 종류"); 
//	   postVO.setUserId(UserDAO.session); //UserDAO.session이 null이라는데...?
//	   postDAO.insert(postVO);
//	   System.out.println("게시글 추가 성공");

	   
	    
//	   게시글 전체 조회
//	   System.out.println(postDAO.selectAll());
	   
//	   게시글 조회
//	   System.out.println(postDAO.select().getId());
	   
//	   게시글 작성자 조회
	  	   
//	   게시글 수정
//	   postDAO.update(postVO);
	   
//	   게시글 삭제
//	   postDAO.delete(null);
	   
//	   조회수 증가
//	   postDAO.selectUserByPost(null);
	   
//      
////      회원 전체 정보 조회
////      userDAO.selectAll().forEach(System.out::println);
//      
////      로그인
//      if(userDAO.login("hds1234", "1234")) {
//         System.out.println("로그인 성공, " + UserDAO.session);
////         마이페이지
//         userVO = userDAO.select();
//         System.out.println(userVO.toString());
//         
////         회원탈퇴
//         userDAO.withdraw();
//         userVO = userDAO.select();
//         System.out.println("회원탈퇴 성공, " + userVO.getUserStatus());
//         
////         회원복구
//         userDAO.restore();
//         userVO = userDAO.select();
//         System.out.println("회원복구 성공, " + userVO.getUserStatus());
//         
////         회원 정보 수정
//         userVO = userDAO.select();
//         userVO.setUserName("홍길동");
//         userDAO.update(userVO);
//         
//         userVO = userDAO.select();
//         System.out.println("회원수정 성공, " + userVO.toString());
//         
////         추천인 조회
//         userDAO.selectRecommender().forEach(System.out::println);
//         
////         추천수 조회
//         System.out.println("나를 추천한 사람: " + userDAO.selectCountOfRecommender());
//         
//      }else {
//         System.out.println("로그인 실패");
//      }
//      
////      아이디 중복검사, 회원가입
//	      userVO.setUserId("jyj1234");
//	      userVO.setUserPassword("1234");
//	      userVO.setUserName("정유진");
//	      userVO.setUserBirth("2001-01-01");
//	      userVO.setUserEmail("jyj1234@naver.com");
//	      userVO.setUserPhone("01043214321");
//	      userVO.setUserRecommenderId("jbg1234");
//	     
//	      if(!userDAO.checkId(userVO.getUserId())){
//	         userDAO.join(userVO);
//	         System.out.println("회원가입 성공");
//	      }else {	
//	         System.out.println("중복된 아이디");
//	      }
//  
   }
}
