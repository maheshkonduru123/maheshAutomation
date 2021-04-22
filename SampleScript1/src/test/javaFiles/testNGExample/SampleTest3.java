package testNGExample;

import org.testng.annotations.*;

public class SampleTest3 {
	
	
	@Test() 
	@Parameters({"a","b"})  
	public void sub(int c, int d)  
	{  
	int sub=c-d;  
	System.out.println("subtraction of two numbers : "+sub);  
	}  

}
