package arrayListTask.cosmetic;

public class Test {
	public static void main(String[] args) {
		Shop shop = new Shop(); 
		
		// 화장품 추가
		Cosmetic cosmetic1 = new Cosmetic();
		Cosmetic cosmetic2 = new Cosmetic();
		Cosmetic cosmetic3 = new Cosmetic();
		Cosmetic cosmetic4 = new Cosmetic();
		
		cosmetic1.setCosmeticNumber(1);
		cosmetic1.setCosmeticName("잉크 더 벨벳");
		cosmetic1.setCosmeticBrand("페리페라");
		cosmetic1.setCosmeticPrice(9900);
		cosmetic1.setCosmeticType("메이크업");		
		
		cosmetic2.setCosmeticNumber(2);
		cosmetic2.setCosmeticName("1번 토너");
		cosmetic2.setCosmeticBrand("넘버즈인");
		cosmetic2.setCosmeticPrice(20000);
		cosmetic2.setCosmeticType("스킨");	
		
		cosmetic3.setCosmeticNumber(3);
		cosmetic3.setCosmeticName("잉크 무드 글로이");
		cosmetic3.setCosmeticBrand("페리페라");
		cosmetic3.setCosmeticPrice(8900);
		cosmetic3.setCosmeticType("메이크업");	
		
		cosmetic4.setCosmeticNumber(4);
		cosmetic4.setCosmeticName("바디 로션");
		cosmetic4.setCosmeticBrand("일리윤");
		cosmetic4.setCosmeticPrice(9900);
		cosmetic4.setCosmeticType("바디");	
		
		shop.insert(cosmetic1);
		shop.insert(cosmetic2);
		shop.insert(cosmetic3);
		shop.insert(cosmetic4);
		
		// 전체 화장품 가져오기
		System.out.println(shop.selectAll());
		
		// 화장품 type별 목록
		System.out.println(shop.selectByType("바디"));
		
		// 화장품 type별 개수
		System.out.println(shop.countCosmeticByType("스킨"));
		System.out.println(shop.countCosmeticByType("메이크업"));
		System.out.println(shop.countCosmeticByType("바디"));
		
		// 화장품 브랜드별 목록
		System.out.println(shop.selectByBrand("페리페라"));

		// 화장품 수정
		shop.updatePrice(1,7900);
		
		// 특정 제품 불러오기
		System.out.println(shop.selectOne(1));
		
		// 화장품 삭제하기
		shop.delete(1);
		System.out.println(shop.selectOne(1));

		
	}
}
