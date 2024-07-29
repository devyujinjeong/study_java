package arrayListTask.food;

public class Food {
//	음식 이름
//	음식 가격
//	음식 종류(한식, 중식, 일식, 양식)
	
	private String foodName;
	private int foodPrice;
	private String foodType;
	
	public Food() {;}
	
	public Food(String foodName, int foodPrice, String foodType) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodType = foodType;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	
@Override
	public String toString() {
		return "Food [foodName=" + foodName + ", foodPrice=" + foodPrice + ", foodType=" + foodType + "]";
	}

//	음식이름은 중복되지 않기 때문에 이것을 비교해서 재정의 하기
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foodName == null) ? 0 : foodName.hashCode());
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
		Food other = (Food) obj;
		if (foodName == null) {
			if (other.foodName != null)
				return false;
		} else if (!foodName.equals(other.foodName))
			return false;
		return true;
	}
}
