
public class MutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// No method is synchronized 
		//StringBuilder sb = new StringBuilder();  // Java 5 (2006-07)
		// All methods r synchronized
		StringBuffer sb =new StringBuffer(1000); // Legacy Class
		//StringBuffer sb= new StringBuffer("amit");
		System.out.println("Length is "+sb.length());
		System.out.println("Capacity is "+sb.capacity());
		sb.ensureCapacity(2000);
		sb.append("srivastava abcd xyz dfghdfghdjfhgjdfgjdfgdhgkjdgkjdfkhgj") ; // Add at End
		sb.ensureCapacity(100);
		System.out.println("Length is "+sb.length());
		System.out.println("Capacity is "+sb.capacity());
		
		// New Capacity = old Capacity * 2 + 2
		

	}

}
