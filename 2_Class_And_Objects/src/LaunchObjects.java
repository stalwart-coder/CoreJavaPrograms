class Student{
	//has part
	String name;
	int age;
	String course;
	//does part
	void play() {
		System.out.println("i play");
	}
	void study() {
		System.out.println("i study");
	}
}
public class LaunchObjects {
	//driving code -> automatically called by jvm
	public static void main(String[] args) {
		// object of Student class
		Student std1=new Student();
		Student std2=new Student();
		std1.name="bipin";
		std2.name="bipin";
		

	}

}
