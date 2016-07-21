import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.log4j.Logger;

class Simulation{
	// Apply Log4j in this class
	Logger logger = Logger.getLogger(Simulation.class);
	void dbLogic() throws ArithmeticException{
		logger.debug("Inside DB Method....");
		System.out.println("Take the Value from Business Logic");
		System.out.println("Open the DB Connection");
		try{
		System.out.println("Query to the DB");
		//try{
		int e  = 100/0;
		//}
//		catch(ArithmeticException e){
//			System.out.println("Some Problem Occured Can't Do DB things...");
//		}
		System.out.println("get the result from the DB");
		}
		finally{
		System.out.println("Close the DB Connection");
		}
		System.out.println("Send the result to Business Logic");
		logger.debug("End DB Method....");
	}
	void businessLogic() throws ArithmeticException{
		logger.debug("Inside business logic method");
		System.out.println("Take the values from view ");
		System.out.println("Validate the values");
		System.out.println("Call the DB Logic");
		this.dbLogic();
		System.out.println("Get the Result from db logic");
		System.out.println("Send the result to view");
		logger.debug("end business logic method");
	}
	void view(){
		logger.debug("Inside View Method");
		System.out.println("Login Page Display");
		System.out.println("Type The login details");
		System.out.println("Call the Logic");
		try{
		this.businessLogic();
		System.out.println("get the result from business logic");
		System.out.println("Print the result on view");
		logger.debug("End View Method");
		}
		catch(ArithmeticException e){
			
			System.out.println("Some Problem in DB Logic Try After Sometime");
			
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			logger.error(sw.toString());
		}
	}
}
public class ThrowEarlyAndCatchLater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulation simulation = new Simulation();
		simulation.view();
	}

}
