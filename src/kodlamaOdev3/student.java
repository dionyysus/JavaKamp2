package kodlamaOdev3;

public class student extends user {

	private String[] chosenCourse;
	
	public student(int id, String name, String lastName, String email, String password) {
		super(id, name, lastName, email, password);
	}

	public String[] getChosenCourse() {
		return chosenCourse;
	}

	public void setChosenCourse(String[] chosenCourse) {
		this.chosenCourse = chosenCourse;
	}

	
	
	
	

}
