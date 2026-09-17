# Backtracking — 10 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to generate all permutations of a list of distinct integers and return them in lexicographic order.

**Input**

```text
[1, 2, 3]
```

**Output**

```text
[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
```

### Q02

**Program Objective**

Write a program to generate all subsets of a list of distinct integers, ordered first by subset size and then lexicographically.

**Input**

```text
[1, 2]
```

**Output**

```text
[[], [1], [2], [1,2]]
```

### Q03

**Program Objective**

Write a program to generate all valid combinations of n pairs of parentheses and return them in lexicographic order.

**Input**

```text
3
```

**Output**

```text
["((()))","(()())","(())()","()(())","()()()"]
```

## Core

### Q04

**Program Objective**

Write a program to find all combinations of candidate values that sum to a target where a value may be reused. Values inside each combination must be nondecreasing, and the combination list must be lexicographic.

**Input**

```text
Candidates: [2, 3, 6, 7]
Target: 7
```

**Output**

```text
[[2,2,3],[7]]
```

### Q05

**Program Objective**

Write a program to generate all letter combinations represented by a phone keypad digit string.

**Input**

```text
23
```

**Output**

```text
["ad","ae","af","bd","be","bf","cd","ce","cf"]
```

### Q06

**Program Objective**

Write a program to find all possible paths from the top-left to the bottom-right of a grid containing blocked cells.

**Input**

```text
Grid: [[1,0,0],[1,1,0],[0,1,1]]
```

**Output**

```text
["DRDR"]
```

## Interview

### Q07

**Program Objective**

Write a program to place n queens on an n×n chessboard so that no two queens attack each other and return the number of valid arrangements.

**Input**

```text
4
```

**Output**

```text
2
```

### Q08

**Program Objective**

Write a program to determine whether a word can be formed in a character grid by moving horizontally or vertically without reusing a cell.

**Input**

```text
Board: [[A,B,C,E],[S,F,C,S],[A,D,E,E]]
Word: ABCCED
```

**Output**

```text
true
```

### Q09

**Program Objective**

Write a program to partition a string into all possible lists of palindromic substrings and return the partition lists in lexicographic order.

**Input**

```text
aab
```

**Output**

```text
[["a","a","b"],["aa","b"]]
```

## Advanced

### Q10

**Program Objective**

Write a program to fill a 9×9 Sudoku board and return the completed board.

**Input**

```text
Board: [[5,3,.,.,7,.,.,.,.],[6,.,.,1,9,5,.,.,.],[.,9,8,.,.,.,.,6,.],[8,.,.,.,6,.,.,.,3],[4,.,.,8,.,3,.,.,1],[7,.,.,.,2,.,.,.,6],[.,6,.,.,.,.,2,8,.],[.,.,.,4,1,9,.,.,5],[.,.,.,.,8,.,.,7,9]]
```

**Output**

```text
[[5,3,4,6,7,8,9,1,2],[6,7,2,1,9,5,3,4,8],[1,9,8,3,4,2,5,6,7],[8,5,9,7,6,1,4,2,3],[4,2,6,8,5,3,7,9,1],[7,1,3,9,2,4,8,5,6],[9,6,1,5,3,7,2,8,4],[2,8,7,4,1,9,6,3,5],[3,4,5,2,8,6,1,7,9]]
```
