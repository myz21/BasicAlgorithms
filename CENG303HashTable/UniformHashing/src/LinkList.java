/**
 * LinkList.java
 * Linked list used for each hash bucket (separate chaining).
 *
 * TODO: All method bodies are commented out.
 * You must implement:
 *   - insert(double key, int value)
 *   - search(double key)
 *   - delete(double key)
 *   - length()
 *
 * Hints (comments only):
 *   - For equality: use Double.doubleToRawLongBits(a) == Double.doubleToRawLongBits(b)
 *   - insert: adding to head gives O(1) insertion
 *   - delete: use previous/current pointers to remove node
 */

 public class LinkList {
    public Node head;

    public LinkList() {
        // TODO: initialize head = null
        this.head = null;

    }

    public void insert(double key, int value) {
        // TODO: create new Node and insert at head
        // Example: newNode.next = head; head = newNode;
        Node newNode = new Node(key, value);
        newNode.next = head;
        head = newNode;
    }

    public Node search(double key) {
        // TODO: iterate list
        // TODO: use Double.doubleToRawLongBits for exact comparison
        // TODO: return Node if found, else null
        Node current = head;
        while(current != null){
            if(Double.doubleToLongBits(key) == Double.doubleToLongBits(current.key)){
                return current;
            }
            current = current.next;
        }    
        return null;
    }

    public boolean delete(double key) {
        // TODO: iterate and remove matching node
        // TODO: return true if deleted, false otherwise

        Node current = head;
        
        if(Double.doubleToLongBits(key) == Double.doubleToLongBits(current.key)){
            head = head.next;
            return true;
        }

        Node prev = head.next;

        while(current != null){
            if(Double.doubleToLongBits(key) == Double.doubleToLongBits(current.key)){
                prev.next = current.next;
                return true;
            }
            prev = current;
            current = current.next;
        }    
        return false;
    }

    public int length() {
        // TODO: count and return number of nodes in list
        if(head == null){
            return 0;
        }
        Node current = head;
        int count = 0;
        while(current != null){
            current = current.next;
            count++;
        }

        return current;
    }
}
