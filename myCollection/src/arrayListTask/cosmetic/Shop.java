package arrayListTask.cosmetic;

import java.util.ArrayList;
import arrayListTask.DBConnecter;
import arrayListTask.food.Food;

public class Shop {
	// ȭ��ǰ �߰��ϱ�
	public void insert(Cosmetic cosmetic) {
		DBConnecter.cosmetics.add(cosmetic);
	}

	// ȭ��ǰ �����ϱ�
	public void delete(int num) {
		for (int i = 0; i < DBConnecter.cosmetics.size(); i++) {
			if (DBConnecter.cosmetics.get(i).getCosmeticNumber() == num) {
				DBConnecter.cosmetics.remove(i);
			}
		}
	}

	// ���ϴ� ȭ��ǰ �������� 
	public Cosmetic selectOne(int num) {
		Cosmetic userWant = null;
		
		for (Cosmetic cosmetic : DBConnecter.cosmetics) {
			if (cosmetic.getCosmeticNumber()==num) {
				userWant = cosmetic;
			}
		}
		
		return userWant;
	}
	
	// ���� �����ϱ�
	public void updatePrice(int num, int price) {
		Cosmetic cosmetic = selectOne(num);
		cosmetic.setCosmeticPrice(price);
	}

	// ��� ȭ��ǰ ��� ��������
	public ArrayList<Cosmetic> selectAll() {
		return DBConnecter.cosmetics;
	}

	// ȭ��ǰ �������� ��������
	public ArrayList<Cosmetic> selectByType(String cosmeticType) {
		ArrayList<Cosmetic> results = new ArrayList<Cosmetic>();

		for (Cosmetic cosmetic : DBConnecter.cosmetics) {
			if (cosmetic.getCosmeticType().equals(cosmeticType)) {
				results.add(cosmetic);
			}
		}

		return results;
	}
	
	// ȭ��ǰ ������ ���� ��������
	public int countCosmeticByType(String cosmeticType) {
		int count = 0;
		for (Cosmetic cosmetic : DBConnecter.cosmetics) {
			if (cosmetic.getCosmeticType().equals(cosmeticType)) {
				count++;
			}
		}
		return count;
	}
	
	
	// ȭ��ǰ �귣�庰�� ��������
	public ArrayList<Cosmetic> selectByBrand(String cosmeticBrand) {
		ArrayList<Cosmetic> results = new ArrayList<Cosmetic>();

		for (Cosmetic cosmetic : DBConnecter.cosmetics) {
			if (cosmetic.getCosmeticBrand().equals(cosmeticBrand)) {
				results.add(cosmetic);
			}
		}

		return results;
	}
	
	
}
