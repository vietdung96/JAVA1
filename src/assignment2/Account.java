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

    public Account tranferTo(Account B){
        int amount;
        System.out.println("Nhập số tiền cần chuyển");
        amount = sc.nextInt();

         Account chuyen = new Account();
         if (amount<this.balance) {
             this.balance = this.balance - amount;
             B.balance = B.balance + amount;
             System.out.println("Số dư hiện tại là " + this.balance);
             System.out.println("Số dư trong tài khoản B là :" +B.balance);

         }else {
             System.out.println("Số tiền không đủ để chuyển khoản");
             return tranferTo(B);

         }
            return chuyen;
    }

}