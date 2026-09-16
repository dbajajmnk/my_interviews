# Microsoft Agent Framework + OpenTelemetry

## Current Position

Microsoft Agent Framework emits OpenTelemetry telemetry for agents/workflows and follows GenAI semantic conventions.

## Workflow Observability

Current documentation describes workflow-specific spans, logs and metrics in addition to standard GenAI telemetry.

## DevUI

DevUI can display Agent Framework OpenTelemetry traces and can export them through an OTLP endpoint to external observability systems.

## Sensitive Data

Framework telemetry options can control whether serialized inputs/outputs are included.
