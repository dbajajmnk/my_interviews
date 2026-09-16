# SDK API Design & Versioning — System Design Questions

## Q1 — Design Versioning for a Multi-Language Agent SDK

Canonical contract + SemVer + per-language compatibility checks + parity matrix.

## Q2 — Add Streaming v2 Without Breaking v1

New event schema/capability flag + adapter + old API remains supported.

## Q3 — Replace Provider Backend

Keep public abstractions stable; swap provider adapter; capability-test differences.

## Q4 — Change Tool Schema

Add optional arg or version tool contract; keep old adapter until migration.

## Q5 — Major Version Migration

Deprecation window + migration guide + codemod + compatibility shim + telemetry on old usage.

## Answer Framework

**Public contract → change classification → compatibility strategy → capability/deprecation → tests → migration.**
