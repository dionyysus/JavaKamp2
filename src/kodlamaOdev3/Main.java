package kodlamaOdev3;

public class Main {

	public static void main(String[] args) {
		
		
	    
		student student = new student(1, "Gizem", "Coskun", "gizemcsk1@gmail.com","1234567890");
		instructor instructor = new instructor(1,"Engin","Demiroğ","engindemirog@gmail.com","123456");

		userManager userManager = new userManager();
		instructorManager instructorManager = new instructorManager();
	    studentManager studentManager = new studentManager();
	    
	    System.out.print("\n\n***Users***\n");
	    userManager.signIn(student);
	    userManager.signIn(instructor);
	    
	    System.out.print("\n\n***Instructors***\n");
	    instructorManager.createdCourse(instructor,new String[]{"C# Programlama","Java Programlama"});	    
	    instructorManager.addHomeWork(instructor);
	    instructorManager.showInfos(instructor);
        
	    System.out.print("\n\n***Students***\n");
	    studentManager.rollCall(student);
	    studentManager.joinCourse(student, new String[]{"Java Programlama"});
	    studentManager.showInfos(student);

	    System.out.println("\n");
	    
	    userManager.logOut(student);
	    instructorManager.logOut(instructor);
	}

}
