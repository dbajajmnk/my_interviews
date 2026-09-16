# Tenant Isolation

## Must Isolate

- retrieval;
- memory;
- caches;
- traces;
- tool access;
- files.

## Rule

Tenant ID must come from authenticated server context, never model-generated arguments.
