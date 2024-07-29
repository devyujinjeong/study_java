package castingTest;

public class Encryption {
   public static void main(String[] args) {
      String password = "a1b2c3";
      String encryptedPassword = "", decryptedPassword = "";
      final int KEY = 3; //KEY는 3이라는 상수로 고정!!
      
      for (int i = 0; i < password.length(); i++) { //패스워드의 길이만큼 반복을 돌림
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      System.out.println(encryptedPassword);
      
      for (int i = 0; i < encryptedPassword.length(); i++) {
         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      
      System.out.println(decryptedPassword);
   }
}