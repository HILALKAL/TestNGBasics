package com.class02;

import org.testng.annotations.Test;

public class enableAndDisable {
	@Test (enabled=false)
	public void fist() {
		System.out.println("first test annotations");
	}
	
	@Test(enabled=true,priority=1)
	public void second() {
		System.out.println("second test annotations");
	}
	
	@Test(enabled=false)
	public void third() {
		System.out.println("third test annotations ");
	}
	
	@Test(enabled=true,priority=2)
	public void forth() {
		System.out.println("forth test annotations ");
	}



}
