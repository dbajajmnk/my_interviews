# Observability and LangSmith

## What to Observe

- agent run;
- model calls;
- tool calls;
- retrieval;
- middleware;
- errors/retries;
- latency;
- token usage;
- outputs.

## LangSmith Role

LangSmith is commonly used around LangChain/LangGraph applications for:
- tracing;
- debugging;
- evaluation;
- monitoring.

## Enterprise Rule

Do not log sensitive prompts/tool payloads indiscriminately. Apply redaction and access controls.
