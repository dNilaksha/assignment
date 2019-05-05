/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Table {
   public static void main(String[] args) {
    int a;
    int b;
       for (int i = 0; i < 68; i++) {
           //System.out.println(" ");
                      
           System.out.print("_"); 
           
       }
    
       //System.out.println("____________________________________________________________________");
       System.out.println(" ");       
    for (a = 1; a <= 9;a++) {
        //System.out.println("");        
        for (b = 1; b <= 9; b++) {
                        
            System.out.print("|"+(a*b) + "\t");
        }
        //System.out.print("-----------------------");        
        System.out.println("");
        //System.out.println("------------------");        
    }
       //System.out.println("_________________________________");       
    for (int i = 0; i < 68; i++) {
           //System.out.println(" ");           
           System.out.print("_"); 
           
       }
       System.out.println(" ");       
   
}

    
}