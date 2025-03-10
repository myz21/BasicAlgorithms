# CENG101: Introduction to Computer Engineering - Homework 1

## Overview

This assignment consists of two tasks. Task 1 involves simulating a simple programming language with operations on a variable. Task 2 focuses on decoding an encoded string back to its original form based on a given encoding rule.

## Task 1: Operations on Variable A

### Problem Description
In the CENG_101 language, we have a single variable `A`. The language supports three operations:
1. `**` operation: Computes `A^2` and assigns it to `A`.
2. `++` operation: Increases `A` by 1.
3. `--` operation: Decreases `A` by 1.

Your program will process a sequence of statements that manipulate the variable `A` starting from an initial value of 0. For each operation, you will modify `A` accordingly.

### Input Format
- The first line contains an integer `n`, representing the number of statements.
- Each of the next `n` lines contains a single statement that manipulates `A`. Each statement consists of exactly one operation (`**`, `++`, or `--`) and the variable `A`, with no spaces between them.

### Output Format
- Output a single integer representing the final value of `A` after all the statements are executed.

### Example Input
```
7
++A
A++
A**
A--
**A
--A
A--
```

### Example Output
```
7
```

---

## Task 2: Decoding an Encoded String

### Problem Description
Given an encoded string based on a specific rule, your task is to decode it back to its original string. The encoding works as follows:
1. If the letter's position in the alphabet is a single-digit number, it is written directly.
2. If the letter's position is a two-digit number (10 or greater), the number is followed by a `0`.

For example:
- `'l'` (12th letter) becomes `"120"`.
- `'a'` (1st letter) becomes `"1"`.
- `'m'` (13th letter) becomes `"130"`.
- `'p'` (16th letter) becomes `"160"`.

### Input Format
- The first line contains an integer `n`, representing the number of encoded strings.
- The next `n` lines contain two values:
  1. An integer `m`, representing the length of the encoded string.
  2. A string consisting of `m` digits that follow the encoding rule.

### Output Format
For each encoded string, output the decoded string on a new line.

### Example Input
```
3
4 2606
7 1111100
5 11111
```

### Example Output
```
zf
aaaaj
aaaaa
```

---

## Running the Program

### Requirements
- Java Development Kit (JDK) 8 or later installed.
  
### Compilation and Execution
To compile and run the program, follow these steps:

1. **Compile** the program:
   ```bash
   javac Yourfirstname_Yourlastname_Task1.java
   ```

2. **Run** the program:
   ```bash
   java Yourfirstname_Yourlastname_Task1
   ```

3. **Input**:
   Provide the input in the format described above.

4. **Output**:
   The program will output the final value of `A` after processing the operations for Task 1 or the decoded string for Task 2.



