# Spring Batch Decision Tree

```text
Finite bounded dataset/job?
├─ No → stream/event processing may fit better
└─ Yes

Record-oriented transformation?
→ Chunk Step

One procedural action?
→ Tasklet

Need restart?
→ Persistent JobRepository + ExecutionContext

Need transient failure recovery?
→ Retry

Need bad-record continuation?
→ Skip + quarantine

Need more throughput?
1. Optimize SQL/I/O
2. Tune chunk/page/batch sizes
3. Local concurrency
4. Partition
5. Remote scale only if SLA demands it

Need entire step on another worker?
→ RemoteStep

Need one dataset split across workers?
→ Partitioning

Need central reader + expensive remote processing?
→ Remote Chunking
```
