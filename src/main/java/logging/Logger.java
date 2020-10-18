package logging;

import singleton.SessionData;

public class Logger {

    private static Logger instance=null;

    private Logger(){

    }
    public void logThis(String mesaj){
        System.out.println(mesaj);
    }
    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }

}
