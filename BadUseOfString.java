import java.util.Scanner;

public class BadUseOfString {

	public static void main(String[] args) {
		// Dynamic Search Build (Dynamic SQL)
		//select * from product where producttype='mobile' and price>=20000
		// and screensize=5 and os='android'
		String sql ="select * from product";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Product Type to Search");
		String productType = scanner.next();
		sql = sql + " where producttype='"+productType+"'";
		System.out.println("Enter the Price Range");
		double price = scanner.nextDouble();
		sql = sql + " and price>="+price;

	}

}
