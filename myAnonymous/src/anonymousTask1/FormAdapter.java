package anonymousTask1;
	
public abstract class FormAdapter implements Form {
	@Override 
	public String[] getMenu() {return null;}
	
	@Override //재정의 하지 않을 것이기 때문에, 중괄호를 넣어 강제성을 없애줌.
	public void sell(String order) {;}
}
