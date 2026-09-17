# AMQP / RabbitMQ — Dedicated Deep-Dive Cheat Sheet Pack

**Current RabbitMQ baseline:** 4.3.5 (released August 17, 2026).

**Scope:** AMQP 0-9-1 + AMQP 1.0 concepts, RabbitMQ routing, queue types, Quorum Queues, Streams, confirmations/acks, retries/DLX, clustering/HA, Federation/Shovel, security, operations, Spring integration, troubleshooting and system design.

## Fast Revision
- `01_30_SECOND_RECALL.md`
- `02_CURRENT_BASELINE.md`
- `03_REFERENCE_ARCHITECTURE.md`
- `04_QUEUE_SELECTION_DECISION.md`

## AMQP Foundations

- Messaging Mental Model — `005_MESSAGING_MENTAL_MODEL.md`
- AMQP Meaning — `006_AMQP_MEANING.md`
- AMQP 0-9-1 vs AMQP 1.0 — `007_AMQP_0_9_1_VS_AMQP_1_0.md`
- RabbitMQ Mental Model — `008_RABBITMQ_MENTAL_MODEL.md`
- Message — `009_MESSAGE.md`
- Publisher — `010_PUBLISHER.md`
- Consumer — `011_CONSUMER.md`
- Broker — `012_BROKER.md`
- Virtual Host — `013_VIRTUAL_HOST.md`
- Connection — `014_CONNECTION.md`
- Channel — `015_CHANNEL.md`
- Delivery — `016_DELIVERY.md`
- Routing Key — `017_ROUTING_KEY.md`
- Binding — `018_BINDING.md`
- Exchange — `019_EXCHANGE.md`
- Queue — `020_QUEUE.md`
- Message Flow — `021_MESSAGE_FLOW.md`
- Work Queue Pattern — `022_WORK_QUEUE_PATTERN.md`
- Pub Sub Pattern — `023_PUB_SUB_PATTERN.md`
- Routing Pattern — `024_ROUTING_PATTERN.md`
- RPC Pattern — `025_RPC_PATTERN.md`

## AMQP 0-9-1 Protocol Model

- AMQP 0-9-1 Classes — `026_AMQP_0_9_1_CLASSES.md`
- Connection Lifecycle — `027_CONNECTION_LIFECYCLE.md`
- Channel Lifecycle — `028_CHANNEL_LIFECYCLE.md`
- Exchange Declare — `029_EXCHANGE_DECLARE.md`
- Exchange Delete — `030_EXCHANGE_DELETE.md`
- Queue Declare — `031_QUEUE_DECLARE.md`
- Queue Bind — `032_QUEUE_BIND.md`
- Queue Unbind — `033_QUEUE_UNBIND.md`
- Basic Publish — `034_BASIC_PUBLISH.md`
- Basic Consume — `035_BASIC_CONSUME.md`
- Basic Get — `036_BASIC_GET.md`
- Basic Ack — `037_BASIC_ACK.md`
- Basic Reject — `038_BASIC_REJECT.md`
- Basic Nack — `039_BASIC_NACK.md`
- Basic Qos — `040_BASIC_QOS.md`
- Delivery Tag — `041_DELIVERY_TAG.md`
- Mandatory Publish — `042_MANDATORY_PUBLISH.md`
- Basic Return — `043_BASIC_RETURN.md`
- Publisher Confirm Extension — `044_PUBLISHER_CONFIRM_EXTENSION.md`
- Channel Transactions — `045_CHANNEL_TRANSACTIONS.md`

## AMQP 1.0 Model

- AMQP 1.0 Mental Model — `046_AMQP_1_0_MENTAL_MODEL.md`
- Connection AMQP 1.0 — `047_CONNECTION_AMQP_1_0.md`
- Session — `048_SESSION.md`
- Link — `049_LINK.md`
- Source — `050_SOURCE.md`
- Target — `051_TARGET.md`
- Settlement — `052_SETTLEMENT.md`
- Delivery State — `053_DELIVERY_STATE.md`
- Accepted Outcome — `054_ACCEPTED_OUTCOME.md`
- Rejected Outcome — `055_REJECTED_OUTCOME.md`
- Released Outcome — `056_RELEASED_OUTCOME.md`
- Modified Outcome — `057_MODIFIED_OUTCOME.md`
- Credit Flow Control — `058_CREDIT_FLOW_CONTROL.md`
- AMQP 1.0 Addressing — `059_AMQP_1_0_ADDRESSING.md`
- AMQP 1.0 vs 0-9-1 Trap — `060_AMQP_1_0_VS_0_9_1_TRAP.md`

