package services;

import java.util.List;

import domen.Employee;
import domen.PersonComparator;
import domen.Student;
import domen.Teacher;

public class TeacherService extends PersonComparator<Teacher> implements iPersonSrevice<Teacher>{
    private int count;
    private List<Teacher> listTeacher;
    public TeacherService(List<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }
    @Override
    public List<Teacher> getAll() {
        return this.listTeacher;
    }
    @Override
    public void create(String name,int age) {
        Teacher newsTeacher=new Teacher(name,age,"Teacher");
        this.listTeacher.add(newsTeacher);
        this.count++;
    }
    /**
     * @apiNote Сортировка учителей
     */
    public void sortTeacherList(){
        PersonComparator<Teacher> comparator=new PersonComparator<Teacher>();
        this.listTeacher.sort(comparator);
    }
    /**
     * @apiNote вывод отсортированого списка
     */
    public void printSortTeacherList(){
        sortTeacherList();
        System.out.println(this.listTeacher);
    }
    public void setTeacherList(List<Teacher> listTeacher) {
        this.listTeacher=listTeacher;
    }
}


    


