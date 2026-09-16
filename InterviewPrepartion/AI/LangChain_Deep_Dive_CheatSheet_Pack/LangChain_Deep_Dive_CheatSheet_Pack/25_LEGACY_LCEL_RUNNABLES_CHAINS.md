# Legacy / LCEL / Runnables / Chains — Interview Refresher

## Why This File Exists

Many existing projects and interview questions still use older LangChain vocabulary:
- Chains
- `LLMChain`
- Runnables
- LCEL
- prompt → model → parser pipelines

Know the ideas even if your new implementation uses current agent APIs.

## LCEL Mental Model

```text
Prompt
  |
Model
  |
Parser
```

Conceptually:
```python
chain = prompt | model | parser
```

## Runnable Concepts

Common ideas:
- RunnableSequence;
- RunnableParallel;
- invoke;
- batch;
- stream;
- composition.

## How to Position

> I understand LCEL/Runnable composition for existing codebases, but for current agent development I would start from the current LangChain agent/runtime APIs and use LangGraph directly when orchestration needs become more explicit.
