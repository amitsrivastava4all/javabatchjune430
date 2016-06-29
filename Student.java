//OOPS + OOAD
// SOLID 
// S - SRP (single Resp Pr)
// D - DRY (Don't Repeat YourSelf)
// When ever code is repeated create a method for this
// Class is a collection of similar objects
// Class is a Noun 
// Class contains Characters or Features
public class Student {
  // these are instance variables 
	// these variables will come in memory
	// when object(instance) is created
	//private int rollno,marks;
	// Instance Variable must be define as private , so it access scope
	// is get limited , it can't be access outside the class
 private int rollno;
 private String name;
 private String courseName;
  private int marks;
  public void takeInput(int rollno, String name, String courseName, int marks){ 
	  //void takeInput(int r, String n, String c, int m){
	  // r, n , c, m all are local variables
	  // I am Assign a Local Variable Value into Instance Variable
	  if(rollno<=0){
		  System.out.println("Invalid Rollno "+rollno);
		  return ;
	  }
	  if(marks<=0){
		  System.out.println("Invalid Marks "+marks);
		  return;
	  }
	  this.rollno = rollno;
	  this.name = name;
	  this.courseName = courseName;
	  this.marks = marks;
	  //this keyword is optional to write, but it is get compulsory when
	  // instance variable and local variable is get same
  }
  void print(){
	  // this keyword
	  // It hold the current reference
	  System.out.println("Rollno is "+this.rollno);// 77.rollno
		System.out.println("Name is "+name);
		System.out.println("Course Name is "+courseName);
		System.out.println("Marks is "+this.marks);
		System.out.println("**********************************");
		
  }
  
}
