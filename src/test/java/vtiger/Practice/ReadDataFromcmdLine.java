package vtiger.Practice;

import org.testng.annotations.Test;

public class ReadDataFromcmdLine {
	
	@Test
	public void test()
	{
		String BROWSER = System.getProperty("browser");//run time parameter
		System.out.println(BROWSER);
		
		String BROWSER1 = System.getProperty("browser");//run time parameter
		System.out.println(BROWSER1);
		
	}

}
