package practice;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class HardAssert {
	
	@Test
	public void createContact()

	{
		System.out.println("step1");
		System.out.println("step2");
		
		org.testng.Assert.assertEquals(false, true);
		System.out.println("step4");
		System.out.println("step5");
	}
	public void modify_contact()
	{
		System.out.println("step1");
		System.out.println("step2");
		
		org.testng.Assert.assertEquals(true, true);
		System.out.println("step4");
		System.out.println("step5");
	}
	
	
}
