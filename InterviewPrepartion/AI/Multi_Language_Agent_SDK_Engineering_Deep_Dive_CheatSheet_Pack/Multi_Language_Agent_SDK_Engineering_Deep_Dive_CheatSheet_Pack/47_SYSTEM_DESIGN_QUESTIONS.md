# Multi-Language Agent SDK Engineering — System Design Questions

## Q1 — Design a Cross-Language Agent SDK Platform

Canonical spec → adapters → language APIs → shared fixtures → CI parity → native package registries.

## Q2 — Design Streaming Across Four Languages

Semantic event envelope + native async stream abstraction + cancellation + reconnect/finalization rules.

## Q3 — Design Provider-Neutral Tool Calling

Canonical tool schema/dispatcher + provider adapters + validation/authz + normalized result/error.

## Q4 — Design Backward-Compatible SDK Evolution

Additive contracts + capability metadata + deprecation + migration guides + major-version removal.

## Q5 — Design Release Automation

Common spec version → matrix builds → parity tests → package publish → docs/release notes.

## Answer Framework

**Canonical semantics → idiomatic mapping → wire/error consistency → parity tests → packaging → compatibility.**
