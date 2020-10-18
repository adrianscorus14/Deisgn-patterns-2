import factorymethod.Personal;
import factorymethod.PersonalFactory;
import model.*;
import logging.*;
import model.*;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Logger log=Logger.getInstance();
        log.logThis("Start");

        List<Person> listaStudenti=new ArrayList<>();

        for(int index=0;index<15;index++){

            listaStudenti.add(PersonFactory.createPerson(PersonInterface.PersonType.STUDENT));

        }

        List<Person>listaTraineri=new ArrayList<>();
        for(int index=0;index<3;index++){
            listaTraineri.add(PersonFactory.createPerson(PersonInterface.PersonType.TRAINER));
        }

//        Group group1=new Group();
//        Group group2=new Group();
//        Group group3=new Group();
//        Group group4=new Group();

        List<Group> listaGrupuri=new ArrayList<>();
        for(int index=0;index<3;index++){
            listaGrupuri.add(new Group());
        }











    }
}
