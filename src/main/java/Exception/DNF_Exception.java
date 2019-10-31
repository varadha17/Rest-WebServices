package Exception;

//Data Not Found Exception
public class DNF_Exception extends RuntimeException {

	private static final long serialVersionUID = 4676263590828667148L;

	public DNF_Exception(String user) {
		
		super(user);
		
	}
	
}
