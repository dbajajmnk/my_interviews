# Handoff Context

## Question

When control moves to another agent, what should follow?

## Possible Handoff Payload

- user goal;
- relevant summary;
- selected entities;
- completed steps;
- unresolved issue;
- authorization context reference.

## Avoid

Passing:
- unrelated private history;
- raw full transcript;
- secrets;
- every tool result.

## Rule

A handoff should transfer the minimum context required for the receiving agent to continue safely.
