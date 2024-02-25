package domen;

import java.util.Iterator;
import java.util.List;
/**
 * @apiNote класс для потоков
 */

public class StudentSteam implements Iterable<StudentGroup>{
    private int idStudentSteam;
    private List<StudentGroup> studentSteamList;


 
    public StudentSteam(int idStudentSteam, List<StudentGroup> studentSteamList) {
        this.idStudentSteam = idStudentSteam;
        this.studentSteamList = studentSteamList;
    }

    public StudentSteam(int idStudentSteam) {
        this.idStudentSteam = idStudentSteam;
    }

    public int getIdStudentSteam() {
        return idStudentSteam;
    }

    public void setIdStudentSteam(int idStudentSteam) {
        this.idStudentSteam = idStudentSteam;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentGroupIterator(studentSteamList);
    }

    public List<StudentGroup> getStudentSteamList() {
        return studentSteamList;
    }

    public void setStudentSteamList(List<StudentGroup> studentSteamList) {
        this.studentSteamList = studentSteamList;
    }
/**
 * переопределение метода вывода на экран
 */
    @Override
    public String toString() {
       String temp="";
       for(StudentGroup studentGroup:studentSteamList){
        temp+=studentGroup+"\n";
       }
       return "\nidStudentSteam=" +idStudentSteam+ "\nstudentSteamList=" + studentSteamList.size() + "\n" +temp;
    }

    
}
