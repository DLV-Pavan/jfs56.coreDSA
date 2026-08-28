package DSA;

public class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i = 0;i<=10;i++) {
			System.out.println("seta thread");
		}
	}
	
	public static void main(String args[]) {
		MyRunnable rm = new MyRunnable();
		Thread t = new Thread(rm);
		t.start();
		
		for(int i = 0;i<=10;i++) {
			System.out.println("rama thread");
		}
	}
}
