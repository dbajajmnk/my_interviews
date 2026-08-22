# FS-03 / File 05 — Frontend Testing, Security, Code Review & Architecture

**Priority:** P0  
**Suggested Time:** 60 minutes  
**GOJ Mapping:** M17 + M15 + M20 + M21

---

# 1. Objective

Master:

- frontend testing strategy;
- unit/component/integration/E2E;
- behavior-first tests;
- security review;
- XSS;
- unsafe HTML;
- frontend architecture boundaries;
- code review;
- observability;
- accessibility awareness.

---

# 2. 5W+H

## What?

Frontend quality combines correctness, security, usability, integration, and maintainability.

## Why?

A UI can render correctly but still leak data, break under async races, or be inaccessible.

## Where?

CI/CD and production UI.

## When?

Every feature and review.

## How?

Test user-visible behavior and review trust boundaries.

---

# 3. Real-Life Analogy

Testing a door means more than verifying that it opens.

You also verify:

- correct key;
- no bypass;
- safe closing;
- accessible handle;
- expected behavior under failure.

---

# 4. Visualization

```text
Unit
 ↓
Component
 ↓
Integration
 ↓
E2E

Security / Accessibility / Performance
cut across all levels
```

---

# 5. Mind Map

```text
Frontend Quality
│
├── Unit
├── Component
├── Integration
├── E2E
├── XSS
├── AuthZ UX
├── Accessibility
├── Performance
└── Code Review
```

---

# 6. Core Concepts

## 6.1 Behavior-First Testing

Prefer:

> User clicks Save → request sent → success message appears.

Avoid asserting internal implementation details unnecessarily.

---

## 6.2 Component Test

Test component behavior with realistic props/events.

---

## 6.3 Integration Test

Test multiple UI parts + mocked/controlled API boundary.

---

## 6.4 E2E

Use for critical flows:

- login;
- checkout;
- document upload;
- AI query.

Do not make every permutation E2E.

---

## 6.5 XSS

React escapes text output by default in normal rendering, but risks remain:

- unsafe HTML injection;
- third-party scripts;
- DOM APIs;
- URL handling;
- compromised dependencies.

Be very careful with APIs such as `dangerouslySetInnerHTML`.

---

## 6.6 Client-Side Secrets

Anything shipped to browser can be inspected.

Do not embed true private API secrets in frontend bundle.

---

## 6.7 Accessibility

Architect awareness:

- semantic HTML;
- keyboard navigation;
- labels;
- focus;
- screen reader-friendly interactions.

Accessibility is engineering quality, not decoration.

---

## 6.8 Code Review Order

```text
correctness
→ security
→ async/race
→ state ownership
→ API contract
→ performance
→ tests
→ accessibility
→ readability
```

---

# 7. Engineering Depth

## 7.1 Frontend Architecture

Possible feature-oriented structure:

```text
features/
  orders/
    components/
    api/
    hooks/
    types/
```

Do not over-standardize folder trees if product is small.

Architecture should align with change boundaries.

---

## 7.2 Error Boundaries Awareness

Component rendering failures should be contained where appropriate.

Do not use error boundaries as replacement for normal async error handling.

---

# 8. Implementation / Code

Unsafe:

```tsx
<div dangerouslySetInnerHTML={{ __html: userContent }} />
```

If HTML is required, sanitize using a trusted approach and understand threat model.

Safer default:

```tsx
<div>{userContent}</div>
```

---

# 9. Hands-On Practice

Review:

```tsx
function AdminButton({ isAdmin }) {
  if (!isAdmin) return null;

  return (
    <button onClick={() => fetch("/api/delete-all")}>
      Delete All
    </button>
  );
}
```

Problems:

- backend must authorize;
- destructive method/contract unclear;
- CSRF/auth concerns;
- no confirmation/error state;
- no idempotency/audit reasoning.

---

# 10. Google Interview Drill

## Problem — Test Document Upload UI

Requirements:

- select PDF;
- show progress/status;
- handle rejected file;
- display job ID;
- poll status.

### Test Plan

Component:

- valid file selection;
- invalid type/size;
- upload loading;
- server error.

Integration:

- upload API response;
- job polling;
- terminal success/failure.

E2E:

- one critical happy path;
- one important failure path.

### Security

- frontend checks improve UX;
- backend must validate size/type/content;
- file name cannot be trusted.

### Follow-Up

Accessibility:

- keyboard selection;
- progress announcement;
- error focus.

---

# 11. Common Mistakes

1. Testing implementation details only.
2. E2E for everything.
3. No async/race tests.
4. Frontend-only authorization.
5. Secrets in bundle.
6. Unsafe HTML.
7. Ignoring accessibility.
8. Ignoring loading/error state.
9. Code review focused only on style.

---

# 12. Best Practices

- test user behavior;
- layer tests;
- backend enforces trust;
- avoid unsafe HTML;
- no private secrets client-side;
- include accessibility;
- review races/state ownership;
- monitor frontend errors and performance.

---

# 13. Interview Questions

1. Component vs integration vs E2E test?
2. What should frontend tests assert?
3. XSS?
4. Is React automatically XSS-proof?
5. Can frontend hold API secret?
6. Why backend authZ required?
7. Error boundary?
8. Frontend code review checklist?
9. Accessibility basics?

---

# 14. Google-Level Follow-Ups

1. flaky E2E?
2. test cancellation?
3. test optimistic rollback?
4. CSP?
5. third-party script risk?
6. frontend observability?
7. Core Web Vitals awareness?

---

# 15. Quick Revision

```text
Test behavior, not internals
Layer tests
React escapes normal text, unsafe HTML still risky
No private secrets in browser
Backend enforces authorization
Review async races + state ownership
Accessibility is quality
```

---

# 16. Readiness Gate

- [ ] Test layers.
- [ ] Behavior-first.
- [ ] XSS.
- [ ] Client secret rule.
- [ ] Frontend authZ limitation.
- [ ] Code review order.
- [ ] Upload test drill.

**Gate:** READY / REPAIR

---

# 17. References

- React testing guidance
- OWASP web security guidance
- WAI accessibility references
