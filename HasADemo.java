class Customer{
	Order order ;  // Has -a Relationship
	Customer(Order order){
		System.out.println("Customer Born");
		this.order = order; 
		//order = new Order();
	}
	@Override
	protected void finalize(){
		System.out.println("Bye Bye Customer");
	}
}
class Order{
	Order(){
		System.out.println("Order Born");
	}
	@Override
	protected void finalize(){
		System.out.println("Bye Bye Order");
	}
}
public class HasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order =new Order();
		Customer customer = new Customer(order); // Has - A 
		customer = null; // Now it ready for GC.
		System.gc();  // Request to the GC
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
	}

}
