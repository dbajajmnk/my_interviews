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
