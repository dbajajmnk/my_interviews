# Dynamic Programming — 35 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to find the nth Fibonacci number.

**Input**

```text
10
```

**Output**

```text
55
```

### Q02

**Program Objective**

Write a program to count the number of ways to climb n stairs by taking 1 or 2 steps at a time.

**Input**

```text
5
```

**Output**

```text
8
```

### Q03

**Program Objective**

Write a program to find the minimum cost required to reach the top of a staircase when each step has a cost.

**Input**

```text
[10,15,20]
```

**Output**

```text
15
```

### Q04

**Program Objective**

Write a program to find the maximum sum of non-adjacent values in an integer array.

**Input**

```text
[2,7,9,3,1]
```

**Output**

```text
12
```

### Q05

**Program Objective**

Write a program to find the maximum amount that can be taken from circularly arranged houses without taking adjacent houses.

**Input**

```text
[2,3,2]
```

**Output**

```text
3
```

### Q06

**Program Objective**

Write a program to count the number of unique paths from the top-left to bottom-right of an m×n grid using only right or down moves.

**Input**

```text
m: 3
n: 7
```

**Output**

```text
28
```

### Q07

**Program Objective**

Write a program to count unique paths through a grid containing obstacles.

**Input**

```text
Grid: [[0,0,0],[0,1,0],[0,0,0]]
```

**Output**

```text
2
```

### Q08

**Program Objective**

Write a program to find the minimum path sum from the top-left to bottom-right of a grid using only right or down moves.

**Input**

```text
Grid: [[1,3,1],[1,5,1],[4,2,1]]
```

**Output**

```text
7
```

## Core

### Q09

**Program Objective**

Write a program to find the minimum total path sum from the top to the bottom of a triangle of numbers.

**Input**

```text
Triangle: [[2],[3,4],[6,5,7],[4,1,8,3]]
```

**Output**

```text
11
```

### Q10

**Program Objective**

Write a program to find the area of the largest square containing only 1 values in a binary matrix.

**Input**

```text
Matrix: [[1,0,1,0,0],[1,0,1,1,1],[1,1,1,1,1],[1,0,0,1,0]]
```

**Output**

```text
4
```

### Q11

**Program Objective**

Write a program to determine whether an integer array can be partitioned into two subsets having equal sums.

**Input**

```text
[1,5,11,5]
```

**Output**

```text
true
```

### Q12

**Program Objective**

Write a program to find whether any subset of an integer array sums exactly to a target value.

**Input**

```text
Array: [3,34,4,12,5,2]
Target: 9
```

**Output**

```text
true
```

### Q13

**Program Objective**

Write a program to count how many subsets of an integer array sum to a target value.

**Input**

```text
Array: [1,2,3,3]
Target: 6
```

**Output**

```text
3
```

### Q14

**Program Objective**

Write a program to find the minimum number of coins required to make a target amount.

**Input**

```text
Coins: [1,2,5]
Amount: 11
```

**Output**

```text
3
```

### Q15

**Program Objective**

Write a program to count the number of different combinations of coins that make a target amount.

**Input**

```text
Coins: [1,2,5]
Amount: 5
```

**Output**

```text
4
```

### Q16

**Program Objective**

Write a program to find the maximum value obtainable in a 0/1 knapsack.

**Input**

```text
Weights: [1,3,4,5]
Values: [1,4,5,7]
Capacity: 7
```

**Output**

```text
9
```

### Q17

**Program Objective**

Write a program to find the length of the longest common subsequence between two strings.

**Input**

```text
String 1: abcde
String 2: ace
```

**Output**

```text
3
```

### Q18

**Program Objective**

Write a program to find the length of the longest common substring between two strings.

**Input**

```text
String 1: abcde
String 2: abfce
```

**Output**

```text
2
```

### Q19

**Program Objective**

Write a program to find the minimum number of single-character insertions, deletions, and replacements required to transform one string into another.

**Input**

```text
String 1: horse
String 2: ros
```

**Output**

```text
3
```

### Q20

**Program Objective**

Write a program to determine whether a string can be segmented into dictionary words.

**Input**

```text
String: leetcode
Dictionary: [leet,code]
```

**Output**

```text
true
```

## Interview

### Q21

**Program Objective**

Write a program to find the length of the longest increasing subsequence.

**Input**

```text
[10,9,2,5,3,7,101,18]
```

**Output**

```text
4
```

### Q22

**Program Objective**

Write a program to find the number of distinct longest increasing subsequences.

**Input**

```text
[1,3,5,4,7]
```

**Output**

```text
2
```

### Q23

**Program Objective**

Write a program to find the length of the longest palindromic subsequence.

**Input**

```text
bbbab
```

**Output**

```text
4
```

### Q24

**Program Objective**

Write a program to count how many distinct subsequences of a source string equal a target string.

**Input**

```text
Source: rabbbit
Target: rabbit
```

**Output**

```text
3
```

### Q25

**Program Objective**

Write a program to count all palindromic substrings in a string.

**Input**

```text
aaa
```

**Output**

```text
6
```

### Q26

**Program Objective**

Write a program to find the minimum number of cuts required to partition a string into palindromic substrings.

**Input**

```text
aab
```

**Output**

```text
1
```

### Q27

**Program Objective**

Write a program to find the maximum product of any contiguous subarray.

**Input**

```text
[2,3,-2,4]
```

**Output**

```text
6
```

### Q28

**Program Objective**

Write a program to count the number of ways to assign + and - signs to array elements so the resulting sum equals a target.

**Input**

```text
Array: [1,1,1,1,1]
Target: 3
```

**Output**

```text
5
```

### Q29

**Program Objective**

Write a program to find the maximum profit from stock prices using at most two transactions.

**Input**

```text
[3,3,5,0,0,3,1,4]
```

**Output**

```text
6
```

### Q30

**Program Objective**

Write a program to find the maximum profit from stock prices using at most k transactions.

**Input**

```text
Prices: [2,4,1]
k: 2
```

**Output**

```text
2
```

## Advanced

### Q31

**Program Objective**

Write a program to find the maximum profit from stock prices when each sale has a transaction fee.

**Input**

```text
Prices: [1,3,2,8,4,9]
Fee: 2
```

**Output**

```text
8
```

### Q32

**Program Objective**

Write a program to find the maximum profit from stock prices when one cooldown day is required after each sale.

**Input**

```text
[1,2,3,0,2]
```

**Output**

```text
3
```

### Q33

**Program Objective**

Write a program to determine whether a wildcard pattern containing ? and * matches an entire string.

**Input**

```text
String: adceb
Pattern: *a*b
```

**Output**

```text
true
```

### Q34

**Program Objective**

Write a program to determine whether a regular expression containing . and * matches an entire string.

**Input**

```text
String: aab
Pattern: c*a*b
```

**Output**

```text
true
```

### Q35

**Program Objective**

Write a program to find the minimum number of turns required by a printer that can print a sequence of identical characters in one turn.

**Input**

```text
aba
```

**Output**

```text
2
```
