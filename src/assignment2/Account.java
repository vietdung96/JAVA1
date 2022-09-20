package assignment2;

import java.util.Scanner;

public class Account {
    int ID;


    String name;
    int balance;
    Scanner sc = new Scanner(System.in);
    public Account(){

    }

    public Account(int ID, String name, int balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }
    public int credit(){
        int amount;
        System.out.println("Nhập số tiền cần nạp");
        amount =sc.nextInt();
        if(amount>0){
            balance =amount+balance;
        }else{
            System.out.println("Số tiền nạp không hợp lệ");
            return credit();
        }
        System.out.println("Số dư hiện tại là :" +balance);
        return amount;



    }
    public int debit(){
        int amount;
        System.out.println("Nhập số tiền cần rút");
        amount = sc.nextInt();
        if (amount<=balance){
            balance=balance-amount;
        }else{
            System.out.println("Số tiền rút không hợp lệ");
            return debit();
        }
        System.out.println("Số dư hiện tại là :" +balance);
        return amount;
    }

}