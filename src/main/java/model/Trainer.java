package model;

import java.util.Date;

public class Trainer extends Person {

    private boolean isAuthorized;

    public Trainer(String firstName, String lastName, Date dateOfBirth) {
        super(firstName, lastName,dateOfBirth);
    }
}
