package Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import DBConnect.DBModel;
import Model.Products;


public class productService {
	
	private Map<Long, Products> prodDemo = DBModel.getDBProducts();
	
	public productService() {
		
		prodDemo.put(1L, new Products(1,"watch","wtc234",134,120.00));
		
	}

	public List<Products> getallProducts(){
		
		return new ArrayList<Products>(prodDemo.values());
		
	}
	
	public Products getProductId(long id){
		
		return prodDemo.get(id);
	}
	
	public Products addProducts(Products add) {
		
		add.setId(prodDemo.size()+1);
		prodDemo.put(add.getId(), add);
		return add;
	}
	
	public Products updateProduct(Products add) {
		
		if(add.getId() <= 0) {
			
			return null;
		}
		prodDemo.put(add.getId(), add);
		return add;
	}

	public Products DeleteProduct(long id) {
		
		return prodDemo.remove(id);
	}
	
	//Query parameter:: ?
	
	public List<Products> getproductName(String prodName){
		
		List<Products> productName = new ArrayList<>();
		
		for(Products pro : prodDemo.values()) {
			
			String name = pro.getProductName();
			
			if(name.equalsIgnoreCase(prodName)) {
				
				productName.add(pro);
			}
			
		}
		
		return productName;
	}
	
	public List<Products> getproductCode(String prodcode){
		
		List<Products> productCode = new ArrayList<>();
		
		for(Products pro : prodDemo.values()) {
			
			String code = pro.getProductCode();
			
			if(code.equalsIgnoreCase(prodcode)) {
				
				productCode.add(pro);
			}
		}
		
		return productCode;
	}
	
	public List<Products> getproductPrice(double prodPrice){
		
		List<Products> productPrice = new ArrayList<>();
		
		for(Products pro : prodDemo.values()) {
			
			double price = pro.getProductPrice();
			
			if(price == prodPrice) {
				
				productPrice.add(pro);
				
			}
		}
		
		return productPrice;
	}
	
	public List<Products> getAvailableProducts(long avail){
		
		List<Products> productAvailable = new ArrayList<>();
		
		for(Products pro : prodDemo.values()) {
			
			long available = pro.getTotalProductsAvailable();
			
			if(available == avail) {
				
				productAvailable.add(pro);
			}
		}
		
		return productAvailable;
		
	}
	
}
