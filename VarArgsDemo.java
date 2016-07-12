// Java 5 
public class VarArgsDemo {
	// int ...x , it is treated as Array
	static int add(int ...x){
		int sum = 0;
		for(int y : x){
			sum = sum + y;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add());
		System.out.println(add(10));
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));

	}

}
