# Microsoft Foundry Tracing

## Architecture

Microsoft Foundry stores agent trace telemetry in Azure Monitor Application Insights using OpenTelemetry semantic conventions.

## Current Capabilities

Tracing can show:
- inputs/outputs;
- tool usage;
- retries;
- latency;
- token usage;
- retrieval operations.

## Server vs Client

Server-side tracing is the simplest starting point for supported hosted scenarios. Client-side OTel instrumentation adds visibility around custom application code.

## Privacy

Microsoft guidance explicitly warns that traces can include prompts, tool arguments/results and other sensitive content and recommends redaction/minimization.
