# AI Architecture Decision Tree

```text
Need only prediction from structured data?
→ ML service

Need generated content/reasoning?
→ Foundation model

Need private/current knowledge?
→ RAG

Need external actions?
├─ Known steps → deterministic workflow + AI nodes
└─ Unknown dynamic steps → bounded agent

Need many models/providers?
→ Model Gateway + Capability Registry

Need many enterprise tools?
→ Tool Gateway + Registry + Policy

Need long-running work?
→ Queue/Workflow + Checkpoints + Agent Runtime

High-impact action?
→ Human Approval + deterministic authorization
```
