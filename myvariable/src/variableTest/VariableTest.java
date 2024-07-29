package variableTest;

public class VariableTest {
	public static void main(String[] args) {
		int age=10;
	    float height= 10.1563f; //그냥 10.1563은 8바이트이기 때문에 4바이트로 맞추기 위해 뒤에 f를 붙여야 함.
	    double weight= 10.1563;
	    char grade= 'A';
	    String data= "ABC";
	            
	    System.out.println(age); 
	    System.out.println(height);
	    System.out.println(weight);
	    System.out.println(grade);
	    System.out.println(data);
   }
}
	