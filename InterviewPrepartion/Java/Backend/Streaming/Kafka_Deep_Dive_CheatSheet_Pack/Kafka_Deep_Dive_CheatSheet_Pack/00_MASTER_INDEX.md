# Apache Kafka — Dedicated Deep-Dive Cheat Sheet Pack

**Baseline:** Apache Kafka 4.3.1 (June 25, 2026).

**Goal:** Architect/Staff/Principal-level revision: internals, KRaft, producer/consumer semantics, transactions, Share Groups, Connect, Streams, security, operations, performance, DR and system design.

**Standard:** What → Why → Visual → How → Analogy → Trade-offs → Production → Interview Trap → Recall

## Fast files
- `01_30_SECOND_RECALL.md`
- `02_CURRENT_BASELINE.md`
- `03_REFERENCE_ARCHITECTURE.md`
- `04_DECISION_TREE.md`

## 01 Foundations

- Kafka Mental Model — `005_KAFKA_MENTAL_MODEL.md`
- Event Streaming — `006_EVENT_STREAMING.md`
- Record Anatomy — `007_RECORD_ANATOMY.md`
- Topic — `008_TOPIC.md`
- Partition — `009_PARTITION.md`
- Offset — `010_OFFSET.md`
- Key — `011_KEY.md`
- Ordering — `012_ORDERING.md`
- Retention — `013_RETENTION.md`
- Log Compaction — `014_LOG_COMPACTION.md`
- Producer — `015_PRODUCER.md`
- Consumer — `016_CONSUMER.md`
- Broker — `017_BROKER.md`
- Cluster — `018_CLUSTER.md`
- Bootstrap Servers — `019_BOOTSTRAP_SERVERS.md`

## 02 Storage Internals

- Partition Selection — `020_PARTITION_SELECTION.md`
- Hot Partitions — `021_HOT_PARTITIONS.md`
- Partition Count — `022_PARTITION_COUNT.md`
- Log Segments — `023_LOG_SEGMENTS.md`
- Active Segment — `024_ACTIVE_SEGMENT.md`
- Offset Index — `025_OFFSET_INDEX.md`
- Time Index — `026_TIME_INDEX.md`
- Segment Rolling — `027_SEGMENT_ROLLING.md`
- Retention by Time — `028_RETENTION_BY_TIME.md`
- Retention by Size — `029_RETENTION_BY_SIZE.md`
- Compaction Cleaner — `030_COMPACTION_CLEANER.md`
- Tombstones — `031_TOMBSTONES.md`
- Page Cache — `032_PAGE_CACHE.md`
- Sequential I/O — `033_SEQUENTIAL_I_O.md`
- Record Batches — `034_RECORD_BATCHES.md`
- Batch Compression — `035_BATCH_COMPRESSION.md`

## 03 Replication & KRaft

- Replication Factor — `036_REPLICATION_FACTOR.md`
- Leader Replica — `037_LEADER_REPLICA.md`
- Follower Replica — `038_FOLLOWER_REPLICA.md`
- ISR — `039_ISR.md`
- High Watermark — `040_HIGH_WATERMARK.md`
- Log End Offset — `041_LOG_END_OFFSET.md`
- Leader Epoch — `042_LEADER_EPOCH.md`
- Leader Election — `043_LEADER_ELECTION.md`
- Unclean Leader Election — `044_UNCLEAN_LEADER_ELECTION.md`
- min.insync.replicas — `045_MIN_INSYNC_REPLICAS.md`
- Rack Awareness — `046_RACK_AWARENESS.md`
- KRaft — `047_KRAFT.md`
- Controller Quorum — `048_CONTROLLER_QUORUM.md`
- Active Controller — `049_ACTIVE_CONTROLLER.md`
- Metadata Log — `050_METADATA_LOG.md`
- Quorum Majority — `051_QUORUM_MAJORITY.md`
- Broker Registration — `052_BROKER_REGISTRATION.md`
- Broker Epoch — `053_BROKER_EPOCH.md`
- Combined vs Isolated Roles — `054_COMBINED_VS_ISOLATED_ROLES.md`
- Cluster ID — `055_CLUSTER_ID.md`
- Storage Formatting — `056_STORAGE_FORMATTING.md`

## 04 Producer Deep Dive

