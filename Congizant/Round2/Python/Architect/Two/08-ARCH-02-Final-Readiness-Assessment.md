# ARCH-02 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer/design without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 12 Minutes

Answer in 30–60 seconds:

1. What stays deterministic in AI architecture?
2. Prompt vs RAG?
3. RAG vs fine-tuning?
4. Workflow vs agent?
5. What is provider abstraction?
6. What should model router consider?
7. What makes fallback unsafe?
8. Is RAG an agent?
9. What belongs in a tool registry?
10. How handle long-running AI work?
11. Where enforce authorization?
12. What is indirect prompt injection?
13. How enforce tenant isolation?
14. How handle PII/data residency?
15. What affects AI latency?
16. What affects token cost?
17. How bound model concurrency?
18. How cache AI safely?
19. How handle 429?
20. What AI components should be versioned?
21. Offline vs online evaluation?
22. Shadow vs canary?
23. What is a release gate?
24. How rollback an index/model change?
25. What AI SLOs matter?
26. How validate generated code?
27. When human approval is required?

---

# 2. Architecture Boundary — 8 Minutes

Question:

> Client wants LLM to decide whether customer qualifies for a refund.

Strong answer:

- LLM can extract intent/context;
- deterministic eligibility service owns policy;
- high-risk refund may require approval;
- payment service remains authoritative;
- model never directly owns financial invariant.

---

# 3. Provider Failure — 8 Minutes

Primary provider unavailable.

Explain policy-based fallback by task:

- low-risk drafting → fallback provider;
- high-risk legal/financial → fail closed/human;
- batch → queue;
- search/RAG → possibly return sources without synthesis.

---

# 4. Security Scenario — 8 Minutes

Uploaded document contains malicious instructions.

Explain:

- treat document as untrusted data;
- deterministic auth;
- tool allowlist;
- least privilege;
- output/action validation;
- approval;
- audit.

---

# 5. Google Interview Drill — 14 Minutes

## Design Enterprise AI Development Copilot

Requirements:

- React;
- Python;
- private source code;
- RAG over code/docs;
- code suggestions;
- PR draft;
- no autonomous deployment;
- 5k developers.

Use:

> **Clarify → AI Fit → Deterministic Boundary → Data/RAG → Model → Tools → Security → Validation → Scale → Evaluation → Observability → Rollout → Defend**

Expected:

```text
React
→ Python API
→ RBAC
→ permission-aware repo retrieval
→ model
→ structured suggestion
→ code validation/sandbox
→ PR draft tool
→ human review
```

Include:

- provider confidentiality;
- incremental indexing;
- model concurrency limits;
- prompt/index/model versioning;
- canary/evaluation.

---

# 6. Architect Follow-Up — 10 Minutes

Answer:

1. Why not send entire repo to model?
2. Why not let agent deploy?
3. How switch providers?
4. What if fallback violates residency?
5. How measure code suggestion quality?
6. How control 10× traffic?
7. How handle model 429?
8. How rollback index upgrade?
9. How protect secrets in code?
10. When introduce agentic workflow?

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| AI Architecture Principles & Boundaries | 20% | ___ / 20 |
| Model / RAG / Agent Integration | 20% | ___ / 20 |
| Security / Governance / Trust | 15% | ___ / 15 |
| Scale / Cost / Reliability | 15% | ___ / 15 |
| Evaluation / Observability / Release | 15% | ___ / 15 |
| Google Drill & Architect Defense | 15% | ___ / 15 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

ARCH-02 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] deterministic vs AI boundary is clear
- [ ] provider abstraction/routing/fallback is defendable
- [ ] RAG/agent/tool responsibilities are distinct
- [ ] security and tenant boundaries are deterministic
- [ ] scale/cost/latency controls are clear
- [ ] evaluation/versioning/rollout are clear
- [ ] generated outputs/actions are validated
- [ ] full end-to-end AI architecture can be defended

---

# 9. Final Quick Notes

```text
AI architecture:
business goal
→ deterministic core
→ AI capability
→ data boundary
→ model/tool boundary
→ validation
→ evaluation
→ security
→ cost/latency
→ observability
→ rollout

Model proposes
Application authorizes
Business service decides
Human approves when risk requires

Version everything important.
Evaluate before rollout.
Fallback must preserve quality/security/privacy.
```

---

# 10. Decision

### READY

Move to:

> **ARCH-03 — Security, Performance & Production**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
