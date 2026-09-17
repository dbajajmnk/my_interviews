# Apache Pulsar — Complete Deep-Dive Cheat Sheet


---

<!-- 005_PULSAR_MENTAL_MODEL.md -->

# Pulsar Mental Model

## What / Why
Apache Pulsar is a distributed multi-tenant messaging and event-streaming platform with stateless brokers and durable BookKeeper-backed storage.

## Visual
```text
Pulsar Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Mental Model:** Apache Pulsar is a distributed multi-tenant messaging and event-streaming platform with stateless brokers and durable BookKeeper-backed storage.


---

<!-- 006_MESSAGING_VS_STREAMING.md -->

# Messaging vs Streaming

## What / Why
Pulsar supports queue-like messaging and replayable stream-style consumption in one platform.

## Visual
```text
Messaging vs Streaming → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Messaging vs Streaming:** Pulsar supports queue-like messaging and replayable stream-style consumption in one platform.


---

<!-- 007_BROKER.md -->

# Broker

## What / Why
Stateless serving layer that accepts producers/consumers, routes messages, performs lookup and dispatch.

## Visual
```text
Broker → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker:** Stateless serving layer that accepts producers/consumers, routes messages, performs lookup and dispatch.


---

<!-- 008_BOOKIE.md -->

# Bookie

## What / Why
Apache BookKeeper storage node that persists ledger entries.

## Visual
```text
Bookie → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie:** Apache BookKeeper storage node that persists ledger entries.


---

<!-- 009_METADATA_STORE.md -->

# Metadata Store

## What / Why
Stores cluster metadata and coordination data using ZooKeeper, etcd or other supported implementations.

## Visual
```text
Metadata Store → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Metadata Store:** Stores cluster metadata and coordination data using ZooKeeper, etcd or other supported implementations.


---

<!-- 00_MASTER_INDEX.md -->

# Apache Pulsar — Dedicated Deep-Dive Cheat Sheet Pack

**Current feature baseline:** Apache Pulsar 4.2.4 (August 3, 2026).
**Long-term production support baseline:** Apache Pulsar 4.0.13 LTS (August 3, 2026; security support through October 21, 2027).
**Preview only:** Pulsar 5.0.0-M1 is not production GA.

**Scope:** brokers, BookKeeper, metadata stores, tenants/namespaces, partitions, producers, subscriptions, acknowledgements, retry/DLQ, transactions, schema, Functions, IO, tiered storage, geo replication, security, operations, performance and system design.

## Fast Revision
- `01_30_SECOND_RECALL.md`
- `02_CURRENT_BASELINE.md`
- `03_REFERENCE_ARCHITECTURE.md`
- `04_SUBSCRIPTION_DECISION_TREE.md`

## Foundations & Mental Model

- Pulsar Mental Model — `005_PULSAR_MENTAL_MODEL.md`
- Messaging vs Streaming — `006_MESSAGING_VS_STREAMING.md`
- Broker — `007_BROKER.md`
- Bookie — `008_BOOKIE.md`
- Metadata Store — `009_METADATA_STORE.md`
- Pulsar Instance — `010_PULSAR_INSTANCE.md`
- Pulsar Cluster — `011_PULSAR_CLUSTER.md`
- Tenant — `012_TENANT.md`
- Namespace — `013_NAMESPACE.md`
- Topic — `014_TOPIC.md`
- Persistent Topic — `015_PERSISTENT_TOPIC.md`
- Non Persistent Topic — `016_NON_PERSISTENT_TOPIC.md`
- Partitioned Topic — `017_PARTITIONED_TOPIC.md`
- Non Partitioned Topic — `018_NON_PARTITIONED_TOPIC.md`
- Message — `019_MESSAGE.md`
- Producer — `020_PRODUCER.md`
- Consumer — `021_CONSUMER.md`
- Reader — `022_READER.md`
- Subscription — `023_SUBSCRIPTION.md`
- Cursor — `024_CURSOR.md`
- Real Life Analogy — `025_REAL_LIFE_ANALOGY.md`

## Topic Naming & Multi-Tenancy

- Topic URI — `026_TOPIC_URI.md`
- Tenant Administration — `027_TENANT_ADMINISTRATION.md`
- Namespace Policies — `028_NAMESPACE_POLICIES.md`
- Topic Level Policies — `029_TOPIC_LEVEL_POLICIES.md`
- Allowed Clusters — `030_ALLOWED_CLUSTERS.md`
- Namespace Bundle — `031_NAMESPACE_BUNDLE.md`
- Bundle Splitting — `032_BUNDLE_SPLITTING.md`
- Bundle Unload — `033_BUNDLE_UNLOAD.md`
- Multi Tenant Isolation — `034_MULTI_TENANT_ISOLATION.md`
- Namespace Isolation — `035_NAMESPACE_ISOLATION.md`
- Bookie Affinity — `036_BOOKIE_AFFINITY.md`
- Resource Quotas — `037_RESOURCE_QUOTAS.md`
- Topic Auto Creation — `038_TOPIC_AUTO_CREATION.md`
- Partitioned Topic Metadata — `039_PARTITIONED_TOPIC_METADATA.md`
- Naming Governance — `040_NAMING_GOVERNANCE.md`

## Broker Architecture

- Stateless Broker Design — `041_STATELESS_BROKER_DESIGN.md`
- Topic Ownership — `042_TOPIC_OWNERSHIP.md`
- Lookup Service — `043_LOOKUP_SERVICE.md`
- Broker Redirect — `044_BROKER_REDIRECT.md`
- Managed Ledger Cache — `045_MANAGED_LEDGER_CACHE.md`
- Backlog Cache Miss — `046_BACKLOG_CACHE_MISS.md`
- Namespace Ownership — `047_NAMESPACE_OWNERSHIP.md`
- Load Manager — `048_LOAD_MANAGER.md`
- Broker Failure — `049_BROKER_FAILURE.md`
- Broker Scaling — `050_BROKER_SCALING.md`
- Advertised Listeners — `051_ADVERTISED_LISTENERS.md`
- Proxy — `052_PROXY.md`
- SNI Routing — `053_SNI_ROUTING.md`
- HTTP Admin Endpoint — `054_HTTP_ADMIN_ENDPOINT.md`
- Binary Protocol Endpoint — `055_BINARY_PROTOCOL_ENDPOINT.md`

## BookKeeper & Managed Ledger

- BookKeeper Mental Model — `056_BOOKKEEPER_MENTAL_MODEL.md`
- Managed Ledger — `057_MANAGED_LEDGER.md`
- Ledger — `058_LEDGER.md`
- Entry — `059_ENTRY.md`
- Ledger Rollover — `060_LEDGER_ROLLOVER.md`
- Ensemble — `061_ENSEMBLE.md`
- Write Quorum — `062_WRITE_QUORUM.md`
- Ack Quorum — `063_ACK_QUORUM.md`
- Ensemble Size — `064_ENSEMBLE_SIZE.md`
- Bookie Journal — `065_BOOKIE_JOURNAL.md`
- Ledger Storage — `066_LEDGER_STORAGE.md`
- BookKeeper Replication — `067_BOOKKEEPER_REPLICATION.md`
- Bookie Failure — `068_BOOKIE_FAILURE.md`
- Ledger Recovery — `069_LEDGER_RECOVERY.md`
- Fencing — `070_FENCING.md`
- Auto Recovery — `071_AUTO_RECOVERY.md`
- Bookie Scaling — `072_BOOKIE_SCALING.md`
- Storage Separation Advantage — `073_STORAGE_SEPARATION_ADVANTAGE.md`
- Storage Separation Tradeoff — `074_STORAGE_SEPARATION_TRADEOFF.md`

## Metadata Store

- Metadata Store Role — `075_METADATA_STORE_ROLE.md`
- ZooKeeper Metadata — `076_ZOOKEEPER_METADATA.md`
- etcd Metadata — `077_ETCD_METADATA.md`
- Oxia Direction — `078_OXIA_DIRECTION.md`
- Metadata Availability — `079_METADATA_AVAILABILITY.md`
- Configuration Store — `080_CONFIGURATION_STORE.md`
- Local vs Shared Configuration Store — `081_LOCAL_VS_SHARED_CONFIGURATION_STORE.md`
- Metadata Failure Domain — `082_METADATA_FAILURE_DOMAIN.md`
- Metadata Backup — `083_METADATA_BACKUP.md`
- Metadata Migration — `084_METADATA_MIGRATION.md`

## Partitioning

- Partitioning Mental Model — `085_PARTITIONING_MENTAL_MODEL.md`
- Partition Count — `086_PARTITION_COUNT.md`
- Partition Routing — `087_PARTITION_ROUTING.md`
- Round Robin Routing — `088_ROUND_ROBIN_ROUTING.md`
- Single Partition Routing — `089_SINGLE_PARTITION_ROUTING.md`
- Custom Router — `090_CUSTOM_ROUTER.md`
- Key Based Routing — `091_KEY_BASED_ROUTING.md`
- Ordering by Key — `092_ORDERING_BY_KEY.md`
- Increasing Partitions — `093_INCREASING_PARTITIONS.md`
- Partitioned Subscription — `094_PARTITIONED_SUBSCRIPTION.md`
- Partition Discovery — `095_PARTITION_DISCOVERY.md`
- Hot Partition — `096_HOT_PARTITION.md`
- Partition Sizing — `097_PARTITION_SIZING.md`

## Producer Deep Dive

- Producer Architecture — `098_PRODUCER_ARCHITECTURE.md`
- Producer Creation — `099_PRODUCER_CREATION.md`
- Producer Name — `100_PRODUCER_NAME.md`
- Send Sync — `101_SEND_SYNC.md`
- Send Async — `102_SEND_ASYNC.md`
- Batching — `103_BATCHING.md`
- Batching Max Messages — `104_BATCHING_MAX_MESSAGES.md`
- Batching Max Bytes — `105_BATCHING_MAX_BYTES.md`
- Batching Delay — `106_BATCHING_DELAY.md`
- Key Based Batching — `107_KEY_BASED_BATCHING.md`
- Compression — `108_COMPRESSION.md`
- Block If Queue Full — `109_BLOCK_IF_QUEUE_FULL.md`
- Pending Messages — `110_PENDING_MESSAGES.md`
- Send Timeout — `111_SEND_TIMEOUT.md`
- Producer Access Mode — `112_PRODUCER_ACCESS_MODE.md`
- Exclusive Producer — `113_EXCLUSIVE_PRODUCER.md`
- Sequence ID — `114_SEQUENCE_ID.md`
- Producer Deduplication — `115_PRODUCER_DEDUPLICATION.md`
- Deduplication Snapshot — `116_DEDUPLICATION_SNAPSHOT.md`
- Chunking — `117_CHUNKING.md`
- Message Key — `118_MESSAGE_KEY.md`
- Properties — `119_PROPERTIES.md`
- Event Time — `120_EVENT_TIME.md`
- Deliver At — `121_DELIVER_AT.md`
- Deliver After — `122_DELIVER_AFTER.md`
- Producer Interceptor — `123_PRODUCER_INTERCEPTOR.md`
- Producer Encryption — `124_PRODUCER_ENCRYPTION.md`

## Subscriptions

- Subscription Mental Model — `125_SUBSCRIPTION_MENTAL_MODEL.md`
- Exclusive Subscription — `126_EXCLUSIVE_SUBSCRIPTION.md`
- Failover Subscription — `127_FAILOVER_SUBSCRIPTION.md`
- Shared Subscription — `128_SHARED_SUBSCRIPTION.md`
- Key Shared Subscription — `129_KEY_SHARED_SUBSCRIPTION.md`
- Exclusive Use Case — `130_EXCLUSIVE_USE_CASE.md`
- Failover Use Case — `131_FAILOVER_USE_CASE.md`
- Shared Use Case — `132_SHARED_USE_CASE.md`
- Key Shared Use Case — `133_KEY_SHARED_USE_CASE.md`
- Key Shared Batching Rule — `134_KEY_SHARED_BATCHING_RULE.md`
- Subscription Name — `135_SUBSCRIPTION_NAME.md`
- Subscription Initial Position — `136_SUBSCRIPTION_INITIAL_POSITION.md`
- Durable Subscription — `137_DURABLE_SUBSCRIPTION.md`
- Non Durable Subscription — `138_NON_DURABLE_SUBSCRIPTION.md`
- Replicated Subscription — `139_REPLICATED_SUBSCRIPTION.md`
- Subscription Expiration — `140_SUBSCRIPTION_EXPIRATION.md`
- Subscription Type Change — `141_SUBSCRIPTION_TYPE_CHANGE.md`
- Subscription Backlog — `142_SUBSCRIPTION_BACKLOG.md`
- Subscription Cursor — `143_SUBSCRIPTION_CURSOR.md`

## Acknowledgement & Redelivery

- Individual Ack — `144_INDIVIDUAL_ACK.md`
- Cumulative Ack — `145_CUMULATIVE_ACK.md`
- Ack Restrictions — `146_ACK_RESTRICTIONS.md`
- Async Ack — `147_ASYNC_ACK.md`
- Negative Ack — `148_NEGATIVE_ACK.md`
- Negative Ack Delay — `149_NEGATIVE_ACK_DELAY.md`
- Ack Timeout — `150_ACK_TIMEOUT.md`
- Ack Timeout Redelivery Backoff — `151_ACK_TIMEOUT_REDELIVERY_BACKOFF.md`
- Negative Ack Backoff — `152_NEGATIVE_ACK_BACKOFF.md`
- Redelivery Count — `153_REDELIVERY_COUNT.md`
- Reconsume Later — `154_RECONSUME_LATER.md`
- Dead Letter Policy — `155_DEAD_LETTER_POLICY.md`
- Max Redeliver Count — `156_MAX_REDELIVER_COUNT.md`
- Retry Letter Topic — `157_RETRY_LETTER_TOPIC.md`
- Dead Letter Topic — `158_DEAD_LETTER_TOPIC.md`
- Retry Idempotency — `159_RETRY_IDEMPOTENCY.md`
- Ack After Side Effect — `160_ACK_AFTER_SIDE_EFFECT.md`
- Ack Grouping — `161_ACK_GROUPING.md`

## Message Retention & Backlog

- Backlog — `162_BACKLOG.md`
- Retention — `163_RETENTION.md`
- Retention Size — `164_RETENTION_SIZE.md`
- Retention Time — `165_RETENTION_TIME.md`
- Backlog Quota — `166_BACKLOG_QUOTA.md`
- Backlog Quota Policies — `167_BACKLOG_QUOTA_POLICIES.md`
- TTL — `168_TTL.md`
- Expiry Check — `169_EXPIRY_CHECK.md`
- Topic Compaction — `170_TOPIC_COMPACTION.md`
- Compaction Threshold — `171_COMPACTION_THRESHOLD.md`
- Compacted Reader — `172_COMPACTED_READER.md`
- Tombstone — `173_TOMBSTONE.md`
- Retention vs Compaction — `174_RETENTION_VS_COMPACTION.md`
- Backlog vs Retention — `175_BACKLOG_VS_RETENTION.md`

## Delayed & Scheduled Delivery

- Delayed Delivery — `176_DELAYED_DELIVERY.md`
- Delayed Delivery Tracker — `177_DELAYED_DELIVERY_TRACKER.md`
- Delayed Delivery Tick — `178_DELAYED_DELIVERY_TICK.md`
- Strict Delivery Delay — `179_STRICT_DELIVERY_DELAY.md`
- Delayed Delivery with Shared — `180_DELAYED_DELIVERY_WITH_SHARED.md`
- Scheduled Message Ordering — `181_SCHEDULED_MESSAGE_ORDERING.md`
- Delayed Retry Pattern — `182_DELAYED_RETRY_PATTERN.md`
- Delay Capacity — `183_DELAY_CAPACITY.md`

## Dead Letter & Retry

- Dead Letter Policy — `184_DEAD_LETTER_POLICY.md`
- Default Dead Letter Topic — `185_DEFAULT_DEAD_LETTER_TOPIC.md`
- Retry Letter Topic — `186_RETRY_LETTER_TOPIC.md`
- Poison Message — `187_POISON_MESSAGE.md`
- Retry Topic Pattern — `188_RETRY_TOPIC_PATTERN.md`
- DLQ Consumer — `189_DLQ_CONSUMER.md`
- Retry Backoff — `190_RETRY_BACKOFF.md`
- Retry Ordering Tradeoff — `191_RETRY_ORDERING_TRADEOFF.md`
- DLQ Governance — `192_DLQ_GOVERNANCE.md`
- DLQ Replay — `193_DLQ_REPLAY.md`

## Readers & Replay

- Reader Mental Model — `194_READER_MENTAL_MODEL.md`
- MessageId — `195_MESSAGEID.md`
- Earliest MessageId — `196_EARLIEST_MESSAGEID.md`
- Latest MessageId — `197_LATEST_MESSAGEID.md`
- Reader Seek — `198_READER_SEEK.md`
- Seek by Timestamp — `199_SEEK_BY_TIMESTAMP.md`
- Reset Cursor — `200_RESET_CURSOR.md`
- Replay — `201_REPLAY.md`
- Replay Safety — `202_REPLAY_SAFETY.md`
- Compacted Replay — `203_COMPACTED_REPLAY.md`
- Reader vs Consumer — `204_READER_VS_CONSUMER.md`

## Transactions

- Transaction Mental Model — `205_TRANSACTION_MENTAL_MODEL.md`
- Transaction Coordinator — `206_TRANSACTION_COORDINATOR.md`
- Transaction Metadata Store — `207_TRANSACTION_METADATA_STORE.md`
- Transaction Buffer — `208_TRANSACTION_BUFFER.md`
- Begin Transaction — `209_BEGIN_TRANSACTION.md`
- Transactional Produce — `210_TRANSACTIONAL_PRODUCE.md`
- Transactional Ack — `211_TRANSACTIONAL_ACK.md`
- Commit Transaction — `212_COMMIT_TRANSACTION.md`
- Abort Transaction — `213_ABORT_TRANSACTION.md`
- Read Committed — `214_READ_COMMITTED.md`
- Cross Topic Transaction — `215_CROSS_TOPIC_TRANSACTION.md`
- Exactly Once Scope — `216_EXACTLY_ONCE_SCOPE.md`
- Transaction Timeout — `217_TRANSACTION_TIMEOUT.md`
- Transaction Recovery — `218_TRANSACTION_RECOVERY.md`
- Transactions vs Idempotency — `219_TRANSACTIONS_VS_IDEMPOTENCY.md`

## Schema Registry

- Schema Registry — `220_SCHEMA_REGISTRY.md`
- Schema Version — `221_SCHEMA_VERSION.md`
- Schema Validation — `222_SCHEMA_VALIDATION.md`
- Primitive Schema — `223_PRIMITIVE_SCHEMA.md`
- String Schema — `224_STRING_SCHEMA.md`
- Bytes Schema — `225_BYTES_SCHEMA.md`
- JSON Schema — `226_JSON_SCHEMA.md`
- Avro Schema — `227_AVRO_SCHEMA.md`
- Protobuf Schema — `228_PROTOBUF_SCHEMA.md`
- Protobuf Native — `229_PROTOBUF_NATIVE.md`
- KeyValue Schema — `230_KEYVALUE_SCHEMA.md`
- Auto Consume — `231_AUTO_CONSUME.md`
- Auto Produce — `232_AUTO_PRODUCE.md`
- Schema Compatibility Strategy — `233_SCHEMA_COMPATIBILITY_STRATEGY.md`
- Backward Compatibility — `234_BACKWARD_COMPATIBILITY.md`
- Forward Compatibility — `235_FORWARD_COMPATIBILITY.md`
- Full Compatibility — `236_FULL_COMPATIBILITY.md`
- Schema Evolution — `237_SCHEMA_EVOLUTION.md`
- Schema Admin — `238_SCHEMA_ADMIN.md`
- Schema Governance — `239_SCHEMA_GOVERNANCE.md`

## Functions

- Pulsar Functions Mental Model — `240_PULSAR_FUNCTIONS_MENTAL_MODEL.md`
- Function Input — `241_FUNCTION_INPUT.md`
- Function Output — `242_FUNCTION_OUTPUT.md`
- Function Runtime — `243_FUNCTION_RUNTIME.md`
- Function Worker — `244_FUNCTION_WORKER.md`
- Function Instance — `245_FUNCTION_INSTANCE.md`
- Function Parallelism — `246_FUNCTION_PARALLELISM.md`
- At Most Once Function — `247_AT_MOST_ONCE_FUNCTION.md`
- At Least Once Function — `248_AT_LEAST_ONCE_FUNCTION.md`
- Effectively Once Function — `249_EFFECTIVELY_ONCE_FUNCTION.md`
- Manual Ack Function — `250_MANUAL_ACK_FUNCTION.md`
- Function State — `251_FUNCTION_STATE.md`
- Context — `252_CONTEXT.md`
- Function Metrics — `253_FUNCTION_METRICS.md`
- Function Secrets — `254_FUNCTION_SECRETS.md`
- Function Package — `255_FUNCTION_PACKAGE.md`
- Function Update — `256_FUNCTION_UPDATE.md`
- Function Processing Guarantee — `257_FUNCTION_PROCESSING_GUARANTEE.md`
- Function vs Streams Engine — `258_FUNCTION_VS_STREAMS_ENGINE.md`

## Pulsar IO

- Pulsar IO Mental Model — `259_PULSAR_IO_MENTAL_MODEL.md`
- Source Connector — `260_SOURCE_CONNECTOR.md`
- Sink Connector — `261_SINK_CONNECTOR.md`
- Connector Runtime — `262_CONNECTOR_RUNTIME.md`
- Connector Parallelism — `263_CONNECTOR_PARALLELISM.md`
- Connector Processing Guarantees — `264_CONNECTOR_PROCESSING_GUARANTEES.md`
- Source Guarantee — `265_SOURCE_GUARANTEE.md`
- Sink Guarantee — `266_SINK_GUARANTEE.md`
- Built In Connectors — `267_BUILT_IN_CONNECTORS.md`
- Custom Connector — `268_CUSTOM_CONNECTOR.md`
- Connector Config — `269_CONNECTOR_CONFIG.md`
- Connector Secrets — `270_CONNECTOR_SECRETS.md`
- Connector Monitoring — `271_CONNECTOR_MONITORING.md`
- Kafka Connect vs Pulsar IO — `272_KAFKA_CONNECT_VS_PULSAR_IO.md`

## Tiered Storage

- Tiered Storage Mental Model — `273_TIERED_STORAGE_MENTAL_MODEL.md`
- Offload Eligibility — `274_OFFLOAD_ELIGIBILITY.md`
- Offloader — `275_OFFLOADER.md`
- S3 Offloader — `276_S3_OFFLOADER.md`
- GCS Offloader — `277_GCS_OFFLOADER.md`
- Azure Offloader — `278_AZURE_OFFLOADER.md`
- Filesystem Offloader — `279_FILESYSTEM_OFFLOADER.md`
- Offload Threshold — `280_OFFLOAD_THRESHOLD.md`
- Manual Offload — `281_MANUAL_OFFLOAD.md`
- Remote Read — `282_REMOTE_READ.md`
- BookKeeper Deletion After Offload — `283_BOOKKEEPER_DELETION_AFTER_OFFLOAD.md`
- Tiered Storage Economics — `284_TIERED_STORAGE_ECONOMICS.md`
- Tiered Storage Latency — `285_TIERED_STORAGE_LATENCY.md`
- Offloader Distribution — `286_OFFLOADER_DISTRIBUTION.md`
- Incomplete Multipart Upload — `287_INCOMPLETE_MULTIPART_UPLOAD.md`
- Tiered Storage Monitoring — `288_TIERED_STORAGE_MONITORING.md`

## Geo Replication

- Geo Replication Mental Model — `289_GEO_REPLICATION_MENTAL_MODEL.md`
- Local First Persistence — `290_LOCAL_FIRST_PERSISTENCE.md`
- Replicator — `291_REPLICATOR.md`
- Namespace Replication Clusters — `292_NAMESPACE_REPLICATION_CLUSTERS.md`
- Tenant Allowed Clusters — `293_TENANT_ALLOWED_CLUSTERS.md`
- Global Topic — `294_GLOBAL_TOPIC.md`
- Geo Replication Async — `295_GEO_REPLICATION_ASYNC.md`
- Replication Backlog — `296_REPLICATION_BACKLOG.md`
- Replication Latency — `297_REPLICATION_LATENCY.md`
- Subscription Locality — `298_SUBSCRIPTION_LOCALITY.md`
- Replicated Subscriptions — `299_REPLICATED_SUBSCRIPTIONS.md`
- Conflict Semantics — `300_CONFLICT_SEMANTICS.md`
- Geo Replication Loops — `301_GEO_REPLICATION_LOOPS.md`
- Independent Config Stores — `302_INDEPENDENT_CONFIG_STORES.md`
- Shared Config Store — `303_SHARED_CONFIG_STORE.md`
- Geo Failover — `304_GEO_FAILOVER.md`
- RPO — `305_RPO.md`
- RTO — `306_RTO.md`
- DR Testing — `307_DR_TESTING.md`

## Cluster-Level Failover

- Client Cluster Failover — `308_CLIENT_CLUSTER_FAILOVER.md`
- Auto Cluster Failover — `309_AUTO_CLUSTER_FAILOVER.md`
- Controlled Failover — `310_CONTROLLED_FAILOVER.md`
- Failback — `311_FAILBACK.md`
- Failover vs Geo Replication — `312_FAILOVER_VS_GEO_REPLICATION.md`
- Failover Data Readiness — `313_FAILOVER_DATA_READINESS.md`

## Compaction

- Topic Compaction Mental Model — `314_TOPIC_COMPACTION_MENTAL_MODEL.md`
- Compactor — `315_COMPACTOR.md`
- Compacted Ledger — `316_COMPACTED_LEDGER.md`
- Compaction Threshold — `317_COMPACTION_THRESHOLD.md`
- Compacted Reader — `318_COMPACTED_READER.md`
- Tombstones — `319_TOMBSTONES.md`
- Compaction vs Retention — `320_COMPACTION_VS_RETENTION.md`
- Compaction Use Cases — `321_COMPACTION_USE_CASES.md`

## Security

- Pulsar Security Model — `322_PULSAR_SECURITY_MODEL.md`
- TLS — `323_TLS.md`
- mTLS — `324_MTLS.md`
- Token Authentication — `325_TOKEN_AUTHENTICATION.md`
- OAuth2 — `326_OAUTH2.md`
- Kerberos — `327_KERBEROS.md`
- Authentication Provider — `328_AUTHENTICATION_PROVIDER.md`
- Role — `329_ROLE.md`
- Superuser Role — `330_SUPERUSER_ROLE.md`
- Tenant Admin Role — `331_TENANT_ADMIN_ROLE.md`
- Namespace Permission — `332_NAMESPACE_PERMISSION.md`
- Topic Permission — `333_TOPIC_PERMISSION.md`
- Proxy Authorization — `334_PROXY_AUTHORIZATION.md`
- Authorization Caching — `335_AUTHORIZATION_CACHING.md`
- Secrets Management — `336_SECRETS_MANAGEMENT.md`
- Client Side Encryption — `337_CLIENT_SIDE_ENCRYPTION.md`
- Key Reader — `338_KEY_READER.md`
- Network Isolation — `339_NETWORK_ISOLATION.md`
- Least Privilege — `340_LEAST_PRIVILEGE.md`

## Throttling & Backpressure

- Dispatch Rate — `341_DISPATCH_RATE.md`
- Publish Rate — `342_PUBLISH_RATE.md`
- Subscribe Rate — `343_SUBSCRIBE_RATE.md`
- Replicator Rate — `344_REPLICATOR_RATE.md`
- Resource Groups — `345_RESOURCE_GROUPS.md`
- Backlog Quota — `346_BACKLOG_QUOTA.md`
- Producer Pending Queue — `347_PRODUCER_PENDING_QUEUE.md`
- Broker Backpressure — `348_BROKER_BACKPRESSURE.md`
- BookKeeper Saturation — `349_BOOKKEEPER_SATURATION.md`
- Slow Consumer — `350_SLOW_CONSUMER.md`
- Throttling Governance — `351_THROTTLING_GOVERNANCE.md`

## Load Balancing & Isolation

- Namespace Bundle Ownership — `352_NAMESPACE_BUNDLE_OWNERSHIP.md`
- Dynamic Load Balancing — `353_DYNAMIC_LOAD_BALANCING.md`
- Bundle Split — `354_BUNDLE_SPLIT.md`
- Unload — `355_UNLOAD.md`
- Broker Isolation Policy — `356_BROKER_ISOLATION_POLICY.md`
- Bookie Isolation — `357_BOOKIE_ISOLATION.md`
- Noisy Neighbor — `358_NOISY_NEIGHBOR.md`
- Million Topic Design — `359_MILLION_TOPIC_DESIGN.md`
- Topic Density — `360_TOPIC_DENSITY.md`

## Observability

- Pulsar Observability Model — `361_PULSAR_OBSERVABILITY_MODEL.md`
- Broker Metrics — `362_BROKER_METRICS.md`
- BookKeeper Metrics — `363_BOOKKEEPER_METRICS.md`
- Metadata Store Metrics — `364_METADATA_STORE_METRICS.md`
- Publish Latency — `365_PUBLISH_LATENCY.md`
- Dispatch Latency — `366_DISPATCH_LATENCY.md`
- Backlog Size — `367_BACKLOG_SIZE.md`
- Backlog Age — `368_BACKLOG_AGE.md`
- Consumer Rate — `369_CONSUMER_RATE.md`
- Redelivery Rate — `370_REDELIVERY_RATE.md`
- Unacked Messages — `371_UNACKED_MESSAGES.md`
- Subscription Count — `372_SUBSCRIPTION_COUNT.md`
- Producer Count — `373_PRODUCER_COUNT.md`
- Consumer Count — `374_CONSUMER_COUNT.md`
- Storage Size — `375_STORAGE_SIZE.md`
- Offload Metrics — `376_OFFLOAD_METRICS.md`
- Replication Metrics — `377_REPLICATION_METRICS.md`
- Function Metrics — `378_FUNCTION_METRICS.md`
- IO Metrics — `379_IO_METRICS.md`
- Prometheus — `380_PROMETHEUS.md`
- Grafana — `381_GRAFANA.md`
- Tracing — `382_TRACING.md`
- Business Event SLO — `383_BUSINESS_EVENT_SLO.md`

## Operations & Administration

- pulsar-admin — `384_PULSAR_ADMIN.md`
- REST Admin API — `385_REST_ADMIN_API.md`
- Java Admin API — `386_JAVA_ADMIN_API.md`
- Tenant Create — `387_TENANT_CREATE.md`
- Namespace Create — `388_NAMESPACE_CREATE.md`
- Topic Create — `389_TOPIC_CREATE.md`
- Partitioned Topic Create — `390_PARTITIONED_TOPIC_CREATE.md`
- Partition Update — `391_PARTITION_UPDATE.md`
- Topic Stats — `392_TOPIC_STATS.md`
- Internal Stats — `393_INTERNAL_STATS.md`
- Unload — `394_UNLOAD.md`
- Delete Topic — `395_DELETE_TOPIC.md`
- Delete Subscription — `396_DELETE_SUBSCRIPTION.md`
- Reset Cursor — `397_RESET_CURSOR.md`
- Skip Messages — `398_SKIP_MESSAGES.md`
- Expire Messages — `399_EXPIRE_MESSAGES.md`
- Peek Messages — `400_PEEK_MESSAGES.md`
- Schema Commands — `401_SCHEMA_COMMANDS.md`
- Namespace Retention — `402_NAMESPACE_RETENTION.md`
- Backlog Quota Admin — `403_BACKLOG_QUOTA_ADMIN.md`
- Offload Admin — `404_OFFLOAD_ADMIN.md`
- Bookie Admin — `405_BOOKIE_ADMIN.md`
- Rolling Broker Restart — `406_ROLLING_BROKER_RESTART.md`
- Bookie Maintenance — `407_BOOKIE_MAINTENANCE.md`
- Rolling Upgrade — `408_ROLLING_UPGRADE.md`
- Configuration as Code — `409_CONFIGURATION_AS_CODE.md`

## Performance & Capacity

- Capacity Mental Model — `410_CAPACITY_MENTAL_MODEL.md`
- Broker Throughput — `411_BROKER_THROUGHPUT.md`
- Bookie Throughput — `412_BOOKIE_THROUGHPUT.md`
- Storage Math — `413_STORAGE_MATH.md`
- Publish Fanout — `414_PUBLISH_FANOUT.md`
- Partition Throughput — `415_PARTITION_THROUGHPUT.md`
- Topic Count — `416_TOPIC_COUNT.md`
- Message Size — `417_MESSAGE_SIZE.md`
- Batching — `418_BATCHING.md`
- Compression — `419_COMPRESSION.md`
- Receiver Queue Size — `420_RECEIVER_QUEUE_SIZE.md`
- Consumer Parallelism — `421_CONSUMER_PARALLELISM.md`
- Shared Parallelism — `422_SHARED_PARALLELISM.md`
- Key Shared Parallelism — `423_KEY_SHARED_PARALLELISM.md`
- Broker Cache — `424_BROKER_CACHE.md`
- Backlog Reads — `425_BACKLOG_READS.md`
- Quorum Tuning — `426_QUORUM_TUNING.md`
- Journal Placement — `427_JOURNAL_PLACEMENT.md`
- Ledger Disk Capacity — `428_LEDGER_DISK_CAPACITY.md`
- Recovery Headroom — `429_RECOVERY_HEADROOM.md`
- Benchmarking — `430_BENCHMARKING.md`
- pulsar-perf — `431_PULSAR_PERF.md`

## Microservices & EDA Patterns

- Pulsar in Microservices — `432_PULSAR_IN_MICROSERVICES.md`
- Command Topic — `433_COMMAND_TOPIC.md`
- Domain Event — `434_DOMAIN_EVENT.md`
- Integration Event — `435_INTEGRATION_EVENT.md`
- Pub Sub — `436_PUB_SUB.md`
- Work Queue — `437_WORK_QUEUE.md`
- Ordered Work Queue — `438_ORDERED_WORK_QUEUE.md`
- Active Standby — `439_ACTIVE_STANDBY.md`
- Transactional Outbox — `440_TRANSACTIONAL_OUTBOX.md`
- Inbox Pattern — `441_INBOX_PATTERN.md`
- Idempotent Consumer — `442_IDEMPOTENT_CONSUMER.md`
- Saga Choreography — `443_SAGA_CHOREOGRAPHY.md`
- Saga Orchestration — `444_SAGA_ORCHESTRATION.md`
- CQRS — `445_CQRS.md`
- CDC — `446_CDC.md`
- Materialized View — `447_MATERIALIZED_VIEW.md`
- Retry DLQ — `448_RETRY_DLQ.md`
- Claim Check — `449_CLAIM_CHECK.md`
- Correlation ID — `450_CORRELATION_ID.md`
- Trace Context — `451_TRACE_CONTEXT.md`
- Replay Safety — `452_REPLAY_SAFETY.md`

## Kafka Compatibility & Interop

- Kafka on Pulsar Concept — `453_KAFKA_ON_PULSAR_CONCEPT.md`
- Protocol Compatibility Tradeoff — `454_PROTOCOL_COMPATIBILITY_TRADEOFF.md`
- Migration Strategy — `455_MIGRATION_STRATEGY.md`
- Schema Translation — `456_SCHEMA_TRANSLATION.md`
- Offset vs MessageId — `457_OFFSET_VS_MESSAGEID.md`
- Consumer Group vs Subscription — `458_CONSUMER_GROUP_VS_SUBSCRIPTION.md`
- Partition vs Managed Ledger — `459_PARTITION_VS_MANAGED_LEDGER.md`

## Troubleshooting

- Producer Send Timeout — `460_PRODUCER_SEND_TIMEOUT.md`
- Topic Lookup Failure — `461_TOPIC_LOOKUP_FAILURE.md`
- Bookie Write Failure — `462_BOOKIE_WRITE_FAILURE.md`
- Ledger Under Replicated — `463_LEDGER_UNDER_REPLICATED.md`
- Broker Ownership Churn — `464_BROKER_OWNERSHIP_CHURN.md`
- Subscription Backlog Growing — `465_SUBSCRIPTION_BACKLOG_GROWING.md`
- Unacked Growing — `466_UNACKED_GROWING.md`
- Redelivery Storm — `467_REDELIVERY_STORM.md`
- DLQ Growth — `468_DLQ_GROWTH.md`
- Key Shared Disorder — `469_KEY_SHARED_DISORDER.md`
- Duplicate Delivery — `470_DUPLICATE_DELIVERY.md`
- Missing Messages — `471_MISSING_MESSAGES.md`
- Cursor Reset Mistake — `472_CURSOR_RESET_MISTAKE.md`
- Schema Rejection — `473_SCHEMA_REJECTION.md`
- Tiered Read Slow — `474_TIERED_READ_SLOW.md`
- Geo Replication Lag — `475_GEO_REPLICATION_LAG.md`
- Metadata Store Failure — `476_METADATA_STORE_FAILURE.md`
- BookKeeper Disk Full — `477_BOOKKEEPER_DISK_FULL.md`
- Broker Memory Pressure — `478_BROKER_MEMORY_PRESSURE.md`
- Function Failure — `479_FUNCTION_FAILURE.md`
- Connector Failure — `480_CONNECTOR_FAILURE.md`
- Transaction Timeout — `481_TRANSACTION_TIMEOUT.md`
- Golden Troubleshooting Flow — `482_GOLDEN_TROUBLESHOOTING_FLOW.md`

## System Design & Interviews

- Design Pulsar Cluster — `483_DESIGN_PULSAR_CLUSTER.md`
- Design Multi Tenant Platform — `484_DESIGN_MULTI_TENANT_PLATFORM.md`
- Design Work Queue — `485_DESIGN_WORK_QUEUE.md`
- Design Ordered Work Queue — `486_DESIGN_ORDERED_WORK_QUEUE.md`
- Design HA Consumer — `487_DESIGN_HA_CONSUMER.md`
- Design Event Streaming — `488_DESIGN_EVENT_STREAMING.md`
- Design Geo Replicated Platform — `489_DESIGN_GEO_REPLICATED_PLATFORM.md`
- Design Long Retention — `490_DESIGN_LONG_RETENTION.md`
- Design CDC Pipeline — `491_DESIGN_CDC_PIPELINE.md`
- Design Serverless Processing — `492_DESIGN_SERVERLESS_PROCESSING.md`
- Pulsar vs Kafka — `493_PULSAR_VS_KAFKA.md`
- Pulsar vs RabbitMQ — `494_PULSAR_VS_RABBITMQ.md`
- Pulsar vs JMS — `495_PULSAR_VS_JMS.md`
- Pulsar vs Kinesis — `496_PULSAR_VS_KINESIS.md`
- Pulsar vs Event Hubs — `497_PULSAR_VS_EVENT_HUBS.md`
- Subscription Types Interview — `498_SUBSCRIPTION_TYPES_INTERVIEW.md`
- BookKeeper Interview — `499_BOOKKEEPER_INTERVIEW.md`
- Broker Statelessness Interview — `500_BROKER_STATELESSNESS_INTERVIEW.md`
- Geo Replication Interview — `501_GEO_REPLICATION_INTERVIEW.md`
- Tiered Storage Interview — `502_TIERED_STORAGE_INTERVIEW.md`
- Transactions Interview — `503_TRANSACTIONS_INTERVIEW.md`
- When Not to Use Pulsar — `504_WHEN_NOT_TO_USE_PULSAR.md`
- Pulsar Anti Patterns — `505_PULSAR_ANTI_PATTERNS.md`
- Pulsar Interview Traps — `506_PULSAR_INTERVIEW_TRAPS.md`


---

<!-- 010_PULSAR_INSTANCE.md -->

# Pulsar Instance

## What / Why
One or more Pulsar clusters that may geo-replicate.

## Visual
```text
Pulsar Instance → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Instance:** One or more Pulsar clusters that may geo-replicate.


