package anonymousTask1;

public class Building{
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.register(new Form() { 	
//		어차피 등록은 한번만 하면 됨 --> 그래서 익명 메소드로 구현함 , 이 양식은 또 쓸 필요가 없음
//		현재 Form이라는 인터페이스는 구현되어 있지 않음
			@Override
			public void sell(String order) { //메뉴판을 가져와서 검사하는 메소드		
				String[] menu = getMenu(); //밑에서 메뉴 데리고 오기
				for(int i=0;i<menu.length;i++) {
					if(menu[i].equals(order)) { //메뉴 중에 order와 동일한 게 있으면 밑에 내용 출력하기
						System.out.println(order+"판매완료");
					}
				}
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노","카페라떼","아포가토"};
				
			}
		});
		
//		잠실점 오픈, 판매 대신 무료 나눔 행사중 출력
//		FormAdapter 생성 -> getMenu()만 재정의
//		원래 Form이라는 인터페이스를 받았다면 위의 강남점처럼 모두 구현해야 함.
//		jamsil이라는 객체를 만들어내고 있음 (Starbucks에 있는 필드를 사용)
//		그래서 이제 
		Starbucks jamsil = new Starbucks();
		jamsil.register(new FormAdapter() {
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노", "카페라떼", "아포가토"};
			}
		});
		
	}
}
