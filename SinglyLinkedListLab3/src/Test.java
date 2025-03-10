package com.mycompany.mavenproject1;

class Node {

    public String data;
    public Node next;

    public Node(String nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

class LinkList {

    public Node head; // First item of LinkList

    public LinkList() {
        this.head = null;
    }

    void printLinkList() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty!");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("");
    }

    void insertToHead(String nodeData) {
        Node newNode = new Node(nodeData);

        newNode.next = head;
        head = newNode;
    }

    // Complete the insertToSpecificPosition function below.
    // Indexes are starting from 0.
    // A->B->C->null 
    // Want to add D to position 1   A -> D -> B -> C
    void insertToSpecificPosition(String nodeData, int position) {
         Node current = head;
         int index = 0;
         
         Node nodee = new Node(nodeData);
         
        if(position == 0){
            insertToHead(nodeData);
            return;
        }
        while(current != null && index < position-1){
            current = current.next;
            index++;
          
        }
        if (current == null){
            System.out.println("ERROR");
            return;
        }
        nodee.next = current.next;
        current.next = nodee;
    }

    // Delete if a node has same data with key value
    // Return deleted Node or null if it is not found.
    public Node delete(String key) // delete link with given key
    {
        Node current = head;
        
        if(head.data.equals(key)){
            Node deleted = head;
            head = head.next;
            return deleted;
        }
         while(current.next != null && !current.next.data.equals(key)){
            current = current.next;
        }
        if(current.next == null){
            System.out.println("ERROR");
            return null;
        }
        if(current.next.data.equals(key)){
             current.next = current.next.next;
             return current.next;
        }
        else{
            return null;
        }
    }

    // Complete the sortedInsert function below which inserts items alphabetically sorted.
    void sortedInsert(String nodeData) {
        Node nodee = new Node(nodeData);
        
        if(head == null ||  head.data.compareTo(nodee.data)>0){
            nodee.next = head;
            head = nodee;
            return;
        }
        
        
        Node current = head;
        if(current.next != null && current.next.data.compareTo(nodee.data)<0){
            current = current.next;
        }
        nodee.next = current.next;
        current.next = nodee;
    }

}

public class Test {

    public static void main(String[] args) {
        LinkList llist = new LinkList();
        
        
        System.out.println("-------------------------------");
        System.out.println("Sorted Insert Operations");
        System.out.println("-------------------------------");
        llist.printLinkList();
        llist.sortedInsert("D");
        llist.printLinkList();
        llist.sortedInsert("B");
        llist.printLinkList();
        llist.sortedInsert("C");
        llist.printLinkList();
        llist.sortedInsert("A");
        llist.printLinkList();
        llist.sortedInsert("F");
        llist.printLinkList();
        llist.sortedInsert("E");
        llist.printLinkList();
        
        
        System.out.println("-------------------------------");
        System.out.println("Insert to a Position Operations");
        System.out.println("-------------------------------");
        
        llist.insertToSpecificPosition("Z", 6);
        llist.printLinkList();
        llist.insertToSpecificPosition("T", 3);
        llist.printLinkList();
        llist.insertToSpecificPosition("X", 0);
        llist.printLinkList();
        
        llist.insertToSpecificPosition("G", 10);
        llist.printLinkList();

        
        System.out.println("-------------------------------");
        System.out.println("Delete Operations");
        System.out.println("-------------------------------");
        
        if(llist.delete("Z") != null)
            llist.printLinkList();
        else{
            System.out.println("Z is not found");
        }
        if(llist.delete("T") != null)
            llist.printLinkList();
        else{
            System.out.println("T is not found");
        }
        if(llist.delete("X") != null)
            llist.printLinkList();
        else{
            System.out.println("X is not found");
        }
        if(llist.delete("L") != null)
            llist.printLinkList();
        else{
            System.out.println("L is not found");
        }
        System.out.println("-------------------------------");
        
    }
}
