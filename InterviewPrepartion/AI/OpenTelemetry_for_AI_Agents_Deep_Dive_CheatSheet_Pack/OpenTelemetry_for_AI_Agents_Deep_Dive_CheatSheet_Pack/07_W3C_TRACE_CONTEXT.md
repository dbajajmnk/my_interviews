# W3C Trace Context

## Purpose

Standard propagation format for distributed trace identity.

## Common Headers

- `traceparent`
- `tracestate`

## Agent Example

```text
API → Agent Runtime → Tool Service → Database
       same distributed trace context
```

## Rule

Propagate trace context across every network boundary you control.
