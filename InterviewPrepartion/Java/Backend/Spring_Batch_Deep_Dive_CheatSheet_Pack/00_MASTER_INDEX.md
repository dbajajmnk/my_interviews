# Spring Batch — Dedicated Deep-Dive Cheat Sheet Pack

**Current stable baseline:** Spring Batch 6.0.5 (released August 20, 2026).
**Preview:** Spring Batch 6.1.0-M1 — not the production baseline.

**Scope:** domain model, chunk/tasklet processing, readers/processors/writers, JobRepository, ExecutionContext, restartability, transactions, fault tolerance, local/remote scaling, Spring Integration, observability/JFR, performance, security, cloud/container execution, testing, troubleshooting and system design.

## Fast Revision
- `01_30_SECOND_RECALL.md`
- `02_CURRENT_BASELINE.md`
- `03_REFERENCE_ARCHITECTURE.md`
- `04_BATCH_DECISION_TREE.md`

## Foundations & Batch Architecture

- Spring Batch Mental Model — `005_SPRING_BATCH_MENTAL_MODEL.md`
- Batch vs Online Processing — `006_BATCH_VS_ONLINE_PROCESSING.md`
- Batch Use Cases — `007_BATCH_USE_CASES.md`
- Batch Characteristics — `008_BATCH_CHARACTERISTICS.md`
- Job — `009_JOB.md`
- Step — `010_STEP.md`
- JobInstance — `011_JOBINSTANCE.md`
- JobExecution — `012_JOBEXECUTION.md`
- StepExecution — `013_STEPEXECUTION.md`
- JobParameters — `014_JOBPARAMETERS.md`
- JobParameter Identifying Flag — `015_JOBPARAMETER_IDENTIFYING_FLAG.md`
- ExecutionContext — `016_EXECUTIONCONTEXT.md`
- JobExecutionContext — `017_JOBEXECUTIONCONTEXT.md`
- StepExecutionContext — `018_STEPEXECUTIONCONTEXT.md`
- Batch Domain Model — `019_BATCH_DOMAIN_MODEL.md`
- Batch Metadata — `020_BATCH_METADATA.md`
- Restartability — `021_RESTARTABILITY.md`
- Idempotency — `022_IDEMPOTENCY.md`
- Checkpoint — `023_CHECKPOINT.md`
- Chunk Processing — `024_CHUNK_PROCESSING.md`
- Tasklet Processing — `025_TASKLET_PROCESSING.md`

## Spring Batch 6 Modern Baseline

- Spring Batch 6.0.5 — `026_SPRING_BATCH_6_0_5.md`
- Spring Batch 6.1 M1 — `027_SPRING_BATCH_6_1_M1.md`
- New Chunk Model 6 — `028_NEW_CHUNK_MODEL_6.md`
- ChunkOrientedStep — `029_CHUNKORIENTEDSTEP.md`
- New Concurrency Model 6 — `030_NEW_CONCURRENCY_MODEL_6.md`
- Job Recovery 6 — `031_JOB_RECOVERY_6.md`
- Stop All Step Types — `032_STOP_ALL_STEP_TYPES.md`
- Graceful Shutdown 6 — `033_GRACEFUL_SHUTDOWN_6.md`
- JFR Observability 6 — `034_JFR_OBSERVABILITY_6.md`
- JSpecify Null Safety — `035_JSPECIFY_NULL_SAFETY.md`
- Local Chunking 6 — `036_LOCAL_CHUNKING_6.md`
- SEDA Processing — `037_SEDA_PROCESSING.md`
- Remote Step 6 — `038_REMOTE_STEP_6.md`
- Lambda Configuration — `039_LAMBDA_CONFIGURATION.md`
- Jackson 3 Alignment — `040_JACKSON_3_ALIGNMENT.md`

## Job Domain & Identity

- Job Name — `041_JOB_NAME.md`
- JobInstance Identity — `042_JOBINSTANCE_IDENTITY.md`
- Job Execution Attempt — `043_JOB_EXECUTION_ATTEMPT.md`
- Completed Instance Rule — `044_COMPLETED_INSTANCE_RULE.md`
- Job Parameters Incrementer — `045_JOB_PARAMETERS_INCREMENTER.md`
- RunIdIncrementer — `046_RUNIDINCREMENTER.md`
- JobParametersValidator — `047_JOBPARAMETERSVALIDATOR.md`
- DefaultJobParametersValidator — `048_DEFAULTJOBPARAMETERSVALIDATOR.md`
- Typed Job Parameters — `049_TYPED_JOB_PARAMETERS.md`
- Job Parameter Conversion — `050_JOB_PARAMETER_CONVERSION.md`
- Non Identifying Parameters — `051_NON_IDENTIFYING_PARAMETERS.md`
- Business Date Parameter — `052_BUSINESS_DATE_PARAMETER.md`
- File Name Parameter — `053_FILE_NAME_PARAMETER.md`
- Restart Parameters — `054_RESTART_PARAMETERS.md`

## Job Configuration

- JobBuilder — `055_JOBBUILDER.md`
- SimpleJob — `056_SIMPLEJOB.md`
- FlowJob — `057_FLOWJOB.md`
- JobBuilder start — `058_JOBBUILDER_START.md`
- next — `059_NEXT.md`
- from on to — `060_FROM_ON_TO.md`
- end — `061_END.md`
- fail — `062_FAIL.md`
- stop — `063_STOP.md`
- stopAndRestart — `064_STOPANDRESTART.md`
- preventRestart — `065_PREVENTRESTART.md`
- JobExecutionDecider — `066_JOBEXECUTIONDECIDER.md`
- Flow — `067_FLOW.md`
- FlowBuilder — `068_FLOWBUILDER.md`
- Split Flow — `069_SPLIT_FLOW.md`
- Job Listener — `070_JOB_LISTENER.md`
- JobExecutionListener — `071_JOBEXECUTIONLISTENER.md`
- Job Configuration Modularity — `072_JOB_CONFIGURATION_MODULARITY.md`

## Step Configuration

- StepBuilder — `073_STEPBUILDER.md`
- TaskletStep — `074_TASKLETSTEP.md`
- ChunkOrientedStep Configuration — `075_CHUNKORIENTEDSTEP_CONFIGURATION.md`
- Commit Interval — `076_COMMIT_INTERVAL.md`
- CompletionPolicy — `077_COMPLETIONPOLICY.md`
- Start Limit — `078_START_LIMIT.md`
- allowStartIfComplete — `079_ALLOWSTARTIFCOMPLETE.md`
- Step Listener — `080_STEP_LISTENER.md`
- StepExecutionListener — `081_STEPEXECUTIONLISTENER.md`
- ExitStatus — `082_EXITSTATUS.md`
- BatchStatus — `083_BATCHSTATUS.md`
- ExitStatus vs BatchStatus — `084_EXITSTATUS_VS_BATCHSTATUS.md`
- Step Contribution — `085_STEP_CONTRIBUTION.md`
- Step Synchronization Manager — `086_STEP_SYNCHRONIZATION_MANAGER.md`

## Chunk-Oriented Processing

