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

       System.out.print("   "   );
       for (int i = 1;  i< 10; i++) {
           //System.out.println(" ");
                      
           System.out.print("\t"+i);
           
       }
       System.out.println();
       System.out.println("--------------------------------------");
    for (a = 1; a <= 9;a++) {
        System.out.print(a+" |");
        //System.out.println("");        
        for (b = 1; b <= 9; b++) {
                        
            System.out.print("\t"+(a*b) );
        }
        //System.out.print("-----------------------");        
        System.out.println("");
        //System.out.println("------------------");        
    }
       //System.out.println("_________________________________");       

}

    
}