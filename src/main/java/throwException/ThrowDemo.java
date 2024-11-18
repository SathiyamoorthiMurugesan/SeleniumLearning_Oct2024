package throwException;

public class ThrowDemo {
	
//	CustomException CE = new CustomException();

	public static void main(String[] args) throws CustomException  {
//		String pass = "4545";
//		String pass = "45453";
//		String pass = "";
		String pass = "454";
		
		
		if(pass.length()==0) {
			throw new CustomException();
		}
		
		if(pass.length()<4 || pass.length()>4) {
			throw new CustomException("AnyString");
		}
		
		if(!pass.equals("1234")) {
//			throw new CustomException(true);
			throw new CustomException(1==0);
		}
	}

}
