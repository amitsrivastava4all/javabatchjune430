interface A{  // abstract interface A
	void print(); // public abstract void print();
	// From Java 8 Onwards default is a new keyword
	// by using default u can define method body in interface
	default void show(){
		System.out.println("A Show Call");
	}
}
interface B {
	default void show(){
		System.out.println("B Show Call");
	}
}
interface C extends A,B{
	@Override
	public default void show(){
		A.super.show();
		B.super.show();
	}
}
class D implements C
{
	@Override
	public void print(){
		System.out.println("D Print Call");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj = new D();
		obj.print();
		obj.show();
	}

}
