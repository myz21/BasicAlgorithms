# CENG 202 - Data Structures  

## Lab 3: Singly Linked Lists  

### **Objective**  

The goal of this lab is to understand the **Singly Linked List** data structure and implement the following functions.  

### **Rules**  

- Cell phones are forbidden. Please put your phone in your bag.  
- You cannot leave the class early unless you have completed the tasks.  
- You can download the **Test.java** file for testing.  

---  

## **Implemented Functions**  

Below are the implemented functions for the **Singly Linked List** data structure:  

### 1. `printLinkList()`  

- **Displays the linked list from head to tail.**  
- Prints each node’s value in order, ending with `null`.  
- If the list is empty, prints `"The list is empty!"`.  

### 2. `insertToHead(String nodeData)`  

- **Inserts a new node at the beginning of the list.**  
- The new node becomes the head of the list.  

### 3. `insertToSpecificPosition(String nodeData, int position)`  

- **Inserts a new node at a specific position in the list.**  
- The index starts from `0`.  
- If `position == 0`, the node is inserted at the head.  
- If the position is out of bounds, an `"ERROR"` message is displayed.  

### 4. `delete(String key)`  

- **Deletes a node that matches the given key.**  
- If the node is found, it is removed from the list.  
- If the key does not exist, an `"ERROR"` message is displayed.  
- Returns the deleted node or `null` if not found.  

### 5. `sortedInsert(String nodeData)`  

- **Inserts a new node while maintaining alphabetical order.**  
- If the list is empty or the new node should be the new head, it is inserted at the beginning.  
- Otherwise, the list is traversed to find the correct position.  


---

## **Contributing**  

If you want to contribute to this project:  

- Open an **issue** to share your suggestions.  
- Fork the repository, make improvements, and submit a **pull request**.  

---


Let me know if you'd like any modifications! 🎯
