package seleniumproject;

import org.testng.annotations.Test;

public class SampleTest {
@Test(priority=3)
public void sample1() {
	System.out.println("sample1");
}
@Test(priority=1)
public void sample2()
{
	System.out.println("sample2");
}
@Test(priority=2)
public void sample3()
{
	System.out.println("sample3");
}
	/*public static void main(String[] args) {
		
		System.out.println("hello world");
		// TODO Auto-generated method stub

	}*/

}
