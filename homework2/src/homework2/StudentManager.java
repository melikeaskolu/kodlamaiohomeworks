package homework2;

public class StudentManager {
	public void addStudent(Student student) {
		System.out.println("Öğrenci kaydedildi: "+student.getName()+" "+student.getLastname());
	}
	public void deleteStudent(Student student) {
		System.out.println("Öğrenci kaydı silindi.");
	}
	public void updateStudent(Student student) {
		System.out.println("Öğrenci kaydı güncellendi:"+student.getName()+" "+student.getLastname());
	}
	public void passwordStudent(Student student) {
		System.out.println("Öğrenci şifresi kaydedildi "+student.getPassword());
	}
	public void courseStudent(Student student) {
		System.out.println("kaydolduğunuz kurs: " +student.getStudentCourse());
	}


}
