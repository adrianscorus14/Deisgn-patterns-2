package proxy;

public class App {
    public static void main(String[] args) {
        InternetInterface internet=new Internet();
        Internet server=new Internet();

        try {
            internet.connectTo("Facebook");
            internet.connectTo("Google");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
