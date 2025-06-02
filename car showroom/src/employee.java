import java.util.Scanner;
import java.util.UUID;

public class employee implements utility {
    String emp_name;
    String emp_id;
    int emp_age;
    String emp_email;
    public void getDetails(){
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee Name: "+emp_name);
        System.out.println("Employee age: "+ emp_age);
        System.out.println("Employee email: "+ emp_email);

    }
    public void setDetails(){
        UUID id = UUID.randomUUID();
        emp_id =String.valueOf(id) ;
        Scanner scan = new Scanner(System.in);
        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
        System.out.println();
        System.out.print("Enter Employee Name: ");
        emp_name = scan.nextLine();

        System.out.print("Enter Employee Age: ");
        emp_age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Employee E-gmail: ");
        emp_email = scan.nextLine();

    }


}
