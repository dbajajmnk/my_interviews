# AI Production Readiness Checklist

## Business
- [ ] measurable use case
- [ ] owner
- [ ] success KPI
- [ ] acceptable failure behavior

## Data
- [ ] source authority
- [ ] privacy/classification
- [ ] lineage
- [ ] freshness
- [ ] access controls

## Model
- [ ] benchmark on own workload
- [ ] fallback/routing
- [ ] version pinned where possible
- [ ] latency/cost measured

## RAG
- [ ] chunking evaluated
- [ ] hybrid retrieval considered
- [ ] reranking evaluated
- [ ] ACL before retrieval
- [ ] citations validated
- [ ] freshness SLA

## Agents
- [ ] tool allowlist
- [ ] least privilege
- [ ] deterministic authorization
- [ ] step/time/cost limits
- [ ] durable checkpoints
- [ ] idempotent actions
- [ ] human approval for high impact

## Safety/Security
- [ ] prompt-injection tests
- [ ] DLP/PII controls
- [ ] output validation
- [ ] sandbox/egress controls
- [ ] audit trail

## Operations
- [ ] traces
- [ ] eval dashboard
- [ ] token/cost metrics
- [ ] SLOs
- [ ] rollback
- [ ] model/prompt/index/tool versions recorded