- Producer Architecture — `057_PRODUCER_ARCHITECTURE.md`
- Async Send — `058_ASYNC_SEND.md`
- Producer Metadata — `059_PRODUCER_METADATA.md`
- Record Accumulator — `060_RECORD_ACCUMULATOR.md`
- batch.size — `061_BATCH_SIZE.md`
- linger.ms — `062_LINGER_MS.md`
- buffer.memory — `063_BUFFER_MEMORY.md`
- max.block.ms — `064_MAX_BLOCK_MS.md`
- compression.type — `065_COMPRESSION_TYPE.md`
- max.request.size — `066_MAX_REQUEST_SIZE.md`
- request.timeout.ms — `067_REQUEST_TIMEOUT_MS.md`
- delivery.timeout.ms — `068_DELIVERY_TIMEOUT_MS.md`
- retries — `069_RETRIES.md`
- max.in.flight — `070_MAX_IN_FLIGHT.md`
- acks=0/1/all — `071_ACKS_0_1_ALL.md`
- Idempotent Producer — `072_IDEMPOTENT_PRODUCER.md`
- enable.idempotence — `073_ENABLE_IDEMPOTENCE.md`
- Producer ID — `074_PRODUCER_ID.md`
- Sequence Number — `075_SEQUENCE_NUMBER.md`
- Custom Partitioner — `076_CUSTOM_PARTITIONER.md`
- Producer Callback — `077_PRODUCER_CALLBACK.md`
- Flush and Close — `078_FLUSH_AND_CLOSE.md`

## 05 Transactions & Delivery Semantics

- At Most Once — `079_AT_MOST_ONCE.md`
- At Least Once — `080_AT_LEAST_ONCE.md`
- Exactly Once Scope — `081_EXACTLY_ONCE_SCOPE.md`
- transactional.id — `082_TRANSACTIONAL_ID.md`
- initTransactions — `083_INITTRANSACTIONS.md`
- beginTransaction — `084_BEGINTRANSACTION.md`
- commitTransaction — `085_COMMITTRANSACTION.md`
- abortTransaction — `086_ABORTTRANSACTION.md`
- sendOffsetsToTransaction — `087_SENDOFFSETSTOTRANSACTION.md`
- read_committed — `088_READ_COMMITTED.md`
- read_uncommitted — `089_READ_UNCOMMITTED.md`
- Transaction Coordinator — `090_TRANSACTION_COORDINATOR.md`
- Producer Fencing — `091_PRODUCER_FENCING.md`
- Kafka Streams EOS — `092_KAFKA_STREAMS_EOS.md`
- External Side Effects — `093_EXTERNAL_SIDE_EFFECTS.md`
- Transactional Timeout — `094_TRANSACTIONAL_TIMEOUT.md`

## 06 Consumers

- Consumer Architecture — `095_CONSUMER_ARCHITECTURE.md`
- poll Loop — `096_POLL_LOOP.md`
- Position — `097_POSITION.md`
- Committed Offset — `098_COMMITTED_OFFSET.md`
- Auto Commit — `099_AUTO_COMMIT.md`
- Manual Commit — `100_MANUAL_COMMIT.md`
- commitSync — `101_COMMITSYNC.md`
- commitAsync — `102_COMMITASYNC.md`
- Offset Commit Timing — `103_OFFSET_COMMIT_TIMING.md`
- auto.offset.reset — `104_AUTO_OFFSET_RESET.md`
- earliest — `105_EARLIEST.md`
- latest — `106_LATEST.md`
- by_duration — `107_BY_DURATION.md`
- max.poll.records — `108_MAX_POLL_RECORDS.md`
- max.poll.interval.ms — `109_MAX_POLL_INTERVAL_MS.md`
- Heartbeat and Session — `110_HEARTBEAT_AND_SESSION.md`
- fetch.min.bytes — `111_FETCH_MIN_BYTES.md`
- fetch.max.wait.ms — `112_FETCH_MAX_WAIT_MS.md`
- max.partition.fetch.bytes — `113_MAX_PARTITION_FETCH_BYTES.md`
- Pause Resume — `114_PAUSE_RESUME.md`
- Seek — `115_SEEK.md`
- Seek by Timestamp — `116_SEEK_BY_TIMESTAMP.md`
- Consumer Thread Safety — `117_CONSUMER_THREAD_SAFETY.md`
- Graceful Shutdown — `118_GRACEFUL_SHUTDOWN.md`

## 07 Consumer Groups & Rebalancing

