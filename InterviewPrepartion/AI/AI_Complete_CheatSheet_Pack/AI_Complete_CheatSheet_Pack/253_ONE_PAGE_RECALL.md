# AI — One-Page Recall

## Traditional AI / ML

```text
Data
→ Features
→ Train
→ Validate/Test
→ Register
→ Deploy
→ Monitor
```

## Generative AI

```text
Prompt + Context
      ↓
Foundation Model
      ↓
Generated Output
      ↓
Validate / Guardrail
```

## RAG

```text
Documents → Chunk → Embed → Index
                         ↑
Query → Rewrite → Retrieve → Rerank
                         ↓
                     Context
                         ↓
                       LLM
                         ↓
                 Answer + Citations
```

## Agent

```text
Goal
 ↓
Agent Harness
 ├── Context/Memory
 ├── Model
 ├── Tools
 ├── Policies
 ├── Sandbox
 ├── Checkpoints
 └── Human Approval
 ↓
Outcome
```

## Production

```text
Evals
Security
Guardrails
Observability
Cost
Latency
Governance
Business KPI
```
