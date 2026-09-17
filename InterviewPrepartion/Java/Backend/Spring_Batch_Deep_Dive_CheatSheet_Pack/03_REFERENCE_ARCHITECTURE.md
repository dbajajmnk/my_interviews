# Spring Batch Reference Architecture

```text
Scheduler / CLI / API
        ↓
    JobOperator
        ↓
       Job
 ┌──────┼─────────┐
 ↓      ↓         ↓
Step   Step      Step
 │
 ▼
ChunkOrientedStep
 │
 ├─ ItemReader
 ├─ ItemProcessor
 └─ ItemWriter
       │
   Transaction
       │
       ▼
Business Database / File / API

Control Plane
─────────────
JobRepository
 ├─ JobInstance
 ├─ JobExecution
 ├─ StepExecution
 └─ ExecutionContext

Scale options
─────────────
Local Chunking
Partitioning
Remote Chunking
Remote Partitioning
RemoteStep
Parallel Flows
```
