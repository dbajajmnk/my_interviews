# Agent Types and Providers

## Standard Agent

A standard agent wraps a chat/inference client and exposes a common run/session/tool interface.

## Specialized/Remote Agent Types

Current documentation includes agent types such as:
- FoundryAgent;
- A2AAgent;
- GitHubCopilotAgent;
- ClaudeAgent;
- custom agents.

## Provider Boundary

Provider-specific setup belongs at the client/provider boundary.

Application logic should depend on the common agent abstraction where practical.

## Interview Point

> Provider neutrality is useful, but capability differences still matter. I keep a common interface while preserving provider-specific capabilities where they add real value.
