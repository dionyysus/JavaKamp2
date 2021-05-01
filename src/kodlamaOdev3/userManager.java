package kodlamaOdev3;

public class userManager {

	public void signUp(user user) {
		System.out.println(user.getName()+ " " + user.getLastName() + " enrolled.");
	}
	public void signIn(user user) {
		System.out.println(user.getName()+ " " + user.getLastName() + " logged in");
	}
	public void logOut(user user) {
		System.out.println(user.getName()+ " " + user.getLastName() + " logged out");
	}
	
}
