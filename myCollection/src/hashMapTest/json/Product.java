package hashMapTest.json;

public class Product {

		private int productNumber;
		private String productName;
		private int productPrice;
		private int productStock;
	   
		public Product(){;}
		
	public Product(int productNumber, String productName, int productPrice, int productStock) {
	super();
	this.productNumber = productNumber;
	this.productName = productName;
	this.productPrice = productPrice;
	this.productStock = productStock;
	}

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productStock=" + productStock + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productNumber;
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
		Product other = (Product) obj;
		if (productNumber != other.productNumber)
			return false;
		return true;
	}   
}
