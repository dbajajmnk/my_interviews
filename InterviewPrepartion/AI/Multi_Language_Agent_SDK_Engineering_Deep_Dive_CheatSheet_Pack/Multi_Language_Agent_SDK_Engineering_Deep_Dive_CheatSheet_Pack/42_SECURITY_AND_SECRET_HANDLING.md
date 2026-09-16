# Security and Secret Handling

## Rule

Never accept raw provider secrets as model-visible context.

## Use

- environment/secret managers;
- managed identity;
- scoped credentials;
- secure config.

## Cross-Language

Secret-handling semantics should be identical even if config mechanisms differ.
