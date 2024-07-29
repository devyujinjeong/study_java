package arrayListTask.user;

import arrayListTask.DBConnecter;

public class UserField {
	
	public static String userId;
	
//	아이디 중복검사
	public User checkId(String id) { //화면을 생각했을 때 아이디는 사용자에게 입력 받아야 함
		User temp = null; //User라는 자료형인 temp
//		DBConnector에 users라는 객체에 들어있는 값을 user에 넣기 반복하기 
		for(User user : DBConnecter.users) {
			if(user.getId().equals(id)) { //만약 user의 id가 입력한 id와 같다면
				temp = user; // temp에 user를 할당해라
				break; //if안의 break는 if문을 감싸고 있는 중괄호 자체를 탈출하는 것임.
			}
		}
		return temp;
	}
	
//	회원가입
	public void join(User user) { 
//		DBConnecter에 있는 users라는 arraylist에 user 정보를 추가하기
		DBConnecter.users.add(user); 
	}
	
//	로그인
	public boolean login(String id, String password) {
//		로그인을 하려면 당연히 중복 검사에서 통과된 아이디를 사용해야 하므로 위에서 만든 아이디 체크 메소드를 사용
//		중복 검사가 완료된 아이디를 통해 초기화
		User user = checkId(id); 
		if(user != null) { //user가 있다면. 이 코드에서는 user가 null이 아니라면
//			패스워드에 저장되어 있는 패스워드와 입력한 패스워드가 같다면
			if(user.getPassword().equals(password)) {
				userId = id;
				return true; 
			}
		}
//		user가 없음 --> 아 그래서 보통 비밀번호가 틀렸습니다나 아이디가 틀렸습니다가 아니라
//		아이디 또는 비밀번호가 틀렸습니다. 라는 문구가 나오는 것
		return false; 
	}
	
//	로그아웃
	public void logout() {
		userId = null; 
	}
	
//	회원정보 조회
	public User select() {
		return checkId(userId);
	}
	
//	정보 수정
	public void update(User user) {
		User foundUser = checkId(user.getId());
		foundUser.setName(user.getName());
		foundUser.setPassword(user.getPassword());
		foundUser.setPhoneNumber(user.getPhoneNumber());
	}
}