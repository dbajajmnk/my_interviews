# PY-04 / File 01 — Google Problem Solving & Complexity

**Priority:** P0  
**Suggested Time:** 50 minutes  
**GOJ Mapping:** M13 Coding & DSA

---

# 1. Objective

After this file you should be able to:

- structure a coding interview answer;
- clarify constraints;
- identify brute force first;
- analyze time/space;
- optimize systematically;
- prove correctness informally;
- test edge cases;
- communicate while coding.

---

# 2. 5W+H

## What?

A coding interview evaluates reasoning, correctness, data-structure selection, complexity, communication, and adaptability.

## Why?

The interviewer wants evidence that you can solve unfamiliar problems, not merely recall memorized solutions.

## Where?

Coding rounds, live client screens, pair-programming, technical assessment.

## When?

Every non-trivial coding question.

## Who?

All candidates; senior candidates are also judged on clarity, trade-offs, and engineering judgment.

## How?

Use a repeatable reasoning framework.

---

# 3. Real-Life Analogy

A good coding interview is like diagnosing a production incident:

> understand the problem before changing the system.

Jumping directly into code is like applying random fixes before knowing the failure.

---

# 4. Visualization

```text
Problem
  ↓
Clarify
  ↓
Examples / Constraints
  ↓
Brute Force
  ↓
Complexity
  ↓
Pattern / Data Structure
  ↓
Optimized Approach
  ↓
Code
  ↓
Test
  ↓
Follow-Up
```

---

# 5. Mind Map

```text
Problem Solving
│
├── Clarify
├── Examples
├── Constraints
├── Brute Force
├── Pattern
├── Optimization
├── Code
├── Test
├── Complexity
└── Follow-Up
```

---

# 6. Core Concepts

## 6.1 Clarify Before Coding

Ask relevant questions:

- input size?
- sorted?
- duplicates?
- case-sensitive?
- memory constraints?
- can input be modified?
- expected return?
- invalid input?
- streaming or in-memory?

Do not ask unnecessary questions just to look thorough.

---

## 6.2 Brute Force Is Useful

A brute-force solution establishes:

- correctness baseline;
- understanding;
- improvement target.

Example duplicate detection:

```python
def has_duplicate(values):
    for i in range(len(values)):
        for j in range(i + 1, len(values)):
            if values[i] == values[j]:
                return True
    return False
```

Time: O(n²)

Then improve using a set.

---

## 6.3 Big-O

Big-O describes growth as input size increases.

Common:

```text
O(1)       constant
O(log n)   logarithmic
O(n)       linear
O(n log n) sorting-class growth
O(n²)      nested pair comparison
O(2^n)     exponential
```

---

## 6.4 Space Complexity

Do not ignore auxiliary memory.

Example:

```python
seen = set()
```

may improve time from O(n²) to expected O(n), but uses O(n) extra space.

That is a trade-off.

---

## 6.5 Correctness

Explain why the algorithm works.

For set duplicate detection:

> Every previously seen value is in `seen`; therefore if current value is already present, a duplicate exists. If we finish without finding one, all processed values were unique.

This is enough for most interviews.

---

## 6.6 Edge Cases

Always consider:

- empty input;
- one item;
- all same;
- no match;
- match at beginning/end;
- duplicates;
- negative/zero where relevant;
- very large input.

---

# 7. Engineering Depth

## 7.1 Complexity Is Not the Entire Design

O(1) may still be wrong if:

- memory huge;
- data distributed;
- hashability unavailable;
- ordering required;
- security constraints matter.

Interview answer:

> Complexity guides design, but constraints decide the final solution.

---

## 7.2 Do Not Optimize Before Understanding

A clever O(n) solution that is wrong is worse than a correct O(n²) explanation plus a clear optimization path.

---

# 8. Implementation / Code

## Duplicate Detection

```python
def has_duplicate(values):
    seen = set()

    for value in values:
        if value in seen:
            return True
        seen.add(value)

    return False
```

Complexity:

- expected time O(n);
- space O(n).

---

# 9. Hands-On Practice

## Practice 1

Given a list of integers, return the first duplicate encountered.

## Practice 2

Given two lists, determine whether they share any common value.

## Practice 3

Explain trade-off between sorting-based and set-based duplicate detection.

---

# 10. Google Interview Drill

## Problem — Two Sum

Given numbers and target, return indices of two values summing to target.

### Clarify

- exactly one solution?
- can same index be reused? no;
- duplicates allowed?
- return first valid pair?

### First Approach

Nested loops.

Time O(n²), space O(1).

### Improve

Use dictionary:

```python
def two_sum(nums, target):
    seen = {}

    for index, value in enumerate(nums):
        needed = target - value

        if needed in seen:
            return [seen[needed], index]

        seen[value] = index

    return []
```

### Test

```python
assert two_sum([2, 7, 11, 15], 9) == [0, 1]
assert two_sum([3, 3], 6) == [0, 1]
```

### Complexity

Expected O(n) time, O(n) space.

### Follow-Up

What if input is sorted?

Use two pointers with O(1) extra space.

### Defend

Explain why dictionary solution works.

---

# 11. Common Mistakes

1. Coding before understanding.
2. Memorized solution without reasoning.
3. Forgetting space complexity.
4. Ignoring edge cases.
5. Claiming hash lookup is worst-case O(1).
6. Over-optimizing before correctness.
7. Silent coding.
8. Not testing code manually.

---

# 12. Best Practices

- speak concise reasoning;
- start simple;
- state trade-offs;
- name complexity;
- test before stopping;
- keep code readable;
- handle follow-ups calmly.

---

# 13. Interview Questions

1. What is Big-O?
2. Time vs space complexity?
3. Why start brute force?
4. How do you prove correctness?
5. When use hashing?
6. How do constraints change algorithms?
7. Why test edge cases?
8. What is amortized complexity?

---

# 14. Google-Level Follow-Ups

For Two Sum:

1. sorted input?
2. memory limited?
3. return all pairs?
4. streaming input?
5. billion values?
6. distributed data?
7. duplicate policy?
8. overflow concerns in fixed-width languages?

---

# 15. Quick Revision

```text
Clarify
→ brute force
→ complexity
→ improve
→ code
→ test
→ edge cases
→ final complexity
→ follow-up
```

---

# 16. Readiness Gate

- [ ] Explain Big-O.
- [ ] Analyze time + space.
- [ ] Start with brute force.
- [ ] Optimize Two Sum.
- [ ] Test edge cases.
- [ ] Explain correctness.
- [ ] Handle sorted-input follow-up.

**Gate:** READY / REPAIR

---

# 17. References

- Python data structures documentation
- Standard algorithm-analysis references
