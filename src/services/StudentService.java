package services;

import java.util.List;

import domen.Person;
import domen.PersonComparator;
import domen.Student;

public class StudentService implements iPersonSrevice<Student> {
    private int count;
    private List<Student> listStudent;
    public StudentService(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
    @Override
    public void create(String name, int age) {
        Student newsStudent=new Student(name,age);
        this.listStudent.add(newsStudent);
        this.count++;
        
    }
    @Override
    public List<Student> getAll() {
        
        return this.listStudent;
    }
    public void sortByFIO(){
        PersonComparator<Student> comparator=new PersonComparator<Student>();
        this.listStudent.sort(comparator);
    }

    
}
