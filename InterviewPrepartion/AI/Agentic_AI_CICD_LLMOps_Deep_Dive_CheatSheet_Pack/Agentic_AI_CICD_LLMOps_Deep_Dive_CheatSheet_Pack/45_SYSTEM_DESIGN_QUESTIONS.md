# Agentic AI CI/CD & LLMOps — System Design Questions

## Q1 — Design a Release Pipeline for an Agent SDK

Build → unit/contract → agent regression → security → cost/latency → package → DEV/UAT → canary → production.

## Q2 — Design Safe Model Upgrade

Pin candidate model, run offline evals, shadow/canary, compare quality/cost/latency, promote or rollback.

## Q3 — Design Prompt Deployment

Prompt in Git + version tag + regression dataset + approval + progressive rollout + telemetry.

## Q4 — Design RAG Index Release

Version corpus/chunking/embedding/index, build parallel index, evaluate, switch alias, rollback alias if needed.

## Q5 — Design Multi-Language SDK Delivery

Canonical contract → parity tests → per-language packaging → release notes → deprecation/compatibility matrix.

## Answer Framework

**Version → build → test/eval → secure → package → promote → canary → observe → rollback.**
