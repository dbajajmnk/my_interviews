# What Is LangChain?

## Definition

LangChain is an open-source framework for building LLM-powered applications and agents using model integrations, tools, agent abstractions, retrieval, memory, structured output, streaming, and middleware.

## Why It Exists

Without a framework, application code often becomes provider-specific glue around:
- prompts;
- model calls;
- tool schemas;
- retries;
- state;
- streaming;
- retrieval;
- memory;
- tracing.

LangChain provides reusable abstractions for these concerns.

## Best Use

Use LangChain when you want:
- quick integration across models/tools;
- standard agent construction;
- runtime extensibility through middleware;
- portable tool abstractions;
- retrieval and memory integration;
- easier migration between providers.

## When Not Necessary

For a very small one-model/one-call application, raw provider SDKs may be simpler.

Use framework abstractions when the application has real orchestration, tool, state, or portability needs.
