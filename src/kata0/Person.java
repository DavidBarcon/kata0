/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata0;

import java.time.LocalDate;

/**
 *
 * @author david
 */
public class Person {
    private final String name;
    private final LocalDate birthdate;

    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", birthdate=" + birthdate + '}';
    }
    
    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthdate.toEpochDay());
    }

    private int toYears(long l) {
        return (int)l/365;
    }


    
    
}
