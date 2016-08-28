import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int PORTNO = 9001; // Must Be >1024
		ServerSocket server = new ServerSocket(PORTNO);
		System.out.println("Server Start....");
		System.out.println("Waiting for the Client to Join...");
		Socket socket = server.accept();
		System.out.println("Welcome Client....");
		System.out.println("Enter the Message Send to the Client....");
		Scanner scanner= new Scanner(System.in);
		String message =scanner.nextLine();
		OutputStream os = socket.getOutputStream();
		os.write(message.getBytes());
		System.out.println("Message Send....");
		os.close();
		scanner.close();
		socket.close();
		
		
		

	}

}
