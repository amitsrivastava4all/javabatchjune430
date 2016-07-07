//SAM (Single Abstract Method) Interface
@FunctionalInterface
interface Calculator
{
	public int calculate(int x,int y);
	
}

//1st Way Of Using Interface
// Step -1 Create class and implement the interface
class Calc implements Calculator{
	// Step -2 Override the Method
	@Override
	public int calculate(int x, int y){
		return x + y;
	}
}

//class Calc2 implements Calculator{
//	@Override
//	public int calculate(int x, int y){
//		return x - y;
//	}
//}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step -3 
		// Create Object of the Class and Do Upcasting 
		//Calculator obj = new Calc();  // Upcasting
		// Step - 4 Call the Method
		//System.out.println("1st Way Result is "+obj.calculate(100, 200));

		//****************** 2nd Way to Use Interface ****************
		//  Step -1 (R.H.S) Create Anonymous class and implement the interface
		// new Object Create and Upcasting
		if(10>2){
//		Calculator obj = new Calculator(){
//			// Step - 2 Override the Method
//			public int calculate(int x, int y){
//				return x - y;
//			}
//		};
//		System.out.println("Calling Anonymous Style "+obj.calculate(100, 20));
//		
//		Calculator obj2 = new Calculator(){
//			// Step - 2 Override the Method
//			public int calculate(int x, int y){
//				return x * y;
//			}
//		};
//		
		// *************** 3rd Way *****************
		// NO New Byte Code Class File Generated
		// And this is Very Short Way 
		// This is Very New Way (Java 8)
		// Lambda Expression
		Calculator obj3 = (x,y)->x*y;
		Calculator obj4 = (x,y)->x-y;
		Calculator obj5 = (x,y)->x+y;
		Calculator obj6 = (x,y)->x/y;
		Calculator obj7 = (x,y)->{
			System.out.println("Logic....");
			return x*y;
		};
		System.out.println("Lambda Style "+obj3.calculate(90, 2));
		
		}
		}

}
