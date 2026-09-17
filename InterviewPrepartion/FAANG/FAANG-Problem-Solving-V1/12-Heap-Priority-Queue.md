# Heap & Priority Queue — 15 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to find the kth largest value in an unsorted integer array.

**Input**

```text
Array: [3, 2, 1, 5, 6, 4]
k: 2
```

**Output**

```text
5
```

### Q02

**Program Objective**

Write a program to find the k smallest values in an integer array and return them in ascending order.

**Input**

```text
Array: [7, 10, 4, 3, 20, 15]
k: 3
```

**Output**

```text
[3, 4, 7]
```

### Q03

**Program Objective**

Write a program to find the k most frequent integer values, ordered by decreasing frequency and then increasing value on ties.

**Input**

```text
Array: [1, 1, 1, 2, 2, 3]
k: 2
```

**Output**

```text
[1, 2]
```

### Q04

**Program Objective**

Write a program to merge k sorted integer arrays into one sorted array.

**Input**

```text
Arrays: [[1,4,5],[1,3,4],[2,6]]
```

**Output**

```text
[1,1,2,3,4,4,5,6]
```

## Core

### Q05

**Program Objective**

Write a program to merge k sorted linked lists into one sorted linked list.

**Input**

```text
Lists: [1->4->5], [1->3->4], [2->6]
```

**Output**

```text
1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6
```

### Q06

**Program Objective**

Write a program to find the minimum total cost of repeatedly connecting ropes when connecting two ropes costs the sum of their lengths.

**Input**

```text
[4, 3, 2, 6]
```

**Output**

```text
29
```

### Q07

**Program Objective**

Write a program to find the kth smallest value in an unsorted integer array.

**Input**

```text
Array: [7, 10, 4, 3, 20, 15]
k: 3
```

**Output**

```text
7
```

### Q08

**Program Objective**

Write a program to return the k points closest to the origin in a 2D plane. Order the result by increasing squared distance, then x, then y.

**Input**

```text
Points: [[1,3],[-2,2]]
k: 1
```

**Output**

```text
[[-2,2]]
```

## Interview

### Q09

**Program Objective**

Write a program to find the kth largest value in a continuous stream after each new value arrives.

**Input**

```text
k: 3
Initial: [4,5,8,2]
Add: [3,5,10,9,4]
```

**Output**

```text
[4,5,5,8,8]
```

### Q10

**Program Objective**

Write a program to find the median after each integer is added to a data stream.

**Input**

```text
Stream: [5, 15, 1, 3]
```

**Output**

```text
[5.0,10.0,5.0,4.0]
```

### Q11

**Program Objective**

Write a program to rearrange a string so that no two adjacent characters are the same.

**Input**

```text
aab
```

**Output**

```text
aba
```

### Q12

**Program Objective**

Write a program to schedule tasks with a cooling interval and return the minimum number of time units required.

**Input**

```text
Tasks: [A,A,A,B,B,B]
Cooldown: 2
```

**Output**

```text
8
```

## Advanced

### Q13

**Program Objective**

Write a program to find the smallest numeric range that includes at least one value from each of k sorted lists.

**Input**

```text
Lists: [[4,10,15,24,26],[0,9,12,20],[5,18,22,30]]
```

**Output**

```text
[20,24]
```

### Q14

**Program Objective**

Write a program to choose at most k projects to maximize final capital. A project can be started only when current capital is at least its required capital.

**Input**

```text
k: 2
Initial capital: 0
Profits: [1,2,3]
Required capital: [0,1,1]
```

**Output**

```text
4
```

### Q15

**Program Objective**

Write a program to find the minimum total wage required to hire exactly k workers when every hired worker must receive at least their minimum wage and all hired workers must be paid in the same wage-to-quality ratio.

**Input**

```text
Quality: [10,20,5]
Minimum wage: [70,50,30]
k: 2
```

**Output**

```text
105.0
```
