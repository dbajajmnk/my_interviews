# Sources & Accuracy Notes

This pack uses a vendor-neutral architecture core and current 2026 cloud/platform adapters.

## Current Platform Signals

### Microsoft Foundry
Microsoft's current Foundry architecture separates governance/resources/projects from models, knowledge/search, storage, security and observability. Foundry Agent Service exposes managed agent runtime, toolboxes, models, observability, identity/security and publishing.

### AWS AgentCore
AWS describes AgentCore as modular services for secure agent runtime, tools/gateway, memory and production operations. AgentCore Gateway provides a governed access point to MCP, HTTP and inference targets. AgentCore Memory separates immediate conversational context from durable memory.

## Accuracy Rule

Before implementation verify current:
- provider API/SDK status,
- GA vs preview/beta,
- model versions/context limits,
- regional availability,
- pricing/quotas,
- data retention and training policies,
- cloud security/network features.
