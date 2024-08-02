package anonymousTask1;

public class Starbucks {
//	지점(객체)에서 첫 1회 등록시 사용할 메소드
//	Form이라는 틀을 매개변수로 받아야함.
	public void register(Form form) { // 지점에게 작성해야 하는 서류(양식) 받기
		String[] menu = form.getMenu();
		
		for (int i = 0; i < menu.length; i++) { // 메뉴 출력하기
			System.out.println(i + 1 + "." + menu[i]);
		}
		
		if(form instanceof FormAdapter) {// form이 FormAdapter 타입이면 "무료나눔 행사중입니다." 출력하기
			System.out.println("무료나눔 행사중입니다.");
		}
		else {
			form.sell("아메리카노");
		}
	}
}