---

<!-- 011_PULSAR_CLUSTER.md -->

# Pulsar Cluster

## What / Why
Brokers + BookKeeper bookies + metadata store.

## Visual
```text
Pulsar Cluster → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Cluster:** Brokers + BookKeeper bookies + metadata store.


---

<!-- 012_TENANT.md -->

# Tenant

## What / Why
Top-level multi-tenancy administrative boundary.

## Visual
```text
Tenant → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tenant:** Top-level multi-tenancy administrative boundary.


---

<!-- 013_NAMESPACE.md -->

# Namespace

## What / Why
Grouping of topics and unit for policies such as retention, replication and permissions.

## Visual
```text
Namespace → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace:** Grouping of topics and unit for policies such as retention, replication and permissions.


---

<!-- 014_TOPIC.md -->

# Topic

## What / Why
Named stream of messages.

## Visual
```text
Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic:** Named stream of messages.


---

<!-- 015_PERSISTENT_TOPIC.md -->

# Persistent Topic

## What / Why
Topic whose data is persisted in BookKeeper.

## Visual
```text
Persistent Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Persistent Topic:** Topic whose data is persisted in BookKeeper.


---

<!-- 016_NON_PERSISTENT_TOPIC.md -->

# Non Persistent Topic

## What / Why
Topic that avoids durable BookKeeper persistence and trades durability for lower overhead.

## Visual
```text
Non Persistent Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Non Persistent Topic:** Topic that avoids durable BookKeeper persistence and trades durability for lower overhead.


---

<!-- 017_PARTITIONED_TOPIC.md -->

# Partitioned Topic

## What / Why
Logical topic split across partitions for parallelism.

## Visual
```text
Partitioned Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partitioned Topic:** Logical topic split across partitions for parallelism.


---

<!-- 018_NON_PARTITIONED_TOPIC.md -->

# Non Partitioned Topic

## What / Why
Single topic served as one logical partition.

## Visual
```text
Non Partitioned Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Non Partitioned Topic:** Single topic served as one logical partition.


---

<!-- 019_MESSAGE.md -->

# Message

## What / Why
Payload plus properties, key, event time, sequence and metadata.

## Visual
```text
Message → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Message:** Payload plus properties, key, event time, sequence and metadata.


---

<!-- 01_30_SECOND_RECALL.md -->

# Apache Pulsar — 30-Second Recall

```text
Producer
   ↓
Broker (stateless serving layer)
   ↓
Managed Ledger
   ↓
Apache BookKeeper Bookies
   ↓
Subscription Cursor
   ↓
Consumer
```

## Platform Hierarchy
```text
Instance
 → Cluster
   → Tenant
     → Namespace
       → Topic
         → Partition(s)
```

## Subscription Types
```text
Exclusive  → one consumer
Failover   → active + standby
Shared     → parallel workers, no order guarantee
Key_Shared → parallel workers + per-key affinity/order
```

## Architecture Formula
```text
Stateless Brokers
+ BookKeeper Durable Storage
+ Metadata Store
+ Native Multi-Tenancy
+ Subscription Cursors
+ Geo Replication
```


---

<!-- 020_PRODUCER.md -->

# Producer

## What / Why
Client publishing messages.

## Visual
```text
Producer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer:** Client publishing messages.


---

<!-- 021_CONSUMER.md -->

# Consumer

## What / Why
Client attached to a subscription.

## Visual
```text
Consumer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Consumer:** Client attached to a subscription.


---

<!-- 022_READER.md -->

# Reader

## What / Why
Cursor-style client reading topic data without normal subscription semantics.

## Visual
```text
Reader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Reader:** Cursor-style client reading topic data without normal subscription semantics.


---

<!-- 023_SUBSCRIPTION.md -->

# Subscription

## What / Why
Persistent cursor and dispatch mode controlling how consumers receive topic data.

## Visual
```text
Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription:** Persistent cursor and dispatch mode controlling how consumers receive topic data.


---

<!-- 024_CURSOR.md -->

# Cursor

## What / Why
Subscription position in retained topic data.

## Visual
```text
Cursor → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Cursor:** Subscription position in retained topic data.


---

<!-- 025_REAL_LIFE_ANALOGY.md -->

# Real Life Analogy

## What / Why
Brokers are reception desks; BookKeeper is the warehouse; subscriptions are independent bookmarks into stored event history.

## Visual
```text
Real Life Analogy → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Real Life Analogy:** Brokers are reception desks; BookKeeper is the warehouse; subscriptions are independent bookmarks into stored event history.


---

<!-- 026_TOPIC_URI.md -->

# Topic URI

## What / Why
Persistent topic names follow `persistent://tenant/namespace/topic`.

## Visual
```text
Topic URI → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic URI:** Persistent topic names follow `persistent://tenant/namespace/topic`.


---

<!-- 027_TENANT_ADMINISTRATION.md -->

# Tenant Administration

## What / Why
Tenant defines admin roles and allowed clusters.

## Visual
```text
Tenant Administration → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tenant Administration:** Tenant defines admin roles and allowed clusters.


---

<!-- 028_NAMESPACE_POLICIES.md -->

# Namespace Policies

## What / Why
Policies applied at namespace level affect contained topics.

## Visual
```text
Namespace Policies → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Policies:** Policies applied at namespace level affect contained topics.


---

<!-- 029_TOPIC_LEVEL_POLICIES.md -->

# Topic Level Policies

## What / Why
Selected policies can override namespace behavior at topic level.

