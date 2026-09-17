# Greedy & Intervals — 20 Exercises

## Fluency

### Q01

**Program Objective**

Write a program to merge all overlapping intervals.

**Input**

```text
[[1,3],[2,6],[8,10],[15,18]]
```

**Output**

```text
[[1,6],[8,10],[15,18]]
```

### Q02

**Program Objective**

Write a program to insert a new interval into a sorted non-overlapping interval list and merge when necessary.

**Input**

```text
Intervals: [[1,3],[6,9]]
New: [2,5]
```

**Output**

```text
[[1,5],[6,9]]
```

### Q03

**Program Objective**

Write a program to find the minimum number of intervals that must be removed so the remaining intervals do not overlap.

**Input**

```text
[[1,2],[2,3],[3,4],[1,3]]
```

**Output**

```text
1
```

### Q04

**Program Objective**

Write a program to determine whether a person can attend every meeting without any overlap.

**Input**

```text
[[0,30],[5,10],[15,20]]
```

**Output**

```text
false
```

### Q05

**Program Objective**

Write a program to find the minimum number of meeting rooms required.

**Input**

```text
[[0,30],[5,10],[15,20]]
```

**Output**

```text
2
```

## Core

### Q06

**Program Objective**

Write a program to find the maximum number of non-overlapping activities that can be selected.

**Input**

```text
Start: [1,3,0,5,8,5]
End: [2,4,6,7,9,9]
```

**Output**

```text
4
```

### Q07

**Program Objective**

Write a program to calculate the maximum profit from scheduling non-overlapping jobs with individual start times, end times, and profits.

**Input**

```text
Start: [1,2,3,3]
End: [3,4,5,6]
Profit: [50,10,40,70]
```

**Output**

```text
120
```

### Q08

**Program Objective**

Write a program to find the minimum number of arrows required to burst all balloon intervals.

**Input**

```text
[[10,16],[2,8],[1,6],[7,12]]
```

**Output**

```text
2
```

### Q09

**Program Objective**

Write a program to find the starting gas station index from which a complete circular route is possible.

**Input**

```text
Gas: [1,2,3,4,5]
Cost: [3,4,5,1,2]
```

**Output**

```text
3
```

### Q10

**Program Objective**

Write a program to find the maximum profit from stock prices when any number of non-overlapping buy-and-sell transactions are allowed.

**Input**

```text
[7,1,5,3,6,4]
```

**Output**

```text
7
```

## Interview

### Q11

**Program Objective**

Write a program to determine whether the last index of an array can be reached when each value gives the maximum jump length.

**Input**

```text
[2,3,1,1,4]
```

**Output**

```text
true
```

### Q12

**Program Objective**

Write a program to find the minimum number of jumps required to reach the last index.

**Input**

```text
[2,3,1,1,4]
```

**Output**

```text
2
```

### Q13

**Program Objective**

Write a program to distribute candies to children according to ratings so that children with higher ratings than adjacent children receive more candies.

**Input**

```text
[1,0,2]
```

**Output**

```text
5
```

### Q14

**Program Objective**

Write a program to partition labels so that every character appears in at most one partition and return each partition size.

**Input**

```text
ababcbacadefegdehijhklij
```

**Output**

```text
[9,7,8]
```

### Q15

**Program Objective**

Write a program to reconstruct a queue from pairs where each pair contains a person's height and the number of taller-or-equal people before them.

**Input**

```text
[[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]
```

**Output**

```text
[[5,0],[7,0],[5,2],[6,1],[4,4],[7,1]]
```

### Q16

**Program Objective**

Write a program to maximize the number of children who receive a cookie when each child has a greed factor and each cookie has a size; one cookie can satisfy at most one child.

**Input**

```text
Greed: [1,2,3]
Cookies: [1,1]
```

**Output**

```text
1
```

## Advanced

### Q17

**Program Objective**

Write a program to find the maximum number of courses that can be completed before their deadlines.

**Input**

```text
[[100,200],[200,1300],[1000,1250],[2000,3200]]
```

**Output**

```text
3
```

### Q18

**Program Objective**

Write a program to find the minimum number of refueling stops required to reach a target distance.

**Input**

```text
Target: 100
Start fuel: 10
Stations: [[10,60],[20,30],[30,30],[60,40]]
```

**Output**

```text
2
```

### Q19

**Program Objective**

Write a program to find the lexicographically smallest string obtainable after removing duplicate letters so each distinct letter appears once.

**Input**

```text
cbacdcbc
```

**Output**

```text
acdb
```

### Q20

**Program Objective**

Write a program to divide people into boats with at most two people per boat while minimizing the number of boats.

**Input**

```text
People: [3,2,2,1]
Limit: 3
```

**Output**

```text
3
```
