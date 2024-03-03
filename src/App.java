import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import controllers.AccountController;
import domen.Employee;
import domen.Student;
import domen.StudentGroup;
import domen.StudentSteam;
import domen.Teacher;
import services.TeacherService;

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
        // Student student12= new Student("VasyaHItriy", 228);

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

Employee worker =new Employee("Anton", 15, "cleanMan");
Employee worker2 =new Employee("GOGA", 70, "cleanMan");

Teacher teacher= new Teacher("Sova", 66,"master");

// AccountController contr=new AccountController();
AccountController.paySalary(worker, 1000);
AccountController.paySalary(teacher, 2000);
System.out.println("---------------------------------");
List<Teacher>listTeacher=new ArrayList<>();
List<Employee>listEmployee=new ArrayList<>();
listEmployee.add(worker2);
listEmployee.add(worker);
Teacher teacher2=new Teacher("Andrey",19,"Professor");
Teacher teacher3=new Teacher("mihail",59,"assistent");
Teacher teacher4=new Teacher("Egor",46,"fizkultur");
Teacher teacher5=new Teacher("Andrey",45,"Professor");
listTeacher.add(teacher);
listTeacher.add(teacher2);
listTeacher.add(teacher3);
listTeacher.add(teacher4);
listTeacher.add(teacher5);
TeacherService teacherServiceList=new TeacherService(listTeacher);
teacherServiceList.setTeacherList(listTeacher);
teacherServiceList.printSortTeacherList(); // сортировка и вывод списка учителей
System.out.println("Учителя ");
AccountController.avarageAge(listTeacher);
System.out.println("Студенты ");
AccountController.avarageAge(students);
System.out.println("Работники  ");
AccountController.avarageAge(listEmployee);








        

        
    }
}
