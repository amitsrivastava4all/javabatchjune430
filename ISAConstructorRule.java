class Q
{
	int x; // Instance Variable
Q(int x)  // Local Variable
{
	this.x = x;
System.out.println("Q Cons Call ");
}
void show(){
	System.out.println("Q Show");
}
}
class Q1 extends Q
{
	int x;
	@Override
	void show(){
		super.show();
		System.out.println("Q1 Show");
	}
Q1(int x)
{
	super(3);
	// parent x + child x + local x 
	int result= super.x + this.x + x;
	
//super();
System.out.println("Q1 Cons Call "+result);
}

}

public class ISAConstructorRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1 obj = new Q1(1);
		Q obj = new Q1(1); // Upcasting
		obj.show();
	}

}
