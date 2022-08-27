package suiteLevelExecution;
import org.testng.annotations.Test;
public class Group2 {
	@Test(groups="Retest")
	public void tc100() {
		
System.out.println("TC100");
	}
	@Test(groups="Regression")
	public void tc200() {
		
System.out.println("TC200");
	}
	@Test(groups="Smoke")
	public void tc300() {
		
System.out.println("TC300");
	}
}
