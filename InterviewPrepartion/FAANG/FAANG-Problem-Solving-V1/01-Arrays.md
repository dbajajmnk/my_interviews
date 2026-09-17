# Arrays — 30 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to find the largest element in an integer array.

**Input**

```text
[4, 2, 8, 1, 5]
```

**Output**

```text
8
```

### Q02

**Program Objective**

Write a program to find the smallest element in an integer array.

**Input**

```text
[4, 2, 8, 1, 5]
```

**Output**

```text
1
```

### Q03

**Program Objective**

Write a program to calculate the sum of all elements in an integer array.

**Input**

```text
[1, 2, 3, 4, 5]
```

**Output**

```text
15
```

### Q04

**Program Objective**

Write a program to reverse an integer array.

**Input**

```text
[10, 20, 30, 40]
```

**Output**

```text
[40, 30, 20, 10]
```

### Q05

**Program Objective**

Write a program to count the even and odd elements in an integer array.

**Input**

```text
[1, 2, 3, 4, 5, 6]
```

**Output**

```text
Even: 3
Odd: 3
```

### Q06

**Program Objective**

Write a program to find the second largest distinct element in an integer array.

**Input**

```text
[5, 2, 9, 1, 7]
```

**Output**

```text
7
```

### Q07

**Program Objective**

Write a program to remove duplicate values from an integer array while preserving first occurrence order.

**Input**

```text
[2, 2, 3, 4, 4, 5]
```

**Output**

```text
[2, 3, 4, 5]
```

### Q08

**Program Objective**

Write a program to rotate an integer array one position to the right.

**Input**

```text
[1, 2, 3, 4, 5]
```

**Output**

```text
[5, 1, 2, 3, 4]
```

## Core

### Q09

**Program Objective**

Write a program to rotate an integer array to the left by k positions.

**Input**

```text
Array: [1, 2, 3, 4, 5, 6]
k: 2
```

**Output**

```text
[3, 4, 5, 6, 1, 2]
```

### Q10

**Program Objective**

Write a program to move all zero values to the end while preserving the order of non-zero values.

**Input**

```text
[0, 1, 0, 3, 12]
```

**Output**

```text
[1, 3, 12, 0, 0]
```

### Q11

**Program Objective**

Write a program to find the missing number from an array containing distinct values from 0 to n.

**Input**

```text
[3, 0, 1]
```

**Output**

```text
2
```

### Q12

**Program Objective**

Write a program to find the single repeated value in an array of n+1 integers where every value is in the range 1 to n.

**Input**

```text
[1, 3, 4, 2, 2]
```

**Output**

```text
2
```

### Q13

**Program Objective**

Write a program to find the intersection of two integer arrays using distinct result values.

**Input**

```text
Array 1: [1, 2, 2, 1]
Array 2: [2, 2]
```

**Output**

```text
[2]
```

### Q14

**Program Objective**

Write a program to transform an integer array into its next lexicographically greater permutation; if none exists, return the smallest permutation.

**Input**

```text
[1, 2, 3]
```

**Output**

```text
[1, 3, 2]
```

### Q15

**Program Objective**

Write a program to find the maximum sum of any contiguous subarray.

**Input**

```text
[-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

**Output**

```text
6
```

### Q16

**Program Objective**

Write a program to find the product of all array elements except the element at the current index.

**Input**

```text
[1, 2, 3, 4]
```

**Output**

```text
[24, 12, 8, 6]
```

### Q17

**Program Objective**

Write a program to find an index where the sum of elements on the left equals the sum of elements on the right.

**Input**

```text
[1, 7, 3, 6, 5, 6]
```

**Output**

```text
3
```

### Q18

**Program Objective**

Write a program to find the majority element that appears more than half the length of the array.

**Input**

```text
[2, 2, 1, 1, 1, 2, 2]
```

**Output**

```text
2
```

## Interview

### Q19

**Program Objective**

Write a program to return all elements of a matrix in clockwise spiral order.

**Input**

```text
Matrix: [[1,2,3],[4,5,6],[7,8,9]]
```

**Output**

```text
[1,2,3,6,9,8,7,4,5]
```

### Q20

**Program Objective**

Write a program to find the maximum profit possible from one buy and one sell of a stock.

**Input**

```text
[7, 1, 5, 3, 6, 4]
```

**Output**

```text
5
```

### Q21

**Program Objective**

Write a program to set an entire matrix row and column to zero whenever an input cell contains zero.

**Input**

```text
Matrix: [[1,1,1],[1,0,1],[1,1,1]]
```

**Output**

```text
[[1,0,1],[0,0,0],[1,0,1]]
```

### Q22

**Program Objective**

Write a program to find the first missing positive integer.

**Input**

```text
[3, 4, -1, 1]
```

**Output**

```text
2
```

### Q23

**Program Objective**

Write a program to arrange the numbers 0, 1, and 2 in ascending order.

**Input**

```text
[2, 0, 2, 1, 1, 0]
```

**Output**

```text
[0, 0, 1, 1, 2, 2]
```

### Q24

**Program Objective**

Write a program to find all elements greater than every element to their right, preserving their original left-to-right order.

**Input**

```text
[16, 17, 4, 3, 5, 2]
```

**Output**

```text
[17, 5, 2]
```

### Q25

**Program Objective**

Write a program to return all values missing from the range 1 to n when the array length is n. Return missing values in ascending order.

**Input**

```text
[4,3,2,7,8,2,3,1]
```

**Output**

```text
[5,6]
```

### Q26

**Program Objective**

Write a program to find the maximum sum of a non-empty contiguous subarray after optionally deleting at most one element.

**Input**

```text
[1,-2,0,3]
```

**Output**

```text
4
```

## Advanced

### Q27

**Program Objective**

Write a program to find the maximum sum of a non-empty circular contiguous subarray.

**Input**

```text
[5, -3, 5]
```

**Output**

```text
10
```

### Q28

**Program Objective**

Write a program to rotate an n×n matrix 90 degrees clockwise.

**Input**

```text
Matrix: [[1,2,3],[4,5,6],[7,8,9]]
```

**Output**

```text
[[7,4,1],[8,5,2],[9,6,3]]
```

### Q29

**Program Objective**

Write a program to return all values that appear more than n/3 times in an integer array.

**Input**

```text
[3, 2, 3]
```

**Output**

```text
[3]
```

### Q30

**Program Objective**

Write a program to find the smallest positive integer value that cannot be formed as the sum of a subset of a sorted positive integer array.

**Input**

```text
[1, 1, 3, 4]
```

**Output**

```text
10
```
