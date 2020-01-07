package MavenProject.MavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class threadPoolSizeProgram{

	@Test(priority=2,enabled=false)
	public static void runMyFirstTestClass(){
		System.out.println("this is my first test class");
		int a=10;
		int b=10;
		int c = 0;
		int sum=a+b;
		System.out.println(sum);
		//soft assert
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(2,sum);
		
		Assert.assertNotNull(c);
	}
	static int count=0;
	@Test(priority=1,invocationCount=10,threadPoolSize=3)
	public static void runMySecondTestClass(){
		//System.out.println("this is my second test class");
		
		int a=10;
		int b=10;
		int sub=a-b;
		count++;
		System.out.println("invocation count ="+count +" and thread count ="+Thread.currentThread().getName());

		//hard assert
		//Assert.assertEquals(0,sub);
		
		
	}
}
