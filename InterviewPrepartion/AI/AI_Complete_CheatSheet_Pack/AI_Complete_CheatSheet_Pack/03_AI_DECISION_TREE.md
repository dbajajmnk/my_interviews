# AI Decision Tree

## Is the output a prediction from structured data?

```text
Yes → classical ML / gradient boosting / simple neural model
```

## Is the input unstructured image/audio/text at scale?

```text
Yes → deep learning / foundation model
```

## Need generated text/code/image/audio?

```text
Yes → Generative AI
```

## Need private/current facts?

```text
Yes → RAG / tools
```

## Need consistent behavior/style/format learned from many examples?

```text
Yes → Fine-tuning may help
```

## Need external actions?

```text
Known fixed steps → deterministic workflow + LLM nodes
Dynamic uncertain steps → agent with bounded tools/policies
```

## Need shared enterprise platform?

```text
Model Gateway
+ RAG Service
+ Agent Orchestrator
+ Evaluation
+ Policy/Guardrails
+ Observability
```
