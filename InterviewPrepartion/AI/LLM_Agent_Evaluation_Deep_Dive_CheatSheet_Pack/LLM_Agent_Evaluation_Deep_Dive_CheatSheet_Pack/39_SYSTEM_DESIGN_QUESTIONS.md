# LLM & Agent Evaluation — System Design Questions

## Q1 — Design an Evaluation Platform

Dataset registry → runner → trace capture → evaluator pipeline → score store → dashboard → CI gate.

## Q2 — Evaluate Enterprise RAG

Measure retrieval recall/precision, groundedness, citation correctness, latency, and access-control correctness.

## Q3 — Evaluate Tool-Using Agent

Measure tool selection, arguments, retries, side-effect correctness, and final task success.

## Q4 — Evaluate Multi-Agent System

Measure correct routing, handoff quality, duplicate work, path efficiency, and final synthesis.

## Q5 — Production Eval Strategy

Combine sampled traces, user feedback, business KPIs, automated judges, and incident-driven regression cases.

## Answer Framework

**Dataset → runner → traces → evaluators → scorecard → thresholds → CI gate → production monitoring.**
