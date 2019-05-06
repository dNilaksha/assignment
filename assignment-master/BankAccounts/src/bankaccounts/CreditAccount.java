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
public class CreditAccount extends Account{

    boolean validateAccount(String accountNumber) {
        try {
            if (accountwithdrawValidation()) {

                if (accountNumber.length() > 5)
                    return true;
                throw new IllegalArgumentException("account number should be over 5 digits");

            } else
                return false;
        }catch (AccountException ae){
            throw new IllegalArgumentException("Accont validation failed");

        }
    }
    }


