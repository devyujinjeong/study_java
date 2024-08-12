package arrayListTask.cosmetic;

public class Test {
	public static void main(String[] args) {
		Shop shop = new Shop(); 
		
		// ȭ��ǰ �߰�
		Cosmetic cosmetic1 = new Cosmetic();
		Cosmetic cosmetic2 = new Cosmetic();
		Cosmetic cosmetic3 = new Cosmetic();
		Cosmetic cosmetic4 = new Cosmetic();
		
		cosmetic1.setCosmeticNumber(1);
		cosmetic1.setCosmeticName("��ũ �� ����");
		cosmetic1.setCosmeticBrand("�丮���");
		cosmetic1.setCosmeticPrice(9900);
		cosmetic1.setCosmeticType("����ũ��");		
		
		cosmetic2.setCosmeticNumber(2);
		cosmetic2.setCosmeticName("1�� ���");
		cosmetic2.setCosmeticBrand("�ѹ�����");
		cosmetic2.setCosmeticPrice(20000);
		cosmetic2.setCosmeticType("��Ų");	
		
		cosmetic3.setCosmeticNumber(3);
		cosmetic3.setCosmeticName("��ũ ���� �۷���");
		cosmetic3.setCosmeticBrand("�丮���");
		cosmetic3.setCosmeticPrice(8900);
		cosmetic3.setCosmeticType("����ũ��");	
		
		cosmetic4.setCosmeticNumber(4);
		cosmetic4.setCosmeticName("�ٵ� �μ�");
		cosmetic4.setCosmeticBrand("�ϸ���");
		cosmetic4.setCosmeticPrice(9900);
		cosmetic4.setCosmeticType("�ٵ�");	
		
		shop.insert(cosmetic1);
		shop.insert(cosmetic2);
		shop.insert(cosmetic3);
		shop.insert(cosmetic4);
		
		// ��ü ȭ��ǰ ��������
		System.out.println(shop.selectAll());
		
		// ȭ��ǰ type�� ���
		System.out.println(shop.selectByType("�ٵ�"));
		
		// ȭ��ǰ type�� ����
		System.out.println(shop.countCosmeticByType("��Ų"));
		System.out.println(shop.countCosmeticByType("����ũ��"));
		System.out.println(shop.countCosmeticByType("�ٵ�"));
		
		// ȭ��ǰ �귣�庰 ���
		System.out.println(shop.selectByBrand("�丮���"));

		// ȭ��ǰ ����
		shop.updatePrice(1,7900);
		
		// Ư�� ��ǰ �ҷ�����
		System.out.println(shop.selectOne(1));
		
		// ȭ��ǰ �����ϱ�
		shop.delete(1);
		System.out.println(shop.selectOne(1));

		
	}
}
