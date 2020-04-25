package WrapperClasses;




public class Wrapper_4 {

	public static void main(String[] args) {
		Employee emp = new Employee("Ashish Kumar Mohanty");
		Employee cl = emp.clone();
		
		cl.setName("Donald Trump");
		
		System.out.println(cl.getName());
		System.out.println(emp.getName());
	}

}



class Employee implements Cloneable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
	} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

