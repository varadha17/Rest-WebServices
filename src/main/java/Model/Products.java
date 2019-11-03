package Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Products {

	private long id;
	private String productName;
	private String productCode;
	private double productPrice;
	private long totalProductsAvailable;

	public Products() {
		
	}
	
	public Products(long id, String productName, String productCode, int totalProducts, double productPrice) {
		
		this.id = id;
		this.productName = productName;
		this.productCode = productCode;
		this.totalProductsAvailable = totalProducts;
		this.productPrice = productPrice;
		
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public long getTotalProductsAvailable() {
		return totalProductsAvailable;
	}

	public void setTotalProductsAvailable(long totalProductsAvailable) {
		this.totalProductsAvailable = totalProductsAvailable;
	}
	
	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
}
