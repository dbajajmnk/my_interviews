# Model Call Spans

## Capture

- provider/system;
- model;
- operation;
- latency;
- token usage;
- status/error.

## Optional Sensitive Data

Prompt/completion content should follow explicit telemetry policy.

## Rule

Model spans should make it easy to separate model latency from tool/runtime latency.
