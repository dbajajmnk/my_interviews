# Agent Run Spans

## Recommended Root

Represent one logical agent invocation/workflow as the root or major parent span.

## Attributes

Useful metadata:
- agent name/version;
- run ID;
- workflow;
- tenant-safe correlation;
- status.

## Rule

Do not attach secrets or raw user identity unnecessarily.