## Exchange Types & Routing

- Direct Exchange — `061_DIRECT_EXCHANGE.md`
- Fanout Exchange — `062_FANOUT_EXCHANGE.md`
- Topic Exchange — `063_TOPIC_EXCHANGE.md`
- Headers Exchange — `064_HEADERS_EXCHANGE.md`
- Default Exchange — `065_DEFAULT_EXCHANGE.md`
- Exchange to Exchange Binding — `066_EXCHANGE_TO_EXCHANGE_BINDING.md`
- Alternate Exchange — `067_ALTERNATE_EXCHANGE.md`
- Direct Routing — `068_DIRECT_ROUTING.md`
- Topic Routing — `069_TOPIC_ROUTING.md`
- Fanout Broadcast — `070_FANOUT_BROADCAST.md`
- Header Routing — `071_HEADER_ROUTING.md`
- Routing Key Design — `072_ROUTING_KEY_DESIGN.md`
- Binding Explosion — `073_BINDING_EXPLOSION.md`
- Unroutable Message — `074_UNROUTABLE_MESSAGE.md`
- Mandatory Flag — `075_MANDATORY_FLAG.md`
- Exchange Durability — `076_EXCHANGE_DURABILITY.md`
- Auto Delete Exchange — `077_AUTO_DELETE_EXCHANGE.md`
- Internal Exchange — `078_INTERNAL_EXCHANGE.md`

## Queue Types

- Classic Queue — `079_CLASSIC_QUEUE.md`
- Quorum Queue — `080_QUORUM_QUEUE.md`
- Stream — `081_STREAM.md`
- Classic vs Quorum — `082_CLASSIC_VS_QUORUM.md`
- Quorum vs Stream — `083_QUORUM_VS_STREAM.md`
- Queue Type Selection — `084_QUEUE_TYPE_SELECTION.md`
- Durable Queue — `085_DURABLE_QUEUE.md`
- Transient Queue — `086_TRANSIENT_QUEUE.md`
- Exclusive Queue — `087_EXCLUSIVE_QUEUE.md`
- Auto Delete Queue — `088_AUTO_DELETE_QUEUE.md`
- Server Named Queue — `089_SERVER_NAMED_QUEUE.md`
- Queue Arguments — `090_QUEUE_ARGUMENTS.md`
- Policy vs x-arguments — `091_POLICY_VS_X_ARGUMENTS.md`
- Queue Leader — `092_QUEUE_LEADER.md`
- Queue Members — `093_QUEUE_MEMBERS.md`
- Queue Placement — `094_QUEUE_PLACEMENT.md`

## Quorum Queues

- Quorum Queue Mental Model — `095_QUORUM_QUEUE_MENTAL_MODEL.md`
- Raft Consensus — `096_RAFT_CONSENSUS.md`
- Quorum Queue Leader — `097_QUORUM_QUEUE_LEADER.md`
- Quorum Queue Followers — `098_QUORUM_QUEUE_FOLLOWERS.md`
- Majority Availability — `099_MAJORITY_AVAILABILITY.md`
- Publisher Confirms with Quorum — `100_PUBLISHER_CONFIRMS_WITH_QUORUM.md`
- Manual Ack with Quorum — `101_MANUAL_ACK_WITH_QUORUM.md`
- Quorum Queue Replica Count — `102_QUORUM_QUEUE_REPLICA_COUNT.md`
- Quorum Queue Membership — `103_QUORUM_QUEUE_MEMBERSHIP.md`
- Continuous Membership Reconciliation — `104_CONTINUOUS_MEMBERSHIP_RECONCILIATION.md`
- Leader Rebalancing — `105_LEADER_REBALANCING.md`
- Poison Message Handling — `106_POISON_MESSAGE_HANDLING.md`
- Delivery Limit — `107_DELIVERY_LIMIT.md`
- At Least Once Dead Lettering — `108_AT_LEAST_ONCE_DEAD_LETTERING.md`
- Delayed Retry — `109_DELAYED_RETRY.md`
- Consumer Timeout — `110_CONSUMER_TIMEOUT.md`
- Strict Priority — `111_STRICT_PRIORITY.md`
- Quorum Queue Limitations — `112_QUORUM_QUEUE_LIMITATIONS.md`
- Classic Mirroring Removed — `113_CLASSIC_MIRRORING_REMOVED.md`
- Quorum Interview Trap — `114_QUORUM_INTERVIEW_TRAP.md`

