import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ConnectServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/downloadlocation";
		
		System.out.println("Enter the URL to Connect....");
		
		String urlValue = new Scanner(System.in).next();
		String fileName = urlValue.substring(urlValue.lastIndexOf("/"));
		System.out.println("URL VALUE is "+urlValue);
		System.out.println("FileName is "+fileName);
		System.out.println("Path is "+path);
		System.out.println("Full Path "+path+fileName);
		FileOutputStream fs = new FileOutputStream(path+fileName);
		URL url =new URL(urlValue);
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		int singleByte = is.read();
		while(singleByte!=-1){
			fs.write(singleByte);
			System.out.print((char)singleByte);
			singleByte = is.read();
		}
		fs.close();
		is.close();
		

	}

}
