package proxy;

public class Internet implements InternetInterface {

    @Override
    public void connectTo(String server) {
        System.out.println("Connecting to "+server);

    }
}
