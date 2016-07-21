
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		System.out.println("Length is "+sb.length());
		System.out.println("Capacity "+sb.capacity());
		sb.append(20);
		System.out.println(sb);
		sb.insert(0, "Hi");
		System.out.println("After Insert "+sb);
		//sb.deleteCharAt(0);
		sb.delete(2, 5);  // index (0) , position (1)
		System.out.println("After Delete "+sb);
		StringBuffer a = new StringBuffer("nitin");
		StringBuffer b = new StringBuffer("nitin");
		a.reverse();
		System.out.println("a is "+a+" and b is "+b);
		if(a.toString().equals(b.toString())){
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		

	}

}
