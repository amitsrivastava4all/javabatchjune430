import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
// class this is a keyword 
class A
{
	A(){
		System.out.println("A Class Cons Call");
	}
	static{
		System.out.println("A Class Static Block Call");
	}
}
abstract class B
{
	B(){
		System.out.println("B Class Cons Call");
	}
	static{
		System.out.println("B Class Static Block Call");
	}
}
public class WithReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className =scanner.next();
		System.out.println("type add");
		System.out.println("type subtract");
		System.out.println("type multiply");
		System.out.println("type divide");
		// Class.forName() - this is used to load a class
		// Lazy way to load a class
		// Object object = new A();
		//Class.forName(className);  // this is the predefine class in Java
		Object object = Class.forName(className).newInstance();
		System.out.println("Enter the Operation Name");
		String methodName = scanner.next();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class,int.class);
		method.setAccessible(true);
		Object result = method.invoke(object, 100,200);
		System.out.println("Result is "+result);
	}

}
