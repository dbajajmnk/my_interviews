# Guardrails

## Types

The SDK supports:
- input guardrails;
- output guardrails;
- tool guardrails for guarded function-tool execution.

## Tripwire

A guardrail can trigger a tripwire and halt/interrupt the normal run path.

## Parallel vs Blocking Input Guardrails

Input guardrails can run:
- in parallel for lower latency;
- in blocking mode when you must prevent the agent/model/tool work from starting before validation passes.

## Boundary Detail

Agent-level input guardrails apply to the first agent in a chain, while final-output guardrails apply to the agent producing the final output. Tool guardrails are better when checks must run around every guarded function-tool invocation.

## Security Reminder

Guardrails complement application security. They do not replace authentication, authorization, tenant isolation, or policy enforcement.
