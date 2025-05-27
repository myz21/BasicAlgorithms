# CENG 202 - Data Structures

## Lab 6: Binary Search Tree – Family Directory

I have successfully completed this lab project by myself.  
The goal was to understand how Binary Search Trees (BSTs) work, and how we can combine them with Linked Lists to manage grouped data — in this case, family members with the same surname.

---

### 📌 Purpose

The main purpose of this lab was to improve our understanding of **Binary Search Trees (BSTs)** and **Linked Lists** by building a structure that organizes people by their family names.

---

### 🧠 Project Summary

In this lab, I built a **Family Binary Search Tree** where:

- Each node represents a **family surname**.
- Each node contains a **linked list** (`FamilyLinkedList`) of people with that surname.

I implemented both the tree and the list myself and handled all the required operations such as inserting, searching, and deleting people from the structure.

---

### 🔧 Implemented Functionalities

#### 🔸 Binary Search Tree (BST):

- `insert(String name, String familyName, int age)`  
  → Adds a person under the correct family node.  
- `search(String name)`  
  → Iteratively searches for a person in the tree.  
- `delete(String name)`  
  → Iteratively removes a person from the tree if found.  

#### 🔸 FamilyLinkedList:

- `insertNode(String name, int age)`  
- `search(String name): boolean`  
- `deleteNode(String name): boolean`  

Each family node uses this list to manage multiple people with the same surname.

---

### 🧪 Testing

A file named `Test.java` was provided to test the implementation.  
I verified that my methods work correctly and match the expected output.

---

### 📚 Notes

- I made sure that method names and parameters match the requirements.
- The BST keeps nodes in correct alphabetical order based on `familyName`.
- I used **iterative** versions for both search and delete methods as asked.

---

I’ve completed the whole lab on my own. If you are working on something similar, I hope this helps you as a reference.

Happy coding! 🚀

