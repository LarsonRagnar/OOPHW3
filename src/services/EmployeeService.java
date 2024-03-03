package services;

import java.util.List;

import domen.Employee;
import domen.PersonComparator;

public class EmployeeService implements iPersonSrevice<Employee> {
    
    private int count;
    private List<Employee> listEmployee;
    public EmployeeService(List<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }
    @Override
    public void create(String name, int age) {
        Employee newEmployee= new Employee(name, age, "Разнорабочие");
        this.listEmployee.add(newEmployee);
        this.count++;
        
    }
    @Override
    public List<Employee> getAll() {
        return this.listEmployee;
    }
    public void sortByFIO(){
        PersonComparator<Employee> comparator=new PersonComparator<Employee>();
        this.listEmployee.sort(comparator);
    }
    
}
