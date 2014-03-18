/*
CS 576
Dependable Software Systems
Winter 2014

Project Assignment


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
import java.util.PriorityQueue;

public class StablePriorityQueue extends PriorityQueue<Integer>{
	/**
     * Construct an empty StablePriorityQueue.
     */
    public StablePriorityQueue(int max){
        //Integer[] pq = new Integer[ max ];
    }
    public void insert (Integer newInt) { 
        this.add(newInt);
    } 
    public int getMaximum() {
    	return this.peek();
	}
    public int extractMaximum() {
    	return this.poll();
	}
    public boolean isEmpty () { 
    	return this.isEmpty();
    	//return this.size() == 0;
    }     
    public static void main(String args[]){
    	StablePriorityQueue stablePQ = new StablePriorityQueue(11);
    	for(int i=0; i<10;i++){
	    	System.out.println("Insert i: "+ i);
    	}
    	System.out.println("poll:");
    	System.out.println(stablePQ.extractMaximum());
    	System.out.println(stablePQ);
    	
    	//+ "Size: " + stablePQ.size() + "getMaximum: " +stablePQ.getMaximum() + "isEmpty: " + stablePQ.isEmpty() + "extractMaximum: " + stablePQ.extractMaximum());
    	
    
    }

}
