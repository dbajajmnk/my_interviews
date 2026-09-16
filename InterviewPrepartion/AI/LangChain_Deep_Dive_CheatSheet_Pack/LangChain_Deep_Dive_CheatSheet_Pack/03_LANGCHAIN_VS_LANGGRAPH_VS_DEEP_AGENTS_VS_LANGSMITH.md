# LangChain vs LangGraph vs Deep Agents vs LangSmith

## Comparison

| Component | Best Mental Model |
|---|---|
| LangChain | High-level agent framework and integrations |
| LangGraph | Low-level orchestration/runtime for stateful graphs |
| Deep Agents | Batteries-included agent layer for advanced agent workflows |
| LangSmith | Tracing, debugging, evaluation, observability |

## Selection Rule

- Need standard agent quickly → **LangChain**
- Need deterministic + agentic graph control → **LangGraph**
- Need higher-level agent features such as subagents/context compression → **Deep Agents**
- Need tracing/evaluation → **LangSmith**

## Interview Answer

> I would not treat LangChain and LangGraph as competitors. LangChain agents are built on LangGraph. LangChain is the higher-level developer API; LangGraph is the lower-level orchestration layer.
