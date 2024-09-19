package org.test;

import org.testng.annotations.Test;

public class Sample2 {


	@Test(priority = 2)
	private void test03() {

		System.out.println("test 3");
	}

	@Test(priority = 3)
	private void test04() {

		System.out.println("test 4");
		System.out.println(3/0);
	}
}
