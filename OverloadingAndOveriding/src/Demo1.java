// Overriding 
// 1. Inheritance + Signature Must be same
// Rule -1 Change the Access Modifier (Weaker Access Rule)
// Scope 4 Types
// 1. private - with in the class
// 2. default - with in the package
// 3. protected - with in the package 
// and can access outside the package by using inheritance
// 4. public - with in and outside also
// Why Override - Parent Feature is become outdated and we need 
// the updated feature , that's why we override
// Rule -2 Change the Return type in Overriding (Co-Variant Return Type Rule)
class X
{
	int a,b,c;
}
class Y extends X
{
	int d,e,f;
}
class Z
{
	int m,n,p;
}
class Parent
{
	protected X show(){
		System.out.println("this is the old feature");
		X obj = new X();
		return obj;
	}
}
class Child extends Parent
{
	@Override
	 public Y show(){
		System.out.println("this is the new feature");
		Y obj = new Y();
		return obj;
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
