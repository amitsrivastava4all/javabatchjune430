import java.util.Scanner;
import static java.lang.System.*;
// Utility Class  =private constructor + static methods + final class
// Utility Interfaces
interface MathOperations{
//final class MathOperations{
	//private MathOperations(){}
	static int add(int x, int y){
		return x + y;
	}
	static boolean isBlank(String value){
		if(value.length()==0){
			return true;
		}
		else
		{
			return false;
		}
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		//PrintStream p= new PrintStr
		//System.out.println("");
		//System s = new System();
		//s.out.println("");
		//Math m = new Math();
		// TODO Auto-generated method stub
		out.println("Enter the Userid");
		err.println("This is Error");
		Scanner scanner = new Scanner(in);
		String userName = scanner.nextLine();
		//MathOperations ms  = new MathOperations();
		//if(ms.isBlank(userName)){
		if(MathOperations.isBlank(userName)){
			System.out.println("UserName can't Be Blank");
		}
		int result = MathOperations.add(100, 200);
		System.out.println("Result is "+result);

	}

}
