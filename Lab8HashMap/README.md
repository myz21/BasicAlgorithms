
# CENG 202 - Data Structures

## Lab 8: Hash Tables – String Management

### ✅ Completed by Me

In this lab, I implemented a basic **Hash Table** to store and manage strings.  
To handle collisions, I used **chaining**, which means each index of the table holds a **linked list** of strings that share the same hash value.

---

### 🔧 Implemented Methods

- `hashFunc(String key)`  
  → Calculates index: `(key.length() + 3) % arraySize`

- `insert(String key)`  
  → Adds a string into the correct linked list at the hash index

- `delete(String key)`  
  → Removes the string from the list, if found

- `search(String key)`  
  → Searches the table and returns the node or null

- `displayTable()`  
  → Prints the full table with lists at each index

---

### 💡 Example Output

```

1-List: Ali -> Can ->
3-List: Deniz ->
4-List: Mehmet -> A ->

```

---

This lab helped me learn how hash tables work and how to manage **collisions using chaining**.  
I finished the implementation and tested all functions successfully.


