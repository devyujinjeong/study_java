package arrayListTask.user;

public class User {
//	private�� �޼ҵ�θ� �����϶�� �ǹ̷� ����ϴ� ��.
	private String name;
	private String id;
	private String password;
	private String phoneNumber;
	
//	�⺻ ������
	public User() {;}
	
//	getter,setter �޼ҵ�
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
	
//	toString �������ϱ�
//	�ʵ��� �ʱ�ȭ ���� Ȯ��. ��, ����ڰ� �Է��� ���� Ȯ���ϱ� �����̶�� �����ϱ�
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}

//	hashCode �������ϱ�
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

//	id�θ� equals�� ������. id�� �ߺ��� ���� ���̱� ������ --> ������ �� �ִ� ���� ��
//	�׷��� DB�� �����ؼ� ������ ���� PK���� equals�� ������
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