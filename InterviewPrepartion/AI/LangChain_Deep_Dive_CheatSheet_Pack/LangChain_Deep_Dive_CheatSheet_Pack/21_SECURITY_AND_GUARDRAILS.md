# Security and Guardrails

## Security Boundaries

Do not delegate:
- authentication;
- authorization;
- tenancy;
- secret management;
- destructive-action approval
to the model alone.

## Treat Inputs as Untrusted

Untrusted sources include:
- user messages;
- retrieved documents;
- tool responses;
- external MCP content.

## Controls

- tool allowlists;
- runtime-context identity;
- policy middleware;
- schema validation;
- least privilege;
- redaction;
- audit logs;
- approval checkpoints.

## Prompt Injection

Retrieved content can contain instructions. Treat it as data, not policy.
