# Sources & Accuracy Notes

Primary baseline:
- Spring Batch 6.0.5 official reference/API
- Spring release announcement dated August 20, 2026

Current verified facts:
- Spring Batch 6.0.5 is current stable.
- 6.1.0-M1 is preview.
- Spring Batch 6 adds a new chunk-oriented processing implementation and new concurrency model.
- Spring Batch 6 adds job-execution recovery, broad stop support and graceful shutdown.
- Spring Batch 6 adds JFR observability.
- Spring Batch 6 adds local chunking, SEDA-style Integration support and RemoteStep.
- `ChunkOrientedStep` is the current Spring Batch 6 chunk implementation.
- Spring Batch supports Resourceless, JDBC and MongoDB JobRepository configurations.
- ResourcelessJobRepository is non-thread-safe and unsuitable when restartability/execution-context/partition metadata is required.
- Local chunking uses `ChunkTaskExecutorItemWriter`.
- Remote chunking keeps reading in the manager and delegates chunk processing/writing to workers.

Always use the exact Spring Batch patch-level documentation used by the target Spring Boot release before production configuration changes.