## Visual
```text
Topic Level Policies → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Level Policies:** Selected policies can override namespace behavior at topic level.


---

<!-- 02_CURRENT_BASELINE.md -->

# Apache Pulsar — Current Baseline

## Current Stable Feature Line
**Apache Pulsar 4.2.4**, released August 3, 2026.

Important support note:
- Pulsar 4.2 active/security support ends September 24, 2026.

## Current LTS Line
**Apache Pulsar 4.0.13 LTS**, released August 3, 2026.
- Active support ends October 21, 2026.
- Security support ends October 21, 2027.

## Pulsar 5
**5.0.0-M1** is a milestone preview, not intended for production.
Its preview includes major directions such as Scalable Topics and Oxia as the recommended metadata-store direction.

## Production Rule
Use 4.2.4 to understand the newest stable 4.x feature set.
For longer production support horizon, prefer the current 4.0.x LTS unless a 4.2-specific feature is required and the upgrade path is planned.


---

<!-- 030_ALLOWED_CLUSTERS.md -->

# Allowed Clusters

## What / Why
Tenant can restrict clusters in which its namespaces may operate.

## Visual
```text
Allowed Clusters → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Allowed Clusters:** Tenant can restrict clusters in which its namespaces may operate.


---

<!-- 031_NAMESPACE_BUNDLE.md -->

# Namespace Bundle

## What / Why
Hash-range unit used for topic ownership/load balancing.

## Visual
```text
Namespace Bundle → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Bundle:** Hash-range unit used for topic ownership/load balancing.


---

<!-- 032_BUNDLE_SPLITTING.md -->

# Bundle Splitting

## What / Why
Busy namespace bundles can be split to distribute topic ownership.

## Visual
```text
Bundle Splitting → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bundle Splitting:** Busy namespace bundles can be split to distribute topic ownership.


---

<!-- 033_BUNDLE_UNLOAD.md -->

# Bundle Unload

## What / Why
Unload moves topic ownership away from current broker.

## Visual
```text
Bundle Unload → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bundle Unload:** Unload moves topic ownership away from current broker.


---

<!-- 034_MULTI_TENANT_ISOLATION.md -->

# Multi Tenant Isolation

## What / Why
Tenants and namespaces provide administrative/security/capacity separation.

## Visual
```text
Multi Tenant Isolation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Multi Tenant Isolation:** Tenants and namespaces provide administrative/security/capacity separation.


---

<!-- 035_NAMESPACE_ISOLATION.md -->

# Namespace Isolation

## What / Why
Policies constrain which brokers serve particular namespaces.

## Visual
```text
Namespace Isolation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Isolation:** Policies constrain which brokers serve particular namespaces.


---

<!-- 036_BOOKIE_AFFINITY.md -->

# Bookie Affinity

## What / Why
Storage placement policies can isolate namespace data to chosen bookie groups.

## Visual
```text
Bookie Affinity → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Affinity:** Storage placement policies can isolate namespace data to chosen bookie groups.


---

<!-- 037_RESOURCE_QUOTAS.md -->

# Resource Quotas

## What / Why
Capacity policies can influence namespace bundle assignment.

## Visual
```text
Resource Quotas → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Resource Quotas:** Capacity policies can influence namespace bundle assignment.


---

<!-- 038_TOPIC_AUTO_CREATION.md -->

# Topic Auto Creation

## What / Why
Broker can auto-create topics depending on configuration/policies.

## Visual
```text
Topic Auto Creation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Auto Creation:** Broker can auto-create topics depending on configuration/policies.


---

<!-- 039_PARTITIONED_TOPIC_METADATA.md -->

# Partitioned Topic Metadata

## What / Why
Partition count metadata is managed separately from individual partition ownership.

## Visual
```text
Partitioned Topic Metadata → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partitioned Topic Metadata:** Partition count metadata is managed separately from individual partition ownership.


---

<!-- 03_REFERENCE_ARCHITECTURE.md -->

# Pulsar Reference Architecture

```text
Clients
  │
  ▼
Pulsar Brokers  ←── Metadata Store
(stateless)
  │
  ▼
Managed Ledger
  │
  ▼
Apache BookKeeper
 ├─ Bookie A
 ├─ Bookie B
 └─ Bookie C

Administrative hierarchy:
Tenant
  ↓
Namespace
  ↓
Topic / Partition
  ↓
Subscription
  ↓
Consumer(s)
```

## Cross-Cutting
```text
Schemas
Functions
Pulsar IO
Tiered Storage
Geo Replication
Security
Isolation
Throttling
Prometheus/Grafana
Transactions
```


---

<!-- 040_NAMING_GOVERNANCE.md -->

# Naming Governance

## What / Why
Use tenant/namespace/topic to reflect domain, environment, ownership and lifecycle.

## Visual
```text
Naming Governance → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Naming Governance:** Use tenant/namespace/topic to reflect domain, environment, ownership and lifecycle.


---

<!-- 041_STATELESS_BROKER_DESIGN.md -->

# Stateless Broker Design

## What / Why
Brokers do not own durable topic data; persistent storage lives in BookKeeper.

## Visual
```text
Stateless Broker Design → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Stateless Broker Design:** Brokers do not own durable topic data; persistent storage lives in BookKeeper.


---

<!-- 042_TOPIC_OWNERSHIP.md -->

# Topic Ownership

## What / Why
One broker owns serving responsibility for a topic at a time.

## Visual
```text
Topic Ownership → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Ownership:** One broker owns serving responsibility for a topic at a time.


---

<!-- 043_LOOKUP_SERVICE.md -->

# Lookup Service

## What / Why
Clients perform topic lookup to find the broker currently serving a topic.

## Visual
```text
Lookup Service → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Lookup Service:** Clients perform topic lookup to find the broker currently serving a topic.


---

<!-- 044_BROKER_REDIRECT.md -->

# Broker Redirect

## What / Why
Clients may be redirected/proxied to the owner broker.

## Visual
```text
Broker Redirect → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Redirect:** Clients may be redirected/proxied to the owner broker.


---

<!-- 045_MANAGED_LEDGER_CACHE.md -->

# Managed Ledger Cache

## What / Why
Broker caches recent entries for low-latency dispatch.

## Visual
```text
Managed Ledger Cache → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Managed Ledger Cache:** Broker caches recent entries for low-latency dispatch.


---

<!-- 046_BACKLOG_CACHE_MISS.md -->

# Backlog Cache Miss

## What / Why
Old backlog may be read from BookKeeper or tiered storage.

## Visual
```text
Backlog Cache Miss → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog Cache Miss:** Old backlog may be read from BookKeeper or tiered storage.


---

<!-- 047_NAMESPACE_OWNERSHIP.md -->

# Namespace Ownership

## What / Why
Broker owns namespace bundles containing many topics.

## Visual
```text
Namespace Ownership → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Ownership:** Broker owns namespace bundles containing many topics.


---

<!-- 048_LOAD_MANAGER.md -->

# Load Manager

## What / Why
Balances bundle/topic serving load across brokers.

## Visual
```text
Load Manager → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Load Manager:** Balances bundle/topic serving load across brokers.


---

<!-- 049_BROKER_FAILURE.md -->

# Broker Failure

## What / Why
Topics owned by failed broker can be reassigned because durable data remains in BookKeeper.

## Visual
```text
Broker Failure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Failure:** Topics owned by failed broker can be reassigned because durable data remains in BookKeeper.


---

<!-- 04_SUBSCRIPTION_DECISION_TREE.md -->

# Pulsar Subscription Decision Tree

```text
Need exactly one active consumer?
→ Exclusive

Need active-standby failover?
→ Failover

Need maximum worker concurrency and ordering not required?
→ Shared

Need worker concurrency but same key must stay ordered/affine?
→ Key_Shared
   └─ use stable keys and key-based batching / disable incompatible batching
```

## Retry Decision
```text
Transient failure
→ negativeAck / reconsumeLater / retry topic + backoff

Repeated poison message
→ Dead Letter Policy / DLQ

Critical business side effect
→ ack after success + idempotent handler
```


---

<!-- 050_BROKER_SCALING.md -->

# Broker Scaling

## What / Why
Add brokers to increase serving/connection/dispatch capacity independently of storage.

## Visual
```text
Broker Scaling → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Scaling:** Add brokers to increase serving/connection/dispatch capacity independently of storage.


---

<!-- 051_ADVERTISED_LISTENERS.md -->

# Advertised Listeners

## What / Why
Different endpoints can be exposed for networks/clients.

## Visual
```text
Advertised Listeners → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Advertised Listeners:** Different endpoints can be exposed for networks/clients.


---

<!-- 052_PROXY.md -->

# Proxy

## What / Why
Pulsar Proxy can front brokers for network isolation, routing and simplified access.

## Visual
```text
Proxy → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Proxy:** Pulsar Proxy can front brokers for network isolation, routing and simplified access.


---

<!-- 053_SNI_ROUTING.md -->

# SNI Routing

## What / Why
Proxy/listener designs can route TLS connections based on SNI.

## Visual
```text
SNI Routing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **SNI Routing:** Proxy/listener designs can route TLS connections based on SNI.


---

<!-- 054_HTTP_ADMIN_ENDPOINT.md -->

# HTTP Admin Endpoint

## What / Why
Brokers expose REST administration and lookup services.

## Visual
```text
HTTP Admin Endpoint → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **HTTP Admin Endpoint:** Brokers expose REST administration and lookup services.


---

<!-- 055_BINARY_PROTOCOL_ENDPOINT.md -->

# Binary Protocol Endpoint

## What / Why
Pulsar binary protocol serves producer/consumer traffic.

## Visual
```text
Binary Protocol Endpoint → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Binary Protocol Endpoint:** Pulsar binary protocol serves producer/consumer traffic.


---

<!-- 056_BOOKKEEPER_MENTAL_MODEL.md -->

# BookKeeper Mental Model

## What / Why
BookKeeper stores replicated ordered logs called ledgers.

## Visual
```text
BookKeeper Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **BookKeeper Mental Model:** BookKeeper stores replicated ordered logs called ledgers.


---

<!-- 057_MANAGED_LEDGER.md -->

# Managed Ledger

## What / Why
Pulsar topic storage abstraction composed of multiple BookKeeper ledgers.

## Visual
```text
Managed Ledger → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Managed Ledger:** Pulsar topic storage abstraction composed of multiple BookKeeper ledgers.


---

<!-- 058_LEDGER.md -->

# Ledger

## What / Why
Immutable ordered sequence of BookKeeper entries once closed.

## Visual
```text
Ledger → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ledger:** Immutable ordered sequence of BookKeeper entries once closed.


---

<!-- 059_ENTRY.md -->

# Entry

## What / Why
BookKeeper storage unit containing one or more Pulsar messages/batches.

## Visual
```text
Entry → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Entry:** BookKeeper storage unit containing one or more Pulsar messages/batches.


---

<!-- 060_LEDGER_ROLLOVER.md -->

# Ledger Rollover

## What / Why
Managed ledger closes a ledger and creates another based on size/time/entry thresholds.

## Visual
```text
Ledger Rollover → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ledger Rollover:** Managed ledger closes a ledger and creates another based on size/time/entry thresholds.


---

<!-- 061_ENSEMBLE.md -->

# Ensemble

## What / Why
Set of bookies selected to host a ledger.

## Visual
```text
Ensemble → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ensemble:** Set of bookies selected to host a ledger.


---

<!-- 062_WRITE_QUORUM.md -->

# Write Quorum

## What / Why
Number of bookies each entry is written to.

## Visual
```text
Write Quorum → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Write Quorum:** Number of bookies each entry is written to.


---

<!-- 063_ACK_QUORUM.md -->

# Ack Quorum

## What / Why
Number of successful bookie writes required to acknowledge an entry.

## Visual
```text
Ack Quorum → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ack Quorum:** Number of successful bookie writes required to acknowledge an entry.


---

<!-- 064_ENSEMBLE_SIZE.md -->

# Ensemble Size

## What / Why
Total number of bookies participating in ledger placement.

## Visual
```text
Ensemble Size → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ensemble Size:** Total number of bookies participating in ledger placement.


---

<!-- 065_BOOKIE_JOURNAL.md -->

# Bookie Journal

## What / Why
Write-ahead journal used for durable BookKeeper writes.

## Visual
```text
Bookie Journal → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Journal:** Write-ahead journal used for durable BookKeeper writes.


---

<!-- 066_LEDGER_STORAGE.md -->

# Ledger Storage

## What / Why
Bookie storage holding ledger entries/indexes.

## Visual
```text
Ledger Storage → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ledger Storage:** Bookie storage holding ledger entries/indexes.


---

<!-- 067_BOOKKEEPER_REPLICATION.md -->

# BookKeeper Replication

## What / Why
Entries are distributed/redundantly stored across bookies.

## Visual
```text
BookKeeper Replication → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **BookKeeper Replication:** Entries are distributed/redundantly stored across bookies.


---

<!-- 068_BOOKIE_FAILURE.md -->

# Bookie Failure

## What / Why
BookKeeper can continue if quorum conditions remain satisfied.

## Visual
```text
Bookie Failure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Failure:** BookKeeper can continue if quorum conditions remain satisfied.


---

<!-- 069_LEDGER_RECOVERY.md -->

# Ledger Recovery

## What / Why
Open ledgers can be fenced/recovered after writer failure.

## Visual
```text
Ledger Recovery → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ledger Recovery:** Open ledgers can be fenced/recovered after writer failure.


---

<!-- 070_FENCING.md -->

# Fencing

## What / Why
Prevents stale writers from continuing to append to recovered ledger.

## Visual
```text
Fencing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Fencing:** Prevents stale writers from continuing to append to recovered ledger.


---

<!-- 071_AUTO_RECOVERY.md -->

# Auto Recovery

## What / Why
BookKeeper can replicate under-replicated ledgers to healthy bookies.

## Visual
```text
Auto Recovery → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Auto Recovery:** BookKeeper can replicate under-replicated ledgers to healthy bookies.


---

<!-- 072_BOOKIE_SCALING.md -->

# Bookie Scaling

## What / Why
Add bookies to increase storage capacity and throughput independently of brokers.

## Visual
```text
Bookie Scaling → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Scaling:** Add bookies to increase storage capacity and throughput independently of brokers.


---

<!-- 073_STORAGE_SEPARATION_ADVANTAGE.md -->

# Storage Separation Advantage

## What / Why
Compute/broker scaling is decoupled from durable storage scaling.

## Visual
```text
Storage Separation Advantage → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Storage Separation Advantage:** Compute/broker scaling is decoupled from durable storage scaling.


---

<!-- 074_STORAGE_SEPARATION_TRADEOFF.md -->

# Storage Separation Tradeoff

## What / Why
Requires operating brokers, BookKeeper and metadata infrastructure as separate distributed systems.

## Visual
```text
Storage Separation Tradeoff → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Storage Separation Tradeoff:** Requires operating brokers, BookKeeper and metadata infrastructure as separate distributed systems.


---

<!-- 075_METADATA_STORE_ROLE.md -->

# Metadata Store Role

## What / Why
Stores topic ownership, cluster metadata, coordination state and configuration.

## Visual
```text
Metadata Store Role → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Metadata Store Role:** Stores topic ownership, cluster metadata, coordination state and configuration.


---

<!-- 076_ZOOKEEPER_METADATA.md -->

# ZooKeeper Metadata

## What / Why
Traditional Pulsar deployments commonly use ZooKeeper.

## Visual
```text
ZooKeeper Metadata → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **ZooKeeper Metadata:** Traditional Pulsar deployments commonly use ZooKeeper.


---

<!-- 077_ETCD_METADATA.md -->

# etcd Metadata

## What / Why
Modern Pulsar supports etcd as a metadata backend.

## Visual
```text
etcd Metadata → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **etcd Metadata:** Modern Pulsar supports etcd as a metadata backend.


---

<!-- 078_OXIA_DIRECTION.md -->

# Oxia Direction

## What / Why
Pulsar 5.0 preview promotes Oxia as the recommended metadata-store direction, but 5.0 M1 is not production GA.

## Visual
```text
Oxia Direction → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Oxia Direction:** Pulsar 5.0 preview promotes Oxia as the recommended metadata-store direction, but 5.0 M1 is not production GA.


---

<!-- 079_METADATA_AVAILABILITY.md -->

# Metadata Availability

## What / Why
Broker operations depend on metadata-store quorum/availability.

## Visual
```text
Metadata Availability → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Metadata Availability:** Broker operations depend on metadata-store quorum/availability.


---

<!-- 080_CONFIGURATION_STORE.md -->

# Configuration Store

## What / Why
Can hold multi-cluster tenant/namespace/cluster registration metadata.

## Visual
```text
Configuration Store → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Configuration Store:** Can hold multi-cluster tenant/namespace/cluster registration metadata.


---

<!-- 081_LOCAL_VS_SHARED_CONFIGURATION_STORE.md -->

# Local vs Shared Configuration Store

## What / Why
Geo-replicated clusters can use independent or shared configuration-store arrangements.

## Visual
```text
Local vs Shared Configuration Store → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Local vs Shared Configuration Store:** Geo-replicated clusters can use independent or shared configuration-store arrangements.


---

<!-- 082_METADATA_FAILURE_DOMAIN.md -->

# Metadata Failure Domain

## What / Why
Metadata outage affects coordination/ownership even though ledger data remains in BookKeeper.

## Visual
```text
Metadata Failure Domain → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Metadata Failure Domain:** Metadata outage affects coordination/ownership even though ledger data remains in BookKeeper.


---

<!-- 083_METADATA_BACKUP.md -->

# Metadata Backup

## What / Why
Operationally protect metadata separately from message data.

## Visual
```text
Metadata Backup → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Metadata Backup:** Operationally protect metadata separately from message data.


---

<!-- 084_METADATA_MIGRATION.md -->

# Metadata Migration

## What / Why
Changing metadata backend requires documented migration procedures and compatibility checks.

## Visual
```text
Metadata Migration → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Metadata Migration:** Changing metadata backend requires documented migration procedures and compatibility checks.


---

<!-- 085_PARTITIONING_MENTAL_MODEL.md -->

# Partitioning Mental Model

## What / Why
Partitioned topics increase producer/consumer parallelism while each partition remains an independent topic.

## Visual
```text
Partitioning Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partitioning Mental Model:** Partitioned topics increase producer/consumer parallelism while each partition remains an independent topic.


---

<!-- 086_PARTITION_COUNT.md -->

# Partition Count

## What / Why
Controls parallel serving and throughput.

## Visual
```text
Partition Count → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partition Count:** Controls parallel serving and throughput.


---

<!-- 087_PARTITION_ROUTING.md -->

# Partition Routing

## What / Why
Producer selects partition using message key/hash or routing mode.

## Visual
```text
Partition Routing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partition Routing:** Producer selects partition using message key/hash or routing mode.


---

<!-- 088_ROUND_ROBIN_ROUTING.md -->

# Round Robin Routing

## What / Why
Unkeyed messages can be distributed across partitions.

## Visual
```text
Round Robin Routing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Round Robin Routing:** Unkeyed messages can be distributed across partitions.


---

<!-- 089_SINGLE_PARTITION_ROUTING.md -->

# Single Partition Routing

## What / Why
Producer can favor one partition for batching/ordering patterns.

## Visual
```text
Single Partition Routing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Single Partition Routing:** Producer can favor one partition for batching/ordering patterns.


---

<!-- 090_CUSTOM_ROUTER.md -->

# Custom Router

## What / Why
Application can implement custom partition routing.

## Visual
```text
Custom Router → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Custom Router:** Application can implement custom partition routing.


---

<!-- 091_KEY_BASED_ROUTING.md -->

# Key Based Routing

## What / Why
Same key maps consistently to a partition under stable partition count/routing.

## Visual
```text
Key Based Routing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Key Based Routing:** Same key maps consistently to a partition under stable partition count/routing.


---

<!-- 092_ORDERING_BY_KEY.md -->

# Ordering by Key

## What / Why
Key_Shared or partitioning strategies can preserve per-key processing order.

## Visual
```text
Ordering by Key → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ordering by Key:** Key_Shared or partitioning strategies can preserve per-key processing order.


---

<!-- 093_INCREASING_PARTITIONS.md -->

# Increasing Partitions

## What / Why
Partition count can be increased; key mapping may change.

## Visual
```text
Increasing Partitions → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Increasing Partitions:** Partition count can be increased; key mapping may change.


---

<!-- 094_PARTITIONED_SUBSCRIPTION.md -->

# Partitioned Subscription

## What / Why
Subscription logically spans all partitions.

## Visual
```text
Partitioned Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partitioned Subscription:** Subscription logically spans all partitions.


---

<!-- 095_PARTITION_DISCOVERY.md -->

# Partition Discovery

## What / Why
Clients discover partition metadata and create internal producer/consumer connections.

## Visual
```text
Partition Discovery → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partition Discovery:** Clients discover partition metadata and create internal producer/consumer connections.


---

<!-- 096_HOT_PARTITION.md -->

# Hot Partition

## What / Why
Skewed key distribution overloads one partition/broker path.

## Visual
```text
Hot Partition → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Hot Partition:** Skewed key distribution overloads one partition/broker path.


---

<!-- 097_PARTITION_SIZING.md -->

# Partition Sizing

## What / Why
Balance throughput, topic count, client overhead and storage metadata.

## Visual
```text
Partition Sizing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partition Sizing:** Balance throughput, topic count, client overhead and storage metadata.


---

<!-- 098_PRODUCER_ARCHITECTURE.md -->

# Producer Architecture

## What / Why
Producer performs lookup, batching, routing, send, retry and sequence tracking.

## Visual
```text
Producer Architecture → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Architecture:** Producer performs lookup, batching, routing, send, retry and sequence tracking.


---

<!-- 099_PRODUCER_CREATION.md -->

# Producer Creation

## What / Why
Producer binds to a topic and optional producer name/config.

## Visual
```text
Producer Creation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Creation:** Producer binds to a topic and optional producer name/config.


---

<!-- 100_PRODUCER_NAME.md -->

# Producer Name

## What / Why
Logical identity visible in topic stats and sequence semantics.

## Visual
```text
Producer Name → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Name:** Logical identity visible in topic stats and sequence semantics.


---

<!-- 101_SEND_SYNC.md -->

# Send Sync

## What / Why
Blocks until send succeeds/fails.

## Visual
```text
Send Sync → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Send Sync:** Blocks until send succeeds/fails.


---

<!-- 102_SEND_ASYNC.md -->

# Send Async

## What / Why
Returns future/promise while client batches/transmits asynchronously.

## Visual
```text
Send Async → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Send Async:** Returns future/promise while client batches/transmits asynchronously.


---

<!-- 103_BATCHING.md -->

# Batching

## What / Why
Combines multiple messages into one broker entry/request for efficiency.

## Visual
```text
Batching → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Batching:** Combines multiple messages into one broker entry/request for efficiency.


---

<!-- 104_BATCHING_MAX_MESSAGES.md -->

# Batching Max Messages

## What / Why
Limits messages per producer batch.

## Visual
```text
Batching Max Messages → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Batching Max Messages:** Limits messages per producer batch.


---

<!-- 105_BATCHING_MAX_BYTES.md -->

# Batching Max Bytes

## What / Why
Limits batch byte size.

## Visual
```text
Batching Max Bytes → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Batching Max Bytes:** Limits batch byte size.


---

<!-- 106_BATCHING_DELAY.md -->

# Batching Delay

## What / Why
Small wait to improve batching.

## Visual
```text
Batching Delay → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Batching Delay:** Small wait to improve batching.


---

