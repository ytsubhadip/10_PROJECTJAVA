import java.util.ArrayList;

public class payroll {
    final private ArrayList<Employee> employeeList;
    public payroll(){
        employeeList = new ArrayList<>();
    }
    public void addEmp(Employee employee){
        employeeList.add(employee);
    }
    public void removeEmp(String id){
        Employee employeeRemoveList=null;
        for(Employee emp: employeeList){
            if(emp.getID().equals(id)){
                employeeRemoveList = emp;
                break;
            }
        }
        if(employeeRemoveList!=null){
            employeeList.remove(employeeRemoveList);
        }

    }
}
