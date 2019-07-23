package controller;

import model.Employee;
import view.EmployeeDashboardView;

public class EmployeeController {
    private Employee employeeModel;
    private EmployeeDashboardView view;

    public EmployeeController(Employee employeeModel, EmployeeDashboardView view) {
        this.employeeModel = employeeModel;
        this.view = view;
    }

    public void setEmployeeModel(String name, String lname){
        employeeModel.setFirstname(name);
        employeeModel.setLastname(lname);
    }

    public String getEmployeeName(){
        return employeeModel.getFirstname() + " " + employeeModel.getLastname();
    }

    public void setSSN(String ssn){
        employeeModel.setSsNumber(ssn);
    }

    public  String getSSN(){
        return employeeModel.getSsNumber();
    }

    // Update View
    public void updateDashboard(){
        view.printEmployeeInformation(employeeModel);
    }
}

