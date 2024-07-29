package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Market {
	
//	상수화하기: 참고로 상수는 모두 대문자로 작성!!
	private final int LESS = 1; 
	private final int MORE_OR_EQUAL = 0;
	private final int NOT_FOUND = -1;
	
//	과일 추가
	public void insert(Fruit fruit) {
		DBConnecter.fruits.add(fruit);
	}
	
//	과일 삭제
	public void delete(String name) {
		for(int i=0; i<DBConnecter.fruits.size(); i++) {
			if(DBConnecter.fruits.get(i).getFruitName().equals(name)) {
				DBConnecter.fruits.remove(i);
			}
		}
		
//		for(Fruit fruit : DBConnecter.fruits) {
//			if(fruit.getName().equals(name)) {
//				DBConnecter.fruits.remove(fruit);
//			}
//		}
	}
	
//	과일 가격이 평균 가격보다 낮은 지 검사
//	1. 전체 과일 중 평균 가격보다 낮은 과일 조회
//	2. 선택한 과일이 평균 가격보다 낮은 지 조회
	
	public int checkPrice(String name) { 
		for(Fruit fruit : DBConnecter.fruits) { //저장되어 있는 과일의 개수만큼 반복
			if(fruit.getFruitName().equals(name)) { //만약에 가져온 과일의 이름과, 입력한 이름이 같다면
				return fruit.getFruitPrice() < getAverage() ? LESS : MORE_OR_EQUAL;
			}
		}
		return NOT_FOUND; //입력한 과일이 DBConnecter에 저장되어 있지 않는 경우
	}
	
	public ArrayList<Fruit> checkPrice() { 
		ArrayList<Fruit> results = new ArrayList<Fruit>();
		
		for(Fruit fruit : DBConnecter.fruits) {
			if(fruit.getFruitPrice() < getAverage()) {
				results.add(fruit);
			}
		}
		return results;
	}
	
	public double getAverage() {
		int total = 0;
		for(Fruit fruit : DBConnecter.fruits) {
			total += fruit.getFruitPrice();
		}
		return (double)total / DBConnecter.fruits.size();
	}
	
	
//	과일 전체 조회
	public ArrayList<Fruit> selectAll(){ 
		return DBConnecter.fruits; //조회해서 화면에 보여줘야 하기 때문에 return사용
	}
	
//	과일 이름으로 가격 조회
	public int selectPrice(String name) { //어떤 과일을 조회할 것인지 이름을 입력해야 함
		for(Fruit fruit : DBConnecter.fruits) { //저장되어 있는 과일의 개수만큼 반복
			if(fruit.getFruitName().equals(name)) { //만약에 가져온 과일의 이름과, 입력한 이름이 같다면
				return fruit.getFruitPrice(); //가격을 조회했으니 사용자에게 가격을 보여줘야겠지?
			}
		}
		
		return NOT_FOUND;
	}

}

