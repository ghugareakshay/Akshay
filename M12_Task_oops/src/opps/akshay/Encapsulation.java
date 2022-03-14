package opps.akshay;

public class Encapsulation {

	public static void main(String[] args) {
		System.out.println("Details of Student:");
		Student s = new Student(1,"Akshay","M12",23);
		System.out.println("Student ID:"+s.getsId());
		System.out.println("Student Name:"+s.getsName());
		System.out.println("Student Batch"+s.getBatch());
		System.out.println("Student Age:"+s.getAge());

	}

}
