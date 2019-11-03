package subResourceFilter;

import javax.ws.rs.QueryParam;

public class FilterBean {
	
	//User Service
	@QueryParam("firstName") String first;
	@QueryParam("lastName") String last;
	@QueryParam("email") String email;
	@QueryParam("status") String status;
	@QueryParam("gender") String gender;
	
	//Product Service
	@QueryParam("productName") String prodName; 
	@QueryParam("productCode") String prodcode;
	@QueryParam("productPrice") double prodPrice; 
	@QueryParam("totalProductsAvailable") long avail;
	
	//User Service
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	//Product Service
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdcode() {
		return prodcode;
	}
	public void setProdcode(String prodcode) {
		this.prodcode = prodcode;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public long getAvail() {
		return avail;
	}
	public void setAvail(long avail) {
		this.avail = avail;
	}

}
