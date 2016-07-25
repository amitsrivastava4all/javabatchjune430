import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Step - 1 Open a File
		FileInputStream fo =new FileInputStream("/Users/amit/Documents/JavaCodes/JavaBatch430/FileHandlingDemo/src/FileReadDemo.java");
		// Step - 2 read a File
		int singleByte = fo.read();
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte = fo.read();
		}
		// Step - 3 close a file
		fo.close();

	}

}
