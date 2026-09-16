# Spring AI Production Checklist

## Model
- exact provider/model version known
- quality benchmark on own workload
- timeout
- retry policy
- fallback tested
- token/output limits

## Prompt
- versioned
- injection-aware
- regression evaluated
- no secrets embedded

## RAG
- source authority
- stable chunk IDs
- embedding version
- tenant/ACL filtering
- topK/threshold evaluated
- citations/source metadata
- freshness pipeline

## Tools
- least privilege
- per-call exposure for risky tools
- input validation
- authorization
- idempotency
- timeout
- tool-call budget
- human approval where needed

## Memory
- conversation ID isolation
- retention/deletion
- privacy
- bounded context window

## Operations
- observations/traces
- token/cost metrics
- model/tool/RAG latency
- golden evaluation suite
- provider rate-limit alerts
- rollback strategy
