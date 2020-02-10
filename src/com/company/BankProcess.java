package com.company;


import java.util.Scanner;

public class BankProcess {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(6000.70f);
        b1.getData();
        b1.addAccount();

    }
}

class BankAccount {
    float initialBalance;
    long holderAccount;
    String holderName;

    BankAccount(float initialBalance) {
        this.initialBalance = initialBalance;
        String newLine = System.getProperty("line.separator");
        System.out.println("1. Add Account" + newLine + "2. Deposit Cash" + newLine
                + "3. Withdraw Cash" + newLine + "4. Bank Statement" + newLine + "5. Exit");
    }

    void getData() {
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Select Choice: ");
        int val = inputValue.nextInt();

        switch (val) {
            case 1:
                this.addAccount();
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


    void addAccount() {
//        get user info's
        Scanner userName = new Scanner(System.in);
        System.out.print("Your Name: ");
        holderName = userName.next();

        Scanner userAccountNo = new Scanner(System.in);
        System.out.print("Your Account No: ");
        holderAccount = userAccountNo.nextLong();

        System.out.println(this.holderName + " " + this.holderAccount);
    }

    void depositCash() {
        System.out.println("Your initial balance: " + this.initialBalance);
//       Enter your Details
        Scanner accNo = new Scanner(System.in);
        System.out.println("Your No: " + accNo);
        long acc = accNo.nextLong();
        if(holderAccount == acc){

//        amount to deposit
            Scanner amount = new Scanner(System.in);
            System.out.print("Amount: ");
            int myAmount = amount.nextInt();
//        add to current balance
            this.initialBalance += myAmount;
            System.out.println("Balance: " + this.initialBalance);
        }
        else{
            System.out.println("Invalid Info");
            this.getData();
        }

    }

    void withdrawCash() {
        System.out.println("Your initial balance: " + this.initialBalance);

//        Enter your info
        Scanner accNo = new Scanner(System.in);
        System.out.println("Your No: " + accNo);
        long acc = accNo.nextLong();
//        amount to withdraw
        if (acc == holderAccount){

            Scanner newAmount = new Scanner(System.in);
            System.out.print("Amount: ");
            int withAmount = newAmount.nextInt();
//        dedduct from current balance
            this.initialBalance -= withAmount;
            System.out.println("Balance: " + this.initialBalance);
        }
        else {
            System.out.println("Invalid Info");
            this.getData();
        }
    }

    void bankStatement(){
        String newLine = System.getProperty("line.separator");
        System.out.println("***Bank Details***");
        System.out.println("Name: "+ this.holderName + newLine + "Account No: "+this.holderAccount + newLine +
                "Balance: " + this.initialBalance);

    }


}