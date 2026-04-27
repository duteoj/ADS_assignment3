# Assignment 3: Sorting and Searching Algorithm Analysis

## A. Project Overview

Selected algorithms:
  Basic sorting - Bubble Sort
  Advanced sorting - Merge Sort
  Searching - Binary Search

The purpose of the experiment is to measure execution time and compare performance using different input sizes and data types.

---

## B. Algorithm Descriptions

### 1. Bubble Sort
Bubble Sort repeatedly compares adjacent elements and swaps them if they are in the wrong order.

Time Complexity:
- Worst: O(n²)
- Best: O(n)

---

### 2. Merge Sort
Merge Sort uses a divide-and-conquer approach:
- Splits the array into halves
- Recursively sorts each half
- Merges them back

Time Complexity:
- O(n log n)

---

### 3. Binary Search
Binary Search works on a sorted array:
- Compares target with middle element
- Eliminates half of the array each step

Time Complexity:
- O(log n)

---

## C. Experimental Results

### Example Results

| Size | Bubble Sort (ns) | Merge Sort (ns) | Binary Search (ns) |
|------|------------------|-----------------|--------------------|
| 10   | ...              | ...             | ...                |
| 100  | ...              | ...             | ...                |
| 1000 | ...              | ...             | ...                |

### Observations

- Merge Sort is significantly faster on large arrays
- Bubble Sort becomes very slow as size increases
- Binary Search is very fast due to logarithmic complexity

---

## D. Screenshots

(Add screenshots of your program output here)

---

## E. Analysis

### Which sorting algorithm performed faster? Why?
Merge Sort performed faster because it has O(n log n) complexity, while Bubble Sort has O(n²). For large arrays, Bubble Sort becomes much slower.

---

### How does performance change with input size?
As input size increases:
- Bubble Sort time increases dramatically
- Merge Sort grows much slower

---

### How does sorted vs unsorted data affect performance?
- Bubble Sort works faster on already sorted arrays (best case O(n))
- Merge Sort performance remains stable regardless of input

---

### Do results match Big-O complexity?
Yes. The results follow theoretical expectations:
- Bubble Sort behaves like O(n²)
- Merge Sort behaves like O(n log n)

---

### Which searching algorithm is more efficient? Why?
Binary Search is more efficient because it reduces the search space by half each step (O(log n)).

---

### Why does Binary Search require a sorted array?
Because it relies on comparing the middle element and deciding which half to discard. Without sorting, this logic does not work.

---

## F. Reflection

During this project, I learned how different algorithms perform in practice. Although theoretical complexity gives an idea, actual performance also depends on implementation and input data.

One challenge was implementing Merge Sort correctly and debugging errors. I also learned how important it is to measure performance properly using System.nanoTime().

---
