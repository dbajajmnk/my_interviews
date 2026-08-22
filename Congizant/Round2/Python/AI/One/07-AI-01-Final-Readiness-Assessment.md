# AI-01 — Final Readiness Assessment

**Priority:** P0  
**Suggested Time:** 60 minutes  
**Rule:** Answer without notes first. Repair only weak areas.

---

# 1. Rapid Recall — 12 Minutes

Answer in 30–60 seconds:

1. AI vs ML vs GenAI?
2. What is an LLM?
3. What is transformer?
4. What is attention?
5. Pretraining vs inference?
6. Prompting vs fine-tuning?
7. Retrieval vs fine-tuning?
8. What is token?
9. Context window?
10. What is embedding?
11. Embedding vs generation?
12. Temperature?
13. What is few-shot prompting?
14. Structured output?
15. Why runtime validation?
16. What is hallucination?
17. How reduce hallucination?
18. Prompt injection?
19. Why backend owns LLM secret?
20. What affects LLM cost?
21. What affects LLM latency?
22. How choose model?
23. What is golden dataset?
24. Why human review?
25. What AI SLOs matter?

---

# 2. Prompt Design — 10 Minutes

Design prompt for invoice extraction.

Must include:

- clear fields;
- null policy;
- structured output;
- no guessing;
- runtime validation plan.

---

# 3. Architecture Scenario — 10 Minutes

Question:

> “Use AI to calculate payroll.”

Explain why deterministic payroll logic should remain outside LLM and where AI can still help.

---

# 4. Cost / Performance Scenario — 8 Minutes

AI cost doubled with same traffic.

Investigate:

- input tokens;
- output tokens;
- history/context growth;
- model change;
- retries;
- tenant abuse;
- cache behavior.

---

# 5. Google Interview Drill — 12 Minutes

## Design Enterprise Support Assistant

Requirements:

- React;
- Python backend;
- PII;
- enterprise knowledge;
- tenant isolation;
- 5-second initial-response target.

Use:

> **Clarify → AI Fit → Architecture → Context/Data → Security → Cost/Latency → Evaluation → Failure → Defend**

Expected:

```text
React
→ Python API
→ auth/tenant boundary
→ context/retrieval layer
→ model adapter
→ output validation
→ response
```

Include:

- backend credentials;
- model selection;
- timeout;
- prompt injection awareness;
- evaluation;
- observability.

---

# 6. Architect Follow-Up — 8 Minutes

Answer:

1. Why not direct browser-to-LLM?
2. How handle hallucination?
3. How protect PII?
4. How handle provider outage?
5. How reduce token cost?
6. How evaluate model upgrade?
7. When fine-tune?
8. When not use LLM?

---

# 7. Scoring Rubric

| Dimension | Weight | Score |
|---|---:|---:|
| LLM / Transformer Foundations | 20% | ___ / 20 |
| Prompting / Structured Output | 20% | ___ / 20 |
| Integration / Cost / Latency | 20% | ___ / 20 |
| Google Interview Drill | 20% | ___ / 20 |
| Safety / Hallucination / Evaluation | 10% | ___ / 10 |
| Architect-Level Defense | 10% | ___ / 10 |
| **Total** | **100%** | **___ / 100** |

---

# 8. Readiness Gate

AI-01 is READY only if:

- [ ] 80%+ overall
- [ ] no P0 weakness
- [ ] LLM/transformer can be explained simply
- [ ] token/context/embedding understood
- [ ] prompt can be structured
- [ ] output validation understood
- [ ] model selection/cost/latency understood
- [ ] hallucination/safety/privacy understood
- [ ] AI architecture boundary defendable
- [ ] no hype/bluffing in answers

---

# 9. Final Quick Notes

```text
LLM = probabilistic transformer model over tokens
Attention connects context relationships
Training changes weights; inference uses them
Prompting changes context; fine-tuning changes weights
Embeddings represent semantic vectors
Context is finite and costly
Structured output still needs validation
Hallucination cannot be fully switched off
Ground + validate + evaluate
Backend owns secrets/security
Choose smallest sufficient model
Measure quality + latency + cost
LLM is a component, not the whole system
```

---

# 10. Decision

### READY

Move to:

> **AI-02 — RAG Architecture**

### REPAIR

Return only to weak topics.

---

> **GOJ Rule: Repair the gap, not the whole syllabus.**
