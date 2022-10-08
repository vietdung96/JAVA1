package practiceExam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Bank b = new Bank(1000,10);
       b.calculateInterest();

        Flight g1 = new Flight(857,"Toroto");
        g1.display();

    }
}
