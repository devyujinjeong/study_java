package arrayListTask.cosmetic;

import java.util.ArrayList;
import arrayListTask.DBConnecter;
import arrayListTask.food.Food;

public class Shop {
	// 화장품 추가하기
	public void insert(Cosmetic cosmetic) {
		DBConnecter.cosmetics.add(cosmetic);
	}

	// 화장품 삭제하기
	public void delete(int num) {
		for (int i = 0; i < DBConnecter.cosmetics.size(); i++) {
			if (DBConnecter.cosmetics.get(i).getCosmeticNumber() == num) {
				DBConnecter.cosmetics.remove(i);
			}
		}
	}

	// 원하는 화장품 가져오기 
	public Cosmetic selectOne(int num) {
		Cosmetic userWant = null;
		
		for (Cosmetic cosmetic : DBConnecter.cosmetics) {
			if (cosmetic.getCosmeticNumber()==num) {
				userWant = cosmetic;
			}
		}
		
		return userWant;
	}
	
	// 가격 수정하기
	public void updatePrice(int num, int price) {
		Cosmetic cosmetic = selectOne(num);
		cosmetic.setCosmeticPrice(price);
	}

	// 모든 화장품 목록 가져오기
	public ArrayList<Cosmetic> selectAll() {
		return DBConnecter.cosmetics;
	}

	// 화장품 종류별로 가져오기
	public ArrayList<Cosmetic> selectByType(String cosmeticType) {
		ArrayList<Cosmetic> results = new ArrayList<Cosmetic>();

		for (Cosmetic cosmetic : DBConnecter.cosmetics) {
			if (cosmetic.getCosmeticType().equals(cosmeticType)) {
				results.add(cosmetic);
			}
		}

		return results;
	}
	
	// 화장품 종류별 개수 가져오기
	public int countCosmeticByType(String cosmeticType) {
		int count = 0;
		for (Cosmetic cosmetic : DBConnecter.cosmetics) {
			if (cosmetic.getCosmeticType().equals(cosmeticType)) {
				count++;
			}
		}
		return count;
	}
	
	
	// 화장품 브랜드별로 가져오기
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
