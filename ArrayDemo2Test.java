package day3;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayDemo2Test {
	static ArrayDemo2 obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After 
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		obj = new ArrayDemo2();
		assertEquals(obj.myclassroom[1].subject, "currently not assigned");
		//fail("Not yet implemented");
	}

}

