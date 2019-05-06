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
public class VisaCard extends CreditAccount {

    @Override
    public void withdraw(Double amount) {
        System.out.println("withdraw made from Credit Amount Class");
    }

    public boolean validateCardNumber(String cardNumber) throws InvalidObjectException, CreditException {
        try {
            try {
                if (validateAccount(cardNumber)) {

                    if (cardNumber.startsWith("812"))
                        return true;
                    throw new InvalidObjectException("Invalid Card Number");
                } else {
                    throw new CreditException("Invalid Account Number");
                }

            }catch (AccountException e){

                throw new CreditException("Account validation failed",e);

            }

        }catch (IllegalArgumentException iae){
            throw  new CreditException("Account Validation Failed",iae);
        }

    }
}
