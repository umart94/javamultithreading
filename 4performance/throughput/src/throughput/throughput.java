package throughput;

public class throughput {
	/*
	 
	 throughput is the amount of tasks completed in a given period, measured in tasks / time unit(typically seconds)
	 
	 concurrent tasks as fast as possible.
	 
	 
	 1. if each tasks takes time T to complete , then the minimum throughput we can acheive is 1 task in T time or 1/T
	 
	 2. if the task can be broken into subtasks, then we can complete each task in T/N time.
	 
	 
	 the throughput is calculated by N #subtasks or # threads / Time to execute original task
	 
	 
	 throughput is likely < N/T in practice.
	 
	 */
	
	
	
	/*
	 * second approach is to schedule each task () on seperate thread
	 * latency = T
	 * throughput is also = N/T
	 * N = # threads
	 * 
	 * the tasks are inherently unrelated and independent from each other.
	 * we also have only 1 result for each task
	 */
	
}
