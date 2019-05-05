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
public class VisaCard extends CreditAccount{

    @Override
    public void AccountValidation() {
        super.AccountValidation(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void withDraw() {
        System.out.println("visa");        
    }
    public void checkedBalance(){
        System.out.println("checked Balance");        
    }
}
