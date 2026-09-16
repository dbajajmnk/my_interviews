# Structured Outputs — Production Architecture

## Reference Architecture

```text
Application Request
      ↓
Agent / LLM Service
      ↓
Schema Registry / Type
      ↓
Provider
      ↓
Structured Response
      ↓
Parser / Type Validator
      ↓
Business Validator
      ↓
Domain Service / Workflow
      ↓
Audit / Metrics
```

## Production Checklist

- schema source of truth;
- provider capability checks;
- type validation;
- business validation;
- refusal/incomplete handling;
- schema versioning;
- contract tests;
- telemetry;
- security checks.
