
public class StringPerformance {

	public static void main(String[] args) {
		String a = "Welcome User";
		String b;
		Runtime r = Runtime.getRuntime();  // HEAP INformation 
		System.out.println("Total Heap "+r.totalMemory());
		System.out.println("Free Heap "+r.freeMemory());
		System.out.println("Used Heap "+(r.totalMemory() - r.freeMemory()));
		long startTime = System.currentTimeMillis();
		for(long i = 1; i<=100000; i++){
			b= "Welcome User";
			//b = new String("Welcome User");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
		System.out.println("Total Heap "+r.totalMemory());
		System.out.println("Free Heap "+r.freeMemory());
		System.out.println("Used Heap "+(r.totalMemory() - r.freeMemory()));

	}

}
