package services;

import java.util.List;

import domen.Employee;

public class EmployeeService {
    
    private int count;
    private List<Employee> listEmployee;
    public EmployeeService(List<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }
    
}
