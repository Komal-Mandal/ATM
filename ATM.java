package apnacollege.com;
import java.util.Scanner;

public interface Atmoperation{
    public void viewbalance();
    public void WithdrawAmount(double Withdrawn);

    public void DepositeAmount(double Deposite);

    public void viewministatement();
}

class Atmdep implements Atmoperation{

    a1 aa = new a1();
    @Override
    public void viewbalance() {
        System.out.println("Available balance is:" + aa.getBalance());

    }

    @Override
    public void WithdrawAmount(double Withdrawn) {
        System.out

    }

    @Override
    public void DepositeAmount(double Deposite) {
        System.out.println("Deposited succesfully");
        aa.setbalance(aa.getBalance()+ DepositeAmount());

    }

    @Override
    public void viewministatement() {

    }
}

class a1 {

    private double balance;
    private double Depositeamount;
    private double Withdrawnamount;

    public a1() {

    }

    public double getBalance() {
        return balance;
    }

    public double getDepositeamount() {
        return Depositeamount;
    }

    public double getWithdrawnamount() {
        return Withdrawnamount;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }

    public void setDepositeamount(double Depositeamount){
        this.Depositeamount= Depositeamount;
    }

    public void setWithdrawnamount(double Withdrawnamount){
        this.Withdrawnamount = Withdrawnamount;
    }
}
  public class atm{
    public static void main(String args[]) {

        Atmoperation a2 = new Atmdep();


        int atmnumber = 12345;
        int atmPin = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("enter ATM no");
        int atmNumber = in.nextInt();
        System.out.println("enter atm pin");
        int atmpin = in.nextInt();

        if((atmnumber == atmNumber)&& (atmPin == atmpin)){
            while(true) {
                System.out.println("1.view Available balance\n2.Withdrawn Amount\n3.Deposite Amount\n4.view ministatement\n5.exit application");
                System.out.println("enter the choice");
                int ch = in.nextInt();

                if(ch==1){
                    a2.viewbalance();
                }
                else if(ch==2) {
                    System.out.println("enter amount to withdraw");
                    double WithdrawAmount = in.nextDouble();
                    a2.WithdrawAmount(WithdrawAmount);

                }
                else if(ch==3){
                    System.out.println("enter Amount to deposite");
                    double DepositeAmount = in.nextDouble();
                    a2.DepositeAmount(DepositeAmount);

                }
                else if(ch==4){
                    a2.viewministatement();

                }
                else if(ch==5){
                    System.out.println("collect your atm card\n thank you for using atm machine");
                    System.exit(0)
                }
                else{
                    System.out.println("pls enter correct choice");
                }
            }
        }
        else{
            System.out.println("incorrect atm no");
            System.exit(0);
        }



    }
  }