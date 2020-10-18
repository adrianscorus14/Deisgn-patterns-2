package factorymethod;

public class Student implements Personal {
    private Integer id;

    public Student(Integer id){
        this.id=id;
    }


    @Override
    public void work() {
        System.out.println("Student work");
    }
}
