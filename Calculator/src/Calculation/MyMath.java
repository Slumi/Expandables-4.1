/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;

/**
 *
 * @author xgalba03
 */
public class MyMath {
    public static double add(double firstnum, double secondnum){
    double result = firstnum+secondnum;
    return result;
    }
    
    public static double sub(double firstnum, double secondnum){
    double result = firstnum-secondnum;
    return result;
    }
    
    public static double mul(double firstnum, double secondnum){
    double result = firstnum*secondnum;
    return result;
    }
    
    public static double div(double firstnum, double secondnum){
    double result = firstnum/secondnum;
    return result;
    }
    
    public static double fac(double num){
    double i = num; //counter pre faktorial
    double result;
    if(num == 0)
        result = 1;
    else if(num == 1)
        result = num;
    else{
    while(i>1){
        i=i-1;
        num = num*i;
        }
        result = num;
        }
    return result;
    }
    
    public static double sqrt(double firstnum){
    double result = Math.sqrt(firstnum);
    return result;
    }
    
    public static double root(double base, double n){
    double result = Math.pow(Math.E, Math.log(base)/n);
    return result;
    }
    
    public static double sqrd(double firstnum){
    double result = firstnum*firstnum;
    return result;
    }
    
    public static double pow(double base, double exponent){
    double result = Math.pow(base, exponent);
    return result;
    }
    
    public static double sin(double firstnum){
    double result = Math.sin(firstnum);
    return result;
    }
     
    public static double cos(double firstnum){
    double result = Math.cos(firstnum);
    return result;
    }
    
    public static double tan(double firstnum){
    double result = Math.tan(firstnum);
    return result;
    }
    
    public static double asin(double firstnum){
    double result = Math.asin(firstnum);
    return result;
    }
    
    public static double acos(double firstnum){
    double result = Math.acos(firstnum);
    return result;
    }
    
    public static double atan(double firstnum){
    double result = Math.atan(firstnum);
    return result;
    }
    
    public static double exp(double firstnum){   // e umocnene na x 
    double result = Math.exp(firstnum);
    return result;
    }
    
    public static double ln(double firstnum){
    double result = Math.log(firstnum);
    return result;
    }
    
    public static double log(double firstnum){   // logaritmus o zaklade 10 
    double result = Math.log10(firstnum);
    return result;
    }
    
    public static double abs(double firstnum){   // absolutna hodnota x  
    double result = Math.abs(firstnum);
    return result;
    }
    
    public static double pi(){   // vrati hodnotu π 
    return Math.PI;
    }
    
    public static double e(){   // vrati hodnotu e 
    return Math.E;
    }
}
