package services;

import java.util.List;

public interface iPersonSrevice<T> {
    public List<T> getAll();
    public void create(String name,int age);
}
