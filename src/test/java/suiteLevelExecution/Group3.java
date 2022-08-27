package suiteLevelExecution;
import org.testng.annotations.Test;
public class Group3 {
	@Test(groups="Regression")
	public void tc1000() {	
System.out.println("TC1000");
	}
	@Test(groups="Sanity")
	public void tc2000() {
		
System.out.println("TC2000");
	}
	@Test(groups="Retest")
	public void tc3000() {
		
System.out.println("TC3000");
	}
}
