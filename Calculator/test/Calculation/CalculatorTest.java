/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

import static java.lang.Double.NaN;
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
    
    @Test
    public void testOnenumber1(){
        String Equation = "0";
        String expectingResult = "0.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testOnenumber2(){
        String Equation = "-3";
        String expectingResult = "-3.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testOnenumber3(){
        String Equation = "0.0042";
        String expectingResult = "0.004200";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testOnenumber4(){
        String Equation = "-50.097";
        String expectingResult = "-50.097000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation1(){
        String Equation = "2+0";
        String expectingResult = "2.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation2(){
        String Equation = "2+2";
        String expectingResult = "4.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }

    @Test
    public void testEquation3(){
        String Equation = "10-2";
        String expectingResult = "8.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation4(){
        String Equation = "2-10";
        String expectingResult = "-8.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation5(){
        String Equation = "-2-10";
        String expectingResult = "-12.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation6(){
        String Equation = "-2+10";
        String expectingResult = "8.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation7(){
        String Equation = "2.2+5.5";
        String expectingResult = "7.700000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation8(){
        String Equation = "2.2-5.5";
        String expectingResult = "-3.300000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation9(){
        String Equation = "-2.2+5.5";
        String expectingResult = "3.300000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation10(){
        String Equation = "-2.2-5.5";
        String expectingResult = "-7.700000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation11(){
        String Equation = "1-0.01";
        String expectingResult = "0.990000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation12(){
        String Equation = "1-0.002";
        String expectingResult = "0.998000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation13(){
        String Equation = "1+0.0001";
        String expectingResult = "1.000100";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation14(){
        String Equation = "1-1";
        String expectingResult = "0.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation15(){
        String Equation = "-1-1";
        String expectingResult = "-2.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation16(){
        String Equation = "1*0";
        String expectingResult = "0.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation17(){
        String Equation = "10*10";
        String expectingResult = "100.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation18(){
        String Equation = "-2*2";
        String expectingResult = "-4.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation19(){
        String Equation = "-2*2";
        String expectingResult = "-4.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation20(){
        String Equation = "3*0.1";
        String expectingResult = "0.300000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation21(){
        String Equation = "3*0.02";
        String expectingResult = "0.060000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation22(){
        String Equation = "0.003*3.1";
        String expectingResult = "0.009300";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation23(){
        String Equation = "-0.00004*4.1";
        String expectingResult = "-0.000164";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation24(){
        String Equation = "-100.9*789.3";
        String expectingResult = "-79640.370000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation25(){
        String Equation = "100/10";
        String expectingResult = "10.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation26(){
        String Equation = "20/80";
        String expectingResult = "0.250000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation27(){
        String Equation = "-7/7";
        String expectingResult = "-1.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation28(){
        String Equation = "0.1/10";
        String expectingResult = "0.010000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation29(){
        String Equation = "7.007/8.008";
        String expectingResult = "0.875000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation30(){
        String Equation = "2+2+10";
        String expectingResult = "14.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation31(){
        String Equation = "9-8-7";
        String expectingResult = "-6.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation32(){
        String Equation = "1+2-3+4";
        String expectingResult = "4.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation33(){
        String Equation = "1+2*3";
        String expectingResult = "7.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation34(){
        String Equation = "1+2*3";
        String expectingResult = "7.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation35(){
        String Equation = "10+6/2";
        String expectingResult = "13.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation36(){
        String Equation = "-10-6/2*0.00001";
        String expectingResult = "-10.000030";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation37(){
        String Equation = "9*10/9";
        String expectingResult = "10.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation38(){
        String Equation = "2+3+4+5+6+7-9-10";
        String expectingResult = "8.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation39(){
        String Equation = "2*3*4*5/6/7";
        String expectingResult = "2.857143";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testEquation40(){
        String Equation = "0+10-0.8*4+62";
        String expectingResult = "68.800000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError1(){
        String Equation = "20302/0";
        String expectingResult = "Can't divide by ZERO";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError2(){
        String Equation = "4*10/";
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError3(){
        String Equation = "6-0.9800.";
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError4(){
        String Equation = "10000*0.8^"; // Vraci ciste error, ale to uy vyhledem k implemetaci
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
}
    
    @Test
    public void testError5(){
        String Equation = "7√"; // Chyba v implementaci, toto ma byt chybou
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError6(){
        String Equation = "0.0.8!"; // Chyba v implementaci, toto ma byt chybou
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError7(){
        String Equation = "-";
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testError8(){
        String Equation = "ln";
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testFactorial1(){
        String Equation = "8+3!";
        String expectingResult = "14.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testFactorial2(){
        String Equation = "3!";
        String expectingResult = "6.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testFactorial3(){
        String Equation = "2*3!";
        String expectingResult = "12.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testFactorial4(){
        String Equation = "6/3!";
        String expectingResult = "1.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_1(){
        String Equation = "1^0";
        String expectingResult = "1.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_2(){
        String Equation = "1^1";
        String expectingResult = "1.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_3(){
        String Equation = "2^2";
        String expectingResult = "4.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_4(){
        String Equation = "-2^1";
        String expectingResult = "-2.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_5(){
        String Equation = "-2^2";
        String expectingResult = "4.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_6(){
        String Equation = "sqrt(4.4)";
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_7(){
        String Equation = "SQRT(9)";
        String expectingResult = "Syntax ERROR";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_8(){
        String Equation = "90^2";
        String expectingResult = "8100.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
    @Test
    public void testExponencial_9(){
        String Equation = "200+9^2";
        String expectingResult = "281.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
    
     @Test
    public void testExponencial_10(){
        String Equation = "3√8";
        String expectingResult = "2.000000";
        String result = calculator.calculate(Equation);
        assertEquals(result, expectingResult);
    }
}
