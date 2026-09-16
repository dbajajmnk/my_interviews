# Auto vs Manual Instrumentation

## Auto

Useful for standard libraries:
- HTTP;
- database;
- runtime;
- framework calls.

## Manual

Required for domain semantics:
- agent run;
- planning;
- tool invocation;
- approval;
- memory write;
- custom orchestration.

## Rule

Auto-instrument infrastructure; manually instrument the agent semantics the runtime uniquely understands.
