// class scope (default or public)
class Outer
{
	Outer(){
		System.out.println("Outer Class Cons");
	}
	void display(){
		System.out.println("OUter Class Disp");
	}
	class Inner // Class Member 
	{
		Inner(){
			System.out.println("Inner Class Cons");
		}
		void show(){
			System.out.println("Inner Show");
		}
	}
}
//private class W
//{
//	
//}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Outer outer = new Outer();
		//outer.display();
		//Outer.Inner obj= new Outer().new Inner();
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		inner.show();
		
	}

}
