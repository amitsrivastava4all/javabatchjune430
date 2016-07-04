import java.util.ArrayList;

class Customer{
	private int id;
	private String name;
	Customer(int id , String name){
		this.id = id;
		this.name = name;
	}
}

public class MemoryManagementDemo {

	public static void main(String[] args) throws Exception {
		//Customer x = new Customer(11,"X");
		//Customer y = new Customer(12,"Y");
		//x = y;
		ArrayList l =new ArrayList();
		System.out.println("Program Start");
		// TODO Auto-generated method stub
		while(true){
			Customer ram = new Customer(1001,"Ram"); // Object Create
			l.add(ram);
			//Thread.sleep(100);
			//ram = null;
			// ram is a local variable
		}

	}

}
