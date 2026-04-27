# Assignment 3: Sorting and Searching Algorithm Analysis

## A. Project Overview

Selected algorithms:
  Basic sorting - Bubble Sort
  Advanced sorting - Merge Sort
  Searching - Binary Search

The purpose of the experiment is to measure execution time and compare performance using different input sizes. Also comparing the random and sorted arrays

---

## B. Algorithm Descriptions

### 1. Bubble Sort
Bubble Sort is the basic sorting algorithm which comparess adjacent elements and swaps them if they are in the wrong order

Time Complexity:
- Worst: O(n²)
- Best: O(n)

---

### 2. Merge Sort
Merge Sort is the advanced sorting algorithm uses a divide-and-conquer approach. It splits an array into 2 halves and reapeat until array become atomic(1-2 element in it). Merge them back while comaparing elemetns from both arrays
Time Complexity:
- O(n log n)

---

### 3. Binary Search
Binary Search works only on a sorted array. Take the target with middle element of the array and if it is not found. It cuts off the hlaf of the array and continue its iterations

Time Complexity:
- O(log n)

---

## C. Experimental Results

### Random Array

| Size | Bubble Sort (ns) | Merge Sort (ns) |
|------|------------------|-----------------|
| 10   | 6400             | 4700            |
| 100  | 152500           | 90000           |
| 1000 | 4861300          | 170200          |

### Sorted Array

| Size | Bubble Sort (ns) | Merge Sort (ns) |
|------|------------------|-----------------|
| 10   | 1600             | 7900            |
| 100  | 99900            | 51400           |
| 1000 | 3065200          | 143400          |

### Search Time

| Size | Binary Search (ns) |
|------|--------------------|
| 10   | 2100               |
| 100  | 1100               |
| 1000 | 3700               |

### Observations

- Merge Sort is significantly faster on large arrays than Bubble Sort because of the different time complexities. Therefore Bubble Sort becomes slower as input sizes increases. 
- Binary Search is very fast due to logarithmic complexity. To measure the binary search we used target = size/2

---

## D. Screenshots

<img width="293" height="286" alt="10elements" src="https://github.com/user-attachments/assets/bd136af8-c638-4289-bf32-c1cecab38c26" />

<img width="293" height="285" alt="100elements" src="https://github.com/user-attachments/assets/8323aa3f-5ff6-4b92-a877-f89e9f860877" />

<img width="298" height="291" alt="1000elements" src="https://github.com/user-attachments/assets/3ae790fa-70d1-448e-bdf7-adacf73d189b" />


## E. Analysis

  This assignment clearly shows the difference between basic sort algorithm and advances one. Namely difference between Bubble Sort and Merge Sort.
  The Merge Sort illustrates much better performance in the term of the speed. Because its tine complexity is O(n log n). It also illustrates that both sorting algorithms' execution time directly proportional to the n(data input size)
  In comparison between sorted and random arrays, the sorted array generally shows the better results, because while execution it perform the best case of time complexity of Bubble Sort and Merge Sort, where all elements are already in ascending order. The results of both array clearly illustrates Big-O complexity
  Binary search perform fast performance due to the fact that it is being held on the sorted array. Binary search works only with sorted array, because it compares the middle element and cuts off the half od the array depending on condition assuming that the array in ascending order
  In conclusion, all the goals were accomplished and it has matched with the thoretical material about Time Complexity.