## Streams & Super Streams

- RabbitMQ Stream Mental Model — `115_RABBITMQ_STREAM_MENTAL_MODEL.md`
- Stream Retention — `116_STREAM_RETENTION.md`
- Stream Offset — `117_STREAM_OFFSET.md`
- Stream Segment — `118_STREAM_SEGMENT.md`
- Stream Leader — `119_STREAM_LEADER.md`
- Stream Replication — `120_STREAM_REPLICATION.md`
- Stream Publisher Confirm — `121_STREAM_PUBLISHER_CONFIRM.md`
- Stream Consumer — `122_STREAM_CONSUMER.md`
- Native Stream Protocol — `123_NATIVE_STREAM_PROTOCOL.md`
- AMQP Stream Access — `124_AMQP_STREAM_ACCESS.md`
- Super Stream — `125_SUPER_STREAM.md`
- Super Stream Partitioning — `126_SUPER_STREAM_PARTITIONING.md`
- Super Stream Scaling — `127_SUPER_STREAM_SCALING.md`
- Stream Fanout — `128_STREAM_FANOUT.md`
- Stream vs Queue Backlog — `129_STREAM_VS_QUEUE_BACKLOG.md`
- Stream Single Active Consumer — `130_STREAM_SINGLE_ACTIVE_CONSUMER.md`
- Stream Retention Config — `131_STREAM_RETENTION_CONFIG.md`
- Stream Use Cases — `132_STREAM_USE_CASES.md`

## Publishers & Reliability

- Publisher Reliability Mental Model — `133_PUBLISHER_RELIABILITY_MENTAL_MODEL.md`
- Publisher Confirms — `134_PUBLISHER_CONFIRMS.md`
- Confirm Select — `135_CONFIRM_SELECT.md`
- Positive Confirm — `136_POSITIVE_CONFIRM.md`
- Negative Confirm — `137_NEGATIVE_CONFIRM.md`
- Streaming Confirms — `138_STREAMING_CONFIRMS.md`
- Batch Confirms — `139_BATCH_CONFIRMS.md`
- Per Message Synchronous Confirm — `140_PER_MESSAGE_SYNCHRONOUS_CONFIRM.md`
- Publish Sequence Number — `141_PUBLISH_SEQUENCE_NUMBER.md`
- Outstanding Confirm Map — `142_OUTSTANDING_CONFIRM_MAP.md`
- Publish Retry — `143_PUBLISH_RETRY.md`
- Duplicate Publish Risk — `144_DUPLICATE_PUBLISH_RISK.md`
- Publisher Idempotency — `145_PUBLISHER_IDEMPOTENCY.md`
- Message ID — `146_MESSAGE_ID.md`
- Persistent Message — `147_PERSISTENT_MESSAGE.md`
- Durability Equation — `148_DURABILITY_EQUATION.md`
- Connection Blocked — `149_CONNECTION_BLOCKED.md`
- Blocked Connection Notification — `150_BLOCKED_CONNECTION_NOTIFICATION.md`
- Flow Control — `151_FLOW_CONTROL.md`
- Publish Throughput — `152_PUBLISH_THROUGHPUT.md`

## Consumers & Acknowledgements

