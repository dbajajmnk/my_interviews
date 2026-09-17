# JMS / Jakarta Messaging — Complete Deep-Dive Cheat Sheet


---

<!-- 005_JMS_MENTAL_MODEL.md -->

# JMS Mental Model

## What / Why
JMS / Jakarta Messaging is a Java API specification for loosely coupled enterprise messaging, not a broker or wire protocol.

## Visual
```text
JMS Mental Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Mental Model:** JMS / Jakarta Messaging is a Java API specification for loosely coupled enterprise messaging, not a broker or wire protocol.


---

<!-- 006_JAKARTA_MESSAGING_3_1.md -->

# Jakarta Messaging 3.1

## What / Why
Current final specification baseline, part of Jakarta EE 10, requiring Java SE 11+.

## Visual
```text
Jakarta Messaging 3.1 → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Jakarta Messaging 3.1:** Current final specification baseline, part of Jakarta EE 10, requiring Java SE 11+.


---

<!-- 007_JMS_VS_JAKARTA_MESSAGING.md -->

# JMS vs Jakarta Messaging

## What / Why
The API moved from `javax.jms` to `jakarta.jms`; core concepts remain familiar.

## Visual
```text
JMS vs Jakarta Messaging → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS vs Jakarta Messaging:** The API moved from `javax.jms` to `jakarta.jms`; core concepts remain familiar.


---

<!-- 008_JMS_1_1.md -->

# JMS 1.1

## What / Why
Unified point-to-point and pub/sub domains through common Connection/Session APIs.

## Visual
```text
JMS 1.1 → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS 1.1:** Unified point-to-point and pub/sub domains through common Connection/Session APIs.


---

<!-- 009_JMS_2_0.md -->

# JMS 2.0

## What / Why
Introduced simplified JMSContext/JMSProducer/JMSConsumer API, async send, delivery delay and shared subscriptions.

## Visual
```text
JMS 2.0 → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS 2.0:** Introduced simplified JMSContext/JMSProducer/JMSConsumer API, async send, delivery delay and shared subscriptions.


---

<!-- 00_MASTER_INDEX.md -->

# JMS / Jakarta Messaging — Dedicated Deep-Dive Cheat Sheet Pack

**Current specification baseline:** Jakarta Messaging 3.1 (Jakarta EE 10), API artifact `jakarta.jms:jakarta.jms-api:3.1.0`, Java SE 11+.

**Scope:** JMS/Jakarta Messaging specification semantics, classic and simplified APIs, message types/headers, queues/topics/subscriptions, acknowledgements, local/JTA/XA transactions, async send, JNDI, MDB, Spring JMS, provider adapters, security, performance, testing, troubleshooting and system design.

## Fast Revision
- `01_30_SECOND_RECALL.md`
- `02_CURRENT_BASELINE.md`
- `03_REFERENCE_ARCHITECTURE.md`
- `04_DECISION_TREE.md`

## Foundations & Specification

- JMS Mental Model — `005_JMS_MENTAL_MODEL.md`
- Jakarta Messaging 3.1 — `006_JAKARTA_MESSAGING_3_1.md`
- JMS vs Jakarta Messaging — `007_JMS_VS_JAKARTA_MESSAGING.md`
- JMS 1.1 — `008_JMS_1_1.md`
- JMS 2.0 — `009_JMS_2_0.md`
- Jakarta Messaging 3.0 — `010_JAKARTA_MESSAGING_3_0.md`
- Jakarta Messaging 3.1 — `011_JAKARTA_MESSAGING_3_1.md`
- Specification vs Provider — `012_SPECIFICATION_VS_PROVIDER.md`
- No Wire Protocol — `013_NO_WIRE_PROTOCOL.md`
- No Admin API — `014_NO_ADMIN_API.md`
- No Security Configuration API — `015_NO_SECURITY_CONFIGURATION_API.md`
- Provider Portability — `016_PROVIDER_PORTABILITY.md`
- Messaging Domains — `017_MESSAGING_DOMAINS.md`
- Message Oriented Middleware — `018_MESSAGE_ORIENTED_MIDDLEWARE.md`
- Synchronous vs Asynchronous Consumption — `019_SYNCHRONOUS_VS_ASYNCHRONOUS_CONSUMPTION.md`

## Core Object Model

- ConnectionFactory — `020_CONNECTIONFACTORY.md`
- Connection — `021_CONNECTION.md`
- Session — `022_SESSION.md`
- JMSContext — `023_JMSCONTEXT.md`
- Destination — `024_DESTINATION.md`
- Queue — `025_QUEUE.md`
- Topic — `026_TOPIC.md`
- MessageProducer — `027_MESSAGEPRODUCER.md`
- MessageConsumer — `028_MESSAGECONSUMER.md`
- JMSProducer — `029_JMSPRODUCER.md`
- JMSConsumer — `030_JMSCONSUMER.md`
- MessageListener — `031_MESSAGELISTENER.md`
- CompletionListener — `032_COMPLETIONLISTENER.md`
- ExceptionListener — `033_EXCEPTIONLISTENER.md`
- QueueBrowser — `034_QUEUEBROWSER.md`
- TemporaryQueue — `035_TEMPORARYQUEUE.md`
- TemporaryTopic — `036_TEMPORARYTOPIC.md`

## Classic API Lifecycle

- Classic API Flow — `037_CLASSIC_API_FLOW.md`
- Connection Start — `038_CONNECTION_START.md`
- Connection Stop — `039_CONNECTION_STOP.md`
- Connection Close — `040_CONNECTION_CLOSE.md`
- Session Creation — `041_SESSION_CREATION.md`
- Producer Creation — `042_PRODUCER_CREATION.md`
- Consumer Creation — `043_CONSUMER_CREATION.md`
- Connection Client ID — `044_CONNECTION_CLIENT_ID.md`
- Resource Cleanup — `045_RESOURCE_CLEANUP.md`
- Connection Reuse — `046_CONNECTION_REUSE.md`
- Session Scope — `047_SESSION_SCOPE.md`
- Threading Rule — `048_THREADING_RULE.md`

## Simplified API

- JMSContext Mental Model — `049_JMSCONTEXT_MENTAL_MODEL.md`
- createContext — `050_CREATECONTEXT.md`
- Auto Start — `051_AUTO_START.md`
- createProducer — `052_CREATEPRODUCER.md`
- createConsumer — `053_CREATECONSUMER.md`
- Direct Body Send — `054_DIRECT_BODY_SEND.md`
- receiveBody — `055_RECEIVEBODY.md`
- JMSRuntimeException — `056_JMSRUNTIMEEXCEPTION.md`
- JMSException — `057_JMSEXCEPTION.md`
- JMSContext Close — `058_JMSCONTEXT_CLOSE.md`
- JMSContext Transactions — `059_JMSCONTEXT_TRANSACTIONS.md`
- JMSProducer Fluent API — `060_JMSPRODUCER_FLUENT_API.md`

## Message Model

- Message Anatomy — `061_MESSAGE_ANATOMY.md`
- Message Header — `062_MESSAGE_HEADER.md`
- Message Properties — `063_MESSAGE_PROPERTIES.md`
- Message Body — `064_MESSAGE_BODY.md`
- TextMessage — `065_TEXTMESSAGE.md`
- BytesMessage — `066_BYTESMESSAGE.md`
- MapMessage — `067_MAPMESSAGE.md`
- StreamMessage — `068_STREAMMESSAGE.md`
- ObjectMessage — `069_OBJECTMESSAGE.md`
- Generic Message — `070_GENERIC_MESSAGE.md`
- getBody — `071_GETBODY.md`
- isBodyAssignableTo — `072_ISBODYASSIGNABLETO.md`
- clearBody — `073_CLEARBODY.md`
- clearProperties — `074_CLEARPROPERTIES.md`
- Read Only After Receive — `075_READ_ONLY_AFTER_RECEIVE.md`
- Message Snapshot — `076_MESSAGE_SNAPSHOT.md`

## Standard Headers

- JMSMessageID — `077_JMSMESSAGEID.md`
- JMSTimestamp — `078_JMSTIMESTAMP.md`
- JMSCorrelationID — `079_JMSCORRELATIONID.md`
- JMSReplyTo — `080_JMSREPLYTO.md`
- JMSDestination — `081_JMSDESTINATION.md`
- JMSDeliveryMode — `082_JMSDELIVERYMODE.md`
- JMSRedelivered — `083_JMSREDELIVERED.md`
- JMSType — `084_JMSTYPE.md`
- JMSExpiration — `085_JMSEXPIRATION.md`
- JMSPriority — `086_JMSPRIORITY.md`
- JMSDeliveryTime — `087_JMSDELIVERYTIME.md`
- JMSXDeliveryCount — `088_JMSXDELIVERYCOUNT.md`
- JMSXGroupID — `089_JMSXGROUPID.md`
- JMSXGroupSeq — `090_JMSXGROUPSEQ.md`

## Properties & Selectors

- Message Property Types — `091_MESSAGE_PROPERTY_TYPES.md`
- Application Properties — `092_APPLICATION_PROPERTIES.md`
- Message Selector — `093_MESSAGE_SELECTOR.md`
- Selector Cannot Read Body — `094_SELECTOR_CANNOT_READ_BODY.md`
- Selector Comparison — `095_SELECTOR_COMPARISON.md`
- Selector NULL Semantics — `096_SELECTOR_NULL_SEMANTICS.md`
- Selector Performance — `097_SELECTOR_PERFORMANCE.md`
- Queue Selector Semantics — `098_QUEUE_SELECTOR_SEMANTICS.md`
- Topic Selector Semantics — `099_TOPIC_SELECTOR_SEMANTICS.md`
- Selector Portability — `100_SELECTOR_PORTABILITY.md`

## Point to Point Queues

- Queue Mental Model — `101_QUEUE_MENTAL_MODEL.md`
- Competing Consumers — `102_COMPETING_CONSUMERS.md`
- Queue Ordering — `103_QUEUE_ORDERING.md`
- Queue Browser — `104_QUEUE_BROWSER.md`
- Temporary Queue RPC — `105_TEMPORARY_QUEUE_RPC.md`
- Queue Consumer Scaling — `106_QUEUE_CONSUMER_SCALING.md`
- Queue Backlog — `107_QUEUE_BACKLOG.md`
- Queue Redelivery — `108_QUEUE_REDELIVERY.md`
- Queue Provider Features — `109_QUEUE_PROVIDER_FEATURES.md`

## Publish Subscribe Topics

- Topic Mental Model — `110_TOPIC_MENTAL_MODEL.md`
- Non Durable Subscription — `111_NON_DURABLE_SUBSCRIPTION.md`
- Durable Subscription — `112_DURABLE_SUBSCRIPTION.md`
- Unshared Durable Subscription — `113_UNSHARED_DURABLE_SUBSCRIPTION.md`
- Shared Non Durable Subscription — `114_SHARED_NON_DURABLE_SUBSCRIPTION.md`
- Shared Durable Subscription — `115_SHARED_DURABLE_SUBSCRIPTION.md`
- Subscription Name — `116_SUBSCRIPTION_NAME.md`
- Client ID — `117_CLIENT_ID.md`
- Unsubscribe — `118_UNSUBSCRIBE.md`
- noLocal — `119_NOLOCAL.md`
- Topic Fanout — `120_TOPIC_FANOUT.md`
- Topic vs Queue — `121_TOPIC_VS_QUEUE.md`

## Acknowledgement Modes

- AUTO_ACKNOWLEDGE — `122_AUTO_ACKNOWLEDGE.md`
- CLIENT_ACKNOWLEDGE — `123_CLIENT_ACKNOWLEDGE.md`
- DUPS_OK_ACKNOWLEDGE — `124_DUPS_OK_ACKNOWLEDGE.md`
- SESSION_TRANSACTED — `125_SESSION_TRANSACTED.md`
- Message acknowledge — `126_MESSAGE_ACKNOWLEDGE.md`
- Recover — `127_RECOVER.md`
- Redelivery — `128_REDELIVERY.md`
- Ack Mode vs Business Commit — `129_ACK_MODE_VS_BUSINESS_COMMIT.md`
- Auto Ack Listener — `130_AUTO_ACK_LISTENER.md`
- Dups OK Tradeoff — `131_DUPS_OK_TRADEOFF.md`

## Transactions

- Local JMS Transaction — `132_LOCAL_JMS_TRANSACTION.md`
- Session Commit — `133_SESSION_COMMIT.md`
- Session Rollback — `134_SESSION_ROLLBACK.md`
- Transaction Boundaries — `135_TRANSACTION_BOUNDARIES.md`
- JTA Transaction — `136_JTA_TRANSACTION.md`
- XA — `137_XA.md`
- XAConnectionFactory — `138_XACONNECTIONFACTORY.md`
- XASession — `139_XASESSION.md`
- Two Phase Commit — `140_TWO_PHASE_COMMIT.md`
- Transaction vs Ack Mode — `141_TRANSACTION_VS_ACK_MODE.md`
- Container Transaction Rules — `142_CONTAINER_TRANSACTION_RULES.md`
- Exactly Once Illusion — `143_EXACTLY_ONCE_ILLUSION.md`
- Outbox Alternative — `144_OUTBOX_ALTERNATIVE.md`

## Delivery Semantics

- At Most Once — `145_AT_MOST_ONCE.md`
- At Least Once — `146_AT_LEAST_ONCE.md`
- Effectively Once — `147_EFFECTIVELY_ONCE.md`
- Provider Redelivery — `148_PROVIDER_REDELIVERY.md`
- Duplicate Detection — `149_DUPLICATE_DETECTION.md`
- Poison Message — `150_POISON_MESSAGE.md`
- Dead Letter Queue — `151_DEAD_LETTER_QUEUE.md`
- Idempotent Consumer — `152_IDEMPOTENT_CONSUMER.md`
- Commit Ordering — `153_COMMIT_ORDERING.md`

## Delivery Options

- PERSISTENT — `154_PERSISTENT.md`
- NON_PERSISTENT — `155_NON_PERSISTENT.md`
- Default Delivery Mode — `156_DEFAULT_DELIVERY_MODE.md`
- Priority — `157_PRIORITY.md`
- Time To Live — `158_TIME_TO_LIVE.md`
- Delivery Delay — `159_DELIVERY_DELAY.md`
- Disable Message ID — `160_DISABLE_MESSAGE_ID.md`
- Disable Timestamp — `161_DISABLE_TIMESTAMP.md`
- Producer Default Options — `162_PRODUCER_DEFAULT_OPTIONS.md`
- Per Message Options — `163_PER_MESSAGE_OPTIONS.md`

## Asynchronous Send

- Asynchronous Send — `164_ASYNCHRONOUS_SEND.md`
- CompletionListener onCompletion — `165_COMPLETIONLISTENER_ONCOMPLETION.md`
- CompletionListener onException — `166_COMPLETIONLISTENER_ONEXCEPTION.md`
- Async Send Ordering — `167_ASYNC_SEND_ORDERING.md`
- Async Send Message Ownership — `168_ASYNC_SEND_MESSAGE_OWNERSHIP.md`
- Async Send Close — `169_ASYNC_SEND_CLOSE.md`
- Async Send Commit Rollback — `170_ASYNC_SEND_COMMIT_ROLLBACK.md`
- Async Send Jakarta EE Restriction — `171_ASYNC_SEND_JAKARTA_EE_RESTRICTION.md`
- Async Send Threading — `172_ASYNC_SEND_THREADING.md`

## Message Ordering & Grouping

- JMS Ordering — `173_JMS_ORDERING.md`
- Single Producer Order — `174_SINGLE_PRODUCER_ORDER.md`
- Priority Reordering — `175_PRIORITY_REORDERING.md`
- Selector Effects — `176_SELECTOR_EFFECTS.md`
- Redelivery Effects — `177_REDELIVERY_EFFECTS.md`
- Transactions and Order — `178_TRANSACTIONS_AND_ORDER.md`
- Message Groups — `179_MESSAGE_GROUPS.md`
- Group Sequence — `180_GROUP_SEQUENCE.md`

## Temporary Destinations & RPC

- Temporary Destination — `181_TEMPORARY_DESTINATION.md`
- TemporaryQueue — `182_TEMPORARYQUEUE.md`
- TemporaryTopic — `183_TEMPORARYTOPIC.md`
- Request Reply — `184_REQUEST_REPLY.md`
- Correlation Strategy — `185_CORRELATION_STRATEGY.md`
- RPC Timeout — `186_RPC_TIMEOUT.md`
- RPC Duplicate Risk — `187_RPC_DUPLICATE_RISK.md`
- RPC over JMS Tradeoff — `188_RPC_OVER_JMS_TRADEOFF.md`

## JNDI & Administered Objects

- Administered Object — `189_ADMINISTERED_OBJECT.md`
- JNDI Lookup — `190_JNDI_LOOKUP.md`
- Resource Injection — `191_RESOURCE_INJECTION.md`
- JMSConnectionFactoryDefinition — `192_JMSCONNECTIONFACTORYDEFINITION.md`
- JMSDestinationDefinition — `193_JMSDESTINATIONDEFINITION.md`
- Repeatable Definitions — `194_REPEATABLE_DEFINITIONS.md`
- Provider Configuration — `195_PROVIDER_CONFIGURATION.md`
- Portable Naming — `196_PORTABLE_NAMING.md`

## Jakarta EE Integration

- JMS in Jakarta EE — `197_JMS_IN_JAKARTA_EE.md`
- Managed JMSContext — `198_MANAGED_JMSCONTEXT.md`
- Inject JMSContext — `199_INJECT_JMSCONTEXT.md`
- Message Driven Bean — `200_MESSAGE_DRIVEN_BEAN.md`
- MDB Activation Config — `201_MDB_ACTIVATION_CONFIG.md`
- Container Managed Transaction — `202_CONTAINER_MANAGED_TRANSACTION.md`
- Bean Managed Transaction — `203_BEAN_MANAGED_TRANSACTION.md`
- MDB Redelivery — `204_MDB_REDELIVERY.md`
- Concurrency — `205_CONCURRENCY.md`
- Jakarta EE Restrictions — `206_JAKARTA_EE_RESTRICTIONS.md`

## Message Driven Beans

- MDB Mental Model — `207_MDB_MENTAL_MODEL.md`
- onMessage — `208_ONMESSAGE.md`
- MDB Pool — `209_MDB_POOL.md`
- MDB Transaction — `210_MDB_TRANSACTION.md`
- MDB Rollback — `211_MDB_ROLLBACK.md`
- MDB Idempotency — `212_MDB_IDEMPOTENCY.md`
- MDB vs Listener Container — `213_MDB_VS_LISTENER_CONTAINER.md`
- MDB Provider Portability — `214_MDB_PROVIDER_PORTABILITY.md`

## Spring JMS

- Spring JMS Mental Model — `215_SPRING_JMS_MENTAL_MODEL.md`
- JmsTemplate — `216_JMSTEMPLATE.md`
- convertAndSend — `217_CONVERTANDSEND.md`
- MessageConverter — `218_MESSAGECONVERTER.md`
- SimpleMessageConverter — `219_SIMPLEMESSAGECONVERTER.md`
- MappingJackson2MessageConverter — `220_MAPPINGJACKSON2MESSAGECONVERTER.md`
- @JmsListener — `221_JMSLISTENER.md`
- DefaultJmsListenerContainerFactory — `222_DEFAULTJMSLISTENERCONTAINERFACTORY.md`
- DefaultMessageListenerContainer — `223_DEFAULTMESSAGELISTENERCONTAINER.md`
- CachingConnectionFactory — `224_CACHINGCONNECTIONFACTORY.md`
- SingleConnectionFactory — `225_SINGLECONNECTIONFACTORY.md`
- JmsTransactionManager — `226_JMSTRANSACTIONMANAGER.md`
- JTA with Spring JMS — `227_JTA_WITH_SPRING_JMS.md`
- Spring Retry Integration — `228_SPRING_RETRY_INTEGRATION.md`
- ErrorHandler — `229_ERRORHANDLER.md`
- DestinationResolver — `230_DESTINATIONRESOLVER.md`
- DynamicDestinationResolver — `231_DYNAMICDESTINATIONRESOLVER.md`
- PubSubDomain — `232_PUBSUBDOMAIN.md`
- Concurrency — `233_CONCURRENCY.md`
- SessionTransacted — `234_SESSIONTRANSACTED.md`
- Spring Boot JMS — `235_SPRING_BOOT_JMS.md`

## Provider Implementations

- Provider Adapter Mental Model — `236_PROVIDER_ADAPTER_MENTAL_MODEL.md`
- Apache ActiveMQ Classic — `237_APACHE_ACTIVEMQ_CLASSIC.md`
- Apache Artemis — `238_APACHE_ARTEMIS.md`
- IBM MQ — `239_IBM_MQ.md`
- Oracle WebLogic JMS — `240_ORACLE_WEBLOGIC_JMS.md`
- Eclipse OpenMQ — `241_ECLIPSE_OPENMQ.md`
- RabbitMQ JMS Compatibility — `242_RABBITMQ_JMS_COMPATIBILITY.md`
- Provider Extensions — `243_PROVIDER_EXTENSIONS.md`
- Provider Lock In — `244_PROVIDER_LOCK_IN.md`
- Provider Selection — `245_PROVIDER_SELECTION.md`

## ActiveMQ Artemis Adapter

- Artemis Address vs Queue — `246_ARTEMIS_ADDRESS_VS_QUEUE.md`
- Anycast — `247_ANYCAST.md`
- Multicast — `248_MULTICAST.md`
- JMS Queue Mapping — `249_JMS_QUEUE_MAPPING.md`
- JMS Topic Mapping — `250_JMS_TOPIC_MAPPING.md`
- Artemis Core Protocol — `251_ARTEMIS_CORE_PROTOCOL.md`
- Artemis AMQP Support — `252_ARTEMIS_AMQP_SUPPORT.md`
- Artemis HA — `253_ARTEMIS_HA.md`
- Artemis Redelivery — `254_ARTEMIS_REDELIVERY.md`
- Artemis Message Groups — `255_ARTEMIS_MESSAGE_GROUPS.md`

## IBM MQ Adapter

- IBM MQ Queue Manager — `256_IBM_MQ_QUEUE_MANAGER.md`
- Local Queue — `257_LOCAL_QUEUE.md`
- Remote Queue Definition — `258_REMOTE_QUEUE_DEFINITION.md`
- Transmission Queue — `259_TRANSMISSION_QUEUE.md`
- Channels — `260_CHANNELS.md`
- JMS Administered Objects IBM MQ — `261_JMS_ADMINISTERED_OBJECTS_IBM_MQ.md`
- Persistent Messaging IBM MQ — `262_PERSISTENT_MESSAGING_IBM_MQ.md`
- IBM MQ Transactions — `263_IBM_MQ_TRANSACTIONS.md`
- IBM MQ Backout Queue — `264_IBM_MQ_BACKOUT_QUEUE.md`
- IBM MQ vs JMS — `265_IBM_MQ_VS_JMS.md`

## Transactions & Integration Patterns

- DB plus JMS Dual Write Problem — `266_DB_PLUS_JMS_DUAL_WRITE_PROBLEM.md`
- XA Solution — `267_XA_SOLUTION.md`
- Outbox Solution — `268_OUTBOX_SOLUTION.md`
- Inbox Pattern — `269_INBOX_PATTERN.md`
- Saga Choreography — `270_SAGA_CHOREOGRAPHY.md`
- Saga Orchestration — `271_SAGA_ORCHESTRATION.md`
- Compensating Transaction — `272_COMPENSATING_TRANSACTION.md`
- Exactly Once Business Outcome — `273_EXACTLY_ONCE_BUSINESS_OUTCOME.md`
- Correlation ID Pattern — `274_CORRELATION_ID_PATTERN.md`
- Causation ID Pattern — `275_CAUSATION_ID_PATTERN.md`

## Security Architecture

- JMS Security Boundary — `276_JMS_SECURITY_BOUNDARY.md`
- TLS — `277_TLS.md`
- mTLS — `278_MTLS.md`
- Username Password — `279_USERNAME_PASSWORD.md`
- OAuth OIDC — `280_OAUTH_OIDC.md`
- JAAS — `281_JAAS.md`
- Destination Authorization — `282_DESTINATION_AUTHORIZATION.md`
- JNDI Security — `283_JNDI_SECURITY.md`
- Secrets Management — `284_SECRETS_MANAGEMENT.md`
- Least Privilege — `285_LEAST_PRIVILEGE.md`
- Deserialization Risk — `286_DESERIALIZATION_RISK.md`
- Prefer Interoperable Payloads — `287_PREFER_INTEROPERABLE_PAYLOADS.md`
- Audit — `288_AUDIT.md`

## Performance & Capacity

- Performance Mental Model — `289_PERFORMANCE_MENTAL_MODEL.md`
- Connection Pooling — `290_CONNECTION_POOLING.md`
- Session Pooling — `291_SESSION_POOLING.md`
- Producer Reuse — `292_PRODUCER_REUSE.md`
- Consumer Concurrency — `293_CONSUMER_CONCURRENCY.md`
- Message Size — `294_MESSAGE_SIZE.md`
- Claim Check — `295_CLAIM_CHECK.md`
- Persistent Cost — `296_PERSISTENT_COST.md`
- Transactions Cost — `297_TRANSACTIONS_COST.md`
- Batch Transaction — `298_BATCH_TRANSACTION.md`
- Prefetch Provider Specific — `299_PREFETCH_PROVIDER_SPECIFIC.md`
- Selectors Cost — `300_SELECTORS_COST.md`
- Topic Fanout Cost — `301_TOPIC_FANOUT_COST.md`
- Backlog Capacity — `302_BACKLOG_CAPACITY.md`
- Slow Consumer — `303_SLOW_CONSUMER.md`
- Benchmark Portably — `304_BENCHMARK_PORTABLY.md`

## Observability

- JMS Observability Model — `305_JMS_OBSERVABILITY_MODEL.md`
- Producer Send Latency — `306_PRODUCER_SEND_LATENCY.md`
- Consumer Processing Latency — `307_CONSUMER_PROCESSING_LATENCY.md`
- Queue Depth — `308_QUEUE_DEPTH.md`
- Unacked Inflight — `309_UNACKED_INFLIGHT.md`
- Redelivery Count — `310_REDELIVERY_COUNT.md`
- Expired Messages — `311_EXPIRED_MESSAGES.md`
- DLQ Depth — `312_DLQ_DEPTH.md`
- Consumer Count — `313_CONSUMER_COUNT.md`
- Connection Count — `314_CONNECTION_COUNT.md`
- Transaction Rollback Rate — `315_TRANSACTION_ROLLBACK_RATE.md`
- XA Heuristic Failures — `316_XA_HEURISTIC_FAILURES.md`
- Trace Headers — `317_TRACE_HEADERS.md`
- Business SLO — `318_BUSINESS_SLO.md`

## Testing

- Unit Test Producer Logic — `319_UNIT_TEST_PRODUCER_LOGIC.md`
- Embedded Broker Tests — `320_EMBEDDED_BROKER_TESTS.md`
- Testcontainers — `321_TESTCONTAINERS.md`
- Contract Tests — `322_CONTRACT_TESTS.md`
- Redelivery Test — `323_REDELIVERY_TEST.md`
- Transaction Test — `324_TRANSACTION_TEST.md`
- Selector Test — `325_SELECTOR_TEST.md`
- Durable Subscription Test — `326_DURABLE_SUBSCRIPTION_TEST.md`
- Shared Subscription Test — `327_SHARED_SUBSCRIPTION_TEST.md`
- Failover Test — `328_FAILOVER_TEST.md`
- Performance Test — `329_PERFORMANCE_TEST.md`

## Troubleshooting

- Connection Failure — `330_CONNECTION_FAILURE.md`
- JNDI Name Not Found — `331_JNDI_NAME_NOT_FOUND.md`
- JMSException — `332_JMSEXCEPTION.md`
- JMSRuntimeException — `333_JMSRUNTIMEEXCEPTION.md`
- InvalidDestination — `334_INVALIDDESTINATION.md`
- InvalidClientID — `335_INVALIDCLIENTID.md`
- Message Format Error — `336_MESSAGE_FORMAT_ERROR.md`
- Selector Not Matching — `337_SELECTOR_NOT_MATCHING.md`
- No Messages Received — `338_NO_MESSAGES_RECEIVED.md`
- Duplicate Delivery — `339_DUPLICATE_DELIVERY.md`
- Messages Disappear — `340_MESSAGES_DISAPPEAR.md`
- Durable Subscription Missing Messages — `341_DURABLE_SUBSCRIPTION_MISSING_MESSAGES.md`
- Queue Backlog Growing — `342_QUEUE_BACKLOG_GROWING.md`
- Poison Message Loop — `343_POISON_MESSAGE_LOOP.md`
- Transaction Rollback Loop — `344_TRANSACTION_ROLLBACK_LOOP.md`
- XA In Doubt — `345_XA_IN_DOUBT.md`
- ObjectMessage Failure — `346_OBJECTMESSAGE_FAILURE.md`
- Async Send Callback Missing — `347_ASYNC_SEND_CALLBACK_MISSING.md`
- Threading Error — `348_THREADING_ERROR.md`
- Golden Troubleshooting Flow — `349_GOLDEN_TROUBLESHOOTING_FLOW.md`

## System Design & Interviews

- Design Work Queue — `350_DESIGN_WORK_QUEUE.md`
- Design Pub Sub — `351_DESIGN_PUB_SUB.md`
- Design Shared Durable Subscription — `352_DESIGN_SHARED_DURABLE_SUBSCRIPTION.md`
- Design RPC — `353_DESIGN_RPC.md`
- Design Payment Processing — `354_DESIGN_PAYMENT_PROCESSING.md`
- Design Integration Bus — `355_DESIGN_INTEGRATION_BUS.md`
- Design XA Workflow — `356_DESIGN_XA_WORKFLOW.md`
- Design Outbox Workflow — `357_DESIGN_OUTBOX_WORKFLOW.md`
- JMS vs RabbitMQ — `358_JMS_VS_RABBITMQ.md`
- JMS vs Kafka — `359_JMS_VS_KAFKA.md`
- JMS vs Pulsar — `360_JMS_VS_PULSAR.md`
- JMS vs AMQP — `361_JMS_VS_AMQP.md`
- JMS vs ActiveMQ — `362_JMS_VS_ACTIVEMQ.md`
- JMS vs Jakarta Messaging — `363_JMS_VS_JAKARTA_MESSAGING.md`
- Queue vs Topic — `364_QUEUE_VS_TOPIC.md`
- Durable vs Non Durable Subscription — `365_DURABLE_VS_NON_DURABLE_SUBSCRIPTION.md`
- Shared vs Unshared Durable — `366_SHARED_VS_UNSHARED_DURABLE.md`
- AUTO vs CLIENT vs DUPS OK — `367_AUTO_VS_CLIENT_VS_DUPS_OK.md`
- Local Transaction vs XA — `368_LOCAL_TRANSACTION_VS_XA.md`
- When Not to Use JMS — `369_WHEN_NOT_TO_USE_JMS.md`
- JMS Anti Patterns — `370_JMS_ANTI_PATTERNS.md`
- JMS Interview Traps — `371_JMS_INTERVIEW_TRAPS.md`


---

<!-- 010_JAKARTA_MESSAGING_3_0.md -->

# Jakarta Messaging 3.0

## What / Why
Namespace migration from javax.jms to jakarta.jms for Jakarta EE 9.

## Visual
```text
Jakarta Messaging 3.0 → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Jakarta Messaging 3.0:** Namespace migration from javax.jms to jakarta.jms for Jakarta EE 9.