- Chunk Mental Model — `087_CHUNK_MENTAL_MODEL.md`
- Chunk Transaction Boundary — `088_CHUNK_TRANSACTION_BOUNDARY.md`
- Chunk Size — `089_CHUNK_SIZE.md`
- Read Process Write — `090_READ_PROCESS_WRITE.md`
- Item Filtering — `091_ITEM_FILTERING.md`
- Chunk Rollback — `092_CHUNK_ROLLBACK.md`
- Chunk Reprocessing — `093_CHUNK_REPROCESSING.md`
- Chunk Boundary Tuning — `094_CHUNK_BOUNDARY_TUNING.md`
- Chunk Memory — `095_CHUNK_MEMORY.md`
- Chunk Lock Duration — `096_CHUNK_LOCK_DURATION.md`
- Chunk Metrics — `097_CHUNK_METRICS.md`
- Chunk Completion Policy — `098_CHUNK_COMPLETION_POLICY.md`
- Chunk Listener — `099_CHUNK_LISTENER.md`
- ChunkOrientedStep Concurrency — `100_CHUNKORIENTEDSTEP_CONCURRENCY.md`

## Tasklets

- Tasklet Mental Model — `101_TASKLET_MENTAL_MODEL.md`
- Tasklet execute — `102_TASKLET_EXECUTE.md`
- RepeatStatus FINISHED — `103_REPEATSTATUS_FINISHED.md`
- RepeatStatus CONTINUABLE — `104_REPEATSTATUS_CONTINUABLE.md`
- Tasklet Transaction — `105_TASKLET_TRANSACTION.md`
- MethodInvokingTaskletAdapter — `106_METHODINVOKINGTASKLETADAPTER.md`
- SystemCommandTasklet — `107_SYSTEMCOMMANDTASKLET.md`
- Tasklet Use Cases — `108_TASKLET_USE_CASES.md`
- Tasklet vs Chunk — `109_TASKLET_VS_CHUNK.md`
- Tasklet Restartability — `110_TASKLET_RESTARTABILITY.md`

## ItemReader Fundamentals

- ItemReader — `111_ITEMREADER.md`
- ItemStream — `112_ITEMSTREAM.md`
- ItemStreamReader — `113_ITEMSTREAMREADER.md`
- Reader Restartability — `114_READER_RESTARTABILITY.md`
- Reader State — `115_READER_STATE.md`
- Reader open — `116_READER_OPEN.md`
- Reader update — `117_READER_UPDATE.md`
- Reader close — `118_READER_CLOSE.md`
- Reader Null Contract — `119_READER_NULL_CONTRACT.md`
- Reader Exception — `120_READER_EXCEPTION.md`

## Flat File Reading

- FlatFileItemReader — `121_FLATFILEITEMREADER.md`
- Resource — `122_RESOURCE.md`
- LineMapper — `123_LINEMAPPER.md`
- LineTokenizer — `124_LINETOKENIZER.md`
- DelimitedLineTokenizer — `125_DELIMITEDLINETOKENIZER.md`
- FixedLengthTokenizer — `126_FIXEDLENGTHTOKENIZER.md`
- FieldSetMapper — `127_FIELDSETMAPPER.md`
- BeanWrapperFieldSetMapper — `128_BEANWRAPPERFIELDSETMAPPER.md`
- RecordSeparatorPolicy — `129_RECORDSEPARATORPOLICY.md`
- LineCallbackHandler — `130_LINECALLBACKHANDLER.md`
- linesToSkip — `131_LINESTOSKIP.md`
- strict — `132_STRICT.md`
- Encoding — `133_ENCODING.md`
- Flat File Restart — `134_FLAT_FILE_RESTART.md`
- Malformed Input Security — `135_MALFORMED_INPUT_SECURITY.md`

## XML & JSON Reading

- StaxEventItemReader — `136_STAXEVENTITEMREADER.md`
- Unmarshaller — `137_UNMARSHALLER.md`
- Fragment Root Element — `138_FRAGMENT_ROOT_ELEMENT.md`
- JsonItemReader — `139_JSONITEMREADER.md`
- JsonObjectReader — `140_JSONOBJECTREADER.md`
- Jackson Json Object Reader — `141_JACKSON_JSON_OBJECT_READER.md`
- JSON Array Processing — `142_JSON_ARRAY_PROCESSING.md`
- XML Security — `143_XML_SECURITY.md`
- Large Document Streaming — `144_LARGE_DOCUMENT_STREAMING.md`

## Database Readers

- JdbcCursorItemReader — `145_JDBCCURSORITEMREADER.md`
- JdbcPagingItemReader — `146_JDBCPAGINGITEMREADER.md`
- JpaCursorItemReader — `147_JPACURSORITEMREADER.md`
- JpaPagingItemReader — `148_JPAPAGINGITEMREADER.md`
- HibernateCursorItemReader Awareness — `149_HIBERNATECURSORITEMREADER_AWARENESS.md`
- StoredProcedureItemReader — `150_STOREDPROCEDUREITEMREADER.md`
- Cursor Reader — `151_CURSOR_READER.md`
- Paging Reader — `152_PAGING_READER.md`
- Cursor vs Paging — `153_CURSOR_VS_PAGING.md`
- Paging Sort Key — `154_PAGING_SORT_KEY.md`
- Page Size vs Chunk Size — `155_PAGE_SIZE_VS_CHUNK_SIZE.md`
- Reader Fetch Size — `156_READER_FETCH_SIZE.md`
- Restart Paging — `157_RESTART_PAGING.md`
- Isolation with Reader — `158_ISOLATION_WITH_READER.md`
- Keyset Reader Pattern — `159_KEYSET_READER_PATTERN.md`

## Messaging & Queue Readers

- JmsItemReader — `160_JMSITEMREADER.md`
- AmqpItemReader — `161_AMQPITEMREADER.md`
- Kafka Item Reader Awareness — `162_KAFKA_ITEM_READER_AWARENESS.md`
- BlockingQueueItemReader — `163_BLOCKINGQUEUEITEMREADER.md`
- Message Acknowledgement Boundary — `164_MESSAGE_ACKNOWLEDGEMENT_BOUNDARY.md`
- Queue Reader Restart Trap — `165_QUEUE_READER_RESTART_TRAP.md`

## ItemProcessor

- ItemProcessor — `166_ITEMPROCESSOR.md`
- CompositeItemProcessor — `167_COMPOSITEITEMPROCESSOR.md`
- ClassifierCompositeItemProcessor — `168_CLASSIFIERCOMPOSITEITEMPROCESSOR.md`
- ValidatingItemProcessor — `169_VALIDATINGITEMPROCESSOR.md`
- BeanValidatingItemProcessor — `170_BEANVALIDATINGITEMPROCESSOR.md`
- ScriptItemProcessor — `171_SCRIPTITEMPROCESSOR.md`
- Filtering — `172_FILTERING.md`
- Processor Side Effects — `173_PROCESSOR_SIDE_EFFECTS.md`
- Processor Purity — `174_PROCESSOR_PURITY.md`
- Processor Exception — `175_PROCESSOR_EXCEPTION.md`

## ItemWriter Fundamentals

- ItemWriter — `176_ITEMWRITER.md`
- Writer Transaction — `177_WRITER_TRANSACTION.md`
- ItemStreamWriter — `178_ITEMSTREAMWRITER.md`
- CompositeItemWriter — `179_COMPOSITEITEMWRITER.md`
- ClassifierCompositeItemWriter — `180_CLASSIFIERCOMPOSITEITEMWRITER.md`
- Writer Idempotency — `181_WRITER_IDEMPOTENCY.md`
- Writer Batch Operations — `182_WRITER_BATCH_OPERATIONS.md`
- Writer Flush — `183_WRITER_FLUSH.md`

## Database Writers

