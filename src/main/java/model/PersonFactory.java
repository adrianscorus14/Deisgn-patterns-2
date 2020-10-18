package model;

import factorymethod.Teacher;

import java.util.Date;
import java.util.Random;

public class PersonFactory {

    static String[] names=new String[]{" Mocanu"," George"," Stefan","  Andreea","Alin","Mocanu","Tudor","Matei"};

    public static Person createPerson(PersonInterface.PersonType type){
        String randomFirstName = names[(int)(Math.random() * names.length)];
        String randomLastName = names[(int)(Math.random() * names.length)];

        switch (type){
            case STUDENT:
                System.out.println("S-a creat un student");

                return new Student(randomFirstName,randomLastName,new Date());
            case TRAINER:
                System.out.println("s-a creat un trainer");

                return new Trainer(randomFirstName,randomLastName,new Date());

            default:
                return null;

        }



    }










}
