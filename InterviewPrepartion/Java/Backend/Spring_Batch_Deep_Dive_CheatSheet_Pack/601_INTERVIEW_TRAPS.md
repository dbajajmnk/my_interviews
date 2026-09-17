# Spring Batch — Interview Traps

1. Job definition is not JobInstance.
2. JobInstance is job name + identifying JobParameters.
3. JobExecution is one attempt of a JobInstance.
4. A completed JobInstance cannot normally be restarted with same identifying parameters.
5. JobParameters and ExecutionContext solve different problems.
6. ExecutionContext is persisted restart state, not a general cache.
7. Chunk size is also commit interval in common chunk processing.
8. Flush/commit boundaries matter for restart.
9. Processor returning `null` means filter, not skip.
10. Retry and skip solve different failure classes.
11. Skip limits should have business governance, not just technical thresholds.
12. Reader returning `null` means end-of-input.
13. Stateful readers require ItemStream/restart state.
14. `saveAll`/ORM batching is not automatically optimal for batch workloads.
15. File output is not automatically atomic with database transaction.
16. Remote API side effects cannot be rolled back by local DB transaction.
17. Idempotency is essential for restart and retry.
18. Spring Batch is not a scheduler.
19. ResourcelessJobRepository is not suitable for restartable/concurrent critical jobs.
20. Spring Batch 6 defaults can be resourceless unless JDBC/Mongo repository is enabled explicitly.
21. @EnableBatchProcessing and DefaultBatchConfiguration are alternatives, not meant to be combined.
22. Multi-threading requires thread-safe readers/writers.
23. More threads can reduce throughput when DB is already saturated.
24. Partitioning and remote chunking are different scaling patterns.
25. RemoteStep delegates a whole step; remote partitioning splits a step.
26. Local chunking is a Spring Batch 6 feature.
27. JobRepository can become a bottleneck with huge partition/checkpoint volume.
28. BatchStatus and ExitStatus are not the same.
29. Restart and rerun are not the same.
30. Restart after code/input format change can be unsafe.
31. Database cursor and paging readers have different restart/scaling characteristics.
32. Stable sort keys are critical for paging.
33. OFFSET pagination over changing data can duplicate/skip rows.
34. JPA is blocking; asynchronous worker threads do not make it reactive.
35. Graceful shutdown still depends on components honoring stop/interruption.
36. Scheduler retrying a failed process is not identical to Spring Batch restart.
37. ExecutionContext serialization compatibility matters across deployments.
38. Secrets should never be stored in JobParameters or ExecutionContext.
39. JFR observability supplements, not replaces, Micrometer/business reconciliation.
40. Spring Batch is for bounded jobs, not continuous stream processing.