- JdbcBatchItemWriter — `184_JDBCBATCHITEMWRITER.md`
- NamedParameterJdbcTemplate Writer — `185_NAMEDPARAMETERJDBCTEMPLATE_WRITER.md`
- ItemPreparedStatementSetter — `186_ITEMPREPAREDSTATEMENTSETTER.md`
- ItemSqlParameterSourceProvider — `187_ITEMSQLPARAMETERSOURCEPROVIDER.md`
- JpaItemWriter — `188_JPAITEMWRITER.md`
- RepositoryItemWriter — `189_REPOSITORYITEMWRITER.md`
- StoredProcedureItemWriter — `190_STOREDPROCEDUREITEMWRITER.md`
- Database Writer Batching — `191_DATABASE_WRITER_BATCHING.md`
- Upsert Writer Pattern — `192_UPSERT_WRITER_PATTERN.md`
- Optimistic Lock in Batch — `193_OPTIMISTIC_LOCK_IN_BATCH.md`

## File Writers

- FlatFileItemWriter — `194_FLATFILEITEMWRITER.md`
- LineAggregator — `195_LINEAGGREGATOR.md`
- DelimitedLineAggregator — `196_DELIMITEDLINEAGGREGATOR.md`
- FormatterLineAggregator — `197_FORMATTERLINEAGGREGATOR.md`
- PassThroughLineAggregator — `198_PASSTHROUGHLINEAGGREGATOR.md`
- HeaderCallback — `199_HEADERCALLBACK.md`
- FooterCallback — `200_FOOTERCALLBACK.md`
- Transactional File Writer — `201_TRANSACTIONAL_FILE_WRITER.md`
- shouldDeleteIfExists — `202_SHOULDDELETEIFEXISTS.md`
- appendAllowed — `203_APPENDALLOWED.md`
- saveState — `204_SAVESTATE.md`
- StaxEventItemWriter — `205_STAXEVENTITEMWRITER.md`
- JsonFileItemWriter — `206_JSONFILEITEMWRITER.md`
- MultiResourceItemWriter — `207_MULTIRESOURCEITEMWRITER.md`
- File Rename Pattern — `208_FILE_RENAME_PATTERN.md`

## Resource-Aware Readers & Writers

- MultiResourceItemReader — `209_MULTIRESOURCEITEMREADER.md`
- ResourceAwareItemReaderItemStream — `210_RESOURCEAWAREITEMREADERITEMSTREAM.md`
- ResourceAwareItemWriterItemStream — `211_RESOURCEAWAREITEMWRITERITEMSTREAM.md`
- Resource Ordering — `212_RESOURCE_ORDERING.md`
- File Discovery — `213_FILE_DISCOVERY.md`
- Duplicate File Protection — `214_DUPLICATE_FILE_PROTECTION.md`

## ExecutionContext Deep Dive

- ExecutionContext Mental Model — `215_EXECUTIONCONTEXT_MENTAL_MODEL.md`
- Serializable State — `216_SERIALIZABLE_STATE.md`
- ExecutionContextSerializer — `217_EXECUTIONCONTEXTSERIALIZER.md`
- DefaultExecutionContextSerializer — `218_DEFAULTEXECUTIONCONTEXTSERIALIZER.md`
- Jackson ExecutionContext — `219_JACKSON_EXECUTIONCONTEXT.md`
- Trusted Type Allowlist — `220_TRUSTED_TYPE_ALLOWLIST.md`
- Step Context Promotion — `221_STEP_CONTEXT_PROMOTION.md`
- ExecutionContextPromotionListener — `222_EXECUTIONCONTEXTPROMOTIONLISTENER.md`
- Small State Rule — `223_SMALL_STATE_RULE.md`
- Context Versioning — `224_CONTEXT_VERSIONING.md`
- Restart Compatibility — `225_RESTART_COMPATIBILITY.md`
- Context Key Namespace — `226_CONTEXT_KEY_NAMESPACE.md`

## JobRepository

- JobRepository Mental Model — `227_JOBREPOSITORY_MENTAL_MODEL.md`
- JobRepository Interface — `228_JOBREPOSITORY_INTERFACE.md`
- JobExplorer — `229_JOBEXPLORER.md`
- JobRepository Extends JobExplorer — `230_JOBREPOSITORY_EXTENDS_JOBEXPLORER.md`
- ResourcelessJobRepository — `231_RESOURCELESSJOBREPOSITORY.md`
- Resourceless Repository Limits — `232_RESOURCELESS_REPOSITORY_LIMITS.md`
- JDBC JobRepository — `233_JDBC_JOBREPOSITORY.md`
- MongoDB JobRepository — `234_MONGODB_JOBREPOSITORY.md`
- @EnableJdbcJobRepository — `235_ENABLEJDBCJOBREPOSITORY.md`
- @EnableMongoJobRepository — `236_ENABLEMONGOJOBREPOSITORY.md`
- Metadata Schema — `237_METADATA_SCHEMA.md`
- Table Prefix — `238_TABLE_PREFIX.md`
- Mongo Collection Prefix Awareness — `239_MONGO_COLLECTION_PREFIX_AWARENESS.md`
- Repository Transaction Isolation — `240_REPOSITORY_TRANSACTION_ISOLATION.md`
- Repository Cleanup — `241_REPOSITORY_CLEANUP.md`
- Repository Shared DB — `242_REPOSITORY_SHARED_DB.md`
- Repository HA — `243_REPOSITORY_HA.md`

## JobOperator & Job Control

- JobOperator — `244_JOBOPERATOR.md`
- start — `245_START.md`
- restart — `246_RESTART.md`
- stop — `247_STOP.md`
- abandon — `248_ABANDON.md`
- JobOperator getSummary — `249_JOBOPERATOR_GETSUMMARY.md`
- JobOperator getJobInstances — `250_JOBOPERATOR_GETJOBINSTANCES.md`
- JobOperator getExecutions — `251_JOBOPERATOR_GETEXECUTIONS.md`
- Job Recovery — `252_JOB_RECOVERY.md`
- Command Line Operator 6 — `253_COMMAND_LINE_OPERATOR_6.md`
- Operator vs Launcher — `254_OPERATOR_VS_LAUNCHER.md`
- Stop Is Cooperative — `255_STOP_IS_COOPERATIVE.md`
- Graceful Shutdown — `256_GRACEFUL_SHUTDOWN.md`

## Job Launching

- JobLauncher Legacy Awareness — `257_JOBLAUNCHER_LEGACY_AWARENESS.md`
- Command Line Launch — `258_COMMAND_LINE_LAUNCH.md`
- Web Launch — `259_WEB_LAUNCH.md`
- Scheduler Launch — `260_SCHEDULER_LAUNCH.md`
- Duplicate Launch Protection — `261_DUPLICATE_LAUNCH_PROTECTION.md`
- Async Launch — `262_ASYNC_LAUNCH.md`
- Launch Parameters — `263_LAUNCH_PARAMETERS.md`

## Scopes

- @StepScope — `264_STEPSCOPE.md`
- @JobScope — `265_JOBSCOPE.md`
- Late Binding — `266_LATE_BINDING.md`
- StepScope JobParameters — `267_STEPSCOPE_JOBPARAMETERS.md`
- StepScope StepExecutionContext — `268_STEPSCOPE_STEPEXECUTIONCONTEXT.md`
- StepScope JobExecutionContext — `269_STEPSCOPE_JOBEXECUTIONCONTEXT.md`
- Scoped Proxy — `270_SCOPED_PROXY.md`
- Scope Threading — `271_SCOPE_THREADING.md`
- Scope Testing — `272_SCOPE_TESTING.md`

