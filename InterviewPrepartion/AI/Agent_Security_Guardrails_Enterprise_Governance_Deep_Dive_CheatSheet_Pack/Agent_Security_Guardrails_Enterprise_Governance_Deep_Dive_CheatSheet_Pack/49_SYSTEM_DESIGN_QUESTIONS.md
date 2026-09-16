# Agent Security — System Design Questions

## Q1 — Design a Secure Financial Agent

Identity → risk-tier tools → authz → HITL → idempotent execution → audit.

## Q2 — Design Secure Enterprise RAG

Tenant identity → ACL-aware retrieval → provenance → output filtering → audit.

## Q3 — Design Secure Multi-Agent Platform

Per-agent identities/roles/tools + handoff policy + context isolation + centralized audit.

## Q4 — Design Tool Governance

Catalog + owner + risk + auth scope + version + approval policy + monitoring.

## Q5 — Design Prompt-Injection Defense

Treat external content as untrusted + deterministic policy + restricted tools + egress controls.

## Answer Framework

**Identity → trust boundary → policy → least privilege → validation → approval → execution → audit.**
