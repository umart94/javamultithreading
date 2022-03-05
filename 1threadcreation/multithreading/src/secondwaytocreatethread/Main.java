package secondwaytocreatethread;

public class Main {

	public static void main(String[] args) {
		  Thread thread = new NewThread();//create a concrete class object.
		  thread.start();
	}
	
	private static class NewThread extends Thread {
		@Override
		public void run() {
			System.out.println("we are now in thread "+Thread.currentThread().getName());
			System.out.println("we are now in thread "+this.getName());
            System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            System.out.println("Current thread priority is " + this.getPriority());

		}
	}
}
