
class Link {

    public int data;
    public Link next;
    public Link previous;

    public Link(int d) {
        data = d;
    }

    public void displayLink() {
        System.out.print(data + " ");
    }

}

////////////////////////////////////////////////////////////////
class DoublyLinkedList {

    private Link head;
    private Link tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void insertLast(int dd) {
        Link newLink = new Link(dd);
        if (head == null){
            head = newLink; 
            tail = newLink;
            return;
        }
        tail.next = newLink;
        newLink.previous = tail;
        tail = newLink;
    }


    public Link deleteFirst() {
        
        Link deleted;

        if (isEmpty()){
            System.out.println("ERROR");
            return null;
        }
        if (head == tail){
            head = null;
            tail = null;
            return null;
        }
        if(head.next == null || tail == null){
            deleted = head;
            head = null;
            //System.out.print("The list became empty. ");
            return deleted ;
        }

        head.next.previous = null;
        head = head.next;
        //head.next = null;
        deleted = head;
        return deleted;
        
    }


    public void displayBackward() {
        System.out.print("List (tail-->head): ");
        Link current = tail;
        while (current != null) {
            current.displayLink();
            current = current.previous;
        }
        System.out.println("");
    }
    
    public void sortedInsert(int dd) {
        Link newNode = new Link(dd);

        //if head is null or head is greater than newNode head becomes newNode
        if(isEmpty() || head.data > newNode.data){
            newNode.next = head;
            head = newNode;
            return;
        }

        Link current = head;
        //if current.next is not null and current.next is less than newNode
        //we traversing over the list
        while(current.next != null && current.next.data < newNode.data){
            current.previous = current;
            current = current.next;
        }

        //inserting
        if(current.next == null){
            tail = newNode;
            tail.previous = current;
            current.next = tail;
        }
        else {
            current.next.previous = newNode;
            newNode.previous = current;
            newNode.next = current.next;
            current.next = newNode;
        }

    }
    
    public void displayForward() {
        System.out.print("List (head-->tail): ");
        Link current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
    
    public void deleteDuplicateValues() {

        Link temp = head;

        while(temp.next != null){

            if(temp.data == temp.next.data){

                temp.next = temp.next.next;
                if(temp.next != null){
                    temp.next.previous = temp;
                }
            }
            else{
                temp  = temp.next;
            }
        }
    }

    public Link searchElement(int dd){
        if (isEmpty()){
            System.out.println("There's no element");
            return null;
        }
        if(head.data == dd){
            System.out.println("The element found.");
            return head;
        }

        Link temp = head;

        while(temp.data != dd){
            temp = temp.next;
            if(temp.next == null){
                break;
            }
        }

        if(temp.data == dd){
            System.out.println("Found.");
            return temp;
        }
        else{
            System.out.println("Not found.");
            return null;
        }
    
    }
    
    
}
////////////////////////////////////////////////////////////////
public class Test {

    public static void main(String[] args) {
        DoublyLinkedList theList = new DoublyLinkedList();

        theList.insertLast(22);
        theList.displayBackward();
        theList.insertLast(44);
        theList.displayBackward();
        theList.insertLast(66);
        theList.displayBackward();


        theList.deleteFirst();
        theList.displayBackward();
        theList.deleteFirst();
        theList.displayBackward();
        theList.deleteFirst();
        theList.displayBackward();

        
        theList.sortedInsert(8);
        theList.displayForward();
        theList.sortedInsert(6);
        theList.displayForward();
        theList.sortedInsert(2);
        theList.displayForward();
        theList.sortedInsert(4);
        theList.displayForward();
        theList.sortedInsert(5);
        theList.displayForward();
        theList.sortedInsert(9);
        theList.displayForward();
        theList.sortedInsert(9);
        theList.displayForward();
        theList.sortedInsert(5);
        theList.displayForward();
        theList.sortedInsert(4);
        theList.displayForward();
        theList.sortedInsert(4);
        theList.displayForward();
        theList.sortedInsert(9);
        theList.displayForward();
        
        theList.deleteDuplicateValues();
        theList.displayForward();
      
    }
}
