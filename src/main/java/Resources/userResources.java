package Resources;


import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import Model.Users;
import Services.userService;
import subResourceFilter.FilterBean;

@Path("/users")
public class userResources {
	
	userService service = new userService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Users> getUser(@BeanParam FilterBean filter)
	{
		if(filter.getEmail() != null) {
			return service.getUserWithEmailId(filter.getEmail());
		}else if(filter.getFirst() != null) {
			return service.getUserwithFirstName(filter.getFirst());
		}else if(filter.getLast() != null) {
			return service.getUserWithLastName(filter.getLast());
		}else if(filter.getStatus() != null) {
			return service.getUserStatus(filter.getStatus());
		}else if(filter.getGender() !=null) {
			return service.getUserGender(filter.getGender());
		}
		return service.getAllUser();
	}
	
	@GET
	@Path("/{userid}")
	@Produces(MediaType.APPLICATION_JSON)
	public Users getIdTest(@PathParam("userid") long id) {
		
		return service.getUserID(id);
		
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response AddUserTest(Users add) {
		
		Users user =  service.addUser(add);
		
		return Response.status(Status.CREATED).entity(user).build();
		
	}
	
	@PUT
	@Path("/{userid}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Users UpdateUserTest(@PathParam("userid") long id, Users update) {
		
		update.setId(id);
		return service.updateUser(update);
		
	}
	
	@DELETE
	@Path("/{userid}")
	@Produces(MediaType.APPLICATION_JSON)
	public void DeleteUserTest(@PathParam("userid") long id) {
		
		service.DeleteUser(id);
		
	}

}
