package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before("@MobileTest") 

	public void beforevalidation()
	{
		System.out.println("before validation Method");
	}
	
	@After("@MobileTest")
	public void aftervalidation()
	{
		System.out.println("After Validation Method");
	}

}
