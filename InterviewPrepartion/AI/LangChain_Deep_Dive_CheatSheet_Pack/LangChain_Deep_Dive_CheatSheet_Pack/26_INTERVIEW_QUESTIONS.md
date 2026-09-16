# LangChain — Interview Questions & Answers

## 1. What is LangChain?

A framework providing model/tool integrations and high-level abstractions for building LLM and agent applications.

## 2. LangChain vs LangGraph?

LangChain is higher-level. LangGraph is the lower-level graph runtime/orchestration layer. Current LangChain agents run on LangGraph.

## 3. What does create_agent do?

It builds an iterative model/tool agent runtime that maintains state and runs until a final answer or stop condition.

## 4. What is a tool?

A typed callable capability exposed to the model with a description and input schema.

## 5. State vs runtime context?

State is mutable thread-scoped data. Runtime context is static invocation-scoped configuration/dependencies.

## 6. Short-term vs long-term memory?

Short-term is thread-scoped state persisted with a checkpointer. Long-term uses a store across threads.

## 7. Why middleware?

To customize prompts, models, tools, retries, context, safety, and lifecycle behavior without rewriting the runtime.

## 8. What is structured output?

Validated machine-readable output defined by a schema, using provider-native support or a tool-based strategy.

## 9. How does streaming work conceptually?

The agent emits incremental messages/state/custom events while the run progresses.

## 10. What is context engineering?

Deliberately controlling prompts, messages, tools, model choice, response format, state, and memory supplied to each model call.

## 11. What is MCP?

A protocol for standardizing tool/context integration with LLM applications; LangChain can consume MCP-hosted tools through adapters.

## 12. How do you secure tools?

Auth/authz outside the model, least privilege, schema validation, policy checks, audit, and HITL for sensitive actions.

## 13. How do you test LangChain agents?

Unit-test tools/middleware, fake model dependencies, test expected tool calls and state transitions, then run evaluation datasets.

## 14. What is LangSmith?

A tracing/debugging/evaluation platform commonly used with LangChain/LangGraph applications.

## 15. What about LCEL?

It is the runnable-composition model used heavily in older/current non-agent pipelines; I know it for existing systems, while current agent work centers on `create_agent`, middleware, runtime, and LangGraph.
