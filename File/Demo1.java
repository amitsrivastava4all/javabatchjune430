import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//c:\\abcd\\xyz
		//File file = new File("/Users/amit/Documents/FileOutput/Abcd.txt");
		File file = new File("/Users/amit/Documents/FileOutput/dd/ee/ff/rr");// It can take Path
		// and can do operations like create new file , delete file, rename file
		// scan folder, filter on folder
		if(file.exists()){
			System.out.println("Path Found....");
			//file.delete();
			//System.out.println("File Found and Deleted...");
		}
		else{
		file.mkdirs(); // to create Nested Directory
		//file.mkdir();  // create single directory
			//file.createNewFile();
		System.out.println("Dir Created...");
		//System.out.println("File Created...");
		}

	}

}
