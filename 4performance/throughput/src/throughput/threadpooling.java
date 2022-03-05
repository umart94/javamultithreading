package throughput;

public class threadpooling {

	/*
	 creating the threads once
	 and reusing them for future tasks
	 instead of creating threads each time from  scratch.
	 
	 once the threads are created the tasks are distributed to threads
	 through a queue
	 
	 each thread takes task from a queue whenever that thread is available.
	 
	 if all threads are busy , the tasks are going to sit in the queue 
	 and wait for a thread to become available.
	 
	 
	 we will use fixed thread pool executor
	 
	 it will create a fixed thread pool with a fixed number of threads
	 this executor also comes with a built in queue
	 
	 to add a task to queue and have it execute by 1 of the threads we pass runnable task into an execute method.
	 
	 
	 */
}
