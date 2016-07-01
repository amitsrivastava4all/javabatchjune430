class N //extends Object
{
	
}
class H //extends Object
{
	
}
class H1 extends H
{
	
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		H1 obj = new H1();
		if(obj instanceof H1){
			System.out.println("Obj is a Instance of H1");
		}
		if(obj instanceof H){
			System.out.println("obj is also instance of H");
		}
		if(obj instanceof Object){
			System.out.println("obj is also instanceof Object");
		}
//		if(obj instanceof N){
//			System.out.println("obj is instance of N");
//		}

	}

}
