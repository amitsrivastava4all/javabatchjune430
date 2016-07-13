class A
{
	int x = 100;
	class B
	{
		int x = 200;
		B(int x){
			int z = A.this.x + this.x + x;
			System.out.println("z is "+z);
		}
	}
}
class X
{
	interface P
	{
		
	}
	class M implements P {
		
	}
	class Y extends M
	{
		class Z{
			class T{
				
			}
		}
	}
}
public class InnerClassThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.B obj = new A().new B(900);

	}

}