## Flow Control

- Sequential Flow — `273_SEQUENTIAL_FLOW.md`
- Conditional Flow — `274_CONDITIONAL_FLOW.md`
- Wildcard Transition — `275_WILDCARD_TRANSITION.md`
- Custom ExitStatus — `276_CUSTOM_EXITSTATUS.md`
- Decider — `277_DECIDER.md`
- Split — `278_SPLIT.md`
- Restart Flow — `279_RESTART_FLOW.md`
- Stop and Restart — `280_STOP_AND_RESTART.md`
- End vs Fail — `281_END_VS_FAIL.md`
- Flow Loop Trap — `282_FLOW_LOOP_TRAP.md`

## Listeners

- JobExecutionListener — `283_JOBEXECUTIONLISTENER.md`
- StepExecutionListener — `284_STEPEXECUTIONLISTENER.md`
- ChunkListener — `285_CHUNKLISTENER.md`
- ItemReadListener — `286_ITEMREADLISTENER.md`
- ItemProcessListener — `287_ITEMPROCESSLISTENER.md`
- ItemWriteListener — `288_ITEMWRITELISTENER.md`
- SkipListener — `289_SKIPLISTENER.md`
- RetryListener — `290_RETRYLISTENER.md`
- Annotation Listeners — `291_ANNOTATION_LISTENERS.md`
- Listener Side Effects — `292_LISTENER_SIDE_EFFECTS.md`
- Audit Listener — `293_AUDIT_LISTENER.md`

## Fault Tolerance

- Fault Tolerant Step — `294_FAULT_TOLERANT_STEP.md`
- Skippable Exception — `295_SKIPPABLE_EXCEPTION.md`
- Skip Limit — `296_SKIP_LIMIT.md`
- Skip Policy — `297_SKIP_POLICY.md`
- AlwaysSkipItemSkipPolicy — `298_ALWAYSSKIPITEMSKIPPOLICY.md`
- LimitCheckingItemSkipPolicy — `299_LIMITCHECKINGITEMSKIPPOLICY.md`
- No Skip — `300_NO_SKIP.md`
- Retryable Exception — `301_RETRYABLE_EXCEPTION.md`
- Retry Limit — `302_RETRY_LIMIT.md`
- Retry Policy — `303_RETRY_POLICY.md`
- BackOffPolicy — `304_BACKOFFPOLICY.md`
- No Rollback Exception — `305_NO_ROLLBACK_EXCEPTION.md`
- Rollback Classifier — `306_ROLLBACK_CLASSIFIER.md`
- Retry vs Skip — `307_RETRY_VS_SKIP.md`
- Skip After Retry — `308_SKIP_AFTER_RETRY.md`
- Fault Tolerance Counters — `309_FAULT_TOLERANCE_COUNTERS.md`
- Poison Item — `310_POISON_ITEM.md`

## Retry Semantics

- Stateless Retry — `311_STATELESS_RETRY.md`
- Stateful Retry — `312_STATEFUL_RETRY.md`
- Retry Context — `313_RETRY_CONTEXT.md`
- Retry Context Cache — `314_RETRY_CONTEXT_CACHE.md`
- Retry Key — `315_RETRY_KEY.md`
- Backoff Fixed — `316_BACKOFF_FIXED.md`
- Backoff Exponential — `317_BACKOFF_EXPONENTIAL.md`
- Retry Jitter — `318_RETRY_JITTER.md`
- Retry Side Effect Trap — `319_RETRY_SIDE_EFFECT_TRAP.md`

## Skip & Quarantine Patterns

- Skip Logging — `320_SKIP_LOGGING.md`
- Reject File — `321_REJECT_FILE.md`
- Error Table — `322_ERROR_TABLE.md`
- Dead Letter Topic — `323_DEAD_LETTER_TOPIC.md`
- Quarantine Workflow — `324_QUARANTINE_WORKFLOW.md`
- Skip Threshold Governance — `325_SKIP_THRESHOLD_GOVERNANCE.md`
- Business Exit Status — `326_BUSINESS_EXIT_STATUS.md`

## Restartability

- Restart Mental Model — `327_RESTART_MENTAL_MODEL.md`
- Checkpoint State — `328_CHECKPOINT_STATE.md`
- Committed Chunk — `329_COMMITTED_CHUNK.md`
- Failed Chunk — `330_FAILED_CHUNK.md`
- Restart After Code Change — `331_RESTART_AFTER_CODE_CHANGE.md`
- Restart After Input Change — `332_RESTART_AFTER_INPUT_CHANGE.md`
- Restartable Reader — `333_RESTARTABLE_READER.md`
- Restartable Writer — `334_RESTARTABLE_WRITER.md`
- Non Restartable Job — `335_NON_RESTARTABLE_JOB.md`
- allowStartIfComplete — `336_ALLOWSTARTIFCOMPLETE.md`
- Start Limit — `337_START_LIMIT.md`
- Abandon vs Restart — `338_ABANDON_VS_RESTART.md`
- Recovery Runbook — `339_RECOVERY_RUNBOOK.md`

## Transactions

- Batch Transaction Mental Model — `340_BATCH_TRANSACTION_MENTAL_MODEL.md`
- PlatformTransactionManager — `341_PLATFORMTRANSACTIONMANAGER.md`
- DataSourceTransactionManager — `342_DATASOURCETRANSACTIONMANAGER.md`
- JpaTransactionManager — `343_JPATRANSACTIONMANAGER.md`
- ResourcelessTransactionManager — `344_RESOURCELESSTRANSACTIONMANAGER.md`
- Chunk Commit — `345_CHUNK_COMMIT.md`
- Rollback — `346_ROLLBACK.md`
- Transaction Attributes — `347_TRANSACTION_ATTRIBUTES.md`
- Transaction Timeout — `348_TRANSACTION_TIMEOUT.md`
- No Rollback — `349_NO_ROLLBACK.md`
- Multiple Resources — `350_MULTIPLE_RESOURCES.md`
- File Plus DB Atomicity — `351_FILE_PLUS_DB_ATOMICITY.md`
- Remote API Transaction Trap — `352_REMOTE_API_TRANSACTION_TRAP.md`
- Idempotency Over Distributed XA — `353_IDEMPOTENCY_OVER_DISTRIBUTED_XA.md`

## Concurrency Fundamentals

- Concurrency Mental Model — `354_CONCURRENCY_MENTAL_MODEL.md`
- Thread Safety — `355_THREAD_SAFETY.md`
- TaskExecutor — `356_TASKEXECUTOR.md`
- AsyncTaskExecutor — `357_ASYNCTASKEXECUTOR.md`
- Thread Pool — `358_THREAD_POOL.md`
- Concurrency Limit — `359_CONCURRENCY_LIMIT.md`
- Ordering Under Concurrency — `360_ORDERING_UNDER_CONCURRENCY.md`
- Restart Under Concurrency — `361_RESTART_UNDER_CONCURRENCY.md`
- Connection Pool Alignment — `362_CONNECTION_POOL_ALIGNMENT.md`

## Local Chunking

