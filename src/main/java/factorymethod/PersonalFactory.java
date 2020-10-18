package factorymethod;

import java.util.Random;

public class PersonalFactory {

    public static  Personal createPersonal(Personal.PersonalType type){
        Integer id=new Random().nextInt();
        switch (type){
            case STUDENT:

                return new Student(id);
            case TEACHER:

                return new Teacher(id);
            default:
                return null;

        }

    }
}