- Consumer Reliability Mental Model — `153_CONSUMER_RELIABILITY_MENTAL_MODEL.md`
- Automatic Ack — `154_AUTOMATIC_ACK.md`
- Manual Ack — `155_MANUAL_ACK.md`
- basic.ack — `156_BASIC_ACK.md`
- basic.reject — `157_BASIC_REJECT.md`
- basic.nack — `158_BASIC_NACK.md`
- Requeue — `159_REQUEUE.md`
- Redelivered Flag — `160_REDELIVERED_FLAG.md`
- Acknowledgement Scope — `161_ACKNOWLEDGEMENT_SCOPE.md`
- Multiple Ack — `162_MULTIPLE_ACK.md`
- Prefetch — `163_PREFETCH.md`
- Consumer Prefetch — `164_CONSUMER_PREFETCH.md`
- Prefetch Zero — `165_PREFETCH_ZERO.md`
- Quorum Prefetch Limit — `166_QUORUM_PREFETCH_LIMIT.md`
- Competing Consumers — `167_COMPETING_CONSUMERS.md`
- Round Robin Dispatch — `168_ROUND_ROBIN_DISPATCH.md`
- Single Active Consumer — `169_SINGLE_ACTIVE_CONSUMER.md`
- Consumer Priority — `170_CONSUMER_PRIORITY.md`
- Consumer Cancellation — `171_CONSUMER_CANCELLATION.md`
- Consumer Timeout — `172_CONSUMER_TIMEOUT.md`
- Slow Consumer — `173_SLOW_CONSUMER.md`
- Ack After Side Effect — `174_ACK_AFTER_SIDE_EFFECT.md`
- Consumer Idempotency — `175_CONSUMER_IDEMPOTENCY.md`

## Dead Lettering, Retry & TTL

- Dead Letter Exchange — `176_DEAD_LETTER_EXCHANGE.md`
- Dead Letter Conditions — `177_DEAD_LETTER_CONDITIONS.md`
- x-dead-letter-exchange — `178_X_DEAD_LETTER_EXCHANGE.md`
- x-dead-letter-routing-key — `179_X_DEAD_LETTER_ROUTING_KEY.md`
- DLQ — `180_DLQ.md`
- Poison Message — `181_POISON_MESSAGE.md`
- Retry Loop Risk — `182_RETRY_LOOP_RISK.md`
- Retry Queue Pattern — `183_RETRY_QUEUE_PATTERN.md`
- Delayed Retry Quorum — `184_DELAYED_RETRY_QUORUM.md`
- Per Message TTL — `185_PER_MESSAGE_TTL.md`
- Queue TTL — `186_QUEUE_TTL.md`
- Message TTL — `187_MESSAGE_TTL.md`
- Queue Length Limit — `188_QUEUE_LENGTH_LIMIT.md`
- Overflow Behavior — `189_OVERFLOW_BEHAVIOR.md`
- At Least Once Dead Lettering — `190_AT_LEAST_ONCE_DEAD_LETTERING.md`
- Dead Letter Cycle — `191_DEAD_LETTER_CYCLE.md`
- Retry Backoff — `192_RETRY_BACKOFF.md`
- Max Attempts — `193_MAX_ATTEMPTS.md`
- Retry Idempotency — `194_RETRY_IDEMPOTENCY.md`

## Priorities & Fair Dispatch

- Message Priority — `195_MESSAGE_PRIORITY.md`
- Priority Queue — `196_PRIORITY_QUEUE.md`
- Priority Levels — `197_PRIORITY_LEVELS.md`
- Consumer Priority — `198_CONSUMER_PRIORITY.md`
- Fair Dispatch — `199_FAIR_DISPATCH.md`
- Priority Starvation — `200_PRIORITY_STARVATION.md`
- Ordering vs Priority — `201_ORDERING_VS_PRIORITY.md`

## RPC & Request Reply

- RPC over RabbitMQ — `202_RPC_OVER_RABBITMQ.md`
- Reply To — `203_REPLY_TO.md`
- Correlation ID — `204_CORRELATION_ID.md`
- Exclusive Reply Queue — `205_EXCLUSIVE_REPLY_QUEUE.md`
- Direct Reply To — `206_DIRECT_REPLY_TO.md`
- RPC Timeout — `207_RPC_TIMEOUT.md`
- RPC Duplicate Handling — `208_RPC_DUPLICATE_HANDLING.md`
- RPC Scalability — `209_RPC_SCALABILITY.md`
- RPC Trap — `210_RPC_TRAP.md`

