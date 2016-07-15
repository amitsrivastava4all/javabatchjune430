import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello".intern();
		String b = "Hello".intern(); // Check String is in pool or not
		String c = new String("Hello");
		String d = "HELLO";
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		char w = a.charAt(0);
		System.out.println(w);
		int index = a.indexOf("l");
		int lastindex = a.lastIndexOf("l");
		System.out.println("Index is "+index+" last index of "+lastindex);
		System.out.println("SubString is "+a.substring(1));
		// index - 0 , position - 1 
		System.out.println("subString overloaded "+a.substring(1, 3));
		String name = "Mr Ram Kumar Sharma";
		System.out.println("MR "+name.startsWith("Mr"));
		System.out.println("Sharma "+name.endsWith("Sharma"));
		String username = "         amit   123            ";
		System.out.println("Before Trim ["+username+"]");
		System.out.println("After Trim ["+username.trim()+"]");
		String address = "A-21 , Shakti Nagar, Delhi-7";
		String array [] = address.split(",");
		System.out.println("After Split ");
		for(String obj : array){
			System.out.println(obj);
		}
		// == vs equals
		if(a.equalsIgnoreCase(d)){
		//if(a.equals(c)){
			System.out.println("String values are same");
		}
		else
		{
			System.out.println("String values are not Same");
		}
		// a.toLowerCase()
		if(a==c){
		//if(a==a.toUpperCase()){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		
		String e = "hello";
		byte b1 [] = e.getBytes();
		System.out.println(b1.length);
		char chararray [] = e.toCharArray();
		Arrays.sort(chararray);
		String t = new String(chararray);
		System.out.println("Now Sorted String is "+t);
		

	}

}
