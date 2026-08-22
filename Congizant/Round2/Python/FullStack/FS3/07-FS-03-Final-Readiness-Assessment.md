# FS-03 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 12 Minutes

Answer in 30–60 seconds:

1. `const` vs immutability?
2. `==` vs `===`?
3. Closure?
4. Promise?
5. Event loop?
6. TypeScript runtime or compile-time?
7. Why runtime API validation?
8. Props vs state?
9. Why immutable state updates?
10. What triggers render?
11. Reconciliation?
12. Why keys?
13. Why not index key?
14. What is `useEffect` for?
15. When not to use effect?
16. Cleanup?
17. Stale closure?
18. Fetch race?
19. Local vs server state?
20. Memoization?
21. CORS?
22. CSRF?
23. Why UI authZ is insufficient?
24. Optimistic update?
25. XSS?
26. Where should LLM secret live?
27. SSE vs WebSocket?
28. How cancel AI generation?

---

# 2. React Coding / Review — 10 Minutes

Review:

```tsx
function Cart({ items }) {
  const [total, setTotal] = useState(0);

  useEffect(() => {
    setTotal(items.reduce((sum, x) => sum + x.price, 0));
  }, [items]);

  return <div>{total}</div>;
}
```

Expected:

> `total` is derived state; compute directly unless expensive enough to justify memoization.

---

# 3. Async Integration — 10 Minutes

Scenario:

User types search term rapidly.

Explain:

- debounce;
- request cancellation;
- latest result wins;
- loading/error state;
- cache repeated queries;
- backend rate limiting.

---

# 4. Security — 8 Minutes

Scenario:

Frontend hides Admin button but backend endpoint does not enforce role.

Explain:

> critical authorization vulnerability; UI is not trust boundary.

Also explain:

- CORS is not authorization;
- no private secrets in browser;
- XSS/token implications.

---

# 5. Google Interview Drill — 12 Minutes

## Design React + Python RAG Chat

Requirements:

- streaming;
- citations;
- tenant isolation;
- cancellation;
- model quota.

Use:

> **Clarify → First Design → Improve → Test → Edge Cases → Trade-Off → Follow-Up → Defend**

Expected:

```text
React
→ Python API
→ auth/tenant ACL
→ vector retrieval
→ model adapter
→ streamed answer + citations
```

Include:

- backend-owned secrets;
- bounded concurrency;
- timeout;
- cancellation;
- observability.

---

# 6. Architect Follow-Up — 8 Minutes

Answer:

1. Why not call LLM directly from React?
2. SSE vs WebSocket?
3. What if model returns 429?
4. How protect cross-tenant data?
5. What if user cancels?
6. How cache server data?
7. How debug stale UI?
8. What metrics matter for AI chat?

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| JavaScript / TypeScript Foundations | 15% | ___ / 15 |
| React & Rendering Model | 20% | ___ / 20 |
| Full-Stack API Integration | 20% | ___ / 20 |
| Google Interview Drill | 20% | ___ / 20 |
| Testing / Security / Code Review | 15% | ___ / 15 |
| Architect-Level Defense | 10% | ___ / 10 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

FS-03 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] JS/TS runtime concepts clear
- [ ] React state/rendering clear
- [ ] effects/cancellation clear
- [ ] server state/API integration clear
- [ ] security boundary clear
- [ ] testing/review clear
- [ ] AI streaming design defendable

---

# 9. Final Quick Notes

```text
JS:
closure + promise + event loop

TS:
compile-time, not runtime validation

React:
props → state → render
immutable updates
stable keys
derived state stays derived

Effects:
external synchronization
cleanup + cancellation
avoid race

Integration:
typed contract
backend authZ
cache/invalidation
selective retry

Security:
CORS ≠ auth
frontend ≠ trust boundary
no private secrets in browser

AI:
React → Python → retrieval/model
stream + cancel + citations
backend tenant ACL
bounded concurrency
observability
```

---

# 10. Decision

### READY

Move to:

> **FS-04 — Testing, Debugging & Full-Stack Quality**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
