# GOJ Interview Preparation — Cognizant
## Area 03 — Full Stack
### FS-03 — React, JavaScript/TypeScript & Full-Stack Integration

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** M19 Backend / Framework / API Engineering + M17 Testing + M20 Performance & Security + M21 Architecture  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived from “Python Full Stack Development Architect with AI.” React and TypeScript are treated as the primary frontend technologies because they are highly relevant to full-stack architect preparation; framework/version trivia is secondary to engineering reasoning.

---

# 1. Pack Objective

FS-03 prepares you to design, implement, review, and defend a modern React + TypeScript frontend integrated with Python APIs.

By the end of this pack you should be able to:

- explain JavaScript runtime essentials needed for React;
- explain TypeScript value and limits;
- design React components, props, state, hooks, and composition;
- reason about rendering, reconciliation, keys, controlled state, and effects;
- avoid common `useEffect` and state-management mistakes;
- integrate frontend with REST APIs safely;
- handle authentication, authorization-aware UI, errors, loading, retries, and cancellation;
- design frontend caching and server-state strategy;
- explain performance optimization without premature memoization;
- test components and integration behavior;
- review frontend security concerns such as XSS, token handling, CORS, CSRF, and unsafe HTML;
- design full-stack flows including AI streaming responses;
- defend frontend architecture choices at senior/architect level.

Target:

> **User Action → State → Render → API → Validate → Respond → Update UI → Observe → Defend**

---

# 2. Directory Structure

```text
GOJ-Cognizant-FS-03-Final/
│
├── README.md
├── 01-JavaScript-TypeScript-and-Browser-Foundations.md
├── 02-React-Components-State-Hooks-and-Rendering.md
├── 03-Effects-Forms-State-Management-and-Performance.md
├── 04-API-Integration-Auth-Errors-Caching-and-Full-Stack-Flow.md
├── 05-Frontend-Testing-Security-Code-Review-and-Architecture.md
├── 06-React-Python-AI-Full-Stack-System-Design.md
└── 07-FS-03-Final-Readiness-Assessment.md
```

KIS rule:

- no separate lab/practice folders;
- one meaningful Google drill per topic file;
- no library-name memorization unless it supports a design decision;
- frontend and backend responsibilities remain clearly separated.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | JavaScript, TypeScript, browser/runtime foundations | 65 min |
| 02 | React components, state, hooks, rendering | 75 min |
| 03 | Effects, forms, state management, performance | 75 min |
| 04 | API integration, auth, errors, caching | 70 min |
| 05 | Testing, security, code review, architecture | 60 min |
| 06 | React + Python + AI system design | 65 min |
| 07 | Final readiness assessment | 60 min |
| **Total** |  | **~7 hr 50 min** |

Time rule:

> **Understand rendering and data flow deeply; memorize as little API trivia as possible.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Code → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Approach → Improve → Code / Design → Test → Edge Cases → Complexity / Cost → Trade-Off → Follow-Up → Defend**

---

# 5. Full-Stack Interview Standard

For every frontend/full-stack design question:

```text
1. Clarify user flow
2. Define UI state
3. Define component boundaries
4. Define API contract
5. Define loading/error/empty states
6. Define auth/security boundary
7. Define server-state/cache behavior
8. Define cancellation/race handling
9. Define performance considerations
10. Define tests
11. Define observability
12. Defend trade-offs
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| JavaScript / TypeScript Foundations | 15% |
| React & Rendering Model | 20% |
| Full-Stack API Integration | 20% |
| Google Interview Drill | 20% |
| Testing / Security / Code Review | 15% |
| Architect-Level Defense | 10% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can explain React rendering/state clearly;
- can identify effect/race bugs;
- can integrate with Python API safely;
- can defend auth/cache/performance choices;
- can design AI streaming UI end to end.

---

# 7. FS-03 Completion Criteria

You must be able to:

- explain event loop and promises at practical depth;
- explain `let` / `const`, closures, equality, mutation, async behavior;
- explain TypeScript compile-time role;
- design components using props/state/composition;
- explain render triggers and keys;
- use hooks correctly;
- explain effect dependencies and cleanup;
- distinguish local/client/global/server state;
- integrate REST APIs with timeout/cancellation/error handling;
- explain authentication vs authorization-aware UI;
- explain XSS/CORS/CSRF at practical level;
- test user-visible behavior;
- design scalable frontend structure;
- design AI answer streaming from Python backend to React.

---

# 8. Next Pack

After FS-03:

> **FS-04 — Testing, Debugging & Full-Stack Quality**
