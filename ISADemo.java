class Account
{
	void withDraw(){
		System.out.println("Account Class WithDraw....");
	}
	void deposit(){
		System.out.println("Account class Deposit....");
	}
	// method signature = return type + method name + arguments 
	void roi(){}
}
// Overriding = Must be Inheritance + Must be Same Signature as Parent
// Signature is same but logic is different
class SavingAccount extends Account
{
	@Override // Annotation
	void roi(){
	//void recroi(){
		System.out.println("Get ROI From Bank 4 %");
	}
}
class CurrentAccount extends Account
{
	void roi(){
	//void payRoi(){
		System.out.println("Pay ROI to Bank 6%");
	}
	void odLimit(){
		System.out.println("OverDraft Limit for Current Account");
	}
	void odCharges(){
	System.out.println("OverDraft Charges...");
	}
}
public class ISADemo {
	public void accountCaller(Account account){
		account.withDraw();
		account.deposit();
		account.roi();
		//type casting
		//long w = 1000;
		//int e = (int)w;
		// DownCasting
		if(account instanceof CurrentAccount){
		CurrentAccount ca = (CurrentAccount)account; //Downcast
		ca.odCharges();
		ca.odLimit();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code Reuse feature of Inheritance
		ISADemo obj = new ISADemo();
		obj.accountCaller(new SavingAccount());
		obj.accountCaller(new CurrentAccount());
		
		//Account account = new SavingAccount(); //Upcasting
//		Account account = new CurrentAccount();
//		account.withDraw();
//		account.deposit();
//		account.roi();
//		account.odLimit();
//		
//		SavingAccount sa = new SavingAccount();
//		sa.withDraw();
//		sa.deposit();
//		sa.roi();;
//		System.out.println("*********************************");
//		CurrentAccount ca =new CurrentAccount();
//		ca.withDraw();
//		ca.deposit();
//		ca.roi();
//		ca.odLimit();
//		ca.odCharges();
		

	}

}
