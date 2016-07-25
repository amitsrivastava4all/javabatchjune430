import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("/Users/amit/Documents/FileHandlingTesting/TumHiHo.mp3");
		BufferedInputStream bi =new BufferedInputStream(fi);
		FileOutputStream fo = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/TumHiHoCOPY.mp3");
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		long startTime = System.currentTimeMillis();
		int singleByte = bi.read();
		while(singleByte!=-1){
			bo.write(singleByte);
			singleByte = bi.read();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime));
		bi.close();
		fi.close();
		bo.close();
		fo.close();
		System.out.println("Copy Done...");

	}

}
