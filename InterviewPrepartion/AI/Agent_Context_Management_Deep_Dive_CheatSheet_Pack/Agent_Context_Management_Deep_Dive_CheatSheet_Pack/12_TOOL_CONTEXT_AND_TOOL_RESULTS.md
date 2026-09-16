# Tool Context and Tool Results

## Tool Context

Tool handlers may need trusted runtime data:
- user identity;
- tenant;
- tool call ID;
- timeout;
- trace ID.

## Tool Results

Tool outputs may become model context for the next decision.

## Risk

Tool responses can be:
- huge;
- stale;
- sensitive;
- maliciously crafted.

## Rule

Normalize, filter, and size-limit tool output before adding it to model context.
