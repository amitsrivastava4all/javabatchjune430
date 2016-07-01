class X
{
	int a,b;
	// default constructor
	// Instance Variables get Initialized in Constructor
	X(){
		//this(90,33);
		System.out.println("This is X Class Default Constructor");
		a = 100;
		b= 200;
	}
	// Parameterized Constructor
	X(int a,int b){
		// constructor chaining
		// this() (Constructor Call) must be the first line in Constructor
		this(); // Call the Same class default constructor
		System.out.println("Now Calling Parameterized Constructor");
		this.a = a;
		this.b = b;
	}
	void print(){
		System.out.println("A is "+a+" and b is "+b);
	}
}
public class ConstructorRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj = new X(999,222);
		//X obj = new X();
		//X obj = new X(1000,2000);
		//X obj =new X();  // X() is Default Constructor call
		// Every Class has by default a default constructor
		obj.print();
		// WHEN u create any constructor default will kill 
	}

}