## Clustering & High Availability

- RabbitMQ Cluster — `211_RABBITMQ_CLUSTER.md`
- Cluster Metadata — `212_CLUSTER_METADATA.md`
- Queue Data Placement — `213_QUEUE_DATA_PLACEMENT.md`
- Node Roles Concept — `214_NODE_ROLES_CONCEPT.md`
- Cluster Formation — `215_CLUSTER_FORMATION.md`
- Cluster Partition — `216_CLUSTER_PARTITION.md`
- Partition Handling — `217_PARTITION_HANDLING.md`
- Quorum Queue HA — `218_QUORUM_QUEUE_HA.md`
- Stream HA — `219_STREAM_HA.md`
- Classic Queue HA — `220_CLASSIC_QUEUE_HA.md`
- Load Balancer — `221_LOAD_BALANCER.md`
- Client Recovery — `222_CLIENT_RECOVERY.md`
- Topology Recovery — `223_TOPOLOGY_RECOVERY.md`
- Leader Locality — `224_LEADER_LOCALITY.md`
- Leader Rebalancing — `225_LEADER_REBALANCING.md`
- Odd Cluster Sizes — `226_ODD_CLUSTER_SIZES.md`
- Cluster Upgrade — `227_CLUSTER_UPGRADE.md`
- Node Drain — `228_NODE_DRAIN.md`

## Federation, Shovel & WAN

- Federation — `229_FEDERATION.md`
- Federated Exchange — `230_FEDERATED_EXCHANGE.md`
- Federated Queue — `231_FEDERATED_QUEUE.md`
- Federation Upstream — `232_FEDERATION_UPSTREAM.md`
- Federation Policy — `233_FEDERATION_POLICY.md`
- Shovel — `234_SHOVEL.md`
- Dynamic Shovel — `235_DYNAMIC_SHOVEL.md`
- Static Shovel — `236_STATIC_SHOVEL.md`
- Shovel Use Cases — `237_SHOVEL_USE_CASES.md`
- Federation vs Shovel — `238_FEDERATION_VS_SHOVEL.md`
- WAN Tradeoff — `239_WAN_TRADEOFF.md`
- Multi Region Pattern — `240_MULTI_REGION_PATTERN.md`
- Loop Prevention — `241_LOOP_PREVENTION.md`
- DR with RabbitMQ — `242_DR_WITH_RABBITMQ.md`

## Protocols & Interoperability

- AMQP 0-9-1 — `243_AMQP_0_9_1.md`
- AMQP 1.0 — `244_AMQP_1_0.md`
- RabbitMQ Stream Protocol — `245_RABBITMQ_STREAM_PROTOCOL.md`
- MQTT — `246_MQTT.md`
- STOMP — `247_STOMP.md`
- Web MQTT — `248_WEB_MQTT.md`
- Web STOMP — `249_WEB_STOMP.md`
- Protocol Gateway Role — `250_PROTOCOL_GATEWAY_ROLE.md`
- Protocol Semantics Trap — `251_PROTOCOL_SEMANTICS_TRAP.md`

## Security

- RabbitMQ Security Model — `252_RABBITMQ_SECURITY_MODEL.md`
- TLS — `253_TLS.md`
- mTLS — `254_MTLS.md`
- Username Password — `255_USERNAME_PASSWORD.md`
- OAuth 2 — `256_OAUTH_2.md`
- LDAP — `257_LDAP.md`
- Authentication Backend — `258_AUTHENTICATION_BACKEND.md`
- Authorization — `259_AUTHORIZATION.md`
- Configure Permission — `260_CONFIGURE_PERMISSION.md`
- Write Permission — `261_WRITE_PERMISSION.md`
- Read Permission — `262_READ_PERMISSION.md`
- Topic Authorization — `263_TOPIC_AUTHORIZATION.md`
- Virtual Host Isolation — `264_VIRTUAL_HOST_ISOLATION.md`
- Default Guest User — `265_DEFAULT_GUEST_USER.md`
- Secrets Management — `266_SECRETS_MANAGEMENT.md`
- Credential Rotation — `267_CREDENTIAL_ROTATION.md`
- Management UI Security — `268_MANAGEMENT_UI_SECURITY.md`
- Network Segmentation — `269_NETWORK_SEGMENTATION.md`
- Least Privilege — `270_LEAST_PRIVILEGE.md`
- Audit Logging — `271_AUDIT_LOGGING.md`

