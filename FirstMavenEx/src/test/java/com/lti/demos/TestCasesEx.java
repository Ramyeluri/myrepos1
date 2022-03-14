package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCasesEx {

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testcase1()
	{
		Assertions.assertEquals("Hello","Hello");
	}
	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		int r=c.add(300, 200);
		Assertions.assertEquals(500,r);
	}
	@Test
	void testAssertEqual() {
		Assertions.assertEquals("ABC", "ABC");
		Assertions.assertEquals(20, 20, "optional assertion message");
		Assertions.assertEquals(2 + 2, 4);
	}

	@Test
	void testAssertFalse() {	
		Assertions.assertFalse("FirstName".length() == 10);
		Assertions.assertFalse(10 > 20, "assertion message");
	}

	@Disabled 
	@Test
	void testAssertNull() {
	     String str1 = null;
		 String str2 = "abc";
		 Assertions.assertNull(str1);// str 1 is null - condition is ok  test case ok 
		 Assertions.assertNotNull(str2);	 // str2 - notnull ? - condtion is ok - test case ok 
	}
	
	@Test
	public void testEmptyArrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Assertions.assertEquals(0, al.size());
		Assertions.assertTrue(al.isEmpty()); // assertTrue Method
		al.add(100);
		al.add(200);		
		Assertions.assertEquals(0, al.size());
		// assertFalse(al.isEmpty());

}
}