- Local Chunking Mental Model — `363_LOCAL_CHUNKING_MENTAL_MODEL.md`
- ChunkTaskExecutorItemWriter — `364_CHUNKTASKEXECUTORITEMWRITER.md`
- Local Chunk Worker — `365_LOCAL_CHUNK_WORKER.md`
- Local Chunk Manager — `366_LOCAL_CHUNK_MANAGER.md`
- Local Chunking Use Case — `367_LOCAL_CHUNKING_USE_CASE.md`
- Local Chunking Bottleneck — `368_LOCAL_CHUNKING_BOTTLENECK.md`
- Local Chunking Ordering — `369_LOCAL_CHUNKING_ORDERING.md`
- Local Chunking Shutdown — `370_LOCAL_CHUNKING_SHUTDOWN.md`
- Local Chunking Thread Safety — `371_LOCAL_CHUNKING_THREAD_SAFETY.md`

## Partitioning

- Partitioning Mental Model — `372_PARTITIONING_MENTAL_MODEL.md`
- Partitioner — `373_PARTITIONER.md`
- PartitionHandler — `374_PARTITIONHANDLER.md`
- TaskExecutorPartitionHandler — `375_TASKEXECUTORPARTITIONHANDLER.md`
- Partition Step — `376_PARTITION_STEP.md`
- Grid Size — `377_GRID_SIZE.md`
- Partition Key — `378_PARTITION_KEY.md`
- Partition ExecutionContext — `379_PARTITION_EXECUTIONCONTEXT.md`
- Range Partitioning — `380_RANGE_PARTITIONING.md`
- File Partitioning — `381_FILE_PARTITIONING.md`
- Hash Partitioning — `382_HASH_PARTITIONING.md`
- Partition Restart — `383_PARTITION_RESTART.md`
- Partition Granularity — `384_PARTITION_GRANULARITY.md`
- Partition Skew — `385_PARTITION_SKEW.md`
- Partitioner Determinism — `386_PARTITIONER_DETERMINISM.md`

## Remote Partitioning

- Remote Partitioning Mental Model — `387_REMOTE_PARTITIONING_MENTAL_MODEL.md`
- RemotePartitioningManagerStepBuilder — `388_REMOTEPARTITIONINGMANAGERSTEPBUILDER.md`
- RemotePartitioningWorkerStepBuilder — `389_REMOTEPARTITIONINGWORKERSTEPBUILDER.md`
- Spring Integration Transport — `390_SPRING_INTEGRATION_TRANSPORT.md`
- Remote Worker — `391_REMOTE_WORKER.md`
- Remote Partition Scalability — `392_REMOTE_PARTITION_SCALABILITY.md`
- Remote Partition Metadata — `393_REMOTE_PARTITION_METADATA.md`
- Remote Partition Delivery — `394_REMOTE_PARTITION_DELIVERY.md`
- Remote Partition Failure — `395_REMOTE_PARTITION_FAILURE.md`

## Remote Chunking

- Remote Chunking Mental Model — `396_REMOTE_CHUNKING_MENTAL_MODEL.md`
- Manager Bottleneck — `397_MANAGER_BOTTLENECK.md`
- Remote Chunk Worker — `398_REMOTE_CHUNK_WORKER.md`
- Chunk Message — `399_CHUNK_MESSAGE.md`
- Spring Integration Remote Chunking — `400_SPRING_INTEGRATION_REMOTE_CHUNKING.md`
- Remote Chunking Use Case — `401_REMOTE_CHUNKING_USE_CASE.md`
- Remote Chunking Serialization — `402_REMOTE_CHUNKING_SERIALIZATION.md`
- Remote Chunking Exactly Once Trap — `403_REMOTE_CHUNKING_EXACTLY_ONCE_TRAP.md`
- Remote Chunk Ack — `404_REMOTE_CHUNK_ACK.md`

## Remote Step Execution

- RemoteStep — `405_REMOTESTEP.md`
- Remote Step Request — `406_REMOTE_STEP_REQUEST.md`
- StepExecutionRequestHandler — `407_STEPEXECUTIONREQUESTHANDLER.md`
- Remote Step vs Partition — `408_REMOTE_STEP_VS_PARTITION.md`
- Remote Step Use Case — `409_REMOTE_STEP_USE_CASE.md`
- Remote Step Failure — `410_REMOTE_STEP_FAILURE.md`
- Remote Step Security — `411_REMOTE_STEP_SECURITY.md`

## Parallel Flows

- Parallel Steps — `412_PARALLEL_STEPS.md`
- Flow Split Executor — `413_FLOW_SPLIT_EXECUTOR.md`
- Parallel Flow Use Case — `414_PARALLEL_FLOW_USE_CASE.md`
- Parallel Flow Join — `415_PARALLEL_FLOW_JOIN.md`
- Parallel Failure — `416_PARALLEL_FAILURE.md`
- Shared Resource Contention — `417_SHARED_RESOURCE_CONTENTION.md`

## SEDA & Integration

- SEDA Mental Model — `418_SEDA_MENTAL_MODEL.md`
- BlockingQueueItemReader — `419_BLOCKINGQUEUEITEMREADER.md`
- BlockingQueueItemWriter — `420_BLOCKINGQUEUEITEMWRITER.md`
- Spring Integration Channels — `421_SPRING_INTEGRATION_CHANNELS.md`
- Executor Channel — `422_EXECUTOR_CHANNEL.md`
- Queue Channel — `423_QUEUE_CHANNEL.md`
- SEDA Backpressure — `424_SEDA_BACKPRESSURE.md`
- SEDA Restartability — `425_SEDA_RESTARTABILITY.md`
- SEDA Use Case — `426_SEDA_USE_CASE.md`

## Scheduling & Orchestration

- Spring Batch Is Not Scheduler — `427_SPRING_BATCH_IS_NOT_SCHEDULER.md`
- @Scheduled — `428_SCHEDULED.md`
- Quartz — `429_QUARTZ.md`
- Kubernetes CronJob — `430_KUBERNETES_CRONJOB.md`
- Airflow — `431_AIRFLOW.md`
- Control M Autosys — `432_CONTROL_M_AUTOSYS.md`
- Spring Cloud Data Flow Awareness — `433_SPRING_CLOUD_DATA_FLOW_AWARENESS.md`
- Scheduler Identity Parameter — `434_SCHEDULER_IDENTITY_PARAMETER.md`
- Misfire — `435_MISFIRE.md`
- Overlap Prevention — `436_OVERLAP_PREVENTION.md`
- Calendar Scheduling vs Event Trigger — `437_CALENDAR_SCHEDULING_VS_EVENT_TRIGGER.md`

## File Processing Patterns

- File Ingestion Pattern — `438_FILE_INGESTION_PATTERN.md`
- File Claim — `439_FILE_CLAIM.md`
- File Checksum — `440_FILE_CHECKSUM.md`
- Header Validation — `441_HEADER_VALIDATION.md`
- Trailer Validation — `442_TRAILER_VALIDATION.md`
- Control Totals — `443_CONTROL_TOTALS.md`
- Reject File — `444_REJECT_FILE.md`
- Archive — `445_ARCHIVE.md`
- Quarantine — `446_QUARANTINE.md`
- Partial File — `447_PARTIAL_FILE.md`
- Character Encoding — `448_CHARACTER_ENCODING.md`
- CSV Escaping — `449_CSV_ESCAPING.md`

## Database Batch Patterns