## Resource Alarms & Backpressure

- Memory Alarm — `272_MEMORY_ALARM.md`
- Disk Alarm — `273_DISK_ALARM.md`
- Connection Blocking — `274_CONNECTION_BLOCKING.md`
- Flow Control — `275_FLOW_CONTROL.md`
- Consumer Backlog — `276_CONSUMER_BACKLOG.md`
- Ready Messages — `277_READY_MESSAGES.md`
- Unacked Messages — `278_UNACKED_MESSAGES.md`
- Memory High Watermark — `279_MEMORY_HIGH_WATERMARK.md`
- Disk Free Limit — `280_DISK_FREE_LIMIT.md`
- Lazy Queue Legacy Awareness — `281_LAZY_QUEUE_LEGACY_AWARENESS.md`
- Backpressure Design — `282_BACKPRESSURE_DESIGN.md`

## Observability & Management

- Management Plugin — `283_MANAGEMENT_PLUGIN.md`
- Prometheus Plugin — `284_PROMETHEUS_PLUGIN.md`
- Overview Metrics — `285_OVERVIEW_METRICS.md`
- Queue Depth — `286_QUEUE_DEPTH.md`
- Unacked Count — `287_UNACKED_COUNT.md`
- Publish Rate — `288_PUBLISH_RATE.md`
- Deliver Rate — `289_DELIVER_RATE.md`
- Ack Rate — `290_ACK_RATE.md`
- Redelivery Rate — `291_REDELIVERY_RATE.md`
- Consumer Utilisation — `292_CONSUMER_UTILISATION.md`
- Publisher Confirm Rate — `293_PUBLISHER_CONFIRM_RATE.md`
- Connection Churn — `294_CONNECTION_CHURN.md`
- Channel Churn — `295_CHANNEL_CHURN.md`
- Queue Churn — `296_QUEUE_CHURN.md`
- Quorum Metrics — `297_QUORUM_METRICS.md`
- Stream Metrics — `298_STREAM_METRICS.md`
- Resource Alarm Metrics — `299_RESOURCE_ALARM_METRICS.md`
- Node Health — `300_NODE_HEALTH.md`
- Message Rate vs Byte Rate — `301_MESSAGE_RATE_VS_BYTE_RATE.md`
- End-to-End Latency — `302_END_TO_END_LATENCY.md`
- Tracing — `303_TRACING.md`
- HTTP API — `304_HTTP_API.md`
- rabbitmqctl — `305_RABBITMQCTL.md`
- rabbitmq-diagnostics — `306_RABBITMQ_DIAGNOSTICS.md`
- rabbitmq-queues — `307_RABBITMQ_QUEUES.md`
- Definitions Export — `308_DEFINITIONS_EXPORT.md`

## Performance & Capacity

- Capacity Mental Model — `309_CAPACITY_MENTAL_MODEL.md`
- Message Rate — `310_MESSAGE_RATE.md`
- Byte Rate — `311_BYTE_RATE.md`
- Message Size — `312_MESSAGE_SIZE.md`
- Connection Count — `313_CONNECTION_COUNT.md`
- Channel Count — `314_CHANNEL_COUNT.md`
- Queue Count — `315_QUEUE_COUNT.md`
- Binding Count — `316_BINDING_COUNT.md`
- Quorum Replication Cost — `317_QUORUM_REPLICATION_COST.md`
- Stream Throughput — `318_STREAM_THROUGHPUT.md`
- Prefetch Tuning — `319_PREFETCH_TUNING.md`
- Publisher Concurrency — `320_PUBLISHER_CONCURRENCY.md`
- Compression Strategy — `321_COMPRESSION_STRATEGY.md`
- Payload Claim Check — `322_PAYLOAD_CLAIM_CHECK.md`
- Backlog Capacity — `323_BACKLOG_CAPACITY.md`
- Failure Headroom — `324_FAILURE_HEADROOM.md`
- Queue Leader Balance — `325_QUEUE_LEADER_BALANCE.md`
- Benchmarking — `326_BENCHMARKING.md`
- PerfTest — `327_PERFTEST.md`
- Latency vs Throughput — `328_LATENCY_VS_THROUGHPUT.md`