---

<!-- 011_JAKARTA_MESSAGING_3_1.md -->

# Jakarta Messaging 3.1

## What / Why
Incremental spec update aligned with Jakarta EE 10.

## Visual
```text
Jakarta Messaging 3.1 → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Jakarta Messaging 3.1:** Incremental spec update aligned with Jakarta EE 10.


---

<!-- 012_SPECIFICATION_VS_PROVIDER.md -->

# Specification vs Provider

## What / Why
JMS defines portable Java messaging semantics; providers implement transport, administration, persistence, HA and security.

## Visual
```text
Specification vs Provider → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Specification vs Provider:** JMS defines portable Java messaging semantics; providers implement transport, administration, persistence, HA and security.


---

<!-- 013_NO_WIRE_PROTOCOL.md -->

# No Wire Protocol

## What / Why
JMS does not define a network wire protocol.

## Visual
```text
No Wire Protocol → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **No Wire Protocol:** JMS does not define a network wire protocol.


---

<!-- 014_NO_ADMIN_API.md -->

# No Admin API

## What / Why
JMS does not standardize provider administration.

## Visual
```text
No Admin API → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **No Admin API:** JMS does not standardize provider administration.


---

<!-- 015_NO_SECURITY_CONFIGURATION_API.md -->

# No Security Configuration API

## What / Why
Message privacy/integrity and provider security setup are provider concerns.

## Visual
```text
No Security Configuration API → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **No Security Configuration API:** Message privacy/integrity and provider security setup are provider concerns.


---

<!-- 016_PROVIDER_PORTABILITY.md -->

# Provider Portability

## What / Why
Applications can reduce vendor coupling by using standard JMS APIs and avoiding vendor extensions.

## Visual
```text
Provider Portability → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Provider Portability:** Applications can reduce vendor coupling by using standard JMS APIs and avoiding vendor extensions.


---

<!-- 017_MESSAGING_DOMAINS.md -->

# Messaging Domains

## What / Why
Point-to-point queues and publish/subscribe topics.

## Visual
```text
Messaging Domains → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Messaging Domains:** Point-to-point queues and publish/subscribe topics.


---

<!-- 018_MESSAGE_ORIENTED_MIDDLEWARE.md -->

# Message Oriented Middleware

## What / Why
JMS abstracts enterprise message brokers/message-oriented middleware behind a standard Java API.

## Visual
```text
Message Oriented Middleware → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Oriented Middleware:** JMS abstracts enterprise message brokers/message-oriented middleware behind a standard Java API.


---

<!-- 019_SYNCHRONOUS_VS_ASYNCHRONOUS_CONSUMPTION.md -->

# Synchronous vs Asynchronous Consumption

## What / Why
Messages may be received synchronously or via listeners.

## Visual
```text
Synchronous vs Asynchronous Consumption → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Synchronous vs Asynchronous Consumption:** Messages may be received synchronously or via listeners.


---

<!-- 01_30_SECOND_RECALL.md -->

# JMS / Jakarta Messaging — 30-Second Recall

```text
ConnectionFactory
      ↓
Connection / JMSContext
      ↓
Session
 ├── Producer → Queue / Topic
 └── Consumer ← Queue / Subscription
```

## Queue
```text
Producer → Queue → one consuming path
```

## Topic
```text
Publisher → Topic
              ├→ Subscription A
              └→ Subscription B
```

## Reliability
```text
PERSISTENT delivery
+ correct ack/transaction
+ provider HA/persistence
+ idempotent consumer
```

## Key Rule
**JMS is a Java API specification.**
It does **not** define the broker, administration model, security configuration, or wire protocol.


---

<!-- 020_CONNECTIONFACTORY.md -->

# ConnectionFactory

## What / Why
Administered factory used to create Connection or JMSContext instances.

## Visual
```text
ConnectionFactory → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **ConnectionFactory:** Administered factory used to create Connection or JMSContext instances.


---

<!-- 021_CONNECTION.md -->

# Connection

## What / Why
Active client connection to the messaging provider.

## Visual
```text
Connection → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection:** Active client connection to the messaging provider.


---

<!-- 022_SESSION.md -->

# Session

## What / Why
Single-threaded context for producing/consuming messages and transactions/acknowledgements.

## Visual
```text
Session → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Session:** Single-threaded context for producing/consuming messages and transactions/acknowledgements.


---

<!-- 023_JMSCONTEXT.md -->

# JMSContext

## What / Why
Simplified API object combining connection and session behavior.

## Visual
```text
JMSContext → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSContext:** Simplified API object combining connection and session behavior.


---

<!-- 024_DESTINATION.md -->

# Destination

## What / Why
Common supertype representing Queue or Topic.

## Visual
```text
Destination → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Destination:** Common supertype representing Queue or Topic.


