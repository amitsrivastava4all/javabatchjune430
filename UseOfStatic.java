class Employee
{
	// Class Variables vs Instance Variables
	// Instance Variables comes when object is created
	private int id; // Instance Variables
	private String name;
	private static  int counter; // Class Variable
	static{
	System.out.println("I Will Call when Class is loaded..."+counter);
	// static block is used to initalized the static variables
	counter = 1000;
	}
	static{
		System.out.println("Another Static Block");
	}
	
	// Init Block
	{
		// Pre Constructor Call
		System.out.println("I Will Call Before Constructor Call ");
	}
	{
		System.out.println("Another Init");
	}
	// static things comes when class is loaded..
	// static is shared among all the objects
	Employee(int id , String name){
		this.id = id;  // Instance Variables Initialize
		this.name = name;
		counter++;
		System.out.println("I Will Call When Object is Created "+counter);
		//System.out.println("Cons Call and Counter Value is "+counter);
	}
	void print(){
		System.out.println("Id "+this.id);
		System.out.println("Name "+name);
	}
}
// Class Members Memory = Per Class
//  Instance Members Memory  = Per Object  
public class UseOfStatic {
	static void main2(){
		Employee ram = new Employee(1001,"Ram");
		ram.print();
		Employee shyam = new Employee(1002,"Shyam");
		shyam.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main2();
	}

}
