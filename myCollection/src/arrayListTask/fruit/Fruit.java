package arrayListTask.fruit;

public class Fruit {
//	과일 정보를 담을 클래스 선언(Fruit)
//	1) 과일 이름(중복 없음)
//	2) 과일 가격
	
	private String fruitName;
	private int fruitPrice;
	
	public Fruit() {;}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getFruitPrice() {
		return fruitPrice;
	}
	public void setFruitPrice(int fruitPrice) {
		this.fruitPrice = fruitPrice;
	}

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitPrice=" + fruitPrice + "]";
	}

//	중복이 없는 과일 이름으로 비교하기
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fruitName == null) ? 0 : fruitName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		if (fruitName == null) {
			if (other.fruitName != null)
				return false;
		} else if (!fruitName.equals(other.fruitName))
			return false;
		return true;
	}
}
