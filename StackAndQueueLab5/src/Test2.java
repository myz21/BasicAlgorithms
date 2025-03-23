class Node {

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

class MyQueue {

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
        //we creating a new Node to insert END of Queue
        Node insertedNode = new Node(dd);

        if(front == null || rear == null){
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
        Node current = front;
        while(current != null){
            sum+=current.data;
            current = current.next;
        }
        return sum;
    }
}

public class Test2 {
    
    
    public static int equalizeQueues(MyQueue q1, MyQueue q2, MyQueue q3){

        int sum1 = q1.sum();
        int sum2 = q2.sum();
        int sum3 = q3.sum();

        if(sum1 == 0 || sum2 == 0 || sum3 == 0){
            return 0;
        }

        if(sum1 == sum2 && sum2 == sum3){
            return sum1;
        }

        //recursion
        if (sum1 >= sum2 && sum1 >= sum3) {
           return q1.dequeue(); //we doing that until sum1 not become biggest
        }
        else if (sum2 >= sum1 && sum2 >= sum3) {
            return q2.dequeue(); //we doing that until sum2 not become biggest
         }
        else if (sum3 >= sum2 && sum3 >= sum1) {
            return q3.dequeue(); //we doing that until sum3 not become biggest
         }
         return 0;
    }
    
    public static void main(String[] args){
        MyQueue q1 = new MyQueue();
        MyQueue q2 = new MyQueue();
        MyQueue q3 = new MyQueue();

        q1.enqueue(3);
        q1.enqueue(2);
        q1.enqueue(1);
        q1.enqueue(1);
        q1.enqueue(1);
       
        q2.enqueue(4);
        q2.enqueue(3);
        q2.enqueue(2);
        
        q3.enqueue(1);
        q3.enqueue(2);
        q3.enqueue(3);
        q3.enqueue(1);
        
        System.out.print("Test Case #1: ");
        System.out.println(equalizeQueues(q1, q2, q3));
        
        q1.clear();
        q2.clear();
        q3.clear();
        
        q1.enqueue(3);
        q1.enqueue(2);
        q1.enqueue(1);
        q1.enqueue(1);
        q1.enqueue(1);
       
        q2.enqueue(4);
        q2.enqueue(3);
        q2.enqueue(2);
        
        q3.enqueue(1);
        q3.enqueue(1);
        q3.enqueue(4);
        q3.enqueue(1);
        
        System.out.print("Test Case #2: ");
        System.out.println(equalizeQueues(q1, q2, q3));         
    }
}

