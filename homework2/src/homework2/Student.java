package homework2;

public class Student extends User{
	private String studentCourse;
	private String studentId;
	private String studentPassword;
	
	public Student() {
		
	}

	public Student(int id, String name, String lastname, String email, String password, String studentCourse, String studentId, String studentPassword) {
		super(id, name, lastname,email, password);
		this.studentCourse = studentCourse;
		this.studentId = studentId;
		this.studentPassword = studentPassword;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}


}
