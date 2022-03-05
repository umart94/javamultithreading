package latency;

public class Main {
/*the time to completion of a task measured in time units. is called latency

throughput is the amount of tasks completed in a given period measured in tasks / time unit*/
	
	
	/*Latency = Time
	 * break the task into multiple independent tasks N
	 * Latency = Time / Number of sub-tasks
	 *
	 *we will schedule the tasks to run in parallel on different threads
	 *theoretically we want to acheive 
	 *Latency = Time / Number of sub-tasks
	 *
	 *theoretical reduction of latency by N
	 *
	 *the question is what would be the number of subtasks N ?
	 * does breaking original task and aggregating results come for free ?
	 * can we break any task into multiple subtasks ?
	 * 
	 */


	/*
	 * on a general purpose computer N = Number of cores
	 * if we increase N it will not be productive and result in an increase in latency
	 * cores = 6
	 * 
	 * 
	 * 
	 * number of threads = number of cores is only optimal if all threads are runnable and can run without
	 * interruption(no I/O , blocking calls, sleep ) etc.
	 * 
	 * the assumption is nothing else is running that consumes a lot of CPU.
	 * 
	 * 
	 * 
	 * hyper threading, a single physical core can run 2 threads at a time
	 * some hw units are shared some are independent
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	
	/*
	 * Inherent cost of parallelization and aggregation
	 * 1. breaking task into multiple tasks
	 * 2. thread creation , passing tasks to threads
	 * 3. time between thread.start() to thread getting scheduled
	 * 4. time until last thread finishes and signals the aggregating thread that it is done.
	 * 5. time until aggregating thread runs again
	 * 6. aggregation of subtasks in a single artifact also has some inherent cost.
	 */



}