## Operations & Deployment

- RabbitMQ Versioning — `329_RABBITMQ_VERSIONING.md`
- Installation — `330_INSTALLATION.md`
- Configuration File — `331_CONFIGURATION_FILE.md`
- Advanced Config — `332_ADVANCED_CONFIG.md`
- Environment Variables — `333_ENVIRONMENT_VARIABLES.md`
- Definitions as Code — `334_DEFINITIONS_AS_CODE.md`
- Policies — `335_POLICIES.md`
- Operator Policies — `336_OPERATOR_POLICIES.md`
- Runtime Parameters — `337_RUNTIME_PARAMETERS.md`
- Rolling Upgrade — `338_ROLLING_UPGRADE.md`
- Blue Green Cluster Migration — `339_BLUE_GREEN_CLUSTER_MIGRATION.md`
- Backup Metadata — `340_BACKUP_METADATA.md`
- Disaster Recovery — `341_DISASTER_RECOVERY.md`
- Cluster Expansion — `342_CLUSTER_EXPANSION.md`
- Cluster Shrink — `343_CLUSTER_SHRINK.md`
- Maintenance Mode — `344_MAINTENANCE_MODE.md`
- Kubernetes Operator — `345_KUBERNETES_OPERATOR.md`
- Messaging Topology Operator — `346_MESSAGING_TOPOLOGY_OPERATOR.md`
- Managed RabbitMQ — `347_MANAGED_RABBITMQ.md`

## Spring / Java / JMS Interop

- RabbitMQ Java Client — `348_RABBITMQ_JAVA_CLIENT.md`
- Spring AMQP — `349_SPRING_AMQP.md`
- RabbitTemplate — `350_RABBITTEMPLATE.md`
- Listener Container — `351_LISTENER_CONTAINER.md`
- Spring Retry — `352_SPRING_RETRY.md`
- Spring DLQ — `353_SPRING_DLQ.md`
- Spring Publisher Confirms — `354_SPRING_PUBLISHER_CONFIRMS.md`
- JMS vs RabbitMQ Native — `355_JMS_VS_RABBITMQ_NATIVE.md`
- RabbitMQ JMS Client — `356_RABBITMQ_JMS_CLIENT.md`
- Protocol Choice — `357_PROTOCOL_CHOICE.md`

## Microservices & EDA Patterns

- Work Queue — `358_WORK_QUEUE.md`
- Pub Sub — `359_PUB_SUB.md`
- Event Notification — `360_EVENT_NOTIFICATION.md`
- Event-Carried State Transfer — `361_EVENT_CARRIED_STATE_TRANSFER.md`
- Command Queue — `362_COMMAND_QUEUE.md`
- Domain Event — `363_DOMAIN_EVENT.md`
- Integration Event — `364_INTEGRATION_EVENT.md`
- Saga Choreography — `365_SAGA_CHOREOGRAPHY.md`
- Saga Orchestration — `366_SAGA_ORCHESTRATION.md`
- Transactional Outbox — `367_TRANSACTIONAL_OUTBOX.md`
- Inbox Pattern — `368_INBOX_PATTERN.md`
- Idempotent Consumer — `369_IDEMPOTENT_CONSUMER.md`
- Competing Consumers — `370_COMPETING_CONSUMERS.md`
- Single Active Consumer Pattern — `371_SINGLE_ACTIVE_CONSUMER_PATTERN.md`
- Priority Worker Pattern — `372_PRIORITY_WORKER_PATTERN.md`
- Retry DLQ Pattern — `373_RETRY_DLQ_PATTERN.md`
- Claim Check — `374_CLAIM_CHECK.md`
- Correlation ID — `375_CORRELATION_ID.md`
- Causation ID — `376_CAUSATION_ID.md`
- Trace Context — `377_TRACE_CONTEXT.md`
- Event Contract Governance — `378_EVENT_CONTRACT_GOVERNANCE.md`

