import java.util.ResourceBundle;

// X is a class which is call by Y and other classes.
// I will treat these classes are some external modules
// And X can have some friend classes
class IamFriendOfX
{
	// Friend can access show and print
}
// I Produce the Objects
class XFactory {
	public static YLayer getObject(){
		//YLayer obj = new EnhanceX();
		
		// To Read Property File Use ResourceBundle class
		ResourceBundle rb = ResourceBundle.getBundle("object");
		String className= rb.getString("classname");
		YLayer obj=null;
		try {
			obj = (YLayer)Class.forName(className).newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
class EnhanceX implements YLayer
{
	@Override
	public void show(){
		this.calculate(90, 10);
		System.out.println("Faster X Show");
	}
	void print(){
		System.out.println("Faster X Print");
	}
	void calculate(int x,int y){
		System.out.println("Faster X Calculate");
	}
}
class X implements YLayer
{
	@Override
	public void show(){
		this.calculate(90, 10);
		System.out.println("X Show");
	}
	void print(){
		System.out.println("X Print");
	}
	void calculate(int x,int y){
		System.out.println("X Calculate");
	}
}
interface YLayer
{
	void show();
}

class Y3
{
	void mymethod3(){
		//X obj =new X();
		YLayer obj = XFactory.getObject();
		obj.show();
		//YLayer obj = new X(); // Upcasting
		//obj.show();
		//obj.calculate();
		//obj.print();
	}
	// It can access only show
}

class Y2
{
	void mymethod2(){
		//X obj =new X();
		//YLayer obj = new X(); // Upcasting
		//obj.show();
		YLayer obj = XFactory.getObject();
		obj.show();
		
		//obj.calculate();
		//obj.print();
	}
	// It can access only show
}

class Y
{
	void mymethod(){
		//X obj =new X();
		//YLayer obj = new X(); // Upcasting
		YLayer obj = XFactory.getObject();
		obj.show();
		//obj.calculate();
		//obj.print();
	}
	// It can access only show
}
public class LooslyCoupledDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Y obj = new Y();
		obj.mymethod();

	}

}
