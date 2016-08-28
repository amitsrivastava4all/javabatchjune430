import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet.getHostName());
		System.out.println(inet.getHostAddress());
		System.out.println("Enter the Host Name");
		Scanner scanner = new Scanner(System.in);
		String hostName = scanner.next();
		InetAddress inetArray[] = InetAddress.getAllByName(hostName);
		for(InetAddress i : inetArray){
			System.out.println(i.getHostAddress());
		}

	}

}
