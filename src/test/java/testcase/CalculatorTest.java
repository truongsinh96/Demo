package testcase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pojo.Calculator;

public class CalculatorTest {

	@Test
	public void  multiplicationOfZeroIntegersShouldReturnZero(){
		Calculator c = new Calculator();
		assertEquals(0, c.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, c.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, c.multiply(0, 0), "0 x 0 must be 0");
	}
}