<!-- 107_KEY_BASED_BATCHING.md -->

# Key Based Batching

## What / Why
Keeps messages with the same key together, important for Key_Shared ordering.

## Visual
```text
Key Based Batching → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Key Based Batching:** Keeps messages with the same key together, important for Key_Shared ordering.


---

<!-- 108_COMPRESSION.md -->

# Compression

## What / Why
Supports codecs such as LZ4, ZLIB, ZSTD, SNAPPY depending client/version.

## Visual
```text
Compression → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compression:** Supports codecs such as LZ4, ZLIB, ZSTD, SNAPPY depending client/version.


---

<!-- 109_BLOCK_IF_QUEUE_FULL.md -->

# Block If Queue Full

## What / Why
Producer can block or fail when local pending queue is full.

## Visual
```text
Block If Queue Full → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Block If Queue Full:** Producer can block or fail when local pending queue is full.


---

<!-- 110_PENDING_MESSAGES.md -->

# Pending Messages

## What / Why
Client buffers unsent/unconfirmed messages.

## Visual
```text
Pending Messages → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pending Messages:** Client buffers unsent/unconfirmed messages.


---

<!-- 111_SEND_TIMEOUT.md -->

# Send Timeout

## What / Why
Bounds publish completion waiting.

## Visual
```text
Send Timeout → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Send Timeout:** Bounds publish completion waiting.


---

<!-- 112_PRODUCER_ACCESS_MODE.md -->

# Producer Access Mode

## What / Why
Modes such as Shared/Exclusive/WaitForExclusive can control producer exclusivity.

## Visual
```text
Producer Access Mode → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Access Mode:** Modes such as Shared/Exclusive/WaitForExclusive can control producer exclusivity.


---

<!-- 113_EXCLUSIVE_PRODUCER.md -->

# Exclusive Producer

## What / Why
Only one producer may publish under exclusive mode.

## Visual
```text
Exclusive Producer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Exclusive Producer:** Only one producer may publish under exclusive mode.


---

<!-- 114_SEQUENCE_ID.md -->

# Sequence ID

## What / Why
Application/client sequence metadata can assist deduplication/order tracking.

## Visual
```text
Sequence ID → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Sequence ID:** Application/client sequence metadata can assist deduplication/order tracking.


---

<!-- 115_PRODUCER_DEDUPLICATION.md -->

# Producer Deduplication

## What / Why
Broker-side deduplication can suppress repeated producer sequence IDs when enabled.

## Visual
```text
Producer Deduplication → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Deduplication:** Broker-side deduplication can suppress repeated producer sequence IDs when enabled.


---

<!-- 116_DEDUPLICATION_SNAPSHOT.md -->

# Deduplication Snapshot

## What / Why
Broker tracks producer sequence state for dedupe recovery.

## Visual
```text
Deduplication Snapshot → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Deduplication Snapshot:** Broker tracks producer sequence state for dedupe recovery.


---

<!-- 117_CHUNKING.md -->

# Chunking

## What / Why
Large messages can be split into chunks when supported/configured.

## Visual
```text
Chunking → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Chunking:** Large messages can be split into chunks when supported/configured.


---

<!-- 118_MESSAGE_KEY.md -->

# Message Key

## What / Why
String/bytes key used for routing/grouping.

## Visual
```text
Message Key → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Message Key:** String/bytes key used for routing/grouping.


---

<!-- 119_PROPERTIES.md -->

# Properties

## What / Why
String key-value metadata attached to a message.

## Visual
```text
Properties → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Properties:** String key-value metadata attached to a message.


---

<!-- 120_EVENT_TIME.md -->

# Event Time

## What / Why
Application event timestamp separate from publish timestamp.

## Visual
```text
Event Time → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Event Time:** Application event timestamp separate from publish timestamp.


---

<!-- 121_DELIVER_AT.md -->

# Deliver At

## What / Why
Schedule message for a specific future time.

## Visual
```text
Deliver At → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Deliver At:** Schedule message for a specific future time.


---

<!-- 122_DELIVER_AFTER.md -->

# Deliver After

## What / Why
Schedule message after a delay.

## Visual
```text
Deliver After → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Deliver After:** Schedule message after a delay.


---

<!-- 123_PRODUCER_INTERCEPTOR.md -->

# Producer Interceptor

## What / Why
Hook around send path for tracing/metrics/custom behavior.

## Visual
```text
Producer Interceptor → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Interceptor:** Hook around send path for tracing/metrics/custom behavior.


---

<!-- 124_PRODUCER_ENCRYPTION.md -->

# Producer Encryption

## What / Why
Client-side message encryption can protect payloads independent of broker transport.

## Visual
```text
Producer Encryption → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Encryption:** Client-side message encryption can protect payloads independent of broker transport.


---

<!-- 125_SUBSCRIPTION_MENTAL_MODEL.md -->

# Subscription Mental Model

## What / Why
A subscription represents durable consumption state plus a dispatch strategy.

## Visual
```text
Subscription Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Mental Model:** A subscription represents durable consumption state plus a dispatch strategy.


---

<!-- 126_EXCLUSIVE_SUBSCRIPTION.md -->

# Exclusive Subscription

## What / Why
One consumer at a time; preserves simple ordered consumption.

## Visual
```text
Exclusive Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Exclusive Subscription:** One consumer at a time; preserves simple ordered consumption.


---

<!-- 127_FAILOVER_SUBSCRIPTION.md -->

# Failover Subscription

## What / Why
Multiple consumers attach but only one is active per partition; standby takes over.

## Visual
```text
Failover Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Failover Subscription:** Multiple consumers attach but only one is active per partition; standby takes over.


---

<!-- 128_SHARED_SUBSCRIPTION.md -->

# Shared Subscription

## What / Why
Messages are distributed across consumers; ordering is not guaranteed.

## Visual
```text
Shared Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Shared Subscription:** Messages are distributed across consumers; ordering is not guaranteed.


---

<!-- 129_KEY_SHARED_SUBSCRIPTION.md -->

# Key Shared Subscription

## What / Why
Messages sharing the same key are routed to one consumer while allowing parallelism across keys.

## Visual
```text
Key Shared Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Key Shared Subscription:** Messages sharing the same key are routed to one consumer while allowing parallelism across keys.


---

<!-- 130_EXCLUSIVE_USE_CASE.md -->

# Exclusive Use Case

## What / Why
Strict single-consumer processing/order.

## Visual
```text
Exclusive Use Case → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Exclusive Use Case:** Strict single-consumer processing/order.


---

<!-- 131_FAILOVER_USE_CASE.md -->

# Failover Use Case

## What / Why
Active-standby consumers with automatic takeover.

## Visual
```text
Failover Use Case → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Failover Use Case:** Active-standby consumers with automatic takeover.


---

<!-- 132_SHARED_USE_CASE.md -->

# Shared Use Case

## What / Why
Maximum worker parallelism where ordering is not required.

## Visual
```text
Shared Use Case → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Shared Use Case:** Maximum worker parallelism where ordering is not required.


---

<!-- 133_KEY_SHARED_USE_CASE.md -->

# Key Shared Use Case

## What / Why
Parallel processing while preserving per-key affinity/order.

## Visual
```text
Key Shared Use Case → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Key Shared Use Case:** Parallel processing while preserving per-key affinity/order.


---

<!-- 134_KEY_SHARED_BATCHING_RULE.md -->

# Key Shared Batching Rule

## What / Why
Use key-based batching or disable batching so keys are not mixed improperly.

## Visual
```text
Key Shared Batching Rule → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Key Shared Batching Rule:** Use key-based batching or disable batching so keys are not mixed improperly.


---

<!-- 135_SUBSCRIPTION_NAME.md -->

# Subscription Name

## What / Why
Durable identifier for cursor and backlog.

## Visual
```text
Subscription Name → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Name:** Durable identifier for cursor and backlog.


---

<!-- 136_SUBSCRIPTION_INITIAL_POSITION.md -->

# Subscription Initial Position

## What / Why
Start from Latest or Earliest when subscription is first created.

## Visual
```text
Subscription Initial Position → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Initial Position:** Start from Latest or Earliest when subscription is first created.


---

<!-- 137_DURABLE_SUBSCRIPTION.md -->

# Durable Subscription

## What / Why
Cursor/backlog retained when consumers disconnect.

## Visual
```text
Durable Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Durable Subscription:** Cursor/backlog retained when consumers disconnect.


---

<!-- 138_NON_DURABLE_SUBSCRIPTION.md -->

# Non Durable Subscription

## What / Why
Consumer lifecycle may not persist subscription state beyond active usage.

## Visual
```text
Non Durable Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Non Durable Subscription:** Consumer lifecycle may not persist subscription state beyond active usage.


---

<!-- 139_REPLICATED_SUBSCRIPTION.md -->

# Replicated Subscription

## What / Why
Subscription state can be replicated across clusters under supported geo-replication features.

## Visual
```text
Replicated Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replicated Subscription:** Subscription state can be replicated across clusters under supported geo-replication features.


---

<!-- 140_SUBSCRIPTION_EXPIRATION.md -->

# Subscription Expiration

## What / Why
Inactive subscriptions may expire according to namespace policy.

## Visual
```text
Subscription Expiration → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Expiration:** Inactive subscriptions may expire according to namespace policy.


---

<!-- 141_SUBSCRIPTION_TYPE_CHANGE.md -->

# Subscription Type Change

## What / Why
Changing type has constraints and operational implications.

## Visual
```text
Subscription Type Change → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Type Change:** Changing type has constraints and operational implications.


---

<!-- 142_SUBSCRIPTION_BACKLOG.md -->

# Subscription Backlog

## What / Why
Unacknowledged/unread messages accumulated behind cursor.

## Visual
```text
Subscription Backlog → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Backlog:** Unacknowledged/unread messages accumulated behind cursor.


---

<!-- 143_SUBSCRIPTION_CURSOR.md -->

# Subscription Cursor

## What / Why
Tracks acknowledged/read position over managed ledger.

## Visual
```text
Subscription Cursor → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Cursor:** Tracks acknowledged/read position over managed ledger.


---

<!-- 144_INDIVIDUAL_ACK.md -->

# Individual Ack

## What / Why
Acknowledges one message.

## Visual
```text
Individual Ack → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Individual Ack:** Acknowledges one message.


---

<!-- 145_CUMULATIVE_ACK.md -->

# Cumulative Ack

## What / Why
Acknowledges a message and all prior messages in supported subscription types.

## Visual
```text
Cumulative Ack → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Cumulative Ack:** Acknowledges a message and all prior messages in supported subscription types.


---

<!-- 146_ACK_RESTRICTIONS.md -->

# Ack Restrictions

## What / Why
Cumulative ack is not applicable to Shared/Key_Shared in the same way as ordered subscriptions.

## Visual
```text
Ack Restrictions → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ack Restrictions:** Cumulative ack is not applicable to Shared/Key_Shared in the same way as ordered subscriptions.


---

<!-- 147_ASYNC_ACK.md -->

# Async Ack

## What / Why
Client can acknowledge asynchronously.

## Visual
```text
Async Ack → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Async Ack:** Client can acknowledge asynchronously.


---

<!-- 148_NEGATIVE_ACK.md -->

# Negative Ack

## What / Why
Consumer requests redelivery after failure.

## Visual
```text
Negative Ack → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Negative Ack:** Consumer requests redelivery after failure.


---

<!-- 149_NEGATIVE_ACK_DELAY.md -->

# Negative Ack Delay

## What / Why
Redelivery can be delayed after negative acknowledgement.

## Visual
```text
Negative Ack Delay → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Negative Ack Delay:** Redelivery can be delayed after negative acknowledgement.


---

<!-- 150_ACK_TIMEOUT.md -->

# Ack Timeout

## What / Why
Unacknowledged messages may be redelivered after configured timeout.

## Visual
```text
Ack Timeout → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ack Timeout:** Unacknowledged messages may be redelivered after configured timeout.


---

<!-- 151_ACK_TIMEOUT_REDELIVERY_BACKOFF.md -->

# Ack Timeout Redelivery Backoff

## What / Why
Backoff policy can progressively delay ack-timeout redelivery.

## Visual
```text
Ack Timeout Redelivery Backoff → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ack Timeout Redelivery Backoff:** Backoff policy can progressively delay ack-timeout redelivery.


---

<!-- 152_NEGATIVE_ACK_BACKOFF.md -->

# Negative Ack Backoff

## What / Why
Backoff policy can progressively delay negative-ack redelivery.

## Visual
```text
Negative Ack Backoff → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Negative Ack Backoff:** Backoff policy can progressively delay negative-ack redelivery.


---

<!-- 153_REDELIVERY_COUNT.md -->

# Redelivery Count

## What / Why
Client/broker metadata may expose redelivery attempts.

## Visual
```text
Redelivery Count → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Redelivery Count:** Client/broker metadata may expose redelivery attempts.


---

<!-- 154_RECONSUME_LATER.md -->

# Reconsume Later

## What / Why
Client API can schedule redelivery after a delay while preserving retry semantics.

## Visual
```text
Reconsume Later → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Reconsume Later:** Client API can schedule redelivery after a delay while preserving retry semantics.


---

<!-- 155_DEAD_LETTER_POLICY.md -->

# Dead Letter Policy

## What / Why
Subscription can route repeatedly failed messages to a dead-letter topic.

## Visual
```text
Dead Letter Policy → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Dead Letter Policy:** Subscription can route repeatedly failed messages to a dead-letter topic.


---

<!-- 156_MAX_REDELIVER_COUNT.md -->

# Max Redeliver Count

## What / Why
Threshold before dead-letter handling.

## Visual
```text
Max Redeliver Count → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Max Redeliver Count:** Threshold before dead-letter handling.


---

<!-- 157_RETRY_LETTER_TOPIC.md -->

# Retry Letter Topic

## What / Why
Retry mechanism can use dedicated retry topic.

## Visual
```text
Retry Letter Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retry Letter Topic:** Retry mechanism can use dedicated retry topic.


---

<!-- 158_DEAD_LETTER_TOPIC.md -->

# Dead Letter Topic

## What / Why
Terminal topic for poison/unrecoverable messages.

## Visual
```text
Dead Letter Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Dead Letter Topic:** Terminal topic for poison/unrecoverable messages.


---

<!-- 159_RETRY_IDEMPOTENCY.md -->

# Retry Idempotency

## What / Why
Repeated delivery attempts require idempotent business processing.

## Visual
```text
Retry Idempotency → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retry Idempotency:** Repeated delivery attempts require idempotent business processing.


---

<!-- 160_ACK_AFTER_SIDE_EFFECT.md -->

# Ack After Side Effect

## What / Why
At-least-once processing generally acknowledges after durable business effect.

## Visual
```text
Ack After Side Effect → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ack After Side Effect:** At-least-once processing generally acknowledges after durable business effect.


---

<!-- 161_ACK_GROUPING.md -->

# Ack Grouping

## What / Why
Clients may group acknowledgements to reduce network overhead.

## Visual
```text
Ack Grouping → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ack Grouping:** Clients may group acknowledgements to reduce network overhead.


---

<!-- 162_BACKLOG.md -->

# Backlog

## What / Why
Messages retained because one or more subscriptions/readers have not advanced.

## Visual
```text
Backlog → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog:** Messages retained because one or more subscriptions/readers have not advanced.


---

<!-- 163_RETENTION.md -->

# Retention

## What / Why
Policy can retain acknowledged messages for replay after subscription advances.

## Visual
```text
Retention → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retention:** Policy can retain acknowledged messages for replay after subscription advances.


---

<!-- 164_RETENTION_SIZE.md -->

# Retention Size

## What / Why
Namespace/topic retention bytes limit.

## Visual
```text
Retention Size → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retention Size:** Namespace/topic retention bytes limit.


---

<!-- 165_RETENTION_TIME.md -->

# Retention Time

## What / Why
Namespace/topic retention duration.

## Visual
```text
Retention Time → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retention Time:** Namespace/topic retention duration.


---

<!-- 166_BACKLOG_QUOTA.md -->

# Backlog Quota

## What / Why
Limits unconsumed backlog by size/age with configured enforcement.

## Visual
```text
Backlog Quota → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog Quota:** Limits unconsumed backlog by size/age with configured enforcement.


---

<!-- 167_BACKLOG_QUOTA_POLICIES.md -->

# Backlog Quota Policies

## What / Why
Can hold producers, evict backlog or enforce other configured behavior.

## Visual
```text
Backlog Quota Policies → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog Quota Policies:** Can hold producers, evict backlog or enforce other configured behavior.


---

<!-- 168_TTL.md -->

# TTL

## What / Why
Message TTL expires unconsumed messages after configured time.

## Visual
```text
TTL → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **TTL:** Message TTL expires unconsumed messages after configured time.


---

<!-- 169_EXPIRY_CHECK.md -->

# Expiry Check

## What / Why
Broker periodically marks expired entries/messages for subscription progress.

## Visual
```text
Expiry Check → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Expiry Check:** Broker periodically marks expired entries/messages for subscription progress.


---

<!-- 170_TOPIC_COMPACTION.md -->

# Topic Compaction

## What / Why
Keeps latest value for each key in compacted view while retaining original storage separately until cleanup/retention.

## Visual
```text
Topic Compaction → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Compaction:** Keeps latest value for each key in compacted view while retaining original storage separately until cleanup/retention.


---

<!-- 171_COMPACTION_THRESHOLD.md -->

# Compaction Threshold

## What / Why
Triggers compaction based on topic backlog size.

## Visual
```text
Compaction Threshold → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compaction Threshold:** Triggers compaction based on topic backlog size.


---

<!-- 172_COMPACTED_READER.md -->

# Compacted Reader

## What / Why
Reader can consume compacted topic view.

## Visual
```text
Compacted Reader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compacted Reader:** Reader can consume compacted topic view.


---

<!-- 173_TOMBSTONE.md -->

# Tombstone

## What / Why
Empty/null payload with key removes key from compacted state.

## Visual
```text
Tombstone → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tombstone:** Empty/null payload with key removes key from compacted state.


---

<!-- 174_RETENTION_VS_COMPACTION.md -->

# Retention vs Compaction

## What / Why
Retention controls history lifetime; compaction builds latest-key view.

## Visual
```text
Retention vs Compaction → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retention vs Compaction:** Retention controls history lifetime; compaction builds latest-key view.


---

<!-- 175_BACKLOG_VS_RETENTION.md -->

# Backlog vs Retention

## What / Why
Backlog is subscription-driven unread data; retention can keep already acknowledged data.

## Visual
```text
Backlog vs Retention → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog vs Retention:** Backlog is subscription-driven unread data; retention can keep already acknowledged data.


---

<!-- 176_DELAYED_DELIVERY.md -->

# Delayed Delivery

## What / Why
Broker holds messages until deliverAt/deliverAfter time.

## Visual
```text
Delayed Delivery → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Delayed Delivery:** Broker holds messages until deliverAt/deliverAfter time.


---

<!-- 177_DELAYED_DELIVERY_TRACKER.md -->

# Delayed Delivery Tracker

## What / Why
Broker tracks delayed messages separately from immediately dispatchable entries.

## Visual
```text
Delayed Delivery Tracker → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Delayed Delivery Tracker:** Broker tracks delayed messages separately from immediately dispatchable entries.


---

<!-- 178_DELAYED_DELIVERY_TICK.md -->

# Delayed Delivery Tick

## What / Why
Timer resolution influences delivery timing precision.

## Visual
```text
Delayed Delivery Tick → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Delayed Delivery Tick:** Timer resolution influences delivery timing precision.


---

<!-- 179_STRICT_DELIVERY_DELAY.md -->

# Strict Delivery Delay

## What / Why
Configuration can alter whether delayed tracker behaves strictly.

## Visual
```text
Strict Delivery Delay → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Strict Delivery Delay:** Configuration can alter whether delayed tracker behaves strictly.


---

<!-- 180_DELAYED_DELIVERY_WITH_SHARED.md -->

# Delayed Delivery with Shared

## What / Why
Useful for retries and scheduled work with shared consumers.

## Visual
```text
Delayed Delivery with Shared → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Delayed Delivery with Shared:** Useful for retries and scheduled work with shared consumers.


---

<!-- 181_SCHEDULED_MESSAGE_ORDERING.md -->

# Scheduled Message Ordering

## What / Why
Future-delivery messages can alter simple publish-order expectations.

## Visual
```text
Scheduled Message Ordering → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Scheduled Message Ordering:** Future-delivery messages can alter simple publish-order expectations.


---

<!-- 182_DELAYED_RETRY_PATTERN.md -->

# Delayed Retry Pattern

## What / Why
Use deliverAfter/reconsumeLater rather than external retry queues when appropriate.

## Visual
```text
Delayed Retry Pattern → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Delayed Retry Pattern:** Use deliverAfter/reconsumeLater rather than external retry queues when appropriate.


---

<!-- 183_DELAY_CAPACITY.md -->

# Delay Capacity

## What / Why
Large delayed backlogs affect broker memory/metadata and should be capacity-tested.

## Visual
```text
Delay Capacity → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Delay Capacity:** Large delayed backlogs affect broker memory/metadata and should be capacity-tested.


---

<!-- 184_DEAD_LETTER_POLICY.md -->

# Dead Letter Policy

## What / Why
Per-consumer/subscription policy defines DLQ and max redelivery.

## Visual
```text
Dead Letter Policy → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Dead Letter Policy:** Per-consumer/subscription policy defines DLQ and max redelivery.


---

<!-- 185_DEFAULT_DEAD_LETTER_TOPIC.md -->

# Default Dead Letter Topic

## What / Why
Generated DLQ topic may be used when one is not explicitly named.

## Visual
```text
Default Dead Letter Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Default Dead Letter Topic:** Generated DLQ topic may be used when one is not explicitly named.


---

<!-- 186_RETRY_LETTER_TOPIC.md -->

# Retry Letter Topic

## What / Why
Intermediate topic for delayed retries.

## Visual
```text
Retry Letter Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retry Letter Topic:** Intermediate topic for delayed retries.


---

<!-- 187_POISON_MESSAGE.md -->

# Poison Message

## What / Why
Repeatedly unprocessable message.

## Visual
```text
Poison Message → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Poison Message:** Repeatedly unprocessable message.


---

<!-- 188_RETRY_TOPIC_PATTERN.md -->

# Retry Topic Pattern

## What / Why
Consumer failure → retry topic → later reconsume.

## Visual
```text
Retry Topic Pattern → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retry Topic Pattern:** Consumer failure → retry topic → later reconsume.


---

<!-- 189_DLQ_CONSUMER.md -->

# DLQ Consumer

## What / Why
Separate remediation consumer handles terminal failures.

## Visual
```text
DLQ Consumer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **DLQ Consumer:** Separate remediation consumer handles terminal failures.


---

<!-- 190_RETRY_BACKOFF.md -->

# Retry Backoff

## What / Why
Progressively increase delay between attempts.

## Visual
```text
Retry Backoff → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retry Backoff:** Progressively increase delay between attempts.


---

<!-- 191_RETRY_ORDERING_TRADEOFF.md -->

