# Rollback Strategy

## Rollback Scope

Be able to restore:
- code;
- prompt;
- model config;
- tool schema;
- retriever/index;
- guardrail policy.

## Rule

Rollback is not complete if only the container image is reverted.
