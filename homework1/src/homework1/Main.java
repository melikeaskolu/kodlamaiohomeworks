package homework1;

public class Main {
	

	public static void main(String[] args) {
		Course course1 =new Course();
		course1.id=1;
		course1.name="Yazýlým geliþtirici yetiþtirme kampý C#, Angular";
		course1.unitPrice=0;
		course1.teacherAdi="Engin DEMÝROÐ";
		
		Course course2 =new Course();
		course2.id=2;
		course2.name="Yazýlým geliþtirici yetiþtirme kampý Java, React";
		course2.unitPrice=0;
		course2.teacherAdi="Engin DEMÝROÐ";
		
		Course course3 =new Course();
		course3.id=3;
		course3.name="Programlamaya giriþ için temel kurs";
		course3.unitPrice=0;
		course3.teacherAdi="Engin DEMÝROÐ";
			
			Course[] courses= {course1, course2, course3};
			for (Course course : courses) {
				
				System.out.println(course.name);
			}
			
			System.out.println(courses.length);
			CourseManager courseManager= new CourseManager();
			courseManager.addCourse(course1);
			courseManager.addCourse(course2);
			courseManager.addCourse(course3);

			


	}

}
