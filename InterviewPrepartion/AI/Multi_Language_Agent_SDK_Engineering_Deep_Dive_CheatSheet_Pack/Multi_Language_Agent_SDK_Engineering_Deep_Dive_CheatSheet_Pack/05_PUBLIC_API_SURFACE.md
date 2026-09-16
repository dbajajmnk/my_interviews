# Public API Surface

## Keep Small

Expose stable concepts:
- Agent;
- Tool;
- Run;
- Context;
- StreamEvent;
- Error;
- Provider adapter interfaces.

## Hide

Keep provider-specific HTTP details, transport quirks, raw payloads, retries, and telemetry plumbing internal.

## Rule

Every public symbol becomes a compatibility commitment.
