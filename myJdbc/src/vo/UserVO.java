package vo;

public class UserVO {
   private Long id;
   private String userId;
   private String userPassword;
   private String userName;
   private String userPhone;
   private String userNickname;
   private String userEmail;
   private String userBirth;
   private String userRecommenderId;
   private String userStatus;
   
   public UserVO() {;}

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserPassword() {
      return userPassword;
   }

   public void setUserPassword(String userPassword) {
      this.userPassword = userPassword;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserPhone() {
      return userPhone;
   }

   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }

   public String getUserNickname() {
      return userNickname;
   }

   public void setUserNickname(String userNickname) {
      this.userNickname = userNickname;
   }

   public String getUserEmail() {
      return userEmail;
   }

   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }

   public String getUserBirth() {
      return userBirth;
   }

   public void setUserBirth(String userBirth) {
      this.userBirth = userBirth;
   }

   public String getUserRecommenderId() {
      return userRecommenderId;
   }

   public void setUserRecommenderId(String userRecommenderId) {
      this.userRecommenderId = userRecommenderId;
   }

   public String getUserStatus() {
      return userStatus;
   }

   public void setUserStatus(String userStatus) {
      this.userStatus = userStatus;
   }

   @Override
   public String toString() {
      return "MemberVO [id=" + id + ", userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName
            + ", userPhone=" + userPhone + ", userNickname=" + userNickname + ", userEmail=" + userEmail
            + ", userBirth=" + userBirth + ", userRecommenderId=" + userRecommenderId + ", userStatus=" + userStatus
            + "]";
   }

//   아이디가 PK이기 때문에 hashCode와 equals 재정의는 id로만!! 
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
      UserVO other = (UserVO) obj;
      if (id == null) {
         if (other.id != null)
            return false;
      } else if (!id.equals(other.id))
         return false;
      return true;
   }
}