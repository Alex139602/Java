package data;

public class ProductNotValidException extends Exception {
	
	private static final long serialVersionUID = 3433507304788818712L;

	public ProductNotValidException(String s)
	{
		super(s);
		super.printStackTrace();
		/*for (Object o : this.getInformation() ) 
		{
			if (o instanceof String){
				System.out.println(o);
			} else if (o instanceof StackTraceElement[] ) {
				continue;
			} else {
				try {
					System.out.println(o);
				} catch (Exception e) {
					// do nothing 
				}
			}
		}*/
	}
	
	public String getMessage(){
		return super.getMessage();
	}
	
	public StackTraceElement[] getStackTrace(){
		return super.getStackTrace();
	}
	
	public Object[] getInformation(){
		return new Object[]{
			this.getMessage(),
			this.getStackTrace()
		};
	}

}
