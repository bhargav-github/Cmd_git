package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
//	@Test
	@DataProvider(name = "Test-data")
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][2];
		data[0][0] ="bhargav";
		data[0][1] = 24;
		data[1][0] = "ramsai";
		data[1][1] = 25;
		return data;
	}

	/*@Test(dataProvider="Test-data")
	public void data_provider(String name, int age)
	{
		
		System.out.println("name "+name);
		System.out.println("age "+age);
	}*/
}
