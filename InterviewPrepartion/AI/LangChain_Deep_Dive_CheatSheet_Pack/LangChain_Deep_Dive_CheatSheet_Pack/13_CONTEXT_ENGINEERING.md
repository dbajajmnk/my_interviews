# Context Engineering

## What

Context engineering controls what information the model receives for each call.

## Model Context

Model context may include:
- system prompt;
- messages;
- available tools;
- selected model;
- response format.

## Data Sources

Context can draw from:
- state;
- store;
- runtime context.

## Transient vs Persistent

- **Transient context:** changed only for a single model call.
- **Persistent context:** written into state/store and survives later steps/turns.

## Best Practice

Do not send everything.

Optimize context for:
- relevance;
- freshness;
- token budget;
- privacy;
- task success.
