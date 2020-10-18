package factorymethod;

public class Teacher implements Personal {
    private Integer id;

    public Teacher(Integer id){
        this.id=id;
    }
    @Override
    public void work() {
        System.out.println("Teacher Work");
    }
}