---

<!-- 025_QUEUE.md -->

# Queue

## What / Why
Point-to-point destination abstraction.

## Visual
```text
Queue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue:** Point-to-point destination abstraction.


---

<!-- 026_TOPIC.md -->

# Topic

## What / Why
Publish/subscribe destination abstraction.

## Visual
```text
Topic → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Topic:** Publish/subscribe destination abstraction.


---

<!-- 027_MESSAGEPRODUCER.md -->

# MessageProducer

## What / Why
Classic API producer created by Session.

## Visual
```text
MessageProducer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MessageProducer:** Classic API producer created by Session.


---

<!-- 028_MESSAGECONSUMER.md -->

# MessageConsumer

## What / Why
Classic API consumer created by Session.

## Visual
```text
MessageConsumer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MessageConsumer:** Classic API consumer created by Session.


---

<!-- 029_JMSPRODUCER.md -->

# JMSProducer

## What / Why
Simplified reusable producer created by JMSContext.

## Visual
```text
JMSProducer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSProducer:** Simplified reusable producer created by JMSContext.


---

<!-- 02_CURRENT_BASELINE.md -->

# Current Baseline — Jakarta Messaging 3.1

## Specification
- **Jakarta Messaging 3.1**
- Jakarta EE 10 release
- Maven: `jakarta.jms:jakarta.jms-api:3.1.0`
- Minimum Java SE: **11+**

## Lineage
```text
JMS 1.x
  ↓
JMS 2.0
  ↓
Jakarta Messaging 3.0
  ↓
Jakarta Messaging 3.1
```

## Namespace Migration
```java
javax.jms.*
    ↓
jakarta.jms.*
```

## Architectural Boundary
Jakarta Messaging standardizes Java messaging APIs and semantics.

It does not standardize:
- broker administration
- wire protocol
- security/privacy configuration
- persistence architecture
- clustering/HA topology
- DLQ/redelivery policy
- provider monitoring

Those remain provider-specific.


---

<!-- 030_JMSCONSUMER.md -->

# JMSConsumer

## What / Why
Simplified consumer created by JMSContext.

## Visual
```text
JMSConsumer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSConsumer:** Simplified consumer created by JMSContext.


---

<!-- 031_MESSAGELISTENER.md -->

# MessageListener

## What / Why
Callback interface for asynchronous message delivery.

## Visual
```text
MessageListener → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MessageListener:** Callback interface for asynchronous message delivery.


---

<!-- 032_COMPLETIONLISTENER.md -->

# CompletionListener

## What / Why
Callback for asynchronous send completion/failure.

## Visual
```text
CompletionListener → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **CompletionListener:** Callback for asynchronous send completion/failure.


---

<!-- 033_EXCEPTIONLISTENER.md -->

# ExceptionListener

## What / Why
Connection-level asynchronous provider exception callback.

## Visual
```text
ExceptionListener → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **ExceptionListener:** Connection-level asynchronous provider exception callback.


---

<!-- 034_QUEUEBROWSER.md -->

# QueueBrowser

## What / Why
Non-destructively enumerates queued messages where provider supports semantics.

## Visual
```text
QueueBrowser → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **QueueBrowser:** Non-destructively enumerates queued messages where provider supports semantics.


---

<!-- 035_TEMPORARYQUEUE.md -->

# TemporaryQueue

## What / Why
Temporary point-to-point destination tied to connection lifetime.

## Visual
```text
TemporaryQueue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **TemporaryQueue:** Temporary point-to-point destination tied to connection lifetime.


---

<!-- 036_TEMPORARYTOPIC.md -->

# TemporaryTopic

## What / Why
Temporary pub/sub destination tied to connection lifetime.

## Visual
```text
TemporaryTopic → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **TemporaryTopic:** Temporary pub/sub destination tied to connection lifetime.


---

<!-- 037_CLASSIC_API_FLOW.md -->

# Classic API Flow

## What / Why
ConnectionFactory → Connection → Session → Producer/Consumer → start → send/receive.

## Visual
```text
Classic API Flow → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Classic API Flow:** ConnectionFactory → Connection → Session → Producer/Consumer → start → send/receive.


---

<!-- 038_CONNECTION_START.md -->

# Connection Start

## What / Why
Classic API inhibits message delivery until `Connection.start()` is called.

## Visual
```text
Connection Start → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Start:** Classic API inhibits message delivery until `Connection.start()` is called.


---

<!-- 039_CONNECTION_STOP.md -->

# Connection Stop

## What / Why
Temporarily stops message delivery without closing resources.

## Visual
```text
Connection Stop → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Stop:** Temporarily stops message delivery without closing resources.


---

<!-- 03_REFERENCE_ARCHITECTURE.md -->

# JMS Reference Architecture

```text
              Java Application
                    │
           JMS / Jakarta Messaging API
                    │
       ConnectionFactory / Destination
                    │
                JMS Provider
     ┌──────────────┼──────────────┐
     ▼              ▼              ▼
  Queue          Topic         Provider HA
     │          Subscriptions      / Store
     ▼
 Consumer(s)

Provider examples:
ActiveMQ / Artemis / IBM MQ / WebLogic / OpenMQ / others
```

## Enterprise Layers
```text
Application
→ Spring JMS / MDB / direct JMS API
→ JMS Provider
→ Broker persistence/HA/protocol
→ Monitoring / Security / Admin
```


---

<!-- 040_CONNECTION_CLOSE.md -->

# Connection Close

## What / Why
Closes connection and associated sessions/producers/consumers.

## Visual
```text
Connection Close → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Close:** Closes connection and associated sessions/producers/consumers.


---

<!-- 041_SESSION_CREATION.md -->

# Session Creation

## What / Why
Create transacted or acknowledgement-mode sessions.

## Visual
```text
Session Creation → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Session Creation:** Create transacted or acknowledgement-mode sessions.


---

<!-- 042_PRODUCER_CREATION.md -->

# Producer Creation

## What / Why
Session creates MessageProducer for a destination or anonymous producer.

## Visual
```text
Producer Creation → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Producer Creation:** Session creates MessageProducer for a destination or anonymous producer.


---

<!-- 043_CONSUMER_CREATION.md -->

# Consumer Creation

## What / Why
Session creates MessageConsumer with optional selector/noLocal semantics.

## Visual
```text
Consumer Creation → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Consumer Creation:** Session creates MessageConsumer with optional selector/noLocal semantics.


---

<!-- 044_CONNECTION_CLIENT_ID.md -->

# Connection Client ID

## What / Why
Identifier used by durable subscriptions and provider behavior.

## Visual
```text
Connection Client ID → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Client ID:** Identifier used by durable subscriptions and provider behavior.


---

<!-- 045_RESOURCE_CLEANUP.md -->

# Resource Cleanup

## What / Why
Use try-with-resources where API types support AutoCloseable and container rules permit.

## Visual
```text
Resource Cleanup → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Resource Cleanup:** Use try-with-resources where API types support AutoCloseable and container rules permit.


---

<!-- 046_CONNECTION_REUSE.md -->

# Connection Reuse

## What / Why
Connections are comparatively heavyweight and should usually be reused/pool-managed.

## Visual
```text
Connection Reuse → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Reuse:** Connections are comparatively heavyweight and should usually be reused/pool-managed.


---

<!-- 047_SESSION_SCOPE.md -->

# Session Scope

## What / Why
Sessions represent ordered single-threaded work contexts and are cheaper than connections.

## Visual
```text
Session Scope → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Session Scope:** Sessions represent ordered single-threaded work contexts and are cheaper than connections.


---

<!-- 048_THREADING_RULE.md -->

# Threading Rule

## What / Why
A Session is intended to be used by one thread of control at a time.

## Visual
```text
Threading Rule → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Threading Rule:** A Session is intended to be used by one thread of control at a time.


---

<!-- 049_JMSCONTEXT_MENTAL_MODEL.md -->

# JMSContext Mental Model

## What / Why
JMSContext combines Connection and Session concepts into a simpler AutoCloseable API.

## Visual
```text
JMSContext Mental Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSContext Mental Model:** JMSContext combines Connection and Session concepts into a simpler AutoCloseable API.


---

<!-- 04_DECISION_TREE.md -->

# JMS Decision Tree

```text
Java application needs portable brokered messaging API?
→ JMS / Jakarta Messaging candidate

One message should be handled by one consuming path?
→ Queue

Every subscriber needs its own copy?
→ Topic

Subscriber must receive messages while offline?
→ Durable subscription

Multiple consumers need to share one topic subscription?
→ Shared durable/non-durable subscription

Need atomic JMS-only receive/send?
→ Local transacted Session

Need DB + JMS atomic transaction?
├─ XA/JTA justified and provider supports it → XA
└─ Prefer simpler distributed architecture → Outbox + idempotency

Need polyglot native broker features?
→ Use provider protocol/API where portability is less important
```


---

<!-- 050_CREATECONTEXT.md -->

# createContext

## What / Why
ConnectionFactory creates JMSContext with an acknowledgement/session mode.

## Visual
```text
createContext → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **createContext:** ConnectionFactory creates JMSContext with an acknowledgement/session mode.


---

<!-- 051_AUTO_START.md -->

# Auto Start

## What / Why
Simplified API automatically starts message delivery by default.

## Visual
```text
Auto Start → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Auto Start:** Simplified API automatically starts message delivery by default.


---

<!-- 052_CREATEPRODUCER.md -->

# createProducer

## What / Why
JMSContext creates a reusable JMSProducer.

## Visual
```text
createProducer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **createProducer:** JMSContext creates a reusable JMSProducer.


---

<!-- 053_CREATECONSUMER.md -->

# createConsumer

## What / Why
JMSContext creates JMSConsumer for a destination.

## Visual
```text
createConsumer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **createConsumer:** JMSContext creates JMSConsumer for a destination.


---

<!-- 054_DIRECT_BODY_SEND.md -->

# Direct Body Send

## What / Why
JMSProducer can send String, byte[], Map or Serializable bodies directly.

## Visual
```text
Direct Body Send → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Direct Body Send:** JMSProducer can send String, byte[], Map or Serializable bodies directly.


---

<!-- 055_RECEIVEBODY.md -->

# receiveBody

## What / Why
JMSConsumer can directly receive typed message bodies.

## Visual
```text
receiveBody → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **receiveBody:** JMSConsumer can directly receive typed message bodies.


---

<!-- 056_JMSRUNTIMEEXCEPTION.md -->

# JMSRuntimeException

## What / Why
Simplified API uses unchecked JMSRuntimeException in many paths.

## Visual
```text
JMSRuntimeException → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSRuntimeException:** Simplified API uses unchecked JMSRuntimeException in many paths.


---

<!-- 057_JMSEXCEPTION.md -->

# JMSException

## What / Why
Classic API uses checked JMSException.

## Visual
```text
JMSException → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSException:** Classic API uses checked JMSException.


---

<!-- 058_JMSCONTEXT_CLOSE.md -->

# JMSContext Close

## What / Why
Closing context closes its underlying session/connection resources.

## Visual
```text
JMSContext Close → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSContext Close:** Closing context closes its underlying session/connection resources.


---

<!-- 059_JMSCONTEXT_TRANSACTIONS.md -->

# JMSContext Transactions

## What / Why
SESSION_TRANSACTED context supports local commit/rollback in Java SE-style use.

## Visual
```text
JMSContext Transactions → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSContext Transactions:** SESSION_TRANSACTED context supports local commit/rollback in Java SE-style use.


---

<!-- 060_JMSPRODUCER_FLUENT_API.md -->

# JMSProducer Fluent API

## What / Why
Producer configuration methods return the producer for fluent configuration.

## Visual
```text
JMSProducer Fluent API → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSProducer Fluent API:** Producer configuration methods return the producer for fluent configuration.


---

<!-- 061_MESSAGE_ANATOMY.md -->

# Message Anatomy

## What / Why
Headers + properties + body form a JMS message.

## Visual
```text
Message Anatomy → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Anatomy:** Headers + properties + body form a JMS message.


---

<!-- 062_MESSAGE_HEADER.md -->

# Message Header

## What / Why
Standard provider/application routing and delivery metadata.

## Visual
```text
Message Header → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Header:** Standard provider/application routing and delivery metadata.


---

<!-- 063_MESSAGE_PROPERTIES.md -->

# Message Properties

## What / Why
Typed name-value metadata used by applications/selectors.

## Visual
```text
Message Properties → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Properties:** Typed name-value metadata used by applications/selectors.


---

<!-- 064_MESSAGE_BODY.md -->

# Message Body

## What / Why
Payload whose structure depends on message type.

## Visual
```text
Message Body → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Body:** Payload whose structure depends on message type.


---

<!-- 065_TEXTMESSAGE.md -->

# TextMessage

## What / Why
String body, commonly used for JSON/XML/text payloads.

## Visual
```text
TextMessage → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **TextMessage:** String body, commonly used for JSON/XML/text payloads.


---

<!-- 066_BYTESMESSAGE.md -->

# BytesMessage

## What / Why
Raw byte stream body.

## Visual
```text
BytesMessage → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **BytesMessage:** Raw byte stream body.


---

<!-- 067_MAPMESSAGE.md -->

# MapMessage

## What / Why
String-keyed map of primitive-compatible values.

## Visual
```text
MapMessage → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MapMessage:** String-keyed map of primitive-compatible values.


---

<!-- 068_STREAMMESSAGE.md -->

# StreamMessage

## What / Why
Sequential stream of primitive-compatible values.

## Visual
```text
StreamMessage → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **StreamMessage:** Sequential stream of primitive-compatible values.


---

<!-- 069_OBJECTMESSAGE.md -->

# ObjectMessage

## What / Why
Serializable Java object body; portability/security concerns make it a legacy-heavy choice.

## Visual
```text
ObjectMessage → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **ObjectMessage:** Serializable Java object body; portability/security concerns make it a legacy-heavy choice.


---

<!-- 070_GENERIC_MESSAGE.md -->

# Generic Message

## What / Why
Header/properties-only Message with no typed body.

## Visual
```text
Generic Message → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Generic Message:** Header/properties-only Message with no typed body.


---

<!-- 071_GETBODY.md -->

# getBody

## What / Why
Modern API can retrieve a message body as an expected type.

## Visual
```text
getBody → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **getBody:** Modern API can retrieve a message body as an expected type.


---

<!-- 072_ISBODYASSIGNABLETO.md -->

# isBodyAssignableTo

## What / Why
Checks whether body can be assigned to requested Java type.

## Visual
```text
isBodyAssignableTo → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **isBodyAssignableTo:** Checks whether body can be assigned to requested Java type.


---

<!-- 073_CLEARBODY.md -->

# clearBody

## What / Why
Clears body and makes it writable again.

## Visual
```text
clearBody → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **clearBody:** Clears body and makes it writable again.


---

<!-- 074_CLEARPROPERTIES.md -->

# clearProperties

## What / Why
Clears application properties.

## Visual
```text
clearProperties → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **clearProperties:** Clears application properties.


---

<!-- 075_READ_ONLY_AFTER_RECEIVE.md -->

# Read Only After Receive

## What / Why
Received message bodies/properties have provider-defined read-only modes until cleared.

## Visual
```text
Read Only After Receive → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Read Only After Receive:** Received message bodies/properties have provider-defined read-only modes until cleared.


---

<!-- 076_MESSAGE_SNAPSHOT.md -->

# Message Snapshot

## What / Why
Provider may snapshot body/state when sending; application should not mutate concurrently.

## Visual
```text
Message Snapshot → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Snapshot:** Provider may snapshot body/state when sending; application should not mutate concurrently.


---

<!-- 077_JMSMESSAGEID.md -->

# JMSMessageID

## What / Why
Provider-assigned unique-ish message identifier.

## Visual
```text
JMSMessageID → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSMessageID:** Provider-assigned unique-ish message identifier.


---

<!-- 078_JMSTIMESTAMP.md -->

# JMSTimestamp

## What / Why
Provider send timestamp unless disabled.

## Visual
```text
JMSTimestamp → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSTimestamp:** Provider send timestamp unless disabled.


---

<!-- 079_JMSCORRELATIONID.md -->

# JMSCorrelationID

## What / Why
Correlates request/reply or related messages.

## Visual
```text
JMSCorrelationID → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSCorrelationID:** Correlates request/reply or related messages.


---

<!-- 080_JMSREPLYTO.md -->

# JMSReplyTo

## What / Why
Destination where a reply should be sent.

## Visual
```text
JMSReplyTo → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSReplyTo:** Destination where a reply should be sent.


---

<!-- 081_JMSDESTINATION.md -->

# JMSDestination

## What / Why
Destination to which message was sent.

## Visual
```text
JMSDestination → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSDestination:** Destination to which message was sent.


---

<!-- 082_JMSDELIVERYMODE.md -->

# JMSDeliveryMode

## What / Why
PERSISTENT or NON_PERSISTENT delivery mode.

## Visual
```text
JMSDeliveryMode → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSDeliveryMode:** PERSISTENT or NON_PERSISTENT delivery mode.


---

<!-- 083_JMSREDELIVERED.md -->

# JMSRedelivered

## What / Why
Indicates the message may have been delivered previously.

## Visual
```text
JMSRedelivered → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSRedelivered:** Indicates the message may have been delivered previously.


---

<!-- 084_JMSTYPE.md -->

# JMSType

## What / Why
Application-defined type identifier.

## Visual
```text
JMSType → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSType:** Application-defined type identifier.


---

<!-- 085_JMSEXPIRATION.md -->

# JMSExpiration

## What / Why
Absolute expiration time derived from time-to-live.

## Visual
```text
JMSExpiration → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSExpiration:** Absolute expiration time derived from time-to-live.


---

<!-- 086_JMSPRIORITY.md -->

# JMSPriority

## What / Why
Priority 0-9, default 4.

## Visual
```text
JMSPriority → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSPriority:** Priority 0-9, default 4.


---

<!-- 087_JMSDELIVERYTIME.md -->

# JMSDeliveryTime

## What / Why
Earliest provider delivery time after configured delay.

