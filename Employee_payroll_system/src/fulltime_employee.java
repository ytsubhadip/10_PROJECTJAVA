public class fulltime_employee extends Employee {
    final private double salary;
    fulltime_employee(String name ,String id,double salary){
        super(name,id);
        this.salary = salary;
    }
    @Override
    public double calculateSalary(){
        return  salary;
    }

}
