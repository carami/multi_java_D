package kr.co.multi;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	Calculator cal;
	public void testAdd() throws Exception{
		System.out.println("add Test 실행");
		int result = cal.add(2, 4);
		assertEquals(6, result);
		assertEquals(9, cal.add(2, 7));
	}
	public void testMinus() throws Exception{
		System.out.println("minus Test 실행");
		assertEquals(3, cal.minus(6, 3));
	}
//	protected void setUp() throws Exception {
//		System.out.println("setUp실행");
//		cal = new Calculator();
//	}
//
//	protected void tearDown() throws Exception {
//		System.out.println("tearDown실행");
//		cal = null;
//	}

}