## Visual
```text
JMSDeliveryTime → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSDeliveryTime:** Earliest provider delivery time after configured delay.


---

<!-- 088_JMSXDELIVERYCOUNT.md -->

# JMSXDeliveryCount

## What / Why
Provider property commonly indicating delivery attempt count when supported by required semantics.

## Visual
```text
JMSXDeliveryCount → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSXDeliveryCount:** Provider property commonly indicating delivery attempt count when supported by required semantics.


---

<!-- 089_JMSXGROUPID.md -->

# JMSXGroupID

## What / Why
Standard extension property commonly used for message grouping.

## Visual
```text
JMSXGroupID → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSXGroupID:** Standard extension property commonly used for message grouping.


---

<!-- 090_JMSXGROUPSEQ.md -->

# JMSXGroupSeq

## What / Why
Sequence metadata for grouped messages.

## Visual
```text
JMSXGroupSeq → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSXGroupSeq:** Sequence metadata for grouped messages.


---

<!-- 091_MESSAGE_PROPERTY_TYPES.md -->

# Message Property Types

## What / Why
Properties support boolean, byte, short, int, long, float, double and String.

## Visual
```text
Message Property Types → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Property Types:** Properties support boolean, byte, short, int, long, float, double and String.


---

<!-- 092_APPLICATION_PROPERTIES.md -->

# Application Properties

## What / Why
Custom metadata used for routing/filtering/business context.

## Visual
```text
Application Properties → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Application Properties:** Custom metadata used for routing/filtering/business context.


---

<!-- 093_MESSAGE_SELECTOR.md -->

# Message Selector

## What / Why
SQL92-subset expression filtering on headers/properties.

## Visual
```text
Message Selector → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Selector:** SQL92-subset expression filtering on headers/properties.


---

<!-- 094_SELECTOR_CANNOT_READ_BODY.md -->

# Selector Cannot Read Body

## What / Why
Selectors operate on headers and properties, not payload body.

## Visual
```text
Selector Cannot Read Body → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selector Cannot Read Body:** Selectors operate on headers and properties, not payload body.


---

<!-- 095_SELECTOR_COMPARISON.md -->

# Selector Comparison

## What / Why
Equality/range/boolean/logical operations over supported property types.

## Visual
```text
Selector Comparison → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selector Comparison:** Equality/range/boolean/logical operations over supported property types.


---

<!-- 096_SELECTOR_NULL_SEMANTICS.md -->

# Selector NULL Semantics

## What / Why
Three-valued SQL-like null/unknown behavior matters.

## Visual
```text
Selector NULL Semantics → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selector NULL Semantics:** Three-valued SQL-like null/unknown behavior matters.


---

<!-- 097_SELECTOR_PERFORMANCE.md -->

# Selector Performance

## What / Why
Provider may need indexes/filter evaluation; complex selectors can reduce throughput.

## Visual
```text
Selector Performance → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selector Performance:** Provider may need indexes/filter evaluation; complex selectors can reduce throughput.


---

<!-- 098_QUEUE_SELECTOR_SEMANTICS.md -->

# Queue Selector Semantics

## What / Why
Only matching messages are delivered to that consumer; unmatched messages remain for others.

## Visual
```text
Queue Selector Semantics → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Selector Semantics:** Only matching messages are delivered to that consumer; unmatched messages remain for others.


---

<!-- 099_TOPIC_SELECTOR_SEMANTICS.md -->

# Topic Selector Semantics

## What / Why
Selector filters what enters/is delivered to a subscription.

## Visual
```text
Topic Selector Semantics → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Topic Selector Semantics:** Selector filters what enters/is delivered to a subscription.


---

<!-- 100_SELECTOR_PORTABILITY.md -->

# Selector Portability

## What / Why
Use standard syntax and supported property types for provider portability.

## Visual
```text
Selector Portability → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selector Portability:** Use standard syntax and supported property types for provider portability.


---

<!-- 101_QUEUE_MENTAL_MODEL.md -->

# Queue Mental Model

## What / Why
A queue delivers each message to one consuming path/consumer among competing consumers.

## Visual
```text
Queue Mental Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Mental Model:** A queue delivers each message to one consuming path/consumer among competing consumers.


---

<!-- 102_COMPETING_CONSUMERS.md -->

# Competing Consumers

## What / Why
Multiple consumers share work from a queue.

## Visual
```text
Competing Consumers → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Competing Consumers:** Multiple consumers share work from a queue.


---

<!-- 103_QUEUE_ORDERING.md -->

# Queue Ordering

## What / Why
Providers preserve required ordering semantics subject to priority, selectors, transactions and redelivery.

## Visual
```text
Queue Ordering → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Ordering:** Providers preserve required ordering semantics subject to priority, selectors, transactions and redelivery.


---

<!-- 104_QUEUE_BROWSER.md -->

# Queue Browser

## What / Why
Inspect queued messages without consuming them.

## Visual
```text
Queue Browser → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Browser:** Inspect queued messages without consuming them.


---

<!-- 105_TEMPORARY_QUEUE_RPC.md -->

# Temporary Queue RPC

## What / Why
TemporaryQueue is commonly used for request/reply callbacks.

## Visual
```text
Temporary Queue RPC → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Temporary Queue RPC:** TemporaryQueue is commonly used for request/reply callbacks.


---

<!-- 106_QUEUE_CONSUMER_SCALING.md -->

# Queue Consumer Scaling

## What / Why
Scale consumers while respecting provider-specific ordering/grouping constraints.

## Visual
```text
Queue Consumer Scaling → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Consumer Scaling:** Scale consumers while respecting provider-specific ordering/grouping constraints.


---

<!-- 107_QUEUE_BACKLOG.md -->

# Queue Backlog

## What / Why
Messages accumulate when producers outpace consumers.

## Visual
```text
Queue Backlog → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Backlog:** Messages accumulate when producers outpace consumers.


---

<!-- 108_QUEUE_REDELIVERY.md -->

# Queue Redelivery

## What / Why
Unacknowledged/rolled-back deliveries may be sent again.

## Visual
```text
Queue Redelivery → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Redelivery:** Unacknowledged/rolled-back deliveries may be sent again.


---

<!-- 109_QUEUE_PROVIDER_FEATURES.md -->

# Queue Provider Features

## What / Why
DLQ, scheduled delivery, clustering and message groups are often provider-specific extensions around JMS.

## Visual
```text
Queue Provider Features → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Provider Features:** DLQ, scheduled delivery, clustering and message groups are often provider-specific extensions around JMS.


---

<!-- 110_TOPIC_MENTAL_MODEL.md -->

# Topic Mental Model

## What / Why
Publishers send to a topic; subscriptions receive copies according to subscription semantics.

## Visual
```text
Topic Mental Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Topic Mental Model:** Publishers send to a topic; subscriptions receive copies according to subscription semantics.


---

<!-- 111_NON_DURABLE_SUBSCRIPTION.md -->

# Non Durable Subscription

## What / Why
Receives messages only while the subscription/consumer exists.

## Visual
```text
Non Durable Subscription → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Non Durable Subscription:** Receives messages only while the subscription/consumer exists.


---

<!-- 112_DURABLE_SUBSCRIPTION.md -->

# Durable Subscription

## What / Why
Provider retains messages for a durable subscription while no consumer is active.

## Visual
```text
Durable Subscription → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Durable Subscription:** Provider retains messages for a durable subscription while no consumer is active.


---

<!-- 113_UNSHARED_DURABLE_SUBSCRIPTION.md -->

# Unshared Durable Subscription

## What / Why
One consumer at a time owns the named durable subscription.

## Visual
```text
Unshared Durable Subscription → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Unshared Durable Subscription:** One consumer at a time owns the named durable subscription.


---

<!-- 114_SHARED_NON_DURABLE_SUBSCRIPTION.md -->

# Shared Non Durable Subscription

## What / Why
Multiple consumers share work from a non-durable topic subscription.

## Visual
```text
Shared Non Durable Subscription → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Shared Non Durable Subscription:** Multiple consumers share work from a non-durable topic subscription.


---

<!-- 115_SHARED_DURABLE_SUBSCRIPTION.md -->

# Shared Durable Subscription

## What / Why
Multiple consumers share work from a durable subscription.

## Visual
```text
Shared Durable Subscription → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Shared Durable Subscription:** Multiple consumers share work from a durable subscription.


---

<!-- 116_SUBSCRIPTION_NAME.md -->

# Subscription Name

## What / Why
Durable/shared subscription identity includes subscription name and client identifier rules.

## Visual
```text
Subscription Name → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Subscription Name:** Durable/shared subscription identity includes subscription name and client identifier rules.


---

<!-- 117_CLIENT_ID.md -->

# Client ID

## What / Why
Participates in durable subscription identity for unshared and some shared semantics.

## Visual
```text
Client ID → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Client ID:** Participates in durable subscription identity for unshared and some shared semantics.


---

<!-- 118_UNSUBSCRIBE.md -->

# Unsubscribe

## What / Why
Explicitly removes a durable subscription.

## Visual
```text
Unsubscribe → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Unsubscribe:** Explicitly removes a durable subscription.


---

<!-- 119_NOLOCAL.md -->

# noLocal

## What / Why
Option prevents receiving messages published from the same connection/client identity where specified.

## Visual
```text
noLocal → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **noLocal:** Option prevents receiving messages published from the same connection/client identity where specified.


---

<!-- 120_TOPIC_FANOUT.md -->

# Topic Fanout

## What / Why
Independent subscriptions each receive their own logical copy.

## Visual
```text
Topic Fanout → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Topic Fanout:** Independent subscriptions each receive their own logical copy.


---

<!-- 121_TOPIC_VS_QUEUE.md -->

# Topic vs Queue

## What / Why
Topic distributes to subscriptions; queue distributes work among consumers.

## Visual
```text
Topic vs Queue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Topic vs Queue:** Topic distributes to subscriptions; queue distributes work among consumers.


---

<!-- 122_AUTO_ACKNOWLEDGE.md -->

# AUTO_ACKNOWLEDGE

## What / Why
Session automatically acknowledges successful receive/listener return according to spec semantics.

## Visual
```text
AUTO_ACKNOWLEDGE → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **AUTO_ACKNOWLEDGE:** Session automatically acknowledges successful receive/listener return according to spec semantics.


---

<!-- 123_CLIENT_ACKNOWLEDGE.md -->

# CLIENT_ACKNOWLEDGE

## What / Why
Application explicitly acknowledges; acknowledgement affects all messages consumed by that session up to that point.

## Visual
```text
CLIENT_ACKNOWLEDGE → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **CLIENT_ACKNOWLEDGE:** Application explicitly acknowledges; acknowledgement affects all messages consumed by that session up to that point.


---

<!-- 124_DUPS_OK_ACKNOWLEDGE.md -->

# DUPS_OK_ACKNOWLEDGE

## What / Why
Provider may lazily acknowledge, permitting duplicate deliveries for efficiency.

## Visual
```text
DUPS_OK_ACKNOWLEDGE → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **DUPS_OK_ACKNOWLEDGE:** Provider may lazily acknowledge, permitting duplicate deliveries for efficiency.


---

<!-- 125_SESSION_TRANSACTED.md -->

# SESSION_TRANSACTED

## What / Why
Acknowledgement is controlled by local transaction commit/rollback.

## Visual
```text
SESSION_TRANSACTED → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **SESSION_TRANSACTED:** Acknowledgement is controlled by local transaction commit/rollback.


---

<!-- 126_MESSAGE_ACKNOWLEDGE.md -->

# Message acknowledge

## What / Why
`message.acknowledge()` in CLIENT_ACKNOWLEDGE acknowledges session deliveries, not only that single message.

## Visual
```text
Message acknowledge → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message acknowledge:** `message.acknowledge()` in CLIENT_ACKNOWLEDGE acknowledges session deliveries, not only that single message.


---

<!-- 127_RECOVER.md -->

# Recover

## What / Why
Session.recover stops delivery then redelivers unacknowledged messages for non-transacted sessions.

## Visual
```text
Recover → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Recover:** Session.recover stops delivery then redelivers unacknowledged messages for non-transacted sessions.


---

<!-- 128_REDELIVERY.md -->

# Redelivery

## What / Why
Failures/recover/rollback can cause duplicate delivery.

## Visual
```text
Redelivery → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Redelivery:** Failures/recover/rollback can cause duplicate delivery.


---

<!-- 129_ACK_MODE_VS_BUSINESS_COMMIT.md -->

# Ack Mode vs Business Commit

## What / Why
Acknowledging a JMS message does not atomically commit arbitrary external side effects unless transaction integration is used.

## Visual
```text
Ack Mode vs Business Commit → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Ack Mode vs Business Commit:** Acknowledging a JMS message does not atomically commit arbitrary external side effects unless transaction integration is used.


---

<!-- 130_AUTO_ACK_LISTENER.md -->

# Auto Ack Listener

## What / Why
Provider acknowledges after listener returns successfully according to session semantics.

## Visual
```text
Auto Ack Listener → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Auto Ack Listener:** Provider acknowledges after listener returns successfully according to session semantics.


---

<!-- 131_DUPS_OK_TRADEOFF.md -->

# Dups OK Tradeoff

## What / Why
Potential duplicates in exchange for less acknowledgement overhead.

## Visual
```text
Dups OK Tradeoff → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Dups OK Tradeoff:** Potential duplicates in exchange for less acknowledgement overhead.


---

<!-- 132_LOCAL_JMS_TRANSACTION.md -->

# Local JMS Transaction

## What / Why
SESSION_TRANSACTED groups sends and receives within one JMS Session/JMSContext.

## Visual
```text
Local JMS Transaction → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Local JMS Transaction:** SESSION_TRANSACTED groups sends and receives within one JMS Session/JMSContext.


---

<!-- 133_SESSION_COMMIT.md -->

# Session Commit

## What / Why
Commits produced messages and acknowledges consumed messages in the local JMS transaction.

## Visual
```text
Session Commit → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Session Commit:** Commits produced messages and acknowledges consumed messages in the local JMS transaction.


---

<!-- 134_SESSION_ROLLBACK.md -->

# Session Rollback

## What / Why
Rolls back sends and causes consumed messages to become eligible for redelivery.

## Visual
```text
Session Rollback → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Session Rollback:** Rolls back sends and causes consumed messages to become eligible for redelivery.


---

<!-- 135_TRANSACTION_BOUNDARIES.md -->

# Transaction Boundaries

## What / Why
A local JMS transaction covers one session, not arbitrary resources.

## Visual
```text
Transaction Boundaries → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Transaction Boundaries:** A local JMS transaction covers one session, not arbitrary resources.


---

<!-- 136_JTA_TRANSACTION.md -->

# JTA Transaction

## What / Why
Jakarta EE can enlist JMS provider in a container-managed global transaction.

## Visual
```text
JTA Transaction → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JTA Transaction:** Jakarta EE can enlist JMS provider in a container-managed global transaction.


---

<!-- 137_XA.md -->

# XA

## What / Why
XA-capable JMS providers can participate in distributed JTA transactions.

## Visual
```text
XA → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **XA:** XA-capable JMS providers can participate in distributed JTA transactions.


---

<!-- 138_XACONNECTIONFACTORY.md -->

# XAConnectionFactory

## What / Why
Provider-specific/administered XA connection factory exposes XA-capable sessions/connections.

## Visual
```text
XAConnectionFactory → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **XAConnectionFactory:** Provider-specific/administered XA connection factory exposes XA-capable sessions/connections.


---

<!-- 139_XASESSION.md -->

# XASession

## What / Why
Provides XAResource for transaction manager integration.

## Visual
```text
XASession → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **XASession:** Provides XAResource for transaction manager integration.


---

<!-- 140_TWO_PHASE_COMMIT.md -->

# Two Phase Commit

## What / Why
XA may use prepare/commit coordination across resources.

## Visual
```text
Two Phase Commit → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Two Phase Commit:** XA may use prepare/commit coordination across resources.


---

<!-- 141_TRANSACTION_VS_ACK_MODE.md -->

# Transaction vs Ack Mode

## What / Why
Ack mode is ignored when the session is transacted.

## Visual
```text
Transaction vs Ack Mode → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Transaction vs Ack Mode:** Ack mode is ignored when the session is transacted.


---

<!-- 142_CONTAINER_TRANSACTION_RULES.md -->

# Container Transaction Rules

## What / Why
In Jakarta EE web/EJB containers, JTA/container rules can override local transacted/ack configuration.

## Visual
```text
Container Transaction Rules → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Container Transaction Rules:** In Jakarta EE web/EJB containers, JTA/container rules can override local transacted/ack configuration.


---

<!-- 143_EXACTLY_ONCE_ILLUSION.md -->

# Exactly Once Illusion

## What / Why
XA can provide atomic resource coordination, but end-to-end business semantics still require idempotency and careful recovery.

## Visual
```text
Exactly Once Illusion → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Exactly Once Illusion:** XA can provide atomic resource coordination, but end-to-end business semantics still require idempotency and careful recovery.


---

<!-- 144_OUTBOX_ALTERNATIVE.md -->

# Outbox Alternative

## What / Why
Transactional Outbox avoids XA by committing DB + outbox locally and publishing asynchronously.

## Visual
```text
Outbox Alternative → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Outbox Alternative:** Transactional Outbox avoids XA by committing DB + outbox locally and publishing asynchronously.


---

<!-- 145_AT_MOST_ONCE.md -->

# At Most Once

## What / Why
Acknowledge/commit before side effect can lose work but avoid reprocessing.

## Visual
```text
At Most Once → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **At Most Once:** Acknowledge/commit before side effect can lose work but avoid reprocessing.


---

<!-- 146_AT_LEAST_ONCE.md -->

# At Least Once

## What / Why
Process then acknowledge/commit can duplicate after crash.

## Visual
```text
At Least Once → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **At Least Once:** Process then acknowledge/commit can duplicate after crash.


---

<!-- 147_EFFECTIVELY_ONCE.md -->

# Effectively Once

## What / Why
Idempotent business handlers plus at-least-once delivery often provide practical exactly-once outcomes.

