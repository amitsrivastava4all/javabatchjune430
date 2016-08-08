import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		// Read Bytes from a File
		FileInputStream fi = new FileInputStream("/Users/amit/Documents/FileOutput/test/emp.dat");
		// Convert Bytes and Give Object
		ObjectInputStream oi = new ObjectInputStream(fi);
		Employee employee = (Employee)oi.readObject();  // Downcasting
		System.out.println(employee);
		oi.close();
		fi.close();

	}

}
