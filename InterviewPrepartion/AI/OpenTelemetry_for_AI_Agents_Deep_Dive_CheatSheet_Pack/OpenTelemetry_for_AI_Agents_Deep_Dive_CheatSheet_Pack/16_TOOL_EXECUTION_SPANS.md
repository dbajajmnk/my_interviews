# Tool Execution Spans

## Capture

- tool name;
- call ID;
- duration;
- status;
- retry count;
- authorization/approval outcome.

## Arguments/Results

Only capture when policy permits, and redact sensitive values.

## Rule

Tool execution should be visible as its own operation, not hidden inside the model span.
