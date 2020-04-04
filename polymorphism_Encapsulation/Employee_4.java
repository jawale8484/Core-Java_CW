package polymorphism_Encapsulation;
//4.	Create one class Employee (emp_id, name, sal) with private access specifier 

//and create getter and setter.
//Print the data by creating objects of the class

public class Employee_4 {
	private int emp_id, sal;
	private String name;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee_4 [emp_id=" + emp_id + ", sal=" + sal + ", name=" + name + "]";
	}

	public static void main(String[] args) {
			Employee_4	 ob=new Employee_4();
			ob.setEmp_id(10);
			ob.setName("vaibhav");
			ob.setSal(25000);
			System.out.println(ob.toString());
	
					
			}
}
