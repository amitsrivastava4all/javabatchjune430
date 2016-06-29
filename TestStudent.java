
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =100;  // Value Variable
		// ram is a instance of Student
		// object = instance
		Student ram = new Student();
		//ram.rollno = -1001;
		//ram.marks=100000;
		ram.takeInput(1001, "Ram", "MCA", 90);
		ram.print();
//		System.out.println("Rollno is "+ram.rollno);// 77.rollno
//		System.out.println("Name is "+ram.name);
//		System.out.println("Course Name is "+ram.courseName);
//		System.out.println("Marks is "+ram.marks);
//		
//		ram.rollno = 1001;
//		ram.name="Ram";
//		ram.courseName="MCA";
//		ram.marks=90;
		
		Student shyam = new Student();
		shyam.takeInput(1002, "Shyam", "BCA", 80);
		shyam.print();
//		shyam.rollno = 1002;
//		shyam.name="Shyam";
//		shyam.courseName="BCA";
//		shyam.marks=80;
		
		
		
		
//		System.out.println("Rollno is "+ram.rollno);// 77.rollno
//		System.out.println("Name is "+ram.name);
//		System.out.println("Course Name is "+ram.courseName);
//		System.out.println("Marks is "+ram.marks);
//		
		
		
		// R.H.S Will create a new Object 
		//and give the reference (address) to ram in L.H.S
		// ram is a reference variable
		// new is a keyword, 
		//and it is used to allocate memory during runtime

	}

}
