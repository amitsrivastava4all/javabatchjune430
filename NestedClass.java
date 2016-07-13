// Static Inner class is called Nested Class
 class P
{
	static class Q{
		static void print(){
			System.out.println("Q Print Call");
		}
	}
}
public class NestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P.Q.print();

	}

}
