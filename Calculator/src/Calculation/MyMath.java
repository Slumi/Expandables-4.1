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
     * 
     * @param firstnum first number
     * @param secondnum second number
     * @return difference of two numbers
     */
    public static double sub(double firstnum, double secondnum){
    double result = firstnum-secondnum;
    return result;
    }
    /**
     * 
     * @param firstnum first number
     * @param secondnum second number
     * @return product of two numbers
     */
    public static double mul(double firstnum, double secondnum){
    double result = firstnum*secondnum;
    return result;
    }
    /**
     * 
     * @param firstnum first number
     * @param secondnum second number
     * @return quotient of two numbers
     */
    public static double div(double firstnum, double secondnum){
    double result = firstnum/secondnum;
    return result;
    }
    /**
     * 
     * @param num number whose factorial we want
     * @return 
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
     * 
     * @param base
     * @param exponent
     * @return 
     */
    public static double pow(double base, double exponent){
    double result = Math.pow(base, exponent);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double sin(double firstnum){
    double result = Math.sin(firstnum);
    return result;
    }
     /**
      * 
      * @param firstnum
      * @return 
      */
    public static double cos(double firstnum){
    double result = Math.cos(firstnum);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double tan(double firstnum){
    double result = Math.tan(firstnum);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double asin(double firstnum){
    double result = Math.asin(firstnum);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double acos(double firstnum){
    double result = Math.acos(firstnum);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double atan(double firstnum){
    double result = Math.atan(firstnum);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double exp(double firstnum){   // e umocnene na x 
    double result = Math.exp(firstnum);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return 
     */
    public static double ln(double firstnum){
    double result = Math.log(firstnum);
    return result;
    }
    /**
     * 
     * @param firstnum
     * @return decadic logarithm-logarithm to the base 10
     */
    public static double log(double firstnum){   // logaritmus o zaklade 10 
    double result = Math.log10(firstnum);
    return result;
    }
    /**
     * 
     * @param firstnum
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


