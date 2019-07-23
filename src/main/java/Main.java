import controller.EmployeeController;
import model.Employee;
import view.EmployeeDashboardView;

public class Main {
    public static void main(String[] args){

        Employee employee = retrieveEmployee();

        //Create our View for displaying employee details
        EmployeeDashboardView view = new EmployeeDashboardView();

        //Create Controller
        EmployeeController controller = new EmployeeController(employee,view);


        controller.updateDashboard();
    }

    public static Employee retrieveEmployee(){
        Employee employee = new Employee();
        employee.setSsNumber("4564321");
        employee.setLastname("Baloyi");
        employee.setFirstname("Musa");
        employee.setSalary(12000);

        return employee;
    }
}
