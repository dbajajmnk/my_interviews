# What Is Agent Streaming?

## Definition

Agent streaming is incremental delivery of execution events while an agent run is still in progress.

## Possible Events

- token/text delta;
- model response lifecycle;
- tool requested;
- tool started;
- tool completed;
- handoff;
- state update;
- custom progress;
- approval required;
- error;
- final result.

## Why

Streaming improves:
- perceived latency;
- user trust;
- long-running task visibility;
- operational debugging;
- interactive approvals.

## Rule

Do not equate streaming with “print tokens as they arrive.” Agent streaming is a workflow/event concern.
