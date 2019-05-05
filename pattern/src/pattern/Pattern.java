/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

/**
 *
 * @author user
 */
public class Pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          

        int n=5;
        
        //*****
        //****
        //**
        //*
        for (int i= 1;i<=n;i++) {

            for (int j=n;j>=i;j--) {
                System.out.print(" ");
            }

            for (int k=1;k <=(2*i-1);k++){   /* ***
                                               ****** */

                System.out.print("*");                
            }

            System.out.println();
        }
        for (int i= n;i>=1;i--) {

            for (int j=n;j>=i;j--) {
                System.out.print(" ");
            }

            for (int k=1;k <=(2*i-1);k++){   /* ***
                                               ****** */

                System.out.print("*");                
            }

            System.out.println();
        }
        
    }
    }
    

