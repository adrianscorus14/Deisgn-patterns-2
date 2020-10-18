package proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements InternetInterface {

    private Internet internet;
    private List<String> bannedSites=new ArrayList<>();


    public InternetProxy(Internet internet){
        this.internet=internet;
        bannedSites.add("facebook.com");
    }

    @Override
    public void connectTo(String server) throws Exception {
        System.out.println("Proxy connect to "+server);

        if(bannedSites.contains(server)){
            throw new Exception("Acces denied for "+server);
        }
        internet.connectTo(server);

    }
}
