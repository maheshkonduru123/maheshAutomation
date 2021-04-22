package testNGExample;

import org.testng.annotations.*;

public class SampleTest1 {

	@BeforeSuite()
	public void suite1() {
		System.out.println("suite1");
	}

	@BeforeTest()
	public void test1() {
		System.out.println("test1");
	}

	@BeforeClass()
	public void class1() {
		System.out.println("class1");
	}

	@BeforeMethod()
	public void method1() {
		System.out.println("method1");
	}

	@Test
	public void testCase1() {
		System.out.println("testCase1");
	}

	@Test
	public void testCase2() {
		System.out.println("testCase2");
	}

	@AfterMethod()
	public void method2() {
		System.out.println("method2");
	}

	@AfterClass()
	public void class2() {
		System.out.println("class2");
	}

	@AfterTest()
	public void test2() {
		System.out.println("test2");
	}

	@AfterSuite()
	public void suite2() {
		System.out.println("suite2");
	}

}
