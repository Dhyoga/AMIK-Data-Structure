// Java program for insertion and deletion in Circular Queue
import java.util.* ;
class CQInsertDel{
	// Structure of a Node
	static class Node{
		int data;
		Node link;
	}
	static class Queue{
		Node front, rear;
	}
	// Function to create Circular queue
	static void enQueue(Queue q, int value){
		Node temp = new Node();
		temp .data = value;
		if (q .front == null)
			q .front = temp;
		else
			q .rear .link = temp;
		q .rear = temp;
		q .rear .link = q .front;
	}
	// Function to delete element from Circular Queue
	static int deQueue(Queue q){
		if (q .front == null){
			System.out.printf ("Queue is empty");
			return Integer.MIN_VALUE;
		}
		// If this is the last node to be deleted
		int value; // Value to be dequeued
		if (q .front == q .rear){
			value = q .front .data;
			q .front = null;
			q .rear = null;
		} else // There are more than one nodes
		{
			Node temp = q .front;
			value = temp .data;
			q .front = q .front .link;
			q .rear .link= q .front;
		}
		return value ;
	}
	// Function displaying the elements of Circular Queue
	static void displayQueue( Queue q){
		Node temp = q .front;
		System.out.printf("Elements in Circular Queue are: ");
		while (temp .link != q .front){
			System.out.printf("%d ", temp .data);
			temp = temp .link;
		}
		System.out.printf("%d\n", temp .data);
	}

	/* Driver of the program */
	public static void main(String args[]){
		// Create a queue and initialize front and rear
		Queue q = new Queue();
		q .front = q .rear = null;
		int t=14;
		// Inserting elements in Circular Queue
		System.out.println("enQueue:"+t);
		enQueue(q, t);
		// Display elements present in Circular Queue
		displayQueue(q);
		t=22;
		// Inserting elements in Circular Queue
		System.out.println("enQueue:"+t);
		enQueue(q, t);
		// Display elements present in Circular Queue
		displayQueue(q);
		t=6;
		// Inserting elements in Circular Queue
		System.out.println("enQueue:"+t);
		enQueue(q, t);
		// Display elements present in Circular Queue
		displayQueue(q);
		// Deleting elements from Circular Queue
		System.out.printf("Deleted value = %d\n", deQueue(q));
		// Remaining elements in Circular Queue
		displayQueue(q);
		System.out.printf("Deleted value = %d\n", deQueue(q));
		// Remaining elements in Circular Queue
		displayQueue(q);
		t=9;
		// Inserting elements in Circular Queue
		System.out.println("enQueue:"+t);
		enQueue(q, t);
		// Display elements present in Circular Queue
		displayQueue(q);
		t=20;
		// Inserting elements in Circular Queue
		System.out.println("enQueue:"+t);
		enQueue(q, t);
		// Display elements present in Circular Queue
		displayQueue(q);
	}
}
/*
enQueue:14
Elements in Circular Queue are: 14
enQueue:22
Elements in Circular Queue are: 14 22
enQueue:6
Elements in Circular Queue are: 14 22 6
Deleted value = 14
Elements in Circular Queue are: 22 6
Deleted value = 22
Elements in Circular Queue are: 6
enQueue:9
Elements in Circular Queue are: 6 9
enQueue:20
Elements in Circular Queue are: 6 9 20
*/
