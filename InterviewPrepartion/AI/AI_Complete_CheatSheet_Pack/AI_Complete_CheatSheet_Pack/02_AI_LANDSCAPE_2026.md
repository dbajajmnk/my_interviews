# AI Landscape — 2026

## Core Architecture Direction

Production AI is increasingly organized around:

```text
Foundation Models
+ Retrieval / Knowledge
+ Tools
+ Agent Harnesses
+ Sandboxes
+ Memory / Context Management
+ Evals
+ Guardrails
+ Observability
```

## Current Platform Direction

### OpenAI
- Responses API remains a key direct model/tool API primitive.
- Agents SDK supports application-side agent orchestration.
- Agents API (public beta, September 2026) provides a managed long-running agent harness with tools, environments, context management and multi-agent support.

### AWS
- Amazon Bedrock remains the foundation-model platform.
- Knowledge Bases remain a managed RAG capability.
- Guardrails evaluate model inputs/outputs.
- Bedrock Agents Classic entered maintenance mode for new customers in July 2026.
- AgentCore is AWS's recommended direction for new agent workloads.

### Google
- Gemini APIs continue to support multimodal model workflows and context caching.
- Model/version names change rapidly; production designs should capability-test instead of hard-coding assumptions.

## Rule

Do not architecture around one model name.

Architecture around capabilities:

```text
generate
reason
embed
retrieve
tool-call
multimodal
structured-output
latency
cost
security
residency
```
