# OpenAI Agents SDK Tracing

## Current Built-In Tracing

Current OpenAI Agents SDK tracing records an end-to-end workflow and nested spans.

## Python Span Types Documented

The current SDK automatically traces operations including:
- runner/task/turn;
- agent execution;
- LLM generation;
- function tools;
- guardrails;
- handoffs;
- supported audio operations.

## Trace Metadata

Traces support workflow name, trace ID, optional grouping and metadata.

## Extensibility

Custom spans and custom trace processors can be used to integrate additional destinations or application-specific operations.

## Important

OpenAI SDK tracing is its own tracing facility. When integrating into a broader enterprise OTel architecture, create a deliberate bridge/correlation strategy rather than assuming all trace formats are automatically identical.