## Visual
```text
Effectively Once → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Effectively Once:** Idempotent business handlers plus at-least-once delivery often provide practical exactly-once outcomes.


---

<!-- 148_PROVIDER_REDELIVERY.md -->

# Provider Redelivery

## What / Why
Provider decides redelivery policy/backoff/DLQ details outside core JMS specification.

## Visual
```text
Provider Redelivery → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Provider Redelivery:** Provider decides redelivery policy/backoff/DLQ details outside core JMS specification.


---

<!-- 149_DUPLICATE_DETECTION.md -->

# Duplicate Detection

## What / Why
Application may use message IDs/business keys to deduplicate.

## Visual
```text
Duplicate Detection → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Duplicate Detection:** Application may use message IDs/business keys to deduplicate.


---

<!-- 150_POISON_MESSAGE.md -->

# Poison Message

## What / Why
Repeatedly failing message requires bounded redelivery and DLQ handling.

## Visual
```text
Poison Message → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Poison Message:** Repeatedly failing message requires bounded redelivery and DLQ handling.


---

<!-- 151_DEAD_LETTER_QUEUE.md -->

# Dead Letter Queue

## What / Why
DLQ is provider-specific infrastructure pattern, not standardized as a JMS destination type.

## Visual
```text
Dead Letter Queue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Dead Letter Queue:** DLQ is provider-specific infrastructure pattern, not standardized as a JMS destination type.


---

<!-- 152_IDEMPOTENT_CONSUMER.md -->

# Idempotent Consumer

## What / Why
Handler safely tolerates duplicate delivery.

## Visual
```text
Idempotent Consumer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Idempotent Consumer:** Handler safely tolerates duplicate delivery.


---

<!-- 153_COMMIT_ORDERING.md -->

# Commit Ordering

## What / Why
Order between JMS ack/commit and external DB/API side effects defines failure behavior.

## Visual
```text
Commit Ordering → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Commit Ordering:** Order between JMS ack/commit and external DB/API side effects defines failure behavior.


---

<!-- 154_PERSISTENT.md -->

# PERSISTENT

## What / Why
Default delivery mode intended for messages requiring higher reliability.

## Visual
```text
PERSISTENT → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **PERSISTENT:** Default delivery mode intended for messages requiring higher reliability.


---

<!-- 155_NON_PERSISTENT.md -->

# NON_PERSISTENT

## What / Why
Lower reliability mode that may allow better performance.

## Visual
```text
NON_PERSISTENT → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **NON_PERSISTENT:** Lower reliability mode that may allow better performance.


---

<!-- 156_DEFAULT_DELIVERY_MODE.md -->

# Default Delivery Mode

## What / Why
Default is PERSISTENT.

## Visual
```text
Default Delivery Mode → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Default Delivery Mode:** Default is PERSISTENT.


---

<!-- 157_PRIORITY.md -->

# Priority

## What / Why
Ten levels 0-9; default 4.

## Visual
```text
Priority → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Priority:** Ten levels 0-9; default 4.


---

<!-- 158_TIME_TO_LIVE.md -->

# Time To Live

## What / Why
Milliseconds after send used to derive expiration; zero means no expiration.

## Visual
```text
Time To Live → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Time To Live:** Milliseconds after send used to derive expiration; zero means no expiration.


---

<!-- 159_DELIVERY_DELAY.md -->

# Delivery Delay

## What / Why
Minimum delay before a sent message may be delivered; default zero.

## Visual
```text
Delivery Delay → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Delivery Delay:** Minimum delay before a sent message may be delivered; default zero.


---

<!-- 160_DISABLE_MESSAGE_ID.md -->

# Disable Message ID

## What / Why
Producer may request provider not generate message ID when appropriate.

## Visual
```text
Disable Message ID → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Disable Message ID:** Producer may request provider not generate message ID when appropriate.


---

<!-- 161_DISABLE_TIMESTAMP.md -->

# Disable Timestamp

## What / Why
Producer may request provider not generate timestamp.

## Visual
```text
Disable Timestamp → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Disable Timestamp:** Producer may request provider not generate timestamp.


---

<!-- 162_PRODUCER_DEFAULT_OPTIONS.md -->

# Producer Default Options

## What / Why
MessageProducer/JMSProducer can configure delivery mode, priority, TTL and delay.

## Visual
```text
Producer Default Options → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Producer Default Options:** MessageProducer/JMSProducer can configure delivery mode, priority, TTL and delay.


---

<!-- 163_PER_MESSAGE_OPTIONS.md -->

# Per Message Options

## What / Why
Classic MessageProducer send overloads can set delivery mode, priority and TTL per send.

## Visual
```text
Per Message Options → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Per Message Options:** Classic MessageProducer send overloads can set delivery mode, priority and TTL per send.


---

<!-- 164_ASYNCHRONOUS_SEND.md -->

# Asynchronous Send

## What / Why
Producer can return before provider completes all send work and later invoke CompletionListener.

## Visual
```text
Asynchronous Send → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Asynchronous Send:** Producer can return before provider completes all send work and later invoke CompletionListener.


---

<!-- 165_COMPLETIONLISTENER_ONCOMPLETION.md -->

# CompletionListener onCompletion

## What / Why
Signals send completed with the same confidence as a synchronous successful send.

## Visual
```text
CompletionListener onCompletion → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **CompletionListener onCompletion:** Signals send completed with the same confidence as a synchronous successful send.


---

<!-- 166_COMPLETIONLISTENER_ONEXCEPTION.md -->

# CompletionListener onException

## What / Why
Signals asynchronous failure that could not be thrown to sending thread.

## Visual
```text
CompletionListener onException → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **CompletionListener onException:** Signals asynchronous failure that could not be thrown to sending thread.


---

<!-- 167_ASYNC_SEND_ORDERING.md -->

# Async Send Ordering

## What / Why
Same producer/context must still preserve JMS ordering requirements.

## Visual
```text
Async Send Ordering → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Async Send Ordering:** Same producer/context must still preserve JMS ordering requirements.


---

<!-- 168_ASYNC_SEND_MESSAGE_OWNERSHIP.md -->

# Async Send Message Ownership

## What / Why
Do not read/modify a Message until CompletionListener fires.

## Visual
```text
Async Send Message Ownership → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Async Send Message Ownership:** Do not read/modify a Message until CompletionListener fires.


---

<!-- 169_ASYNC_SEND_CLOSE.md -->

# Async Send Close

## What / Why
close waits for incomplete sends and callbacks to complete.

## Visual
```text
Async Send Close → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Async Send Close:** close waits for incomplete sends and callbacks to complete.


---

<!-- 170_ASYNC_SEND_COMMIT_ROLLBACK.md -->

# Async Send Commit Rollback

## What / Why
Local commit/rollback waits for incomplete sends/callbacks.

## Visual
```text
Async Send Commit Rollback → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Async Send Commit Rollback:** Local commit/rollback waits for incomplete sends/callbacks.


---

<!-- 171_ASYNC_SEND_JAKARTA_EE_RESTRICTION.md -->

# Async Send Jakarta EE Restriction

## What / Why
Asynchronous send is not permitted in Jakarta EE web or EJB containers.

## Visual
```text
Async Send Jakarta EE Restriction → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Async Send Jakarta EE Restriction:** Asynchronous send is not permitted in Jakarta EE web or EJB containers.


---

<!-- 172_ASYNC_SEND_THREADING.md -->

# Async Send Threading

## What / Why
Session single-thread restrictions still apply around async sends/callbacks.

## Visual
```text
Async Send Threading → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Async Send Threading:** Session single-thread restrictions still apply around async sends/callbacks.


---

<!-- 173_JMS_ORDERING.md -->

# JMS Ordering

## What / Why
Providers must preserve defined producer/session ordering constraints subject to semantics.

## Visual
```text
JMS Ordering → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Ordering:** Providers must preserve defined producer/session ordering constraints subject to semantics.


---

<!-- 174_SINGLE_PRODUCER_ORDER.md -->

# Single Producer Order

## What / Why
Messages sent by same producer/session follow JMS ordering rules.

## Visual
```text
Single Producer Order → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Single Producer Order:** Messages sent by same producer/session follow JMS ordering rules.


---

<!-- 175_PRIORITY_REORDERING.md -->

# Priority Reordering

## What / Why
Priority can change practical delivery order.

## Visual
```text
Priority Reordering → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Priority Reordering:** Priority can change practical delivery order.


---

<!-- 176_SELECTOR_EFFECTS.md -->

# Selector Effects

## What / Why
Different selectors/subscriptions alter which sequence each consumer observes.

## Visual
```text
Selector Effects → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selector Effects:** Different selectors/subscriptions alter which sequence each consumer observes.


---

<!-- 177_REDELIVERY_EFFECTS.md -->

# Redelivery Effects

## What / Why
Redelivered messages can alter simple FIFO intuition.

## Visual
```text
Redelivery Effects → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Redelivery Effects:** Redelivered messages can alter simple FIFO intuition.


---

<!-- 178_TRANSACTIONS_AND_ORDER.md -->

# Transactions and Order

## What / Why
Commit boundaries affect when sends become visible.

## Visual
```text
Transactions and Order → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Transactions and Order:** Commit boundaries affect when sends become visible.


---

<!-- 179_MESSAGE_GROUPS.md -->

# Message Groups

## What / Why
JMSXGroupID can express related-message affinity; exact implementation behavior is provider-specific.

## Visual
```text
Message Groups → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Groups:** JMSXGroupID can express related-message affinity; exact implementation behavior is provider-specific.


---

<!-- 180_GROUP_SEQUENCE.md -->

# Group Sequence

## What / Why
JMSXGroupSeq may help mark message group sequencing/end.

## Visual
```text
Group Sequence → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Group Sequence:** JMSXGroupSeq may help mark message group sequencing/end.


---

<!-- 181_TEMPORARY_DESTINATION.md -->

# Temporary Destination

## What / Why
Provider-created queue/topic with lifecycle tied to creating connection.

## Visual
```text
Temporary Destination → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Temporary Destination:** Provider-created queue/topic with lifecycle tied to creating connection.


---

<!-- 182_TEMPORARYQUEUE.md -->

# TemporaryQueue

## What / Why
Temporary point-to-point callback destination.

## Visual
```text
TemporaryQueue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **TemporaryQueue:** Temporary point-to-point callback destination.


---

<!-- 183_TEMPORARYTOPIC.md -->

# TemporaryTopic

## What / Why
Temporary pub/sub destination.

## Visual
```text
TemporaryTopic → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **TemporaryTopic:** Temporary pub/sub destination.


---

<!-- 184_REQUEST_REPLY.md -->

# Request Reply

## What / Why
Request includes JMSReplyTo and JMSCorrelationID.

## Visual
```text
Request Reply → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Request Reply:** Request includes JMSReplyTo and JMSCorrelationID.


---

<!-- 185_CORRELATION_STRATEGY.md -->

# Correlation Strategy

## What / Why
Reply correlates to request using application/JMS message identifiers.

## Visual
```text
Correlation Strategy → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Correlation Strategy:** Reply correlates to request using application/JMS message identifiers.


---

<!-- 186_RPC_TIMEOUT.md -->

# RPC Timeout

## What / Why
Caller must bound waiting time.

## Visual
```text
RPC Timeout → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **RPC Timeout:** Caller must bound waiting time.


---

<!-- 187_RPC_DUPLICATE_RISK.md -->

# RPC Duplicate Risk

## What / Why
Server may process request but response may be lost; idempotency matters.

## Visual
```text
RPC Duplicate Risk → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **RPC Duplicate Risk:** Server may process request but response may be lost; idempotency matters.


---

<!-- 188_RPC_OVER_JMS_TRADEOFF.md -->

# RPC over JMS Tradeoff

## What / Why
Messaging RPC adds broker, correlation and timeout complexity compared with direct HTTP/gRPC.

## Visual
```text
RPC over JMS Tradeoff → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **RPC over JMS Tradeoff:** Messaging RPC adds broker, correlation and timeout complexity compared with direct HTTP/gRPC.


---

<!-- 189_ADMINISTERED_OBJECT.md -->

# Administered Object

## What / Why
ConnectionFactory and Destination are typically provider-administered objects.

## Visual
```text
Administered Object → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Administered Object:** ConnectionFactory and Destination are typically provider-administered objects.


---

<!-- 190_JNDI_LOOKUP.md -->

# JNDI Lookup

## What / Why
Traditional JMS applications locate ConnectionFactory/Destination through JNDI.

## Visual
```text
JNDI Lookup → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JNDI Lookup:** Traditional JMS applications locate ConnectionFactory/Destination through JNDI.


---

<!-- 191_RESOURCE_INJECTION.md -->

# Resource Injection

## What / Why
Jakarta EE can inject administered messaging resources.

## Visual
```text
Resource Injection → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Resource Injection:** Jakarta EE can inject administered messaging resources.


---

<!-- 192_JMSCONNECTIONFACTORYDEFINITION.md -->

# JMSConnectionFactoryDefinition

## What / Why
Annotation can define a connection factory in Jakarta EE.

## Visual
```text
JMSConnectionFactoryDefinition → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSConnectionFactoryDefinition:** Annotation can define a connection factory in Jakarta EE.


---

<!-- 193_JMSDESTINATIONDEFINITION.md -->

# JMSDestinationDefinition

## What / Why
Annotation can define queue/topic resources.

## Visual
```text
JMSDestinationDefinition → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSDestinationDefinition:** Annotation can define queue/topic resources.


---

<!-- 194_REPEATABLE_DEFINITIONS.md -->

# Repeatable Definitions

## What / Why
Jakarta Messaging 3.1 includes repeatable connection factory/destination definition annotations.

## Visual
```text
Repeatable Definitions → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Repeatable Definitions:** Jakarta Messaging 3.1 includes repeatable connection factory/destination definition annotations.


---

<!-- 195_PROVIDER_CONFIGURATION.md -->

# Provider Configuration

## What / Why
Physical broker URL, HA, credentials and tuning remain provider-specific.

## Visual
```text
Provider Configuration → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Provider Configuration:** Physical broker URL, HA, credentials and tuning remain provider-specific.


---

<!-- 196_PORTABLE_NAMING.md -->

# Portable Naming

## What / Why
Logical JNDI names can decouple application code from provider-specific physical names.

## Visual
```text
Portable Naming → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Portable Naming:** Logical JNDI names can decouple application code from provider-specific physical names.


---

<!-- 197_JMS_IN_JAKARTA_EE.md -->

# JMS in Jakarta EE

## What / Why
Jakarta Messaging integrates with managed transactions, resource injection and container lifecycle.

## Visual
```text
JMS in Jakarta EE → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS in Jakarta EE:** Jakarta Messaging integrates with managed transactions, resource injection and container lifecycle.


---

<!-- 198_MANAGED_JMSCONTEXT.md -->

# Managed JMSContext

## What / Why
Container may inject/manage JMSContext.

## Visual
```text
Managed JMSContext → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Managed JMSContext:** Container may inject/manage JMSContext.


---

<!-- 199_INJECT_JMSCONTEXT.md -->

# Inject JMSContext

## What / Why
CDI/resource injection can provide context depending platform configuration.

## Visual
```text
Inject JMSContext → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Inject JMSContext:** CDI/resource injection can provide context depending platform configuration.


---

<!-- 200_MESSAGE_DRIVEN_BEAN.md -->

# Message Driven Bean

## What / Why
Enterprise Beans MDB asynchronously consumes messages under container management.

## Visual
```text
Message Driven Bean → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Driven Bean:** Enterprise Beans MDB asynchronously consumes messages under container management.


---

<!-- 201_MDB_ACTIVATION_CONFIG.md -->

# MDB Activation Config

## What / Why
Destination type, lookup and acknowledgement/transaction behavior configured declaratively.

## Visual
```text
MDB Activation Config → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB Activation Config:** Destination type, lookup and acknowledgement/transaction behavior configured declaratively.


---

<!-- 202_CONTAINER_MANAGED_TRANSACTION.md -->

# Container Managed Transaction

## What / Why
MDB processing can participate in JTA.

## Visual
```text
Container Managed Transaction → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Container Managed Transaction:** MDB processing can participate in JTA.


---

<!-- 203_BEAN_MANAGED_TRANSACTION.md -->

# Bean Managed Transaction

## What / Why
Alternative transaction control where permitted.

## Visual
```text
Bean Managed Transaction → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Bean Managed Transaction:** Alternative transaction control where permitted.


---

<!-- 204_MDB_REDELIVERY.md -->

# MDB Redelivery

## What / Why
Container/provider coordinates redelivery after transaction rollback/failure.

## Visual
```text
MDB Redelivery → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB Redelivery:** Container/provider coordinates redelivery after transaction rollback/failure.


---

<!-- 205_CONCURRENCY.md -->

# Concurrency

## What / Why
Application server controls MDB instance pooling and concurrent delivery.

## Visual
```text
Concurrency → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Concurrency:** Application server controls MDB instance pooling and concurrent delivery.


---

<!-- 206_JAKARTA_EE_RESTRICTIONS.md -->

# Jakarta EE Restrictions

## What / Why
Threading, asynchronous send and resource lifecycle rules differ from Java SE usage.

## Visual
```text
Jakarta EE Restrictions → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Jakarta EE Restrictions:** Threading, asynchronous send and resource lifecycle rules differ from Java SE usage.


---

<!-- 207_MDB_MENTAL_MODEL.md -->

# MDB Mental Model

## What / Why
Container-managed asynchronous message endpoint implementing MessageListener-style processing.

## Visual
```text
MDB Mental Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB Mental Model:** Container-managed asynchronous message endpoint implementing MessageListener-style processing.


---

<!-- 208_ONMESSAGE.md -->

# onMessage

## What / Why
Business callback for message processing.

## Visual
```text
onMessage → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **onMessage:** Business callback for message processing.


---

<!-- 209_MDB_POOL.md -->

# MDB Pool

## What / Why
Container maintains instances for concurrent delivery.

## Visual
```text
MDB Pool → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB Pool:** Container maintains instances for concurrent delivery.


---

<!-- 210_MDB_TRANSACTION.md -->

# MDB Transaction

## What / Why
Usually one delivery runs inside configured transaction boundary.

## Visual
```text
MDB Transaction → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB Transaction:** Usually one delivery runs inside configured transaction boundary.


---

<!-- 211_MDB_ROLLBACK.md -->

# MDB Rollback

