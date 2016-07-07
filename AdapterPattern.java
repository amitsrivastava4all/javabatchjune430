interface P1
{
	void print();
	void show();
	void add();
	void subtract();
}
 abstract class P2 implements P1{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		
	}
	
}
 class Y2 extends P2{
	 public void subtract(){
		 System.out.println("Y2 Subtract Logic");
	 }
 }
 class Y1 extends P2{
	 public void add(){
		 System.out.println("Y1 Add Logic");
	 }
 }
public class AdapterPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
