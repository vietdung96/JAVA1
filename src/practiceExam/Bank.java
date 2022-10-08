package practiceExam;

public class Bank {


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    double balance;
    double rate ;


    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    public void calculateInterest(){
        double interest = balance * (rate/1200);
        System.out.println( "interest "+interest);

    }

}
