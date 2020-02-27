package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BankArrayList {
    public static void main(String[] args) {
        childBank b1 = new childBank();
        b1.getbaseInfo();
        b1.getData();
        b1.bankFunc();
    }
}

class MyArrayOfBank {
    //    declare instance variabes,
    float initialBal = 6700;
    int holderAccount;
    String holderName;

    float Bal = initialBal;
    String newLine = System.getProperty("line.separator");

    void getbaseInfo() {
        System.out.println("1. Add Account" + newLine + "2. Deposit Cash" + newLine + "3. Withdraw Cash" + newLine + "4. Bank Statement" + newLine + "5. Exit");
    }

    //        create an Array list of MyArrayOfBank
    ArrayList<MyArrayOfBank> bankList = new ArrayList<>();

    //    create scanner object-
    Scanner accNo = new Scanner(System.in);
    Scanner accName = new Scanner(System.in);

}
class childBank extends MyArrayOfBank {
    //    int totalLimit = 3;
    public void bankFunc() {
//        for (int i = 0; i < totalLimit ; i++) {
//            create an object for MyArrayOfBank,
        MyArrayOfBank mybank1 = new MyArrayOfBank();
        System.out.println("Account No: ");
        mybank1.holderAccount = accNo.nextInt();
        System.out.println("Holder Name: ");
        mybank1.holderName = accName.next();

//            assign the object to arraylist
        bankList.add(mybank1);
//        }
//        print the array
        System.out.println("Resultant Array: " + bankList.toString());
    }

    public void getData() {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Select Choice: ");
        int val = inputValue.nextInt();

        switch (val) {
            case 1:
                this.bankFunc();
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
            case 5: System.out.println("Thanks For Banking!");
            System.exit(0);

            default:
                System.out.println("Wrong Choice");
                this.getData();


        }
    }

    public void depositCash() {
//        enter initial details
        Scanner accNo = new Scanner(System.in);
        System.out.println("Your Account No: " + accNo);
        long acc = accNo.nextLong();

//        iterate thru each data
        for (MyArrayOfBank each_bk : bankList
        ) {
            if (each_bk.holderAccount == acc) {

//                deposit the amount
                Scanner amount = new Scanner(System.in);
                System.out.print("Amount: ");
                int myAmount = amount.nextInt();

//                upadte the balance
                each_bk.Bal += myAmount;
            } else {
                System.out.println("invalid info");
                this.getData();
            }
            System.out.println("Name: "+ each_bk.holderName + newLine + "Account no: " +newLine +
                    each_bk.holderAccount+ newLine + "balance: " + each_bk.Bal);
        }


    }

    public void withdrawCash() {
//        System.out.println("Your initial balance: " + b1.Bal);

//        Enter your info
        Scanner accNo = new Scanner(System.in);
        System.out.println("Your Account No: " + accNo);
        int acc = accNo.nextInt();
//        amount to withdraw

        for (MyArrayOfBank b1 : bankList
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

        for (MyArrayOfBank b3: bankList
        ) {

            if (bankAcc == b3.holderAccount){

                System.out.println("Name: "+ b3.holderName + newLine + "Account No: "+
                        b3.holderAccount + newLine +
                        "Balance: " + b3.Bal);
            }

        }

    }


}