# Retry Ordering Tradeoff

## What / Why
Retry can violate global message order while improving throughput.

## Visual
```text
Retry Ordering Tradeoff → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retry Ordering Tradeoff:** Retry can violate global message order while improving throughput.


---

<!-- 192_DLQ_GOVERNANCE.md -->

# DLQ Governance

## What / Why
DLQs need ownership, monitoring, retention and replay/remediation procedures.

## Visual
```text
DLQ Governance → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **DLQ Governance:** DLQs need ownership, monitoring, retention and replay/remediation procedures.


---

<!-- 193_DLQ_REPLAY.md -->

# DLQ Replay

## What / Why
Reprocessing DLQ messages must remain idempotent and version-aware.

## Visual
```text
DLQ Replay → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **DLQ Replay:** Reprocessing DLQ messages must remain idempotent and version-aware.


---

<!-- 194_READER_MENTAL_MODEL.md -->

# Reader Mental Model

## What / Why
Reader consumes a topic from a chosen MessageId without normal subscription state.

## Visual
```text
Reader Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Reader Mental Model:** Reader consumes a topic from a chosen MessageId without normal subscription state.


---

<!-- 195_MESSAGEID.md -->

# MessageId

## What / Why
Opaque position identifying message/entry location.

## Visual
```text
MessageId → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **MessageId:** Opaque position identifying message/entry location.


---

<!-- 196_EARLIEST_MESSAGEID.md -->

# Earliest MessageId

## What / Why
Start from earliest retained message.

## Visual
```text
Earliest MessageId → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Earliest MessageId:** Start from earliest retained message.


---

<!-- 197_LATEST_MESSAGEID.md -->

# Latest MessageId

## What / Why
Start near topic tail.

## Visual
```text
Latest MessageId → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Latest MessageId:** Start near topic tail.


---

<!-- 198_READER_SEEK.md -->

# Reader Seek

## What / Why
Move reader/consumer cursor to MessageId or timestamp.

## Visual
```text
Reader Seek → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Reader Seek:** Move reader/consumer cursor to MessageId or timestamp.


---

<!-- 199_SEEK_BY_TIMESTAMP.md -->

# Seek by Timestamp

## What / Why
Reset subscription/reader to time-based position.

## Visual
```text
Seek by Timestamp → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Seek by Timestamp:** Reset subscription/reader to time-based position.


---

<!-- 200_RESET_CURSOR.md -->

# Reset Cursor

## What / Why
Admin can reset subscription cursor for replay.

## Visual
```text
Reset Cursor → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Reset Cursor:** Admin can reset subscription cursor for replay.


---

<!-- 201_REPLAY.md -->

# Replay

## What / Why
Move cursor backward and reprocess retained messages.

## Visual
```text
Replay → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replay:** Move cursor backward and reprocess retained messages.


---

<!-- 202_REPLAY_SAFETY.md -->

# Replay Safety

## What / Why
Consumers must prevent duplicate external side effects.

## Visual
```text
Replay Safety → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replay Safety:** Consumers must prevent duplicate external side effects.


---

<!-- 203_COMPACTED_REPLAY.md -->

# Compacted Replay

## What / Why
Read compacted latest-value view when rebuilding state.

## Visual
```text
Compacted Replay → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compacted Replay:** Read compacted latest-value view when rebuilding state.


---

<!-- 204_READER_VS_CONSUMER.md -->

# Reader vs Consumer

## What / Why
Reader is cursor-oriented without durable subscription semantics; consumer participates in subscription delivery.

## Visual
```text
Reader vs Consumer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Reader vs Consumer:** Reader is cursor-oriented without durable subscription semantics; consumer participates in subscription delivery.


---

<!-- 205_TRANSACTION_MENTAL_MODEL.md -->

# Transaction Mental Model

## What / Why
Pulsar transactions atomically group produces and acknowledgements across topics and partitions.

## Visual
```text
Transaction Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transaction Mental Model:** Pulsar transactions atomically group produces and acknowledgements across topics and partitions.


---

<!-- 206_TRANSACTION_COORDINATOR.md -->

# Transaction Coordinator

## What / Why
Coordinates transaction state.

## Visual
```text
Transaction Coordinator → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transaction Coordinator:** Coordinates transaction state.


---

<!-- 207_TRANSACTION_METADATA_STORE.md -->

# Transaction Metadata Store

## What / Why
Stores transaction metadata/state.

## Visual
```text
Transaction Metadata Store → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transaction Metadata Store:** Stores transaction metadata/state.


---

<!-- 208_TRANSACTION_BUFFER.md -->

# Transaction Buffer

## What / Why
Topic-side buffer hides uncommitted transactional messages.

## Visual
```text
Transaction Buffer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transaction Buffer:** Topic-side buffer hides uncommitted transactional messages.


---

<!-- 209_BEGIN_TRANSACTION.md -->

# Begin Transaction

## What / Why
Client creates transaction with timeout.

## Visual
```text
Begin Transaction → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Begin Transaction:** Client creates transaction with timeout.


---

<!-- 210_TRANSACTIONAL_PRODUCE.md -->

# Transactional Produce

## What / Why
Messages published inside transaction remain invisible until commit.

## Visual
```text
Transactional Produce → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transactional Produce:** Messages published inside transaction remain invisible until commit.


---

<!-- 211_TRANSACTIONAL_ACK.md -->

# Transactional Ack

## What / Why
Message acknowledgements can be part of transaction.

## Visual
```text
Transactional Ack → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transactional Ack:** Message acknowledgements can be part of transaction.


---

<!-- 212_COMMIT_TRANSACTION.md -->

# Commit Transaction

## What / Why
Atomically commits all transactional operations.

## Visual
```text
Commit Transaction → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Commit Transaction:** Atomically commits all transactional operations.


---

<!-- 213_ABORT_TRANSACTION.md -->

# Abort Transaction

## What / Why
Discards transactional produces/acks.

## Visual
```text
Abort Transaction → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Abort Transaction:** Discards transactional produces/acks.


---

<!-- 214_READ_COMMITTED.md -->

# Read Committed

## What / Why
Consumers do not see aborted/uncommitted transactional messages under transaction semantics.

## Visual
```text
Read Committed → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Read Committed:** Consumers do not see aborted/uncommitted transactional messages under transaction semantics.


---

<!-- 215_CROSS_TOPIC_TRANSACTION.md -->

# Cross Topic Transaction

## What / Why
Transaction may span multiple topics/partitions.

## Visual
```text
Cross Topic Transaction → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Cross Topic Transaction:** Transaction may span multiple topics/partitions.


---

<!-- 216_EXACTLY_ONCE_SCOPE.md -->

# Exactly Once Scope

## What / Why
Transactions improve Pulsar read/write atomicity but do not include arbitrary external databases.

## Visual
```text
Exactly Once Scope → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Exactly Once Scope:** Transactions improve Pulsar read/write atomicity but do not include arbitrary external databases.


---

<!-- 217_TRANSACTION_TIMEOUT.md -->

# Transaction Timeout

## What / Why
Coordinator aborts transactions that exceed timeout.

## Visual
```text
Transaction Timeout → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transaction Timeout:** Coordinator aborts transactions that exceed timeout.


---

<!-- 218_TRANSACTION_RECOVERY.md -->

# Transaction Recovery

## What / Why
Coordinator/state stores recover in-flight transaction state after failures.

## Visual
```text
Transaction Recovery → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transaction Recovery:** Coordinator/state stores recover in-flight transaction state after failures.


---

<!-- 219_TRANSACTIONS_VS_IDEMPOTENCY.md -->

# Transactions vs Idempotency

## What / Why
External side effects still require idempotency/outbox/saga.

## Visual
```text
Transactions vs Idempotency → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transactions vs Idempotency:** External side effects still require idempotency/outbox/saga.


---

<!-- 220_SCHEMA_REGISTRY.md -->

# Schema Registry

## What / Why
Pulsar stores schema metadata associated with topics.

## Visual
```text
Schema Registry → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Registry:** Pulsar stores schema metadata associated with topics.


---

<!-- 221_SCHEMA_VERSION.md -->

# Schema Version

## What / Why
Broker assigns/maintains schema versions.

## Visual
```text
Schema Version → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Version:** Broker assigns/maintains schema versions.


---

<!-- 222_SCHEMA_VALIDATION.md -->

# Schema Validation

## What / Why
Broker can validate producer/consumer schema compatibility.

## Visual
```text
Schema Validation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Validation:** Broker can validate producer/consumer schema compatibility.


---

<!-- 223_PRIMITIVE_SCHEMA.md -->

# Primitive Schema

## What / Why
Built-in schemas for primitive types.

## Visual
```text
Primitive Schema → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Primitive Schema:** Built-in schemas for primitive types.


---

<!-- 224_STRING_SCHEMA.md -->

# String Schema

## What / Why
UTF/string typed schema.

## Visual
```text
String Schema → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **String Schema:** UTF/string typed schema.


---

<!-- 225_BYTES_SCHEMA.md -->

# Bytes Schema

## What / Why
Raw bytes schema.

## Visual
```text
Bytes Schema → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bytes Schema:** Raw bytes schema.


---

<!-- 226_JSON_SCHEMA.md -->

# JSON Schema

## What / Why
Schema for JSON-serialized POJOs/records.

## Visual
```text
JSON Schema → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **JSON Schema:** Schema for JSON-serialized POJOs/records.


---

<!-- 227_AVRO_SCHEMA.md -->

# Avro Schema

## What / Why
Avro-based schema.

## Visual
```text
Avro Schema → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Avro Schema:** Avro-based schema.


---

<!-- 228_PROTOBUF_SCHEMA.md -->

# Protobuf Schema

## What / Why
Protobuf schema support.

## Visual
```text
Protobuf Schema → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Protobuf Schema:** Protobuf schema support.


---

<!-- 229_PROTOBUF_NATIVE.md -->

# Protobuf Native

## What / Why
Native Protobuf descriptor-based support.

## Visual
```text
Protobuf Native → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Protobuf Native:** Native Protobuf descriptor-based support.


---

<!-- 230_KEYVALUE_SCHEMA.md -->

# KeyValue Schema

## What / Why
Separate key/value schemas.

## Visual
```text
KeyValue Schema → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **KeyValue Schema:** Separate key/value schemas.


---

<!-- 231_AUTO_CONSUME.md -->

# Auto Consume

## What / Why
Consumer can inspect schema dynamically where supported.

## Visual
```text
Auto Consume → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Auto Consume:** Consumer can inspect schema dynamically where supported.


---

<!-- 232_AUTO_PRODUCE.md -->

# Auto Produce

## What / Why
Producer can adapt generic schema information where supported.

## Visual
```text
Auto Produce → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Auto Produce:** Producer can adapt generic schema information where supported.


---

<!-- 233_SCHEMA_COMPATIBILITY_STRATEGY.md -->

# Schema Compatibility Strategy

## What / Why
Namespace/topic compatibility policy controls evolution.

## Visual
```text
Schema Compatibility Strategy → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Compatibility Strategy:** Namespace/topic compatibility policy controls evolution.


---

<!-- 234_BACKWARD_COMPATIBILITY.md -->

# Backward Compatibility

## What / Why
New schema can read data written with older schema.

## Visual
```text
Backward Compatibility → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backward Compatibility:** New schema can read data written with older schema.


---

<!-- 235_FORWARD_COMPATIBILITY.md -->

# Forward Compatibility

## What / Why
Older readers remain compatible with newer producer schema under policy.

## Visual
```text
Forward Compatibility → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Forward Compatibility:** Older readers remain compatible with newer producer schema under policy.


---

<!-- 236_FULL_COMPATIBILITY.md -->

# Full Compatibility

## What / Why
Both backward and forward constraints.

## Visual
```text
Full Compatibility → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Full Compatibility:** Both backward and forward constraints.


---

<!-- 237_SCHEMA_EVOLUTION.md -->

# Schema Evolution

## What / Why
Change event structure while protecting consumers.

## Visual
```text
Schema Evolution → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Evolution:** Change event structure while protecting consumers.


---

<!-- 238_SCHEMA_ADMIN.md -->

# Schema Admin

## What / Why
pulsar-admin supports schema upload/get/delete/extract operations.

## Visual
```text
Schema Admin → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Admin:** pulsar-admin supports schema upload/get/delete/extract operations.


---

<!-- 239_SCHEMA_GOVERNANCE.md -->

# Schema Governance

## What / Why
Schema compatibility does not replace semantic contract governance.

## Visual
```text
Schema Governance → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Governance:** Schema compatibility does not replace semantic contract governance.


---

<!-- 240_PULSAR_FUNCTIONS_MENTAL_MODEL.md -->

# Pulsar Functions Mental Model

## What / Why
Lightweight serverless compute framework consuming topics and producing outputs.

## Visual
```text
Pulsar Functions Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Functions Mental Model:** Lightweight serverless compute framework consuming topics and producing outputs.


---

<!-- 241_FUNCTION_INPUT.md -->

# Function Input

## What / Why
One or more input topics.

## Visual
```text
Function Input → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Input:** One or more input topics.


---

<!-- 242_FUNCTION_OUTPUT.md -->

# Function Output

## What / Why
Optional output topic.

## Visual
```text
Function Output → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Output:** Optional output topic.


---

<!-- 243_FUNCTION_RUNTIME.md -->

# Function Runtime

## What / Why
Java, Python and supported runtime modes depending deployment.

## Visual
```text
Function Runtime → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Runtime:** Java, Python and supported runtime modes depending deployment.


---

<!-- 244_FUNCTION_WORKER.md -->

# Function Worker

## What / Why
Service managing function metadata, assignments and runtime execution.

## Visual
```text
Function Worker → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Worker:** Service managing function metadata, assignments and runtime execution.


---

<!-- 245_FUNCTION_INSTANCE.md -->

# Function Instance

## What / Why
One parallel execution instance.

## Visual
```text
Function Instance → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Instance:** One parallel execution instance.


---

<!-- 246_FUNCTION_PARALLELISM.md -->

# Function Parallelism

## What / Why
Multiple instances scale processing.

## Visual
```text
Function Parallelism → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Parallelism:** Multiple instances scale processing.


---

<!-- 247_AT_MOST_ONCE_FUNCTION.md -->

# At Most Once Function

## What / Why
Acknowledge before processing; possible loss.

## Visual
```text
At Most Once Function → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **At Most Once Function:** Acknowledge before processing; possible loss.


---

<!-- 248_AT_LEAST_ONCE_FUNCTION.md -->

# At Least Once Function

## What / Why
Default; ack after successful output, duplicates possible.

## Visual
```text
At Least Once Function → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **At Least Once Function:** Default; ack after successful output, duplicates possible.


---

<!-- 249_EFFECTIVELY_ONCE_FUNCTION.md -->

# Effectively Once Function

## What / Why
Uses server-side deduplication/state semantics to produce one logical output under defined assumptions.

## Visual
```text
Effectively Once Function → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Effectively Once Function:** Uses server-side deduplication/state semantics to produce one logical output under defined assumptions.


---

<!-- 250_MANUAL_ACK_FUNCTION.md -->

# Manual Ack Function

## What / Why
Application controls acknowledgement.

## Visual
```text
Manual Ack Function → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Manual Ack Function:** Application controls acknowledgement.


---

<!-- 251_FUNCTION_STATE.md -->

# Function State

## What / Why
Functions can use state storage where configured.

## Visual
```text
Function State → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function State:** Functions can use state storage where configured.


---

<!-- 252_CONTEXT.md -->

# Context

## What / Why
Function context exposes metadata, state, secrets, metrics and record access.

## Visual
```text
Context → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Context:** Function context exposes metadata, state, secrets, metrics and record access.


---

<!-- 253_FUNCTION_METRICS.md -->

# Function Metrics

## What / Why
User-defined and runtime metrics.

## Visual
```text
Function Metrics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Metrics:** User-defined and runtime metrics.


---

<!-- 254_FUNCTION_SECRETS.md -->

# Function Secrets

## What / Why
Inject secrets through supported secrets providers.

## Visual
```text
Function Secrets → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Secrets:** Inject secrets through supported secrets providers.


---

<!-- 255_FUNCTION_PACKAGE.md -->

# Function Package

## What / Why
Code packaged as JAR/Python archive/NAR depending runtime.

## Visual
```text
Function Package → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Package:** Code packaged as JAR/Python archive/NAR depending runtime.


---

<!-- 256_FUNCTION_UPDATE.md -->

# Function Update

## What / Why
Deploy new code/config/version.

## Visual
```text
Function Update → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Update:** Deploy new code/config/version.


---

<!-- 257_FUNCTION_PROCESSING_GUARANTEE.md -->

# Function Processing Guarantee

## What / Why
Guarantee depends on acknowledgement/output timing and downstream semantics.

## Visual
```text
Function Processing Guarantee → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Processing Guarantee:** Guarantee depends on acknowledgement/output timing and downstream semantics.


---

<!-- 258_FUNCTION_VS_STREAMS_ENGINE.md -->

# Function vs Streams Engine

## What / Why
Functions fit lightweight record processing; complex event-time/stateful analytics may fit Flink/other engines better.

## Visual
```text
Function vs Streams Engine → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function vs Streams Engine:** Functions fit lightweight record processing; complex event-time/stateful analytics may fit Flink/other engines better.


---

<!-- 259_PULSAR_IO_MENTAL_MODEL.md -->

# Pulsar IO Mental Model

## What / Why
Managed source/sink connector framework built on Pulsar Functions infrastructure.

## Visual
```text
Pulsar IO Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar IO Mental Model:** Managed source/sink connector framework built on Pulsar Functions infrastructure.


---

<!-- 260_SOURCE_CONNECTOR.md -->

# Source Connector

## What / Why
External system → Pulsar.

## Visual
```text
Source Connector → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Source Connector:** External system → Pulsar.


---

<!-- 261_SINK_CONNECTOR.md -->

# Sink Connector

## What / Why
Pulsar → external system.

## Visual
```text
Sink Connector → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Sink Connector:** Pulsar → external system.


---

<!-- 262_CONNECTOR_RUNTIME.md -->

# Connector Runtime

## What / Why
Runs through Functions worker/runtime infrastructure.

## Visual
```text
Connector Runtime → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Connector Runtime:** Runs through Functions worker/runtime infrastructure.


---

<!-- 263_CONNECTOR_PARALLELISM.md -->

# Connector Parallelism

## What / Why
Multiple instances scale source/sink processing.

## Visual
```text
Connector Parallelism → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Connector Parallelism:** Multiple instances scale source/sink processing.


---

<!-- 264_CONNECTOR_PROCESSING_GUARANTEES.md -->

# Connector Processing Guarantees

## What / Why
At-most-once, at-least-once and effectively-once semantics depend on connector implementation.

## Visual
```text
Connector Processing Guarantees → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Connector Processing Guarantees:** At-most-once, at-least-once and effectively-once semantics depend on connector implementation.


---

<!-- 265_SOURCE_GUARANTEE.md -->

# Source Guarantee

## What / Why
Pulsar can control write-to-topic guarantee for source connector.

## Visual
```text
Source Guarantee → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Source Guarantee:** Pulsar can control write-to-topic guarantee for source connector.


---

<!-- 266_SINK_GUARANTEE.md -->

# Sink Guarantee

## What / Why
End-to-end guarantee depends on external sink idempotency/transaction support.

## Visual
```text
Sink Guarantee → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Sink Guarantee:** End-to-end guarantee depends on external sink idempotency/transaction support.


---

<!-- 267_BUILT_IN_CONNECTORS.md -->

# Built In Connectors

## What / Why
Pulsar distributions/ecosystem provide connector NARs for databases and systems.

## Visual
```text
Built In Connectors → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Built In Connectors:** Pulsar distributions/ecosystem provide connector NARs for databases and systems.


---

<!-- 268_CUSTOM_CONNECTOR.md -->

# Custom Connector

## What / Why
Implement Source/Sink interface and package as NAR.

## Visual
```text
Custom Connector → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Custom Connector:** Implement Source/Sink interface and package as NAR.


---

<!-- 269_CONNECTOR_CONFIG.md -->

# Connector Config

## What / Why
YAML/CLI/admin API configure class, topics, parallelism and guarantees.

## Visual
```text
Connector Config → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Connector Config:** YAML/CLI/admin API configure class, topics, parallelism and guarantees.


---

<!-- 270_CONNECTOR_SECRETS.md -->

# Connector Secrets

## What / Why
Use supported secret providers.

## Visual
```text
Connector Secrets → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Connector Secrets:** Use supported secret providers.


---

<!-- 271_CONNECTOR_MONITORING.md -->

# Connector Monitoring

## What / Why
Monitor status, instances, failures and throughput.

## Visual
```text
Connector Monitoring → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Connector Monitoring:** Monitor status, instances, failures and throughput.


---

<!-- 272_KAFKA_CONNECT_VS_PULSAR_IO.md -->

# Kafka Connect vs Pulsar IO

## What / Why
Both integrate external systems, but runtime/plugin ecosystems and semantics differ.

## Visual
```text
Kafka Connect vs Pulsar IO → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Kafka Connect vs Pulsar IO:** Both integrate external systems, but runtime/plugin ecosystems and semantics differ.


---

<!-- 273_TIERED_STORAGE_MENTAL_MODEL.md -->

# Tiered Storage Mental Model

## What / Why
Move sealed immutable BookKeeper ledgers to cheaper long-term storage while retaining transparent reads.

## Visual
```text
Tiered Storage Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tiered Storage Mental Model:** Move sealed immutable BookKeeper ledgers to cheaper long-term storage while retaining transparent reads.


---

<!-- 274_OFFLOAD_ELIGIBILITY.md -->

# Offload Eligibility

## What / Why
Closed ledgers/segments can be offloaded; active ledger remains in BookKeeper.

## Visual
```text
Offload Eligibility → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Offload Eligibility:** Closed ledgers/segments can be offloaded; active ledger remains in BookKeeper.


---

<!-- 275_OFFLOADER.md -->

# Offloader

## What / Why
Plugin handles external object/filesystem storage.

## Visual
```text
Offloader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Offloader:** Plugin handles external object/filesystem storage.


---

<!-- 276_S3_OFFLOADER.md -->

# S3 Offloader

## What / Why
Offload to Amazon S3/S3-compatible storage.

## Visual
```text
S3 Offloader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **S3 Offloader:** Offload to Amazon S3/S3-compatible storage.


---

<!-- 277_GCS_OFFLOADER.md -->

# GCS Offloader

## What / Why
Offload to Google Cloud Storage.

## Visual
```text
GCS Offloader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **GCS Offloader:** Offload to Google Cloud Storage.


---

<!-- 278_AZURE_OFFLOADER.md -->

# Azure Offloader

## What / Why
Offload to Azure Blob storage.

## Visual
```text
Azure Offloader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Azure Offloader:** Offload to Azure Blob storage.


---

<!-- 279_FILESYSTEM_OFFLOADER.md -->

# Filesystem Offloader

## What / Why
Use Hadoop-compatible filesystem backend.

