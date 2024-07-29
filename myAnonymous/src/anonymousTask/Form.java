package anonymousTask;

public interface Form { // 현재 구현되어 있지 않음.
//	지점별 메뉴 --> 추상 메소드
	public String[] getMenu(); //String[] 배열로 return함
//	지저멸 판매 방식 -->외부에서 주문을 받아야 하니깐 매개변수 필요
	public void sell(String order);	// return할 필요가 없음. 주문만 받으면 되니깐
}
