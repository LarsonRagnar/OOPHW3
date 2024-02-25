package domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<StudentGroup> {
    private int count;
    private List<StudentGroup> studentSteamList;
    public StudentGroupIterator(List<StudentGroup> studentSteamList) {
        this.studentSteamList = studentSteamList;
    }
    @Override
    public boolean hasNext() {
        return count< studentSteamList.size();
    }
    @Override
    public StudentGroup next() {
        return studentSteamList.get(count++);
    }
}
