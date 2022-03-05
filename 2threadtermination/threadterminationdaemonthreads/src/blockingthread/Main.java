package blockingthread;

public class Main {

	public static void main(String[] args) {
		Thread thread = new Thread(new BlockingTask());
		thread.setName("BlockingTask");
        thread.start();
        thread.interrupt();
	}
	
	private static class BlockingTask implements Runnable {

        @Override
        public void run() {
            //do things
            try {
                Thread.sleep(500000);
                
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking thread");
            }
        }
    }
}
