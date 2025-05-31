import java.util.Scanner;

public class showroom implements utility{
        Scanner scan = new Scanner(System.in);
        public String showroom_name;
        public String manager_name;
        public String showroom_address;
        public int employee_count;
        public int total_cars_in_stock = 0;

        public void getDetails(){
            System.out.println("Showroom Name: "+showroom_name);
            System.out.println("Showroom Address: "+showroom_address);
            System.out.println("Manger Name: "+manager_name);
            System.out.println("Total Employee: "+employee_count);
            System.out.println("Total car stock: "+total_cars_in_stock);
        }



        public void setDetails(){
           String showroomName;
           String showroomAdd;
           String managerName;
           int emp_count;
           int total_car;

            System.out.print("Enter showroom name: ");
            showroomName = scan.nextLine();
            this.showroom_name = showroomName;

            System.out.print("Enter showroom Address: ");
            showroomAdd = scan.nextLine();
            this.showroom_address = showroomAdd;

            System.out.print("Enter Manager Name: ");
            managerName = scan.nextLine();
            this.manager_name = managerName;

            System.out.print("Enter Total Employee: ");
            emp_count = scan.nextInt();
            this.employee_count = emp_count;

            System.out.print("Enter car stock: ");
            total_car = scan.nextInt();
            this.total_cars_in_stock = total_car;

        }

    }
