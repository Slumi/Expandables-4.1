/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculation;
import java.util.*;

/**
 * @author Žaneta Grossová
 * @author Marie Bednářová
 * @author Damián Gladiš
 * @author Šimon Galba
 * @version 1.0
 */

public class Profiling {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        if(args.length == 0)   //overenie neprazdneho vstupu
        {
            System.err.format("Zadajte hodnoty\n");
            System.exit(0);
        }
        else{      
        List<Double> list = new ArrayList<Double>();    //inicializacia listu pre hodnoty
        int i =0; double sum = 0; double mean; double variance = 0; double deviation =0;
            Scanner input = new Scanner(System.in); //nacitanie standardneho vstupu do bufferu
            int pocet = args.length;
            for ( int p = 0; p<pocet; p++)
            {
              i++;
              Double num = Double.parseDouble(args[p]);     //datova zmena argumentu na cislo pre vypocet
              sum = sum + num;
              list.add(num);        //pridanie cisla do listu
            }
            mean = sum/i;
            for (int n = 0; n < list.size(); n++) {
                if (list.get(n) < mean){    //rozdelenie podmienky pre vypocet absolutnej hodnoty vzdialenosti cisla od priemeru
                    double clen = mean - list.get(n);  //pomocna hodnota pre vypocet variacie
                    variance = variance + (clen*clen);  //vypocet variacie podla vzorca
                }
                else{
                    double clen = list.get(n) - mean;       
                    variance = variance + (clen*clen);
                }
            }
                variance = variance/i;
                deviation = MyMath.sqrt(variance);  //vypocet standadrnej odchylky podla variacie   
                System.out.println(deviation);      // proram vracia na stdou standardnu odchylku ako double  
        }    
        }
    }
