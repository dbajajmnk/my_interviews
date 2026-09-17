# FAANG Problem-Solving Fluency Bank — V1

**Status: LOCKED — Semantic QA Hardened**

## Scope
- **340 exercises**
- **16 learning categories**
- **18 Markdown files**
- Question format: **Program Objective → Input → Output**
- No solution, hint, algorithm name, complexity clue, or implementation walkthrough.

## Engineering Principles

### KISS
Every exercise stays focused on one clear behavior with a concrete input and expected output.

### DRY
Repeated canonical problems are avoided unless the category itself creates a genuinely different learning objective.

### SOLID
- Category files contain exercises.
- This index owns navigation, scope, conventions, and sequence.
- The progress tracker owns completion state.
- Solutions, explanations, and code are intentionally outside V1.

### YAGNI
No company tags, solution metadata, theory, code templates, or extra documentation are added until a later version needs them.

## Deterministic Question Contract
These rules remove hidden assumptions without revealing how to solve a problem:

1. **Indexes are zero-based** unless an objective explicitly states otherwise.
2. **Tree arrays use level-order representation** and `null` means no node.
3. For collection outputs representing a mathematical set, values are shown in **ascending / lexicographic order** unless the objective defines another order.
4. When a string problem has multiple equal-length valid answers, use the **earliest starting occurrence** unless the objective gives another tie-break rule.
5. Graph traversal follows the **adjacency order shown in the input** unless another order is explicitly requested.
6. Matrix coordinates use **(row, column)** with both values zero-based.
7. Boolean output is written as `true` or `false`.
8. The displayed output is the exact target for the supplied input; no solution strategy is implied.

## Learning Sequence

1. Arrays
2. Strings
3. Hashing
4. Two Pointers
5. Sliding Window
6. Binary Search
7. Stack & Queue
8. Linked List
9. Recursion
10. Backtracking
11. Trees, BST & Trie
12. Heap & Priority Queue
13. Graphs
14. Greedy & Intervals
15. Dynamic Programming
16. Bit Manipulation & Math

## Question Files

- [Arrays](01-Arrays.md) — **30 exercises**
- [Strings](02-Strings.md) — **20 exercises**
- [Hashing](03-Hashing.md) — **20 exercises**
- [Two Pointers](04-Two-Pointers.md) — **20 exercises**
- [Sliding Window](05-Sliding-Window.md) — **20 exercises**
- [Binary Search](06-Binary-Search.md) — **20 exercises**
- [Stack & Queue](07-Stack-Queue.md) — **20 exercises**
- [Linked List](08-Linked-List.md) — **20 exercises**
- [Recursion](09-Recursion.md) — **10 exercises**
- [Backtracking](10-Backtracking.md) — **10 exercises**
- [Trees, BST & Trie](11-Trees-BST.md) — **30 exercises**
- [Heap & Priority Queue](12-Heap-Priority-Queue.md) — **15 exercises**
- [Graphs](13-Graphs.md) — **30 exercises**
- [Greedy & Intervals](14-Greedy-Intervals.md) — **20 exercises**
- [Dynamic Programming](15-Dynamic-Programming.md) — **35 exercises**
- [Bit Manipulation & Math](16-Bit-Manipulation-Math.md) — **20 exercises**

- [Progress Tracker](17-PROGRESS-TRACKER.md)

## V1 Quality Gates

V1 is considered valid only when all of these remain true:

- 18/18 Markdown files present.
- 340/340 exercises present.
- Every exercise contains Program Objective, Input, and Output.
- No solution or code section appears in question files.
- Expected outputs are semantically checked for the supplied inputs.
- Ambiguous ordering, indexing, structural representation, and tie cases are explicitly controlled.
- Category progression moves from Fluency → Core → Interview → Advanced.
- Duplicate learning value is minimized.
- High-value coverage includes arrays/matrices, strings, hashing, two pointers, sliding window, binary search, stacks/queues, linked structures/LRU, recursion, backtracking, trees/BST/Trie, heaps, graphs/connectivity, greedy/intervals, dynamic programming, and bit/math.

## Completion Standard

An exercise is mastered only when you can:

- identify the logic independently;
- write the code independently;
- obtain the expected output;
- handle edge cases;
- explain your approach;
- reproduce the solution later without copying earlier code.