## Visual
```text
Filesystem Offloader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Filesystem Offloader:** Use Hadoop-compatible filesystem backend.


---

<!-- 280_OFFLOAD_THRESHOLD.md -->

# Offload Threshold

## What / Why
Policy can trigger by backlog/size/time conditions.

## Visual
```text
Offload Threshold → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Offload Threshold:** Policy can trigger by backlog/size/time conditions.


---

<!-- 281_MANUAL_OFFLOAD.md -->

# Manual Offload

## What / Why
Admin can explicitly trigger offload.

## Visual
```text
Manual Offload → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Manual Offload:** Admin can explicitly trigger offload.


---

<!-- 282_REMOTE_READ.md -->

# Remote Read

## What / Why
Broker transparently reads old data from tiered storage.

## Visual
```text
Remote Read → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Remote Read:** Broker transparently reads old data from tiered storage.


---

<!-- 283_BOOKKEEPER_DELETION_AFTER_OFFLOAD.md -->

# BookKeeper Deletion After Offload

## What / Why
Original BookKeeper ledgers may be removed after safe offload and retention conditions.

## Visual
```text
BookKeeper Deletion After Offload → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **BookKeeper Deletion After Offload:** Original BookKeeper ledgers may be removed after safe offload and retention conditions.


---

<!-- 284_TIERED_STORAGE_ECONOMICS.md -->

# Tiered Storage Economics

## What / Why
Reduces hot storage cost for very long backlog/history.

## Visual
```text
Tiered Storage Economics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tiered Storage Economics:** Reduces hot storage cost for very long backlog/history.


---

<!-- 285_TIERED_STORAGE_LATENCY.md -->

# Tiered Storage Latency

## What / Why
Historical reads from remote object storage are slower.

## Visual
```text
Tiered Storage Latency → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tiered Storage Latency:** Historical reads from remote object storage are slower.


---

<!-- 286_OFFLOADER_DISTRIBUTION.md -->

# Offloader Distribution

## What / Why
Offloader binaries/plugins must be deployed where brokers need them.

## Visual
```text
Offloader Distribution → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Offloader Distribution:** Offloader binaries/plugins must be deployed where brokers need them.


---

<!-- 287_INCOMPLETE_MULTIPART_UPLOAD.md -->

# Incomplete Multipart Upload

## What / Why
Object-store lifecycle cleanup should remove abandoned multipart uploads.

## Visual
```text
Incomplete Multipart Upload → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Incomplete Multipart Upload:** Object-store lifecycle cleanup should remove abandoned multipart uploads.


---

<!-- 288_TIERED_STORAGE_MONITORING.md -->

# Tiered Storage Monitoring

## What / Why
Track offload bytes/errors/read latency and backlog.

## Visual
```text
Tiered Storage Monitoring → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tiered Storage Monitoring:** Track offload bytes/errors/read latency and backlog.


---

<!-- 289_GEO_REPLICATION_MENTAL_MODEL.md -->

# Geo Replication Mental Model

## What / Why
Persist locally first, then asynchronously replicate topic data to remote Pulsar clusters.

## Visual
```text
Geo Replication Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Geo Replication Mental Model:** Persist locally first, then asynchronously replicate topic data to remote Pulsar clusters.


---

<!-- 290_LOCAL_FIRST_PERSISTENCE.md -->

# Local First Persistence

## What / Why
Producer success is based on local cluster persistence; remote replication follows asynchronously.

## Visual
```text
Local First Persistence → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Local First Persistence:** Producer success is based on local cluster persistence; remote replication follows asynchronously.


---

<!-- 291_REPLICATOR.md -->

# Replicator

## What / Why
Broker-managed producer/consumer process tails local topic and publishes remotely.

## Visual
```text
Replicator → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replicator:** Broker-managed producer/consumer process tails local topic and publishes remotely.


---

<!-- 292_NAMESPACE_REPLICATION_CLUSTERS.md -->

# Namespace Replication Clusters

## What / Why
Geo-replication is configured through namespace replication policies.

## Visual
```text
Namespace Replication Clusters → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Replication Clusters:** Geo-replication is configured through namespace replication policies.


---

<!-- 293_TENANT_ALLOWED_CLUSTERS.md -->

# Tenant Allowed Clusters

## What / Why
Tenant must be authorized for participating clusters.

## Visual
```text
Tenant Allowed Clusters → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tenant Allowed Clusters:** Tenant must be authorized for participating clusters.


---

<!-- 294_GLOBAL_TOPIC.md -->

# Global Topic

## What / Why
Topic under namespace replicated across multiple clusters.

## Visual
```text
Global Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Global Topic:** Topic under namespace replicated across multiple clusters.


---

<!-- 295_GEO_REPLICATION_ASYNC.md -->

# Geo Replication Async

## What / Why
WAN failures do not normally block local producer/consumer operation.

## Visual
```text
Geo Replication Async → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Geo Replication Async:** WAN failures do not normally block local producer/consumer operation.


---

<!-- 296_REPLICATION_BACKLOG.md -->

# Replication Backlog

## What / Why
WAN outage creates replication backlog.

## Visual
```text
Replication Backlog → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replication Backlog:** WAN outage creates replication backlog.


---

<!-- 297_REPLICATION_LATENCY.md -->

# Replication Latency

## What / Why
Remote delivery latency is influenced by inter-region RTT and backlog.

## Visual
```text
Replication Latency → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replication Latency:** Remote delivery latency is influenced by inter-region RTT and backlog.


---

<!-- 298_SUBSCRIPTION_LOCALITY.md -->

# Subscription Locality

## What / Why
Subscriptions are local to each cluster by default; same subscription name in another cluster is a different cursor.

## Visual
```text
Subscription Locality → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Locality:** Subscriptions are local to each cluster by default; same subscription name in another cluster is a different cursor.


---

<!-- 299_REPLICATED_SUBSCRIPTIONS.md -->

# Replicated Subscriptions

## What / Why
Feature can replicate subscription state for selected failover patterns.

## Visual
```text
Replicated Subscriptions → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replicated Subscriptions:** Feature can replicate subscription state for selected failover patterns.


---

<!-- 300_CONFLICT_SEMANTICS.md -->

# Conflict Semantics

## What / Why
Active-active producers across regions require business-level conflict/order design.

## Visual
```text
Conflict Semantics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Conflict Semantics:** Active-active producers across regions require business-level conflict/order design.


---

<!-- 301_GEO_REPLICATION_LOOPS.md -->

# Geo Replication Loops

## What / Why
Replication logic tracks origins to avoid simple replication loops.

## Visual
```text
Geo Replication Loops → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Geo Replication Loops:** Replication logic tracks origins to avoid simple replication loops.


---

<!-- 302_INDEPENDENT_CONFIG_STORES.md -->

# Independent Config Stores

## What / Why
Clusters can maintain independent metadata/config stores with matching replication configuration.

## Visual
```text
Independent Config Stores → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Independent Config Stores:** Clusters can maintain independent metadata/config stores with matching replication configuration.


---

<!-- 303_SHARED_CONFIG_STORE.md -->

# Shared Config Store

## What / Why
Clusters can share configuration metadata under supported topology.

## Visual
```text
Shared Config Store → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Shared Config Store:** Clusters can share configuration metadata under supported topology.


---

<!-- 304_GEO_FAILOVER.md -->

# Geo Failover

## What / Why
Clients can use multiple service URLs or external routing for cluster failover.

## Visual
```text
Geo Failover → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Geo Failover:** Clients can use multiple service URLs or external routing for cluster failover.


---

<!-- 305_RPO.md -->

# RPO

## What / Why
Asynchronous replication implies non-zero data-loss window during regional failure unless application designs compensate.

## Visual
```text
RPO → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **RPO:** Asynchronous replication implies non-zero data-loss window during regional failure unless application designs compensate.


---

<!-- 306_RTO.md -->

# RTO

## What / Why
Failover automation/client configuration determines recovery time.

## Visual
```text
RTO → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **RTO:** Failover automation/client configuration determines recovery time.


---

<!-- 307_DR_TESTING.md -->

# DR Testing

## What / Why
Regularly test regional outage, backlog catch-up and failback.

## Visual
```text
DR Testing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **DR Testing:** Regularly test regional outage, backlog catch-up and failback.


---

<!-- 308_CLIENT_CLUSTER_FAILOVER.md -->

# Client Cluster Failover

## What / Why
Clients can be configured with primary and secondary Pulsar service URLs.

## Visual
```text
Client Cluster Failover → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Client Cluster Failover:** Clients can be configured with primary and secondary Pulsar service URLs.


---

<!-- 309_AUTO_CLUSTER_FAILOVER.md -->

# Auto Cluster Failover

## What / Why
Client switches to secondary cluster after primary failure conditions.

## Visual
```text
Auto Cluster Failover → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Auto Cluster Failover:** Client switches to secondary cluster after primary failure conditions.


---

<!-- 310_CONTROLLED_FAILOVER.md -->

# Controlled Failover

## What / Why
Operator can direct clients to secondary cluster under controlled migration.

## Visual
```text
Controlled Failover → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Controlled Failover:** Operator can direct clients to secondary cluster under controlled migration.


---

<!-- 311_FAILBACK.md -->

# Failback

## What / Why
Return to primary after recovery under configured policy.

## Visual
```text
Failback → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Failback:** Return to primary after recovery under configured policy.


---

<!-- 312_FAILOVER_VS_GEO_REPLICATION.md -->

# Failover vs Geo Replication

## What / Why
Client endpoint failover and data replication are separate concerns.

## Visual
```text
Failover vs Geo Replication → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Failover vs Geo Replication:** Client endpoint failover and data replication are separate concerns.


---

<!-- 313_FAILOVER_DATA_READINESS.md -->

# Failover Data Readiness

## What / Why
Secondary cluster must have required topics/data/schema/config/subscription state.

## Visual
```text
Failover Data Readiness → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Failover Data Readiness:** Secondary cluster must have required topics/data/schema/config/subscription state.


---

<!-- 314_TOPIC_COMPACTION_MENTAL_MODEL.md -->

# Topic Compaction Mental Model

## What / Why
Create a latest-value-per-key view for keyed topics.

## Visual
```text
Topic Compaction Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Compaction Mental Model:** Create a latest-value-per-key view for keyed topics.


---

<!-- 315_COMPACTOR.md -->

# Compactor

## What / Why
Service reads topic and writes compacted ledger.

## Visual
```text
Compactor → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compactor:** Service reads topic and writes compacted ledger.


---

<!-- 316_COMPACTED_LEDGER.md -->

# Compacted Ledger

## What / Why
Special ledger containing latest surviving key/value records.

## Visual
```text
Compacted Ledger → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compacted Ledger:** Special ledger containing latest surviving key/value records.


---

<!-- 317_COMPACTION_THRESHOLD.md -->

# Compaction Threshold

## What / Why
Namespace policy controls when compaction may be triggered.

## Visual
```text
Compaction Threshold → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compaction Threshold:** Namespace policy controls when compaction may be triggered.


---

<!-- 318_COMPACTED_READER.md -->

# Compacted Reader

## What / Why
Consumers/readers can request compacted view.

## Visual
```text
Compacted Reader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compacted Reader:** Consumers/readers can request compacted view.


---

<!-- 319_TOMBSTONES.md -->

# Tombstones

## What / Why
Null/empty keyed entries remove prior key state from compacted view.

## Visual
```text
Tombstones → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tombstones:** Null/empty keyed entries remove prior key state from compacted view.


---

<!-- 320_COMPACTION_VS_RETENTION.md -->

# Compaction vs Retention

## What / Why
Compaction is logical latest-state view; retention governs historical storage lifetime.

## Visual
```text
Compaction vs Retention → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compaction vs Retention:** Compaction is logical latest-state view; retention governs historical storage lifetime.


---

<!-- 321_COMPACTION_USE_CASES.md -->

# Compaction Use Cases

## What / Why
Configuration/state tables, CDC latest-state views, materialized caches.

## Visual
```text
Compaction Use Cases → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compaction Use Cases:** Configuration/state tables, CDC latest-state views, materialized caches.


---

<!-- 322_PULSAR_SECURITY_MODEL.md -->

# Pulsar Security Model

## What / Why
TLS + authentication + role-based authorization + tenant/namespace/topic permissions.

## Visual
```text
Pulsar Security Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Security Model:** TLS + authentication + role-based authorization + tenant/namespace/topic permissions.


---

<!-- 323_TLS.md -->

# TLS

## What / Why
Encrypt client/broker/proxy/inter-node connections.

## Visual
```text
TLS → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **TLS:** Encrypt client/broker/proxy/inter-node connections.


---

<!-- 324_MTLS.md -->

# mTLS

## What / Why
Authenticate clients using certificates.

## Visual
```text
mTLS → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **mTLS:** Authenticate clients using certificates.


---

<!-- 325_TOKEN_AUTHENTICATION.md -->

# Token Authentication

## What / Why
JWT-style token authentication.

## Visual
```text
Token Authentication → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Token Authentication:** JWT-style token authentication.


---

<!-- 326_OAUTH2.md -->

# OAuth2

## What / Why
OAuth/OIDC-oriented authentication support.

## Visual
```text
OAuth2 → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **OAuth2:** OAuth/OIDC-oriented authentication support.


---

<!-- 327_KERBEROS.md -->

# Kerberos

## What / Why
Kerberos support in applicable deployments.

## Visual
```text
Kerberos → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Kerberos:** Kerberos support in applicable deployments.


---

<!-- 328_AUTHENTICATION_PROVIDER.md -->

# Authentication Provider

## What / Why
Pluggable component maps credentials to role.

## Visual
```text
Authentication Provider → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Authentication Provider:** Pluggable component maps credentials to role.


---

<!-- 329_ROLE.md -->

# Role

## What / Why
Identity token used for authorization.

## Visual
```text
Role → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Role:** Identity token used for authorization.


---

<!-- 330_SUPERUSER_ROLE.md -->

# Superuser Role

## What / Why
Cluster-wide privileged administrative role.

## Visual
```text
Superuser Role → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Superuser Role:** Cluster-wide privileged administrative role.


---

<!-- 331_TENANT_ADMIN_ROLE.md -->

# Tenant Admin Role

## What / Why
Administrative role scoped to tenant resources.

## Visual
```text
Tenant Admin Role → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tenant Admin Role:** Administrative role scoped to tenant resources.


---

<!-- 332_NAMESPACE_PERMISSION.md -->

# Namespace Permission

## What / Why
Grant produce/consume/functions/sources/sinks/etc actions by role.

## Visual
```text
Namespace Permission → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Permission:** Grant produce/consume/functions/sources/sinks/etc actions by role.


---

<!-- 333_TOPIC_PERMISSION.md -->

# Topic Permission

## What / Why
Permissions can be granted at individual topic level.

## Visual
```text
Topic Permission → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Permission:** Permissions can be granted at individual topic level.


---

<!-- 334_PROXY_AUTHORIZATION.md -->

# Proxy Authorization

## What / Why
Proxy may forward original role while authenticating itself.

## Visual
```text
Proxy Authorization → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Proxy Authorization:** Proxy may forward original role while authenticating itself.


---

<!-- 335_AUTHORIZATION_CACHING.md -->

# Authorization Caching

## What / Why
Broker caches authorization decisions for efficiency.

## Visual
```text
Authorization Caching → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Authorization Caching:** Broker caches authorization decisions for efficiency.


---

<!-- 336_SECRETS_MANAGEMENT.md -->

# Secrets Management

## What / Why
Do not embed credentials in client code/function config.

## Visual
```text
Secrets Management → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Secrets Management:** Do not embed credentials in client code/function config.


---

<!-- 337_CLIENT_SIDE_ENCRYPTION.md -->

# Client Side Encryption

## What / Why
Producer encrypts payload and authorized consumer decrypts.

## Visual
```text
Client Side Encryption → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Client Side Encryption:** Producer encrypts payload and authorized consumer decrypts.


---

<!-- 338_KEY_READER.md -->

# Key Reader

## What / Why
Consumer-side key retrieval interface for encrypted messages.

## Visual
```text
Key Reader → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Key Reader:** Consumer-side key retrieval interface for encrypted messages.


---

<!-- 339_NETWORK_ISOLATION.md -->

# Network Isolation

## What / Why
Separate admin, broker, proxy and BookKeeper networks where appropriate.

## Visual
```text
Network Isolation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Network Isolation:** Separate admin, broker, proxy and BookKeeper networks where appropriate.


---

<!-- 340_HIGH_VALUE_COMPARISONS.md -->

# Pulsar — High-Value Comparisons

## Subscription Types
| Type | Consumers | Ordering |
|---|---:|---|
| Exclusive | 1 active | strongest/simple |
| Failover | active + standby | per partition active consumer |
| Shared | many | no ordering guarantee |
| Key_Shared | many | same key kept together |

## Pulsar vs Kafka
| Pulsar | Kafka |
|---|---|
| stateless brokers | brokers also host partition storage |
| BookKeeper storage | broker-local log storage + tiering |
| subscription types | consumer groups/share groups |
| tenant/namespace first-class | topic/group administrative model |
| native geo replication | cross-cluster replication tooling |

## Pulsar vs RabbitMQ
| Pulsar | RabbitMQ |
|---|---|
| messaging + retained streaming | exchange/queue broker + streams |
| BookKeeper | queue/stream storage inside RabbitMQ cluster |
| Exclusive/Failover/Shared/Key_Shared | competing consumers/SAC |
| built-in tenants/namespaces | vhosts |

## Reader vs Consumer
| Reader | Consumer |
|---|---|
| explicit MessageId cursor | subscription cursor |
| replay-oriented | delivery semantics |
| no normal subscription ownership | durable subscription state |

## Retention vs Backlog
| Retention | Backlog |
|---|---|
| acknowledged history kept by policy | unread/unacked subscription data |
| supports replay | driven by cursor position |


---

<!-- 340_LEAST_PRIVILEGE.md -->

# Least Privilege

## What / Why
Separate producer/consumer/admin roles and narrow namespace/topic rights.

## Visual
```text
Least Privilege → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Least Privilege:** Separate producer/consumer/admin roles and narrow namespace/topic rights.


---

<!-- 341_DISPATCH_RATE.md -->

# Dispatch Rate

## What / Why
Limit message delivery rate per topic/subscription/namespace.

## Visual
```text
Dispatch Rate → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Dispatch Rate:** Limit message delivery rate per topic/subscription/namespace.


---

<!-- 341_INTERVIEW_TRAPS.md -->

# Pulsar Interview Traps

1. Pulsar broker and storage layers are separated.
2. Persistent topic data is stored in BookKeeper, not owned durably by the serving broker.
3. A broker failure does not imply topic data loss if BookKeeper remains healthy.
4. Managed Ledger is composed of BookKeeper ledgers.
5. Ensemble size, write quorum and ack quorum are distinct.
6. Subscription is more than a consumer group name; it owns cursor/backlog and dispatch semantics.
7. Shared subscription does not guarantee ordering.
8. Key_Shared requires stable keys and compatible batching.
9. Failover is active-standby, not parallel load balancing.
10. Exclusive allows only one consumer.
11. Reader is not the same as Consumer.
12. Backlog and retention are different concepts.
13. Retention can preserve already acknowledged data.
14. Topic compaction is not the same as retention.
15. Geo-replication is asynchronous and local-first.
16. Geo-replication replicates topic data; subscriptions are cluster-local by default.
17. Transactions span Pulsar topics/partitions, not arbitrary external DBs.
18. Deduplication does not eliminate duplicate business side effects outside Pulsar.
19. Functions at-least-once is the default processing guarantee.
20. IO sink guarantees depend on the external sink implementation too.
21. Tiered storage offloads sealed ledgers, not the active ledger.
22. Tiered storage reads remain transparent to consumers but have different latency.
23. Multi-tenancy is first-class through tenants and namespaces.
24. Namespace bundle is a broker load-balancing unit.
25. Bookie scaling and broker scaling solve different bottlenecks.
26. Metadata-store availability affects coordination even if BookKeeper data remains.
27. Pulsar 5.0.0-M1 is preview, not production GA.
28. Latest stable does not always mean best support horizon: 4.0.x is the current LTS line.
29. Pulsar is not simply “Kafka plus queues.”
30. Kafka compatibility layers do not erase architectural differences.


---

<!-- 342_PRODUCTION_CHECKLIST.md -->

# Pulsar Production Readiness Checklist

## Platform
- metadata-store quorum
- broker capacity
- BookKeeper ensemble/write/ack quorum
- journal/ledger disk layout
- failure/recovery headroom

## Governance
- tenant owner
- namespace policies
- permissions
- isolation
- throttling
- backlog quota
- retention

## Topics
- persistent/non-persistent
- partition count
- schema
- compaction
- tiered storage
- geo replication

## Consumers
- correct subscription type
- ack strategy
- redelivery/backoff
- DLQ
- idempotency
- replay safety

## Operations
- broker ownership/load
- BookKeeper under-replication
- metadata health
- backlog age
- geo replication lag
- offload failures
- DR/failover drills


---

<!-- 342_PUBLISH_RATE.md -->

# Publish Rate

## What / Why
Limit producer publish rate.

## Visual
```text
Publish Rate → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Publish Rate:** Limit producer publish rate.


---

<!-- 343_SUBSCRIBE_RATE.md -->

# Subscribe Rate

## What / Why
Limit subscription creation/subscribe rate.

## Visual
```text
Subscribe Rate → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscribe Rate:** Limit subscription creation/subscribe rate.


---

<!-- 343_TROUBLESHOOTING_FLOW.md -->

# Pulsar Troubleshooting — Golden Flow

```text
1. Client / Lookup
   ├─ service URL?
   ├─ auth?
   └─ topic owner?

2. Broker
   ├─ owns topic?
   ├─ throttled?
   ├─ cache/memory?
   └─ producer/consumer stats?

3. Managed Ledger / BookKeeper
   ├─ quorum healthy?
   ├─ bookie disk/journal?
   ├─ under-replicated?
   └─ ledger recovery?

4. Subscription
   ├─ correct type?
   ├─ cursor/backlog?
   ├─ unacked?
   └─ redelivery/DLQ?

5. Downstream
   ├─ handler errors?
   ├─ idempotency?
   └─ business dependency?
```


---

<!-- 344_REPLICATOR_RATE.md -->

# Replicator Rate

## What / Why
Control geo-replication throughput.

## Visual
```text
Replicator Rate → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replicator Rate:** Control geo-replication throughput.


---

<!-- 344_SOURCES.md -->

# Sources & Accuracy Notes

Primary baseline: Apache Pulsar official documentation and release information.

Current verified facts:
- Pulsar 4.2.4 released August 3, 2026.
- Pulsar 4.2 active/security support ends September 24, 2026.
- Pulsar 4.0.13 is the current LTS patch; security support runs through October 21, 2027.
- Pulsar 5.0.0-M1 is a preview and is explicitly not intended for production.
- Brokers are stateless serving components; BookKeeper bookies persist messages.
- Metadata store handles coordination and cluster metadata.
- Pulsar has Exclusive, Shared, Failover and Key_Shared subscription types.
- Key_Shared requires key-aware batching or compatible batching behavior.
- Pulsar is built as a multi-tenant system with tenant/namespace policy boundaries.
- Geo-replication persists locally then forwards asynchronously; subscriptions are local to each cluster by default.
- Pulsar IO provides source and sink connectors.
- Pulsar Functions supports at-most-once, at-least-once, effectively-once and manual processing modes.
- Tiered Storage offloads sealed BookKeeper ledgers to long-term storage.

