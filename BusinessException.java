import java.util.Scanner;




class MinorAgeException extends Exception {
	private int age;
	MinorAgeException(int age){
		this.age = age;
	}
	public String toString(){
		return "U Enter "+age+" Ur Age is Less than 18";
	}
}
public class BusinessException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		try{
		if(age<18)
		{
			throw new MinorAgeException(age); 
			// to generate Exception Explicitly then raise exception
			// by using throw keyword
		}
		else
		{
			System.out.println("U Can Apply for DL and VoterId Card...");
		}
		}
		catch(MinorAgeException e){
			System.out.println(e);  //e.toString()
		}
	}

}
