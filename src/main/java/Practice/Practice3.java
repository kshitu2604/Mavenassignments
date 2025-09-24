package Practice;

import Practicediffpack.Practice4;

public class Practice3 implements practice2{

	public static void main(String[] args) {
		
		Practice3 obj1 = new Practice3();
		obj1.searchProduct();
		
		practice2.getAi();

	}
	

	@Override
	public void loginIntoApplication() {
		System.out.println("Click method from Interface1 is implemented in RegularClass2");
		
	}

	@Override
	public void click() {
		System.out.println("Click method from Interface1 is implemented in RegularClass2");
		
	}

	@Override
	public void sendKeys() {
		System.out.println("Click method from Interface1 is implemented in RegularClass2");
		
	}

	
	
}


	

	
