# Nodes, Edges, START and END

## Nodes

A node is a unit of execution.

Examples:
- model call;
- retrieval;
- tool execution;
- validation;
- approval;
- transformation.

## Edges

Edges define what executes next.

## START / END

`START` and `END` are special graph boundaries.

```text
START → classify → process → END
```

## Multiple Upstream Nodes

When multiple start nodes feed the same downstream edge, the runtime can wait for all required upstream nodes before continuing.
