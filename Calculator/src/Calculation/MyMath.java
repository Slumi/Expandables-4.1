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
    
}
