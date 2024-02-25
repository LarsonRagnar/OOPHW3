import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import domen.Student;
import domen.StudentGroup;
import domen.StudentSteam;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students =new ArrayList<>();
        List<Student> students2 =new ArrayList<>();

        Student student1= new Student("Ivan", 20);
        Student student2= new Student("Misha", 32);
        Student student3= new Student("Raya", 44);
        Student student4= new Student("leha", 18);
        Student student5= new Student("sasha", 21);
        Student student6= new Student("anna", 21);
        Student student7= new Student("dasha", 21);

        Student student8= new Student("masha", 22);
        Student student9= new Student("glasha", 23);
        Student student10= new Student("Washa", 21);
        Student student11= new Student("Rasha", 225);
        students2.add(student8);
        students2.add(student9);
        students2.add(student10);
        students2.add(student11);

        students.add(student7);
        students.add(student6);

        students.add(student5);
        students.add(student4);
        students.add(student3);
        students.add(student2);
        students.add(student1);
/**
 * создание первой группы
 */
        StudentGroup studentGroup =new StudentGroup(2, students);
        for (Student student : studentGroup) {
            System.out.println(student);
            
        }
        System.out.println("-------------------------------");
        Collections.sort(studentGroup.getStudentList());
        for (Student student : studentGroup) {
            System.out.println(student);
            
        }
        /**
         * создание второй группы
         */
        StudentGroup studentGroup2 =new StudentGroup(3, students2);
        for (Student student : studentGroup2) {
            System.out.println(student);
            
        }
        System.out.println("-------------------------------");
        Collections.sort(studentGroup2.getStudentList());
        for (Student student : studentGroup2) {
            System.out.println(student);
            
        }

        List<StudentGroup> studentSteamList = new ArrayList<>();
        studentSteamList.add(studentGroup2);
        studentSteamList.add(studentGroup);
/**
 * создаем поток и сортируем
 */
        StudentSteam studentSteam = new StudentSteam(6, studentSteamList);
        System.out.println(studentSteam);
        System.out.println("---------------------------------");
        Collections.sort(studentSteam.getStudentSteamList());
        System.out.println(studentSteam);





        

        
    }
}
