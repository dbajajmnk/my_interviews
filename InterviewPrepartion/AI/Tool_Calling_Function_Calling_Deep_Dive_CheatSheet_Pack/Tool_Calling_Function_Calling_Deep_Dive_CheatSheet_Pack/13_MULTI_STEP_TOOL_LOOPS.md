# Multi-Step Tool Loops

## Loop

```text
Model
 ↓
Tool A
 ↓
Observation
 ↓
Model
 ↓
Tool B
 ↓
Observation
 ↓
Model
 ↓
Final
```

## Controls

Bound the loop with:
- max steps;
- time limit;
- token/cost budget;
- repeated-action detection;
- explicit failure state.

## Interview Point

> Tool calling becomes agentic when observations influence subsequent tool decisions in an iterative loop.
