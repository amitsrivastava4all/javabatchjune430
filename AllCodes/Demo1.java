// Step - 1 Create a Job
// to create a job there r 2 ways
// 1. implements Runnable interface
// 2. extends Thread class

class Logic
{
	static int j = 1;
	public static void print(){
		for(int i = 1; i<=5; i++,j++){
			System.out.println("Thread is Running "+ " Alive "+Thread.currentThread().isAlive()
					+ ""+Thread.currentThread().getName()+" I is "+i+" J is "+j);
			Thread.yield();
			//		try {
//			Thread.yield();
//			//Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
	}
}
}
class Job implements Runnable{
	int j =1;
	Logic logic = new Logic();
	@Override
	public  void run(){
//		System.out.println("I Don't Need this thing Sequential "+Thread.currentThread().getName());
//		System.out.println("I am Saying Again I Don't Need this thing Sequential "+Thread.currentThread().getName());
//		StringBuilder sb = new StringBuilder();
//		synchronized(sb){
//			sb.append("ram");
//			sb.deleteCharAt(0);
//		}
		// Job Logic is here
		// Now Logic object is synchronized
//		synchronized (logic) {
//			logic.print();
//		}
//		synchronized(Logic.class){
//		Logic.print();
//		}
//		synchronized(this){  // Block Level
		for(int i = 1 ; i<=5 ; i++,j++){
		System.out.println("Thread is Running "
				+ ""+Thread.currentThread().getName()+" I is "+i+" J is "+j);
	}
	}
	}


public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step - 2 Create a JOb Instance
		Job job1 = new Job();
		//Job job2 = new Job();
		//Job job3 = new Job();
		// Step - 3 Create a Worker and Assign a Job
		Thread worker1 = new Thread(job1,"ram");
		//worker1.run();
		Thread worker2 = new Thread(job1,"shyam");
		Thread worker3 = new Thread(job1,"mike");
		//Thread worker2 = new Thread(job2,"shyam");
		//Thread worker3 = new Thread(job3,"mike");
		//worker1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(worker1);
		System.out.println(worker1.getPriority());
		//worker2.setPriority(Thread.MIN_PRIORITY);
		//worker3.setPriority(Thread.NORM_PRIORITY);
		worker1.setDaemon(true);
		System.out.println("IS Daemon "+worker1.isDaemon());
		worker1.start();
		//worker1.join();
		worker2.start();
		worker3.start();

	}

}
