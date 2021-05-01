package kodlamaOdev3;

public class instructor extends user {
	
	private String[] courses;

	public instructor(int id, String name, String lastName, String email, String password) {
		super(id, name, lastName, email, password);
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	
	
	
	

}
