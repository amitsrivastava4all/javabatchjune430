import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class TT {
	
}
interface P
{
	
}
interface P2
{
	
}
class T extends TT implements P,P2 
{
	private int a,b;
	public int d;
	static int e;
	T(){
		
	}
	T(int x){
		
	}
	void show(){
		
	}
	void print(){
		
	}
}
public class ScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class cls = T.class; // Now this will give the meta information of T class
		T obj = new T(); // Data Information
		Class cls2 = obj.getClass(); // Data + MetaData
		Field fields [] = cls.getDeclaredFields();
		int publicCounter = 0;
		int privateCounter = 0;
		int staticCounter = 0;
		for(Field field: fields){
			if(Modifier.isPublic(field.getModifiers())){
				publicCounter++;
			}
			else
			if(Modifier.isPrivate(field.getModifiers())){	
				privateCounter++;
			}
			else
			if(Modifier.isStatic(field.getModifiers()))	{
				staticCounter++;
			}
		}
		System.out.println("Total Fields are "+fields.length);
		System.out.println("Total Private Fields are "+privateCounter);
		System.out.println("Total Public fields are "+publicCounter);
		System.out.println("Total Static Fields are "+staticCounter);
		
		Method methods [] = cls.getDeclaredMethods();
		System.out.println("Methods Count is "+methods.length);
		
		Constructor cons[] = cls.getDeclaredConstructors();
		System.out.println("Cons Count is "+cons.length);
		
		String superClassName= cls.getSuperclass().getName();
		System.out.println("Super Class Name "+superClassName);
		
		Class interfaces [] = cls.getInterfaces();
		System.out.println("Total Interfaces Implemented are "+interfaces.length);
	}

}
