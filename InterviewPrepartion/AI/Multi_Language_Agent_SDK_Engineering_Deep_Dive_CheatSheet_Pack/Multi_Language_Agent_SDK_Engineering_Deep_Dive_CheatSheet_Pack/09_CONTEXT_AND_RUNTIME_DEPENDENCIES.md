# Context and Runtime Dependencies

## Context Contains

Trusted application dependencies:
- identity;
- tenant;
- DB/service clients;
- feature flags;
- policy context.

## Rule

Do not serialize arbitrary dependency objects into model-visible context.
