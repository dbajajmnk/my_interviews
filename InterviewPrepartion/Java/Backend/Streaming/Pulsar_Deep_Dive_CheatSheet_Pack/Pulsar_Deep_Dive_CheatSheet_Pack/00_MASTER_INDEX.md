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
