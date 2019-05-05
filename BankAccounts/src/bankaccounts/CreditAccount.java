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
public class CreditAccount extends Exception implements Account{

    
    public void withDraw() {
        System.out.println("credit");        
    }
    public void AccountValidation(){
        System.out.println("validation");        
    }
}
