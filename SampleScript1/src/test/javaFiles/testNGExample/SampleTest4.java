package testNGExample;

import org.testng.annotations.*;

public class SampleTest4 {
	//https://www.toolsqa.com/testng/testng-dataproviders/
	
	 @DataProvider (name = "abc")
	 public Object[][] dpMethod(){
		 
	 return new Object[][] {{"Mahesh"}, {"Kumar"}};
	 } 

	 @Test (dataProvider = "abc")
	    public void myTest (String val1) {
	        System.out.println("Passed Parameter Is val1 : " + val1);
	    }
}
