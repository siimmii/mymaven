package testng;

import org.testng.annotations.Test;

public class TestNGInvocationCount {
	@Test(priority = 2 ,invocationCount = 4)
	public void create()
	{
		int arr[]= {1,2,3};
		System.out.println(arr[2]);
		System.out.println("create");
	}
	@Test(dependsOnMethods = "create", priority=1)
	public void modify()
	{
		
		System.out.println("modified");
	}
	@Test(dependsOnMethods = "modify")
	public void show()
	{
		System.out.println("from disp2");
	}
	
}
