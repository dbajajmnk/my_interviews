# Agent Testing — System Design Questions

## Q1 — Design a Test Platform for Agent SDK

Need fake model provider, fake tool registry, trace assertions, golden datasets, CI gates.

## Q2 — Test a Multi-Agent System

Validate route, handoff, context isolation, final synthesis, cost, and termination.

## Q3 — Test HITL Workflow

Persist interruption, approve/reject, restart process, resume, assert side effect exactly once.

## Q4 — Test Agentic RAG

Seed fixed corpus, test expected documents, reranking, access filters, grounded answer.

## Q5 — Test Streaming SDK

Script event sequence and verify ordering, cancellation, reconnect, terminal completion.

## Answer Framework

**Unit → fake model/tool → contract → workflow → failure injection → eval regression → CI gate → canary.**
