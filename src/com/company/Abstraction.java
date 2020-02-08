package com.company;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Abstraction {
    public static void main(String[] args) {
        CashDeposit cd = new CashDeposit();
        cd.basicDetails();
//        call the abstract method
        cd.accountInfo();
    }
}
//
abstract class CashWithdrawal{
    int accountPin;
    String accountType;
    byte UniqueNO;
    void basicDetails(){
        String cardType = "visa card";
        System.out.println(cardType);

    }
//declare a abstract method. here v hide its functions
    public abstract void accountInfo();{ }
//    second abstract method


}
class CashDeposit extends CashWithdrawal{
//    give definition for the printAll abstract method that is declared.
    public void accountInfo(){
//        get account pin
        Scanner pin = new Scanner(System.in);
        System.out.print("Enter Pin no: ");
        accountPin = pin.nextInt();
//        get account type
        Scanner type = new Scanner(System.in);
        System.out.print("Enter Account type: ");
        accountType = type.next();
//        get account unique no
        Scanner unique = new Scanner(System.in);
        System.out.print("Enter no b/w 20 and 90: ");
        UniqueNO = unique.nextByte();

        String newLine = System.getProperty("line.separator");
        System.out.println("******Account Details******");
        System.out.println("Pin: "+ accountPin + newLine + "type: " + accountType + newLine +
                "unique no: " + UniqueNO);
    }
}


