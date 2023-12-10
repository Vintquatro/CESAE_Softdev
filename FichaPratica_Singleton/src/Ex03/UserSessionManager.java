package Ex03;

import java.time.LocalDateTime;
import java.util.Random;

public class UserSessionManager {
    private int sessionToken;
    private String lastAcess;


    private static UserSessionManager instance;
    private UserSessionManager() {
        this.sessionToken = new Random().nextInt(0,100);
        this.lastAcess = String.valueOf(LocalDateTime.now());
    }

    public static UserSessionManager getInstance(){
        if (instance==null){
            instance = new UserSessionManager();

        }
        return instance;
    }


    public int getSessionToken() {
        return sessionToken;
    }

    public String getLastAcess() {
        return lastAcess;
    }
}

