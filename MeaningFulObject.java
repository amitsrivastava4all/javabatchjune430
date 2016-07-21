class Customer{
	private int id;
	private String name;
	Customer(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
}
public class MeaningFulObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("Hello");
		System.out.println(a);
		System.out.println(a.toString());
		Customer ram = new Customer(1001,"Ram");
		System.out.println(ram); // 
		// when we print any object , it will call object.toString()
		// toString () will come from the Object class
		// And Object class toString always give classname@hashcode in 
		// HexaDecimal Form
		System.out.println(ram.toString());
		System.out.println(ram.hashCode());
	}

}
