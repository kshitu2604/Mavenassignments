package Practice;

 public interface practice2{
	
	 public abstract void loginIntoApplication();
	 
	 public default void searchProduct() {
		    closeapp();
			System.out.println("Enter product name as 'iPhone 14 pro max'");
			System.out.println("Click on search button");
			closeapp();
		}
	 
	 public abstract void click();

	public abstract void sendKeys();
	
	public static void getAi(){
		System.out.println("AI methods introduced");
		
		
	}
	
	private void closeapp() {
		System.out.println("Closing the Application");
	}
}
 
		
		
	 
	 
