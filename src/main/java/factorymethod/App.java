package factorymethod;

import java.util.Random;

public class App {
    public static void main(String[] args) {
//        Integer id=new Random().nextInt();
//
//        Personal student=new Student(id);
//
//        Integer id1=new Random().nextInt();
//        Personal student1=new Student(id1);
//
//        Integer id2=new Random().nextInt();
//        Personal teacher1=new Teacher(id2);

        Personal student=PersonalFactory.createPersonal(Personal.PersonalType.STUDENT);
        Personal teacher=PersonalFactory.createPersonal(Personal.PersonalType.TEACHER);


    }
}