- Consumer Group — `119_CONSUMER_GROUP.md`
- Group Coordinator — `120_GROUP_COORDINATOR.md`
- Exclusive Partition Assignment — `121_EXCLUSIVE_PARTITION_ASSIGNMENT.md`
- Parallelism Bound — `122_PARALLELISM_BOUND.md`
- Rebalance — `123_REBALANCE.md`
- Rebalance Cost — `124_REBALANCE_COST.md`
- Classic Protocol — `125_CLASSIC_PROTOCOL.md`
- New Consumer Protocol — `126_NEW_CONSUMER_PROTOCOL.md`
- group.protocol=consumer — `127_GROUP_PROTOCOL_CONSUMER.md`
- Server-Side Assignor — `128_SERVER_SIDE_ASSIGNOR.md`
- Uniform Assignor — `129_UNIFORM_ASSIGNOR.md`
- Range Assignor — `130_RANGE_ASSIGNOR.md`
- Incremental Rebalancing — `131_INCREMENTAL_REBALANCING.md`
- Online Protocol Migration — `132_ONLINE_PROTOCOL_MIGRATION.md`
- CooperativeStickyAssignor — `133_COOPERATIVESTICKYASSIGNOR.md`
- StickyAssignor — `134_STICKYASSIGNOR.md`
- RoundRobinAssignor — `135_ROUNDROBINASSIGNOR.md`
- Static Membership — `136_STATIC_MEMBERSHIP.md`
- ConsumerRebalanceListener — `137_CONSUMERREBALANCELISTENER.md`
- Rebalance Storms — `138_REBALANCE_STORMS.md`

## 08 Share Groups

- Share Groups — `139_SHARE_GROUPS.md`
- Share Consumer API — `140_SHARE_CONSUMER_API.md`
- Consumer vs Share Group — `141_CONSUMER_VS_SHARE_GROUP.md`
- Consumers Greater Than Partitions — `142_CONSUMERS_GREATER_THAN_PARTITIONS.md`
- Per-Record Acknowledgement — `143_PER_RECORD_ACKNOWLEDGEMENT.md`
- Delivery Attempt Count — `144_DELIVERY_ATTEMPT_COUNT.md`
- Acquisition Lock — `145_ACQUISITION_LOCK.md`
- Lock Expiry — `146_LOCK_EXPIRY.md`
- Accept — `147_ACCEPT.md`
- Release — `148_RELEASE.md`
- Reject — `149_REJECT.md`
- share.delivery.count.limit — `150_SHARE_DELIVERY_COUNT_LIMIT.md`
- share.isolation.level — `151_SHARE_ISOLATION_LEVEL.md`
- Share Group Use Cases — `152_SHARE_GROUP_USE_CASES.md`
- Ordering Tradeoff — `153_ORDERING_TRADEOFF.md`
- Share Group CLI — `154_SHARE_GROUP_CLI.md`

## 09 Kafka Connect

- Connect Mental Model — `155_CONNECT_MENTAL_MODEL.md`
- Source Connector — `156_SOURCE_CONNECTOR.md`
- Sink Connector — `157_SINK_CONNECTOR.md`
- Connector — `158_CONNECTOR.md`
- Task — `159_TASK.md`
- Worker — `160_WORKER.md`
- Standalone Mode — `161_STANDALONE_MODE.md`
- Distributed Mode — `162_DISTRIBUTED_MODE.md`
- Internal Topics — `163_INTERNAL_TOPICS.md`
- Converters — `164_CONVERTERS.md`
- Single Message Transform — `165_SINGLE_MESSAGE_TRANSFORM.md`
- Source Offsets — `166_SOURCE_OFFSETS.md`
- Error Tolerance — `167_ERROR_TOLERANCE.md`
- Connect DLQ — `168_CONNECT_DLQ.md`
- tasks.max — `169_TASKS_MAX.md`
- Connector Rebalance — `170_CONNECTOR_REBALANCE.md`
- Plugin Isolation — `171_PLUGIN_ISOLATION.md`
- Custom Connector — `172_CUSTOM_CONNECTOR.md`
- CDC with Connect — `173_CDC_WITH_CONNECT.md`

## 10 Kafka Streams

