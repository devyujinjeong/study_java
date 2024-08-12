package arrayListTask.cosmetic;


public class Cosmetic {
//	화장품 번호
//	화장품 이름
//	화장품 가격
//	화장품 종류(스킨, 메이크업, 바디)
//	화장품 브랜드
	
	private int cosmeticNumber;
	private String cosmeticName;
	private int cosmeticPrice;
	private String cosmeticType;
	private String cosmeticBrand;
	
	public Cosmetic() {;}
	
	public Cosmetic(int cosmeticNumber, String cosmeticName, int cosmeticPrice, String cosmeticType,
			String cosmeticBrand) {
		super();
		this.cosmeticNumber = cosmeticNumber;
		this.cosmeticName = cosmeticName;
		this.cosmeticPrice = cosmeticPrice;
		this.cosmeticType = cosmeticType;
		this.cosmeticBrand = cosmeticBrand;
	}

	
	public int getCosmeticNumber() {
		return cosmeticNumber;
	}

	public void setCosmeticNumber(int cosmeticNumber) {
		this.cosmeticNumber = cosmeticNumber;
	}

	public String getCosmeticName() {
		return cosmeticName;
	}

	public void setCosmeticName(String cosmeticName) {
		this.cosmeticName = cosmeticName;
	}

	public int getCosmeticPrice() {
		return cosmeticPrice;
	}

	public void setCosmeticPrice(int cosmeticPrice) {
		this.cosmeticPrice = cosmeticPrice;
	}

	public String getCosmeticType() {
		return cosmeticType;
	}

	public void setCosmeticType(String cosmeticType) {
		this.cosmeticType = cosmeticType;
	}

	public String getCosmeticBrand() {
		return cosmeticBrand;
	}

	public void setCosmeticBrand(String cosmeticBrand) {
		this.cosmeticBrand = cosmeticBrand;
	}

	@Override
	public String toString() {
		return "Cosmetic [cosmeticNumber=" + cosmeticNumber + ", cosmeticName=" + cosmeticName + ", cosmeticPrice="
				+ cosmeticPrice + ", cosmeticType=" + cosmeticType + ", cosmeticBrand=" + cosmeticBrand + "]";
	}

	// 화장품 번호는 중복되지 않음
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cosmeticNumber;
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
		Cosmetic other = (Cosmetic) obj;
		if (cosmeticNumber != other.cosmeticNumber)
			return false;
		return true;
	}
}
