package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

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

	// assign iValue a value
	static MyInteger testing = new MyInteger(1);

	@Test
	public void test1() {

		assertEquals(testing.get(), 1);

	}

	@Test
	public void test2() {
		assertFalse(testing.isEven());
		assertTrue(testing.isOdd());
		assertTrue(testing.isPrime());
	}

	@Test
	public void test3() {
		assertTrue(MyInteger.isEven(8) == true);
		assertTrue(MyInteger.isEven(164) == true);
		assertFalse(MyInteger.isEven(7) == true);
		assertFalse(MyInteger.isEven(19) == true);
		
		assertTrue(MyInteger.isOdd(9) == true);
		assertFalse(MyInteger.isOdd(8) == true);
		
		assertTrue(MyInteger.isPrime(1) == true);
		assertTrue(MyInteger.isPrime(3) == true);
		assertTrue(MyInteger.isPrime(5) == true);
		assertFalse(MyInteger.isPrime(0) == true);
		assertFalse(MyInteger.isPrime(9) == true);
	}

	@Test
	public void test4() {
		assertFalse(MyInteger.isEven(testing));
		assertTrue(MyInteger.isOdd(testing));
		assertTrue(MyInteger.isPrime(testing));

	}

	@Test
	public void test5() {
		assertFalse(testing.equals(2));
		assertTrue(testing.equals(1));
		assertTrue(testing.equals(testing));

	}

	@Test
	public void test6() {
		testing.set(4);
		assertEquals(testing.get(), 4);
	}
	
	
	@Test
	public void test7() {
		assertTrue(testing.isEven());
		assertFalse(testing.isOdd());
		assertFalse(testing.isPrime());
		testing.set(49);
		assertFalse(testing.isPrime());
	}

}