Always verify exact patch-level docs and client compatibility before production configuration changes.


---

<!-- 345_RESOURCE_GROUPS.md -->

# Resource Groups

## What / Why
Group namespaces/tenants under shared publish/dispatch rate limits.

## Visual
```text
Resource Groups → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Resource Groups:** Group namespaces/tenants under shared publish/dispatch rate limits.


---

<!-- 346_BACKLOG_QUOTA.md -->

# Backlog Quota

## What / Why
Protect storage from unlimited unconsumed data.

## Visual
```text
Backlog Quota → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog Quota:** Protect storage from unlimited unconsumed data.


---

<!-- 347_PRODUCER_PENDING_QUEUE.md -->

# Producer Pending Queue

## What / Why
Client-side backpressure when producer buffer is full.

## Visual
```text
Producer Pending Queue → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Pending Queue:** Client-side backpressure when producer buffer is full.


---

<!-- 348_BROKER_BACKPRESSURE.md -->

# Broker Backpressure

## What / Why
Broker can throttle/limit based on configured resource controls.

## Visual
```text
Broker Backpressure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Backpressure:** Broker can throttle/limit based on configured resource controls.


---

<!-- 349_BOOKKEEPER_SATURATION.md -->

# BookKeeper Saturation

## What / Why
Storage latency can back up broker writes and producer latency.

## Visual
```text
BookKeeper Saturation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **BookKeeper Saturation:** Storage latency can back up broker writes and producer latency.


---

<!-- 350_SLOW_CONSUMER.md -->

# Slow Consumer

## What / Why
Builds subscription backlog and potentially remote/tiered read pressure.

## Visual
```text
Slow Consumer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Slow Consumer:** Builds subscription backlog and potentially remote/tiered read pressure.


---

<!-- 351_THROTTLING_GOVERNANCE.md -->

# Throttling Governance

## What / Why
Use tenant/namespace policies to prevent noisy neighbors.

## Visual
```text
Throttling Governance → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Throttling Governance:** Use tenant/namespace policies to prevent noisy neighbors.


---

<!-- 352_NAMESPACE_BUNDLE_OWNERSHIP.md -->

# Namespace Bundle Ownership

## What / Why
Brokers own bundles rather than individual namespace as one indivisible unit.

## Visual
```text
Namespace Bundle Ownership → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Bundle Ownership:** Brokers own bundles rather than individual namespace as one indivisible unit.


---

<!-- 353_DYNAMIC_LOAD_BALANCING.md -->

# Dynamic Load Balancing

## What / Why
Load manager moves/unloads bundles across brokers.

## Visual
```text
Dynamic Load Balancing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Dynamic Load Balancing:** Load manager moves/unloads bundles across brokers.


---

<!-- 354_BUNDLE_SPLIT.md -->

# Bundle Split

## What / Why
Large/hot bundles can split for finer distribution.

## Visual
```text
Bundle Split → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bundle Split:** Large/hot bundles can split for finer distribution.


---

<!-- 355_UNLOAD.md -->

# Unload

## What / Why
Explicitly move bundle ownership by unloading.

## Visual
```text
Unload → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Unload:** Explicitly move bundle ownership by unloading.


---

<!-- 356_BROKER_ISOLATION_POLICY.md -->

# Broker Isolation Policy

## What / Why
Restrict namespaces to primary/secondary broker pools.

## Visual
```text
Broker Isolation Policy → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Isolation Policy:** Restrict namespaces to primary/secondary broker pools.


---

<!-- 357_BOOKIE_ISOLATION.md -->

# Bookie Isolation

## What / Why
Bookie affinity groups restrict storage placement.

## Visual
```text
Bookie Isolation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Isolation:** Bookie affinity groups restrict storage placement.


---

<!-- 358_NOISY_NEIGHBOR.md -->

# Noisy Neighbor

## What / Why
Large tenants can consume broker and storage resources unless isolated/throttled.

## Visual
```text
Noisy Neighbor → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Noisy Neighbor:** Large tenants can consume broker and storage resources unless isolated/throttled.


---

<!-- 359_MILLION_TOPIC_DESIGN.md -->

# Million Topic Design

## What / Why
Storage separation and bundle ownership allow very large topic counts, but metadata/client overhead still matters.

## Visual
```text
Million Topic Design → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Million Topic Design:** Storage separation and bundle ownership allow very large topic counts, but metadata/client overhead still matters.


---

<!-- 360_TOPIC_DENSITY.md -->

# Topic Density

## What / Why
High topic count impacts broker ownership, memory, metadata and connection fanout.

## Visual
```text
Topic Density → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Density:** High topic count impacts broker ownership, memory, metadata and connection fanout.


---

<!-- 361_PULSAR_OBSERVABILITY_MODEL.md -->

# Pulsar Observability Model

## What / Why
Monitor brokers, BookKeeper, metadata store, topics, subscriptions, producers, consumers and geo replication.

## Visual
```text
Pulsar Observability Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Observability Model:** Monitor brokers, BookKeeper, metadata store, topics, subscriptions, producers, consumers and geo replication.


---

<!-- 362_BROKER_METRICS.md -->

# Broker Metrics

## What / Why
Publish, dispatch, connections, ownership, cache and latency.

## Visual
```text
Broker Metrics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Metrics:** Publish, dispatch, connections, ownership, cache and latency.


---

<!-- 363_BOOKKEEPER_METRICS.md -->

# BookKeeper Metrics

## What / Why
Journal, ledger storage, write/read latency, under-replication.

## Visual
```text
BookKeeper Metrics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **BookKeeper Metrics:** Journal, ledger storage, write/read latency, under-replication.


---

<!-- 364_METADATA_STORE_METRICS.md -->

# Metadata Store Metrics

## What / Why
Session/quorum/latency/operation failures.

## Visual
```text
Metadata Store Metrics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Metadata Store Metrics:** Session/quorum/latency/operation failures.


---

<!-- 365_PUBLISH_LATENCY.md -->

# Publish Latency

## What / Why
End-to-end producer/broker/BookKeeper acknowledgement latency.

## Visual
```text
Publish Latency → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Publish Latency:** End-to-end producer/broker/BookKeeper acknowledgement latency.


---

<!-- 366_DISPATCH_LATENCY.md -->

# Dispatch Latency

## What / Why
Broker-to-consumer delivery latency.

## Visual
```text
Dispatch Latency → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Dispatch Latency:** Broker-to-consumer delivery latency.


---

<!-- 367_BACKLOG_SIZE.md -->

# Backlog Size

## What / Why
Messages/bytes behind subscription cursor.

## Visual
```text
Backlog Size → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog Size:** Messages/bytes behind subscription cursor.


---

<!-- 368_BACKLOG_AGE.md -->

# Backlog Age

## What / Why
Age of oldest unacknowledged message.

## Visual
```text
Backlog Age → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog Age:** Age of oldest unacknowledged message.


---

<!-- 369_CONSUMER_RATE.md -->

# Consumer Rate

## What / Why
Messages/bytes consumed per second.

## Visual
```text
Consumer Rate → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Consumer Rate:** Messages/bytes consumed per second.


---

<!-- 370_REDELIVERY_RATE.md -->

# Redelivery Rate

## What / Why
Frequency of message redelivery.

## Visual
```text
Redelivery Rate → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Redelivery Rate:** Frequency of message redelivery.


---

<!-- 371_UNACKED_MESSAGES.md -->

# Unacked Messages

## What / Why
Messages delivered but not acknowledged.

## Visual
```text
Unacked Messages → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Unacked Messages:** Messages delivered but not acknowledged.


---

<!-- 372_SUBSCRIPTION_COUNT.md -->

# Subscription Count

## What / Why
Subscriptions per topic/namespace.

## Visual
```text
Subscription Count → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Count:** Subscriptions per topic/namespace.


---

<!-- 373_PRODUCER_COUNT.md -->

# Producer Count

## What / Why
Active producers.

## Visual
```text
Producer Count → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Count:** Active producers.


---

<!-- 374_CONSUMER_COUNT.md -->

# Consumer Count

## What / Why
Active consumers.

## Visual
```text
Consumer Count → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Consumer Count:** Active consumers.


---

<!-- 375_STORAGE_SIZE.md -->

# Storage Size

## What / Why
Managed ledger storage footprint.

## Visual
```text
Storage Size → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Storage Size:** Managed ledger storage footprint.


---

<!-- 376_OFFLOAD_METRICS.md -->

# Offload Metrics

## What / Why
Tiered storage copy/read bytes and failures.

## Visual
```text
Offload Metrics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Offload Metrics:** Tiered storage copy/read bytes and failures.


---

<!-- 377_REPLICATION_METRICS.md -->

# Replication Metrics

## What / Why
Geo replication rate/backlog/latency.

## Visual
```text
Replication Metrics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replication Metrics:** Geo replication rate/backlog/latency.


---

<!-- 378_FUNCTION_METRICS.md -->

# Function Metrics

## What / Why
Processing rate, failures and custom metrics.

## Visual
```text
Function Metrics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Metrics:** Processing rate, failures and custom metrics.


---

<!-- 379_IO_METRICS.md -->

# IO Metrics

## What / Why
Source/sink connector status/throughput.

## Visual
```text
IO Metrics → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **IO Metrics:** Source/sink connector status/throughput.


---

<!-- 380_PROMETHEUS.md -->

# Prometheus

## What / Why
Pulsar exposes Prometheus-compatible metrics.

## Visual
```text
Prometheus → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Prometheus:** Pulsar exposes Prometheus-compatible metrics.


---

<!-- 381_GRAFANA.md -->

# Grafana

## What / Why
Common dashboard layer for Pulsar/BookKeeper metrics.

## Visual
```text
Grafana → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Grafana:** Common dashboard layer for Pulsar/BookKeeper metrics.


---

<!-- 382_TRACING.md -->

# Tracing

## What / Why
Propagate trace IDs in message properties and instrument producer/consumer operations.

## Visual
```text
Tracing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tracing:** Propagate trace IDs in message properties and instrument producer/consumer operations.


---

<!-- 383_BUSINESS_EVENT_SLO.md -->

# Business Event SLO

## What / Why
Measure publish-to-business-effect latency.

## Visual
```text
Business Event SLO → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Business Event SLO:** Measure publish-to-business-effect latency.


---

<!-- 384_PULSAR_ADMIN.md -->

# pulsar-admin

## What / Why
Primary CLI for tenants, namespaces, topics, schemas, functions, sources and sinks.

## Visual
```text
pulsar-admin → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **pulsar-admin:** Primary CLI for tenants, namespaces, topics, schemas, functions, sources and sinks.


---

<!-- 385_REST_ADMIN_API.md -->

# REST Admin API

## What / Why
HTTP administrative API.

## Visual
```text
REST Admin API → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **REST Admin API:** HTTP administrative API.


---

<!-- 386_JAVA_ADMIN_API.md -->

# Java Admin API

## What / Why
Programmatic admin client.

## Visual
```text
Java Admin API → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Java Admin API:** Programmatic admin client.


---

<!-- 387_TENANT_CREATE.md -->

# Tenant Create

## What / Why
Provision admin roles and allowed clusters.

## Visual
```text
Tenant Create → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tenant Create:** Provision admin roles and allowed clusters.


---

<!-- 388_NAMESPACE_CREATE.md -->

# Namespace Create

## What / Why
Create policy boundary within tenant.

## Visual
```text
Namespace Create → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Create:** Create policy boundary within tenant.


---

<!-- 389_TOPIC_CREATE.md -->

# Topic Create

## What / Why
Explicit topic creation.

## Visual
```text
Topic Create → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Create:** Explicit topic creation.


---

<!-- 390_PARTITIONED_TOPIC_CREATE.md -->

# Partitioned Topic Create

## What / Why
Create topic with configured partition count.

## Visual
```text
Partitioned Topic Create → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partitioned Topic Create:** Create topic with configured partition count.


---

<!-- 391_PARTITION_UPDATE.md -->

# Partition Update

## What / Why
Increase partition count.

## Visual
```text
Partition Update → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partition Update:** Increase partition count.


---

<!-- 392_TOPIC_STATS.md -->

# Topic Stats

## What / Why
Inspect producers/consumers/subscriptions/backlog/storage.

## Visual
```text
Topic Stats → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Stats:** Inspect producers/consumers/subscriptions/backlog/storage.


---

<!-- 393_INTERNAL_STATS.md -->

# Internal Stats

## What / Why
Inspect managed ledger/BookKeeper details.

## Visual
```text
Internal Stats → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Internal Stats:** Inspect managed ledger/BookKeeper details.


---

<!-- 394_UNLOAD.md -->

# Unload

## What / Why
Move topic/bundle ownership away from current broker.

## Visual
```text
Unload → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Unload:** Move topic/bundle ownership away from current broker.


---

<!-- 395_DELETE_TOPIC.md -->

# Delete Topic

## What / Why
Destructive removal subject to force/active-subscription rules.

## Visual
```text
Delete Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Delete Topic:** Destructive removal subject to force/active-subscription rules.


---

<!-- 396_DELETE_SUBSCRIPTION.md -->

# Delete Subscription

## What / Why
Remove cursor/backlog responsibility.

## Visual
```text
Delete Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Delete Subscription:** Remove cursor/backlog responsibility.


---

<!-- 397_RESET_CURSOR.md -->

# Reset Cursor

## What / Why
Move subscription position for replay.

## Visual
```text
Reset Cursor → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Reset Cursor:** Move subscription position for replay.


---

<!-- 398_SKIP_MESSAGES.md -->

# Skip Messages

## What / Why
Advance cursor across selected messages.

## Visual
```text
Skip Messages → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Skip Messages:** Advance cursor across selected messages.


---

<!-- 399_EXPIRE_MESSAGES.md -->

# Expire Messages

## What / Why
Expire backlog by age/position.

## Visual
```text
Expire Messages → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Expire Messages:** Expire backlog by age/position.


---

<!-- 400_PEEK_MESSAGES.md -->

# Peek Messages

## What / Why
Inspect backlog without normal acknowledgement.

## Visual
```text
Peek Messages → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Peek Messages:** Inspect backlog without normal acknowledgement.


---

<!-- 401_SCHEMA_COMMANDS.md -->

# Schema Commands

## What / Why
Upload/get/delete/extract schemas.

## Visual
```text
Schema Commands → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Commands:** Upload/get/delete/extract schemas.


---

<!-- 402_NAMESPACE_RETENTION.md -->

# Namespace Retention

## What / Why
Configure retained acknowledged history.

## Visual
```text
Namespace Retention → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Namespace Retention:** Configure retained acknowledged history.


---

<!-- 403_BACKLOG_QUOTA_ADMIN.md -->

# Backlog Quota Admin

## What / Why
Set backlog limits/actions.

## Visual
```text
Backlog Quota Admin → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog Quota Admin:** Set backlog limits/actions.


---

<!-- 404_OFFLOAD_ADMIN.md -->

# Offload Admin

## What / Why
Trigger/configure tiered storage.

## Visual
```text
Offload Admin → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Offload Admin:** Trigger/configure tiered storage.


---

<!-- 405_BOOKIE_ADMIN.md -->

# Bookie Admin

## What / Why
BookKeeper CLI handles recovery/listing/maintenance.

## Visual
```text
Bookie Admin → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Admin:** BookKeeper CLI handles recovery/listing/maintenance.


---

<!-- 406_ROLLING_BROKER_RESTART.md -->

# Rolling Broker Restart

## What / Why
Brokers can restart with topic ownership moving to healthy brokers.

## Visual
```text
Rolling Broker Restart → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Rolling Broker Restart:** Brokers can restart with topic ownership moving to healthy brokers.


---

<!-- 407_BOOKIE_MAINTENANCE.md -->

# Bookie Maintenance

## What / Why
Drain/decommission/recover ledgers before bookie removal.

## Visual
```text
Bookie Maintenance → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Maintenance:** Drain/decommission/recover ledgers before bookie removal.


---

<!-- 408_ROLLING_UPGRADE.md -->

# Rolling Upgrade

## What / Why
Follow supported version sequencing across brokers/bookies/functions workers.

## Visual
```text
Rolling Upgrade → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Rolling Upgrade:** Follow supported version sequencing across brokers/bookies/functions workers.


---

<!-- 409_CONFIGURATION_AS_CODE.md -->

# Configuration as Code

## What / Why
Version tenant/namespace/topic/policy/schema configuration.

## Visual
```text
Configuration as Code → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Configuration as Code:** Version tenant/namespace/topic/policy/schema configuration.


---

<!-- 410_CAPACITY_MENTAL_MODEL.md -->

# Capacity Mental Model

## What / Why
Size brokers for connections/dispatch, bookies for storage IOPS/capacity, and metadata store separately.

## Visual
```text
Capacity Mental Model → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Capacity Mental Model:** Size brokers for connections/dispatch, bookies for storage IOPS/capacity, and metadata store separately.


---

<!-- 411_BROKER_THROUGHPUT.md -->

# Broker Throughput

## What / Why
Network, CPU, cache and protocol handling dominate serving tier.

## Visual
```text
Broker Throughput → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Throughput:** Network, CPU, cache and protocol handling dominate serving tier.


---

<!-- 412_BOOKIE_THROUGHPUT.md -->

# Bookie Throughput

## What / Why
Journal, ledger disks, network and quorum settings dominate durable writes.

## Visual
```text
Bookie Throughput → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Throughput:** Journal, ledger disks, network and quorum settings dominate durable writes.


---

<!-- 413_STORAGE_MATH.md -->

# Storage Math

## What / Why
Ingress × retention/backlog × replication/quorum + headroom.

## Visual
```text
Storage Math → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Storage Math:** Ingress × retention/backlog × replication/quorum + headroom.


---

<!-- 414_PUBLISH_FANOUT.md -->

# Publish Fanout

## What / Why
One topic with many subscriptions multiplies dispatch/read work.

## Visual
```text
Publish Fanout → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Publish Fanout:** One topic with many subscriptions multiplies dispatch/read work.


---

<!-- 415_PARTITION_THROUGHPUT.md -->

# Partition Throughput

## What / Why
Partitions spread workload across brokers and ledgers.

## Visual
```text
Partition Throughput → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partition Throughput:** Partitions spread workload across brokers and ledgers.


---

<!-- 416_TOPIC_COUNT.md -->

# Topic Count

## What / Why
Large topic counts require sizing broker memory/metadata and client connections.

## Visual
```text
Topic Count → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Count:** Large topic counts require sizing broker memory/metadata and client connections.


---

<!-- 417_MESSAGE_SIZE.md -->

# Message Size

## What / Why
Large messages stress network/cache/storage; prefer claim-check for huge payloads.

## Visual
```text
Message Size → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Message Size:** Large messages stress network/cache/storage; prefer claim-check for huge payloads.


---

<!-- 418_BATCHING.md -->

# Batching

## What / Why
Improves producer throughput and storage/network efficiency.

## Visual
```text
Batching → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Batching:** Improves producer throughput and storage/network efficiency.


---

<!-- 419_COMPRESSION.md -->

# Compression

## What / Why
Reduces network/storage at CPU cost.

## Visual
```text
Compression → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Compression:** Reduces network/storage at CPU cost.


---

<!-- 420_RECEIVER_QUEUE_SIZE.md -->

# Receiver Queue Size

## What / Why
Client prefetch/buffer affects throughput and memory.

## Visual
```text
Receiver Queue Size → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Receiver Queue Size:** Client prefetch/buffer affects throughput and memory.


---

<!-- 421_CONSUMER_PARALLELISM.md -->

# Consumer Parallelism

## What / Why
Depends on subscription type, keys and partition count.

## Visual
```text
Consumer Parallelism → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Consumer Parallelism:** Depends on subscription type, keys and partition count.


---

<!-- 422_SHARED_PARALLELISM.md -->

# Shared Parallelism

## What / Why
Shared subscription can distribute messages across many consumers.

## Visual
```text
Shared Parallelism → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Shared Parallelism:** Shared subscription can distribute messages across many consumers.


---

<!-- 423_KEY_SHARED_PARALLELISM.md -->

# Key Shared Parallelism

## What / Why
Parallelism is bounded by active keys and key distribution.

## Visual
```text
Key Shared Parallelism → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Key Shared Parallelism:** Parallelism is bounded by active keys and key distribution.


---

<!-- 424_BROKER_CACHE.md -->

# Broker Cache

## What / Why
Recent messages may be served from managed ledger cache rather than BookKeeper.

## Visual
```text
Broker Cache → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Cache:** Recent messages may be served from managed ledger cache rather than BookKeeper.


---

<!-- 425_BACKLOG_READS.md -->

# Backlog Reads

## What / Why
Large old backlog shifts workload to BookKeeper/tiered storage.

## Visual
```text
Backlog Reads → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Backlog Reads:** Large old backlog shifts workload to BookKeeper/tiered storage.


---

<!-- 426_QUORUM_TUNING.md -->

# Quorum Tuning

## What / Why
Ensemble/write/ack quorum affect durability, cost and write latency.

## Visual
```text
Quorum Tuning → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Quorum Tuning:** Ensemble/write/ack quorum affect durability, cost and write latency.


---

<!-- 427_JOURNAL_PLACEMENT.md -->

# Journal Placement

## What / Why
Dedicated fast disks improve BookKeeper journal latency.

## Visual
```text
Journal Placement → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Journal Placement:** Dedicated fast disks improve BookKeeper journal latency.


---

<!-- 428_LEDGER_DISK_CAPACITY.md -->

# Ledger Disk Capacity

## What / Why
Ledger storage benefits from high-capacity throughput-oriented disks.

## Visual
```text
Ledger Disk Capacity → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ledger Disk Capacity:** Ledger storage benefits from high-capacity throughput-oriented disks.


---

<!-- 429_RECOVERY_HEADROOM.md -->

# Recovery Headroom

## What / Why
Reserve capacity for broker failover, ledger rereplication and geo catch-up.

## Visual
```text
Recovery Headroom → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Recovery Headroom:** Reserve capacity for broker failover, ledger rereplication and geo catch-up.


---

<!-- 430_BENCHMARKING.md -->

# Benchmarking

## What / Why
Use realistic subscriptions, batching, quorum, message sizes, topic counts and backlog.

## Visual
```text
Benchmarking → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Benchmarking:** Use realistic subscriptions, batching, quorum, message sizes, topic counts and backlog.


---

<!-- 431_PULSAR_PERF.md -->

# pulsar-perf

## What / Why
CLI performance tool for producer/consumer/reader/transaction tests.

