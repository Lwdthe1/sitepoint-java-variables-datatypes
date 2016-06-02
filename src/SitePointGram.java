
/**
 *
 * @author Lincoln W Daniel
 */
public class SitePointGram {
    public static void main(String[] args) {
		String appName = "SitePointGram";
		boolean appIsAlive = true;

		//debug a welcome message with the app's name so the user knows.
		System.out.print("Welcome to " + appName);
	
        /*declare a new variable of type User 
        and store a new User instance with the name of "Lincoln" in it*/
        User lincoln = new User("Lincoln");

        //log lincoln off
        lincoln.logOff();

        //debug out the number of users in our app
        System.out.println("Number of users: " + User.numUsers);
        //...
    }
}
