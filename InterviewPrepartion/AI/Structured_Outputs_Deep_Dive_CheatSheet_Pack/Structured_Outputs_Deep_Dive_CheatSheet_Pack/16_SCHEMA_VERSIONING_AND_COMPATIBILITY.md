# Schema Versioning and Compatibility

## Why

Structured-output schemas are public contracts.

## Versioning

Use semantic principles:
- additive optional field → usually compatible;
- remove/rename required field → breaking;
- enum semantic change → potentially breaking.

## Include Version?

For long-lived integration contracts, consider:
```json
{"schema_version":"2.0", ...}
```
when it materially helps consumers.

## Rule

Schema evolution should be reviewed like API evolution.
