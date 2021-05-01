package kodlamaOdev3;

public class studentManager extends userManager{
	
	public void joinCourse(student student, String[] courses) {
		System.out.println("Student named" + student.getName()+ " " + student.getLastName() + " enrolled in new course.");
		student.setChosenCourse(courses);
	}

	public void rollCall(student student) {
		System.out.println(student.getName()+ " "+ student.getLastName() + " if you are here, press countinue button!");
	}
	
	public void showInfos(student student) {
		System.out.println("Id: " + student.getId());
		System.out.println("Name: " + student.getName());
		System.out.println("Lastname: " + student.getLastName());
		System.out.println("Mail: " + student.getEmail());
	}

	@Override
	public void signIn(user user) {
		System.out.println("Student logged in the kodlama.io :)))");
	}
	
	
}
