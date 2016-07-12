import java.util.LinkedList;

// 1. Wideing (Primitive Data Type) always Win
// 2. Wrapper Win Second (It Must be of Same Type)
// 3. Var Args Win Third
class P
{
	void print(int x){
		System.out.println("int call");
	}
	public void print(Integer x){
		System.out.println("Integer Call");
		
	}
	void print(int ...x){
		System.out.println("Var Args Call ...");
	}
	void print(long x){
		System.out.println("long call");
	}
	protected void print(byte x){
		System.out.println("byte call");
	}
	void print(double x){
		System.out.println("double call");
	}
}
public class TypePromotionRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj = new P();
		obj.print(100);
		// Wrapper Class
		int x = 1000;
		Integer w = 1000; // AutoBoxing (Java 5)
		// Convert Primitive into Object and vice-versa
		LinkedList l = new LinkedList();
		Integer y = new Integer(1000);
		l.add(y);  
		l.add(x); // l.add(new Integer(1000));
		

	}

}
