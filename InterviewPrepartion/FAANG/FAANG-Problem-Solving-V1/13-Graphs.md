# Graphs — 30 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to return a breadth-first traversal of an undirected graph starting from node 0, visiting adjacent vertices in the order listed.

**Input**

```text
Graph: 0:[1,2], 1:[0,3], 2:[0,4], 3:[1], 4:[2]
```

**Output**

```text
[0,1,2,3,4]
```

### Q02

**Program Objective**

Write a program to return a depth-first traversal of an undirected graph starting from node 0, visiting adjacent vertices in the order listed.

**Input**

```text
Graph: 0:[1,2], 1:[0,3], 2:[0,4], 3:[1], 4:[2]
```

**Output**

```text
[0,1,3,2,4]
```

### Q03

**Program Objective**

Write a program to determine whether an undirected graph contains a cycle.

**Input**

```text
Edges: [[0,1],[1,2],[2,0]]
```

**Output**

```text
true
```

### Q04

**Program Objective**

Write a program to determine whether a directed graph contains a cycle.

**Input**

```text
Edges: [[0,1],[1,2],[2,0]]
```

**Output**

```text
true
```

### Q05

**Program Objective**

Write a program to count the number of connected components in an undirected graph.

**Input**

```text
n: 5
Edges: [[0,1],[1,2],[3,4]]
```

**Output**

```text
2
```

### Q06

**Program Objective**

Write a program to find the redundant edge whose removal makes an undirected graph containing one extra edge become a tree. If multiple answers are possible, return the edge that appears last in the input.

**Input**

```text
Edges: [[1,2],[1,3],[2,3]]
```

**Output**

```text
[2,3]
```

### Q07

**Program Objective**

Write a program to count the number of islands in a grid where 1 represents land and 0 represents water.

**Input**

```text
Grid: [[1,1,0,0],[1,0,0,1],[0,0,1,1],[0,0,0,0]]
```

**Output**

```text
2
```

### Q08

**Program Objective**

Write a program to calculate the size of the largest island in a binary grid.

**Input**

```text
Grid: [[0,0,1,0],[1,1,1,0],[0,1,0,0],[1,0,0,1]]
```

**Output**

```text
5
```

## Core

### Q09

**Program Objective**

Write a program to replace all land cells connected to a starting cell with a new color value.

**Input**

```text
Image: [[1,1,1],[1,1,0],[1,0,1]]
Start: (1,1)
New color: 2
```

**Output**

```text
[[2,2,2],[2,2,0],[2,0,1]]
```

### Q10

**Program Objective**

Write a program to find the minimum number of minutes required for all fresh oranges to become rotten.

**Input**

```text
Grid: [[2,1,1],[1,1,0],[0,1,1]]
```

**Output**

```text
4
```

### Q11

**Program Objective**

Write a program to determine whether all courses can be completed given prerequisite pairs.

**Input**

```text
Courses: 2
Prerequisites: [[1,0]]
```

**Output**

```text
true
```

### Q12

**Program Objective**

Write a program to return the lexicographically smallest valid order in which all courses can be completed.

**Input**

```text
Courses: 4
Prerequisites: [[1,0],[2,0],[3,1],[3,2]]
```

**Output**

```text
[0,1,2,3]
```

### Q13

**Program Objective**

Write a program to determine whether an undirected graph is bipartite.

**Input**

```text
Graph: [[1,3],[0,2],[1,3],[0,2]]
```

**Output**

```text
true
```

### Q14

**Program Objective**

Write a program to find the shortest number of edges between two vertices in an unweighted graph.

**Input**

```text
Edges: [[0,1],[0,2],[1,3],[2,3],[3,4]]
Source: 0
Destination: 4
```

**Output**

```text
3
```

### Q15

**Program Objective**

Write a program to find the shortest distance from source vertex 0 to vertices 0 through 3 in a directed graph with non-negative edge weights.

**Input**

```text
Edges: [[0,1,4],[0,2,1],[2,1,2],[1,3,1],[2,3,5]]
Source: 0
```

**Output**

```text
[0,3,1,4]
```

### Q16

**Program Objective**

