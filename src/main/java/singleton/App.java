package singleton;

public class App {
    public static void main(String [] args){
        SessionData sd=SessionData.getInstance();
        sd.changeState(2);

        SessionData anotherSD=SessionData.getInstance();

        System.out.println("Verify state"+anotherSD.getState() );
    }
}