## What / Why
Failure/rollback causes provider/container redelivery behavior.

## Visual
```text
MDB Rollback → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB Rollback:** Failure/rollback causes provider/container redelivery behavior.


---

<!-- 212_MDB_IDEMPOTENCY.md -->

# MDB Idempotency

## What / Why
Required despite transaction support because duplicate delivery remains possible in recovery scenarios.

## Visual
```text
MDB Idempotency → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB Idempotency:** Required despite transaction support because duplicate delivery remains possible in recovery scenarios.


---

<!-- 213_MDB_VS_LISTENER_CONTAINER.md -->

# MDB vs Listener Container

## What / Why
MDB is Jakarta EE container abstraction; Spring uses listener containers.

## Visual
```text
MDB vs Listener Container → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB vs Listener Container:** MDB is Jakarta EE container abstraction; Spring uses listener containers.


---

<!-- 214_MDB_PROVIDER_PORTABILITY.md -->

# MDB Provider Portability

## What / Why
Portable API/config exists but provider-specific activation options remain common.

## Visual
```text
MDB Provider Portability → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MDB Provider Portability:** Portable API/config exists but provider-specific activation options remain common.


---

<!-- 215_SPRING_JMS_MENTAL_MODEL.md -->

# Spring JMS Mental Model

## What / Why
Spring abstracts JMS resource management, conversion, listeners and transactions.

## Visual
```text
Spring JMS Mental Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Spring JMS Mental Model:** Spring abstracts JMS resource management, conversion, listeners and transactions.


---

<!-- 216_JMSTEMPLATE.md -->

# JmsTemplate

## What / Why
High-level send/receive/request-reply helper.

## Visual
```text
JmsTemplate → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JmsTemplate:** High-level send/receive/request-reply helper.


---

<!-- 217_CONVERTANDSEND.md -->

# convertAndSend

## What / Why
Converts Java payload using configured MessageConverter and sends.

## Visual
```text
convertAndSend → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **convertAndSend:** Converts Java payload using configured MessageConverter and sends.


---

<!-- 218_MESSAGECONVERTER.md -->

# MessageConverter

## What / Why
Maps application objects to/from JMS messages.

## Visual
```text
MessageConverter → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MessageConverter:** Maps application objects to/from JMS messages.


---

<!-- 219_SIMPLEMESSAGECONVERTER.md -->

# SimpleMessageConverter

## What / Why
Default/basic Spring converter.

## Visual
```text
SimpleMessageConverter → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **SimpleMessageConverter:** Default/basic Spring converter.


---

<!-- 220_MAPPINGJACKSON2MESSAGECONVERTER.md -->

# MappingJackson2MessageConverter

## What / Why
JSON-oriented converter commonly used for interoperable payloads.

## Visual
```text
MappingJackson2MessageConverter → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **MappingJackson2MessageConverter:** JSON-oriented converter commonly used for interoperable payloads.


---

<!-- 221_JMSLISTENER.md -->

# @JmsListener

## What / Why
Declarative listener method.

## Visual
```text
@JmsListener → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **@JmsListener:** Declarative listener method.


---

<!-- 222_DEFAULTJMSLISTENERCONTAINERFACTORY.md -->

# DefaultJmsListenerContainerFactory

## What / Why
Configures concurrency, ack/transacted sessions, error handling and destination resolver.

## Visual
```text
DefaultJmsListenerContainerFactory → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **DefaultJmsListenerContainerFactory:** Configures concurrency, ack/transacted sessions, error handling and destination resolver.


---

<!-- 223_DEFAULTMESSAGELISTENERCONTAINER.md -->

# DefaultMessageListenerContainer

## What / Why
Spring-managed polling/listener lifecycle abstraction.

## Visual
```text
DefaultMessageListenerContainer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **DefaultMessageListenerContainer:** Spring-managed polling/listener lifecycle abstraction.


---

<!-- 224_CACHINGCONNECTIONFACTORY.md -->

# CachingConnectionFactory

## What / Why
Caches Connection/Session/Producer resources around provider ConnectionFactory.

## Visual
```text
CachingConnectionFactory → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **CachingConnectionFactory:** Caches Connection/Session/Producer resources around provider ConnectionFactory.


---

<!-- 225_SINGLECONNECTIONFACTORY.md -->

# SingleConnectionFactory

## What / Why
Reuses one shared JMS Connection.

## Visual
```text
SingleConnectionFactory → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **SingleConnectionFactory:** Reuses one shared JMS Connection.


---

<!-- 226_JMSTRANSACTIONMANAGER.md -->

# JmsTransactionManager

## What / Why
Local JMS transaction manager for a single ConnectionFactory.

## Visual
```text
JmsTransactionManager → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JmsTransactionManager:** Local JMS transaction manager for a single ConnectionFactory.


---

<!-- 227_JTA_WITH_SPRING_JMS.md -->

# JTA with Spring JMS

## What / Why
Use JTA transaction manager when JMS and other XA resources require distributed transaction.

## Visual
```text
JTA with Spring JMS → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JTA with Spring JMS:** Use JTA transaction manager when JMS and other XA resources require distributed transaction.


---

<!-- 228_SPRING_RETRY_INTEGRATION.md -->

# Spring Retry Integration

## What / Why
Listener retry can be layered around processing.

## Visual
```text
Spring Retry Integration → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Spring Retry Integration:** Listener retry can be layered around processing.


---

<!-- 229_ERRORHANDLER.md -->

# ErrorHandler

## What / Why
Handles listener exceptions outside transaction semantics.

## Visual
```text
ErrorHandler → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **ErrorHandler:** Handles listener exceptions outside transaction semantics.


---

<!-- 230_DESTINATIONRESOLVER.md -->

# DestinationResolver

## What / Why
Maps logical destination names to provider Destination objects.

## Visual
```text
DestinationResolver → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **DestinationResolver:** Maps logical destination names to provider Destination objects.


---

<!-- 231_DYNAMICDESTINATIONRESOLVER.md -->

# DynamicDestinationResolver

## What / Why
Creates/resolves queue/topic dynamically through Session.

## Visual
```text
DynamicDestinationResolver → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **DynamicDestinationResolver:** Creates/resolves queue/topic dynamically through Session.


---

<!-- 232_PUBSUBDOMAIN.md -->

# PubSubDomain

## What / Why
Spring setting chooses topic vs queue behavior.

## Visual
```text
PubSubDomain → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **PubSubDomain:** Spring setting chooses topic vs queue behavior.


---

<!-- 233_CONCURRENCY.md -->

# Concurrency

## What / Why
Listener containers can run multiple concurrent consumers.

## Visual
```text
Concurrency → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Concurrency:** Listener containers can run multiple concurrent consumers.


---

<!-- 234_SESSIONTRANSACTED.md -->

# SessionTransacted

## What / Why
Spring listener container can use local JMS transactions.

## Visual
```text
SessionTransacted → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **SessionTransacted:** Spring listener container can use local JMS transactions.


---

<!-- 235_SPRING_BOOT_JMS.md -->

# Spring Boot JMS

## What / Why
Boot auto-configures provider-specific ConnectionFactory/JmsTemplate/listeners when dependencies/config are present.

## Visual
```text
Spring Boot JMS → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Spring Boot JMS:** Boot auto-configures provider-specific ConnectionFactory/JmsTemplate/listeners when dependencies/config are present.


---

<!-- 236_PROVIDER_ADAPTER_MENTAL_MODEL.md -->

# Provider Adapter Mental Model

## What / Why
JMS semantics are portable; broker topology, HA, persistence, protocol and tuning are provider-specific.

## Visual
```text
Provider Adapter Mental Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Provider Adapter Mental Model:** JMS semantics are portable; broker topology, HA, persistence, protocol and tuning are provider-specific.


---

<!-- 237_APACHE_ACTIVEMQ_CLASSIC.md -->

# Apache ActiveMQ Classic

## What / Why
Long-running open-source JMS broker family supporting multiple protocols.

## Visual
```text
Apache ActiveMQ Classic → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Apache ActiveMQ Classic:** Long-running open-source JMS broker family supporting multiple protocols.


---

<!-- 238_APACHE_ARTEMIS.md -->

# Apache Artemis

## What / Why
Modern high-performance broker lineage with JMS/Jakarta Messaging support and multi-protocol capabilities.

## Visual
```text
Apache Artemis → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Apache Artemis:** Modern high-performance broker lineage with JMS/Jakarta Messaging support and multi-protocol capabilities.


---

<!-- 239_IBM_MQ.md -->

# IBM MQ

## What / Why
Enterprise messaging platform with JMS/Jakarta Messaging client support and MQ-specific administration.

## Visual
```text
IBM MQ → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **IBM MQ:** Enterprise messaging platform with JMS/Jakarta Messaging client support and MQ-specific administration.


---

<!-- 240_ORACLE_WEBLOGIC_JMS.md -->

# Oracle WebLogic JMS

## What / Why
Application-server-integrated JMS provider with distributed destinations and store/HA features.

## Visual
```text
Oracle WebLogic JMS → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Oracle WebLogic JMS:** Application-server-integrated JMS provider with distributed destinations and store/HA features.


---

<!-- 241_ECLIPSE_OPENMQ.md -->

# Eclipse OpenMQ

## What / Why
Reference/compatible implementation lineage for Jakarta Messaging.

## Visual
```text
Eclipse OpenMQ → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Eclipse OpenMQ:** Reference/compatible implementation lineage for Jakarta Messaging.


---

<!-- 242_RABBITMQ_JMS_COMPATIBILITY.md -->

# RabbitMQ JMS Compatibility

## What / Why
RabbitMQ can expose JMS client compatibility, but RabbitMQ-native AMQP features are richer than standard JMS.

## Visual
```text
RabbitMQ JMS Compatibility → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **RabbitMQ JMS Compatibility:** RabbitMQ can expose JMS client compatibility, but RabbitMQ-native AMQP features are richer than standard JMS.


---

<!-- 243_PROVIDER_EXTENSIONS.md -->

# Provider Extensions

## What / Why
Scheduled delivery, DLQ policies, message groups, failover URLs and broker management are often extensions.

## Visual
```text
Provider Extensions → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Provider Extensions:** Scheduled delivery, DLQ policies, message groups, failover URLs and broker management are often extensions.


---

<!-- 244_PROVIDER_LOCK_IN.md -->

# Provider Lock In

## What / Why
Using proprietary headers/classes/features may reduce portability.

## Visual
```text
Provider Lock In → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Provider Lock In:** Using proprietary headers/classes/features may reduce portability.


---

<!-- 245_PROVIDER_SELECTION.md -->

# Provider Selection

## What / Why
Evaluate HA, protocol interoperability, transactions/XA, throughput, operations, cloud availability and support.

## Visual
```text
Provider Selection → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Provider Selection:** Evaluate HA, protocol interoperability, transactions/XA, throughput, operations, cloud availability and support.


---

<!-- 246_ARTEMIS_ADDRESS_VS_QUEUE.md -->

# Artemis Address vs Queue

## What / Why
Artemis separates address routing from queues; JMS destinations map into this model.

## Visual
```text
Artemis Address vs Queue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Artemis Address vs Queue:** Artemis separates address routing from queues; JMS destinations map into this model.


---

<!-- 247_ANYCAST.md -->

# Anycast

## What / Why
Artemis anycast routes a message to one queue/consumer path.

## Visual
```text
Anycast → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Anycast:** Artemis anycast routes a message to one queue/consumer path.


---

<!-- 248_MULTICAST.md -->

# Multicast

## What / Why
Artemis multicast routes copies to multiple queues.

## Visual
```text
Multicast → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Multicast:** Artemis multicast routes copies to multiple queues.


---

<!-- 249_JMS_QUEUE_MAPPING.md -->

# JMS Queue Mapping

## What / Why
JMS Queue typically maps to an anycast-oriented address/queue.

## Visual
```text
JMS Queue Mapping → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Queue Mapping:** JMS Queue typically maps to an anycast-oriented address/queue.


---

<!-- 250_JMS_TOPIC_MAPPING.md -->

# JMS Topic Mapping

## What / Why
JMS Topic maps to multicast subscription queues.

## Visual
```text
JMS Topic Mapping → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Topic Mapping:** JMS Topic maps to multicast subscription queues.


---

<!-- 251_ARTEMIS_CORE_PROTOCOL.md -->

# Artemis Core Protocol

## What / Why
Native Artemis protocol separate from JMS API abstraction.

## Visual
```text
Artemis Core Protocol → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Artemis Core Protocol:** Native Artemis protocol separate from JMS API abstraction.


---

<!-- 252_ARTEMIS_AMQP_SUPPORT.md -->

# Artemis AMQP Support

## What / Why
Artemis supports AMQP among its multi-protocol options.

## Visual
```text
Artemis AMQP Support → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Artemis AMQP Support:** Artemis supports AMQP among its multi-protocol options.


---

<!-- 253_ARTEMIS_HA.md -->

# Artemis HA

## What / Why
Replication/shared-store/topology options are provider-specific, not JMS concepts.

## Visual
```text
Artemis HA → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Artemis HA:** Replication/shared-store/topology options are provider-specific, not JMS concepts.


---

<!-- 254_ARTEMIS_REDELIVERY.md -->

# Artemis Redelivery

## What / Why
Redelivery delay, attempts and DLQ are broker policies.

## Visual
```text
Artemis Redelivery → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Artemis Redelivery:** Redelivery delay, attempts and DLQ are broker policies.


---

<!-- 255_ARTEMIS_MESSAGE_GROUPS.md -->

# Artemis Message Groups

## What / Why
Provider supports grouping/affinity features around JMSXGroupID.

## Visual
```text
Artemis Message Groups → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Artemis Message Groups:** Provider supports grouping/affinity features around JMSXGroupID.


---

<!-- 256_IBM_MQ_QUEUE_MANAGER.md -->

# IBM MQ Queue Manager

## What / Why
Core IBM MQ administrative/runtime unit hosting queues/channels.

## Visual
```text
IBM MQ Queue Manager → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **IBM MQ Queue Manager:** Core IBM MQ administrative/runtime unit hosting queues/channels.


---

<!-- 257_LOCAL_QUEUE.md -->

# Local Queue

## What / Why
Queue physically hosted by a queue manager.

## Visual
```text
Local Queue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Local Queue:** Queue physically hosted by a queue manager.


---

<!-- 258_REMOTE_QUEUE_DEFINITION.md -->

# Remote Queue Definition

## What / Why
Alias/routing definition for a queue elsewhere.

## Visual
```text
Remote Queue Definition → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Remote Queue Definition:** Alias/routing definition for a queue elsewhere.


---

<!-- 259_TRANSMISSION_QUEUE.md -->

# Transmission Queue

## What / Why
Stores messages awaiting transmission to another queue manager.

## Visual
```text
Transmission Queue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Transmission Queue:** Stores messages awaiting transmission to another queue manager.


---

<!-- 260_CHANNELS.md -->

# Channels

## What / Why
IBM MQ channels move messages or connect clients.

## Visual
```text
Channels → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Channels:** IBM MQ channels move messages or connect clients.


---

<!-- 261_JMS_ADMINISTERED_OBJECTS_IBM_MQ.md -->

# JMS Administered Objects IBM MQ

## What / Why
Connection factories/destinations can be configured with IBM MQ-specific properties.

## Visual
```text
JMS Administered Objects IBM MQ → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Administered Objects IBM MQ:** Connection factories/destinations can be configured with IBM MQ-specific properties.


---

<!-- 262_PERSISTENT_MESSAGING_IBM_MQ.md -->

# Persistent Messaging IBM MQ

## What / Why
JMS PERSISTENT maps to IBM MQ persistence semantics according to provider configuration.

## Visual
```text
Persistent Messaging IBM MQ → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Persistent Messaging IBM MQ:** JMS PERSISTENT maps to IBM MQ persistence semantics according to provider configuration.


---

<!-- 263_IBM_MQ_TRANSACTIONS.md -->

# IBM MQ Transactions

## What / Why
Supports local and XA/JTA transaction integration.

## Visual
```text
IBM MQ Transactions → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **IBM MQ Transactions:** Supports local and XA/JTA transaction integration.


---

<!-- 264_IBM_MQ_BACKOUT_QUEUE.md -->

# IBM MQ Backout Queue

## What / Why
Provider-specific poison-message/backout handling pattern.

## Visual
```text
IBM MQ Backout Queue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **IBM MQ Backout Queue:** Provider-specific poison-message/backout handling pattern.


---

<!-- 265_IBM_MQ_VS_JMS.md -->

# IBM MQ vs JMS

## What / Why
MQ is the provider/platform; JMS is the Java API abstraction.

## Visual
```text
IBM MQ vs JMS → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **IBM MQ vs JMS:** MQ is the provider/platform; JMS is the Java API abstraction.


---

<!-- 266_DB_PLUS_JMS_DUAL_WRITE_PROBLEM.md -->

# DB plus JMS Dual Write Problem

## What / Why
Writing DB and sending JMS separately can leave inconsistent outcomes.

## Visual
```text
DB plus JMS Dual Write Problem → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **DB plus JMS Dual Write Problem:** Writing DB and sending JMS separately can leave inconsistent outcomes.


---

<!-- 267_XA_SOLUTION.md -->

# XA Solution

## What / Why
Enlist DB + JMS in one JTA/XA transaction where supported.

## Visual
```text
XA Solution → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **XA Solution:** Enlist DB + JMS in one JTA/XA transaction where supported.


---

<!-- 268_OUTBOX_SOLUTION.md -->

# Outbox Solution

## What / Why
Commit business state + outbox in DB then relay to JMS asynchronously.

## Visual
```text
Outbox Solution → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Outbox Solution:** Commit business state + outbox in DB then relay to JMS asynchronously.


---

<!-- 269_INBOX_PATTERN.md -->

# Inbox Pattern

## What / Why
Persist message processing identity with business state.

## Visual
```text
Inbox Pattern → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Inbox Pattern:** Persist message processing identity with business state.


---

<!-- 270_SAGA_CHOREOGRAPHY.md -->

# Saga Choreography

## What / Why
Services exchange JMS events and apply local transactions.

## Visual
```text
Saga Choreography → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Saga Choreography:** Services exchange JMS events and apply local transactions.


---

