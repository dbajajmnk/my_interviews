# Trees, BST & Trie — 30 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to return the preorder traversal of a binary tree.

**Input**

```text
Tree: [1,null,2,3]
```

**Output**

```text
[1, 2, 3]
```

### Q02

**Program Objective**

Write a program to return the inorder traversal of a binary tree.

**Input**

```text
Tree: [1,null,2,3]
```

**Output**

```text
[1, 3, 2]
```

### Q03

**Program Objective**

Write a program to return the postorder traversal of a binary tree.

**Input**

```text
Tree: [1,null,2,3]
```

**Output**

```text
[3, 2, 1]
```

### Q04

**Program Objective**

Write a program to return the level-order traversal of a binary tree.

**Input**

```text
Tree: [3,9,20,null,null,15,7]
```

**Output**

```text
[[3],[9,20],[15,7]]
```

### Q05

**Program Objective**

Write a program to find the maximum depth of a binary tree.

**Input**

```text
Tree: [3,9,20,null,null,15,7]
```

**Output**

```text
3
```

### Q06

**Program Objective**

Write a program to determine whether two binary trees are identical.

**Input**

```text
Tree 1: [1,2,3]
Tree 2: [1,2,3]
```

**Output**

```text
true
```

### Q07

**Program Objective**

Write a program to invert a binary tree.

**Input**

```text
Tree: [4,2,7,1,3,6,9]
```

**Output**

```text
[4,7,2,9,6,3,1]
```

### Q08

**Program Objective**

Write a program to determine whether a binary tree is symmetric around its center.

**Input**

```text
Tree: [1,2,2,3,4,4,3]
```

**Output**

```text
true
```

## Core

### Q09

**Program Objective**

Write a program to find the minimum depth of a binary tree.

**Input**

```text
Tree: [3,9,20,null,null,15,7]
```

**Output**

```text
2
```

### Q10

**Program Objective**

Write a program to process Trie operations insert, search, and startsWith. Return a boolean for each search and startsWith operation.

**Input**

```text
Operations: insert(apple), search(apple), search(app), startsWith(app), insert(app), search(app)
```

**Output**

```text
[true, false, true, true]
```

### Q11

**Program Objective**

Write a program to determine whether a binary tree satisfies the binary search tree ordering rules.

**Input**

```text
Tree: [2,1,3]
```

**Output**

```text
true
```

### Q12

**Program Objective**

Write a program to search for a target value in a binary search tree.

**Input**

```text
Tree: [4,2,7,1,3]
Target: 2
```

**Output**

```text
[2,1,3]
```

### Q13

**Program Objective**

Write a program to insert a new value into a binary search tree.

**Input**

```text
Tree: [4,2,7,1,3]
Value: 5
```

**Output**

```text
[4,2,7,1,3,5]
```

### Q14

**Program Objective**

Write a program to delete a value from a binary search tree. When the deleted node has two children, replace it with its inorder successor.

**Input**

```text
Tree: [5,3,6,2,4,null,7]
Value: 3
```

**Output**

```text
[5,4,6,2,null,null,7]
```

### Q15

**Program Objective**

Write a program to find the kth smallest value in a binary search tree.

**Input**

```text
Tree: [3,1,4,null,2]
k: 1
```

**Output**

```text
1
```

### Q16

**Program Objective**

Write a program to find the lowest common ancestor of two nodes in a binary search tree.

**Input**

```text
Tree: [6,2,8,0,4,7,9,null,null,3,5]
p: 2
q: 8
```

**Output**

```text
6
```

### Q17

**Program Objective**

Write a program to find the lowest common ancestor of two nodes in a general binary tree.

**Input**

```text
Tree: [3,5,1,6,2,0,8,null,null,7,4]
p: 5
q: 1
```

**Output**

```text
3
```

### Q18

**Program Objective**

Write a program to find the diameter of a binary tree measured in number of edges.

**Input**

```text
Tree: [1,2,3,4,5]
```

**Output**

```text
3
```

## Interview

### Q19

**Program Objective**

Write a program to determine whether a binary tree is height-balanced.

**Input**

```text
Tree: [3,9,20,null,null,15,7]
```

**Output**

```text
true
```

### Q20

**Program Objective**

Write a program to determine whether one binary tree is a subtree of another.

**Input**

```text
Tree: [3,4,5,1,2]
Subtree: [4,1,2]
```

**Output**

```text
true
```

### Q21

**Program Objective**

Write a program to return the values visible when a binary tree is viewed from the right side.

**Input**

```text
Tree: [1,2,3,null,5,null,4]
```

**Output**

```text
[1, 3, 4]
```

### Q22

**Program Objective**

Write a program to return the zigzag level-order traversal of a binary tree.

**Input**

```text
Tree: [3,9,20,null,null,15,7]
```

**Output**

```text
[[3],[20,9],[15,7]]
```

### Q23

**Program Objective**

Write a program to find the maximum sum of values along any path in a binary tree.

**Input**

```text
Tree: [-10,9,20,null,null,15,7]
```

**Output**

```text
42
```

### Q24

**Program Objective**

Write a program to count the number of root-to-leaf paths whose node values sum to a target.

**Input**

```text
Tree: [5,4,8,11,null,13,4,7,2,null,null,5,1]
Target: 22
```

**Output**

```text
2
```

### Q25

**Program Objective**

Write a program to serialize a binary tree using preorder traversal, commas between tokens, and # for null children.

**Input**

```text
Tree: [1,2,3,null,null,4,5]
```

**Output**

```text
1,2,#,#,3,4,#,#,5,#,#
```

### Q26

**Program Objective**

Write a program to reconstruct a binary tree from its preorder and inorder traversal sequences.

**Input**

```text
Preorder: [3,9,20,15,7]
Inorder: [9,3,15,20,7]
```

**Output**

```text
[3,9,20,null,null,15,7]
```

## Advanced

### Q27

**Program Objective**

Write a program to reconstruct a binary tree from its inorder and postorder traversal sequences.

**Input**

```text
Inorder: [9,3,15,20,7]
Postorder: [9,15,7,20,3]
```

**Output**

```text
[3,9,20,null,null,15,7]
```

### Q28

**Program Objective**

Write a program to flatten a binary tree into a linked-list-like right-child chain following preorder traversal.

**Input**

```text
Tree: [1,2,5,3,4,null,6]
```

**Output**

```text
1 -> 2 -> 3 -> 4 -> 5 -> 6
```

### Q29

**Program Objective**

Write a program to find the vertical-order traversal of a binary tree, ordering columns from left to right and nodes within a column from top to bottom; preserve left-to-right order when row and column are equal.

**Input**

```text
Tree: [3,9,20,null,null,15,7]
```

**Output**

```text
[[9],[3,15],[20],[7]]
```

### Q30

**Program Objective**

Write a program to recover a binary search tree in which exactly two node values were swapped.

**Input**

```text
Tree: [3,1,4,null,null,2]
```

**Output**

```text
[2,1,4,null,null,3]
```
