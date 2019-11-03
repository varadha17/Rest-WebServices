package Resources;

import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import Model.Products;
import Services.productService;
import subResourceFilter.FilterBean;

@Path("/products")
public class productResources {
	
	productService prod = new productService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Products> getallProductsTest(@BeanParam FilterBean filter)
	{
		
		if(filter.getProdName() != null) {
			return prod.getproductName(filter.getProdName());
		}else if(filter.getProdcode() != null) {
			return prod.getproductCode(filter.getProdcode());
		}else if(filter.getProdPrice() != 0) {
			return prod.getproductPrice(filter.getProdPrice());
		}else if(filter.getAvail() > 0) {
			return prod.getAvailableProducts(filter.getAvail());
		}
		
		return prod.getallProducts();
		
	}
	
	@GET
	@Path("/{prodid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Products getProductIdTest(@PathParam("prodid") long id){
		
		return prod.getProductId(id);
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response AddPoductTest(Products add) {
		
		Products pr = prod.addProducts(add);
		
		return Response.status(Status.CREATED).entity(pr).build();
		
	}

}
