# Spring Batch 6.0.5 — Current Baseline

## Current Stable
**Spring Batch 6.0.5**
Released: **August 20, 2026**

Official stable documentation also lists:
- 5.2.6
- 5.1.3

Preview:
- **6.1.0-M1**

## Major Spring Batch 6 Capabilities
- new chunk-oriented processing implementation
- new concurrency model
- new command-line operator
- failed job-execution recovery
- improved stop support across step types
- graceful shutdown
- Java Flight Recorder observability
- JSpecify null-safety
- local chunking
- SEDA-style Spring Integration processing
- Jackson 3 support
- RemoteStep support
- lambda-style configuration

## Infrastructure Change Worth Remembering
Modern Batch 6 infrastructure can use:
- `ResourcelessJobRepository`
- JDBC-backed JobRepository
- MongoDB-backed JobRepository

Use a persistent repository whenever restartability, execution history, partition metadata or operational control matters.
