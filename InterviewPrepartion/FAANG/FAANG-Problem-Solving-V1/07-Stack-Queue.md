# Stack & Queue — 20 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to determine whether a string containing brackets is valid and properly nested.

**Input**

```text
()[]{}
```

**Output**

```text
true
```

### Q02

**Program Objective**

Write a program to determine whether an incorrectly nested bracket string is valid.

**Input**

```text
([)]
```

**Output**

```text
false
```

### Q03

**Program Objective**

Write a program to evaluate an expression written in postfix notation.

**Input**

```text
3 4 + 2 *
```

**Output**

```text
14
```

### Q04

**Program Objective**

Write a program to remove adjacent duplicate characters repeatedly until no adjacent duplicates remain.

**Input**

```text
abbaca
```

**Output**

```text
ca
```

### Q05

**Program Objective**

Write a program to find the next greater value to the right for every array element.

**Input**

```text
[2, 1, 2, 4, 3]
```

**Output**

```text
[4, 2, 4, -1, -1]
```

## Core

### Q06

**Program Objective**

Write a program to find the previous smaller value to the left for every array element.

**Input**

```text
[4, 5, 2, 10, 8]
```

**Output**

```text
[-1, 4, -1, 2, 2]
```

### Q07

**Program Objective**

Write a program to calculate, for each daily temperature, how many days must pass before a warmer temperature occurs.

**Input**

```text
[73, 74, 75, 71, 69, 72, 76, 73]
```

**Output**

```text
[1, 1, 4, 2, 1, 1, 0, 0]
```

### Q08

**Program Objective**

Write a program to calculate the largest rectangle area that can be formed in a histogram.

**Input**

```text
[2, 1, 5, 6, 2, 3]
```

**Output**

```text
10
```

### Q09

**Program Objective**

Write a program to calculate the stock span for each day, where the span is the number of consecutive days ending today whose price is less than or equal to today's price.

**Input**

```text
[100, 80, 60, 70, 60, 75, 85]
```

**Output**

```text
[1, 1, 1, 2, 1, 4, 6]
```

### Q10

**Program Objective**

Write a program to implement a stack that can return its current minimum value after each operation.

**Input**

```text
Operations: push 5, push 3, push 7, getMin, pop, getMin
```

**Output**

```text
[3, 3]
```

## Interview

### Q11

**Program Objective**

Write a program to implement a queue using only stack operations.

**Input**

```text
Operations: enqueue 10, enqueue 20, enqueue 30, dequeue, front
```

**Output**

```text
Dequeued: 10
Front: 20
```

### Q12

**Program Objective**

Write a program to implement a stack using only queue operations.

**Input**

```text
Operations: push 10, push 20, push 30, pop, top
```

**Output**

```text
Popped: 30
Top: 20
```

### Q13

**Program Objective**

Write a program to simplify an absolute Unix-style file path.

**Input**

```text
/a/./b/../../c/
```

**Output**

```text
/c
```

### Q14

**Program Objective**

Write a program to decode a string where bracketed content is repeated according to the number immediately before it.

**Input**

```text
3[a2[c]]
```

**Output**

```text
accaccacc
```

### Q15

**Program Objective**

Write a program to remove k digits from a numeric string so that the resulting number is as small as possible.

**Input**

```text
Number: 1432219
k: 3
```

**Output**

```text
1219
```

### Q16

**Program Objective**

Write a program to find the length of the longest valid parentheses substring.

**Input**

```text
(()
```

**Output**

```text
2
```

## Advanced

### Q17

**Program Objective**

Write a program to calculate the result of an arithmetic expression containing non-negative integers, +, -, *, /, and spaces.

**Input**

```text
3+2*2
```

**Output**

```text
7
```

### Q18

**Program Objective**

Write a program to find the maximum rectangular area containing only 1 values in a binary matrix.

**Input**

```text
Matrix: [[1,0,1,0,0],[1,0,1,1,1],[1,1,1,1,1],[1,0,0,1,0]]
```

**Output**

```text
6
```

### Q19

**Program Objective**

Write a program to find the celebrity in a group when a celebrity is known by everyone but knows nobody.

**Input**

```text
Knows matrix: [[0,1,0],[0,0,0],[0,1,0]]
```

**Output**

```text
1
```

### Q20

**Program Objective**

Write a program to return the smallest lexicographical subsequence containing every distinct character exactly once.

**Input**

```text
cbacdcbc
```

**Output**

```text
acdb
```