- Streams Mental Model — `174_STREAMS_MENTAL_MODEL.md`
- Topology — `175_TOPOLOGY.md`
- Streams DSL — `176_STREAMS_DSL.md`
- Processor API — `177_PROCESSOR_API.md`
- KStream — `178_KSTREAM.md`
- KTable — `179_KTABLE.md`
- GlobalKTable — `180_GLOBALKTABLE.md`
- Stateless Transform — `181_STATELESS_TRANSFORM.md`
- Stateful Transform — `182_STATEFUL_TRANSFORM.md`
- State Store — `183_STATE_STORE.md`
- Changelog Topic — `184_CHANGELOG_TOPIC.md`
- Standby Replica — `185_STANDBY_REPLICA.md`
- Task — `186_TASK.md`
- Stream Thread — `187_STREAM_THREAD.md`
- Repartition Topic — `188_REPARTITION_TOPIC.md`
- Windowing — `189_WINDOWING.md`
- Tumbling Window — `190_TUMBLING_WINDOW.md`
- Hopping Window — `191_HOPPING_WINDOW.md`
- Session Window — `192_SESSION_WINDOW.md`
- Grace Period — `193_GRACE_PERIOD.md`
- Event Time — `194_EVENT_TIME.md`
- Joins — `195_JOINS.md`
- Exactly Once Streams — `196_EXACTLY_ONCE_STREAMS.md`
- Interactive Queries — `197_INTERACTIVE_QUERIES.md`
- Streams Rebalance Protocol — `198_STREAMS_REBALANCE_PROTOCOL.md`
- State Restore — `199_STATE_RESTORE.md`

## 11 Schemas & Event Contracts

- Serialization — `200_SERIALIZATION.md`
- Serializer — `201_SERIALIZER.md`
- Deserializer — `202_DESERIALIZER.md`
- JSON — `203_JSON.md`
- Avro — `204_AVRO.md`
- Protobuf — `205_PROTOBUF.md`
- JSON Schema — `206_JSON_SCHEMA.md`
- Schema Registry Pattern — `207_SCHEMA_REGISTRY_PATTERN.md`
- Schema Evolution — `208_SCHEMA_EVOLUTION.md`
- Backward Compatibility — `209_BACKWARD_COMPATIBILITY.md`
- Forward Compatibility — `210_FORWARD_COMPATIBILITY.md`
- Full Compatibility — `211_FULL_COMPATIBILITY.md`
- Event Contract — `212_EVENT_CONTRACT.md`
- Event Versioning — `213_EVENT_VERSIONING.md`
- Schema Governance — `214_SCHEMA_GOVERNANCE.md`

## 12 EDA & Microservices Patterns

- Domain Event — `215_DOMAIN_EVENT.md`
- Integration Event — `216_INTEGRATION_EVENT.md`
- Command vs Event — `217_COMMAND_VS_EVENT.md`
- Event Notification — `218_EVENT_NOTIFICATION.md`
- Event-Carried State Transfer — `219_EVENT_CARRIED_STATE_TRANSFER.md`
- Transactional Outbox — `220_TRANSACTIONAL_OUTBOX.md`
- CDC Outbox — `221_CDC_OUTBOX.md`
- Inbox Pattern — `222_INBOX_PATTERN.md`
- Idempotent Consumer — `223_IDEMPOTENT_CONSUMER.md`
- Saga Choreography — `224_SAGA_CHOREOGRAPHY.md`
- Saga Orchestration — `225_SAGA_ORCHESTRATION.md`
- CQRS with Kafka — `226_CQRS_WITH_KAFKA.md`
- Materialized View — `227_MATERIALIZED_VIEW.md`
- Replay — `228_REPLAY.md`
- Replay-Safe Side Effects — `229_REPLAY_SAFE_SIDE_EFFECTS.md`
- Poison Pill — `230_POISON_PILL.md`
- DLQ Pattern — `231_DLQ_PATTERN.md`
- Retry Topic Pattern — `232_RETRY_TOPIC_PATTERN.md`
- Ordering vs Retry — `233_ORDERING_VS_RETRY.md`
- Event Envelope — `234_EVENT_ENVELOPE.md`
- Correlation ID — `235_CORRELATION_ID.md`
- Trace Context — `236_TRACE_CONTEXT.md`

## 13 Security & Multi-Tenancy