<!-- 271_SAGA_ORCHESTRATION.md -->

# Saga Orchestration

## What / Why
Coordinator sends JMS commands and consumes replies/events.

## Visual
```text
Saga Orchestration → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Saga Orchestration:** Coordinator sends JMS commands and consumes replies/events.


---

<!-- 272_COMPENSATING_TRANSACTION.md -->

# Compensating Transaction

## What / Why
Undo or counteract prior business steps rather than distributed rollback.

## Visual
```text
Compensating Transaction → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Compensating Transaction:** Undo or counteract prior business steps rather than distributed rollback.


---

<!-- 273_EXACTLY_ONCE_BUSINESS_OUTCOME.md -->

# Exactly Once Business Outcome

## What / Why
Combine at-least-once messaging with idempotency/transactions appropriate to domain.

## Visual
```text
Exactly Once Business Outcome → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Exactly Once Business Outcome:** Combine at-least-once messaging with idempotency/transactions appropriate to domain.


---

<!-- 274_CORRELATION_ID_PATTERN.md -->

# Correlation ID Pattern

## What / Why
Link commands, events and replies.

## Visual
```text
Correlation ID Pattern → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Correlation ID Pattern:** Link commands, events and replies.


---

<!-- 275_CAUSATION_ID_PATTERN.md -->

# Causation ID Pattern

## What / Why
Track which message caused subsequent work.

## Visual
```text
Causation ID Pattern → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Causation ID Pattern:** Track which message caused subsequent work.


---

<!-- 276_JMS_SECURITY_BOUNDARY.md -->

# JMS Security Boundary

## What / Why
Authentication, transport encryption, authorization and broker security are provider-specific.

## Visual
```text
JMS Security Boundary → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Security Boundary:** Authentication, transport encryption, authorization and broker security are provider-specific.


---

<!-- 277_TLS.md -->

# TLS

## What / Why
Provider protocol connection can be protected with TLS.

## Visual
```text
TLS → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **TLS:** Provider protocol connection can be protected with TLS.


---

<!-- 278_MTLS.md -->

# mTLS

## What / Why
Client certificate authentication where provider supports.

## Visual
```text
mTLS → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **mTLS:** Client certificate authentication where provider supports.


---

<!-- 279_USERNAME_PASSWORD.md -->

# Username Password

## What / Why
Provider-specific credential authentication.

## Visual
```text
Username Password → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Username Password:** Provider-specific credential authentication.


---

<!-- 280_OAUTH_OIDC.md -->

# OAuth OIDC

## What / Why
Some providers integrate OAuth/OIDC tokens.

## Visual
```text
OAuth OIDC → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **OAuth OIDC:** Some providers integrate OAuth/OIDC tokens.


---

<!-- 281_JAAS.md -->

# JAAS

## What / Why
Java/provider security integrations may use JAAS.

## Visual
```text
JAAS → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JAAS:** Java/provider security integrations may use JAAS.


---

<!-- 282_DESTINATION_AUTHORIZATION.md -->

# Destination Authorization

## What / Why
Provider controls send/consume/browse/admin rights.

## Visual
```text
Destination Authorization → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Destination Authorization:** Provider controls send/consume/browse/admin rights.


---

<!-- 283_JNDI_SECURITY.md -->

# JNDI Security

## What / Why
Protect naming service credentials and remote lookup paths.

## Visual
```text
JNDI Security → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JNDI Security:** Protect naming service credentials and remote lookup paths.


---

<!-- 284_SECRETS_MANAGEMENT.md -->

# Secrets Management

## What / Why
Credentials belong in secret managers/container resources, not source code.

## Visual
```text
Secrets Management → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Secrets Management:** Credentials belong in secret managers/container resources, not source code.


---

<!-- 285_LEAST_PRIVILEGE.md -->

# Least Privilege

## What / Why
Separate producer/consumer identities and destination permissions.

## Visual
```text
Least Privilege → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Least Privilege:** Separate producer/consumer identities and destination permissions.


---

<!-- 286_DESERIALIZATION_RISK.md -->

# Deserialization Risk

## What / Why
ObjectMessage Java deserialization can expose serious security risk with untrusted data.

## Visual
```text
Deserialization Risk → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Deserialization Risk:** ObjectMessage Java deserialization can expose serious security risk with untrusted data.


---

<!-- 287_PREFER_INTEROPERABLE_PAYLOADS.md -->

# Prefer Interoperable Payloads

## What / Why
Text/Bytes with JSON/Avro/Protobuf-style schemas are generally safer/more interoperable than Java serialization.

## Visual
```text
Prefer Interoperable Payloads → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Prefer Interoperable Payloads:** Text/Bytes with JSON/Avro/Protobuf-style schemas are generally safer/more interoperable than Java serialization.


---

<!-- 288_AUDIT.md -->

# Audit

## What / Why
Provider and application logs should record security/admin events and message correlation without leaking payloads.

## Visual
```text
Audit → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Audit:** Provider and application logs should record security/admin events and message correlation without leaking payloads.


---

<!-- 289_PERFORMANCE_MENTAL_MODEL.md -->

# Performance Mental Model

## What / Why
Throughput depends on broker/provider, persistence, transactions, message size, consumers, selectors and network.

## Visual
```text
Performance Mental Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Performance Mental Model:** Throughput depends on broker/provider, persistence, transactions, message size, consumers, selectors and network.


---

<!-- 290_CONNECTION_POOLING.md -->

# Connection Pooling

## What / Why
Reuse connections instead of creating per-message connections.

## Visual
```text
Connection Pooling → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Pooling:** Reuse connections instead of creating per-message connections.


---

<!-- 291_SESSION_POOLING.md -->

# Session Pooling

## What / Why
Reuse/cache sessions where framework/provider allows.

## Visual
```text
Session Pooling → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Session Pooling:** Reuse/cache sessions where framework/provider allows.


---

<!-- 292_PRODUCER_REUSE.md -->

# Producer Reuse

## What / Why
Reuse producers/templates when safe.

## Visual
```text
Producer Reuse → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Producer Reuse:** Reuse producers/templates when safe.


---

<!-- 293_CONSUMER_CONCURRENCY.md -->

# Consumer Concurrency

## What / Why
Scale listener/container/MDB consumers based on destination/provider semantics.

## Visual
```text
Consumer Concurrency → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Consumer Concurrency:** Scale listener/container/MDB consumers based on destination/provider semantics.


---

<!-- 294_MESSAGE_SIZE.md -->

# Message Size

## What / Why
Large payloads increase network/storage/GC cost.

## Visual
```text
Message Size → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Size:** Large payloads increase network/storage/GC cost.


---

<!-- 295_CLAIM_CHECK.md -->

# Claim Check

## What / Why
Store large object externally and send reference.

## Visual
```text
Claim Check → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Claim Check:** Store large object externally and send reference.


---

<!-- 296_PERSISTENT_COST.md -->

# Persistent Cost

## What / Why
Persistent messages trade latency/IO for reliability.

## Visual
```text
Persistent Cost → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Persistent Cost:** Persistent messages trade latency/IO for reliability.


---

<!-- 297_TRANSACTIONS_COST.md -->

# Transactions Cost

## What / Why
Commit frequency and XA add coordination overhead.

## Visual
```text
Transactions Cost → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Transactions Cost:** Commit frequency and XA add coordination overhead.


---

<!-- 298_BATCH_TRANSACTION.md -->

# Batch Transaction

## What / Why
Process multiple messages per transaction when semantics allow.

## Visual
```text
Batch Transaction → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Batch Transaction:** Process multiple messages per transaction when semantics allow.


---

<!-- 299_PREFETCH_PROVIDER_SPECIFIC.md -->

# Prefetch Provider Specific

## What / Why
JMS does not standardize a universal consumer prefetch property; tune through provider/framework settings.

## Visual
```text
Prefetch Provider Specific → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Prefetch Provider Specific:** JMS does not standardize a universal consumer prefetch property; tune through provider/framework settings.


---

<!-- 300_SELECTORS_COST.md -->

# Selectors Cost

## What / Why
Complex selectors can burden broker filtering.

## Visual
```text
Selectors Cost → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selectors Cost:** Complex selectors can burden broker filtering.


---

<!-- 301_TOPIC_FANOUT_COST.md -->

# Topic Fanout Cost

## What / Why
Each durable subscription may create independent storage/delivery work.

## Visual
```text
Topic Fanout Cost → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Topic Fanout Cost:** Each durable subscription may create independent storage/delivery work.


---

<!-- 302_BACKLOG_CAPACITY.md -->

# Backlog Capacity

## What / Why
Provider storage must cover peak queue/subscription backlog.

## Visual
```text
Backlog Capacity → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Backlog Capacity:** Provider storage must cover peak queue/subscription backlog.


---

<!-- 303_SLOW_CONSUMER.md -->

# Slow Consumer

## What / Why
Creates queue/subscription growth and potential provider flow control.

## Visual
```text
Slow Consumer → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Slow Consumer:** Creates queue/subscription growth and potential provider flow control.


---

<!-- 304_BENCHMARK_PORTABLY.md -->

# Benchmark Portably

## What / Why
Test end-to-end provider configuration rather than assuming JMS API choice determines performance.

## Visual
```text
Benchmark Portably → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Benchmark Portably:** Test end-to-end provider configuration rather than assuming JMS API choice determines performance.


---

<!-- 305_JMS_OBSERVABILITY_MODEL.md -->

# JMS Observability Model

## What / Why
Trace producer → broker/provider → destination/subscription → consumer → business side effect.

## Visual
```text
JMS Observability Model → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Observability Model:** Trace producer → broker/provider → destination/subscription → consumer → business side effect.


---

<!-- 306_PRODUCER_SEND_LATENCY.md -->

# Producer Send Latency

## What / Why
Measure synchronous/async send completion latency.

## Visual
```text
Producer Send Latency → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Producer Send Latency:** Measure synchronous/async send completion latency.


---

<!-- 307_CONSUMER_PROCESSING_LATENCY.md -->

# Consumer Processing Latency

## What / Why
Measure receive-to-ack/commit/business completion.

## Visual
```text
Consumer Processing Latency → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Consumer Processing Latency:** Measure receive-to-ack/commit/business completion.


---

<!-- 308_QUEUE_DEPTH.md -->

# Queue Depth

## What / Why
Provider-specific metric for pending messages.

## Visual
```text
Queue Depth → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Depth:** Provider-specific metric for pending messages.


---

<!-- 309_UNACKED_INFLIGHT.md -->

# Unacked Inflight

## What / Why
Provider/framework-specific metric for delivered but unfinished messages.

## Visual
```text
Unacked Inflight → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Unacked Inflight:** Provider/framework-specific metric for delivered but unfinished messages.


---

<!-- 310_REDELIVERY_COUNT.md -->

# Redelivery Count

## What / Why
Use JMSRedelivered/JMSXDeliveryCount plus provider metrics.

## Visual
```text
Redelivery Count → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Redelivery Count:** Use JMSRedelivered/JMSXDeliveryCount plus provider metrics.


---

<!-- 311_EXPIRED_MESSAGES.md -->

# Expired Messages

## What / Why
Monitor TTL expiry.

## Visual
```text
Expired Messages → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Expired Messages:** Monitor TTL expiry.


---

<!-- 312_DLQ_DEPTH.md -->

# DLQ Depth

## What / Why
Provider-specific poison/failure metric.

## Visual
```text
DLQ Depth → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **DLQ Depth:** Provider-specific poison/failure metric.


---

<!-- 313_CONSUMER_COUNT.md -->

# Consumer Count

## What / Why
Track active consumers/listeners/MDB instances.

## Visual
```text
Consumer Count → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Consumer Count:** Track active consumers/listeners/MDB instances.


---

<!-- 314_CONNECTION_COUNT.md -->

# Connection Count

## What / Why
Track connection/session resource usage.

## Visual
```text
Connection Count → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Count:** Track connection/session resource usage.


---

<!-- 315_TRANSACTION_ROLLBACK_RATE.md -->

# Transaction Rollback Rate

## What / Why
High rollback signals processing/provider problems.

## Visual
```text
Transaction Rollback Rate → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Transaction Rollback Rate:** High rollback signals processing/provider problems.


---

<!-- 316_XA_HEURISTIC_FAILURES.md -->

# XA Heuristic Failures

## What / Why
Monitor transaction manager and provider for in-doubt/heuristic outcomes.

## Visual
```text
XA Heuristic Failures → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **XA Heuristic Failures:** Monitor transaction manager and provider for in-doubt/heuristic outcomes.


---

<!-- 317_TRACE_HEADERS.md -->

# Trace Headers

## What / Why
Propagate traceparent/correlation metadata in properties.

## Visual
```text
Trace Headers → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Trace Headers:** Propagate traceparent/correlation metadata in properties.


---

<!-- 318_BUSINESS_SLO.md -->

# Business SLO

## What / Why
Measure publish-to-business-effect latency.

## Visual
```text
Business SLO → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Business SLO:** Measure publish-to-business-effect latency.


---

<!-- 319_UNIT_TEST_PRODUCER_LOGIC.md -->

# Unit Test Producer Logic

## What / Why
Mock abstraction around JMS rather than broker internals when testing pure business code.

## Visual
```text
Unit Test Producer Logic → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Unit Test Producer Logic:** Mock abstraction around JMS rather than broker internals when testing pure business code.


---

<!-- 320_EMBEDDED_BROKER_TESTS.md -->

# Embedded Broker Tests

## What / Why
Use provider-supported embedded/test containers for realistic integration.

## Visual
```text
Embedded Broker Tests → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Embedded Broker Tests:** Use provider-supported embedded/test containers for realistic integration.


---

<!-- 321_TESTCONTAINERS.md -->

# Testcontainers

## What / Why
Run real messaging provider in disposable container for integration tests where available.

## Visual
```text
Testcontainers → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Testcontainers:** Run real messaging provider in disposable container for integration tests where available.


---

<!-- 322_CONTRACT_TESTS.md -->

# Contract Tests

## What / Why
Validate message schema/properties/destination semantics across producer/consumer.

## Visual
```text
Contract Tests → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Contract Tests:** Validate message schema/properties/destination semantics across producer/consumer.


---

<!-- 323_REDELIVERY_TEST.md -->

# Redelivery Test

## What / Why
Force consumer failure and verify idempotency/redelivery/DLQ.

## Visual
```text
Redelivery Test → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Redelivery Test:** Force consumer failure and verify idempotency/redelivery/DLQ.


---

<!-- 324_TRANSACTION_TEST.md -->

# Transaction Test

## What / Why
Verify rollback prevents ack/commit and preserves expected state.

## Visual
```text
Transaction Test → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Transaction Test:** Verify rollback prevents ack/commit and preserves expected state.


---

<!-- 325_SELECTOR_TEST.md -->

# Selector Test

## What / Why
Verify selector only matches headers/properties.

## Visual
```text
Selector Test → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selector Test:** Verify selector only matches headers/properties.


---

<!-- 326_DURABLE_SUBSCRIPTION_TEST.md -->

# Durable Subscription Test

## What / Why
Verify offline accumulation then delivery after reconnect.

## Visual
```text
Durable Subscription Test → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Durable Subscription Test:** Verify offline accumulation then delivery after reconnect.


---

<!-- 327_SHARED_SUBSCRIPTION_TEST.md -->

# Shared Subscription Test

## What / Why
Verify one message goes to one consumer within shared subscription.

## Visual
```text
Shared Subscription Test → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Shared Subscription Test:** Verify one message goes to one consumer within shared subscription.


---

<!-- 328_FAILOVER_TEST.md -->

# Failover Test

## What / Why
Kill/restart broker/node using provider HA test setup.

## Visual
```text
Failover Test → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Failover Test:** Kill/restart broker/node using provider HA test setup.


---

<!-- 329_PERFORMANCE_TEST.md -->

# Performance Test

## What / Why
Load with realistic message size/persistence/transactions/consumer count.

## Visual
```text
Performance Test → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Performance Test:** Load with realistic message size/persistence/transactions/consumer count.


---

<!-- 330_CONNECTION_FAILURE.md -->

# Connection Failure

## What / Why
Check broker URL/JNDI/auth/TLS/network/provider failover config.

## Visual
```text
Connection Failure → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Connection Failure:** Check broker URL/JNDI/auth/TLS/network/provider failover config.


---

<!-- 330_HIGH_VALUE_COMPARISONS.md -->

# JMS — High-Value Comparisons

## Classic vs Simplified API
| Classic | Simplified |
|---|---|
| Connection + Session | JMSContext |
| MessageProducer | JMSProducer |
| MessageConsumer | JMSConsumer |
| checked JMSException | more JMSRuntimeException |
| explicit Connection.start | context starts delivery automatically |

## Queue vs Topic
| Queue | Topic |
|---|---|
| one consuming path | copy per subscription |
| competing consumers | independent subscribers |
| backlog belongs to queue | backlog belongs to durable subscription |

## AUTO vs CLIENT vs DUPS_OK
| AUTO | CLIENT | DUPS_OK |
|---|---|---|
| automatic | app calls acknowledge | lazy provider ack |
| simple | explicit control | duplicates acceptable |

## Local Transaction vs XA
| Local JMS Tx | XA/JTA |
|---|---|
| one Session | multiple resources |
| commit/rollback Session | transaction manager |
| simpler | heavier coordination |

## JMS vs AMQP
| JMS | AMQP |
|---|---|
| Java API specification | wire protocol family |
| provider-neutral Java semantics | protocol interoperability |
| no wire format | wire-level model |

## JMS vs RabbitMQ / Kafka / Pulsar
JMS is an API abstraction. RabbitMQ, Kafka and Pulsar are concrete messaging/streaming platforms with their own protocols and operational models.


---

<!-- 331_INTERVIEW_TRAPS.md -->

# JMS Interview Traps

