package inheritance;

class employee extends Member_2 {
	String specialation;

	employee(String name, int age, long mono, String ad, float salary) {
		this.name = name;
		this.age = age;
		this.mono = mono;
		this.address = ad;
		this.salary = salary;

	}

}

class manager extends Member_2 {
	String department;

	manager(String name, int age, long no, String ad, float salary) {
		this.name = name;
		this.age = age;
		this.mono = no;
		this.address = ad;
		this.salary = salary;

	}

}

class Member_2 {
	String name;
	int age;
	long mono;
	String address;
	float salary;

	void printsalary() {
System.out.println(salary);
	}

	public static void main(String[] args) {
		
	employee emp=new employee("Vaibhav", 22, 8484907403L, "Pune", 9000000f);
	manager ob=new manager("nnn", 22, 1234468468464L, "Pune", 2000000f);
	ob.printsalary();
	emp.printsalary();
	}

}
