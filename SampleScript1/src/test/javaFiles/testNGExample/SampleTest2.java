package testNGExample;

import org.testng.annotations.*;

public class SampleTest2 {
	
	
	@Test() 
	@Parameters({"a","b"})  
	public void add(int c, int d)  
	{  
	int add=c+d;  
	System.out.println("addition of two numbers : "+add);  
	}  

}
