// Step - 1 Create a Job
// to create a job there r 2 ways
// 1. implements Runnable interface
// 2. extends Thread class

class Job implements Runnable{
	int j =1;
	@Override
	public  void run(){
		System.out.println("I Don't Need this thing Sequential "+Thread.currentThread().getName());
		System.out.println("I am Saying Again I Don't Need this thing Sequential "+Thread.currentThread().getName());
		// Job Logic is here
		synchronized(this){  // Block Level
		for(int i = 1 ; i<=5 ; i++,j++){
		System.out.println("Thread is Running "
				+ ""+Thread.currentThread().getName()+" I is "+i+" J is "+j);
	}
	}
	}
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step - 2 Create a JOb Instance
		Job job1 = new Job();
		//Job job2 = new Job();
		//Job job3 = new Job();
		// Step - 3 Create a Worker and Assign a Job
		Thread worker1 = new Thread(job1,"ram");
		Thread worker2 = new Thread(job1,"shyam");
		Thread worker3 = new Thread(job1,"mike");
		//Thread worker2 = new Thread(job2,"shyam");
		//Thread worker3 = new Thread(job3,"mike");
		
		worker1.start();
		worker2.start();
		worker3.start();

	}

}
