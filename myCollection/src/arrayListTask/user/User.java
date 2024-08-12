package arrayListTask.user;

public class User {
//	private는 메소드로만 접근하라는 의미로 사용하는 것.
	private String name;
	private String id;
	private String password;
	private String phoneNumber;
	
//	기본 생성자
	public User() {;}
	
//	getter,setter 메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
//	toString 재정의하기
//	필드의 초기화 여부 확인. 즉, 사용자가 입력한 값을 확인하기 위함이라고 생각하기
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}

//	hashCode 재정의하기
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

//	id로만 equals를 재정의. id는 중복이 없는 값이기 때문에 --> 구분할 수 있는 값을 비교
//	그래서 DB랑 연동해서 생각할 때는 PK으로 equals를 재정의
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}