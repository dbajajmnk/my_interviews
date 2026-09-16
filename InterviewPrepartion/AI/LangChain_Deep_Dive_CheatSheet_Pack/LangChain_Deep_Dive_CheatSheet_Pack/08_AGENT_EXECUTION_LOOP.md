# LangChain Agent Execution Loop

## Loop

```text
State
 ↓
Model
 ↓
Decision
 ├─ Final → END
 └─ Tool Call
      ↓
    Tool(s)
      ↓
    State update
      ↓
    Model again
```

## Capabilities

Current LangChain agents can support:
- sequential tool calls;
- parallel tool calls where appropriate;
- dynamic tool selection;
- retries/error handling;
- state persistence across tool calls.

## Stop Conditions

Typical stop conditions:
- model emits final response;
- step/iteration limit;
- policy/middleware ends execution;
- cancellation/failure.
