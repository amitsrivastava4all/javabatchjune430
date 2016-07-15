
public class StringDemo1 {

	public static void main(String[] args) {
		// char a[] = {'H','e','l','l','o'};
		
		String a = "Hello";  // 1 Object
		String b = "Hello"; // 0 Object
		String c = new String("Hello"); // 2 or 1 Object
		if(a==c){
		//if(a==b){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}

	}

}
