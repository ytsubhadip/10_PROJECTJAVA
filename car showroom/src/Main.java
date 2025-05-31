import java.util.Scanner;

interface utility{
    public void getDetails();
    public void setDetails();
}

class manu{
    public static void manu1(){
        System.out.println("************************************************************************");
        System.out.println("*                                                                      *");
        System.out.println("*==================WELCOME SHOWROOM MANAGEMENT SYSTEM==================*");
        System.out.println("*                                                                      *");
        System.out.println("*1. Add showroom\t\t\t2. Add Employee\t\t\t3. Add Cars        *");
        System.out.println("*                                                                      *");
        System.out.println("*4. Show showroom\t\t\t5. show Employee\t\t\t.6 show Cars   *");
        System.out.println("*                                                                      *");
        System.out.println("************************************************************************");


    }
}
class Main{

    public static void main(String[] args) {
        Scanner util = new Scanner(System.in);
        showroom obj1 = new showroom();
        manu.manu1();
        int option;
        System.out.print("Enter option: ");

    }
}