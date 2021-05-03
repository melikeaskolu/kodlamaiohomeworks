package homework2;

public class InstructorManager {
	public void addInstructor(Instructor ýnstructor) {
		System.out.println("Eðitmen kaydedildi: "+ýnstructor.getName()+" "+ýnstructor.getLastname());
	}
	public void deleteInstructor(Instructor ýnstructor) {
		System.out.println("Eðitmen kaydý silindi.");
	}
	public void updateInstructor(Instructor ýnstructor) {
		System.out.println("Eðitmen kaydý güncellendi: "+ýnstructor.getName()+" "+ýnstructor.getLastname());
	}
	public void passwordInstructor(Instructor ýnstructor) {
		System.out.println("Eðitmen þifresi kaydedildi "+ýnstructor.getPassword());
	}



}
