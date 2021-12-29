import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<Integer>();
        deque.add(29);
        deque.add(10);
        deque.add(2002);
        deque.add(2021);
        for(Integer element:deque){
            System.out.println("Element ArrayDeque = "+element);
        }
        deque.clear();
        System.out.println("ArrayDeque = "+deque);
        deque.addFirst(03);
        deque.addFirst(16);
        deque.add(2020);
        System.out.print("Elemen Array Deque  = ");
        for(Iterator<Integer> itr=deque.iterator();itr.hasNext();){
            System.out.print(itr.next()+"-");
        }System.out.println();
        System.out.println("ArrayDeque Reversed Order");
        for(Iterator<Integer> itr=deque.descendingIterator();itr.hasNext();){
            System.out.print(itr.next()+" ");
        }System.out.println();
        System.out.println("First Element using element() = "+deque.element());
        Object[] arr=deque.toArray();
        System.out.println("Array Size: "+arr.length);
        System.out.print("Array Element = ");
        for (int index = 0; index < arr.length; index++) {
            System.out.print(" "+arr[index]);
        }System.out.println();
        System.out.println("Head Element peek "+deque.peek());
        System.out.println("Head Element poll "+deque.poll());
        deque.push(19);
        deque.push(18);
        System.out.println("Array sekarang adalah "+deque);
        System.out.println("Head Element remove "+deque.remove());
        System.out.println("Array Akhir adalah "+deque);
    }
}
