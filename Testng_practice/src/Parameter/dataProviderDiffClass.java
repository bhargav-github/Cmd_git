package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class dataProviderDiffClass {
	
	@Test(dataProvider = "Test-data", dataProviderClass = DataProvider.class)
	public void provider(String name, int age1)
	{
	
		System.out.println("Name "+name);
		System.out.println("Age" +age);
	}
}
