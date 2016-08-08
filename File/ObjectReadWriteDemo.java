import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// Serializable is a Marker Interface
// IS -A and Has-A 
class Dept implements Serializable
{
	int deptNo = 10;
	String name = "IT";
	public String toString(){
		return "Deptno "+deptNo+" Name "+name;
	}
}
// Case - 1 When Parent is Serializable
class Person //implements Serializable
{
	int age ;
	Person(){
		System.out.println("Person Class Default Cons is "+age);
	}
}
// Case- 2 When Child is Serializable , and Parent is Not
class Employee extends Person implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Dept dept = new Dept();
	private int id;
	private String name;
	private double salary;
	private transient String password ;
	private double bonus;
	private double pf;
	Employee(int id , String name, double salary){
		System.out.println("Constructor Call....");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.password="user"+id;
		this.bonus =  this.salary /2;
		this.pf = 9999;
	}
	@Override
	public String toString(){
		return "id "+id +" Name "+name + " Salary "+salary+" Password "+password+" Bonus "+bonus+" Pf "+pf+dept+" age "+age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
public class ObjectReadWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Object create in Heap
		Employee ram = new Employee(1001,"Ram",9999);
		ram.age=21;
		ram.setSalary(ram.getSalary()+1000);
		// this is used to write Bytes in a file
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/FileOutput/test/emp.dat");
		// Convert Object into Bytes
		ObjectOutputStream os = new ObjectOutputStream(fo);
		// Attach FileOutputStream with ObjectOutputStream
		os.writeObject(ram);  // Here we Write Object into File
		os.close();
		fo.close();
		System.out.println("Data Saved....");
	}

}
