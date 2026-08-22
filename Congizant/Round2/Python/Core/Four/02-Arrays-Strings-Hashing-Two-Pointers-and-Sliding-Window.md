# PY-04 / File 02 — Arrays, Strings, Hashing, Two Pointers & Sliding Window

**Priority:** P0  
**Suggested Time:** 80 minutes  
**GOJ Mapping:** M13 Coding & DSA

---

# 1. Objective

Master interview patterns:

- arrays/lists;
- strings;
- hashing;
- frequency maps;
- two pointers;
- sliding window;
- prefix-style reasoning;
- pattern selection.

---

# 2. 5W+H

## What?

These patterns solve a large percentage of practical coding interview problems.

## Why?

They reduce repeated work and convert brute-force solutions into linear-time solutions.

## Where?

Search, validation, deduplication, substring/subarray analysis, pair problems.

## When?

When input is sequence-like and constraints involve ranges, pairs, membership, or frequency.

## How?

Recognize invariant and choose the smallest useful structure.

---

# 3. Real-Life Analogy

Sliding window is like looking through a moving train window.

You do not rebuild the entire view each time; you remove what leaves and add what enters.

---

# 4. Visualization

```text
Two Pointers

L → [a b c d e] ← R

Sliding Window

[ a b c ] d e
  → move window →
a [ b c d ] e
```

---

# 5. Mind Map

```text
Sequences
│
├── List
├── String
├── Hashing
│   ├── set
│   └── dict
├── Two Pointers
└── Sliding Window
```

---

# 6. Core Concepts

## 6.1 Hashing

Use set/dict for:

- membership;
- counts;
- previously seen values;
- mapping value → index.

Frequency example:

```python
from collections import Counter

counts = Counter("banana")
```

Know manual dict approach too.

---

## 6.2 Two Pointers

Useful when:

- array sorted;
- comparing from ends;
- removing duplicates;
- reversing;
- pair sum.

Example sorted two sum:

```python
def pair_sum(nums, target):
    left = 0
    right = len(nums) - 1

    while left < right:
        total = nums[left] + nums[right]

        if total == target:
            return True
        if total < target:
            left += 1
        else:
            right -= 1

    return False
```

---

## 6.3 Sliding Window

Useful for contiguous ranges.

Fixed-size:

```python
def max_sum_k(nums, k):
    if k > len(nums):
        return None

    current = sum(nums[:k])
    best = current

    for right in range(k, len(nums)):
        current += nums[right]
        current -= nums[right - k]
        best = max(best, current)

    return best
```

Time O(n).

---

## 6.4 Variable Window

Longest substring without repeated characters:

```python
def longest_unique(s):
    left = 0
    seen = {}
    best = 0

    for right, ch in enumerate(s):
        if ch in seen and seen[ch] >= left:
            left = seen[ch] + 1

        seen[ch] = right
        best = max(best, right - left + 1)

    return best
```

---

# 7. Engineering Depth

## 7.1 Invariant

Two pointers/sliding window work because an invariant is maintained.

Example:

> Window from `left` to `right` contains no duplicate characters.

Explain invariant, not only code.

---

## 7.2 Strings in Python

Strings are immutable.

Repeated concatenation in loops may create many objects.

For large joins:

```python
parts = []
parts.append("a")
parts.append("b")
result = "".join(parts)
```

---

# 8. Implementation / Code

## Anagram Check

```python
from collections import Counter

def is_anagram(a, b):
    return Counter(a) == Counter(b)
```

Alternative manual frequency map is useful if interviewer asks.

---

# 9. Hands-On Practice

1. Valid anagram
2. First non-repeating character
3. Remove duplicates from sorted array
4. Maximum sum subarray of size `k`
5. Longest substring without repeating characters
6. Pair sum in sorted array

---

# 10. Google Interview Drill

## Problem — Longest Substring Without Repeating Characters

### Clarify

- ASCII/Unicode?
- return length or substring?
- empty string?

### Brute Force

Generate all substrings and check uniqueness.

O(n³) naïvely.

### Improve

Sliding window + last-seen index.

```python
def longest_unique(s):
    left = 0
    last_seen = {}
    best = 0

    for right, ch in enumerate(s):
        if ch in last_seen and last_seen[ch] >= left:
            left = last_seen[ch] + 1

        last_seen[ch] = right
        best = max(best, right - left + 1)

    return best
```

### Test

```python
assert longest_unique("") == 0
assert longest_unique("abcabcbb") == 3
assert longest_unique("bbbbb") == 1
assert longest_unique("pwwkew") == 3
```

### Complexity

Expected O(n) time, O(min(n, alphabet)) space.

### Follow-Up

Return substring itself.

Track best start/end.

---

# 11. Common Mistakes

1. Applying sliding window to non-contiguous problem.
2. Moving wrong pointer.
3. Forgetting duplicate may be outside current window.
4. Rebuilding window repeatedly.
5. Mutating while iterating incorrectly.
6. Ignoring empty input.
7. Confusing substring with subsequence.

---

# 12. Best Practices

- state invariant;
- name left/right clearly;
- use dict/set intentionally;
- test one-character and all-duplicate inputs;
- calculate complexity after coding.

---

# 13. Interview Questions

1. When use set vs dict?
2. Two pointers use cases?
3. Sliding window use cases?
4. Fixed vs variable window?
5. Substring vs subsequence?
6. Why strings are immutable?
7. How do you avoid repeated string concatenation?

---

# 14. Google-Level Follow-Ups

1. Unicode?
2. streaming characters?
3. huge alphabet?
4. return actual substring?
5. distributed stream?
6. memory-limited variant?

---

# 15. Quick Revision

```text
Hashing → lookup/count
Two pointers → ordered/pair/end movement
Sliding window → contiguous range
Invariant drives correctness
String = immutable
```

---

# 16. Readiness Gate

- [ ] Two Sum via hash.
- [ ] Sorted pair sum via pointers.
- [ ] Fixed window.
- [ ] Variable window.
- [ ] Explain invariant.
- [ ] Solve longest unique substring.
- [ ] State complexity.

**Gate:** READY / REPAIR

---

# 17. References

- Python collections
- Python sequence types
