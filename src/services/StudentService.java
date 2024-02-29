package services;

import java.util.List;

import domen.Student;

public class StudentService {
    private int count;
    private List<Student> listStudent;
    public StudentService(List<Student> listStudent) {
        this.listStudent = listStudent;
    }
    
}
