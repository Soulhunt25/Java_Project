package constructor;

class Student{
	String name;
	int id;
	void disp() {
		System.out.println("The name is " + name);
		System.out.println("The id is " + id);
	}
	
	Student(String name, int id){
		this.name = name;
		this.id = id; 
	}
}


public class Parameterized_cons {
	public static void main(String[] args) {
		Student s1 = new Student("Pranjal",134);
		Student s2 = new Student("Muskan",112);
		s1.disp();
		s2.disp();
	}
}