Write a program to find the cheapest price from a source city to a destination city with at most k stops.

**Input**

```text
n: 4
Flights: [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]]
Source: 0
Destination: 3
k: 1
```

**Output**

```text
700
```

### Q17

**Program Objective**

Write a program to find the minimum total weight required to connect every vertex in a connected undirected weighted graph.

**Input**

```text
Edges: [[0,1,1],[0,2,4],[1,2,2],[1,3,5],[2,3,3]]
```

**Output**

```text
6
```

### Q18

**Program Objective**

Write a program to count the number of distinct paths from the top-left to the bottom-right of a grid while avoiding blocked cells.

**Input**

```text
Grid: [[0,0,0],[0,1,0],[0,0,0]]
```

**Output**

```text
2
```

## Interview

### Q19

**Program Objective**

Write a program to find the shortest path length in a binary matrix when movement is allowed in eight directions.

**Input**

```text
Grid: [[0,1],[1,0]]
```

**Output**

```text
2
```

### Q20

**Program Objective**

Write a program to find the minimum number of single-character transformations needed to change one word into another using only dictionary words.

**Input**

```text
Begin: hit
End: cog
Words: [hot,dot,dog,lot,log,cog]
```

**Output**

```text
5
```

### Q21

**Program Objective**

Write a program to find all cells from which water can flow to both the Pacific and Atlantic boundaries of a height matrix. Return coordinates sorted by row and then column.

**Input**

```text
Heights: [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
```

**Output**

```text
[(0,4),(1,3),(1,4),(2,2),(3,0),(3,1),(4,0)]
```

### Q22

**Program Objective**

Write a program to replace all O regions completely surrounded by X values with X.

**Input**

```text
Board: [[X,X,X,X],[X,O,O,X],[X,X,O,X],[X,O,X,X]]
```

**Output**

```text
[[X,X,X,X],[X,X,X,X],[X,X,X,X],[X,O,X,X]]
```

### Q23

**Program Objective**

Write a program to determine the order of characters in an unknown alphabet from a sorted list of words.

**Input**

```text
Words: [wrt,wrf,er,ett,rftt]
```

**Output**

```text
wertf
```

### Q24

**Program Objective**

Write a program to find all bridges in an undirected graph. Store each edge as [smallerVertex, largerVertex] and return the edge list lexicographically.

**Input**

```text
n: 4
Edges: [[0,1],[1,2],[2,0],[1,3]]
```

**Output**

```text
[[1,3]]
```

### Q25

**Program Objective**

Write a program to find all articulation points in an undirected graph and return their vertex numbers in ascending order.

**Input**

```text
n: 5
Edges: [[1,0],[0,2],[2,1],[0,3],[3,4]]
```

**Output**

```text
[0,3]
```

### Q26

**Program Objective**

Write a program to count the number of strongly connected components in a directed graph.

**Input**

```text
n: 5
Edges: [[1,0],[0,2],[2,1],[0,3],[3,4]]
```

**Output**

```text
3
```

## Advanced

### Q27

**Program Objective**

Write a program to find the minimum effort required to travel from the top-left to the bottom-right of a height grid where path effort is the maximum adjacent height difference used.

**Input**

```text
Heights: [[1,2,2],[3,8,2],[5,3,5]]
```

**Output**

```text
2
```

### Q28

**Program Objective**

Write a program to find the minimum number of edge reversals required to make every city reachable from city 0.

**Input**

```text
n: 6
Connections: [[0,1],[1,3],[2,3],[4,0],[4,5]]
```

**Output**

```text
3
```

### Q29

**Program Objective**

Write a program to evaluate division queries from equations representing ratios between variables.

**Input**

```text
Equations: [[a,b],[b,c]]
Values: [2.0,3.0]
Queries: [[a,c],[b,a],[a,e],[a,a],[x,x]]
```

**Output**

```text
[6.0,0.5,-1.0,1.0,-1.0]
```

### Q30

**Program Objective**

Write a program to find the minimum number of buses required to travel from a source stop to a target stop.

**Input**

```text
Routes: [[1,2,7],[3,6,7]]
Source: 1
Target: 6
```

**Output**

```text
2
```
