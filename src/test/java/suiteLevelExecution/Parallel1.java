package suiteLevelExecution;

import org.testng.annotations.Test;

public class Parallel1 {
	@Test
	public void tc1() {
		System.out.println("TC1.." + " "+Thread.currentThread().getId());
	}
	@Test
	public void tc2() {
		System.out.println("TC2.." + " "+Thread.currentThread().getId());
	}
	@Test
	public void tc3() {
		System.out.println("TC3..." + " "+Thread.currentThread().getId());
	}
}
