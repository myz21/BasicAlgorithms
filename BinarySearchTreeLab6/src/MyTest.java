
import java.util.Stack;

class FamilyLinkList {

    class Node {

        public String name;
        public int age;
        public Node next;

        public Node(String name, int age) {
            this.name = name;
            this.age = age;
            this.next = null;
        }

        public String toString() {
            return "Name=" + name + ", Age=" + age;
        }
    }
    
    public Node head;
    public FamilyLinkList() {
        head = null;
    }

    
    public void insertNode(String name, int age) {
        // Inserts a node at the end of the FamilyLinkList
        Node current = head;

        Node newNode = new Node(name,age);

        if(current == null){
            head = newNode;
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        
        current.next = newNode;
    }

    
    public boolean search(String name) {
        // Searches a name into the Family Linked Lists and returns true if found
    	// false otherwise
        Node current = head;
        while(current != null){
            if(current.name.equals(name)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    
    public boolean deleteNode(String name) {
        // Deletes the node from Family Link Lists
    	// Return true if delete is succesful, false otherwise
        Node current = head;
        if(current != null && current.name.equals(name)){
            head =head.next;
            return true;
        }
        while(current.next != null){
            if(current.next.name.equals(name)){
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Prints the FamilyLinkList
    void printLinkList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.toString());
            temp = temp.next;
        }
    }
}

class MyBST {

    // Inner Class -> Only reachable by this class
    class Node {

        String familyName;
        FamilyLinkList memberList;
        Node left, right;

        public Node(String familyName) {
            this.familyName = familyName;
            left = right = null;
            memberList = new FamilyLinkList();
        }
    }

    // Root of BST
    Node root;

    // Constructor
    public MyBST() {
        root = null;
    }

    
    void insert(String fName, String name, int age) {
        // This method mainly inserts the family members to the Tree
        // 1-) If a family is not in the tree first you need to insert that family
        // Then you can insert the member to the memberList of that Node
    
        // 2-) If a family is already in the Tree
        // Then you just need to add the member to the memberList of that Node


        Node curr = this.root;  // Aramaya kök düğümden başla
        Node parent = null;

        if(root == null){
            root = new Node(fName);
            root.memberList.insertNode(name, age);
            return;
        }
    
        while (curr != null) {
            parent = curr;
            if (curr.familyName.equals(fName)) {
                boolean found = curr.memberList.search(name);
                if (found) {
                    System.out.printf("%s %sis found in the Tree\n", name, fName);
                } else {
                    System.out.printf("%s family is found BUT %sis not inside the Family\n", fName, name);
                    //add member(s) to the family
                    curr.memberList.insertNode(name, age);
                }
                return;
            } else if (curr.familyName.compareTo(fName) > 0) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        
        //if the family not found in BST

        Node newNode = new Node(fName);

        newNode.memberList.insertNode(name,age);

        curr = newNode;
        
        if(parent.familyName.compareTo(fName) >= 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }        
            
    }

    void delete(String fName, String name) {
        // An iterative delete method will be written
        // 1- If the person is exist
        // You just need to remove the family member from the memberlist
        // Family name is not needed to be deleted from the Tree
    
        // 2- If person is not exist
        // Just give the correct warning message

        Node curr = this.root;  // Aramaya kök düğümden başla
    
        while (curr != null) {
            if (curr.familyName.equals(fName)) {
                System.out.printf("The family name %s is found in the tree.\n", fName);
                boolean found = curr.memberList.search(name);
                if (found) {
                    System.out.printf("%s %s found in the family.\n", name, fName);
                    curr.memberList.deleteNode(name);
                    System.out.printf("%s %s is deleted!\n", name, fName);
                } else {
                    System.out.printf("%s family is found in the tree but %s member not found in the family.\n", fName, name);
                }
                return;
            } else if (curr.familyName.compareTo(fName) > 0) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        
    }

    // This method mainly calls InorderRec()
    void inorder() {
        inorderRec(root);
    }

    // In Order Traversal of the Family Tree
    // Family names and members need to be printed according to the family tree
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("---------------------------------");
            System.out.println("Family Name: " + root.familyName);
            System.out.println("Family Members:");
            root.memberList.printLinkList();
            System.out.println("---------------------------------\n");
            inorderRec(root.right);
        }
    }

    void search(String fName, String name) {
        Node curr = this.root;  // Aramaya kök düğümden başla
    
        while (curr != null) {
            if (curr.familyName.equals(fName)) {
                System.out.printf("The family name %s is found in the tree.\n", fName);
                boolean found = curr.memberList.search(name);
                if (found) {
                    System.out.printf("%s %sis found in the Tree\n", name, fName);
                } else {
                    System.out.printf("%s family is found BUT %sis not inside the Family\n", fName, name);
                }
                return;
            } else if (curr.familyName.compareTo(fName) > 0) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        System.out.printf("%s family is not in the BST\n", fName);

    }
    
    
    // Is a method to show the tree
    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int nBlanks = 35;
        boolean isRowEmpty = false;
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        
        System.out.println("FAMILIES TREE");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for (int j = 0; j < nBlanks; j++) {
                System.out.print(' ');
            }

            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.familyName);
                    localStack.push(temp.left);
                    localStack.push(temp.right);

                    if (temp.left != null
                            || temp.right != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("----");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }  // end while globalStack not empty
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }  // end while isRowEmpty is false
        System.out.println(
                "-----------------------------------------------------------------------------------------------------");
    }  // end displayTree()

}

class MyTest {

    public static void main(String[] args) {
        MyBST bst = new MyBST();

        System.out.println("-----------------------------------------------");
        System.out.println("1)INSERT Operations ");
        System.out.println("-----------------------------------------------");
        
        bst.insert("Malling", "Noel", 30);
        bst.insert("Malling", "Oralia", 25);
        bst.insert("Stagge", "Irvin", 22);
        bst.insert("Fremantle", "Sibyl", 44);
        bst.insert("Billington", "Tracie", 65);
        bst.insert("Stagge", "Patton", 20);
        bst.insert("Tiddeman", "Phaidra", 12);
        bst.insert("Billington", "Derril", 6);
        bst.insert("Cancellieri", "Viviana", 25);
        bst.insert("Stagge", "Josephina", 88);
        bst.insert("Malling", "Cathrine", 68);
        bst.insert("Fremantle", "Veradis", 50);
        bst.insert("McDavitt", "Bryce", 64);
        bst.insert("Tiddeman", "Salome", 42);
        bst.insert("Malling", "Abey", 43);
        bst.insert("Kirkhouse", "Niko", 55);
        
        bst.displayTree();
        bst.inorder();
        
        System.out.println("-----------------------------------------------");
        System.out.println("2)SEARCH Operations ");
        System.out.println("-----------------------------------------------");
        
        bst.search("Malling", "Oralia");
        bst.search("Malling", "Veradis");
        bst.search("Hamilton", "Alfred");
        bst.search("Malling", "Abey");
        
        System.out.println("-----------------------------------------------");
        System.out.println("3)DELETE Operations ");
        System.out.println("-----------------------------------------------");
        
        
        bst.delete("Billington", "Tracie");       
        bst.delete("Malling", "Oralia");
        bst.delete("Malling", "Abey");
        
        bst.delete("Hamilton", "Alfred");
        bst.delete("Malling", "Abey");
        bst.delete("Malling", "Veradis");
        bst.inorder();
    }
}
