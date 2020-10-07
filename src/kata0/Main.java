package kata0;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author david
 */
public class Main {
    
    public static void main(String[] args) {
        Person person;
        person = new Person("David Barcon", LocalDate.of(1998, Month.OCTOBER, 6));
        System.out.println(person.getName() + " " + person.getAge() + " años");
    }
    
}
