package javatpoint;

class Mythreads extends Thread {

	String name;

	Mythreads(String s) {
		name = s;

	}

	public synchronized void run() {
		int k=0;
		System.out.println(k);
		for (int u = 0; u <= 10; u++) {
			System.out.println(name + " :" + u);
			try {
				Thread.sleep(100);

			} catch (Exception e) {
			}
		}

	}
}

public class JavaThreads {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println();
		ThreadGroup d = new ThreadGroup("dur");

		Mythreads k = new Mythreads("first");
		Thread l = new Thread(k);

		l.start();

		

		Mythreads k1 = new Mythreads("second");
		Thread l1 = new Thread(k1);

		l1.start();
		
		System.out.println("Thread ends");

	}

}
