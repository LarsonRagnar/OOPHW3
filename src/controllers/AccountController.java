package controllers;

import java.util.List;

import domen.Person;
import domen.WorkingPerson;

public class AccountController {
    public static <T extends WorkingPerson,V> void paySalary(T person,V salary) {
        System.out.println(person.getName()+ " выплаченная зарплата " + salary);
    }
    /**
     * @apiNote Метод определения среднего возраста из списка
     * @param <M> тип наследник класса Person
     * @param list лист с наследниками Person
     */
    public static <M extends Person>void avarageAge(List<M> list){
        double sumAvarageAge=0;
        for (M m : list) {
            sumAvarageAge=sumAvarageAge+m.getAge();
        }
        double avarageAge=sumAvarageAge / list.size();
        System.out.println("Средний возраст: " + avarageAge);
    }
    
}
