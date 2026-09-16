# Security and Data Validation

## Structured Is Not Safe

A schema-conformant value may still contain:
- malicious URLs;
- injection strings;
- unauthorized identifiers;
- dangerous commands.

## Controls

- allowlists;
- business validation;
- escaping;
- authorization;
- content filtering;
- secret/PII handling.

## Rule

Treat structured model output as untrusted input.
