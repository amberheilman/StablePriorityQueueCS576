/*
CS 576
Dependable Software Systems
Winter 2014

Introduction
==============================================
The goal of this assignment is to give you the opportunity to work with tools that help us become more effective in uncovering software defects.

For this assignment you will develop a Java class that implements a Stable Priority Queue, develop JUnit tests for this class, 
collect code coverage data using emma, and use FindBugs to statically analyze the code you developed.

A Priority Queue is a data structure for maintaining a set S of elements each with an associated value called a key. 
A Priority Queue supports the following operations:
	Insert(S,x)		inserts the element x into the set S.
	Maximum(S)		returns the element of S with the largest key. 
	ExtractMax(S)	removes and returns the element of S with the largest key.

A Priority Queue is Stable if elements with equal keys are deleted in the same order that they were inserted.

Priority Queues are an appropriate data structure for many computing applications such as scheduling, 
interrupt handling, computational number theory, and so on. We should note that, depending on the application, 
it is possible for the Priority Queue to support the operations Minimum and ExtractMin instead of Maximum and ExtractMax.

Priority Queues are discussed in significant detail in most Data Structures and Algorithms books. 
You will be able to find all the information you need regarding their implementation in any such book. 
You will also be able to find plenty of information about Priority Queues on the web.

Deliverables
===============================================
Please submit the following items:

	1. The source code for your class along with the corresponding JUnit tests. 
	   Please provide a Readme file with instructions on how to exercise the tests, and any information 
	   that I need to know regarding the status of the program (e.g., “The following operations do not produce the correct result…”). 
	2. An emma report showing the final code coverage achieved. You should strive to achieve 100% statement coverage.
	3. A report showing the static analysis results from FindBugs, and code improvements you made to address some (or all) of the  issues reported.
 */
package priorityQueue;


public class StablePriorityQueue implements Comparable<Integer> {
    private Comparable<Integer>[] pq;      
    private int size;         

    /* Constructor of StablePriorityQueue
     * 
     */
    public StablePriorityQueue(Integer maxIndex) {
        pq =  new Integer[maxIndex];
        size = 0;
    }

    /* Required for comparable
     * (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     * return 0
     */
	public int compareTo(Integer x) {
		return 0;
	}
	
	/*
	 * Used in getMaximum and extractMaximum to order the Queue
	 * parameters: Integer x, Integer y
	 * return int
	 */
	public int compare(Integer x, Integer y) {
		if (x < y) {
	        return -1;
	    }
	    if (x > y) {
	        return 1;
	    }
	    return 0;
	}
	
	/* Checks if the Queue is empty
	 * returns boolean
	 */
    public boolean isEmpty() { 
    	return size == 0; 
    }
    
    /* Gets the size of the Queue
     * return Integer
     */
    public int size() { 
    	return size;      
    }
    
    /* Adds an Integer to the Queue
     * paramaters: Integer x
     */
    public void insert(Integer x) { 
    	pq[size] = x;
    	size++;
    }

    /* Removes the Maximum element from the Queue
     * return Comparable<Integer>
     */
    public Comparable<Integer> extractMaximum() {
    	if (size == 0) {
    		return null; 
    	}

        int maxIndex = 0; 

        for (int i=1; i<size; i++) { 
            if (compare( (Integer) pq[i], (Integer) pq[maxIndex]) > 0) { 
                maxIndex = i; 
            } 
        } 
        Comparable<Integer> result = pq[maxIndex]; 

        size--; 
        pq[maxIndex] = pq[size]; 
        return result;
    }

    /* Returns the maximum element from the Queue
     * return Integer
     */
    public Integer getMaximum() {
    	if (size == 0) {
    		return null; 
    	}

        int maxIndex = 0; 

        for (int i=1; i<size; i++) { 
            if (compare( (Integer) pq[i], (Integer) pq[maxIndex]) > 0) { 
                maxIndex = i; 
            } 
        } 
        return (Integer) pq[maxIndex];
    }
    
    /* Clears the contents of the PriorityQueue
     */
	public void clear() {
		for (int i = 0; i < size; i++) {
	        pq[i] = null;
		}	    
		size = 0;
	}
	
	/* Will print the entirety of the PriorityQueue
	 */
	public void show(){
		for(int i = 0; i < size; i++) {
			System.out.print(i + " ");
		}
	}
	public static void main(String[] args) {
		
	}
}




    

