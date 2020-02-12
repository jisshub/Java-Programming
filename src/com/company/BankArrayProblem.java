package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BankArrayProblem {
    public static void main(String[] args) {
        MyBank myb1 = new MyBank(6700);
        myb1.getData();
        myb1.BankFunc();
    }
}


class MyBank {
    //    declare instance variables
    float initialBal;
    int holderAccount;
    String holderName;

    //    create a constructor
    MyBank(float initialBal) {
        this.initialBal = initialBal;
        String newLine = System.getProperty("line.separator");
        System.out.println("1. Add Account" + newLine + "2. Deposit Cash" + newLine
                + "3. Withdraw Cash" + newLine + "4. Bank Statement" + newLine + "5. Exit");
    }

    //      create an array of MyBank
    MyBank[] bankArray = new MyBank[2];

    //        create some scanner objects
    Scanner accNo = new Scanner(System.in);
    Scanner accName = new Scanner(System.in);


    public void getData() {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Select Choice: ");
        int val = inputValue.nextInt();

        switch (val) {
            case 1:
                this.BankFunc();
                this.getData();
                break;
            case 2:
                this.depositCash();
                this.getData();
                break;
            case 5:
                System.out.println("Thanks for Banking!");
                System.exit(0);
            default:
                System.out.println("Wrong Choice");
                this.getData();
        }
    }

    //     iterate through new array
    public void BankFunc() {
        for (int i = 0; i < bankArray.length; i++) {
//            create an object of MyBank
            MyBank myb1 = new MyBank(6700);
            System.out.println("Account No: ");
            myb1.holderAccount = accNo.nextInt();
            System.out.println("Account Holder: ");
            myb1.holderName = accName.next();

//            assign Mybank object to array object
            bankArray[i] = myb1;

            System.out.println(myb1.holderAccount + " " + myb1.holderName);

        }
        System.out.println("Resultant Array: " + Arrays.toString(bankArray));
    }


//    inherit parent class


    public void depositCash() {
        System.out.println("Your initial balance: " + this.initialBal);
//       Enter your Details
        Scanner accNo = new Scanner(System.in);
        System.out.println("Your No: " + accNo);
        long acc = accNo.nextLong();

//        iterate through each item

        for (int j = 0; j < bankArray.length; j++) {

            if(holderAccount == acc){

//        amount to deposit
                Scanner amount = new Scanner(System.in);
                System.out.print("Amount: ");
                int myAmount = amount.nextInt();
//        add to current balance
                this.initialBal += myAmount;
                System.out.println("Balance: " + this.initialBal);
            }
            else{
                System.out.println("Invalid Info");
                this.getData();
            }
        }

    }



}




