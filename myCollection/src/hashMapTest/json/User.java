package hashMapTest.json;

public class User {
	   private String id;
	   private String password;
	   private String name;
	   private int age;
	   
	   public User() {;}

	   public User(String id, String password, String name, int age) {
	      super();
	      this.id = id;
	      this.password = password;
	      this.name = name;
	      this.age = age;
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

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getAge() {
	      return age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }

	   @Override
	   public String toString() {
	      return "User [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + "]";
	   }

	   @Override
	   public int hashCode() {
	      final int prime = 31;
	      int result = 1;
	      result = prime * result + ((id == null) ? 0 : id.hashCode());
	      return result;
	   }

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
