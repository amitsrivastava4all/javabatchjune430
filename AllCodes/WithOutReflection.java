import java.util.Scanner;

public class WithOutReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("Enter the Choice");
		Scanner scanner= new Scanner(System.in);
		int choice = scanner.nextInt();
		Calculator calc = new Calculator(); // Calling class name is fixed and deteced on compile time
		if(choice == 1){
			//System.out.println("Add is "+calc.add(100, 200));
		}
		else
		if(choice == 2){
			System.out.println("subtract is "+calc.subtract(100, 200));
		}
		else
		if(choice == 3){
			System.out.println("multiply is "+calc.multiply(100, 200));
		}
		else
		if(choice == 4){
			System.out.println("divide is "+calc.divide(100, 200));
		}
	}

}
