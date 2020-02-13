package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BankArrayProblem {
    public static void main(String[] args) {
        MyBank myb1 = new MyBank();
        myb1.getbaseInfo();
        myb1.getData();
        myb1.BankFunc();
        myb1.withdrawCash();
        myb1.bankStatement();
    }
}


class MyBank {
    //    declare instance variables
    float initialBal = 6700;
    int holderAccount;
    String holderName;

    //    create a constructor
//    MyBank(float initialBal) {
    float Bal = initialBal;
    String newLine = System.getProperty("line.separator");

    void getbaseInfo(){


        System.out.println("1. Add Account" + newLine + "2. Deposit Cash" + newLine+ "3. Withdraw Cash" + newLine + "4. Bank Statement" + newLine + "5. Exit");
        }

//    }

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
            case 3:
                this.withdrawCash();
                this.getData();
                break;
            case 4:
                this.bankStatement();
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
            MyBank myb1 = new MyBank();
            System.out.print("Account No: ");
            myb1.holderAccount = accNo.nextInt();
            System.out.print("Account Holder: ");
            myb1.holderName = accName.next();

//            assign Mybank object to array object
            bankArray[i] = myb1;
        }
        System.out.println("Resultant Array: " + Arrays.toString(bankArray));
    }


//    inherit parent class


    public void depositCash() {
//        System.out.println("Your initial balance: " + Bal);
//       Enter your Details
        Scanner accNo = new Scanner(System.in);
        System.out.println("Your No: " + accNo);
        long acc = accNo.nextLong();

//        iterate through each item

        for (MyBank each_b : bankArray
        ) {

            if (each_b.holderAccount == acc) {

//        amount to deposit
                Scanner amount = new Scanner(System.in);
                System.out.print("Amount: ");
                int myAmount = amount.nextInt();
//        add to current balance
                each_b.Bal += myAmount;
//                System.out.println("Balance: " + each_b.Bal);
            }
//            else {
//                System.out.println("Invalid Info");
//                this.getData();


//            }

            System.out.println("Name: "+ each_b.holderName + newLine + "Account no: " +newLine +
                    each_b.holderAccount+ newLine + "balance: " + each_b.Bal);
            }
        }

    public void withdrawCash() {
//        System.out.println("Your initial balance: " + b1.Bal);

//        Enter your info
        Scanner accNo = new Scanner(System.in);
        System.out.println("Your Account No: " + accNo);
        int acc = accNo.nextInt();
//        amount to withdraw

        for (MyBank b1 : bankArray
        ) {

            if (acc == b1.holderAccount) {

                Scanner newAmount = new Scanner(System.in);
                System.out.print("Amount: ");
                int withAmount = newAmount.nextInt();
//        deduct from current balance
                b1.Bal -= withAmount;
//                System.out.println("Balance: " + b1.Bal);
            }
//            else {
//                System.out.println("Invalid Info");
//                this.getData();
//            }
            System.out.println("Name: " + b1.holderName + newLine + "Account no: " + newLine +
                    b1.holderAccount + newLine + "balance: " + b1.Bal);
        }
    }

        public void bankStatement(){
            Scanner bankInfo = new Scanner(System.in);
            System.out.print("Enter Account No: ");
            int bankAcc = bankInfo.nextInt();
            System.out.println("***My Bank Details***");

            for (MyBank b3: bankArray
                 ) {

                if (bankAcc == b3.holderAccount){

                    System.out.println("Name: "+ b3.holderName + newLine + "Account No: "+
                            b3.holderAccount + newLine +
                            "Balance: " + b3.Bal);
                }

            }

        }

    }








