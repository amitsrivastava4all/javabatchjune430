// class is like category
// Class = private Instance Variables (Now Data is Secure)
// public methods , so any one can access it
// Gud Class = Constructor for Initialize + private Instance Variable + public methods
// Class is an Example of Encapsulation
// Gud Encapsulation = private Instance Var + public methods
public class Employee {
	// Primary fields (empno, name,salary)
	
private int empno; // features  
private String name;  // Member of this class
private double salary;  // Instance Variable
private String companyName;
private String email;  // Secondary
private String phone;
private String deptName;
private String managerName;



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

public String getCompanyName() {
	return companyName;
}

public void setCompanyName(String companyName) {
	this.companyName = companyName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public String getManagerName() {
	return managerName;
}

public void setManagerName(String managerName) {
	this.managerName = managerName;
}


public int getEmpno() {
	return empno;
}

// Constructor name is same as class name
// Constructor Never Return any value
// Every Class Has default (With out parameter ) constructor by default
Employee(){
	companyName= "TCS";
	//empno = 1001;
	//name = "Ram";
	//salary = 9999;
}

// Parameterized Constructor
Employee(int empno, String name, double salary){
	this();
	// It is Constructor Chaining
	// When We are doing constructor to Constructor Call
	// so Constructor call must be the first line
	//this();// Here it is calling default constructor of it own class
	//Employee();
	if(empno<=0){
		System.out.println("Empno Can't Be Negative or Zero ");
		System.exit(0);
	}
	this.empno = empno * companyName.length();
	this.name = name;
	this.salary = salary;
	
}
//Constructor
// It is used to initialize the instance variables
// It is call when object is created

// If Local Variable is same as Instance Variable name
// It always give a chance to local variable
//public void takeInput(int empno, String name, double salary){
//	// Local Variable value is get Initalize to Instance Variable
//	this.empno = empno;
//	this.name = name;
//	this.salary = salary;
//}

//public void print(){
//	System.out.println("Id "+this.empno);
//	System.out.println("Name "+name);
//	System.out.println("Salary "+salary);
//	System.out.println("Company Name "+companyName );
//}
}
