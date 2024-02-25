package domen;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private int idStudentGroup;
    private List<Student> studentList;
    public StudentGroup(int idStudentGroup, List<Student> studentList) {
        this.idStudentGroup = idStudentGroup;
        this.studentList = studentList;
    }
    public int getIdStudentGroup() {
        return idStudentGroup;
    }
    public void setIdStudentGroup(int idStudentGroup) {
        this.idStudentGroup = idStudentGroup;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

/*
 * итератор  
 */
    @Override
    public Iterator<Student> iterator() {
        return new UserIterator(studentList);
    }
    /**
     * @apiNote метод сортировки по количеству людей в группе и по ID
     * @param o
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getStudentList().size()>o.getStudentList().size()) {
            return 1;
            
        }
        if (this.getStudentList().size()<o.getStudentList().size()) {
            return -1;
            
        }
        if (this.getIdStudentGroup()>o.getIdStudentGroup()) {
            return 1;
            
        }
        if (this.getIdStudentGroup()<o.getIdStudentGroup()) {
            return -1;
            
        }
        return 0;

    }
    @Override
    public String toString() {
        return "StudentGroup [idStudentGroup=" + idStudentGroup + ", studentList=" + studentList + "]";
    }
}
