/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;
import java.util.*;
import java.io.*;

/**
 *
 * @author localadmin
 */
public class Profiling {
    public static void main(String[] args){
        if(args.length == 0)
        {
            System.err.format("Zadajte subor alebo hodnoty\n");
            System.exit(0);
        }
        else{
            //      System.out.println(args[0]);
        java.io.File file = new java.io.File(args[0]);       
        List<Integer> list = new ArrayList<Integer>();
       // int[] pole = new int[100];
        int i =0; int sum = 0; int mean; int variance = 0; double deviation =0;
        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                i++;
               // int[] copy = Arrays.copyOf(pole, pole.length+1);
                Integer num = input.nextInt();
                sum = sum + num;
                list.add(num);
                //copy[i] = num;    
            }
            mean = sum/i;
            System.out.println("sucet je: "+ sum);
            System.out.println("priemer je: "+ mean);
            
            for (int n = 0; n < list.size(); n++) {
                if (list.get(n) < mean){
                    int clen = mean - list.get(n);
                    variance = variance + (clen*clen);
                }
                else{
                    int clen = list.get(n) - mean;
                    variance = variance + (clen*clen);
                }
    //            System.out.print((list.get(n)).toString()+" ");
            }
                variance = variance/i;
                System.out.println("variancia je: "+ variance);
                deviation = Math.sqrt(variance);
                System.out.println("deviacia je: "+ deviation);
        }    
        catch (FileNotFoundException e){
                System.err.format("File not found\n");
                }
        }
    }
}

