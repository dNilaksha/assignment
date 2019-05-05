/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccounts;

/**
 *
 * @author user
 */
public class BankAccounts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VisaCard v=new VisaCard();
        v.AccountValidation();
        v.checkedBalance();
        v.withDraw();
    }
    
}
