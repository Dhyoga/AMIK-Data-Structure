class Node {

    int value;
    Node nextNode;

    public Node(int value) {
        this.value = value;
    }
}
//Now let's create the first and last nodes in the circular linked list, usually called the head and tail:

public class CircularLinkedList {
    private Node head = null;
    private Node tail = null;

//Let's create an addNode method that takes the value to be inserted as a parameter:

public void addNode(int value) {
    Node newNode = new Node(value);

    if (head == null) {
        head = newNode;
    } else {
        tail.nextNode = newNode;
    }

    tail = newNode;
    tail.nextNode = head;
}
public boolean isCircular(){
	return (tail.nextNode == head);
}
//Now we can add a few numbers to our circular linked list:

private CircularLinkedList createCircularLinkedList() {
    CircularLinkedList cll = new CircularLinkedList();

    cll.addNode(29);
    cll.addNode(10);
    cll.addNode(2002);
    cll.addNode(2021);
    cll.addNode(19);

    return cll;
}

public boolean containsNode(int searchValue) {
    Node currentNode = head;

    if (head == null) {
        return false;
    } else {
        do {
            if (currentNode.value == searchValue) {
                return true;
            }
            currentNode = currentNode.nextNode;
        } while (currentNode != head);
        return false;
    }
}
//Now, let's add a couple of tests to verify that the above-created list contains the elements we added and no new ones:
public void deleteNode(int valueToDelete) {
    Node currentNode = head;
    if (head == null) { // the list is empty
        return;
    }
    do {
        Node nextNode = currentNode.nextNode;
        if (nextNode.value == valueToDelete) {
            if (tail == head) { // the list has only one single element
                head = null;
                tail = null;
            } else {
                currentNode.nextNode = nextNode.nextNode;
                if (head == nextNode) { //we're deleting the head
                    head = head.nextNode;
                }
                if (tail == nextNode) { //we're deleting the tail
                    tail = currentNode;
                }
            }
            break;
        }
        currentNode = nextNode;
    } while (currentNode != head);
}

public void traverseList() {
    Node currentNode = head;

    if (head != null) {
        do {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.nextNode;
        } while (currentNode != head);
    } System.out.println();
}

public static void main(String... x){
	CircularLinkedList c=new CircularLinkedList();
	c=c.createCircularLinkedList();
	System.out.println("is Circular:"+ c.isCircular());
	c.traverseList();
	int key=2002;
	System.out.println("key:"+ key);
	System.out.println("before delete, CLL contains "+key+": "+c.containsNode(key));
	c.deleteNode(key);
	System.out.println("after delete, CLL contains "+key+": "+c.containsNode(key));
}
}