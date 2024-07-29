package hashMapTest.json;

public class Restaurant {
//  주문번호, 고객이름, 주문할 음식 : restaurant 클래스로 선언
	   private int orderNumber;
	   private String foodName;
	   private String customerName;
	   
	   public Restaurant() {;}
	   
	public Restaurant(int orderNumber, String foodName, String customerName) {
		super();
		this.orderNumber = orderNumber;
		this.foodName = foodName;
		this.customerName = customerName;
	}


	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Restaurant [orderNumber=" + orderNumber + ", foodName=" + foodName + ", customerName=" + customerName
				+ "]";
	}


	   
	 

	
}