- Table to Table ETL — `450_TABLE_TO_TABLE_ETL.md`
- Staging Table — `451_STAGING_TABLE.md`
- High Water Mark — `452_HIGH_WATER_MARK.md`
- Change Data Capture vs Batch — `453_CHANGE_DATA_CAPTURE_VS_BATCH.md`
- Keyset Paging — `454_KEYSET_PAGING.md`
- Snapshot Isolation — `455_SNAPSHOT_ISOLATION.md`
- Delete After Process — `456_DELETE_AFTER_PROCESS.md`
- Claim Rows — `457_CLAIM_ROWS.md`
- Skip Locked — `458_SKIP_LOCKED.md`
- Bulk SQL Step — `459_BULK_SQL_STEP.md`

## Spring Data Integration

- RepositoryItemReader — `460_REPOSITORYITEMREADER.md`
- RepositoryItemWriter — `461_REPOSITORYITEMWRITER.md`
- Repository Reader Paging — `462_REPOSITORY_READER_PAGING.md`
- Spring Data Performance — `463_SPRING_DATA_PERFORMANCE.md`
- JPA Batch Integration — `464_JPA_BATCH_INTEGRATION.md`
- EntityManager Clear — `465_ENTITYMANAGER_CLEAR.md`
- Projection Reader — `466_PROJECTION_READER.md`

## Spring Integration Integration

- Spring Batch Integration — `467_SPRING_BATCH_INTEGRATION.md`
- JobLaunchingGateway — `468_JOBLAUNCHINGGATEWAY.md`
- JobExecutionEvents — `469_JOBEXECUTIONEVENTS.md`
- Remote Chunking Builders — `470_REMOTE_CHUNKING_BUILDERS.md`
- Remote Partition Builders — `471_REMOTE_PARTITION_BUILDERS.md`
- Message Channel Security — `472_MESSAGE_CHANNEL_SECURITY.md`

## Spring Boot Integration

- spring-boot-starter-batch — `473_SPRING_BOOT_STARTER_BATCH.md`
- Boot Batch Auto Configuration — `474_BOOT_BATCH_AUTO_CONFIGURATION.md`
- Job Auto Run — `475_JOB_AUTO_RUN.md`
- Job Name Selection — `476_JOB_NAME_SELECTION.md`
- Schema Initialization — `477_SCHEMA_INITIALIZATION.md`
- Application Runner Pattern — `478_APPLICATION_RUNNER_PATTERN.md`
- ExitCodeGenerator — `479_EXITCODEGENERATOR.md`
- Boot DataSource — `480_BOOT_DATASOURCE.md`
- Dedicated Batch DataSource — `481_DEDICATED_BATCH_DATASOURCE.md`

## Infrastructure Configuration

- @EnableBatchProcessing — `482_ENABLEBATCHPROCESSING.md`
- DefaultBatchConfiguration — `483_DEFAULTBATCHCONFIGURATION.md`
- Do Not Combine Config Styles — `484_DO_NOT_COMBINE_CONFIG_STYLES.md`
- Default Resourceless Infrastructure — `485_DEFAULT_RESOURCELESS_INFRASTRUCTURE.md`
- JDBC Infrastructure — `486_JDBC_INFRASTRUCTURE.md`
- Mongo Infrastructure — `487_MONGO_INFRASTRUCTURE.md`
- JobOperator Bean — `488_JOBOPERATOR_BEAN.md`
- StepScope Bean — `489_STEPSCOPE_BEAN.md`
- JobScope Bean — `490_JOBSCOPE_BEAN.md`
- Infrastructure Transaction Manager — `491_INFRASTRUCTURE_TRANSACTION_MANAGER.md`

## Metadata Schema & Operations

- BATCH_JOB_INSTANCE — `492_BATCH_JOB_INSTANCE.md`
- BATCH_JOB_EXECUTION — `493_BATCH_JOB_EXECUTION.md`
- BATCH_JOB_EXECUTION_PARAMS — `494_BATCH_JOB_EXECUTION_PARAMS.md`
- BATCH_STEP_EXECUTION — `495_BATCH_STEP_EXECUTION.md`
- BATCH_STEP_EXECUTION_CONTEXT — `496_BATCH_STEP_EXECUTION_CONTEXT.md`
- BATCH_JOB_EXECUTION_CONTEXT — `497_BATCH_JOB_EXECUTION_CONTEXT.md`
- Sequence Tables — `498_SEQUENCE_TABLES.md`
- Metadata Retention — `499_METADATA_RETENTION.md`
- Metadata Indexes — `500_METADATA_INDEXES.md`
- Metadata Growth — `501_METADATA_GROWTH.md`
- Repository Cleanup Safety — `502_REPOSITORY_CLEANUP_SAFETY.md`

## Repeat

- RepeatTemplate — `503_REPEATTEMPLATE.md`
- RepeatCallback — `504_REPEATCALLBACK.md`
- RepeatStatus — `505_REPEATSTATUS.md`
- CompletionPolicy Repeat — `506_COMPLETIONPOLICY_REPEAT.md`
- SimpleCompletionPolicy — `507_SIMPLECOMPLETIONPOLICY.md`
- TimeoutTerminationPolicy — `508_TIMEOUTTERMINATIONPOLICY.md`
- CompositeCompletionPolicy — `509_COMPOSITECOMPLETIONPOLICY.md`
- ExceptionHandler Repeat — `510_EXCEPTIONHANDLER_REPEAT.md`
- RepeatListener — `511_REPEATLISTENER.md`
- Repeat vs Retry — `512_REPEAT_VS_RETRY.md`

## Validation

- Job Parameter Validation — `513_JOB_PARAMETER_VALIDATION.md`
- Input Schema Validation — `514_INPUT_SCHEMA_VALIDATION.md`
- Bean Validation — `515_BEAN_VALIDATION.md`
- Cross Field Validation — `516_CROSS_FIELD_VALIDATION.md`
- Control Total Validation — `517_CONTROL_TOTAL_VALIDATION.md`
- Reference Data Validation — `518_REFERENCE_DATA_VALIDATION.md`
- Validation Failure Policy — `519_VALIDATION_FAILURE_POLICY.md`
- Fail Fast — `520_FAIL_FAST.md`

## State & Idempotency

- Idempotent Writer — `521_IDEMPOTENT_WRITER.md`
- Business Key — `522_BUSINESS_KEY.md`
- Processed Table — `523_PROCESSED_TABLE.md`
- Idempotency Token — `524_IDEMPOTENCY_TOKEN.md`
- Checkpoint Plus Idempotency — `525_CHECKPOINT_PLUS_IDEMPOTENCY.md`
- Exactly Once Illusion — `526_EXACTLY_ONCE_ILLUSION.md`
- Outbox in Batch — `527_OUTBOX_IN_BATCH.md`
- Inbox in Batch — `528_INBOX_IN_BATCH.md`

## Observability

- Spring Batch Observability — `529_SPRING_BATCH_OBSERVABILITY.md`
- Micrometer — `530_MICROMETER.md`
- Job Duration — `531_JOB_DURATION.md`
- Step Duration — `532_STEP_DURATION.md`
- Read Count — `533_READ_COUNT.md`
- Write Count — `534_WRITE_COUNT.md`
- Filter Count — `535_FILTER_COUNT.md`
- Read Skip Count — `536_READ_SKIP_COUNT.md`
- Process Skip Count — `537_PROCESS_SKIP_COUNT.md`
- Write Skip Count — `538_WRITE_SKIP_COUNT.md`
- Commit Count — `539_COMMIT_COUNT.md`
- Rollback Count — `540_ROLLBACK_COUNT.md`
- Active Jobs — `541_ACTIVE_JOBS.md`
- Failure Rate — `542_FAILURE_RATE.md`
- Throughput — `543_THROUGHPUT.md`
- Lag to SLA — `544_LAG_TO_SLA.md`
- JFR Batch Events — `545_JFR_BATCH_EVENTS.md`
- JFR Job Event — `546_JFR_JOB_EVENT.md`
- JFR Step Event — `547_JFR_STEP_EVENT.md`
- JFR Item Events — `548_JFR_ITEM_EVENTS.md`
- JFR Transaction Events — `549_JFR_TRANSACTION_EVENTS.md`
- Tracing Correlation — `550_TRACING_CORRELATION.md`
- Structured Logging — `551_STRUCTURED_LOGGING.md`

