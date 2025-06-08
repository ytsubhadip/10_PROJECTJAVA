import java.util.Scanner;
class ATM{
    Scanner scan = new Scanner(System.in);
    int pin=721424;
    float balance=10_000;

   public void ac_balance(){
        System.out.print("Account Balance: "+balance);
        System.out.println();
        System.out.println("1.back");
        System.out.println("2.Exit");
       System.out.println();
       System.out.print("$:");
        int opt = scan.nextInt();
        if(opt == 1){
            manu();
        }
        else if(opt == 2){
            System.out.println("by");
        }
    }
    public void withdraw_money(){
        System.out.println("Enter your amount: ");
        int amount = scan.nextInt();
        if(amount >=balance){
            System.out.println("! Limited balance");
        }
        else{
            balance -= amount;
            System.out.println("successfully withdraw money");
        }
        System.out.println();
        System.out.println("1.back");
        System.out.println("2.Exit");
        System.out.println();
        System.out.print("$:");
        int opt = scan.nextInt();
        if(opt == 1){
            manu();
        }
        else if(opt == 2){
            System.out.println("by");
        }
    }
    public void deposit_money(){
        System.out.print("Enter your amount: ");
        int d_amount = scan.nextInt();
        balance += d_amount;
        System.out.println("successfully deposit money");
        System.out.println();
        System.out.println("1.back");
        System.out.println("2.Exit");
        System.out.println();
        System.out.print("$:");
        int opt = scan.nextInt();
        if(opt == 1){
            manu();
        }
        else if(opt == 2){
            System.out.println("by");
        }

    }
    public void exit(){
        System.out.println("ThankYou ...");
    }
    public void manu(){

        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("$:");
        int opt = scan.nextInt();
        if(opt == 1)  ac_balance();
        else if(opt == 2) withdraw_money();
        else if(opt == 3) deposit_money();
        else if(opt == 4 ) exit();
    }
    ATM(){
        int enterPIN;
        System.out.print("Enter your pin: ");
        enterPIN = scan.nextInt();
        if(enterPIN == pin){
            System.out.println("login account successfully");
            manu();
        }
        else{
            System.out.println("pin is invalid");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ATM obj1 = new ATM();
    }

}