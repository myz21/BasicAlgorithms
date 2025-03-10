/* 
import java.util.function.IntFunction;

public class Node {

    public int data;
    public Node next;

    public Node(int dd) {
        data = dd;
    }

    public void displayLink() // display ourself
    {
        System.out.print(data + " ");
    }
}

public class MyQueue {

    private Node front;
    private Node rear;
    private int size;

    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    //insert end
    public void enqueue(int dd) {
        //we creating a new Node to insert to tail
        Node insertedNode = new Node(dd);

        if(front == null){
            front = insertedNode;
            rear = insertedNode;
            size = size + 1; //size is incremented
            return;
        }
        rear.next = insertedNode;
        rear = insertedNode;
        size = size + 1; //size is incremented
    }

    //The method shows the item in front of Queue
    public int peek() {
       
        //if it is empty queue
       if(isEmpty()){
         System.out.println("ERROR, it is empty queue");
         return 0;
       }
       return front.data;
    }

    //removes and returns the element at the front of the queue
    public int dequeue() {
       Node deleted;

       //if it is empty queue
       if(isEmpty()){
        System.out.println("ERROR, it is empty queue");
        return 0;
       }
       //if it has have single element
       if (front == rear) {
           deleted = front;
           front = null;
           size = size -1; //size is decremented           
           return deleted.data;
       }
       //if it has single element and next or rear is null
       if(front.next == null || rear == null){
        deleted = front;
        front = null;
        size = size -1; //size is decremented
        return deleted.data;
       }

       //front will be front.next
       deleted  =front;
       front = front.next;
       size = size -1; //size is decremented       
       return deleted.data;
       
    }

    public int getSize(){
        return size;
    }
    
    public void clear(){
        
        //we doing deque in while loop
        while(!isEmpty()){
            dequeue();
        }

    }

    public int sum(){
        int sum = 0;
        while(!isEmpty()){
            sum+=peek();
            front = front.next;
        }
        return sum;
    }
}
*/