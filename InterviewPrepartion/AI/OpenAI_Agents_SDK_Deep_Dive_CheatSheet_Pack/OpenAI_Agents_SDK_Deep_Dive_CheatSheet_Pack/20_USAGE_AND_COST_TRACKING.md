# Usage and Cost Tracking

## Tracked Usage

The SDK aggregates per-run usage such as:
- request count;
- input tokens;
- output tokens;
- total tokens;
- cached/reasoning token details where available.

## Access

Usage is available through the run context/result context wrapper.

## Why

Use it for:
- budget enforcement;
- analytics;
- per-tenant reporting;
- optimization;
- model-routing decisions.

## Session Note

Sessions preserve conversation history, but each Runner execution reports usage for that run.
