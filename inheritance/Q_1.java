package inheritance;

// Q_1 Write a program to create a class known as person with methods called get-first-name and get-last-name . Create a sub class claaed employee thats adds a new method name get-employee-id and overrides the get last name method to include the employes jobs title
class Person{
	
	private String first_name;
	private String last_name;
	
	Person(String first_name, String last_name){
		
		
		this.first_name = first_name;
		this.last_name = last_name;
	}
	
	public String get_first_name() {
		return first_name;
	}
	
	public String get_last_name() {
		return last_name;
	}
}


class Employee extends Person{
	private String job_title;
	private int employee_id;
	
	Employee(String first_name,String last_name,String job_title, int employee_id){
		super(first_name,last_name);
		this.employee_id = employee_id;
		this.job_title = job_title;
	}
	
	public int employee_id() {
		return employee_id;
	}
	
	public String job_title() {
		return super.get_last_name() + " , " + job_title;
	}
}


public class Q_1 {
	public static void main(String[] args) {
		Person p = new Person("Pranjal", "Singh");
		
		System.out.println(p.get_first_name());
		System.out.println(p.get_last_name());
		
		Employee e = new Employee("Pranjal", "Singh", "Software Developer", 1234);
		
		System.out.println(e.get_first_name());
		System.out.println(e.get_last_name());
		System.out.println(e.employee_id());
	}
}
