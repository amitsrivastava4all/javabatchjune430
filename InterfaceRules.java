import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

interface XInterface
{
	void print();
	int X= 10; //public static final int X =10;
}
interface YInterface{
	void show();
	void print();
	int X = 20;
}

interface ZInterface extends XInterface, YInterface{
	void output();
}
class MyClass implements ZInterface{

	@Override
	public void print() {
		int sum = XInterface.X + YInterface.X;
		System.out.println("Sum is "+sum);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}
	
}

class T
{
	
}
class T2 extends T implements XInterface,YInterface {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.print();
		WindowListener l ;
		// Adapter is a Design Pattern 
		WindowAdapter w;

	}

}
