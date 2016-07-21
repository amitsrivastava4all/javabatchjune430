import java.io.File;
import java.io.IOException;

public class HandleError {

	public static void main(String[] args) {
		
		int d[] = new int[10];
		d[100]=999; // throw new ArrayIndexOutOfBoundException();
		
		File file =
				new 
				File("/Users/amit11/Documents/FileHandlingTesting/download/test.txt");
			
		try {
			file.createNewFile();
			System.out.println("File Created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File Can't Create....");
			//e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
//		try{
//		main(null);
//		}
//		catch(Error e){
//			System.out.println("Error "+e);
//		}
//		System.out.println("Code....");

	}

}
