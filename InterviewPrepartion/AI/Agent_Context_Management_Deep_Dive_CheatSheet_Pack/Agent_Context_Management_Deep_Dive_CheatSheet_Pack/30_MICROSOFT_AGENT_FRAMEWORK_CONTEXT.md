# Microsoft Agent Framework — Context Management

## Agent Composition

Current Microsoft Agent Framework describes an agent as combining:
- model/remote agent;
- instructions;
- tools;
- middleware;
- context providers;
- session state.

## Context Providers

Context providers are the natural place for proactive:
- memory;
- personalization;
- RAG;
- enterprise knowledge injection.

## Middleware

Middleware changes how execution behaves.

Context providers primarily control what context is supplied and optionally persisted.

## Session State

AgentSession provides conversation/session continuity across runs.

## Interview Distinction

> Middleware changes execution behavior; context providers change what the agent knows.
