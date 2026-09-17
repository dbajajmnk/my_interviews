# Linked List — 20 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to reverse a singly linked list.

**Input**

```text
1 -> 2 -> 3 -> 4 -> 5
```

**Output**

```text
5 -> 4 -> 3 -> 2 -> 1
```

### Q02

**Program Objective**

Write a program to find the middle node of a singly linked list.

**Input**

```text
1 -> 2 -> 3 -> 4 -> 5
```

**Output**

```text
3
```

### Q03

**Program Objective**

Write a program to determine whether a singly linked list contains a cycle. cycleIndex gives the zero-based node index that the tail points to; -1 means no cycle.

**Input**

```text
Values: [1,2,3,4]
cycleIndex: 1
```

**Output**

```text
true
```

### Q04

**Program Objective**

Write a program to merge two sorted singly linked lists.

**Input**

```text
List 1: 1 -> 2 -> 4
List 2: 1 -> 3 -> 4
```

**Output**

```text
1 -> 1 -> 2 -> 3 -> 4 -> 4
```

### Q05

**Program Objective**

Write a program to remove the nth node from the end of a singly linked list.

**Input**

```text
List: 1 -> 2 -> 3 -> 4 -> 5
n: 2
```

**Output**

```text
1 -> 2 -> 3 -> 5
```

## Core

### Q06

**Program Objective**

Write a program to determine whether a singly linked list is a palindrome.

**Input**

```text
1 -> 2 -> 2 -> 1
```

**Output**

```text
true
```

### Q07

**Program Objective**

Write a program to remove duplicate values from a sorted singly linked list.

**Input**

```text
1 -> 1 -> 2 -> 3 -> 3
```

**Output**

```text
1 -> 2 -> 3
```

### Q08

**Program Objective**

Write a program to swap every two adjacent nodes in a singly linked list.

**Input**

```text
1 -> 2 -> 3 -> 4
```

**Output**

```text
2 -> 1 -> 4 -> 3
```

### Q09

**Program Objective**

Write a program to rotate a singly linked list to the right by k positions.

**Input**

```text
List: 1 -> 2 -> 3 -> 4 -> 5
k: 2
```

**Output**

```text
4 -> 5 -> 1 -> 2 -> 3
```

### Q10

**Program Objective**

Write a program to partition a singly linked list around value x while preserving relative order within both partitions.

**Input**

```text
List: 1 -> 4 -> 3 -> 2 -> 5 -> 2
x: 3
```

**Output**

```text
1 -> 2 -> 2 -> 4 -> 3 -> 5
```

## Interview

### Q11

**Program Objective**

Write a program to return the value of the node where a linked-list cycle begins. cycleIndex gives the zero-based node index that the tail points to.

**Input**

```text
Values: [3,2,0,-4]
cycleIndex: 1
```

**Output**

```text
2
```

### Q12

**Program Objective**

Write a program to find the value at the first physically shared node of two singly linked lists. The input supplies separate prefixes followed by one shared tail.

**Input**

```text
List A prefix: [4,1]
List B prefix: [5,6,1]
Shared tail: [8,4,5]
```

**Output**

```text
8
```

### Q13

**Program Objective**

Write a program to add two non-negative integers represented by linked lists whose digits are stored in reverse order.

**Input**

```text
List 1: 2 -> 4 -> 3
List 2: 5 -> 6 -> 4
```

**Output**

```text
7 -> 0 -> 8
```

### Q14

**Program Objective**

Write a program to reverse the nodes of a singly linked list between positions left and right.

**Input**

```text
List: 1 -> 2 -> 3 -> 4 -> 5
left: 2
right: 4
```

**Output**

```text
1 -> 4 -> 3 -> 2 -> 5
```

### Q15

**Program Objective**

Write a program to reverse nodes of a singly linked list in groups of size k.

**Input**

```text
List: 1 -> 2 -> 3 -> 4 -> 5
k: 2
```

**Output**

```text
2 -> 1 -> 4 -> 3 -> 5
```

### Q16

**Program Objective**

Write a program to sort a singly linked list in ascending order.

**Input**

```text
4 -> 2 -> 1 -> 3
```

**Output**

```text
1 -> 2 -> 3 -> 4
```

## Advanced

### Q17

**Program Objective**

Write a program to reorder a singly linked list by alternating nodes from the front and back.

**Input**

```text
1 -> 2 -> 3 -> 4 -> 5
```

**Output**

```text
1 -> 5 -> 2 -> 4 -> 3
```

### Q18

**Program Objective**

Write a program to remove all nodes that have duplicate values from a sorted linked list, keeping only distinct values.

**Input**

```text
1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
```

**Output**

```text
1 -> 2 -> 5
```

### Q19

**Program Objective**

Write a program to implement a least-recently-used cache with the given capacity. For each get operation, return the stored value or -1 when absent.

**Input**

```text
Capacity: 2
Operations: put(1,1), put(2,2), get(1), put(3,3), get(2), put(4,4), get(1), get(3), get(4)
```

**Output**

```text
[1, -1, -1, 3, 4]
```

### Q20

**Program Objective**

Write a program to deep-copy a linked list whose nodes contain next and random references. Each input pair is [nodeValue, randomNodeIndex], where null means no random reference.

**Input**

```text
Nodes: [[7,null],[13,0],[11,4],[10,2],[1,0]]
```

**Output**

```text
[[7,null],[13,0],[11,4],[10,2],[1,0]]
```
