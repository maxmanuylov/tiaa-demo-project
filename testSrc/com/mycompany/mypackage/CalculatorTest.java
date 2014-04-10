package com.mycompany.mypackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CalculatorTest extends Assert {
  private Calculator myCalc;

  @BeforeMethod
  public void setUp() throws Exception {
    myCalc = new Calculator();
  }

  public void testSum() throws Exception {
    assertEquals(myCalc.sum(2, 3), 5);
  }

  public void testSubtract() throws Exception {
    assertEquals(myCalc.subtract(3, 2), 1);
  }

  public void testMultiply() throws Exception {
    assertEquals(myCalc.multiply(2, 3), 6);
  }

  public void testDivide() throws Exception {
    assertEquals(myCalc.divide(6, 2), 3);
  }

  @Test(expectedExceptions = ArithmeticException.class)
  public void testDivideByZero() throws Exception {
    myCalc.divide(1, 0);
  }
}
