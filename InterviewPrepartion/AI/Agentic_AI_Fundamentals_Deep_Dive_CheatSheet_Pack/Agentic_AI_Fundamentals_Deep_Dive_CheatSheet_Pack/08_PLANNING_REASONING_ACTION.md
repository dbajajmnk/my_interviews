# Planning, Reasoning & Action

## Planning

Planning means decomposing a goal into one or more steps.

Example:
```text
Goal: Resolve customer refund issue

Plan:
1. Find customer
2. Find order
3. Check refund policy
4. Determine eligibility
5. Request approval if needed
6. Execute refund
7. Notify customer
```

## Dynamic vs Fixed Planning

- **Fixed plan:** application defines steps.
- **Dynamic plan:** model chooses/decomposes steps at runtime.
- **Hybrid:** application defines boundaries; model chooses within them.

Hybrid is usually strongest for enterprise systems.

## Reasoning

In interviews, focus on **observable decision logic and system behavior**, not hidden chain-of-thought.

Useful artifacts:
- selected action;
- rationale summary;
- tool call;
- confidence;
- policy result;
- trace.

## Action

Never execute a high-impact action directly from model text.

Use:
```text
Model Decision
 ↓
Schema Validation
 ↓
Policy/Authorization
 ↓
Optional Human Approval
 ↓
Tool Execution
```

## 20-Second Recall

> Keep planning flexible where it adds value, but put execution behind deterministic validation and policy boundaries.
