# Amazon Bedrock

## What

Managed platform for building generative-AI applications using foundation models and related capabilities.

## Architecture

```text
Application
 ↓
Bedrock Runtime / APIs
 ↓
Foundation Model
```

## Ecosystem Areas

```text
models
agents
knowledge bases
guardrails
evaluation
```

## Good Fit

Generative AI without managing model-serving infrastructure directly.

## Trap

Managed model access does not remove application-level security, evaluation, prompt-injection, data-governance, and cost concerns.
