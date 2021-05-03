package homework2;

public class Instructor extends User {
	private String InstructorCourse;
	private String InstructorId;
	private String InstructorPassword;	
	
	public Instructor () {
		
	}

	public Instructor(String instructorCourse, String instructorId, String instructorPassword) {
		super();
		InstructorCourse = instructorCourse;
		InstructorId = instructorId;
		InstructorPassword = instructorPassword;
	}

	public String getInstructorCourse() {
		return InstructorCourse;
	}

	public void setInstructorCourse(String instructorCourse) {
		InstructorCourse = instructorCourse;
	}

	public String getInstructorId() {
		return InstructorId;
	}

	public void setInstructorId(String instructorId) {
		InstructorId = instructorId;
	}

	public String getInstructorPassword() {
		return InstructorPassword;
	}

	public void setInstructorPassword(String instructorPassword) {
		InstructorPassword = instructorPassword;
	}



}
