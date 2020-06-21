package creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateSingletonObject {

	public static void main(String[] args) {
		Singleton singletonObj = Singleton.getInstance();
		if(singletonObj == null) {
			System.out.println("Object is null at this point.");
		}
		else {
			System.out.println("Object is not null.");
		}
		
		Singleton singletonObj2 = Singleton.getInstance();
		if(singletonObj2 == null) {
			System.out.println("Object is null at this point.");
		}
		else {
			System.out.println("Object is not null.");
		}
		
		if(singletonObj == singletonObj2) {
			System.out.println("Same objects");
		}
		
		// Create 100 instance of singleton
		
		ExecutorService executors = Executors.newFixedThreadPool(10);
		executors.submit(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.currentThread().sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(Thread.currentThread().getName());
			}
		});
		
		System.out.println("Main thread");
		
		executors.shutdown();
	}

}
