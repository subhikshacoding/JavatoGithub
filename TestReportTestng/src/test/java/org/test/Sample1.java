package org.test;

import org.testng.annotations.Test;

public class Sample1 {
	
	@Test(priority = 0)
	private void test01() {

		System.out.println("test 01");
	}
	
	@Test(priority = 1)
	private void test02() {

		System.out.println("test 02");
		throw new IndexOutOfBoundsException();
	}

}
