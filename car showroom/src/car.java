import java.util.Scanner;

public class car implements utility{

    String car_name;
    String car_color;
    String car_fuel_type;
    int car_price;
    String car_Number;
// get all details in car class
public void getDetails(){
    System.out.println("Car Name: "+ car_name);
    System.out.println("Car color: "+ car_color);
    System.out.println("car fuel type: "+ car_fuel_type);
    System.out.println("car price: "+ car_price);
    System.out.println("car Number : "+ car_Number);
}
// set all
public void setDetails(){
    Scanner sca = new Scanner(System.in);
    System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
    System.out.println();
    System.out.print("Enter car name: ");
    car_name = sca.nextLine();
    System.out.print("Enter car color: ");
    car_color = sca.nextLine();
    System.out.print("Enter car fuel type: ");
    car_name = sca.nextLine();
    System.out.print("Enter car price: ");
    car_price = sca.nextInt();
    sca.nextLine();
    System.out.print("Enter car type: ");
    car_Number = sca.nextLine();

}


}
