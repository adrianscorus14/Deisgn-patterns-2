package model;

import java.util.Date;

public class Student extends Person {
    private boolean hasPreviousJavaKnowledge;


    public Student(String firstName, String lastName, Date dateOfBirth) {
        super(firstName, lastName,dateOfBirth);
    }
}
