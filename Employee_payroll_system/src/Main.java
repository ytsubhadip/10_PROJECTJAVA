abstract class Employee{
       final private String name;
       final private String ID;
        Employee(String name, String ID){
           this.name = name;
           this.ID = ID;
        }
        public void getName(){
            System.out.println(name);
        }
        public String getID(){
            System.out.println(ID);
            return  ID;
        }
       public abstract double calculateSalary();
        public String toString(){
            return ("Name: "+name+" ID: "+ID+" Salary: "+calculateSalary());
        }
}


class Main{
    public static void main(String []args){
        fulltime_employee emp1 = new fulltime_employee("Subhadip Bar","AB124",12_00_000);
    System.out.println(emp1.toString());
        parttime_employee emp2 = new parttime_employee("SK Rahul","ACB124",100,40);
        System.out.println(emp2.toString());
    }


}