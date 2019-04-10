/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Majka
 */
public class CalculatorTest extends TestCase {

    private Calculator calculator;
    
    /**
     *
     */
    @Before
    public void BeforEachTest(){
        calculator = new Calculator();
    }
    
    @Test
    public void testOnenumber1(){
        String Equation = "0";
        double expectingResult = 0.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testOnenumber2(){
        String Equation = "-3";
        double expectingResult = -3.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testOnenumber3(){
        String Equation = "0.0042";
        double expectingResult = 0.004200;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testOnenumber4(){
        String Equation = "-50.097";
        double expectingResult = -50.097000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation1(){
        String Equation = "2+0";
        double expectingResult = 2.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation2(){
        String Equation = "2+2";
        double expectingResult = 4.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }

    @Test
    public void testEquation3(){
        String Equation = "10-2";
        double expectingResult = 8.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation4(){
        String Equation = "2-10";
        double expectingResult = -8.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation5(){
        String Equation = "-2-10";
        double expectingResult = -12.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation6(){
        String Equation = "-2+10";
        double expectingResult = 8.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation7(){
        String Equation = "2.2+5.5";
        double expectingResult = 7.700000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation8(){
        String Equation = "2.2-5.5";
        double expectingResult = -3.300000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation9(){
        String Equation = "-2.2+5.5";
        double expectingResult = 3.300000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation10(){
        String Equation = "-2.2-5.5";
        double expectingResult = -7.700000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation11(){
        String Equation = "1-0.01";
        double expectingResult = 0.990000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation12(){
        String Equation = "1-0.002";
        double expectingResult = 0.998000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation13(){
        String Equation = "1+0.0001";
        double expectingResult = 1.000100;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation14(){
        String Equation = "1-(-1)";
        double expectingResult = 2.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation15(){
        String Equation = "-1-(-1)";
        double expectingResult = 0.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation16(){
        String Equation = "1*0";
        double expectingResult = 0.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation17(){
        String Equation = "10*10";
        double expectingResult = 100.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation18(){
        String Equation = "-2*2";
        double expectingResult = -4.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation19(){
        String Equation = "-2*(-2)";
        double expectingResult = 4.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation20(){
        String Equation = "3*0.1";
        double expectingResult = 0.300000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation21(){
        String Equation = "3*0.02";
        double expectingResult = 0.060000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation22(){
        String Equation = "0.003*3.1";
        double expectingResult = 0.009300;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation23(){
        String Equation = "-0.00004*4,1";
        double expectingResult = -0.000164;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation24(){
        String Equation = "-100.9*(-789.3)";
        double expectingResult = 79640.370000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation25(){
        String Equation = "100/10";
        double expectingResult = 10.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation26(){
        String Equation = "20/80";
        double expectingResult = 0.250000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation27(){
        String Equation = "-7/7";
        double expectingResult = -1.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation28(){
        String Equation = "-0.1/(-10)";
        double expectingResult = 0.010000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation29(){
        String Equation = "7.007/8.008";
        double expectingResult = 0.875000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation30(){
        String Equation = "2+2+10";
        double expectingResult = 14.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation31(){
        String Equation = "9-8-7";
        double expectingResult = -6.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation32(){
        String Equation = "1+2-3+4";
        double expectingResult = 4.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation33(){
        String Equation = "1+2*3";
        double expectingResult = 7.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation34(){
        String Equation = "(1+2)*3";
        double expectingResult = 9.000000;
        double result = calculator.caculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation35(){
        String Equation = "10+6/2";
        double expectingResult = 13.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation36(){
        String Equation = "(10+6)/2";
        double expectingResult = 8.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation37(){
        String Equation = "9*10/9";
        double expectingResult = 10.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation38(){
        String Equation = "2+3+4+5+6+7-9-10";
        double expectingResult = 8.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation39(){
        String Equation = "2*3*4*5/6/7";
        double expectingResult = 2.857143;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation40(){
        String Equation = "0+10-0.8*4+62";
        double expectingResult = 68.800000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError1(){
        String Equation = "20302/0";
        String expectingResult = "error";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError2(){
        String Equation = "/4*10";
        String expectingResult = "error";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError3(){
        String Equation = "*6-0.9800";
        String expectingResult = "error";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError4(){
        String Equation = "10000*/0.8";
        String expectingResult = "error";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError5(){
        String Equation = ".09+8";
        String expectingResult = "error";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError6(){
        String Equation = "!8";
        String expectingResult = "error";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError7(){
        String Equation = "+";
        String expectingResult = "error";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError8(){
        String Equation = "!";
        String expectingResult = "error";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testFactorial1(){
        String Equation = "8+3!";
        double expectingResult = 14.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testFactorial2(){
        String Equation = "3!";
        double expectingResult = 6.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testFactorial3(){
        String Equation = "2*3!";
        double expectingResult = 12.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testFactorial4(){
        String Equation = "6/3!";
        double expectingResult = 1.000000;
        double result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    /**
     * Test of main method, of class Calculator.
     */
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
