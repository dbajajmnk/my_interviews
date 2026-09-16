# What Is Observability?

## Definition

Observability is the ability to understand a system's internal behavior from emitted telemetry.

## Three Questions

An agent platform must help answer:
1. What happened?
2. Where did time/cost/failure occur?
3. Why did the final behavior emerge?

## Agent-Specific Challenge

A single user request may create many nested operations:
- several model calls;
- retrieval;
- multiple tools;
- retries;
- handoffs;
- memory operations.
