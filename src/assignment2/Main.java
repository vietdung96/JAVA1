package assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int x =sc.nextInt(); // <=> scanf("%d",&x);
        Account e = new Account(12,"Trần Việt Dũng",500);
        e.credit();
        e.debit();
    }
}
