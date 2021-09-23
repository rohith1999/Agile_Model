//test default
package com.thbs.bank;

import java.util.Random;

public class Account {
    private final long accountNo;
     String accountType;
    private double balanceAmount;
    private static int count;

    static {
        count = 0;
    }

    //1. create an account
    //2. deposit
    //3. withdraw
    //4. display balance
    //5. automatic generation of account number

    public Account(String accountType, double balanceAmount) {
        this.accountType = accountType;
        this.balanceAmount = balanceAmount;
        this.accountNo = getCount();
    }

    public static int getCount() {

//        return (++count);
        // random number bw 2000 and 3000
       return (new Random().nextInt(1000)+2000);
    }






    public double withdraw(double withdrawAmount) {
        balanceAmount-=withdrawAmount;
        return(balanceAmount);
    }

    public double deposit(double depositAmount){
        balanceAmount+=depositAmount;
        return (balanceAmount);
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                ", balanceAmount=" + balanceAmount +
                '}';
    }
}

// test default
package com.thbs.bank;

public class TestDefault {

    public String getTest() {
        Account account=new Account("sav",2000);
        return account.accountType;
    }
}

//main
package com.thbs;

import com.thbs.bank.Account;
import com.thbs.bank.TestDefault;

import java.time.format.TextStyle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account account = new Account("savings",2000);
        Account account1 = new Account("salery",5000);

      //  System.out.println("number of accounts created: "+(Account.getCount()-1));
        System.out.println(account);
        System.out.println(account1);

      //  System.out.println("account no.");

        //test
        TestDefault testDefault =new TestDefault();
        System.out.println(testDefault.getTest());

        Scanner scanner=new Scanner(System.in);
        System.out.println("your current balance is 2000");
        System.out.println("enter an amount to withdraw");
        System.out.println( account.withdraw(scanner.nextDouble()));
        System.out.println("enter a deposit amount");
        System.out.println( account.deposit(scanner.nextDouble()));
        System.out.println("your current balance is: "+account.getBalanceAmount());

        scanner.close();
    }
}


