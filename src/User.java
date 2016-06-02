
/**
 *
 * @author Lincoln W Daniel
 */
public class User {
    public static int numUsers = 0;

    private int id;
    private String username;
    private boolean isOnline;
    /*other information about this user,
    perhaps a list of associated photos*/

    public User(String username) {
        id = numUsers++;
        this.username = username;
        this.isOnline = true;
        System.out.println(username + " signed up!");
    }

    public void logOn() { 
        isOnline = true; 
        printOnlineStatus();
    }

    public void logOff() { 
        isOnline = false; 
        printOnlineStatus();
    }

    private void printOnlineStatus() {
        System.out.println(username + " is online: " + isOnline);
    }
    //...
}
