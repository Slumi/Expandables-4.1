/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

/**
 * @author Žaneta Grossová
 * @author Marie Bednářová
 * @author Damián Gladiš
 * @author Šimon Galba
 * @version 1.0
 */

public class MyMath {
    /**
     * Add two numbers together
     * @param firstnum first number
     * @param secondnum second number
     * @return sum of two numbers
     */
    public static double add(double firstnum, double secondnum){
    double result = firstnum+secondnum;
    return result;
    }
    /**
     * Subtract second number from the first number
     * @param firstnum first number
     * @param secondnum second number
     * @return difference of two numbers
     */
    public static double sub(double firstnum, double secondnum){
    double result = firstnum-secondnum;
    return result;
    }
    /**
     * Multiply two numbers
     * @param firstnum first number
     * @param secondnum second number
     * @return product of two numbers
     */
    public static double mul(double firstnum, double secondnum){
    double result = firstnum*secondnum;
    return result;
    }
    /**
     * Divide first number by the second one
     * @param firstnum first number
     * @param secondnum second number
     * @return quotient of two numbers
     */
    public static double div(double firstnum, double secondnum){
    double result = firstnum/secondnum;
    return result;
    }
    /**
     * Count factorial of number
     * @param num number whose factorial we want
     * @return factorial of number
     */
    public static double fac(double num){
    double i = num;
    double result;
    if(num == 0)
        result = 1;
    else{
    while(i>1){
        i=i-1;
        num = num*i;
        }
        result = num;
        }
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double sqrt(double firstnum){
    double result = Math.sqrt(firstnum);
    return result;
    }
    /**
     * 
     * @param base
     * @param n
     * @return 
     */
    public static double root(double base, double n){
    double result = Math.pow(Math.E, Math.log(base)/n);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double sqrd(double firstnum){
    double result = firstnum*firstnum;
    return result;
    }
    /**
     * Count n-power of number
     * @param base base of the power
     * @param exponent exponent
     * @return power
     */
    public static double pow(double base, double exponent){
    double result = Math.pow(base, exponent);
    return result;
    }
    /**
     * Count sine of number
     * @param firstnum number we count sine of
     * @return sine of number
     */
    public static double sin(double firstnum){
    double result = Math.sin(firstnum);
    return result;
    }
     /**
      * Count cosine of number
      * @param firstnum number we count cosine of
      * @return cosine of number
      */
    public static double cos(double firstnum){
    double result = Math.cos(firstnum);
    return result;
    }
    /**
     * Count tangent og number
     * @param firstnum number we count tangnent of
     * @return tangent
     */
    public static double tan(double firstnum){
    double result = Math.tan(firstnum);
    return result;
    }
    /**
     * Count inverse sine
     * @param firstnum number we count arcsin of
     * @return inverse sine
     */
    public static double asin(double firstnum){
    double result = Math.asin(firstnum);
    return result;
    }
    /**
     * Count inverse cosine
     * @param firstnum number we count arccos of
     * @return inverse cosine
     */
    public static double acos(double firstnum){
    double result = Math.acos(firstnum);
    return result;
    }
    /**
     * Count inverse  tangent
     * @param firstnum number we count arctan of
     * @return  inverse tangent
     */
    public static double atan(double firstnum){
    double result = Math.atan(firstnum);
    return result;
    }
    /**
     * Count e^x
     * @param firstnum exponent
     * @return e^x
     */
    public static double exp(double firstnum){   // e umocnene na x 
    double result = Math.exp(firstnum);
    return result;
    }
    /**
     * Count logarithm with base e
     * @param firstnum Number we count with
     * @return natural logarithm
     */
    public static double ln(double firstnum){
    double result = Math.log(firstnum);
    return result;
    }
    /**
     * Count logarithm with base 10
     * @param firstnum Number we count with
     * @return decadic logarithm
     */
    public static double log(double firstnum){   // logaritmus o zaklade 10 
    double result = Math.log10(firstnum);
    return result;
    }
    /**
     * Count absolut value from number
     * @param firstnum Number we want absolut value of
     * @return absolut value
     */
    public static double abs(double firstnum){   // absolutna hodnota x  
    double result = Math.abs(firstnum);
    return result;
    }
    /**
     * 
     * @return π
     */
    public static double pi(){   // vrati hodnotu π 
    return Math.PI;
    }
    /**
     * 
     * @return e
     */
    public static double e(){   // vrati hodnotu e 
    return Math.E;
    }
}


