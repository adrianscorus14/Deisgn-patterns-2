package singleton;

public class SessionData {
    private int state;
    private static SessionData instance=null;

    private SessionData(){

    }
    public void changeState(int newState){
        this.state=newState;
        System.out.println("New state is "+this.state);
    }

    public int getState(){
        return state;
    }
    public static SessionData getInstance(){
        if(instance==null){
            instance=new SessionData();
        }
        return instance;
    }
}