## Performance Tuning

- Performance Mental Model — `552_PERFORMANCE_MENTAL_MODEL.md`
- Chunk Size Tuning — `553_CHUNK_SIZE_TUNING.md`
- Reader Page Size — `554_READER_PAGE_SIZE.md`
- JDBC Fetch Size — `555_JDBC_FETCH_SIZE.md`
- Writer Batch Size — `556_WRITER_BATCH_SIZE.md`
- Processor CPU — `557_PROCESSOR_CPU.md`
- DB Indexes — `558_DB_INDEXES.md`
- Connection Pool — `559_CONNECTION_POOL.md`
- Thread Count — `560_THREAD_COUNT.md`
- Partition Count — `561_PARTITION_COUNT.md`
- Remote Serialization Cost — `562_REMOTE_SERIALIZATION_COST.md`
- File IO Buffering — `563_FILE_IO_BUFFERING.md`
- Compression — `564_COMPRESSION.md`
- GC Pressure — `565_GC_PRESSURE.md`
- ExecutionContext Frequency — `566_EXECUTIONCONTEXT_FREQUENCY.md`
- Repository Bottleneck — `567_REPOSITORY_BOTTLENECK.md`
- Benchmark Realistic Data — `568_BENCHMARK_REALISTIC_DATA.md`

## Scaling Decision Framework

- Single Thread First — `569_SINGLE_THREAD_FIRST.md`
- Tune SQL IO First — `570_TUNE_SQL_IO_FIRST.md`
- Multi Thread Step — `571_MULTI_THREAD_STEP.md`
- Local Chunking Choice — `572_LOCAL_CHUNKING_CHOICE.md`
- Partitioning Choice — `573_PARTITIONING_CHOICE.md`
- Remote Chunking Choice — `574_REMOTE_CHUNKING_CHOICE.md`
- Remote Partition Choice — `575_REMOTE_PARTITION_CHOICE.md`
- Remote Step Choice — `576_REMOTE_STEP_CHOICE.md`
- Parallel Flow Choice — `577_PARALLEL_FLOW_CHOICE.md`
- Cloud Horizontal Scale — `578_CLOUD_HORIZONTAL_SCALE.md`
- Scale Down Rule — `579_SCALE_DOWN_RULE.md`

## Cloud & Container Integration

- Containerized Batch Job — `580_CONTAINERIZED_BATCH_JOB.md`
- Kubernetes Job — `581_KUBERNETES_JOB.md`
- Kubernetes CronJob — `582_KUBERNETES_CRONJOB.md`
- Pod Restart — `583_POD_RESTART.md`
- Ephemeral Filesystem — `584_EPHEMERAL_FILESYSTEM.md`
- Object Storage Input — `585_OBJECT_STORAGE_INPUT.md`
- Object Storage Output — `586_OBJECT_STORAGE_OUTPUT.md`
- Secrets — `587_SECRETS.md`
- Horizontal Workers — `588_HORIZONTAL_WORKERS.md`
- Autoscaling Workers — `589_AUTOSCALING_WORKERS.md`
- Cloud Batch Service — `590_CLOUD_BATCH_SERVICE.md`
- Cloud Scheduler — `591_CLOUD_SCHEDULER.md`
- Spot Preemption — `592_SPOT_PREEMPTION.md`

## Security

- Batch Security Mental Model — `593_BATCH_SECURITY_MENTAL_MODEL.md`
- Job Parameter Injection — `594_JOB_PARAMETER_INJECTION.md`
- Path Traversal — `595_PATH_TRAVERSAL.md`
- SQL Injection — `596_SQL_INJECTION.md`
- Flat File DoS — `597_FLAT_FILE_DOS.md`
- ExecutionContext Deserialization — `598_EXECUTIONCONTEXT_DESERIALIZATION.md`
- Remote Worker Trust — `599_REMOTE_WORKER_TRUST.md`
- Sensitive Metadata — `600_SENSITIVE_METADATA.md`
- Credential Management — `601_CREDENTIAL_MANAGEMENT.md`
- Output Permissions — `602_OUTPUT_PERMISSIONS.md`
- PII Logging — `603_PII_LOGGING.md`
- Least Privilege DB — `604_LEAST_PRIVILEGE_DB.md`
- Admin Endpoint Security — `605_ADMIN_ENDPOINT_SECURITY.md`
- Audit Job Control — `606_AUDIT_JOB_CONTROL.md`

## Testing

- spring-batch-test — `607_SPRING_BATCH_TEST.md`
- @SpringBatchTest — `608_SPRINGBATCHTEST.md`
- JobLauncherTestUtils — `609_JOBLAUNCHERTESTUTILS.md`
- JobRepositoryTestUtils — `610_JOBREPOSITORYTESTUTILS.md`
- launchJob — `611_LAUNCHJOB.md`
- launchStep — `612_LAUNCHSTEP.md`
- StepScopeTestUtils — `613_STEPSCOPETESTUTILS.md`
- JobScopeTestUtils — `614_JOBSCOPETESTUTILS.md`
- MetaDataInstanceFactory — `615_METADATAINSTANCEFACTORY.md`
- Reader Unit Test — `616_READER_UNIT_TEST.md`
- Processor Unit Test — `617_PROCESSOR_UNIT_TEST.md`
- Writer Unit Test — `618_WRITER_UNIT_TEST.md`
- Restart Test — `619_RESTART_TEST.md`
- Skip Retry Test — `620_SKIP_RETRY_TEST.md`
- Transaction Rollback Test — `621_TRANSACTION_ROLLBACK_TEST.md`
- Partition Test — `622_PARTITION_TEST.md`
- Concurrent Test — `623_CONCURRENT_TEST.md`
- Testcontainers — `624_TESTCONTAINERS.md`
- Production Dialect Test — `625_PRODUCTION_DIALECT_TEST.md`

## Spring Batch Patterns

- Process Indicator Pattern — `626_PROCESS_INDICATOR_PATTERN.md`
- Driving Query Pattern — `627_DRIVING_QUERY_PATTERN.md`
- Keyset Restart Pattern — `628_KEYSET_RESTART_PATTERN.md`
- Staging Pattern — `629_STAGING_PATTERN.md`
- Validation Step Pattern — `630_VALIDATION_STEP_PATTERN.md`
- Split Flow Pattern — `631_SPLIT_FLOW_PATTERN.md`
- Partition by File — `632_PARTITION_BY_FILE.md`
- Partition by Key Range — `633_PARTITION_BY_KEY_RANGE.md`
- Retry Then DLQ — `634_RETRY_THEN_DLQ.md`
- Control Table — `635_CONTROL_TABLE.md`
- Reconciliation Pattern — `636_RECONCILIATION_PATTERN.md`
- End of Day Pattern — `637_END_OF_DAY_PATTERN.md`
- Restartable Export — `638_RESTARTABLE_EXPORT.md`
- Two Phase File Publish — `639_TWO_PHASE_FILE_PUBLISH.md`

