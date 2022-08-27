package suiteLevelExecution;
import org.testng.annotations.Test;
public class Group1 {
	@Test(groups="Regression")
	public void tc1() {
		
System.out.println("TC1");
	}
	@Test(groups="Smoke")
	public void tc2() {
		
System.out.println("TC2");
	}
	@Test(groups="Sanity")
	public void tc3() {
		
System.out.println("TC3");
	}
}
