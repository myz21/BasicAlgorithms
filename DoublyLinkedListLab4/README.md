# CENG 202 - Data Structures

## Lab 4: Doubly Linked Lists

### **Objective**

The goal of this lab is to understand the **Doubly Linked List** data structure and implement the following functions.

### **Rules**

- Cell phones are forbidden. Please put your phone in your bag.
- You cannot leave the class early unless you have completed the tasks.
- You can download the **Test.java** file for testing.

---

## **Implemented Functions**

Below are the implemented functions for the **Doubly Linked List** data structure:

### 1. `displayBackward()`

- **Displays the linked list from tail to head.**
- Starts from the tail node, prints the data, and moves to the previous node.

### 2. `insertLast(int num)`

- **Adds the given num value as a new node at the end of the list.**
- If the list is empty, the inserted node becomes both the head and the tail.
- If the list is not empty, the new node is appended to the current tail, and the tail is updated.

### 3. `deleteFirst()`

- **Deletes the first node of the list.**
- If the list is empty, an error message is displayed.
- If there is only one element, the list becomes empty.
- If multiple nodes exist, the head is moved to the next node, and the old head is removed.

### 4. `sortedInsert(int num)`

- **Inserts the given num value in an ascending order without disrupting the linked list.**
- If the list is empty, the element directly becomes the head.
- It traverses the list from head to tail to find the appropriate position.

### 5. `deleteDuplicateValues()`

- **Removes duplicate values from the linked list.**
- The list is traversed, and consecutive duplicate nodes are removed.
- Ensures only the first occurrence of a value remains.

### 6. `searchElement(int num)`

- **Searches for a node containing the given num value.**
- The search starts from the head and moves forward.
- If the value is found, a message is displayed, and the node is returned.
- If not found, an error message is displayed, and `null` is returned.

### 7. `displayForward()`

- **Displays the linked list from head to tail.**
- Starts from the head and prints each node sequentially.

---


## **Contributing**

If you want to contribute to this project:

- Open an **issue** to share your suggestions.
- Fork the repository, make improvements, and submit a **pull request**.

---


Happy coding! 🚀


