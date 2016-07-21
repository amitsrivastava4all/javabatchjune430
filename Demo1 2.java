import java.util.InputMismatchException;
import java.util.Scanner;

//What is Exception?
// Abnormal Conditions , which terminate the Program Flow
public class Demo1 {
	static int firstNo = 0;
	static int secondNo = 0;
	static Scanner scanner = new Scanner(System.in);
	static void takeFirstNo(){
		
		System.out.println("Enter the First No");
		try{
		firstNo = scanner.nextInt();  //throw new InputMisMatchException()
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed And U Enter Something Else...");
			scanner.nextLine();
			takeFirstNo();
		}
	}
	
	static void takeSecondNo(){
		
		System.out.println("Enter the Second No");
		try{
		secondNo = scanner.nextInt();  //throw new InputMisMatchException()
		}
		catch(InputMismatchException e){
			System.out.println("Only Number Allowed And U Enter Something Else...");
			scanner.nextLine();
			takeSecondNo();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int firstNo = 0;
//		int secondNo =0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the First No");
//		try{
//		firstNo = scanner.nextInt();  //throw new InputMisMatchException()
//		}
//		catch(InputMismatchException e){
//			System.out.println("Only Number Allowed And U Enter Something Else...");
//			scanner.nextLine();
//			System.out.println("Enter the First No");
//			firstNo = scanner.nextInt();
//		}
//		System.out.println("Enter the Second No");
//		try{
//		secondNo = scanner.nextInt();
//		}
//		catch(InputMismatchException e){
//			System.out.println("Only Number Allowed And U Enter Something Else...");
//			scanner.nextLine();
//		}
		takeFirstNo();
		takeSecondNo();
		int result = firstNo + secondNo;
		System.out.println("Result is "+result);
		scanner.close();
		

	}

}
