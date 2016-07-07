// It is acting as a Parent class and it is more generic class
// We need to restrict the object creation of Loan (Parent) Class
// Abstract Class May Have abstract methods 
// abstract methods say to child , child must override those methods
// if u have abstract methods , it is mandatory that class must be abstract
abstract class Loan
{
	void applyForLoan(){
		System.out.println("Apply For Loan");
	}
	abstract void duration();
	abstract void roi();
}
// abstract class can be use only through Inheritance
class HomeLoan extends Loan
{
	void duration(){
		System.out.println("Home Loan Duration Can Be Long");	
	}
	void roi(){
		System.out.println("10.5%");
	}
}
class PersonalLoan extends Loan
{
	void duration(){
		System.out.println("Personal Loan Duration is Less");
	}
	void roi(){
		System.out.println("ROI is 14%");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loan loan = new Loan();
		HomeLoan hl = new HomeLoan();
		hl.applyForLoan();
		hl.duration();
		hl.roi();
	}

}
