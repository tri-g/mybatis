package junitapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class test1 {
	@BeforeClass
	public static void setupbeforeclass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public static void setup() throws Exception {
		System.out.println("before");
	}

	@Test
	public void testfindmax() {
		System.out.println("test case find max");
		assertEquals(5, Calculator.findmax(new int[]{5,4,2,3}));
	}
	@Test 
	public void testcube() {
		System.out.println("testcase cube");
		assertEquals(27,Calculator.cube(4));
	  
	  }
	@After
	public static void teardown() throws Exception {
		System.out.println("after");
	}
	@AfterClass
	public static void teardownafterclass() throws Exception {
		System.out.println("after class");
	}
	

}
