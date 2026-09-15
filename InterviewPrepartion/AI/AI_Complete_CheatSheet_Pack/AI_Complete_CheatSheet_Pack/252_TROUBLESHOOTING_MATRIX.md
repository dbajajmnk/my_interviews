# AI Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| Hallucination | evidence/tool trace | no grounding / bad context |
| RAG no answer | retrieval recall | chunk/embed/filter/query |
| Wrong citation | claim-context mapping | noisy/duplicate context |
| Agent loops | trace/stop condition | vague goal/tool failure |
| Wrong tool | tool schema/descriptions | ambiguity/router issue |
| Unsafe action | policy executor | missing auth/approval |
| High cost | token/tool trace | huge context/loops/model |
| High latency | span timings | model/tools/retries |
| Context overflow | context budget | too much history/evidence |
| Poor classifier recall | threshold/imbalance | wrong metric/training |
| Model overfits | train vs val | leakage/capacity/data |
| Training diverges | loss/gradients/LR | optimizer/data/numerics |
| GPU OOM | memory profile | batch/context/model size |
| Drift | input/perf distribution | changed production data |
| Prompt regression | eval suite | prompt/model change |
| Retrieval stale | ingestion freshness | sync/index pipeline |
| Cross-tenant leak | ACL/filter/audit | authorization failure |

## Debug Flow

```text
Reproduce
→ identify AI layer
→ inspect trace
→ data/evidence
→ model/prompt
→ retrieval/tools
→ policy
→ latency/cost
→ eval regression
→ fix
→ rerun eval suite
```
