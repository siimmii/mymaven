package testng;

import org.testng.annotations.Test;

public class TestngPriority {
	@Test(priority = 3)
	public void disp()
	{
		System.out.println("from disp1");
	}
	@Test(priority = 2)
	public void show()
	{
		System.out.println("from disp2");
	}
	@Test(priority = 1)
	public void delete()
	{
		System.out.println("from 3");
	}
	@Test(enabled = false)
	public void create()
	{
		System.out.println("create");
	}
}
