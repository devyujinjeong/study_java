package anonymousTask;
// adapter 정확히 어떤식으로 사용하는건지 잘 이해가 안됨
// 여기에서 보면, 잠실점의 경우 getMenu()만 재정의 하면 되는 거임. 

public abstract class FormAdapter implements Form {
	@Override 
	public String[] getMenu() {return null;}
	@Override //재정의 하지 않을 것이기 때문에, 중괄호를 넣어 강제성을 없애줌.
	public void sell(String order) {;}
}
