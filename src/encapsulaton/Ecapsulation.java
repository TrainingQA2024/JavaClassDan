package encapsulaton;

public class Ecapsulation {
	
	/*
	  capsule -> multiple salt+combine = capsule-4
	  
	  private variable, private method-process-output, public output-return

	 Feature
	 Data Hiding
	 Control - getter - read only, setter - write only - read and write
	 Reusable and flexible
	 * */
	
	public static void main(String[] args) {
		Employee emp= new Employee("Abdul",5000);//5000+2000
		emp.setSalary(5000);//MANAGER
		emp.getSalary();
		String name= emp.getName();
		System.out.println("Get name is "+name);		
	}
}

class Employee{
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;		
	}
	
	private void incentive() {
		if(salary>5000) {
			salary=salary+2000;
		}else {
			salary=salary+3000;
		}
		System.out.println(name+": "+salary);
	}
	//setter
	public void setSalary(int allownce) {
		salary = salary+allownce;
	}
	
	//getter
	public void getSalary() {
		incentive();
	}
	//getter
	public String getName() {
		return name;
	}
}
