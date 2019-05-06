/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccounts;

import java.io.InvalidObjectException;

/**
 *
 * @author user
 */
public class CreditCard extends VisaCard{

    @Override
    public void withdraw(Double amount) {
        try {
//            try {
                if(validateCardNumber("8126")){
                    super.withdraw(amount);
                }
//            } catch (CreditException e) {
//                e.printStackTrace();
            //}

        }
        catch (CreditException e) {
            e.printStackTrace();
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
