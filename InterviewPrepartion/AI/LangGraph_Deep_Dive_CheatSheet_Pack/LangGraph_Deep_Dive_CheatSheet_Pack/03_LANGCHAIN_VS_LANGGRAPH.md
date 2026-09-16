# LangChain vs LangGraph

## Comparison

| Area | LangChain | LangGraph |
|---|---|---|
| Level | Higher-level | Lower-level |
| Primary goal | Build agents quickly | Custom orchestration |
| Agent loop | Prebuilt | Explicitly modeled |
| State | Managed for you | First-class graph state |
| Branching | Higher-level APIs | Explicit edges |
| HITL | Available | Native orchestration primitive |
| Durable execution | Under the hood | Direct control |

## Interview Answer

> I use LangChain when its prebuilt agent architecture is enough. I use LangGraph directly when I need explicit state, branching, durable execution, interrupts, subgraphs, or deterministic orchestration around agentic steps.
