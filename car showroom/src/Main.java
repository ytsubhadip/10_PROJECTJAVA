import java.util.Scanner;

interface utility{
    public void getDetails();
    public void setDetails();
}


class Main{
    public static void manu1(){
        System.out.println("************************************************************************");
        System.out.println("*                                                                      *");
        System.out.println("*============ **** WELCOME SHOWROOM MANAGEMENT SYSTEM **** ============*");
        System.out.println("*                                                                      *");
        System.out.println("*  1. Add showroom\t\t\t2. Add Employee\t\t\t3. Add Cars        *");
        System.out.println("*                                                                      *");
        System.out.println("*  4. Show showroom\t\t\t5. show Employee\t\t6. show Cars       *");
        System.out.println("*                                                                      *");
        System.out.println("****************************** [0] Exit ********************************");


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // object creates three class
        showroom []show = new showroom[5];
        employee []emp = new employee[5];
        car []cars = new car[5];
        int show_room=0;
        int emp_0 = 0;
        int car_0 = 0;
        int option=100;
        while( option!=0 ) {
            manu1();
            System.out.print("Enter option: ");
            option = scan.nextInt();
            while(option != 9 && option !=0){
                switch (option){
                    case 1:{
                        show[show_room] = new showroom();
                        show[show_room].setDetails();
                        show_room++;
                        System.out.println();
                        System.out.println("1. Add New Showroom");
                        System.out.println("9. Back To Main Manu");
                        option = scan.nextInt();
                        break;
                    }
                    case 2:{
                        emp[emp_0] = new employee();
                        emp[emp_0].setDetails();
                        emp_0++;
                        System.out.println();
                        System.out.println("2. Add New Employee");
                        System.out.println("9. Back To Main Manu");
                        option = scan.nextInt();
                        break;
                    }
                    case 3:{
                        cars[car_0] = new car();
                        cars[car_0].setDetails();
                        car_0++;
                        System.out.println();
                        System.out.println("3. Add New Car");
                        System.out.println("9. Back To Main Manu");
                        option = scan.nextInt();
                        break;
                    }
                    case 4:{
                        for(int i=0;i<show_room;i++){
                                show[i].getDetails();
                                System.out.println();
                                System.out.println();
                        }
                        System.out.println("9. Back To Main Manu");
                        System.out.println("0. Exit");
                        option = scan.nextInt();
                        break;
                    }
                    case 5:{
                        for(int i=0;i<emp_0;i++){
                            emp[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9. Back To Main Manu");
                        System.out.println("0. Exit");
                        option = scan.nextInt();
                        break;
                    }
                    case 6:{
                        for(int i=0;i<car_0;i++){
                            cars[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println("9. Back To Main Manu");
                        System.out.println("0. Exit");
                        option = scan.nextInt();
                        break;
                    }
                    default:
                        System.out.println("Enter Valid Choice");
                        break;
                }
            }
        }
    }
}