- Kafka Security Model — `237_KAFKA_SECURITY_MODEL.md`
- TLS — `238_TLS.md`
- mTLS — `239_MTLS.md`
- SASL PLAIN — `240_SASL_PLAIN.md`
- SCRAM — `241_SCRAM.md`
- OAuthBearer — `242_OAUTHBEARER.md`
- Kerberos GSSAPI — `243_KERBEROS_GSSAPI.md`
- ACL — `244_ACL.md`
- Principal — `245_PRINCIPAL.md`
- Topic ACL — `246_TOPIC_ACL.md`
- Group ACL — `247_GROUP_ACL.md`
- Transactional ID ACL — `248_TRANSACTIONAL_ID_ACL.md`
- Least Privilege — `249_LEAST_PRIVILEGE.md`
- Secrets Management — `250_SECRETS_MANAGEMENT.md`
- Listener Architecture — `251_LISTENER_ARCHITECTURE.md`
- advertised.listeners — `252_ADVERTISED_LISTENERS.md`
- Network Segmentation — `253_NETWORK_SEGMENTATION.md`
- Client Quotas — `254_CLIENT_QUOTAS.md`
- Noisy Neighbor — `255_NOISY_NEIGHBOR.md`
- Shared vs Dedicated Cluster — `256_SHARED_VS_DEDICATED_CLUSTER.md`

## 14 Operations & Monitoring

- Topic Administration — `257_TOPIC_ADMINISTRATION.md`
- Config Administration — `258_CONFIG_ADMINISTRATION.md`
- Admin API — `259_ADMIN_API.md`
- Consumer Group CLI — `260_CONSUMER_GROUP_CLI.md`
- Offset Reset — `261_OFFSET_RESET.md`
- Feature Tool — `262_FEATURE_TOOL.md`
- Storage Tool — `263_STORAGE_TOOL.md`
- Metadata Quorum Tool — `264_METADATA_QUORUM_TOOL.md`
- Partition Reassignment — `265_PARTITION_REASSIGNMENT.md`
- Leader Election Tool — `266_LEADER_ELECTION_TOOL.md`
- Rolling Restart — `267_ROLLING_RESTART.md`
- Rolling Upgrade — `268_ROLLING_UPGRADE.md`
- Broker Decommission — `269_BROKER_DECOMMISSION.md`
- Cluster Expansion — `270_CLUSTER_EXPANSION.md`
- Under Replicated Partitions — `271_UNDER_REPLICATED_PARTITIONS.md`
- Offline Partitions — `272_OFFLINE_PARTITIONS.md`
- ISR Churn — `273_ISR_CHURN.md`
- Controller Quorum Health — `274_CONTROLLER_QUORUM_HEALTH.md`
- Request Latency — `275_REQUEST_LATENCY.md`
- Disk Utilization — `276_DISK_UTILIZATION.md`
- Consumer Lag — `277_CONSUMER_LAG.md`
- Lag Trend — `278_LAG_TREND.md`
- Rebalance Metrics — `279_REBALANCE_METRICS.md`
- Transaction Metrics — `280_TRANSACTION_METRICS.md`
- Connect Metrics — `281_CONNECT_METRICS.md`
- Streams Metrics — `282_STREAMS_METRICS.md`
- Business Event SLO — `283_BUSINESS_EVENT_SLO.md`

## 15 Performance & Capacity

- Capacity Model — `284_CAPACITY_MODEL.md`
- Ingress Throughput — `285_INGRESS_THROUGHPUT.md`
- Egress Throughput — `286_EGRESS_THROUGHPUT.md`
- Replication Traffic — `287_REPLICATION_TRAFFIC.md`
- Retention Storage Math — `288_RETENTION_STORAGE_MATH.md`
- Peak Factor — `289_PEAK_FACTOR.md`
- Broker Count — `290_BROKER_COUNT.md`
- Partition Density — `291_PARTITION_DENSITY.md`
- Partition Throughput — `292_PARTITION_THROUGHPUT.md`
- Producer Tuning — `293_PRODUCER_TUNING.md`
- Consumer Tuning — `294_CONSUMER_TUNING.md`
- Compression Tradeoff — `295_COMPRESSION_TRADEOFF.md`
- Large Messages — `296_LARGE_MESSAGES.md`
- Claim Check — `297_CLAIM_CHECK.md`
- Latency Tuning — `298_LATENCY_TUNING.md`
- Throughput Tuning — `299_THROUGHPUT_TUNING.md`
- Recovery Headroom — `300_RECOVERY_HEADROOM.md`
- Benchmarking — `301_BENCHMARKING.md`
- Producer Perf Tool — `302_PRODUCER_PERF_TOOL.md`
- Consumer Perf Tool — `303_CONSUMER_PERF_TOOL.md`

