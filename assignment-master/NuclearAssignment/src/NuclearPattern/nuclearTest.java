/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuclearPattern;

public class nuclearTest extends Thread {

    int p = 1, n = 1;
    int x = 200;

    public void run() {
        System.out.print(" ");
        System.out.println("n");

        for (int v = 1; v <= x; v++) {
            n = p * 2;
            for (int i = 0; i < p; i++) {

                System.out.print(" ");
                System.out.print("P");

            }

            System.out.println();
            for (int k = 0; k < n; k++) {

                System.out.print(" ");
                System.out.print("n");

            }

            System.out.println();

            if (p < x) {
                p = n;

            } else {
                p = x;
                n = p * 2;
                for (int i = 0; i < x; i++) {
                    System.out.print(" ");
                    System.out.print("p");

                }
                System.out.println();
                for (int k = 0; k < n; k++) {
                    System.out.print(" ");
                    System.out.print("n");
                }
                break;
            }
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.print(e);
            }
        }
    }

}
