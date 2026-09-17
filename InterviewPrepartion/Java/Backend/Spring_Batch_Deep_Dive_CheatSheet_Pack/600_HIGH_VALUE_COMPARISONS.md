# Spring Batch — High-Value Comparisons

## JobInstance vs JobExecution
| JobInstance | JobExecution |
|---|---|
| logical job + identifying params | one attempt |
| unique business run | can be multiple after failure |
| completed instance normally not restartable | records status/timing |

## JobParameters vs ExecutionContext
| JobParameters | ExecutionContext |
|---|---|
| launch identity/config | mutable checkpoint state |
| mostly immutable for run | updated during execution |
| can define JobInstance | supports restart |

## Chunk vs Tasklet
| Chunk | Tasklet |
|---|---|
| many homogeneous items | procedural action |
| reader/process/writer | custom execute |
| transactional checkpoints | repeated/one-shot task |

## Retry vs Skip
| Retry | Skip |
|---|---|
| transient failure | bad item tolerated |
| same operation again | continue past failure |
| needs idempotency | needs audit/quarantine |

## Partitioning vs Remote Chunking
| Partitioning | Remote Chunking |
|---|---|
| split dataset | central reader builds chunks |
| workers read/process/write | workers process/write chunks |
| scales I/O too | manager can bottleneck |

## Spring Batch vs Scheduler
| Spring Batch | Scheduler |
|---|---|
| execute/restart/metadata | when/workflow trigger |
| chunk/step semantics | calendar/dependencies |
