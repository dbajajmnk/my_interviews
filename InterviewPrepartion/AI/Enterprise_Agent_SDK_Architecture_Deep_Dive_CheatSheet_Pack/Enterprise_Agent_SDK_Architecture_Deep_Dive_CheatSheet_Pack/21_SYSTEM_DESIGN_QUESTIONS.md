# Enterprise Agent SDK — System Design Questions

## Q1 — Design a Multi-Provider Agent SDK

Cover:
- public Agent API;
- ModelProvider abstraction;
- capability discovery;
- tool registry;
- context/state;
- event stream;
- errors;
- telemetry;
- testing.

## Q2 — Design Multi-Language SDKs

Explain:
1. shared semantic specification;
2. language-specific implementation;
3. generated schemas only where useful;
4. common conformance tests;
5. consistent telemetry and errors.

## Q3 — Design Tool Execution Security

```text
Tool Request
 ↓
Registry
 ↓
Schema Validation
 ↓
AuthZ
 ↓
Risk Classification
 ↓
Approval if required
 ↓
Execution
 ↓
Audit
```

## Q4 — Design Long-Running Agent Runs

Use:
- async run handle;
- persistent state/checkpoints;
- event stream;
- cancellation;
- resume;
- deadlines;
- durable tool result recording.

## Q5 — How Would You Explain Trade-offs?

Always mention:
- simplicity vs flexibility;
- abstraction vs provider features;
- stability vs rapid evolution;
- developer experience vs configurability;
- synchronous ease vs async scalability.

## Answer Framework

For any SDK architecture question:

**Public API → Runtime → Providers → Tools → State/Memory → Security → Events → Errors → Observability → Testing → Versioning.**
