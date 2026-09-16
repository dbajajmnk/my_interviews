# Functional API — entrypoint and task

## What

LangGraph also provides a functional API using `entrypoint` and `task`.

## Mental Model

```python
from langgraph.func import entrypoint, task

@task
def do_work(x):
    return x + 1

@entrypoint()
def workflow(values):
    futures = [do_work(v) for v in values]
    return [f.result() for f in futures]
```

## When Useful

Use the Functional API when you prefer normal function structure over explicit graph-builder syntax.

## Task Features

Tasks can support:
- retry policy;
- cache policy;
- timeout;
- parallel execution via futures.

## Graph API vs Functional API

Use whichever makes the workflow easier to understand. The execution concepts—durability, tasks, state, retries—remain similar.
