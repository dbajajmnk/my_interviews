# GOJ Interview Preparation — Cognizant
## Area 02 — Python
### PY-01 — Python Core, Type System & Functions

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** M1 Language Foundations + M2 Language Model & Type System + M3 Functions, Scope & Core Constructs + selected M6 Collections  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** Complete one file → pass its readiness gate → move to the next file.

---

# 1. Pack Objective

PY-01 builds the Python foundation required before moving into advanced Python, OOP, runtime, concurrency, coding, backend, AI, and architecture.

The target is not memorization. The target is:

> **Understand → Explain → Apply → Code → Debug → Review → Defend**

You should finish this pack able to answer Python core questions at senior/architect depth and survive follow-ups that move from language behavior to production engineering.

---

# 2. Directory Structure

```text
GOJ-Cognizant-PY-01/
│
├── README.md
├── 01-Python-Language-Foundations.md
├── 02-Python-Type-System-Objects-and-Collections.md
├── 03-Python-Functions-Scope-Closures-and-Comprehensions.md
└── 04-PY-01-Final-Readiness-Assessment.md
```

KIS rule:

- No separate `Practice/`
- No separate `Labs/`
- No separate `Assignments/`
- Hands-on work, debugging, interview questions, and readiness checks stay inside the relevant learning file.
- The final assessment is separate because it tests the complete PY-01 pack end-to-end.

---

# 3. File Execution Order

## File 01 — Python Language Foundations

Focus:

- Python execution model
- dynamic typing
- strong typing
- duck typing
- Python object model
- names and binding
- identity and equality
- mutation vs rebinding
- architect-level interpretation

## File 02 — Python Type System, Objects & Collections

Focus:

- mutable vs immutable
- hashability
- assignment behavior
- shallow vs deep copy
- list
- tuple
- set
- dict
- complexity
- data-structure selection
- production implications of local state

## File 03 — Functions, Scope, Closures & Comprehensions

Focus:

- function parameters
- positional-only
- keyword-only
- `*args`
- `**kwargs`
- unpacking
- default argument evaluation
- parameter passing
- LEGB
- `global`
- `nonlocal`
- closures
- late binding
- comprehensions
- API design

## File 04 — Final Readiness Assessment

Focus:

- concept recall
- output prediction
- debugging
- code review
- engineering decisions
- Google-level follow-up ladder
- final PY-01 readiness gate

---

# 4. GOJ Standard Used in Every Learning File

Each topic file follows the finalized GOJ learning sequence:

1. Objective
2. 5W+H
3. Real-Life Analogy
4. Visualization
5. Mind Map
6. Core Concepts
7. Engineering Depth
8. Implementation / Code
9. Hands-On Practice
10. Common Mistakes
11. Best Practices
12. Interview Questions
13. Google Interview Drill
14. Common Mistakes
15. Best Practices
16. Interview Questions
17. Google-Level Follow-Ups
18. Quick Revision
19. Readiness Gate
20. References

---

# 5. Architect-Level Rule

For every important Python concept, prepare at this depth:

> **What → Why → How → Code → Failure → Debug → Trade-off → Production → Defend**

Example:

```text
Mutable default argument
        ↓
Why does it happen?
        ↓
Fix the function
        ↓
What if state is shared?
        ↓
Thread safety?
        ↓
Multiple workers?
        ↓
Distributed cache?
        ↓
Failure handling?
```

This is how GOJ keeps the content simple while still reaching architect depth.

---

# 6. PY-01 Completion Criteria

PY-01 is complete only when you can:

- Explain Python dynamic and strong typing without notes.
- Explain Python names, objects, references, identity, and equality.
- Predict mutation vs rebinding behavior.
- Explain mutable vs immutable objects.
- Explain shallow vs deep copy.
- Choose list/tuple/set/dict based on requirements.
- Explain hashability and average lookup complexity.
- Explain Python parameter-passing semantics accurately.
- Explain all major function parameter styles.
- Debug mutable default arguments.
- Explain LEGB, `global`, and `nonlocal`.
- Explain closures and late binding.
- Review over-flexible `*args/**kwargs` APIs.
- Connect local Python state to production/distributed-system concerns.

---

# 7. Next Pack

After passing PY-01:

> **PY-02 — Advanced Python, OOP, Decorators, Iterators, Generators, Context Managers, Typing, SOLID & GoF**


---

# 8. Locked GOJ Google-Level File Standard

From this pack onward, every interview-preparation learning file uses this exact order:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Code → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

The **Google Interview Drill** is mandatory because it tests the interview reasoning flow:

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity → Trade-off → Follow-Up → Defend**

This is the locked GOJ Google-Level baseline. Do not add extra sections unless a real interview exposes a genuine gap.


---

# 9. Time Allocation

PY-01 is an interview-preparation pack, not a full Python course. The goal is targeted mastery.

| File | Focus | Suggested Time |
|---|---|---:|
| `01-Python-Language-Foundations.md` | Execution model, typing, objects, identity, mutation/rebinding | 45 min |
| `02-Python-Type-System-Objects-and-Collections.md` | Mutability, copying, collections, complexity | 60 min |
| `03-Python-Functions-Scope-Closures-and-Comprehensions.md` | Functions, scope, closures, API design | 75 min |
| `04-PY-01-Final-Readiness-Assessment.md` | Final assessment + Google-level follow-ups | 60 min |

**Total Suggested Time:** ~4 hours

### Time Rule

> **Learn quickly → practice deeply → spend the most time on weak areas.**

Do not repeat a complete file if only one concept is weak.

---

# 10. Final Scoring Standard

PY-01 uses the following scoring model:

| Dimension | Weight |
|---|---:|
| Concept Understanding & Explanation | 20% |
| Code / Output Prediction | 20% |
| Debugging & Code Review | 20% |
| Google Interview Drill | 25% |
| Follow-Up & Architect-Level Defense | 15% |
| **Total** | **100%** |

### Pass Rule

To mark PY-01 as **READY**:

- Overall score must be **80% or above**
- No critical P0 topic can remain weak
- Google Interview Drill must be completed successfully
- Candidate must survive follow-up questions without relying on memorized wording

### Decision

- **80%+ and no P0 weakness → READY**
- **Below 80% or any P0 weakness → REPAIR**
- Repair only the weak area; do not restart the complete pack

---

# 11. Locked PY-01 Standard

PY-01 is now frozen as the reference implementation for future GOJ interview packs.

Future packs must preserve:

> **Objective → 5W+H → Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation → Hands-On → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Follow-Ups → Quick Revision → Readiness Gate → References**

And the mandatory Google reasoning flow:

> **Clarify → First Approach → Improve → Code → Test → Edge Cases → Complexity → Trade-Off → Follow-Up → Defend**

No structural expansion unless a real interview exposes a genuine gap.