1. JMS is an API specification, not a broker.
2. JMS does not define a wire protocol.
3. JMS does not define provider administration.
4. JMS security configuration is provider-specific.
5. `javax.jms` and `jakarta.jms` represent the namespace transition; core JMS concepts persist.
6. Queue and Topic are destination abstractions with different delivery semantics.
7. A Topic does not automatically retain messages for offline subscribers; durable subscription is required.
8. Shared durable subscription allows multiple consumers to share one durable topic subscription.
9. `CLIENT_ACKNOWLEDGE` acknowledges messages consumed by the session, not only one isolated delivery.
10. `DUPS_OK_ACKNOWLEDGE` intentionally permits lazy acknowledgement and potential duplicates.
11. SESSION_TRANSACTED ignores normal acknowledgement mode.
12. Local JMS transaction does not include an external database.
13. XA/JTA is different from a local JMS transaction.
14. Even with transactions, business handlers should be designed for recovery/idempotency.
15. PERSISTENT delivery is not the same as "exactly once".
16. DLQ and redelivery policy are generally provider-specific.
17. Prefetch is not standardized as one portable JMS API setting.
18. ObjectMessage uses Java serialization and is often a poor cross-service integration contract.
19. Selectors inspect headers/properties, not message body.
20. JMSPriority default is 4; values range 0-9.
21. TTL zero means no expiration.
22. Delivery delay controls earliest delivery, not guaranteed exact scheduling.
23. Classic API requires Connection.start for delivery.
24. Simplified JMSContext starts delivery automatically by default.
25. Session use is single-threaded; do not casually share one Session concurrently.
26. Asynchronous send CompletionListener does not remove JMS session threading rules.
27. Asynchronous send is not permitted in Jakarta EE web/EJB containers.
28. MDB is a Jakarta EE container abstraction, not a JMS provider.
29. Spring JMS is an abstraction around JMS; it does not replace provider semantics.
30. ActiveMQ/Artemis/IBM MQ/WebLogic are providers/platforms, not synonyms for JMS.


---

<!-- 331_JNDI_NAME_NOT_FOUND.md -->

# JNDI Name Not Found

## What / Why
Logical resource not bound or environment namespace is wrong.

## Visual
```text
JNDI Name Not Found → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JNDI Name Not Found:** Logical resource not bound or environment namespace is wrong.


---

<!-- 332_JMSEXCEPTION.md -->

# JMSException

## What / Why
Inspect linked exception/error code/provider logs.

## Visual
```text
JMSException → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSException:** Inspect linked exception/error code/provider logs.


---

<!-- 332_PRODUCTION_CHECKLIST.md -->

# JMS Production Readiness Checklist

## API / Contract
- jakarta.jms version
- queue vs topic
- durable/shared subscription
- payload format/schema
- message properties/selectors
- provider extension usage documented

## Reliability
- delivery mode
- ack mode
- local/JTA/XA transaction decision
- idempotent consumer
- provider redelivery/DLQ
- timeout/TTL
- poison message handling

## Runtime
- pooled/reused connections
- session/thread ownership
- consumer concurrency
- provider HA
- capacity/backlog
- failover testing

## Security
- TLS
- credentials
- destination authorization
- secrets management
- no unsafe ObjectMessage from untrusted sources

## Operations
- queue/subscription depth
- redelivery/DLQ
- transaction rollback
- provider health
- publish/consume latency
- trace/correlation IDs


---

<!-- 333_JMSRUNTIMEEXCEPTION.md -->

# JMSRuntimeException

## What / Why
Simplified API runtime exception path.

## Visual
```text
JMSRuntimeException → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMSRuntimeException:** Simplified API runtime exception path.


---

<!-- 333_TROUBLESHOOTING_FLOW.md -->

# JMS Troubleshooting — Golden Flow

```text
1. Naming / Configuration
   ├─ ConnectionFactory?
   └─ Destination?

2. Connection / Session
   ├─ connected?
   ├─ Connection.start?
   └─ transaction/ack mode?

3. Producer
   ├─ destination?
   ├─ persistence?
   ├─ selector-relevant properties?
   └─ send/async completion?

4. Provider
   ├─ message present?
   ├─ expired?
   ├─ DLQ/redelivery?
   └─ HA/storage/security?

5. Consumer
   ├─ queue/topic subscription?
   ├─ client ID / durable name?
   ├─ selector?
   └─ ack/rollback?

6. Business Effect
   ├─ idempotency?
   ├─ DB transaction?
   └─ downstream failure?
```


---

<!-- 334_INVALIDDESTINATION.md -->

# InvalidDestination

## What / Why
Queue/topic does not exist or provider policy disallows dynamic creation.

## Visual
```text
InvalidDestination → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **InvalidDestination:** Queue/topic does not exist or provider policy disallows dynamic creation.


---

<!-- 334_SOURCES.md -->

# Sources & Accuracy Notes

Primary baseline: Jakarta Messaging 3.1 official specification and API documentation.

Current verified facts:
- Jakarta Messaging 3.1 is the current final specification listed by Jakarta EE.
- It is the Jakarta EE 10 release.
- Maven artifact: `jakarta.jms:jakarta.jms-api:3.1.0`.
- Minimum Java SE: 11+.
- JMS/Jakarta Messaging defines a Java API, not a wire protocol, administration API, or provider security configuration API.
- Message selectors use a SQL92-subset expression over headers/properties and cannot inspect message body.
- AUTO_ACKNOWLEDGE, CLIENT_ACKNOWLEDGE, DUPS_OK_ACKNOWLEDGE and SESSION_TRANSACTED are standard modes.
- JMS default delivery mode is PERSISTENT; default priority is 4; default TTL/delivery delay are zero.
- Shared durable subscriptions may have multiple consumers; each message is delivered to only one consumer within that subscription.
- Asynchronous send is not permitted in Jakarta EE web/EJB containers.

Provider-specific details must be verified against the chosen broker/version.


---

<!-- 335_INVALIDCLIENTID.md -->

# InvalidClientID

## What / Why
Durable-subscription client identifier conflicts or violates provider rules.

## Visual
```text
InvalidClientID → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **InvalidClientID:** Durable-subscription client identifier conflicts or violates provider rules.


---

<!-- 336_MESSAGE_FORMAT_ERROR.md -->

# Message Format Error

## What / Why
Body/property type mismatch.

## Visual
```text
Message Format Error → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Message Format Error:** Body/property type mismatch.


---

<!-- 337_SELECTOR_NOT_MATCHING.md -->

# Selector Not Matching

## What / Why
Property/header name/type/null semantics or selector syntax is wrong.

## Visual
```text
Selector Not Matching → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Selector Not Matching:** Property/header name/type/null semantics or selector syntax is wrong.


---

<!-- 338_NO_MESSAGES_RECEIVED.md -->

# No Messages Received

## What / Why
Connection not started in classic API, wrong destination, selector, subscription or transaction state.

## Visual
```text
No Messages Received → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **No Messages Received:** Connection not started in classic API, wrong destination, selector, subscription or transaction state.


---

<!-- 339_DUPLICATE_DELIVERY.md -->

# Duplicate Delivery

## What / Why
Expected after rollback/recover/failure with at-least-once behavior.

## Visual
```text
Duplicate Delivery → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Duplicate Delivery:** Expected after rollback/recover/failure with at-least-once behavior.


---

<!-- 340_MESSAGES_DISAPPEAR.md -->

# Messages Disappear

## What / Why
Auto-ack/commit/expiration/non-durable subscription/persistence/provider policy.

## Visual
```text
Messages Disappear → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Messages Disappear:** Auto-ack/commit/expiration/non-durable subscription/persistence/provider policy.


---

<!-- 341_DURABLE_SUBSCRIPTION_MISSING_MESSAGES.md -->

# Durable Subscription Missing Messages

## What / Why
Wrong client ID/subscription name, expired messages or provider configuration.

## Visual
```text
Durable Subscription Missing Messages → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Durable Subscription Missing Messages:** Wrong client ID/subscription name, expired messages or provider configuration.


---

<!-- 342_QUEUE_BACKLOG_GROWING.md -->

# Queue Backlog Growing

## What / Why
Consumers too slow/absent/failing or provider blocked.

## Visual
```text
Queue Backlog Growing → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue Backlog Growing:** Consumers too slow/absent/failing or provider blocked.


---

<!-- 343_POISON_MESSAGE_LOOP.md -->

# Poison Message Loop

## What / Why
Repeated rollback/recover without bounded provider redelivery policy.

## Visual
```text
Poison Message Loop → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Poison Message Loop:** Repeated rollback/recover without bounded provider redelivery policy.


---

<!-- 344_TRANSACTION_ROLLBACK_LOOP.md -->

# Transaction Rollback Loop

## What / Why
Business failure repeatedly rolls back same message.

## Visual
```text
Transaction Rollback Loop → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Transaction Rollback Loop:** Business failure repeatedly rolls back same message.


---

<!-- 345_XA_IN_DOUBT.md -->

# XA In Doubt

## What / Why
Transaction manager/provider recovery mismatch.

## Visual
```text
XA In Doubt → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **XA In Doubt:** Transaction manager/provider recovery mismatch.


---

<!-- 346_OBJECTMESSAGE_FAILURE.md -->

# ObjectMessage Failure

## What / Why
Class version/classloader/deserialization incompatibility.

## Visual
```text
ObjectMessage Failure → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **ObjectMessage Failure:** Class version/classloader/deserialization incompatibility.


---

<!-- 347_ASYNC_SEND_CALLBACK_MISSING.md -->

# Async Send Callback Missing

## What / Why
Connection/provider failure, lifecycle close, or unsupported/container-restricted async send usage.

## Visual
```text
Async Send Callback Missing → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Async Send Callback Missing:** Connection/provider failure, lifecycle close, or unsupported/container-restricted async send usage.


---

<!-- 348_THREADING_ERROR.md -->

# Threading Error

## What / Why
Session/JMSContext used concurrently in ways violating single-threaded session rules.

## Visual
```text
Threading Error → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Threading Error:** Session/JMSContext used concurrently in ways violating single-threaded session rules.


---

<!-- 349_GOLDEN_TROUBLESHOOTING_FLOW.md -->

# Golden Troubleshooting Flow

## What / Why
Connection/JNDI → destination → send → provider queue/subscription → consumer → ack/transaction → side effect.

## Visual
```text
Golden Troubleshooting Flow → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Golden Troubleshooting Flow:** Connection/JNDI → destination → send → provider queue/subscription → consumer → ack/transaction → side effect.


---

<!-- 350_DESIGN_WORK_QUEUE.md -->

# Design Work Queue

## What / Why
Queue + persistent delivery + transaction/ack + concurrency + idempotency + provider DLQ.

## Visual
```text
Design Work Queue → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Design Work Queue:** Queue + persistent delivery + transaction/ack + concurrency + idempotency + provider DLQ.


---

<!-- 351_DESIGN_PUB_SUB.md -->

# Design Pub Sub

## What / Why
Topic + durable/non-durable subscriptions based on offline delivery needs.

## Visual
```text
Design Pub Sub → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Design Pub Sub:** Topic + durable/non-durable subscriptions based on offline delivery needs.


---

<!-- 352_DESIGN_SHARED_DURABLE_SUBSCRIPTION.md -->

# Design Shared Durable Subscription

## What / Why
Topic + named shared durable subscription + multiple consumers.

## Visual
```text
Design Shared Durable Subscription → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Design Shared Durable Subscription:** Topic + named shared durable subscription + multiple consumers.


---

<!-- 353_DESIGN_RPC.md -->

# Design RPC

## What / Why
JMSReplyTo + correlation + timeout + idempotency.

## Visual
```text
Design RPC → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Design RPC:** JMSReplyTo + correlation + timeout + idempotency.


---

<!-- 354_DESIGN_PAYMENT_PROCESSING.md -->

# Design Payment Processing

## What / Why
Persistent queue + transaction/outbox + idempotent consumer + DLQ.

## Visual
```text
Design Payment Processing → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Design Payment Processing:** Persistent queue + transaction/outbox + idempotent consumer + DLQ.


---

<!-- 355_DESIGN_INTEGRATION_BUS.md -->

# Design Integration Bus

## What / Why
Provider-specific destinations behind portable JMS interfaces.

## Visual
```text
Design Integration Bus → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Design Integration Bus:** Provider-specific destinations behind portable JMS interfaces.


---

<!-- 356_DESIGN_XA_WORKFLOW.md -->

# Design XA Workflow

## What / Why
JTA coordinator + XA DB + XA JMS provider with recovery plan.

## Visual
```text
Design XA Workflow → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Design XA Workflow:** JTA coordinator + XA DB + XA JMS provider with recovery plan.


---

<!-- 357_DESIGN_OUTBOX_WORKFLOW.md -->

# Design Outbox Workflow

## What / Why
DB local transaction + outbox relay to JMS + idempotent consumer.

## Visual
```text
Design Outbox Workflow → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Design Outbox Workflow:** DB local transaction + outbox relay to JMS + idempotent consumer.


---

<!-- 358_JMS_VS_RABBITMQ.md -->

# JMS vs RabbitMQ

## What / Why
Java API abstraction vs concrete broker/protocol implementation.

## Visual
```text
JMS vs RabbitMQ → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS vs RabbitMQ:** Java API abstraction vs concrete broker/protocol implementation.


---

<!-- 359_JMS_VS_KAFKA.md -->

# JMS vs Kafka

## What / Why
Java messaging API spec vs distributed event-streaming platform.

## Visual
```text
JMS vs Kafka → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS vs Kafka:** Java messaging API spec vs distributed event-streaming platform.


---

<!-- 360_JMS_VS_PULSAR.md -->

# JMS vs Pulsar

## What / Why
Java messaging API abstraction vs concrete distributed messaging/streaming platform.

## Visual
```text
JMS vs Pulsar → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS vs Pulsar:** Java messaging API abstraction vs concrete distributed messaging/streaming platform.


---

<!-- 361_JMS_VS_AMQP.md -->

# JMS vs AMQP

## What / Why
Java API specification vs wire protocol family.

## Visual
```text
JMS vs AMQP → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS vs AMQP:** Java API specification vs wire protocol family.


---

<!-- 362_JMS_VS_ACTIVEMQ.md -->

# JMS vs ActiveMQ

## What / Why
API spec vs provider/broker.

## Visual
```text
JMS vs ActiveMQ → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS vs ActiveMQ:** API spec vs provider/broker.


---

<!-- 363_JMS_VS_JAKARTA_MESSAGING.md -->

# JMS vs Jakarta Messaging

## What / Why
Same specification lineage after Java EE → Jakarta EE namespace transition.

## Visual
```text
JMS vs Jakarta Messaging → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS vs Jakarta Messaging:** Same specification lineage after Java EE → Jakarta EE namespace transition.


---

<!-- 364_QUEUE_VS_TOPIC.md -->

# Queue vs Topic

## What / Why
One consuming path vs independent subscription copies.

## Visual
```text
Queue vs Topic → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Queue vs Topic:** One consuming path vs independent subscription copies.


---

<!-- 365_DURABLE_VS_NON_DURABLE_SUBSCRIPTION.md -->

# Durable vs Non Durable Subscription

## What / Why
Offline retention vs online-only subscription.

## Visual
```text
Durable vs Non Durable Subscription → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Durable vs Non Durable Subscription:** Offline retention vs online-only subscription.


---

<!-- 366_SHARED_VS_UNSHARED_DURABLE.md -->

# Shared vs Unshared Durable

## What / Why
Multiple concurrent consumers vs one active consumer on subscription.

## Visual
```text
Shared vs Unshared Durable → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Shared vs Unshared Durable:** Multiple concurrent consumers vs one active consumer on subscription.


---

<!-- 367_AUTO_VS_CLIENT_VS_DUPS_OK.md -->

# AUTO vs CLIENT vs DUPS OK

## What / Why
Automatic, explicit session-wide and lazy duplicate-tolerant acknowledgement.

## Visual
```text
AUTO vs CLIENT vs DUPS OK → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **AUTO vs CLIENT vs DUPS OK:** Automatic, explicit session-wide and lazy duplicate-tolerant acknowledgement.


---

<!-- 368_LOCAL_TRANSACTION_VS_XA.md -->

# Local Transaction vs XA

## What / Why
Single JMS session vs distributed multi-resource transaction.

## Visual
```text
Local Transaction vs XA → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **Local Transaction vs XA:** Single JMS session vs distributed multi-resource transaction.


---

<!-- 369_WHEN_NOT_TO_USE_JMS.md -->

# When Not to Use JMS

## What / Why
Non-Java polyglot APIs, native event-stream replay/log semantics, or cloud-native protocols may favor other approaches.

## Visual
```text
When Not to Use JMS → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **When Not to Use JMS:** Non-Java polyglot APIs, native event-stream replay/log semantics, or cloud-native protocols may favor other approaches.


---

<!-- 370_JMS_ANTI_PATTERNS.md -->

# JMS Anti Patterns

## What / Why
Connection per message, ObjectMessage for integration, XA everywhere, auto-ack critical work, no idempotency, provider extension leakage.

## Visual
```text
JMS Anti Patterns → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Anti Patterns:** Connection per message, ObjectMessage for integration, XA everywhere, auto-ack critical work, no idempotency, provider extension leakage.


---

<!-- 371_JMS_INTERVIEW_TRAPS.md -->

# JMS Interview Traps

## What / Why
High-value portability, acknowledgement, transaction, subscription and provider misconceptions.

## Visual
```text
JMS Interview Traps → JMS/Jakarta Messaging semantics
```

## How to Think About It
- Separate **JMS API semantics** from **provider implementation semantics**.
- Make destination type, acknowledgement and transaction boundaries explicit.
- Assume redelivery can happen unless a stronger transaction design proves otherwise.
- Keep provider-specific HA, DLQ, retry, security and wire-protocol knowledge in an adapter layer.

## Real-Life Analogy
JMS is like a **standard Java interface for courier companies**. Your application uses a common shipping API, while the actual courier/provider decides trucks, warehouses, routes, security, persistence and failover.

## Production Questions
```text
Queue or Topic?
Durable subscription?
Ack mode?
Local transaction or JTA/XA?
Persistent delivery?
TTL / priority / delay?
Selector?
Idempotency?
Provider DLQ/redelivery?
HA/security?
Portability requirement?
```

## Interview Trap
Do not answer provider questions as if they are JMS guarantees. JMS defines the Java contract; the provider defines most broker implementation details.

## 20-Second Recall
> **JMS Interview Traps:** High-value portability, acknowledgement, transaction, subscription and provider misconceptions.
