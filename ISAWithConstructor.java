class Parent
{
	int x;
	Parent(){
		x = 100;
		System.out.println("Parent Class Default Constructor "+x);
	}
	Parent(int x){
		this();
		this.x = x;
		System.out.println("This is Parent Class Param Constructor Call "+this.x);
	}
}
class Child extends Parent
{
	int y;
	// CHILD Constructor it will call parent constructor by default 
	Child(){
		super(1111);
		//super(); // super constructor call must be the first statement
		y = x + 200;
		System.out.println("Child Class Default Constructor "+y);
	}
	Child(int y){
		this();
		//super();
		//super(999); // Now it is calling Parent Param
		this.y = y + x;
		System.out.println("Child Class Param Constructor Call "+this.y);
	}
}
public class ISAWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child child = new Child();
		Child child = new Child(1000);
	}

}
