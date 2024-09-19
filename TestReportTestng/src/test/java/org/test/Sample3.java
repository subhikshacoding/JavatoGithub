package org.test;

import static org.testng.Assert.assertThrows;

import java.io.FileNotFoundException;

import org.openqa.selenium.NoSuchSessionException;
import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(priority = 4)
	private void test05() {

		System.out.println("test 5");
	}
	
	@Test(priority = 5)
	private void test06() {

		System.out.println("test 6");
		throw new NoSuchSessionException();
	}

}