## Troubleshooting

- Publisher Not Confirmed — `379_PUBLISHER_NOT_CONFIRMED.md`
- Unroutable Publish — `380_UNROUTABLE_PUBLISH.md`
- Queue Growing — `381_QUEUE_GROWING.md`
- Unacked Growing — `382_UNACKED_GROWING.md`
- Redelivery Storm — `383_REDELIVERY_STORM.md`
- Memory Alarm — `384_MEMORY_ALARM.md`
- Disk Alarm — `385_DISK_ALARM.md`
- Connection Blocked — `386_CONNECTION_BLOCKED.md`
- PRECONDITION_FAILED — `387_PRECONDITION_FAILED.md`
- ACCESS_REFUSED — `388_ACCESS_REFUSED.md`
- NOT_FOUND — `389_NOT_FOUND.md`
- Channel Closed — `390_CHANNEL_CLOSED.md`
- Consumer Cancelled — `391_CONSUMER_CANCELLED.md`
- Quorum Queue Unavailable — `392_QUORUM_QUEUE_UNAVAILABLE.md`
- Quorum Confirm Slow — `393_QUORUM_CONFIRM_SLOW.md`
- Quorum Redelivery Limit — `394_QUORUM_REDELIVERY_LIMIT.md`
- Stream Read Slow — `395_STREAM_READ_SLOW.md`
- Federation Lag — `396_FEDERATION_LAG.md`
- Shovel Stopped — `397_SHOVEL_STOPPED.md`
- TLS Handshake Failure — `398_TLS_HANDSHAKE_FAILURE.md`
- High Connection Churn — `399_HIGH_CONNECTION_CHURN.md`
- High Channel Count — `400_HIGH_CHANNEL_COUNT.md`
- Cluster Partition — `401_CLUSTER_PARTITION.md`
- Leader Imbalance — `402_LEADER_IMBALANCE.md`
- Golden Troubleshooting Flow — `403_GOLDEN_TROUBLESHOOTING_FLOW.md`

## System Design & Interviews

- Design Work Queue — `404_DESIGN_WORK_QUEUE.md`
- Design Pub Sub — `405_DESIGN_PUB_SUB.md`
- Design Notification System — `406_DESIGN_NOTIFICATION_SYSTEM.md`
- Design Payment Commands — `407_DESIGN_PAYMENT_COMMANDS.md`
- Design RPC — `408_DESIGN_RPC.md`
- Design Event Distribution — `409_DESIGN_EVENT_DISTRIBUTION.md`
- Design Multi Tenant Broker — `410_DESIGN_MULTI_TENANT_BROKER.md`
- Design Multi Region RabbitMQ — `411_DESIGN_MULTI_REGION_RABBITMQ.md`
- RabbitMQ vs Kafka — `412_RABBITMQ_VS_KAFKA.md`
- RabbitMQ vs JMS — `413_RABBITMQ_VS_JMS.md`
- RabbitMQ vs Pulsar — `414_RABBITMQ_VS_PULSAR.md`
- AMQP 0-9-1 vs AMQP 1.0 — `415_AMQP_0_9_1_VS_AMQP_1_0.md`
- Quorum vs Classic Queue — `416_QUORUM_VS_CLASSIC_QUEUE.md`
- Quorum Queue vs Stream — `417_QUORUM_QUEUE_VS_STREAM.md`
- Ack vs Publisher Confirm — `418_ACK_VS_PUBLISHER_CONFIRM.md`
- Reject vs Nack — `419_REJECT_VS_NACK.md`
- TTL vs DLX — `420_TTL_VS_DLX.md`
- Federation vs Shovel — `421_FEDERATION_VS_SHOVEL.md`
- When Not to Use RabbitMQ — `422_WHEN_NOT_TO_USE_RABBITMQ.md`
- RabbitMQ Anti Patterns — `423_RABBITMQ_ANTI_PATTERNS.md`
- RabbitMQ Interview Traps — `424_RABBITMQ_INTERVIEW_TRAPS.md`
