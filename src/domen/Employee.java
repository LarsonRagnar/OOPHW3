package domen;

public class Employee extends WorkingPerson{
    public Employee(String name, int age,String special) {
        super(name, age);
        this.special=special;
    }

    private String special;

    @Override
    public String toString() {

        return "Employee [special=" + special + "]";
    }

    


}
