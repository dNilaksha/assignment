/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bankaccounts;

import com.sun.org.apache.bcel.internal.ExceptionConstants;

/**
 *
 * @author user
 */
public class Account{
    int withdrawCount=5;
    public boolean accountwithdrawValidation() throws AccountException {

        if(withdrawCount<=3)
            return true;
        else {

            throw new AccountException("withdraw count exceed");
        }
    }


public void withdraw(Double amount){
    System.out.println("Withdraw made from credit Account class");
}
             

}
