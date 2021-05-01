package kodlamaOdev3;

public class instructorManager extends userManager {

	public void createdCourse(instructor instructor, String[] newCourse){
		System.out.println(instructor.getName() + " created a new course");
		instructor.setCourses(newCourse);
	}
	
	
	public void addHomeWork(instructor instructor) {
		System.out.println(instructor.getName() + " added new course");
	}
	
	public void showInfos(instructor instructor) {
		System.out.println("Id: " + instructor.getId());
		System.out.println("Name: " + instructor.getName());
		System.out.println("Lastname: " + instructor.getLastName());
		System.out.println("Mail: " + instructor.getEmail());
		System.out.println("All Courses: ");
		for(String course : instructor.getCourses()) {
			System.out.println(course + "");
		}
		
	}
	@Override
	public void logOut(user user) {
		System.out.println("Egitmen cikis yapti:((( come back...");

	}
	
	
	
}
