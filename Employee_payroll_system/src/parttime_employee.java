public class parttime_employee extends Employee{
   final private int workhour;
    final private double houreprice;

    parttime_employee(String name, String ID,int workhour ,double houreprice){
        super(name,ID);
        this.houreprice = houreprice;
        this.workhour = workhour;
    }
    @Override
    public double calculateSalary(){
        return workhour * houreprice;
    }
}