# Stack & Queue Validation Project

## 📌 Project Description
This project implements **Stack** and **Queue** data structures to validate parentheses in expressions and determine if three given queues can be equalized.

## 🏆 Features
### 1. **Stack-Based Parentheses Validation**
- Checks whether a given string has properly matched parentheses.
- Uses a **linked-list-based stack** implementation.
- Supports round `()`, curly `{}`, and square `[]` brackets.

### 2. **Queue Equalization**
- Determines if three queues can be made equal by only dequeuing elements.
- Uses a **linked-list-based queue** implementation.
- Implemented using **recursion** with the help of a **Pakistani friend**.

## 📂 File Structure
- `Test.java` - Contains stack implementation and validation logic.
- `Test2.java` - Contains queue implementation and equalization logic.
- `README.md` - This documentation file.

## 🛠️ How It Works
### Stack (Parentheses Validation)
1. Push opening brackets `(`, `{`, `[` onto the stack.
2. When encountering a closing bracket, check if it matches the top of the stack.
3. If matched, pop the stack; otherwise, return an error.
4. At the end, if the stack is empty, the expression is **ACCEPTED**.

#### Example Inputs & Outputs
```
Input: "System.out.println((3+5) + 2);"
Output: ACCEPTED

Input: "int x = (3+5) * 2);"
Output: ) is missing
```

### Queue (Equalization Check)
1. Compute the sum of all three queues.
2. Recursively dequeue from the largest queue until all sums are equal.
3. Return the maximum possible equal sum.

#### Example Outputs
```
Test Case #1: 0
Test Case #2: 5
```

## ▶️ How to Run
1. Compile the Java files:
   ```bash
   javac Test.java Test2.java
   ```
2. Run the programs:
   ```bash
   java Test
   java Test2
   ```

## 💡 Notes
- The stack and queue are implemented using **linked lists**.
- The parentheses checker supports nested and mixed bracket types.
- The queue equalization only allows dequeuing, no new elements can be added.
- The queue equalization algorithm was implemented using **recursion**, with the valuable contribution of a **Pakistani friend**.

## 👨‍💻 Author
**CENG 202 - Data Structures Lab 5**

