import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Step - 1 Specifiy the Path of a File  and then create a file
		FileOutputStream fs = new FileOutputStream("/Users/amit/Documents/FileOutput/Test123.txt");
		// Step -2 Write the content in a file
		fs.write("Hello this is the sample content of a file ".getBytes());
		// Step -3 Close the file
		fs.close();
		
	}

}
