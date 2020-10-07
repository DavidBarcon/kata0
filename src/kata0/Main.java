/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata0;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author david
 */
public class Main {
    
    public static void main(String[] args) {
        Person person;
        person = new Person("David Barcon", LocalDate.of(1998, Month.OCTOBER, 6));
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}
