import java.util.Scanner;
// constant in class
// 2nd use of final (use with class , to make the class as final)
//final class FinalExample
class FinalExample
{
//final double PI = 3.14;
final double PI;
	FinalExample(){
	PI = 3.14;
}
	void show(){
		System.out.println("Parent Class Show");
	}
	final void print(){
		System.out.println("Parent Class Print");
	}
}
class Child2 extends FinalExample{
	@Override
	void show(){
		System.out.println("Overide Parent Class Show");
	}
//	void print(){
//		
//	}
}
public class UseOfFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st Use of final  (to define constants)
		//final int MIN_AGE = 18; // Local Constant
		final int MIN_AGE=18 ;
		System.out.println("Enter the Age");
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		if(age>=MIN_AGE){
			System.out.println("U Can Vote");
		}
		//MIN_AGE++;
		//MIN_AGE = 17;
		

	}

}
