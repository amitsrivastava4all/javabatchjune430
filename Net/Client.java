import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		final String SERVER_IP = "localhost";
		final int PORT_NO = 9001;
		Socket socket = new Socket(SERVER_IP,PORT_NO);
		System.out.println("Client Start....");
		InputStream is = socket.getInputStream();
		System.out.println("Message From Server ");
		int singleByte = is.read();
		while(singleByte!=-1){
			System.out.print((char)singleByte);
			singleByte = is.read();
		}
		is.close();
		socket.close();
	}

}