## Anti Patterns

- One Huge Transaction — `640_ONE_HUGE_TRANSACTION.md`
- Tiny Chunk Everywhere — `641_TINY_CHUNK_EVERYWHERE.md`
- Huge Chunk Everywhere — `642_HUGE_CHUNK_EVERYWHERE.md`
- State in Static Variables — `643_STATE_IN_STATIC_VARIABLES.md`
- Reader Side Effects — `644_READER_SIDE_EFFECTS.md`
- Processor Remote Write — `645_PROCESSOR_REMOTE_WRITE.md`
- No Business Key — `646_NO_BUSINESS_KEY.md`
- Blind skipLimit — `647_BLIND_SKIPLIMIT.md`
- Infinite Retry — `648_INFINITE_RETRY.md`
- No Timeout — `649_NO_TIMEOUT.md`
- Schedule Inside Business Logic — `650_SCHEDULE_INSIDE_BUSINESS_LOGIC.md`
- Assume Scheduler Provides Restart — `651_ASSUME_SCHEDULER_PROVIDES_RESTART.md`
- Use Resourceless Repository for Critical Job — `652_USE_RESOURCELESS_REPOSITORY_FOR_CRITICAL_JOB.md`
- Store Huge Objects in ExecutionContext — `653_STORE_HUGE_OBJECTS_IN_EXECUTIONCONTEXT.md`
- Partition by OFFSET — `654_PARTITION_BY_OFFSET.md`
- Unlimited Worker Threads — `655_UNLIMITED_WORKER_THREADS.md`
- Distributed Batch Too Early — `656_DISTRIBUTED_BATCH_TOO_EARLY.md`

## Troubleshooting

- JobInstanceAlreadyComplete — `657_JOBINSTANCEALREADYCOMPLETE.md`
- JobExecutionAlreadyRunning — `658_JOBEXECUTIONALREADYRUNNING.md`
- JobRestartException — `659_JOBRESTARTEXCEPTION.md`
- JobParametersInvalid — `660_JOBPARAMETERSINVALID.md`
- StartLimitExceeded — `661_STARTLIMITEXCEEDED.md`
- Reader Not Restarting — `662_READER_NOT_RESTARTING.md`
- Duplicate Processing After Restart — `663_DUPLICATE_PROCESSING_AFTER_RESTART.md`
- Missing Items After Restart — `664_MISSING_ITEMS_AFTER_RESTART.md`
- Flat File Parse Error — `665_FLAT_FILE_PARSE_ERROR.md`
- UnexpectedInputException — `666_UNEXPECTEDINPUTEXCEPTION.md`
- ParseException — `667_PARSEEXCEPTION.md`
- NonTransientResourceException — `668_NONTRANSIENTRESOURCEEXCEPTION.md`
- Writer Rollback Loop — `669_WRITER_ROLLBACK_LOOP.md`
- Skip Limit Exceeded — `670_SKIP_LIMIT_EXCEEDED.md`
- Retry Exhausted — `671_RETRY_EXHAUSTED.md`
- Deadlock Losing Transaction — `672_DEADLOCK_LOSING_TRANSACTION.md`
- Connection Pool Exhausted — `673_CONNECTION_POOL_EXHAUSTED.md`
- JobRepository Hot — `674_JOBREPOSITORY_HOT.md`
- Stuck STARTED Execution — `675_STUCK_STARTED_EXECUTION.md`
- Recover Failed Execution — `676_RECOVER_FAILED_EXECUTION.md`
- Stop Does Not Finish — `677_STOP_DOES_NOT_FINISH.md`
- Graceful Shutdown Timeout — `678_GRACEFUL_SHUTDOWN_TIMEOUT.md`
- Partition Never Completes — `679_PARTITION_NEVER_COMPLETES.md`
- Remote Chunk Duplicate — `680_REMOTE_CHUNK_DUPLICATE.md`
- ExecutionContext Deserialize Error — `681_EXECUTIONCONTEXT_DESERIALIZE_ERROR.md`
- Exit Status Wrong — `682_EXIT_STATUS_WRONG.md`
- Golden Batch Debug Flow — `683_GOLDEN_BATCH_DEBUG_FLOW.md`

## System Design & Interviews

- Design File Ingestion Job — `684_DESIGN_FILE_INGESTION_JOB.md`
- Design Million Row Import — `685_DESIGN_MILLION_ROW_IMPORT.md`
- Design End of Day Settlement — `686_DESIGN_END_OF_DAY_SETTLEMENT.md`
- Design Report Generation — `687_DESIGN_REPORT_GENERATION.md`
- Design Database Migration — `688_DESIGN_DATABASE_MIGRATION.md`
- Design API Enrichment Batch — `689_DESIGN_API_ENRICHMENT_BATCH.md`
- Design Cloud Batch — `690_DESIGN_CLOUD_BATCH.md`
- Design Remote Partitioning — `691_DESIGN_REMOTE_PARTITIONING.md`
- Design Remote Chunking — `692_DESIGN_REMOTE_CHUNKING.md`
- Design Local Chunking — `693_DESIGN_LOCAL_CHUNKING.md`
- Design Restart Strategy — `694_DESIGN_RESTART_STRATEGY.md`
- Design Error Handling — `695_DESIGN_ERROR_HANDLING.md`
- Design Metadata Repository — `696_DESIGN_METADATA_REPOSITORY.md`
- Job vs Step — `697_JOB_VS_STEP.md`
- JobInstance vs JobExecution — `698_JOBINSTANCE_VS_JOBEXECUTION.md`
- BatchStatus vs ExitStatus — `699_BATCHSTATUS_VS_EXITSTATUS.md`
- JobParameters vs ExecutionContext — `700_JOBPARAMETERS_VS_EXECUTIONCONTEXT.md`
- Chunk vs Tasklet — `701_CHUNK_VS_TASKLET.md`
- Reader vs Processor vs Writer — `702_READER_VS_PROCESSOR_VS_WRITER.md`
- Skip vs Retry — `703_SKIP_VS_RETRY.md`
- Restart vs Rerun — `704_RESTART_VS_RERUN.md`
- Partitioning vs Remote Chunking — `705_PARTITIONING_VS_REMOTE_CHUNKING.md`
- Remote Step vs Remote Partition — `706_REMOTE_STEP_VS_REMOTE_PARTITION.md`
- Local Chunking vs Multi Thread — `707_LOCAL_CHUNKING_VS_MULTI_THREAD.md`
- Spring Batch vs Scheduler — `708_SPRING_BATCH_VS_SCHEDULER.md`
- Spring Batch vs Spring Integration — `709_SPRING_BATCH_VS_SPRING_INTEGRATION.md`
- Spring Batch vs Stream Processing — `710_SPRING_BATCH_VS_STREAM_PROCESSING.md`
- Spring Batch vs Spark — `711_SPRING_BATCH_VS_SPARK.md`
- Spring Batch vs Airflow — `712_SPRING_BATCH_VS_AIRFLOW.md`
- When Not to Use Spring Batch — `713_WHEN_NOT_TO_USE_SPRING_BATCH.md`
- Spring Batch Interview Traps — `714_SPRING_BATCH_INTERVIEW_TRAPS.md`