## 16 Tiered Storage & Multi-Cluster

- Tiered Storage — `304_TIERED_STORAGE.md`
- RemoteStorageManager — `305_REMOTESTORAGEMANAGER.md`
- RemoteLogMetadataManager — `306_REMOTELOGMETADATAMANAGER.md`
- remote.log.storage.system.enable — `307_REMOTE_LOG_STORAGE_SYSTEM_ENABLE.md`
- local.retention.ms — `308_LOCAL_RETENTION_MS.md`
- local.retention.bytes — `309_LOCAL_RETENTION_BYTES.md`
- Remote Fetch — `310_REMOTE_FETCH.md`
- Tiered Storage Tradeoff — `311_TIERED_STORAGE_TRADEOFF.md`
- MirrorMaker 2 — `312_MIRRORMAKER_2.md`
- Active Passive DR — `313_ACTIVE_PASSIVE_DR.md`
- Active Active — `314_ACTIVE_ACTIVE.md`
- Consumer Offset Migration — `315_CONSUMER_OFFSET_MIGRATION.md`
- RPO — `316_RPO.md`
- RTO — `317_RTO.md`
- DR Testing — `318_DR_TESTING.md`
- Multi-Cluster Trap — `319_MULTI_CLUSTER_TRAP.md`

## 17 Troubleshooting

- Producer Timeout — `320_PRODUCER_TIMEOUT.md`
- NotEnoughReplicas — `321_NOTENOUGHREPLICAS.md`
- Producer Fenced — `322_PRODUCER_FENCED.md`
- Consumer Lag Growing — `323_CONSUMER_LAG_GROWING.md`
- Rebalance Storm — `324_REBALANCE_STORM.md`
- max.poll.interval Exceeded — `325_MAX_POLL_INTERVAL_EXCEEDED.md`
- Offset Out of Range — `326_OFFSET_OUT_OF_RANGE.md`
- Deserialization Error — `327_DESERIALIZATION_ERROR.md`
- Duplicate Processing — `328_DUPLICATE_PROCESSING.md`
- Missing Events — `329_MISSING_EVENTS.md`
- Under Replicated — `330_UNDER_REPLICATED.md`
- Offline Partition — `331_OFFLINE_PARTITION.md`
- Disk Full — `332_DISK_FULL.md`
- High CPU — `333_HIGH_CPU.md`
- High Disk Latency — `334_HIGH_DISK_LATENCY.md`
- Network Saturation — `335_NETWORK_SATURATION.md`
- KRaft Quorum Loss — `336_KRAFT_QUORUM_LOSS.md`
- Schema Break — `337_SCHEMA_BREAK.md`
- DLQ Growth — `338_DLQ_GROWTH.md`
- Connect Task Failed — `339_CONNECT_TASK_FAILED.md`
- Streams Restore Slow — `340_STREAMS_RESTORE_SLOW.md`
- Golden Troubleshooting Flow — `341_GOLDEN_TROUBLESHOOTING_FLOW.md`

## 18 System Design & Interview

- Design Kafka Cluster — `342_DESIGN_KAFKA_CLUSTER.md`
- Design Event Platform — `343_DESIGN_EVENT_PLATFORM.md`
- Design Orders — `344_DESIGN_ORDERS.md`
- Design Payments — `345_DESIGN_PAYMENTS.md`
- Design CDC Platform — `346_DESIGN_CDC_PLATFORM.md`
- Design Notifications — `347_DESIGN_NOTIFICATIONS.md`
- Design Analytics — `348_DESIGN_ANALYTICS.md`
- Design Fraud Pipeline — `349_DESIGN_FRAUD_PIPELINE.md`
- Kafka vs RabbitMQ — `350_KAFKA_VS_RABBITMQ.md`
- Kafka vs JMS — `351_KAFKA_VS_JMS.md`
- Kafka vs Pulsar — `352_KAFKA_VS_PULSAR.md`
- Kafka vs Database — `353_KAFKA_VS_DATABASE.md`
- Kafka vs Event Store — `354_KAFKA_VS_EVENT_STORE.md`
- When Not to Use Kafka — `355_WHEN_NOT_TO_USE_KAFKA.md`
- Kafka Anti-Patterns — `356_KAFKA_ANTI_PATTERNS.md`
- Kafka Interview Traps — `357_KAFKA_INTERVIEW_TRAPS.md`
