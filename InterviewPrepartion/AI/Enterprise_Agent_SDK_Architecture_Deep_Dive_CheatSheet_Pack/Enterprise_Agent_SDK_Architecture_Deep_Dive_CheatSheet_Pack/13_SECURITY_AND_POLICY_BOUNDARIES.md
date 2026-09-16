# Security and Policy Boundaries

## Identity

Propagate caller identity or workload identity where appropriate. Avoid shared unrestricted service credentials.

## Authorization

Authorization happens in enforceable code/policy layers.

The model must not be the final authority.

## Tool Security

For each tool define:
- required scope/role;
- read/write classification;
- data sensitivity;
- approval requirement.

## Prompt Injection Defense

Treat retrieved/tool content as untrusted data.

Do not allow untrusted content to redefine:
- system policy;
- tool permissions;
- identity;
- security boundaries.

## Enterprise Rule

> Model output is untrusted input until validated.
