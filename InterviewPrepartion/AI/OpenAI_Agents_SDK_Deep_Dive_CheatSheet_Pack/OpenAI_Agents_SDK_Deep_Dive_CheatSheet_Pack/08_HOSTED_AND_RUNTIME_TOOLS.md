# Hosted and Runtime Tools

## Tool Categories

Current SDK documentation distinguishes multiple tool categories, including:
- hosted OpenAI tools;
- local/runtime execution tools;
- function tools;
- agents as tools;
- experimental workspace/Codex-style tooling.

## Examples of Hosted Tools

Examples documented for OpenAI Responses models include:
- web search;
- file search;
- code interpreter;
- hosted MCP;
- image generation;
- tool search;
- programmatic tool calling.

## Runtime Design

Decide where execution happens:
- OpenAI-managed;
- local process;
- remote enterprise service;
- isolated sandbox.

## Security Rule

Execution location changes the threat model. Local shell/computer tools require much stricter controls than read-only retrieval tools.
