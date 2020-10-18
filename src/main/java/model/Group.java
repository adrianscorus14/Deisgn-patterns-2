package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Trainer trainer;
    private List<Student> students;

    public void setName(String name) {
        this.name = name;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void addStudents(List<Student> students) {

        for(int index=0;index<2/3*students.size();index++){
            this.students.add(students.get(index));

        }

    }
}
