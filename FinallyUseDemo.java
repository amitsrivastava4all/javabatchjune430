
public class FinallyUseDemo {
	static void db(){
		
		System.out.println("DB Connection Open");
		try{
		int q[] = new int[10];
		//q[20]=90;
		
		System.out.println("Query Execute");
		System.exit(0);
		//return;
		}
		finally{
		System.out.println("DB Connection Close");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		db();
		

	}

}