## Visual
```text
pulsar-perf → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **pulsar-perf:** CLI performance tool for producer/consumer/reader/transaction tests.


---

<!-- 432_PULSAR_IN_MICROSERVICES.md -->

# Pulsar in Microservices

## What / Why
Use topics/subscriptions for asynchronous decoupling and replay.

## Visual
```text
Pulsar in Microservices → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar in Microservices:** Use topics/subscriptions for asynchronous decoupling and replay.


---

<!-- 433_COMMAND_TOPIC.md -->

# Command Topic

## What / Why
Service-oriented command delivery using queue-like subscription semantics.

## Visual
```text
Command Topic → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Command Topic:** Service-oriented command delivery using queue-like subscription semantics.


---

<!-- 434_DOMAIN_EVENT.md -->

# Domain Event

## What / Why
Past-tense business fact.

## Visual
```text
Domain Event → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Domain Event:** Past-tense business fact.


---

<!-- 435_INTEGRATION_EVENT.md -->

# Integration Event

## What / Why
Stable event across bounded contexts.

## Visual
```text
Integration Event → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Integration Event:** Stable event across bounded contexts.


---

<!-- 436_PUB_SUB.md -->

# Pub Sub

## What / Why
Multiple subscriptions receive independent copies.

## Visual
```text
Pub Sub → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pub Sub:** Multiple subscriptions receive independent copies.


---

<!-- 437_WORK_QUEUE.md -->

# Work Queue

## What / Why
Shared subscription distributes work across consumers.

## Visual
```text
Work Queue → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Work Queue:** Shared subscription distributes work across consumers.


---

<!-- 438_ORDERED_WORK_QUEUE.md -->

# Ordered Work Queue

## What / Why
Key_Shared preserves per-key affinity/order with parallel consumers.

## Visual
```text
Ordered Work Queue → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ordered Work Queue:** Key_Shared preserves per-key affinity/order with parallel consumers.


---

<!-- 439_ACTIVE_STANDBY.md -->

# Active Standby

## What / Why
Failover subscription provides active consumer with standby.

## Visual
```text
Active Standby → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Active Standby:** Failover subscription provides active consumer with standby.


---

<!-- 440_TRANSACTIONAL_OUTBOX.md -->

# Transactional Outbox

## What / Why
DB change + outbox row published to Pulsar via relay/CDC.

## Visual
```text
Transactional Outbox → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transactional Outbox:** DB change + outbox row published to Pulsar via relay/CDC.


---

<!-- 441_INBOX_PATTERN.md -->

# Inbox Pattern

## What / Why
Persist processed message IDs/business state.

## Visual
```text
Inbox Pattern → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Inbox Pattern:** Persist processed message IDs/business state.


---

<!-- 442_IDEMPOTENT_CONSUMER.md -->

# Idempotent Consumer

## What / Why
Required for at-least-once redelivery.

## Visual
```text
Idempotent Consumer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Idempotent Consumer:** Required for at-least-once redelivery.


---

<!-- 443_SAGA_CHOREOGRAPHY.md -->

# Saga Choreography

## What / Why
Services react to events.

## Visual
```text
Saga Choreography → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Saga Choreography:** Services react to events.


---

<!-- 444_SAGA_ORCHESTRATION.md -->

# Saga Orchestration

## What / Why
Coordinator emits commands and receives events.

## Visual
```text
Saga Orchestration → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Saga Orchestration:** Coordinator emits commands and receives events.


---

<!-- 445_CQRS.md -->

# CQRS

## What / Why
Events feed materialized read models.

## Visual
```text
CQRS → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **CQRS:** Events feed materialized read models.


---

<!-- 446_CDC.md -->

# CDC

## What / Why
Database change feed published to Pulsar.

## Visual
```text
CDC → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **CDC:** Database change feed published to Pulsar.


---

<!-- 447_MATERIALIZED_VIEW.md -->

# Materialized View

## What / Why
Consumer builds query-optimized state.

## Visual
```text
Materialized View → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Materialized View:** Consumer builds query-optimized state.


---

<!-- 448_RETRY_DLQ.md -->

# Retry DLQ

## What / Why
Negative ack/reconsume later/retry topic/DLQ patterns.

## Visual
```text
Retry DLQ → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Retry DLQ:** Negative ack/reconsume later/retry topic/DLQ patterns.


---

<!-- 449_CLAIM_CHECK.md -->

# Claim Check

## What / Why
Large object stored externally; Pulsar message carries reference.

## Visual
```text
Claim Check → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Claim Check:** Large object stored externally; Pulsar message carries reference.


---

<!-- 450_CORRELATION_ID.md -->

# Correlation ID

## What / Why
Message property links workflow events.

## Visual
```text
Correlation ID → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Correlation ID:** Message property links workflow events.


---

<!-- 451_TRACE_CONTEXT.md -->

# Trace Context

## What / Why
Propagate distributed trace metadata.

## Visual
```text
Trace Context → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Trace Context:** Propagate distributed trace metadata.


---

<!-- 452_REPLAY_SAFETY.md -->

# Replay Safety

## What / Why
Historical replay must not duplicate irreversible side effects.

## Visual
```text
Replay Safety → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Replay Safety:** Historical replay must not duplicate irreversible side effects.


---

<!-- 453_KAFKA_ON_PULSAR_CONCEPT.md -->

# Kafka on Pulsar Concept

## What / Why
Compatibility layers/projects can expose Kafka APIs over Pulsar in some ecosystems.

## Visual
```text
Kafka on Pulsar Concept → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Kafka on Pulsar Concept:** Compatibility layers/projects can expose Kafka APIs over Pulsar in some ecosystems.


---

<!-- 454_PROTOCOL_COMPATIBILITY_TRADEOFF.md -->

# Protocol Compatibility Tradeoff

## What / Why
Compatibility does not make Pulsar architecture identical to Kafka.

## Visual
```text
Protocol Compatibility Tradeoff → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Protocol Compatibility Tradeoff:** Compatibility does not make Pulsar architecture identical to Kafka.


---

<!-- 455_MIGRATION_STRATEGY.md -->

# Migration Strategy

## What / Why
Bridge/mirror data, dual-publish or use compatibility layer depending risk.

## Visual
```text
Migration Strategy → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Migration Strategy:** Bridge/mirror data, dual-publish or use compatibility layer depending risk.


---

<!-- 456_SCHEMA_TRANSLATION.md -->

# Schema Translation

## What / Why
Kafka/Pulsar schema formats and registries need explicit migration design.

## Visual
```text
Schema Translation → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Translation:** Kafka/Pulsar schema formats and registries need explicit migration design.


---

<!-- 457_OFFSET_VS_MESSAGEID.md -->

# Offset vs MessageId

## What / Why
Kafka offsets differ from Pulsar opaque MessageId/cursor model.

## Visual
```text
Offset vs MessageId → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Offset vs MessageId:** Kafka offsets differ from Pulsar opaque MessageId/cursor model.


---

<!-- 458_CONSUMER_GROUP_VS_SUBSCRIPTION.md -->

# Consumer Group vs Subscription

## What / Why
Kafka group and Pulsar subscription are analogous in purpose but differ in dispatch/storage semantics.

## Visual
```text
Consumer Group vs Subscription → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Consumer Group vs Subscription:** Kafka group and Pulsar subscription are analogous in purpose but differ in dispatch/storage semantics.


---

<!-- 459_PARTITION_VS_MANAGED_LEDGER.md -->

# Partition vs Managed Ledger

## What / Why
Pulsar partitions are topics backed by managed ledgers; storage is not broker-local like classic Kafka architecture.

## Visual
```text
Partition vs Managed Ledger → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Partition vs Managed Ledger:** Pulsar partitions are topics backed by managed ledgers; storage is not broker-local like classic Kafka architecture.


---

<!-- 460_PRODUCER_SEND_TIMEOUT.md -->

# Producer Send Timeout

## What / Why
Check broker lookup, BookKeeper latency, quorum, throttling, network and pending queue.

## Visual
```text
Producer Send Timeout → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Producer Send Timeout:** Check broker lookup, BookKeeper latency, quorum, throttling, network and pending queue.


---

<!-- 461_TOPIC_LOOKUP_FAILURE.md -->

# Topic Lookup Failure

## What / Why
Metadata/broker ownership/network/proxy issue.

## Visual
```text
Topic Lookup Failure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Topic Lookup Failure:** Metadata/broker ownership/network/proxy issue.


---

<!-- 462_BOOKIE_WRITE_FAILURE.md -->

# Bookie Write Failure

## What / Why
BookKeeper quorum/journal/disk/network problem.

## Visual
```text
Bookie Write Failure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Bookie Write Failure:** BookKeeper quorum/journal/disk/network problem.


---

<!-- 463_LEDGER_UNDER_REPLICATED.md -->

# Ledger Under Replicated

## What / Why
Bookie loss left insufficient replicas until rereplication.

## Visual
```text
Ledger Under Replicated → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Ledger Under Replicated:** Bookie loss left insufficient replicas until rereplication.


---

<!-- 464_BROKER_OWNERSHIP_CHURN.md -->

# Broker Ownership Churn

## What / Why
Load-manager instability, broker failures or metadata issues.

## Visual
```text
Broker Ownership Churn → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Ownership Churn:** Load-manager instability, broker failures or metadata issues.


---

<!-- 465_SUBSCRIPTION_BACKLOG_GROWING.md -->

# Subscription Backlog Growing

## What / Why
Consumers too slow/failing or downstream dependencies constrained.

## Visual
```text
Subscription Backlog Growing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Backlog Growing:** Consumers too slow/failing or downstream dependencies constrained.


---

<!-- 466_UNACKED_GROWING.md -->

# Unacked Growing

## What / Why
Consumers receive but do not acknowledge promptly.

## Visual
```text
Unacked Growing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Unacked Growing:** Consumers receive but do not acknowledge promptly.


---

<!-- 467_REDELIVERY_STORM.md -->

# Redelivery Storm

## What / Why
Negative ack/ack timeout/retry logic repeatedly redelivers.

## Visual
```text
Redelivery Storm → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Redelivery Storm:** Negative ack/ack timeout/retry logic repeatedly redelivers.


---

<!-- 468_DLQ_GROWTH.md -->

# DLQ Growth

## What / Why
Persistent poison messages/schema/business failures.

## Visual
```text
DLQ Growth → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **DLQ Growth:** Persistent poison messages/schema/business failures.


---

<!-- 469_KEY_SHARED_DISORDER.md -->

# Key Shared Disorder

## What / Why
Producer batching not key-based or keys absent/unstable.

## Visual
```text
Key Shared Disorder → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Key Shared Disorder:** Producer batching not key-based or keys absent/unstable.


---

<!-- 470_DUPLICATE_DELIVERY.md -->

# Duplicate Delivery

## What / Why
Expected in at-least-once failure paths; verify idempotency.

## Visual
```text
Duplicate Delivery → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Duplicate Delivery:** Expected in at-least-once failure paths; verify idempotency.


---

<!-- 471_MISSING_MESSAGES.md -->

# Missing Messages

## What / Why
Check publish result, retention/TTL, subscription start/cursor, DLQ and geo replication.

## Visual
```text
Missing Messages → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Missing Messages:** Check publish result, retention/TTL, subscription start/cursor, DLQ and geo replication.


---

<!-- 472_CURSOR_RESET_MISTAKE.md -->

# Cursor Reset Mistake

## What / Why
Replay/skip operation moved subscription unexpectedly.

## Visual
```text
Cursor Reset Mistake → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Cursor Reset Mistake:** Replay/skip operation moved subscription unexpectedly.


---

<!-- 473_SCHEMA_REJECTION.md -->

# Schema Rejection

## What / Why
Producer/consumer schema conflicts with compatibility policy.

## Visual
```text
Schema Rejection → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Schema Rejection:** Producer/consumer schema conflicts with compatibility policy.


---

<!-- 474_TIERED_READ_SLOW.md -->

# Tiered Read Slow

## What / Why
Remote object storage latency or offloader issue.

## Visual
```text
Tiered Read Slow → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tiered Read Slow:** Remote object storage latency or offloader issue.


---

<!-- 475_GEO_REPLICATION_LAG.md -->

# Geo Replication Lag

## What / Why
WAN or remote cluster capacity issue.

## Visual
```text
Geo Replication Lag → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Geo Replication Lag:** WAN or remote cluster capacity issue.


---

<!-- 476_METADATA_STORE_FAILURE.md -->

# Metadata Store Failure

## What / Why
Topic ownership/admin coordination degraded.

## Visual
```text
Metadata Store Failure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Metadata Store Failure:** Topic ownership/admin coordination degraded.


---

<!-- 477_BOOKKEEPER_DISK_FULL.md -->

# BookKeeper Disk Full

## What / Why
Ledger storage/journal capacity issue.

## Visual
```text
BookKeeper Disk Full → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **BookKeeper Disk Full:** Ledger storage/journal capacity issue.


---

<!-- 478_BROKER_MEMORY_PRESSURE.md -->

# Broker Memory Pressure

## What / Why
Large topic count/cache/consumers/producers/backlog dispatch.

## Visual
```text
Broker Memory Pressure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Memory Pressure:** Large topic count/cache/consumers/producers/backlog dispatch.


---

<!-- 479_FUNCTION_FAILURE.md -->

# Function Failure

## What / Why
Runtime package/config/secret/input/output problem.

## Visual
```text
Function Failure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Function Failure:** Runtime package/config/secret/input/output problem.


---

<!-- 480_CONNECTOR_FAILURE.md -->

# Connector Failure

## What / Why
External source/sink/auth/processing guarantee issue.

## Visual
```text
Connector Failure → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Connector Failure:** External source/sink/auth/processing guarantee issue.


---

<!-- 481_TRANSACTION_TIMEOUT.md -->

# Transaction Timeout

## What / Why
Long-running transaction exceeded coordinator timeout.

## Visual
```text
Transaction Timeout → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transaction Timeout:** Long-running transaction exceeded coordinator timeout.


---

<!-- 482_GOLDEN_TROUBLESHOOTING_FLOW.md -->

# Golden Troubleshooting Flow

## What / Why
Producer → lookup/broker → managed ledger/BookKeeper → subscription cursor → consumer → business side effect.

## Visual
```text
Golden Troubleshooting Flow → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Golden Troubleshooting Flow:** Producer → lookup/broker → managed ledger/BookKeeper → subscription cursor → consumer → business side effect.


---

<!-- 483_DESIGN_PULSAR_CLUSTER.md -->

# Design Pulsar Cluster

## What / Why
Size brokers, bookies, metadata store, quorums, partitions, tenants and namespaces.

## Visual
```text
Design Pulsar Cluster → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design Pulsar Cluster:** Size brokers, bookies, metadata store, quorums, partitions, tenants and namespaces.


---

<!-- 484_DESIGN_MULTI_TENANT_PLATFORM.md -->

# Design Multi Tenant Platform

## What / Why
Tenants/namespaces/policies/isolation/throttling/security.

## Visual
```text
Design Multi Tenant Platform → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design Multi Tenant Platform:** Tenants/namespaces/policies/isolation/throttling/security.


---

<!-- 485_DESIGN_WORK_QUEUE.md -->

# Design Work Queue

## What / Why
Shared subscription + manual ack + retry/DLQ + idempotency.

## Visual
```text
Design Work Queue → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design Work Queue:** Shared subscription + manual ack + retry/DLQ + idempotency.


---

<!-- 486_DESIGN_ORDERED_WORK_QUEUE.md -->

# Design Ordered Work Queue

## What / Why
Key_Shared + stable keys + key-based batching.

## Visual
```text
Design Ordered Work Queue → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design Ordered Work Queue:** Key_Shared + stable keys + key-based batching.


---

<!-- 487_DESIGN_HA_CONSUMER.md -->

# Design HA Consumer

## What / Why
Failover subscription.

## Visual
```text
Design HA Consumer → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design HA Consumer:** Failover subscription.


---

<!-- 488_DESIGN_EVENT_STREAMING.md -->

# Design Event Streaming

## What / Why
Partitioned topics + retention + independent subscriptions.

## Visual
```text
Design Event Streaming → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design Event Streaming:** Partitioned topics + retention + independent subscriptions.


---

<!-- 489_DESIGN_GEO_REPLICATED_PLATFORM.md -->

# Design Geo Replicated Platform

## What / Why
Namespace replication + regional clusters + failover + local subscriptions.

## Visual
```text
Design Geo Replicated Platform → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design Geo Replicated Platform:** Namespace replication + regional clusters + failover + local subscriptions.


---

<!-- 490_DESIGN_LONG_RETENTION.md -->

# Design Long Retention

## What / Why
BookKeeper hot storage + tiered storage + retention/offload policies.

## Visual
```text
Design Long Retention → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design Long Retention:** BookKeeper hot storage + tiered storage + retention/offload policies.


---

<!-- 491_DESIGN_CDC_PIPELINE.md -->

# Design CDC Pipeline

## What / Why
DB connector/source → Pulsar → sinks/materialized views.

## Visual
```text
Design CDC Pipeline → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design CDC Pipeline:** DB connector/source → Pulsar → sinks/materialized views.


---

<!-- 492_DESIGN_SERVERLESS_PROCESSING.md -->

# Design Serverless Processing

## What / Why
Pulsar Functions + state + IO connectors.

## Visual
```text
Design Serverless Processing → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Design Serverless Processing:** Pulsar Functions + state + IO connectors.


---

<!-- 493_PULSAR_VS_KAFKA.md -->

# Pulsar vs Kafka

## What / Why
Separated broker/storage and subscription model vs Kafka broker-local partition-log architecture.

## Visual
```text
Pulsar vs Kafka → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar vs Kafka:** Separated broker/storage and subscription model vs Kafka broker-local partition-log architecture.


---

<!-- 494_PULSAR_VS_RABBITMQ.md -->

# Pulsar vs RabbitMQ

## What / Why
Multi-tenant streaming + BookKeeper + subscriptions vs exchange/queue broker routing.

## Visual
```text
Pulsar vs RabbitMQ → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar vs RabbitMQ:** Multi-tenant streaming + BookKeeper + subscriptions vs exchange/queue broker routing.


---

<!-- 495_PULSAR_VS_JMS.md -->

# Pulsar vs JMS

## What / Why
Concrete distributed platform vs Java messaging API specification.

## Visual
```text
Pulsar vs JMS → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar vs JMS:** Concrete distributed platform vs Java messaging API specification.


---

<!-- 496_PULSAR_VS_KINESIS.md -->

# Pulsar vs Kinesis

## What / Why
Open distributed platform vs managed AWS streaming service.

## Visual
```text
Pulsar vs Kinesis → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar vs Kinesis:** Open distributed platform vs managed AWS streaming service.


---

<!-- 497_PULSAR_VS_EVENT_HUBS.md -->

# Pulsar vs Event Hubs

## What / Why
Open multi-tenant platform vs Azure-managed event streaming service.

## Visual
```text
Pulsar vs Event Hubs → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar vs Event Hubs:** Open multi-tenant platform vs Azure-managed event streaming service.


---

<!-- 498_SUBSCRIPTION_TYPES_INTERVIEW.md -->

# Subscription Types Interview

## What / Why
Exclusive, Failover, Shared and Key_Shared solve different concurrency/order needs.

## Visual
```text
Subscription Types Interview → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Subscription Types Interview:** Exclusive, Failover, Shared and Key_Shared solve different concurrency/order needs.


---

<!-- 499_BOOKKEEPER_INTERVIEW.md -->

# BookKeeper Interview

## What / Why
Storage layer uses ledgers, ensembles and write/ack quorums.

## Visual
```text
BookKeeper Interview → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **BookKeeper Interview:** Storage layer uses ledgers, ensembles and write/ack quorums.


---

<!-- 500_BROKER_STATELESSNESS_INTERVIEW.md -->

# Broker Statelessness Interview

## What / Why
Durable topic data survives broker movement because it resides in BookKeeper.

## Visual
```text
Broker Statelessness Interview → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Broker Statelessness Interview:** Durable topic data survives broker movement because it resides in BookKeeper.


---

<!-- 501_GEO_REPLICATION_INTERVIEW.md -->

# Geo Replication Interview

## What / Why
Topic data replicates asynchronously; subscriptions remain cluster-local by default.

## Visual
```text
Geo Replication Interview → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Geo Replication Interview:** Topic data replicates asynchronously; subscriptions remain cluster-local by default.


---

<!-- 502_TIERED_STORAGE_INTERVIEW.md -->

# Tiered Storage Interview

## What / Why
Sealed ledgers can move to cheaper storage while reads remain transparent.

## Visual
```text
Tiered Storage Interview → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Tiered Storage Interview:** Sealed ledgers can move to cheaper storage while reads remain transparent.


---

<!-- 503_TRANSACTIONS_INTERVIEW.md -->

# Transactions Interview

## What / Why
Atomic produces/acks across Pulsar topics/partitions, not arbitrary external DBs.

## Visual
```text
Transactions Interview → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Transactions Interview:** Atomic produces/acks across Pulsar topics/partitions, not arbitrary external DBs.


---

<!-- 504_WHEN_NOT_TO_USE_PULSAR.md -->

# When Not to Use Pulsar

## What / Why
Simpler broker/queue, very small infrastructure footprint or managed ecosystem constraints may favor alternatives.

## Visual
```text
When Not to Use Pulsar → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **When Not to Use Pulsar:** Simpler broker/queue, very small infrastructure footprint or managed ecosystem constraints may favor alternatives.


---

<!-- 505_PULSAR_ANTI_PATTERNS.md -->

# Pulsar Anti Patterns

## What / Why
Treat broker as storage owner, ignore BookKeeper, Shared when ordering required, no idempotency, over-partitioning, no tenant governance.

## Visual
```text
Pulsar Anti Patterns → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Anti Patterns:** Treat broker as storage owner, ignore BookKeeper, Shared when ordering required, no idempotency, over-partitioning, no tenant governance.


---

<!-- 506_PULSAR_INTERVIEW_TRAPS.md -->

# Pulsar Interview Traps

## What / Why
High-value architecture/subscription/storage/geo misconceptions.

## Visual
```text
Pulsar Interview Traps → Pulsar broker / subscription / BookKeeper semantics
```

## How to Think About It
- Separate broker serving from durable storage.
- Identify tenant, namespace, topic and subscription ownership.
- Make subscription type and acknowledgement behavior explicit.
- Treat replay/redelivery as normal.
- Tune brokers and BookKeeper independently.

## Real-Life Analogy
Pulsar works like a **warehouse network**: brokers are front desks, BookKeeper bookies are storage warehouses, and each subscription owns its own bookmark and dispatch rule.

## Production Questions
```text
Tenant / namespace?
Persistent or non-persistent?
Partition count?
Subscription type?
Ack/redelivery policy?
Retention/backlog quota?
BookKeeper quorum?
Schema?
Geo replication?
Tiered storage?
Security/isolation?
Replay safety?
```

## Interview Trap
Do not describe Pulsar as “Kafka with different APIs.” Its **broker/storage separation, managed-ledger/BookKeeper model, subscription types, multi-tenancy, and geo-replication architecture** are materially different.

## 20-Second Recall
> **Pulsar Interview Traps:** High-value architecture/subscription/storage/geo misconceptions.
