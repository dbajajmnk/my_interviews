# GOJ Interview Preparation — Cognizant
## Area 04 — AI
### AI-01 — GenAI & LLM Foundations

**Role:** Python Full Stack Development Architect with AI  
**Company:** Cognizant  
**Interview Date:** 24 August 2026  
**Interview Time:** 3:00 PM – 4:00 PM  
**Experience Level:** 16+ Years  
**Priority:** P0  
**GOJ Mapping:** Emerging AI Layer + M16 AI Evaluation + M19 API Engineering + M20 Performance/Security + M21 Architecture  
**Baseline:** KIS + DRY + SOLID + Google-Level + 360° Coverage  
**Execution Rule:** One file at a time → readiness gate → repair only weak areas

> **Source Rule:** No detailed JD was provided. This pack is role-derived from “Python Full Stack Development Architect with AI.” It focuses on durable, vendor-neutral LLM concepts. Provider-specific APIs are secondary.

---

# 1. Pack Objective

AI-01 gives you enough depth to explain what modern LLM systems are, how they behave, where they fail, and how an architect should integrate them safely.

By the end of this pack you should be able to:

- explain generative AI, LLMs, tokens, context windows, embeddings, and transformers in interview-friendly language;
- explain attention conceptually without unnecessary mathematics;
- distinguish training, inference, fine-tuning, prompting, and retrieval;
- explain temperature, sampling, deterministic vs creative behavior, and structured output;
- design effective prompts using context, instruction, examples, constraints, and output contracts;
- explain hallucination and why it cannot be “turned off” completely;
- explain latency, token cost, context size, and model-selection trade-offs;
- integrate an LLM behind a Python backend rather than directly exposing provider credentials;
- explain basic safety, privacy, prompt-injection, and data-governance concerns;
- discuss basic LLM evaluation and quality criteria;
- survive architect-level AI follow-up questions without bluffing.

Target:

> **Understand → Explain → Prompt → Integrate → Evaluate → Protect → Optimize → Defend**

---

# 2. Directory Structure

```text
GOJ-Cognizant-AI-01-Final/
│
├── README.md
├── 01-GenAI-LLM-and-Transformer-Foundations.md
├── 02-Tokens-Context-Embeddings-and-Inference.md
├── 03-Prompt-Engineering-and-Structured-Outputs.md
├── 04-LLM-API-Integration-Latency-Cost-and-Model-Selection.md
├── 05-Hallucination-Safety-Privacy-and-Basic-Evaluation.md
├── 06-Architect-Scenarios-and-Production-AI-Decisions.md
└── 07-AI-01-Final-Readiness-Assessment.md
```

KIS rule:

- no deep ML mathematics unless the interviewer asks;
- no provider trivia unless it supports a decision;
- RAG depth belongs to AI-02;
- agents and advanced evaluation/production AI belong to AI-03.

---

# 3. Time Allocation

| File | Focus | Suggested Time |
|---|---|---:|
| 01 | GenAI, LLMs, transformers, training vs inference | 65 min |
| 02 | Tokens, context, embeddings, inference behavior | 65 min |
| 03 | Prompt engineering, few-shot, structured output | 70 min |
| 04 | API integration, latency, cost, model selection | 70 min |
| 05 | Hallucination, safety, privacy, basic evaluation | 70 min |
| 06 | Architect scenarios & production AI decisions | 65 min |
| 07 | Final readiness assessment | 60 min |
| **Total** |  | **~7 hr 45 min** |

Time rule:

> **Learn the mental model deeply enough to make engineering decisions; do not memorize vendor marketing language.**

---

# 4. Locked GOJ Google-Level File Standard

Every learning file follows:

> **Objective → 5W+H → Real-Life Analogy → Visualization → Mind Map → Core Concepts → Engineering Depth → Implementation / Code → Hands-On Practice → Google Interview Drill → Common Mistakes → Best Practices → Interview Questions → Google-Level Follow-Ups → Quick Revision → Readiness Gate → References**

Mandatory reasoning flow:

> **Clarify → First Approach → Improve → Design / Prompt → Test → Edge Cases → Cost / Risk → Trade-Off → Follow-Up → Defend**

---

# 5. AI Interview Standard

For every LLM/GenAI design question:

```text
1. Clarify business objective
2. Identify whether LLM is actually needed
3. Define input/context
4. Define output contract
5. Choose model capability level
6. Define quality/evaluation criteria
7. Define latency/cost constraints
8. Define safety/privacy boundary
9. Define failure/fallback behavior
10. Add observability
11. Test edge cases/adversarial input
12. Defend trade-offs
```

---

# 6. Final Scoring Standard

| Dimension | Weight |
|---|---:|
| LLM / Transformer Foundations | 20% |
| Prompting / Structured Output | 20% |
| Integration / Cost / Latency | 20% |
| Google Interview Drill | 20% |
| Safety / Hallucination / Evaluation | 10% |
| Architect-Level Defense | 10% |
| **Total** | **100%** |

### READY

- 80%+ overall;
- no P0 weakness;
- can explain LLM behavior without hype;
- can distinguish prompt vs retrieval vs fine-tuning;
- can reason about cost/latency/privacy;
- can design a safe backend integration.

---

# 7. AI-01 Completion Criteria

You must be able to:

- explain LLM in plain English and engineering language;
- explain transformer/attention conceptually;
- explain tokenization/context window;
- explain embeddings at high level;
- explain training vs inference vs fine-tuning;
- explain temperature/sampling;
- write robust prompts with output contracts;
- explain structured output;
- explain hallucination;
- explain prompt injection at basic level;
- explain model-selection trade-offs;
- define basic evaluation criteria;
- design Python-backed LLM API safely.

---

# 8. Next Pack

After AI-01:

> **AI-02 — RAG Architecture**
