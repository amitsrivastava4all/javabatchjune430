
public class TestEmployee {

	public static void main(String[] args) {
		// Create Object for Ram (R.H.S) and assign it to ram reference(L.H.S)
		// It will Constructor to initialize the members
		//Employee ram = new Employee();
		Employee ram = new Employee(1001,"Ram",9999);
		System.out.println("Ram Old Salary is "+ram.getSalary());
		ram.setSalary(ram.getSalary()+6000);
		System.out.println("Ram New Salary is "+ram.getSalary());
		ram.setPhone("2222");
		//Employee ram = new Employee(1001,"Ram",8888); 
		//ram.empno = -1001;
		//ram.print();
		//ram.takeInput(1001, "Ram", 9090);
		//ram is a reference (address) variable
		// new Employee will create a new object in memory
//		System.out.println("Id "+ram.empno); 
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
		Employee shyam =new Employee(1002,"Shyam",5555);
		//shyam.print();
//		System.out.println("Id "+shyam.empno); 
//		System.out.println("Name "+shyam.name);
//		System.out.println("Salary "+shyam.salary);
		
	}

}
