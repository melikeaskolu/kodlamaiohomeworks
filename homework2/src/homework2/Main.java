package homework2;

public class Main {

	public static void main(String[] args) {
Student student1 = new Student(1 ,"Melike", "AŞIKOĞLU", "melikeaskolu621@gmail.com", " ", "java kursu", "1", " ");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		studentManager.passwordStudent(student1);
		studentManager.courseStudent(student1);
		studentManager.deleteStudent(student1);

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("Ela");
		student2.setLastname("BULGAN");		
		student2.setEmail("elablgn11@gmail.com");
		student2.setPassword(" ");
		
		StudentManager studentManager1 = new StudentManager();
		studentManager.updateStudent(student2);
		
		System.out.println("-----------------");
		
		Instructor ınstructor1 = new Instructor();
		ınstructor1.setId(1);
		ınstructor1.setName("Engin");
	    ınstructor1.setLastname("DEMİROĞ");
	    ınstructor1.setEmail("engindmrog06@gmail.com");
	    ınstructor1.setPassword(" ");
	    
		Instructor ınstructor2 = new Instructor();
		ınstructor2.setId(2);
		ınstructor2.setName("ENGİN");
	    ınstructor2.setLastname("DEMİROĞ");
	    ınstructor2.setEmail("engindmrog06@gmail.com");
	    ınstructor2.setPassword(" ");
	    
	    
	    InstructorManager ınstructorManager = new InstructorManager();
	    ınstructorManager.addInstructor(ınstructor1);
	    ınstructorManager.passwordInstructor(ınstructor1);
	    ınstructorManager.deleteInstructor(ınstructor1);

	    
	    InstructorManager InstructorManager2 = new InstructorManager();
	    InstructorManager2.updateInstructor(ınstructor2);




	}

}
