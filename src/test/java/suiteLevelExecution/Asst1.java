package suiteLevelExecution;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asst1 {
	@Test
	public  void tc1() {
	System.out.println("1");
	}
	@Test
	public  void tc2() {
		SoftAssert s=new SoftAssert();
		s.assertTrue(false);
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	System.out.println("5");
	//s.assertAll();
	System.out.println("6");
	s.assertAll();
	}
		@Test
		public  void tc3() {
		System.out.println("7");
		}

}
