# Middleware

## What

Middleware hooks into the agent lifecycle and is a primary mechanism for customizing behavior without rewriting the runtime.

## Uses

Middleware can:
- change prompts dynamically;
- choose models;
- filter tools;
- trim/summarize context;
- retry model/tool calls;
- enforce policies;
- log before/after model execution.

## Mental Model

```text
Input
 ↓
Before Hooks
 ↓
Model / Tools
 ↓
After Hooks
 ↓
Output
```

## Examples of Built-In Middleware

Current LangChain documentation includes middleware patterns such as:
- summarization;
- model retry;
- tool retry;
- tool selection;
- context editing;
- subagents.

## Interview Point

> Middleware is the clean extension point for cross-cutting agent behavior and context engineering.
