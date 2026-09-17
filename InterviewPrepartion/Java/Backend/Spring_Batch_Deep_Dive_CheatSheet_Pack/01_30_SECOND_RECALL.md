# Spring Batch — 30-Second Recall

```text
Job
 ├─ Step 1
 ├─ Step 2
 └─ Step 3

Chunk Step:
Reader → Processor → Writer
          │
     N items / chunk
          │
       COMMIT
          │
ExecutionContext checkpoint
```

## Metadata
```text
JobInstance
   ↓
JobExecution
   ↓
StepExecution
```

## Core Formula
```text
JobParameters = identity/config
ExecutionContext = mutable restart state
JobRepository = durable execution metadata
Chunk = transactional checkpoint
Idempotency = safe restart/retry
```

## Scale
```text
Single Thread
→ Tune I/O
→ Local concurrency
→ Partitioning
→ Remote partition/chunk/step only when needed
```
