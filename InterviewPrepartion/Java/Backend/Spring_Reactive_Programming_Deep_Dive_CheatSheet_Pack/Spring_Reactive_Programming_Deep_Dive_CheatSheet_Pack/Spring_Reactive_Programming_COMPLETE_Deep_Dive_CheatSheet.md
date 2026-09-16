# Spring Reactive Programming — Complete Deep-Dive Cheat Sheet


---

<!-- 005_REACTIVE_PROGRAMMING_MENTAL_MODEL.md -->

# Reactive Programming Mental Model

## What / Why
Compose asynchronous streams of signals instead of blocking threads.

## Mental Model
```text
Reactive Programming Mental Model → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive Programming Mental Model:** Compose asynchronous streams of signals instead of blocking threads.


---

<!-- 006_REACTIVE_STREAMS.md -->

# Reactive Streams

## What / Why
Publisher, Subscriber, Subscription and Processor with backpressure.

## Mental Model
```text
Reactive Streams → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive Streams:** Publisher, Subscriber, Subscription and Processor with backpressure.


---

<!-- 007_PUBLISHER.md -->

# Publisher

## What / Why
Produces data/signals.

## Mental Model
```text
Publisher → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Publisher:** Produces data/signals.


---

<!-- 008_SUBSCRIBER.md -->

# Subscriber

## What / Why
Consumes signals and controls demand.

## Mental Model
```text
Subscriber → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Subscriber:** Consumes signals and controls demand.


---

<!-- 009_SUBSCRIPTION.md -->

# Subscription

## What / Why
Represents demand and cancellation.

## Mental Model
```text
Subscription → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Subscription:** Represents demand and cancellation.


---

<!-- 00_MASTER_INDEX.md -->

# Spring Reactive Programming — Dedicated Deep-Dive Cheat Sheet Pack

**Baseline:** Spring Framework 7.0.9 + Reactor Core 3.8.7 (September 2026).

**Boundary:** Full Spring Security belongs in its own pack; Spring Data/R2DBC repository mastery belongs in Spring Data/JPA.

## Fast Revision
- `01_30_SECOND_RECALL.md`
- `02_CURRENT_BASELINE.md`
- `03_REFERENCE_ARCHITECTURE.md`
- `04_REACTIVE_DECISION_TREE.md`

## Foundations

- Reactive Programming Mental Model — `005_REACTIVE_PROGRAMMING_MENTAL_MODEL.md`
- Reactive Streams — `006_REACTIVE_STREAMS.md`
- Publisher — `007_PUBLISHER.md`
- Subscriber — `008_SUBSCRIBER.md`
- Subscription — `009_SUBSCRIPTION.md`
- Backpressure — `010_BACKPRESSURE.md`
- Demand request(n) — `011_DEMAND_REQUEST_N.md`
- Cancellation — `012_CANCELLATION.md`
- Signals — `013_SIGNALS.md`
- Lazy Execution — `014_LAZY_EXECUTION.md`
- Assembly vs Subscription — `015_ASSEMBLY_VS_SUBSCRIPTION.md`
- Cold Publisher — `016_COLD_PUBLISHER.md`
- Hot Publisher — `017_HOT_PUBLISHER.md`
- Async vs Non Blocking — `018_ASYNC_VS_NON_BLOCKING.md`
- Concurrency vs Parallelism — `019_CONCURRENCY_VS_PARALLELISM.md`
- Imperative vs Reactive — `020_IMPERATIVE_VS_REACTIVE.md`
- When Reactive Fits — `021_WHEN_REACTIVE_FITS.md`
- When Reactive Does Not Fit — `022_WHEN_REACTIVE_DOES_NOT_FIT.md`

## Reactor Core

- Project Reactor — `023_PROJECT_REACTOR.md`
- Mono — `024_MONO.md`
- Flux — `025_FLUX.md`
- Mono empty — `026_MONO_EMPTY.md`
- Flux empty — `027_FLUX_EMPTY.md`
- just — `028_JUST.md`
- justOrEmpty — `029_JUSTOREMPTY.md`
- defer — `030_DEFER.md`
- deferContextual — `031_DEFERCONTEXTUAL.md`
- fromCallable — `032_FROMCALLABLE.md`
- fromSupplier — `033_FROMSUPPLIER.md`
- fromFuture — `034_FROMFUTURE.md`
- fromIterable — `035_FROMITERABLE.md`
- range — `036_RANGE.md`
- interval — `037_INTERVAL.md`
- generate — `038_GENERATE.md`
- create — `039_CREATE.md`
- push — `040_PUSH.md`
- using — `041_USING.md`
- usingWhen — `042_USINGWHEN.md`

## Operators

- map — `043_MAP.md`
- flatMap — `044_FLATMAP.md`
- flatMapSequential — `045_FLATMAPSEQUENTIAL.md`
- concatMap — `046_CONCATMAP.md`
- switchMap — `047_SWITCHMAP.md`
- filter — `048_FILTER.md`
- filterWhen — `049_FILTERWHEN.md`
- handle — `050_HANDLE.md`
- distinct — `051_DISTINCT.md`
- distinctUntilChanged — `052_DISTINCTUNTILCHANGED.md`
- take — `053_TAKE.md`
- skip — `054_SKIP.md`
- next — `055_NEXT.md`
- single — `056_SINGLE.md`
- singleOrEmpty — `057_SINGLEOREMPTY.md`
- zip — `058_ZIP.md`
- zipWhen — `059_ZIPWHEN.md`
- merge — `060_MERGE.md`
- concat — `061_CONCAT.md`
- combineLatest — `062_COMBINELATEST.md`
- then — `063_THEN.md`
- thenReturn — `064_THENRETURN.md`
- collectList — `065_COLLECTLIST.md`
- reduce — `066_REDUCE.md`
- scan — `067_SCAN.md`
- buffer — `068_BUFFER.md`
- window — `069_WINDOW.md`
- groupBy — `070_GROUPBY.md`
- transform — `071_TRANSFORM.md`
- transformDeferred — `072_TRANSFORMDEFERRED.md`

## Error Handling

- Reactive Error Contract — `073_REACTIVE_ERROR_CONTRACT.md`
- onErrorReturn — `074_ONERRORRETURN.md`
- onErrorResume — `075_ONERRORRESUME.md`
- onErrorMap — `076_ONERRORMAP.md`
- onErrorComplete — `077_ONERRORCOMPLETE.md`
- doOnError — `078_DOONERROR.md`
- retry — `079_RETRY.md`
- retryWhen — `080_RETRYWHEN.md`
- Retry backoff — `081_RETRY_BACKOFF.md`
- Retry jitter — `082_RETRY_JITTER.md`
- timeout — `083_TIMEOUT.md`
- repeat — `084_REPEAT.md`
- Error vs Empty — `085_ERROR_VS_EMPTY.md`
- Retry Side Effects — `086_RETRY_SIDE_EFFECTS.md`

## Backpressure

- Backpressure Mental Model — `087_BACKPRESSURE_MENTAL_MODEL.md`
- Unbounded Demand — `088_UNBOUNDED_DEMAND.md`
- Demand Reshaping — `089_DEMAND_RESHAPING.md`
- Prefetch — `090_PREFETCH.md`
- limitRate — `091_LIMITRATE.md`
- onBackpressureBuffer — `092_ONBACKPRESSUREBUFFER.md`
- onBackpressureDrop — `093_ONBACKPRESSUREDROP.md`
- onBackpressureLatest — `094_ONBACKPRESSURELATEST.md`
- onBackpressureError — `095_ONBACKPRESSUREERROR.md`
- Bounded Buffer — `096_BOUNDED_BUFFER.md`
- Backpressure vs Rate Limiting — `097_BACKPRESSURE_VS_RATE_LIMITING.md`
- Network Backpressure — `098_NETWORK_BACKPRESSURE.md`
- Database Backpressure — `099_DATABASE_BACKPRESSURE.md`

## Schedulers & Threading

- Scheduler — `100_SCHEDULER.md`
- Schedulers immediate — `101_SCHEDULERS_IMMEDIATE.md`
- Schedulers single — `102_SCHEDULERS_SINGLE.md`
- Schedulers parallel — `103_SCHEDULERS_PARALLEL.md`
- Schedulers boundedElastic — `104_SCHEDULERS_BOUNDEDELASTIC.md`
- Virtual Thread boundedElastic — `105_VIRTUAL_THREAD_BOUNDEDELASTIC.md`
- publishOn — `106_PUBLISHON.md`
- subscribeOn — `107_SUBSCRIBEON.md`
- publishOn Placement — `108_PUBLISHON_PLACEMENT.md`
- subscribeOn Placement — `109_SUBSCRIBEON_PLACEMENT.md`
- Event Loop — `110_EVENT_LOOP.md`
- CPU Work — `111_CPU_WORK.md`
- Blocking Work — `112_BLOCKING_WORK.md`
- ThreadLocal Trap — `113_THREADLOCAL_TRAP.md`
- ParallelFlux — `114_PARALLELFLUX.md`
- parallel — `115_PARALLEL.md`
- runOn — `116_RUNON.md`
- sequential — `117_SEQUENTIAL.md`

## Reactor Context

- Reactor Context — `118_REACTOR_CONTEXT.md`
- ContextView — `119_CONTEXTVIEW.md`
- contextWrite — `120_CONTEXTWRITE.md`
- deferContextual — `121_DEFERCONTEXTUAL.md`
- Context Direction — `122_CONTEXT_DIRECTION.md`
- Context vs ThreadLocal — `123_CONTEXT_VS_THREADLOCAL.md`
- Correlation ID — `124_CORRELATION_ID.md`
- Security Context — `125_SECURITY_CONTEXT.md`
- Context Propagation — `126_CONTEXT_PROPAGATION.md`
- Automatic Context Propagation — `127_AUTOMATIC_CONTEXT_PROPAGATION.md`

## Hot Cold & Sinks

- share — `128_SHARE.md`
- publish ConnectableFlux — `129_PUBLISH_CONNECTABLEFLUX.md`
- replay — `130_REPLAY.md`
- cache — `131_CACHE.md`
- autoConnect — `132_AUTOCONNECT.md`
- refCount — `133_REFCOUNT.md`
- Replay Memory Risk — `134_REPLAY_MEMORY_RISK.md`
- Sinks One — `135_SINKS_ONE.md`
- Sinks Many — `136_SINKS_MANY.md`
- Sinks unicast — `137_SINKS_UNICAST.md`
- Sinks multicast — `138_SINKS_MULTICAST.md`
- Sinks replay — `139_SINKS_REPLAY.md`
- tryEmitNext — `140_TRYEMITNEXT.md`
- emitNext — `141_EMITNEXT.md`
- Sink Serialization — `142_SINK_SERIALIZATION.md`

## Debugging & Testing

- checkpoint — `143_CHECKPOINT.md`
- Hooks onOperatorDebug — `144_HOOKS_ONOPERATORDEBUG.md`
- ReactorDebugAgent — `145_REACTORDEBUGAGENT.md`
- log operator — `146_LOG_OPERATOR.md`
- doOnRequest — `147_DOONREQUEST.md`
- doFinally — `148_DOFINALLY.md`
- BlockHound — `149_BLOCKHOUND.md`
- reactor-test — `150_REACTOR_TEST.md`
- StepVerifier — `151_STEPVERIFIER.md`
- thenRequest — `152_THENREQUEST.md`
- withVirtualTime — `153_WITHVIRTUALTIME.md`
- VirtualTimeScheduler — `154_VIRTUALTIMESCHEDULER.md`
- TestPublisher — `155_TESTPUBLISHER.md`
- PublisherProbe — `156_PUBLISHERPROBE.md`
- Context Expectations — `157_CONTEXT_EXPECTATIONS.md`

## WebFlux Core

- Spring WebFlux — `158_SPRING_WEBFLUX.md`
- WebFlux vs MVC — `159_WEBFLUX_VS_MVC.md`
- DispatcherHandler — `160_DISPATCHERHANDLER.md`
- HandlerMapping — `161_HANDLERMAPPING.md`
- HandlerAdapter — `162_HANDLERADAPTER.md`
- HandlerResultHandler — `163_HANDLERRESULTHANDLER.md`
- ServerWebExchange — `164_SERVERWEBEXCHANGE.md`
- ServerHttpRequest — `165_SERVERHTTPREQUEST.md`
- ServerHttpResponse — `166_SERVERHTTPRESPONSE.md`
- WebFilter — `167_WEBFILTER.md`
- WebFilterChain — `168_WEBFILTERCHAIN.md`
- WebExceptionHandler — `169_WEBEXCEPTIONHANDLER.md`
- WebSession — `170_WEBSESSION.md`
- CodecConfigurer — `171_CODECCONFIGURER.md`
- DataBuffer — `172_DATABUFFER.md`
- DataBufferUtils — `173_DATABUFFERUTILS.md`
- DataBuffer Leak — `174_DATABUFFER_LEAK.md`
- Reactor Netty Server — `175_REACTOR_NETTY_SERVER.md`
- WebFlux on Servlet — `176_WEBFLUX_ON_SERVLET.md`

## Controllers & Functional Endpoints

- @RestController WebFlux — `177_RESTCONTROLLER_WEBFLUX.md`
- @RequestBody Mono — `178_REQUESTBODY_MONO.md`
- @RequestBody Flux — `179_REQUESTBODY_FLUX.md`
- @ResponseBody Flux — `180_RESPONSEBODY_FLUX.md`
- Mono<Void> Handler — `181_MONO_VOID_HANDLER.md`
- Validation WebFlux — `182_VALIDATION_WEBFLUX.md`
- RouterFunction — `183_ROUTERFUNCTION.md`
- RequestPredicate — `184_REQUESTPREDICATE.md`
- HandlerFunction — `185_HANDLERFUNCTION.md`
- ServerRequest — `186_SERVERREQUEST.md`
- ServerResponse — `187_SERVERRESPONSE.md`
- Nested Routes — `188_NESTED_ROUTES.md`
- HandlerFilterFunction — `189_HANDLERFILTERFUNCTION.md`
- Annotated vs Functional — `190_ANNOTATED_VS_FUNCTIONAL.md`

## Codecs & Streaming

- HttpMessageReader — `191_HTTPMESSAGEREADER.md`
- HttpMessageWriter — `192_HTTPMESSAGEWRITER.md`
- Jackson Codec — `193_JACKSON_CODEC.md`
- SSE — `194_SSE.md`
- ServerSentEvent — `195_SERVERSENTEVENT.md`
- NDJSON — `196_NDJSON.md`
- Multipart WebFlux — `197_MULTIPART_WEBFLUX.md`
- FilePart — `198_FILEPART.md`
- Streaming Upload — `199_STREAMING_UPLOAD.md`
- maxInMemorySize — `200_MAXINMEMORYSIZE.md`
- DataBufferLimitException — `201_DATABUFFERLIMITEXCEPTION.md`
- Streaming Framing — `202_STREAMING_FRAMING.md`

## WebClient

- WebClient — `203_WEBCLIENT.md`
- WebClient Builder — `204_WEBCLIENT_BUILDER.md`
- baseUrl — `205_BASEURL.md`
- ExchangeFilterFunction — `206_EXCHANGEFILTERFUNCTION.md`
- retrieve — `207_RETRIEVE.md`
- exchangeToMono — `208_EXCHANGETOMONO.md`
- exchangeToFlux — `209_EXCHANGETOFLUX.md`
- bodyToMono — `210_BODYTOMONO.md`
- bodyToFlux — `211_BODYTOFLUX.md`
- onStatus — `212_ONSTATUS.md`
- Request Body Publisher — `213_REQUEST_BODY_PUBLISHER.md`
- WebClient SSE — `214_WEBCLIENT_SSE.md`
- WebClient Timeout — `215_WEBCLIENT_TIMEOUT.md`
- WebClient Retry — `216_WEBCLIENT_RETRY.md`
- WebClient Connection Pool — `217_WEBCLIENT_CONNECTION_POOL.md`
- WebClient TLS — `218_WEBCLIENT_TLS.md`
- WebClient Proxy — `219_WEBCLIENT_PROXY.md`
- WebClient Context — `220_WEBCLIENT_CONTEXT.md`
- WebClient Blocking Trap — `221_WEBCLIENT_BLOCKING_TRAP.md`

## HTTP Interfaces

- HTTP Service Interface — `222_HTTP_SERVICE_INTERFACE.md`
- @HttpExchange — `223_HTTPEXCHANGE.md`
- @GetExchange — `224_GETEXCHANGE.md`
- @PostExchange — `225_POSTEXCHANGE.md`
- HttpServiceProxyFactory — `226_HTTPSERVICEPROXYFACTORY.md`
- WebClientAdapter — `227_WEBCLIENTADAPTER.md`
- Reactive HTTP Interface — `228_REACTIVE_HTTP_INTERFACE.md`

## Reactor Netty

- Reactor Netty — `229_REACTOR_NETTY.md`
- Event Loop Resources — `230_EVENT_LOOP_RESOURCES.md`
- ConnectionProvider — `231_CONNECTIONPROVIDER.md`
- Max Connections — `232_MAX_CONNECTIONS.md`
- Pending Acquire — `233_PENDING_ACQUIRE.md`
- Pending Acquire Timeout — `234_PENDING_ACQUIRE_TIMEOUT.md`
- Max Idle Time — `235_MAX_IDLE_TIME.md`
- Max Life Time — `236_MAX_LIFE_TIME.md`
- Connect Timeout — `237_CONNECT_TIMEOUT.md`
- Response Timeout — `238_RESPONSE_TIMEOUT.md`
- Wiretap — `239_WIRETAP.md`
- Native Transport — `240_NATIVE_TRANSPORT.md`
- HTTP2 — `241_HTTP2.md`
- Netty Blocking Rule — `242_NETTY_BLOCKING_RULE.md`

## WebSocket RSocket

- Reactive WebSocket — `243_REACTIVE_WEBSOCKET.md`
- WebSocketHandler — `244_WEBSOCKETHANDLER.md`
- WebSocketSession — `245_WEBSOCKETSESSION.md`
- SSE vs WebSocket — `246_SSE_VS_WEBSOCKET.md`
- WebSocket Backpressure Caveat — `247_WEBSOCKET_BACKPRESSURE_CAVEAT.md`
- RSocket — `248_RSOCKET.md`
- RSocket request-response — `249_RSOCKET_REQUEST_RESPONSE.md`
- RSocket request-stream — `250_RSOCKET_REQUEST_STREAM.md`
- RSocket channel — `251_RSOCKET_CHANNEL.md`
- RSocketRequester — `252_RSOCKETREQUESTER.md`
- RSocket Flow Control — `253_RSOCKET_FLOW_CONTROL.md`

## R2DBC & Transactions

- R2DBC — `254_R2DBC.md`
- ConnectionFactory — `255_CONNECTIONFACTORY.md`
- DatabaseClient — `256_DATABASECLIENT.md`
- DatabaseClient sql — `257_DATABASECLIENT_SQL.md`
- bind — `258_BIND.md`
- map rows — `259_MAP_ROWS.md`
- fetch all — `260_FETCH_ALL.md`
- fetch one — `261_FETCH_ONE.md`
- rowsUpdated — `262_ROWSUPDATED.md`
- R2dbcTransactionManager — `263_R2DBCTRANSACTIONMANAGER.md`
- ReactiveTransactionManager — `264_REACTIVETRANSACTIONMANAGER.md`
- TransactionalOperator — `265_TRANSACTIONALOPERATOR.md`
- @Transactional Reactive — `266_TRANSACTIONAL_REACTIVE.md`
- Reactor Context Transaction — `267_REACTOR_CONTEXT_TRANSACTION.md`
- Commit on Complete — `268_COMMIT_ON_COMPLETE.md`
- Rollback on Error — `269_ROLLBACK_ON_ERROR.md`
- Cancellation and Transaction — `270_CANCELLATION_AND_TRANSACTION.md`
- Parallel Transaction Trap — `271_PARALLEL_TRANSACTION_TRAP.md`
- JDBC Blocking Trap — `272_JDBC_BLOCKING_TRAP.md`
- R2DBC Pool — `273_R2DBC_POOL.md`

## Blocking Boundaries

- Blocking Boundary — `274_BLOCKING_BOUNDARY.md`
- fromCallable boundedElastic — `275_FROMCALLABLE_BOUNDEDELASTIC.md`
- subscribeOn boundedElastic — `276_SUBSCRIBEON_BOUNDEDELASTIC.md`
- Blocking Repository Adapter — `277_BLOCKING_REPOSITORY_ADAPTER.md`
- File IO Blocking — `278_FILE_IO_BLOCKING.md`
- Legacy SDK Blocking — `279_LEGACY_SDK_BLOCKING.md`
- Thread Pool Exhaustion — `280_THREAD_POOL_EXHAUSTION.md`
- Bulkhead Blocking Work — `281_BULKHEAD_BLOCKING_WORK.md`
- Migration to Non Blocking — `282_MIGRATION_TO_NON_BLOCKING.md`

## Resilience

- Timeout First — `283_TIMEOUT_FIRST.md`
- Retry Policy — `284_RETRY_POLICY.md`
- Exponential Backoff — `285_EXPONENTIAL_BACKOFF.md`
- Jitter — `286_JITTER.md`
- Circuit Breaker — `287_CIRCUIT_BREAKER.md`
- Bulkhead — `288_BULKHEAD.md`
- Rate Limiter — `289_RATE_LIMITER.md`
- Fallback — `290_FALLBACK.md`
- Idempotency — `291_IDEMPOTENCY.md`
- Operator Ordering Resilience — `292_OPERATOR_ORDERING_RESILIENCE.md`
- Retry Storm — `293_RETRY_STORM.md`

## Observability & Performance

- Micrometer Observation — `294_MICROMETER_OBSERVATION.md`
- Reactor Metrics — `295_REACTOR_METRICS.md`
- Trace Context Propagation — `296_TRACE_CONTEXT_PROPAGATION.md`
- MDC Trap — `297_MDC_TRAP.md`
- HTTP Server Metrics — `298_HTTP_SERVER_METRICS.md`
- HTTP Client Metrics — `299_HTTP_CLIENT_METRICS.md`
- R2DBC Pool Metrics — `300_R2DBC_POOL_METRICS.md`
- Reactive Performance Rule — `301_REACTIVE_PERFORMANCE_RULE.md`
- Event Loop Saturation — `302_EVENT_LOOP_SATURATION.md`
- Connection Pool Saturation — `303_CONNECTION_POOL_SATURATION.md`
- Little Law — `304_LITTLE_LAW.md`
- flatMap Concurrency — `305_FLATMAP_CONCURRENCY.md`
- collectList Memory Risk — `306_COLLECTLIST_MEMORY_RISK.md`
- Scheduler Hop Cost — `307_SCHEDULER_HOP_COST.md`
- Tail Latency — `308_TAIL_LATENCY.md`
- Load Testing Reactive — `309_LOAD_TESTING_REACTIVE.md`

## Kotlin & Virtual Threads

- Kotlin Coroutines WebFlux — `310_KOTLIN_COROUTINES_WEBFLUX.md`
- suspend Controller — `311_SUSPEND_CONTROLLER.md`
- Kotlin Flow — `312_KOTLIN_FLOW.md`
- awaitSingle — `313_AWAITSINGLE.md`
- Flux asFlow — `314_FLUX_ASFLOW.md`
- Flow asFlux — `315_FLOW_ASFLUX.md`
- Coroutines vs Reactor — `316_COROUTINES_VS_REACTOR.md`
- Reactive vs Virtual Threads — `317_REACTIVE_VS_VIRTUAL_THREADS.md`
- Virtual Threads Strength — `318_VIRTUAL_THREADS_STRENGTH.md`
- Reactive Strength — `319_REACTIVE_STRENGTH.md`
- Backpressure Difference — `320_BACKPRESSURE_DIFFERENCE.md`
- Hybrid Architecture — `321_HYBRID_ARCHITECTURE.md`

## Anti Patterns & Troubleshooting

- Nested Subscribe Anti Pattern — `322_NESTED_SUBSCRIBE_ANTI_PATTERN.md`
- Block in Event Loop — `323_BLOCK_IN_EVENT_LOOP.md`
- boundedElastic Everywhere — `324_BOUNDEDELASTIC_EVERYWHERE.md`
- Unbounded flatMap — `325_UNBOUNDED_FLATMAP.md`
- Unbounded Buffer — `326_UNBOUNDED_BUFFER.md`
- collectList Everywhere — `327_COLLECTLIST_EVERYWHERE.md`
- Swallowed Error — `328_SWALLOWED_ERROR.md`
- Retry Everything — `329_RETRY_EVERYTHING.md`
- ThreadLocal Context — `330_THREADLOCAL_CONTEXT.md`
- subscribe in Controller — `331_SUBSCRIBE_IN_CONTROLLER.md`
- WebFlux Request Hangs — `332_WEBFLUX_REQUEST_HANGS.md`
- IllegalStateException block — `333_ILLEGALSTATEEXCEPTION_BLOCK.md`
- Connection Pool Timeout — `334_CONNECTION_POOL_TIMEOUT.md`
- R2DBC Pool Exhausted — `335_R2DBC_POOL_EXHAUSTED.md`
- groupBy Hangs — `336_GROUPBY_HANGS.md`
- SSE Stops — `337_SSE_STOPS.md`
- Context Missing — `338_CONTEXT_MISSING.md`
- Retry Storm Diagnosis — `339_RETRY_STORM_DIAGNOSIS.md`
- Pooled Buffer Leak — `340_POOLED_BUFFER_LEAK.md`
- zip Empty Trap — `341_ZIP_EMPTY_TRAP.md`
- switchIfEmpty Eagerness — `342_SWITCHIFEMPTY_EAGERNESS.md`
- Golden Debug Flow — `343_GOLDEN_DEBUG_FLOW.md`

## System Design & Interview

- Design High Concurrency API — `344_DESIGN_HIGH_CONCURRENCY_API.md`
- Design SSE Service — `345_DESIGN_SSE_SERVICE.md`
- Design WebSocket Service — `346_DESIGN_WEBSOCKET_SERVICE.md`
- Design Aggregator — `347_DESIGN_AGGREGATOR.md`
- Design Reactive CRUD — `348_DESIGN_REACTIVE_CRUD.md`
- Design Streaming DB API — `349_DESIGN_STREAMING_DB_API.md`
- Design Reactive Gateway — `350_DESIGN_REACTIVE_GATEWAY.md`
- Design Blocking Integration — `351_DESIGN_BLOCKING_INTEGRATION.md`
- Mono vs Flux Interview — `352_MONO_VS_FLUX_INTERVIEW.md`
- map vs flatMap Interview — `353_MAP_VS_FLATMAP_INTERVIEW.md`
- flatMap vs concatMap Interview — `354_FLATMAP_VS_CONCATMAP_INTERVIEW.md`
- publishOn vs subscribeOn Interview — `355_PUBLISHON_VS_SUBSCRIBEON_INTERVIEW.md`
- Hot vs Cold Interview — `356_HOT_VS_COLD_INTERVIEW.md`
- Backpressure Interview — `357_BACKPRESSURE_INTERVIEW.md`
- WebFlux vs MVC Interview — `358_WEBFLUX_VS_MVC_INTERVIEW.md`
- WebClient vs RestClient Interview — `359_WEBCLIENT_VS_RESTCLIENT_INTERVIEW.md`
- R2DBC vs JDBC Interview — `360_R2DBC_VS_JDBC_INTERVIEW.md`
- Reactive vs Virtual Threads Interview — `361_REACTIVE_VS_VIRTUAL_THREADS_INTERVIEW.md`
- Context vs ThreadLocal Interview — `362_CONTEXT_VS_THREADLOCAL_INTERVIEW.md`
- Reactive Transaction Interview — `363_REACTIVE_TRANSACTION_INTERVIEW.md`
- When Not to Use WebFlux — `364_WHEN_NOT_TO_USE_WEBFLUX.md`
- Reactive Interview Traps — `365_REACTIVE_INTERVIEW_TRAPS.md`


---

<!-- 010_BACKPRESSURE.md -->

# Backpressure

## What / Why
Downstream regulates upstream demand.

## Mental Model
```text
Backpressure → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Backpressure:** Downstream regulates upstream demand.


---

<!-- 011_DEMAND_REQUEST_N.md -->

# Demand request(n)

## What / Why
Subscriber requests bounded elements.

## Mental Model
```text
Demand request(n) → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Demand request(n):** Subscriber requests bounded elements.


---

<!-- 012_CANCELLATION.md -->

# Cancellation

## What / Why
Stops upstream work.

## Mental Model
```text
Cancellation → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Cancellation:** Stops upstream work.


---

<!-- 013_SIGNALS.md -->

# Signals

## What / Why
onNext, onError and onComplete.

## Mental Model
```text
Signals → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Signals:** onNext, onError and onComplete.


---

<!-- 014_LAZY_EXECUTION.md -->

# Lazy Execution

## What / Why
Cold pipelines usually start on subscription.

## Mental Model
```text
Lazy Execution → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Lazy Execution:** Cold pipelines usually start on subscription.


---

<!-- 015_ASSEMBLY_VS_SUBSCRIPTION.md -->

# Assembly vs Subscription

## What / Why
Assembly defines; subscription activates.

## Mental Model
```text
Assembly vs Subscription → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Assembly vs Subscription:** Assembly defines; subscription activates.


---

<!-- 016_COLD_PUBLISHER.md -->

# Cold Publisher

## What / Why
New source execution per subscriber.

## Mental Model
```text
Cold Publisher → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Cold Publisher:** New source execution per subscriber.


---

<!-- 017_HOT_PUBLISHER.md -->

# Hot Publisher

## What / Why
Shared/live source independent of subscriber.

## Mental Model
```text
Hot Publisher → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Hot Publisher:** Shared/live source independent of subscriber.


---

<!-- 018_ASYNC_VS_NON_BLOCKING.md -->

# Async vs Non Blocking

## What / Why
Async work can still block threads.

## Mental Model
```text
Async vs Non Blocking → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Async vs Non Blocking:** Async work can still block threads.


---

<!-- 019_CONCURRENCY_VS_PARALLELISM.md -->

# Concurrency vs Parallelism

## What / Why
Interleaving vs simultaneous execution.

## Mental Model
```text
Concurrency vs Parallelism → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Concurrency vs Parallelism:** Interleaving vs simultaneous execution.


---

<!-- 01_30_SECOND_RECALL.md -->

# Spring Reactive Programming — 30-Second Recall

```text
Source → Mono/Flux → Operators → Scheduler/Context → Subscriber
                ↑                 ↓
             Demand ← Backpressure
```

## WebFlux
```text
HTTP → Reactor Netty → WebFilter → DispatcherHandler → Controller/Router → WebClient/R2DBC → Response
```

## Golden Rules
- Never block event-loop threads.
- Compose; do not nested-subscribe.
- Bound concurrency and buffers.
- Treat cancellation as normal.
- Use Reactor Context instead of thread-affinity assumptions.


---

<!-- 020_IMPERATIVE_VS_REACTIVE.md -->

# Imperative vs Reactive

## What / Why
Pull/block vs compose/react.

## Mental Model
```text
Imperative vs Reactive → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Imperative vs Reactive:** Pull/block vs compose/react.


---

<!-- 021_WHEN_REACTIVE_FITS.md -->

# When Reactive Fits

## What / Why
High I/O concurrency, streaming, fan-out and event-driven flows.

## Mental Model
```text
When Reactive Fits → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **When Reactive Fits:** High I/O concurrency, streaming, fan-out and event-driven flows.


---

<!-- 022_WHEN_REACTIVE_DOES_NOT_FIT.md -->

# When Reactive Does Not Fit

## What / Why
Simple blocking CRUD with modest concurrency may not justify complexity.

## Mental Model
```text
When Reactive Does Not Fit → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **When Reactive Does Not Fit:** Simple blocking CRUD with modest concurrency may not justify complexity.


---

<!-- 023_PROJECT_REACTOR.md -->

# Project Reactor

## What / Why
Reactive Streams foundation used by Spring.

## Mental Model
```text
Project Reactor → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Project Reactor:** Reactive Streams foundation used by Spring.


---

<!-- 024_MONO.md -->

# Mono

## What / Why
0..1 asynchronous result.

## Mental Model
```text
Mono → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Mono:** 0..1 asynchronous result.


---

<!-- 025_FLUX.md -->

# Flux

## What / Why
0..N asynchronous stream.

## Mental Model
```text
Flux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Flux:** 0..N asynchronous stream.


---

<!-- 026_MONO_EMPTY.md -->

# Mono empty

## What / Why
Successful completion without value.

## Mental Model
```text
Mono empty → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Mono empty:** Successful completion without value.


---

<!-- 027_FLUX_EMPTY.md -->

# Flux empty

## What / Why
Completion without values.

## Mental Model
```text
Flux empty → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Flux empty:** Completion without values.


---

<!-- 028_JUST.md -->

# just

## What / Why
Create publisher from known value.

## Mental Model
```text
just → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **just:** Create publisher from known value.


---

<!-- 029_JUSTOREMPTY.md -->

# justOrEmpty

## What / Why
Create Mono from nullable or optional value.

## Mental Model
```text
justOrEmpty → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **justOrEmpty:** Create Mono from nullable or optional value.


---

<!-- 02_CURRENT_BASELINE.md -->

# Current Baseline — September 2026

- **Spring Framework 7.0.9** — latest stable in current official reference.
- **Reactor Core 3.8.7** — current Reactor Core release.
- WebFlux remains fully non-blocking and Reactive Streams backpressure-aware.
- WebClient is non-blocking, Reactor-based and supports streaming.

Prefer Spring Boot dependency management instead of manually mixing Reactor/Spring Framework versions.


---

<!-- 030_DEFER.md -->

# defer

## What / Why
Create publisher lazily per subscriber.

## Mental Model
```text
defer → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **defer:** Create publisher lazily per subscriber.


---

<!-- 031_DEFERCONTEXTUAL.md -->

# deferContextual

## What / Why
Create publisher using Reactor Context.

## Mental Model
```text
deferContextual → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **deferContextual:** Create publisher using Reactor Context.


---

<!-- 032_FROMCALLABLE.md -->

# fromCallable

## What / Why
Lazily adapt Callable.

## Mental Model
```text
fromCallable → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **fromCallable:** Lazily adapt Callable.


---

<!-- 033_FROMSUPPLIER.md -->

# fromSupplier

## What / Why
Lazily adapt Supplier.

## Mental Model
```text
fromSupplier → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **fromSupplier:** Lazily adapt Supplier.


---

<!-- 034_FROMFUTURE.md -->

# fromFuture

## What / Why
Adapt CompletableFuture.

## Mental Model
```text
fromFuture → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **fromFuture:** Adapt CompletableFuture.


---

<!-- 035_FROMITERABLE.md -->

# fromIterable

## What / Why
Adapt Iterable.

## Mental Model
```text
fromIterable → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **fromIterable:** Adapt Iterable.


---

<!-- 036_RANGE.md -->

# range

## What / Why
Generate integer range.

## Mental Model
```text
range → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **range:** Generate integer range.


---

<!-- 037_INTERVAL.md -->

# interval

## What / Why
Periodic publisher.

## Mental Model
```text
interval → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **interval:** Periodic publisher.


---

<!-- 038_GENERATE.md -->

# generate

## What / Why
Synchronous stateful generator.

## Mental Model
```text
generate → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **generate:** Synchronous stateful generator.


---

<!-- 039_CREATE.md -->

# create

## What / Why
Asynchronous bridge using FluxSink.

## Mental Model
```text
create → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **create:** Asynchronous bridge using FluxSink.


---

<!-- 03_REFERENCE_ARCHITECTURE.md -->

# Spring Reactive Reference Architecture

```text
Client
  ↓
Reactor Netty Event Loop
  ↓
WebFilters / SecurityWebFilterChain
  ↓
DispatcherHandler
  ↓
Controller / RouterFunction
  ↓
Reactive Service
 ├─ WebClient → Remote APIs
 ├─ R2DBC → Database
 ├─ RSocket → Reactive Services
 └─ Broker Adapter → Events
  ↓
Mono / Flux Response
```

Cross-cutting: Reactor Context, backpressure, schedulers, timeouts, cancellation, tracing and bounded resource pools.


---

<!-- 040_PUSH.md -->

# push

## What / Why
Single-producer async bridge.

## Mental Model
```text
push → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **push:** Single-producer async bridge.


---

<!-- 041_USING.md -->

# using

## What / Why
Resource lifecycle publisher.

## Mental Model
```text
using → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **using:** Resource lifecycle publisher.


---

<!-- 042_USINGWHEN.md -->

# usingWhen

## What / Why
Reactive resource lifecycle.

## Mental Model
```text
usingWhen → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **usingWhen:** Reactive resource lifecycle.


---

<!-- 043_MAP.md -->

# map

## What / Why
Synchronous one-to-one transformation.

## Mental Model
```text
map → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **map:** Synchronous one-to-one transformation.


---

<!-- 044_FLATMAP.md -->

# flatMap

## What / Why
Asynchronous transform and merge.

## Mental Model
```text
flatMap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **flatMap:** Asynchronous transform and merge.


---

<!-- 045_FLATMAPSEQUENTIAL.md -->

# flatMapSequential

## What / Why
Concurrent inner work with source-order output.

## Mental Model
```text
flatMapSequential → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **flatMapSequential:** Concurrent inner work with source-order output.


---

<!-- 046_CONCATMAP.md -->

# concatMap

## What / Why
Sequential async mapping preserving order.

## Mental Model
```text
concatMap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **concatMap:** Sequential async mapping preserving order.


---

<!-- 047_SWITCHMAP.md -->

# switchMap

## What / Why
Switch to newest inner publisher and cancel prior one.

## Mental Model
```text
switchMap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **switchMap:** Switch to newest inner publisher and cancel prior one.


---

<!-- 048_FILTER.md -->

# filter

## What / Why
Keep matching elements.

## Mental Model
```text
filter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **filter:** Keep matching elements.


---

<!-- 049_FILTERWHEN.md -->

# filterWhen

## What / Why
Async filtering.

## Mental Model
```text
filterWhen → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **filterWhen:** Async filtering.


---

<!-- 04_REACTIVE_DECISION_TREE.md -->

# Reactive Decision Tree

```text
High I/O concurrency or streaming? → WebFlux/Reactor candidate
Mostly blocking JDBC/JPA/SDKs? → MVC + virtual threads may be simpler
0..1 result? → Mono
0..N stream? → Flux
Async mapping? → flatMap
Strict ordering? → concatMap
Concurrent work + ordered output? → flatMapSequential
Legacy blocking call? → fromCallable + boundedElastic + bulkhead
Reactive DB transaction? → R2DBC + reactive transaction manager
```


---

<!-- 050_HANDLE.md -->

# handle

## What / Why
Combine map/filter with sink.

## Mental Model
```text
handle → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **handle:** Combine map/filter with sink.


---

<!-- 051_DISTINCT.md -->

# distinct

## What / Why
Drop duplicates across sequence.

## Mental Model
```text
distinct → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **distinct:** Drop duplicates across sequence.


---

<!-- 052_DISTINCTUNTILCHANGED.md -->

# distinctUntilChanged

## What / Why
Drop consecutive duplicates.

## Mental Model
```text
distinctUntilChanged → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **distinctUntilChanged:** Drop consecutive duplicates.


---

<!-- 053_TAKE.md -->

# take

## What / Why
Take first N.

## Mental Model
```text
take → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **take:** Take first N.


---

<!-- 054_SKIP.md -->

# skip

## What / Why
Skip first N.

## Mental Model
```text
skip → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **skip:** Skip first N.


---

<!-- 055_NEXT.md -->

# next

## What / Why
First Flux value as Mono.

## Mental Model
```text
next → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **next:** First Flux value as Mono.


---

<!-- 056_SINGLE.md -->

# single

## What / Why
Require exactly one.

## Mental Model
```text
single → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **single:** Require exactly one.


---

<!-- 057_SINGLEOREMPTY.md -->

# singleOrEmpty

## What / Why
Allow zero or one.

## Mental Model
```text
singleOrEmpty → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **singleOrEmpty:** Allow zero or one.


---

<!-- 058_ZIP.md -->

# zip

## What / Why
Combine values by position.

## Mental Model
```text
zip → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **zip:** Combine values by position.


---

<!-- 059_ZIPWHEN.md -->

# zipWhen

## What / Why
Async derive and combine from Mono.

## Mental Model
```text
zipWhen → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **zipWhen:** Async derive and combine from Mono.


---

<!-- 060_MERGE.md -->

# merge

## What / Why
Interleave concurrent sources.

## Mental Model
```text
merge → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **merge:** Interleave concurrent sources.


---

<!-- 061_CONCAT.md -->

# concat

## What / Why
Subscribe to sources sequentially.

## Mental Model
```text
concat → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **concat:** Subscribe to sources sequentially.


---

<!-- 062_COMBINELATEST.md -->

# combineLatest

## What / Why
Combine latest values.

## Mental Model
```text
combineLatest → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **combineLatest:** Combine latest values.


---

<!-- 063_THEN.md -->

# then

## What / Why
Ignore values, continue on completion.

## Mental Model
```text
then → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **then:** Ignore values, continue on completion.


---

<!-- 064_THENRETURN.md -->

# thenReturn

## What / Why
Return fixed value after completion.

## Mental Model
```text
thenReturn → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **thenReturn:** Return fixed value after completion.


---

<!-- 065_COLLECTLIST.md -->

# collectList

## What / Why
Aggregate all values into List.

## Mental Model
```text
collectList → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **collectList:** Aggregate all values into List.


---

<!-- 066_REDUCE.md -->

# reduce

## What / Why
Aggregate to one result.

## Mental Model
```text
reduce → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **reduce:** Aggregate to one result.


---

<!-- 067_SCAN.md -->

# scan

## What / Why
Emit intermediate reductions.

## Mental Model
```text
scan → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **scan:** Emit intermediate reductions.


---

<!-- 068_BUFFER.md -->

# buffer

## What / Why
Collect windows into Lists.

## Mental Model
```text
buffer → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **buffer:** Collect windows into Lists.


---

<!-- 069_WINDOW.md -->

# window

## What / Why
Split into Flux windows.

## Mental Model
```text
window → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **window:** Split into Flux windows.


---

<!-- 070_GROUPBY.md -->

# groupBy

## What / Why
Split into keyed GroupedFlux streams.

## Mental Model
```text
groupBy → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **groupBy:** Split into keyed GroupedFlux streams.


---

<!-- 071_TRANSFORM.md -->

# transform

## What / Why
Reusable composition at assembly.

## Mental Model
```text
transform → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **transform:** Reusable composition at assembly.


---

<!-- 072_TRANSFORMDEFERRED.md -->

# transformDeferred

## What / Why
Per-subscription transformation.

## Mental Model
```text
transformDeferred → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **transformDeferred:** Per-subscription transformation.


---

<!-- 073_REACTIVE_ERROR_CONTRACT.md -->

# Reactive Error Contract

## What / Why
Error terminates sequence unless replaced.

## Mental Model
```text
Reactive Error Contract → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive Error Contract:** Error terminates sequence unless replaced.


---

<!-- 074_ONERRORRETURN.md -->

# onErrorReturn

## What / Why
Fallback fixed value.

## Mental Model
```text
onErrorReturn → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onErrorReturn:** Fallback fixed value.


---

<!-- 075_ONERRORRESUME.md -->

# onErrorResume

## What / Why
Fallback publisher.

## Mental Model
```text
onErrorResume → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onErrorResume:** Fallback publisher.


---

<!-- 076_ONERRORMAP.md -->

# onErrorMap

## What / Why
Translate exception.

## Mental Model
```text
onErrorMap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onErrorMap:** Translate exception.


---

<!-- 077_ONERRORCOMPLETE.md -->

# onErrorComplete

## What / Why
Convert failure to completion.

## Mental Model
```text
onErrorComplete → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onErrorComplete:** Convert failure to completion.


---

<!-- 078_DOONERROR.md -->

# doOnError

## What / Why
Observe error without recovery.

## Mental Model
```text
doOnError → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **doOnError:** Observe error without recovery.


---

<!-- 079_RETRY.md -->

# retry

## What / Why
Resubscribe after failure.

## Mental Model
```text
retry → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **retry:** Resubscribe after failure.


---

<!-- 080_RETRYWHEN.md -->

# retryWhen

## What / Why
Configurable Retry strategy.

## Mental Model
```text
retryWhen → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **retryWhen:** Configurable Retry strategy.


---

<!-- 081_RETRY_BACKOFF.md -->

# Retry backoff

## What / Why
Exponential delayed retries.

## Mental Model
```text
Retry backoff → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Retry backoff:** Exponential delayed retries.


---

<!-- 082_RETRY_JITTER.md -->

# Retry jitter

## What / Why
Randomize retry timing.

## Mental Model
```text
Retry jitter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Retry jitter:** Randomize retry timing.


---

<!-- 083_TIMEOUT.md -->

# timeout

## What / Why
Fail or switch after time budget.

## Mental Model
```text
timeout → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **timeout:** Fail or switch after time budget.


---

<!-- 084_REPEAT.md -->

# repeat

## What / Why
Resubscribe after successful completion.

## Mental Model
```text
repeat → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **repeat:** Resubscribe after successful completion.


---

<!-- 085_ERROR_VS_EMPTY.md -->

# Error vs Empty

## What / Why
Failure and no-value are different contracts.

## Mental Model
```text
Error vs Empty → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Error vs Empty:** Failure and no-value are different contracts.


---

<!-- 086_RETRY_SIDE_EFFECTS.md -->

# Retry Side Effects

## What / Why
Retry can repeat non-idempotent work.

## Mental Model
```text
Retry Side Effects → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Retry Side Effects:** Retry can repeat non-idempotent work.


---

<!-- 087_BACKPRESSURE_MENTAL_MODEL.md -->

# Backpressure Mental Model

## What / Why
Demand flows upstream while data flows downstream.

## Mental Model
```text
Backpressure Mental Model → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Backpressure Mental Model:** Demand flows upstream while data flows downstream.


---

<!-- 088_UNBOUNDED_DEMAND.md -->

# Unbounded Demand

## What / Why
Long.MAX_VALUE requests effectively everything.

## Mental Model
```text
Unbounded Demand → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Unbounded Demand:** Long.MAX_VALUE requests effectively everything.


---

<!-- 089_DEMAND_RESHAPING.md -->

# Demand Reshaping

## What / Why
Operators may prefetch/multiply request patterns.

## Mental Model
```text
Demand Reshaping → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Demand Reshaping:** Operators may prefetch/multiply request patterns.


---

<!-- 090_PREFETCH.md -->

# Prefetch

## What / Why
Operators request ahead for throughput.

## Mental Model
```text
Prefetch → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Prefetch:** Operators request ahead for throughput.


---

<!-- 091_LIMITRATE.md -->

# limitRate

## What / Why
Break demand into smaller upstream batches.

## Mental Model
```text
limitRate → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **limitRate:** Break demand into smaller upstream batches.


---

<!-- 092_ONBACKPRESSUREBUFFER.md -->

# onBackpressureBuffer

## What / Why
Buffer excess elements.

## Mental Model
```text
onBackpressureBuffer → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onBackpressureBuffer:** Buffer excess elements.


---

<!-- 093_ONBACKPRESSUREDROP.md -->

# onBackpressureDrop

## What / Why
Drop excess elements.

## Mental Model
```text
onBackpressureDrop → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onBackpressureDrop:** Drop excess elements.


---

<!-- 094_ONBACKPRESSURELATEST.md -->

# onBackpressureLatest

## What / Why
Keep newest element under pressure.

## Mental Model
```text
onBackpressureLatest → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onBackpressureLatest:** Keep newest element under pressure.


---

<!-- 095_ONBACKPRESSUREERROR.md -->

# onBackpressureError

## What / Why
Fail on overflow.

## Mental Model
```text
onBackpressureError → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onBackpressureError:** Fail on overflow.


---

<!-- 096_BOUNDED_BUFFER.md -->

# Bounded Buffer

## What / Why
Prevent OOM under slow consumers.

## Mental Model
```text
Bounded Buffer → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Bounded Buffer:** Prevent OOM under slow consumers.


---

<!-- 097_BACKPRESSURE_VS_RATE_LIMITING.md -->

# Backpressure vs Rate Limiting

## What / Why
Flow control is not admission policy.

## Mental Model
```text
Backpressure vs Rate Limiting → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Backpressure vs Rate Limiting:** Flow control is not admission policy.


---

<!-- 098_NETWORK_BACKPRESSURE.md -->

# Network Backpressure

## What / Why
Remote protocols may not fully honor Reactor demand.

## Mental Model
```text
Network Backpressure → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Network Backpressure:** Remote protocols may not fully honor Reactor demand.


---

<!-- 099_DATABASE_BACKPRESSURE.md -->

# Database Backpressure

## What / Why
Driver/database buffers still impose real limits.

## Mental Model
```text
Database Backpressure → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Database Backpressure:** Driver/database buffers still impose real limits.


---

<!-- 100_SCHEDULER.md -->

# Scheduler

## What / Why
Execution abstraction for reactive work.

## Mental Model
```text
Scheduler → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Scheduler:** Execution abstraction for reactive work.


---

<!-- 101_SCHEDULERS_IMMEDIATE.md -->

# Schedulers immediate

## What / Why
Execute on caller thread.

## Mental Model
```text
Schedulers immediate → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Schedulers immediate:** Execute on caller thread.


---

<!-- 102_SCHEDULERS_SINGLE.md -->

# Schedulers single

## What / Why
Single reusable worker.

## Mental Model
```text
Schedulers single → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Schedulers single:** Single reusable worker.


---

<!-- 103_SCHEDULERS_PARALLEL.md -->

# Schedulers parallel

## What / Why
Fixed pool for CPU-bound non-blocking work.

## Mental Model
```text
Schedulers parallel → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Schedulers parallel:** Fixed pool for CPU-bound non-blocking work.


---

<!-- 104_SCHEDULERS_BOUNDEDELASTIC.md -->

# Schedulers boundedElastic

## What / Why
Bounded pool for legacy blocking boundaries.

## Mental Model
```text
Schedulers boundedElastic → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Schedulers boundedElastic:** Bounded pool for legacy blocking boundaries.


---

<!-- 105_VIRTUAL_THREAD_BOUNDEDELASTIC.md -->

# Virtual Thread boundedElastic

## What / Why
Modern Reactor can integrate virtual-thread-backed boundedElastic modes when enabled.

## Mental Model
```text
Virtual Thread boundedElastic → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Virtual Thread boundedElastic:** Modern Reactor can integrate virtual-thread-backed boundedElastic modes when enabled.


---

<!-- 106_PUBLISHON.md -->

# publishOn

## What / Why
Moves downstream execution.

## Mental Model
```text
publishOn → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **publishOn:** Moves downstream execution.


---

<!-- 107_SUBSCRIBEON.md -->

# subscribeOn

## What / Why
Moves source subscription/execution.

## Mental Model
```text
subscribeOn → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **subscribeOn:** Moves source subscription/execution.


---

<!-- 108_PUBLISHON_PLACEMENT.md -->

# publishOn Placement

## What / Why
Only downstream operators move.

## Mental Model
```text
publishOn Placement → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **publishOn Placement:** Only downstream operators move.


---

<!-- 109_SUBSCRIBEON_PLACEMENT.md -->

# subscribeOn Placement

## What / Why
Controls source side regardless of textual position.

## Mental Model
```text
subscribeOn Placement → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **subscribeOn Placement:** Controls source side regardless of textual position.


---

<!-- 110_EVENT_LOOP.md -->

# Event Loop

## What / Why
Few threads serve many non-blocking sockets.

## Mental Model
```text
Event Loop → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Event Loop:** Few threads serve many non-blocking sockets.


---

<!-- 111_CPU_WORK.md -->

# CPU Work

## What / Why
Do not monopolize Netty event loops.

## Mental Model
```text
CPU Work → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **CPU Work:** Do not monopolize Netty event loops.


---

<!-- 112_BLOCKING_WORK.md -->

# Blocking Work

## What / Why
Isolate unavoidable blocking calls.

## Mental Model
```text
Blocking Work → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Blocking Work:** Isolate unavoidable blocking calls.


---

<!-- 113_THREADLOCAL_TRAP.md -->

# ThreadLocal Trap

## What / Why
Reactive work may hop threads.

## Mental Model
```text
ThreadLocal Trap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ThreadLocal Trap:** Reactive work may hop threads.


---

<!-- 114_PARALLELFLUX.md -->

# ParallelFlux

## What / Why
Parallel rail abstraction.

## Mental Model
```text
ParallelFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ParallelFlux:** Parallel rail abstraction.


---

<!-- 115_PARALLEL.md -->

# parallel

## What / Why
Split sequence into rails.

## Mental Model
```text
parallel → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **parallel:** Split sequence into rails.


---

<!-- 116_RUNON.md -->

# runOn

## What / Why
Assign rails to Scheduler.

## Mental Model
```text
runOn → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **runOn:** Assign rails to Scheduler.


---

<!-- 117_SEQUENTIAL.md -->

# sequential

## What / Why
Merge rails back to Flux.

## Mental Model
```text
sequential → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **sequential:** Merge rails back to Flux.


---

<!-- 118_REACTOR_CONTEXT.md -->

# Reactor Context

## What / Why
Immutable subscriber-scoped key/value state.

## Mental Model
```text
Reactor Context → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactor Context:** Immutable subscriber-scoped key/value state.


---

<!-- 119_CONTEXTVIEW.md -->

# ContextView

## What / Why
Read-only Context.

## Mental Model
```text
ContextView → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ContextView:** Read-only Context.


---

<!-- 120_CONTEXTWRITE.md -->

# contextWrite

## What / Why
Write context for upstream visibility.

## Mental Model
```text
contextWrite → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **contextWrite:** Write context for upstream visibility.


---

<!-- 121_DEFERCONTEXTUAL.md -->

# deferContextual

## What / Why
Read context at subscription time.

## Mental Model
```text
deferContextual → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **deferContextual:** Read context at subscription time.


---

<!-- 122_CONTEXT_DIRECTION.md -->

# Context Direction

## What / Why
Context propagates from subscriber toward upstream.

## Mental Model
```text
Context Direction → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Context Direction:** Context propagates from subscriber toward upstream.


---

<!-- 123_CONTEXT_VS_THREADLOCAL.md -->

# Context vs ThreadLocal

## What / Why
Context follows subscription, not thread.

## Mental Model
```text
Context vs ThreadLocal → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Context vs ThreadLocal:** Context follows subscription, not thread.


---

<!-- 124_CORRELATION_ID.md -->

# Correlation ID

## What / Why
Context can carry correlation metadata.

## Mental Model
```text
Correlation ID → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Correlation ID:** Context can carry correlation metadata.


---

<!-- 125_SECURITY_CONTEXT.md -->

# Security Context

## What / Why
Reactive Spring Security stores Authentication in Context.

## Mental Model
```text
Security Context → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Security Context:** Reactive Spring Security stores Authentication in Context.


---

<!-- 126_CONTEXT_PROPAGATION.md -->

# Context Propagation

## What / Why
Micrometer can bridge selected ThreadLocal values.

## Mental Model
```text
Context Propagation → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Context Propagation:** Micrometer can bridge selected ThreadLocal values.


---

<!-- 127_AUTOMATIC_CONTEXT_PROPAGATION.md -->

# Automatic Context Propagation

## What / Why
Reactor integration can propagate context automatically when enabled.

## Mental Model
```text
Automatic Context Propagation → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Automatic Context Propagation:** Reactor integration can propagate context automatically when enabled.


---

<!-- 128_SHARE.md -->

# share

## What / Why
Multicast a source while subscribers are present.

## Mental Model
```text
share → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **share:** Multicast a source while subscribers are present.


---

<!-- 129_PUBLISH_CONNECTABLEFLUX.md -->

# publish ConnectableFlux

## What / Why
Controlled multicasting.

## Mental Model
```text
publish ConnectableFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **publish ConnectableFlux:** Controlled multicasting.


---

<!-- 130_REPLAY.md -->

# replay

## What / Why
Replay past signals to late subscribers.

## Mental Model
```text
replay → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **replay:** Replay past signals to late subscribers.


---

<!-- 131_CACHE.md -->

# cache

## What / Why
Cache signals for later subscribers.

## Mental Model
```text
cache → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **cache:** Cache signals for later subscribers.


---

<!-- 132_AUTOCONNECT.md -->

# autoConnect

## What / Why
Connect after N subscribers.

## Mental Model
```text
autoConnect → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **autoConnect:** Connect after N subscribers.


---

<!-- 133_REFCOUNT.md -->

# refCount

## What / Why
Connect/disconnect based on subscriber count.

## Mental Model
```text
refCount → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **refCount:** Connect/disconnect based on subscriber count.


---

<!-- 134_REPLAY_MEMORY_RISK.md -->

# Replay Memory Risk

## What / Why
Unbounded replay/cache retains history.

## Mental Model
```text
Replay Memory Risk → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Replay Memory Risk:** Unbounded replay/cache retains history.


---

<!-- 135_SINKS_ONE.md -->

# Sinks One

## What / Why
Programmatic single-result sink.

## Mental Model
```text
Sinks One → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Sinks One:** Programmatic single-result sink.


---

<!-- 136_SINKS_MANY.md -->

# Sinks Many

## What / Why
Programmatic multi-value sink.

## Mental Model
```text
Sinks Many → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Sinks Many:** Programmatic multi-value sink.


---

<!-- 137_SINKS_UNICAST.md -->

# Sinks unicast

## What / Why
One subscriber.

## Mental Model
```text
Sinks unicast → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Sinks unicast:** One subscriber.


---

<!-- 138_SINKS_MULTICAST.md -->

# Sinks multicast

## What / Why
Current subscribers.

## Mental Model
```text
Sinks multicast → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Sinks multicast:** Current subscribers.


---

<!-- 139_SINKS_REPLAY.md -->

# Sinks replay

## What / Why
Replay to late subscribers.

## Mental Model
```text
Sinks replay → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Sinks replay:** Replay to late subscribers.


---

<!-- 140_TRYEMITNEXT.md -->

# tryEmitNext

## What / Why
Attempt emission and return EmitResult.

## Mental Model
```text
tryEmitNext → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **tryEmitNext:** Attempt emission and return EmitResult.


---

<!-- 141_EMITNEXT.md -->

# emitNext

## What / Why
Emit with failure handler.

## Mental Model
```text
emitNext → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **emitNext:** Emit with failure handler.


---

<!-- 142_SINK_SERIALIZATION.md -->

# Sink Serialization

## What / Why
Concurrent emitters must respect serialization.

## Mental Model
```text
Sink Serialization → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Sink Serialization:** Concurrent emitters must respect serialization.


---

<!-- 143_CHECKPOINT.md -->

# checkpoint

## What / Why
Targeted assembly marker.

## Mental Model
```text
checkpoint → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **checkpoint:** Targeted assembly marker.


---

<!-- 144_HOOKS_ONOPERATORDEBUG.md -->

# Hooks onOperatorDebug

## What / Why
Global assembly tracing with overhead.

## Mental Model
```text
Hooks onOperatorDebug → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Hooks onOperatorDebug:** Global assembly tracing with overhead.


---

<!-- 145_REACTORDEBUGAGENT.md -->

# ReactorDebugAgent

## What / Why
Bytecode-assisted operator debugging.

## Mental Model
```text
ReactorDebugAgent → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ReactorDebugAgent:** Bytecode-assisted operator debugging.


---

<!-- 146_LOG_OPERATOR.md -->

# log operator

## What / Why
Log Reactive Streams signals.

## Mental Model
```text
log operator → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **log operator:** Log Reactive Streams signals.


---

<!-- 147_DOONREQUEST.md -->

# doOnRequest

## What / Why
Observe demand.

## Mental Model
```text
doOnRequest → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **doOnRequest:** Observe demand.


---

<!-- 148_DOFINALLY.md -->

# doFinally

## What / Why
Observe complete/error/cancel termination.

## Mental Model
```text
doFinally → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **doFinally:** Observe complete/error/cancel termination.


---

<!-- 149_BLOCKHOUND.md -->

# BlockHound

## What / Why
Detect blocking calls on non-blocking threads.

## Mental Model
```text
BlockHound → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **BlockHound:** Detect blocking calls on non-blocking threads.


---

<!-- 150_REACTOR_TEST.md -->

# reactor-test

## What / Why
Testing module.

## Mental Model
```text
reactor-test → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **reactor-test:** Testing module.


---

<!-- 151_STEPVERIFIER.md -->

# StepVerifier

## What / Why
Assert publisher signals declaratively.

## Mental Model
```text
StepVerifier → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **StepVerifier:** Assert publisher signals declaratively.


---

<!-- 152_THENREQUEST.md -->

# thenRequest

## What / Why
Drive demand in tests.

## Mental Model
```text
thenRequest → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **thenRequest:** Drive demand in tests.


---

<!-- 153_WITHVIRTUALTIME.md -->

# withVirtualTime

## What / Why
Test time-based publishers quickly.

## Mental Model
```text
withVirtualTime → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **withVirtualTime:** Test time-based publishers quickly.


---

<!-- 154_VIRTUALTIMESCHEDULER.md -->

# VirtualTimeScheduler

## What / Why
Virtual clock.

## Mental Model
```text
VirtualTimeScheduler → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **VirtualTimeScheduler:** Virtual clock.


---

<!-- 155_TESTPUBLISHER.md -->

# TestPublisher

## What / Why
Controlled source for edge cases.

## Mental Model
```text
TestPublisher → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **TestPublisher:** Controlled source for edge cases.


---

<!-- 156_PUBLISHERPROBE.md -->

# PublisherProbe

## What / Why
Assert branch subscription/request/cancellation.

## Mental Model
```text
PublisherProbe → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **PublisherProbe:** Assert branch subscription/request/cancellation.


---

<!-- 157_CONTEXT_EXPECTATIONS.md -->

# Context Expectations

## What / Why
Verify Reactor Context.

## Mental Model
```text
Context Expectations → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Context Expectations:** Verify Reactor Context.


---

<!-- 158_SPRING_WEBFLUX.md -->

# Spring WebFlux

## What / Why
Reactive Spring web stack.

## Mental Model
```text
Spring WebFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Spring WebFlux:** Reactive Spring web stack.


---

<!-- 159_WEBFLUX_VS_MVC.md -->

# WebFlux vs MVC

## What / Why
Reactive non-blocking vs Servlet imperative stack.

## Mental Model
```text
WebFlux vs MVC → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebFlux vs MVC:** Reactive non-blocking vs Servlet imperative stack.


---

<!-- 160_DISPATCHERHANDLER.md -->

# DispatcherHandler

## What / Why
Reactive request dispatcher.

## Mental Model
```text
DispatcherHandler → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **DispatcherHandler:** Reactive request dispatcher.


---

<!-- 161_HANDLERMAPPING.md -->

# HandlerMapping

## What / Why
Find handler.

## Mental Model
```text
HandlerMapping → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HandlerMapping:** Find handler.


---

<!-- 162_HANDLERADAPTER.md -->

# HandlerAdapter

## What / Why
Invoke handler.

## Mental Model
```text
HandlerAdapter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HandlerAdapter:** Invoke handler.


---

<!-- 163_HANDLERRESULTHANDLER.md -->

# HandlerResultHandler

## What / Why
Render/write handler result.

## Mental Model
```text
HandlerResultHandler → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HandlerResultHandler:** Render/write handler result.


---

<!-- 164_SERVERWEBEXCHANGE.md -->

# ServerWebExchange

## What / Why
Reactive HTTP request-response exchange.

## Mental Model
```text
ServerWebExchange → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ServerWebExchange:** Reactive HTTP request-response exchange.


---

<!-- 165_SERVERHTTPREQUEST.md -->

# ServerHttpRequest

## What / Why
Reactive request abstraction.

## Mental Model
```text
ServerHttpRequest → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ServerHttpRequest:** Reactive request abstraction.


---

<!-- 166_SERVERHTTPRESPONSE.md -->

# ServerHttpResponse

## What / Why
Reactive response abstraction.

## Mental Model
```text
ServerHttpResponse → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ServerHttpResponse:** Reactive response abstraction.


---

<!-- 167_WEBFILTER.md -->

# WebFilter

## What / Why
Reactive interceptor.

## Mental Model
```text
WebFilter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebFilter:** Reactive interceptor.


---

<!-- 168_WEBFILTERCHAIN.md -->

# WebFilterChain

## What / Why
Remaining filter chain.

## Mental Model
```text
WebFilterChain → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebFilterChain:** Remaining filter chain.


---

<!-- 169_WEBEXCEPTIONHANDLER.md -->

# WebExceptionHandler

## What / Why
Reactive global error hook.

## Mental Model
```text
WebExceptionHandler → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebExceptionHandler:** Reactive global error hook.


---

<!-- 170_WEBSESSION.md -->

# WebSession

## What / Why
Reactive session abstraction.

## Mental Model
```text
WebSession → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebSession:** Reactive session abstraction.


---

<!-- 171_CODECCONFIGURER.md -->

# CodecConfigurer

## What / Why
HTTP codec configuration.

## Mental Model
```text
CodecConfigurer → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **CodecConfigurer:** HTTP codec configuration.


---

<!-- 172_DATABUFFER.md -->

# DataBuffer

## What / Why
Low-level bytes abstraction.

## Mental Model
```text
DataBuffer → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **DataBuffer:** Low-level bytes abstraction.


---

<!-- 173_DATABUFFERUTILS.md -->

# DataBufferUtils

## What / Why
DataBuffer lifecycle utilities.

## Mental Model
```text
DataBufferUtils → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **DataBufferUtils:** DataBuffer lifecycle utilities.


---

<!-- 174_DATABUFFER_LEAK.md -->

# DataBuffer Leak

## What / Why
Manual pooled buffers require correct release.

## Mental Model
```text
DataBuffer Leak → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **DataBuffer Leak:** Manual pooled buffers require correct release.


---

<!-- 175_REACTOR_NETTY_SERVER.md -->

# Reactor Netty Server

## What / Why
Common WebFlux server runtime.

## Mental Model
```text
Reactor Netty Server → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactor Netty Server:** Common WebFlux server runtime.


---

<!-- 176_WEBFLUX_ON_SERVLET.md -->

# WebFlux on Servlet

## What / Why
WebFlux can run through supported non-blocking servlet adapters.

## Mental Model
```text
WebFlux on Servlet → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebFlux on Servlet:** WebFlux can run through supported non-blocking servlet adapters.


---

<!-- 177_RESTCONTROLLER_WEBFLUX.md -->

# @RestController WebFlux

## What / Why
Annotated reactive controller.

## Mental Model
```text
@RestController WebFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **@RestController WebFlux:** Annotated reactive controller.


---

<!-- 178_REQUESTBODY_MONO.md -->

# @RequestBody Mono

## What / Why
Decode one async body.

## Mental Model
```text
@RequestBody Mono → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **@RequestBody Mono:** Decode one async body.


---

<!-- 179_REQUESTBODY_FLUX.md -->

# @RequestBody Flux

## What / Why
Decode streaming/multi body.

## Mental Model
```text
@RequestBody Flux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **@RequestBody Flux:** Decode streaming/multi body.


---

<!-- 180_RESPONSEBODY_FLUX.md -->

# @ResponseBody Flux

## What / Why
Stream response where media type supports it.

## Mental Model
```text
@ResponseBody Flux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **@ResponseBody Flux:** Stream response where media type supports it.


---

<!-- 181_MONO_VOID_HANDLER.md -->

# Mono<Void> Handler

## What / Why
Completion-only async response.

## Mental Model
```text
Mono<Void> Handler → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Mono<Void> Handler:** Completion-only async response.


---

<!-- 182_VALIDATION_WEBFLUX.md -->

# Validation WebFlux

## What / Why
Bean validation with reactive error flow.

## Mental Model
```text
Validation WebFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Validation WebFlux:** Bean validation with reactive error flow.


---

<!-- 183_ROUTERFUNCTION.md -->

# RouterFunction

## What / Why
Functional route tree.

## Mental Model
```text
RouterFunction → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **RouterFunction:** Functional route tree.


---

<!-- 184_REQUESTPREDICATE.md -->

# RequestPredicate

## What / Why
Functional route matcher.

## Mental Model
```text
RequestPredicate → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **RequestPredicate:** Functional route matcher.


---

<!-- 185_HANDLERFUNCTION.md -->

# HandlerFunction

## What / Why
ServerRequest to Mono<ServerResponse>.

## Mental Model
```text
HandlerFunction → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HandlerFunction:** ServerRequest to Mono<ServerResponse>.


---

<!-- 186_SERVERREQUEST.md -->

# ServerRequest

## What / Why
Functional request abstraction.

## Mental Model
```text
ServerRequest → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ServerRequest:** Functional request abstraction.


---

<!-- 187_SERVERRESPONSE.md -->

# ServerResponse

## What / Why
Functional response builder.

## Mental Model
```text
ServerResponse → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ServerResponse:** Functional response builder.


---

<!-- 188_NESTED_ROUTES.md -->

# Nested Routes

## What / Why
Group functional routes.

## Mental Model
```text
Nested Routes → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Nested Routes:** Group functional routes.


---

<!-- 189_HANDLERFILTERFUNCTION.md -->

# HandlerFilterFunction

## What / Why
Functional route filter.

## Mental Model
```text
HandlerFilterFunction → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HandlerFilterFunction:** Functional route filter.


---

<!-- 190_ANNOTATED_VS_FUNCTIONAL.md -->

# Annotated vs Functional

## What / Why
Different programming styles over same reactive web core.

## Mental Model
```text
Annotated vs Functional → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Annotated vs Functional:** Different programming styles over same reactive web core.


---

<!-- 191_HTTPMESSAGEREADER.md -->

# HttpMessageReader

## What / Why
Decode request body.

## Mental Model
```text
HttpMessageReader → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HttpMessageReader:** Decode request body.


---

<!-- 192_HTTPMESSAGEWRITER.md -->

# HttpMessageWriter

## What / Why
Encode response body.

## Mental Model
```text
HttpMessageWriter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HttpMessageWriter:** Encode response body.


---

<!-- 193_JACKSON_CODEC.md -->

# Jackson Codec

## What / Why
JSON encoding/decoding.

## Mental Model
```text
Jackson Codec → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Jackson Codec:** JSON encoding/decoding.


---

<!-- 194_SSE.md -->

# SSE

## What / Why
Server-to-client text/event-stream.

## Mental Model
```text
SSE → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **SSE:** Server-to-client text/event-stream.


---

<!-- 195_SERVERSENTEVENT.md -->

# ServerSentEvent

## What / Why
Typed SSE event.

## Mental Model
```text
ServerSentEvent → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ServerSentEvent:** Typed SSE event.


---

<!-- 196_NDJSON.md -->

# NDJSON

## What / Why
Newline-delimited JSON streaming.

## Mental Model
```text
NDJSON → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **NDJSON:** Newline-delimited JSON streaming.


---

<!-- 197_MULTIPART_WEBFLUX.md -->

# Multipart WebFlux

## What / Why
Reactive multipart support.

## Mental Model
```text
Multipart WebFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Multipart WebFlux:** Reactive multipart support.


---

<!-- 198_FILEPART.md -->

# FilePart

## What / Why
Reactive file upload part.

## Mental Model
```text
FilePart → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **FilePart:** Reactive file upload part.


---

<!-- 199_STREAMING_UPLOAD.md -->

# Streaming Upload

## What / Why
Process DataBuffers without full aggregation.

## Mental Model
```text
Streaming Upload → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Streaming Upload:** Process DataBuffers without full aggregation.


---

<!-- 200_MAXINMEMORYSIZE.md -->

# maxInMemorySize

## What / Why
Codec aggregation memory cap.

## Mental Model
```text
maxInMemorySize → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **maxInMemorySize:** Codec aggregation memory cap.


---

<!-- 201_DATABUFFERLIMITEXCEPTION.md -->

# DataBufferLimitException

## What / Why
Exceeded in-memory codec limit.

## Mental Model
```text
DataBufferLimitException → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **DataBufferLimitException:** Exceeded in-memory codec limit.


---

<!-- 202_STREAMING_FRAMING.md -->

# Streaming Framing

## What / Why
Streaming formats need boundaries such as SSE/NDJSON.

## Mental Model
```text
Streaming Framing → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Streaming Framing:** Streaming formats need boundaries such as SSE/NDJSON.


---

<!-- 203_WEBCLIENT.md -->

# WebClient

## What / Why
Reactive non-blocking HTTP client.

## Mental Model
```text
WebClient → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient:** Reactive non-blocking HTTP client.


---

<!-- 204_WEBCLIENT_BUILDER.md -->

# WebClient Builder

## What / Why
Reusable client configuration.

## Mental Model
```text
WebClient Builder → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient Builder:** Reusable client configuration.


---

<!-- 205_BASEURL.md -->

# baseUrl

## What / Why
Common endpoint prefix.

## Mental Model
```text
baseUrl → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **baseUrl:** Common endpoint prefix.


---

<!-- 206_EXCHANGEFILTERFUNCTION.md -->

# ExchangeFilterFunction

## What / Why
Client request/response filter.

## Mental Model
```text
ExchangeFilterFunction → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ExchangeFilterFunction:** Client request/response filter.


---

<!-- 207_RETRIEVE.md -->

# retrieve

## What / Why
High-level response extraction.

## Mental Model
```text
retrieve → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **retrieve:** High-level response extraction.


---

<!-- 208_EXCHANGETOMONO.md -->

# exchangeToMono

## What / Why
Explicit response mapping to Mono.

## Mental Model
```text
exchangeToMono → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **exchangeToMono:** Explicit response mapping to Mono.


---

<!-- 209_EXCHANGETOFLUX.md -->

# exchangeToFlux

## What / Why
Explicit response streaming.

## Mental Model
```text
exchangeToFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **exchangeToFlux:** Explicit response streaming.


---

<!-- 210_BODYTOMONO.md -->

# bodyToMono

## What / Why
Decode one response value.

## Mental Model
```text
bodyToMono → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **bodyToMono:** Decode one response value.


---

<!-- 211_BODYTOFLUX.md -->

# bodyToFlux

## What / Why
Decode response stream.

## Mental Model
```text
bodyToFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **bodyToFlux:** Decode response stream.


---

<!-- 212_ONSTATUS.md -->

# onStatus

## What / Why
Map error HTTP statuses.

## Mental Model
```text
onStatus → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **onStatus:** Map error HTTP statuses.


---

<!-- 213_REQUEST_BODY_PUBLISHER.md -->

# Request Body Publisher

## What / Why
Send reactive request body.

## Mental Model
```text
Request Body Publisher → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Request Body Publisher:** Send reactive request body.


---

<!-- 214_WEBCLIENT_SSE.md -->

# WebClient SSE

## What / Why
Consume event-stream.

## Mental Model
```text
WebClient SSE → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient SSE:** Consume event-stream.


---

<!-- 215_WEBCLIENT_TIMEOUT.md -->

# WebClient Timeout

## What / Why
Set connection/response/read/write budgets.

## Mental Model
```text
WebClient Timeout → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient Timeout:** Set connection/response/read/write budgets.


---

<!-- 216_WEBCLIENT_RETRY.md -->

# WebClient Retry

## What / Why
Retry only safe transient failures.

## Mental Model
```text
WebClient Retry → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient Retry:** Retry only safe transient failures.


---

<!-- 217_WEBCLIENT_CONNECTION_POOL.md -->

# WebClient Connection Pool

## What / Why
Reuse outbound connections.

## Mental Model
```text
WebClient Connection Pool → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient Connection Pool:** Reuse outbound connections.


---

<!-- 218_WEBCLIENT_TLS.md -->

# WebClient TLS

## What / Why
Configure transport security.

## Mental Model
```text
WebClient TLS → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient TLS:** Configure transport security.


---

<!-- 219_WEBCLIENT_PROXY.md -->

# WebClient Proxy

## What / Why
Configure outbound proxy.

## Mental Model
```text
WebClient Proxy → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient Proxy:** Configure outbound proxy.


---

<!-- 220_WEBCLIENT_CONTEXT.md -->

# WebClient Context

## What / Why
Use Reactor Context in filters.

## Mental Model
```text
WebClient Context → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient Context:** Use Reactor Context in filters.


---

<!-- 221_WEBCLIENT_BLOCKING_TRAP.md -->

# WebClient Blocking Trap

## What / Why
block() on event-loop threads is dangerous.

## Mental Model
```text
WebClient Blocking Trap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient Blocking Trap:** block() on event-loop threads is dangerous.


---

<!-- 222_HTTP_SERVICE_INTERFACE.md -->

# HTTP Service Interface

## What / Why
Declarative Spring HTTP client interface.

## Mental Model
```text
HTTP Service Interface → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HTTP Service Interface:** Declarative Spring HTTP client interface.


---

<!-- 223_HTTPEXCHANGE.md -->

# @HttpExchange

## What / Why
Declare service method.

## Mental Model
```text
@HttpExchange → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **@HttpExchange:** Declare service method.


---

<!-- 224_GETEXCHANGE.md -->

# @GetExchange

## What / Why
Declare GET.

## Mental Model
```text
@GetExchange → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **@GetExchange:** Declare GET.


---

<!-- 225_POSTEXCHANGE.md -->

# @PostExchange

## What / Why
Declare POST.

## Mental Model
```text
@PostExchange → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **@PostExchange:** Declare POST.


---

<!-- 226_HTTPSERVICEPROXYFACTORY.md -->

# HttpServiceProxyFactory

## What / Why
Create interface proxy.

## Mental Model
```text
HttpServiceProxyFactory → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HttpServiceProxyFactory:** Create interface proxy.


---

<!-- 227_WEBCLIENTADAPTER.md -->

# WebClientAdapter

## What / Why
Back HTTP interface with WebClient.

## Mental Model
```text
WebClientAdapter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClientAdapter:** Back HTTP interface with WebClient.


---

<!-- 228_REACTIVE_HTTP_INTERFACE.md -->

# Reactive HTTP Interface

## What / Why
Mono/Flux return types maintain non-blocking flow.

## Mental Model
```text
Reactive HTTP Interface → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive HTTP Interface:** Mono/Flux return types maintain non-blocking flow.


---

<!-- 229_REACTOR_NETTY.md -->

# Reactor Netty

## What / Why
Reactive network runtime.

## Mental Model
```text
Reactor Netty → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactor Netty:** Reactive network runtime.


---

<!-- 230_EVENT_LOOP_RESOURCES.md -->

# Event Loop Resources

## What / Why
Small event-loop thread pool.

## Mental Model
```text
Event Loop Resources → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Event Loop Resources:** Small event-loop thread pool.


---

<!-- 231_CONNECTIONPROVIDER.md -->

# ConnectionProvider

## What / Why
Outbound connection-pool configuration.

## Mental Model
```text
ConnectionProvider → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ConnectionProvider:** Outbound connection-pool configuration.


---

<!-- 232_MAX_CONNECTIONS.md -->

# Max Connections

## What / Why
Bound active connections.

## Mental Model
```text
Max Connections → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Max Connections:** Bound active connections.


---

<!-- 233_PENDING_ACQUIRE.md -->

# Pending Acquire

## What / Why
Wait queue for connection slot.

## Mental Model
```text
Pending Acquire → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Pending Acquire:** Wait queue for connection slot.


---

<!-- 234_PENDING_ACQUIRE_TIMEOUT.md -->

# Pending Acquire Timeout

## What / Why
Bound pool wait.

## Mental Model
```text
Pending Acquire Timeout → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Pending Acquire Timeout:** Bound pool wait.


---

<!-- 235_MAX_IDLE_TIME.md -->

# Max Idle Time

## What / Why
Recycle idle connections.

## Mental Model
```text
Max Idle Time → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Max Idle Time:** Recycle idle connections.


---

<!-- 236_MAX_LIFE_TIME.md -->

# Max Life Time

## What / Why
Recycle aged connections.

## Mental Model
```text
Max Life Time → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Max Life Time:** Recycle aged connections.


---

<!-- 237_CONNECT_TIMEOUT.md -->

# Connect Timeout

## What / Why
TCP connection budget.

## Mental Model
```text
Connect Timeout → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Connect Timeout:** TCP connection budget.


---

<!-- 238_RESPONSE_TIMEOUT.md -->

# Response Timeout

## What / Why
HTTP response budget.

## Mental Model
```text
Response Timeout → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Response Timeout:** HTTP response budget.


---

<!-- 239_WIRETAP.md -->

# Wiretap

## What / Why
Low-level network debug logging.

## Mental Model
```text
Wiretap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Wiretap:** Low-level network debug logging.


---

<!-- 240_NATIVE_TRANSPORT.md -->

# Native Transport

## What / Why
Platform-specific network transport.

## Mental Model
```text
Native Transport → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Native Transport:** Platform-specific network transport.


---

<!-- 241_HTTP2.md -->

# HTTP2

## What / Why
HTTP/2 support under compatible config.

## Mental Model
```text
HTTP2 → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HTTP2:** HTTP/2 support under compatible config.


---

<!-- 242_NETTY_BLOCKING_RULE.md -->

# Netty Blocking Rule

## What / Why
Never block the event loop.

## Mental Model
```text
Netty Blocking Rule → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Netty Blocking Rule:** Never block the event loop.


---

<!-- 243_REACTIVE_WEBSOCKET.md -->

# Reactive WebSocket

## What / Why
Full-duplex message channel.

## Mental Model
```text
Reactive WebSocket → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive WebSocket:** Full-duplex message channel.


---

<!-- 244_WEBSOCKETHANDLER.md -->

# WebSocketHandler

## What / Why
Reactive WebSocket handler.

## Mental Model
```text
WebSocketHandler → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebSocketHandler:** Reactive WebSocket handler.


---

<!-- 245_WEBSOCKETSESSION.md -->

# WebSocketSession

## What / Why
Send/receive reactive frames.

## Mental Model
```text
WebSocketSession → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebSocketSession:** Send/receive reactive frames.


---

<!-- 246_SSE_VS_WEBSOCKET.md -->

# SSE vs WebSocket

## What / Why
One-way HTTP stream vs full duplex.

## Mental Model
```text
SSE vs WebSocket → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **SSE vs WebSocket:** One-way HTTP stream vs full duplex.


---

<!-- 247_WEBSOCKET_BACKPRESSURE_CAVEAT.md -->

# WebSocket Backpressure Caveat

## What / Why
Protocol itself has no Reactive Streams demand.

## Mental Model
```text
WebSocket Backpressure Caveat → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebSocket Backpressure Caveat:** Protocol itself has no Reactive Streams demand.


---

<!-- 248_RSOCKET.md -->

# RSocket

## What / Why
Reactive binary protocol.

## Mental Model
```text
RSocket → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **RSocket:** Reactive binary protocol.


---

<!-- 249_RSOCKET_REQUEST_RESPONSE.md -->

# RSocket request-response

## What / Why
1 request, 1 response.

## Mental Model
```text
RSocket request-response → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **RSocket request-response:** 1 request, 1 response.


---

<!-- 250_RSOCKET_REQUEST_STREAM.md -->

# RSocket request-stream

## What / Why
1 request, stream response.

## Mental Model
```text
RSocket request-stream → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **RSocket request-stream:** 1 request, stream response.


---

<!-- 251_RSOCKET_CHANNEL.md -->

# RSocket channel

## What / Why
Bidirectional streams.

## Mental Model
```text
RSocket channel → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **RSocket channel:** Bidirectional streams.


---

<!-- 252_RSOCKETREQUESTER.md -->

# RSocketRequester

## What / Why
Spring RSocket client.

## Mental Model
```text
RSocketRequester → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **RSocketRequester:** Spring RSocket client.


---

<!-- 253_RSOCKET_FLOW_CONTROL.md -->

# RSocket Flow Control

## What / Why
Protocol supports reactive demand semantics.

## Mental Model
```text
RSocket Flow Control → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **RSocket Flow Control:** Protocol supports reactive demand semantics.


---

<!-- 254_R2DBC.md -->

# R2DBC

## What / Why
Reactive relational database connectivity.

## Mental Model
```text
R2DBC → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **R2DBC:** Reactive relational database connectivity.


---

<!-- 255_CONNECTIONFACTORY.md -->

# ConnectionFactory

## What / Why
Reactive DB connection factory.

## Mental Model
```text
ConnectionFactory → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ConnectionFactory:** Reactive DB connection factory.


---

<!-- 256_DATABASECLIENT.md -->

# DatabaseClient

## What / Why
Spring fluent reactive SQL client.

## Mental Model
```text
DatabaseClient → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **DatabaseClient:** Spring fluent reactive SQL client.


---

<!-- 257_DATABASECLIENT_SQL.md -->

# DatabaseClient sql

## What / Why
Execute SQL reactively.

## Mental Model
```text
DatabaseClient sql → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **DatabaseClient sql:** Execute SQL reactively.


---

<!-- 258_BIND.md -->

# bind

## What / Why
Bind SQL parameters.

## Mental Model
```text
bind → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **bind:** Bind SQL parameters.


---

<!-- 259_MAP_ROWS.md -->

# map rows

## What / Why
Map rows to domain data.

## Mental Model
```text
map rows → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **map rows:** Map rows to domain data.


---

<!-- 260_FETCH_ALL.md -->

# fetch all

## What / Why
Return Flux of mapped rows.

## Mental Model
```text
fetch all → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **fetch all:** Return Flux of mapped rows.


---

<!-- 261_FETCH_ONE.md -->

# fetch one

## What / Why
Return Mono of one row.

## Mental Model
```text
fetch one → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **fetch one:** Return Mono of one row.


---

<!-- 262_ROWSUPDATED.md -->

# rowsUpdated

## What / Why
Get update count.

## Mental Model
```text
rowsUpdated → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **rowsUpdated:** Get update count.


---

<!-- 263_R2DBCTRANSACTIONMANAGER.md -->

# R2dbcTransactionManager

## What / Why
Reactive transaction manager.

## Mental Model
```text
R2dbcTransactionManager → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **R2dbcTransactionManager:** Reactive transaction manager.


---

<!-- 264_REACTIVETRANSACTIONMANAGER.md -->

# ReactiveTransactionManager

## What / Why
General reactive transaction contract.

## Mental Model
```text
ReactiveTransactionManager → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ReactiveTransactionManager:** General reactive transaction contract.


---

<!-- 265_TRANSACTIONALOPERATOR.md -->

# TransactionalOperator

## What / Why
Programmatic reactive transaction boundary.

## Mental Model
```text
TransactionalOperator → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **TransactionalOperator:** Programmatic reactive transaction boundary.


---

<!-- 266_TRANSACTIONAL_REACTIVE.md -->

# @Transactional Reactive

## What / Why
Reactive method transaction with reactive manager.

## Mental Model
```text
@Transactional Reactive → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **@Transactional Reactive:** Reactive method transaction with reactive manager.


---

<!-- 267_REACTOR_CONTEXT_TRANSACTION.md -->

# Reactor Context Transaction

## What / Why
Transaction state follows Reactor Context.

## Mental Model
```text
Reactor Context Transaction → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactor Context Transaction:** Transaction state follows Reactor Context.


---

<!-- 268_COMMIT_ON_COMPLETE.md -->

# Commit on Complete

## What / Why
Successful terminal completion commits.

## Mental Model
```text
Commit on Complete → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Commit on Complete:** Successful terminal completion commits.


---

<!-- 269_ROLLBACK_ON_ERROR.md -->

# Rollback on Error

## What / Why
Error normally rolls back.

## Mental Model
```text
Rollback on Error → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Rollback on Error:** Error normally rolls back.


---

<!-- 270_CANCELLATION_AND_TRANSACTION.md -->

# Cancellation and Transaction

## What / Why
Cancellation triggers cleanup/rollback semantics.

## Mental Model
```text
Cancellation and Transaction → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Cancellation and Transaction:** Cancellation triggers cleanup/rollback semantics.


---

<!-- 271_PARALLEL_TRANSACTION_TRAP.md -->

# Parallel Transaction Trap

## What / Why
Parallel DB work may escape one-connection assumptions.

## Mental Model
```text
Parallel Transaction Trap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Parallel Transaction Trap:** Parallel DB work may escape one-connection assumptions.


---

<!-- 272_JDBC_BLOCKING_TRAP.md -->

# JDBC Blocking Trap

## What / Why
JDBC/JPA on event loop is still blocking.

## Mental Model
```text
JDBC Blocking Trap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **JDBC Blocking Trap:** JDBC/JPA on event loop is still blocking.


---

<!-- 273_R2DBC_POOL.md -->

# R2DBC Pool

## What / Why
Bound reactive DB connection pool.

## Mental Model
```text
R2DBC Pool → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **R2DBC Pool:** Bound reactive DB connection pool.


---

<!-- 274_BLOCKING_BOUNDARY.md -->

# Blocking Boundary

## What / Why
Isolate unavoidable blocking calls.

## Mental Model
```text
Blocking Boundary → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Blocking Boundary:** Isolate unavoidable blocking calls.


---

<!-- 275_FROMCALLABLE_BOUNDEDELASTIC.md -->

# fromCallable boundedElastic

## What / Why
Canonical blocking-call adapter.

## Mental Model
```text
fromCallable boundedElastic → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **fromCallable boundedElastic:** Canonical blocking-call adapter.


---

<!-- 276_SUBSCRIBEON_BOUNDEDELASTIC.md -->

# subscribeOn boundedElastic

## What / Why
Run blocking source on bounded elastic scheduler.

## Mental Model
```text
subscribeOn boundedElastic → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **subscribeOn boundedElastic:** Run blocking source on bounded elastic scheduler.


---

<!-- 277_BLOCKING_REPOSITORY_ADAPTER.md -->

# Blocking Repository Adapter

## What / Why
Migration bridge for imperative repository.

## Mental Model
```text
Blocking Repository Adapter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Blocking Repository Adapter:** Migration bridge for imperative repository.


---

<!-- 278_FILE_IO_BLOCKING.md -->

# File IO Blocking

## What / Why
Traditional java.io blocks.

## Mental Model
```text
File IO Blocking → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **File IO Blocking:** Traditional java.io blocks.


---

<!-- 279_LEGACY_SDK_BLOCKING.md -->

# Legacy SDK Blocking

## What / Why
Vendor SDK may hide blocking calls.

## Mental Model
```text
Legacy SDK Blocking → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Legacy SDK Blocking:** Vendor SDK may hide blocking calls.


---

<!-- 280_THREAD_POOL_EXHAUSTION.md -->

# Thread Pool Exhaustion

## What / Why
Too many blocking tasks still queue.

## Mental Model
```text
Thread Pool Exhaustion → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Thread Pool Exhaustion:** Too many blocking tasks still queue.


---

<!-- 281_BULKHEAD_BLOCKING_WORK.md -->

# Bulkhead Blocking Work

## What / Why
Bound concurrency around blocking dependency.

## Mental Model
```text
Bulkhead Blocking Work → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Bulkhead Blocking Work:** Bound concurrency around blocking dependency.


---

<!-- 282_MIGRATION_TO_NON_BLOCKING.md -->

# Migration to Non Blocking

## What / Why
Replace hottest blocking dependencies first.

## Mental Model
```text
Migration to Non Blocking → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Migration to Non Blocking:** Replace hottest blocking dependencies first.


---

<!-- 283_TIMEOUT_FIRST.md -->

# Timeout First

## What / Why
Bound dependency latency.

## Mental Model
```text
Timeout First → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Timeout First:** Bound dependency latency.


---

<!-- 284_RETRY_POLICY.md -->

# Retry Policy

## What / Why
Retry only transient failures.

## Mental Model
```text
Retry Policy → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Retry Policy:** Retry only transient failures.


---

<!-- 285_EXPONENTIAL_BACKOFF.md -->

# Exponential Backoff

## What / Why
Increase retry delays.

## Mental Model
```text
Exponential Backoff → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Exponential Backoff:** Increase retry delays.


---

<!-- 286_JITTER.md -->

# Jitter

## What / Why
Desynchronize retries.

## Mental Model
```text
Jitter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Jitter:** Desynchronize retries.


---

<!-- 287_CIRCUIT_BREAKER.md -->

# Circuit Breaker

## What / Why
Stop repeated calls to failing dependency.

## Mental Model
```text
Circuit Breaker → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Circuit Breaker:** Stop repeated calls to failing dependency.


---

<!-- 288_BULKHEAD.md -->

# Bulkhead

## What / Why
Bound concurrent dependency use.

## Mental Model
```text
Bulkhead → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Bulkhead:** Bound concurrent dependency use.


---

<!-- 289_RATE_LIMITER.md -->

# Rate Limiter

## What / Why
Admission policy separate from backpressure.

## Mental Model
```text
Rate Limiter → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Rate Limiter:** Admission policy separate from backpressure.


---

<!-- 290_FALLBACK.md -->

# Fallback

## What / Why
Alternate result only if semantics permit.

## Mental Model
```text
Fallback → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Fallback:** Alternate result only if semantics permit.


---

<!-- 291_IDEMPOTENCY.md -->

# Idempotency

## What / Why
Required for side-effecting retries.

## Mental Model
```text
Idempotency → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Idempotency:** Required for side-effecting retries.


---

<!-- 292_OPERATOR_ORDERING_RESILIENCE.md -->

# Operator Ordering Resilience

## What / Why
Timeout/retry/circuit placement changes behavior.

## Mental Model
```text
Operator Ordering Resilience → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Operator Ordering Resilience:** Timeout/retry/circuit placement changes behavior.


---

<!-- 293_RETRY_STORM.md -->

# Retry Storm

## What / Why
Reactive concurrency can amplify retries quickly.

## Mental Model
```text
Retry Storm → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Retry Storm:** Reactive concurrency can amplify retries quickly.


---

<!-- 294_MICROMETER_OBSERVATION.md -->

# Micrometer Observation

## What / Why
Spring observability abstraction.

## Mental Model
```text
Micrometer Observation → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Micrometer Observation:** Spring observability abstraction.


---

<!-- 295_REACTOR_METRICS.md -->

# Reactor Metrics

## What / Why
Instrument reactive pipelines/schedulers.

## Mental Model
```text
Reactor Metrics → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactor Metrics:** Instrument reactive pipelines/schedulers.


---

<!-- 296_TRACE_CONTEXT_PROPAGATION.md -->

# Trace Context Propagation

## What / Why
Propagate tracing through Reactor Context.

## Mental Model
```text
Trace Context Propagation → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Trace Context Propagation:** Propagate tracing through Reactor Context.


---

<!-- 297_MDC_TRAP.md -->

# MDC Trap

## What / Why
ThreadLocal MDC does not automatically follow reactive hops.

## Mental Model
```text
MDC Trap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **MDC Trap:** ThreadLocal MDC does not automatically follow reactive hops.


---

<!-- 298_HTTP_SERVER_METRICS.md -->

# HTTP Server Metrics

## What / Why
Measure latency/status/connections.

## Mental Model
```text
HTTP Server Metrics → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HTTP Server Metrics:** Measure latency/status/connections.


---

<!-- 299_HTTP_CLIENT_METRICS.md -->

# HTTP Client Metrics

## What / Why
Measure remote calls and pool behavior.

## Mental Model
```text
HTTP Client Metrics → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **HTTP Client Metrics:** Measure remote calls and pool behavior.


---

<!-- 300_R2DBC_POOL_METRICS.md -->

# R2DBC Pool Metrics

## What / Why
Track acquire/usage/timeout.

## Mental Model
```text
R2DBC Pool Metrics → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **R2DBC Pool Metrics:** Track acquire/usage/timeout.


---

<!-- 301_REACTIVE_PERFORMANCE_RULE.md -->

# Reactive Performance Rule

## What / Why
Reactive improves concurrency efficiency, not CPU speed.

## Mental Model
```text
Reactive Performance Rule → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive Performance Rule:** Reactive improves concurrency efficiency, not CPU speed.


---

<!-- 302_EVENT_LOOP_SATURATION.md -->

# Event Loop Saturation

## What / Why
Blocking/CPU work harms many requests.

## Mental Model
```text
Event Loop Saturation → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Event Loop Saturation:** Blocking/CPU work harms many requests.


---

<!-- 303_CONNECTION_POOL_SATURATION.md -->

# Connection Pool Saturation

## What / Why
Pool queueing creates latency.

## Mental Model
```text
Connection Pool Saturation → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Connection Pool Saturation:** Pool queueing creates latency.


---

<!-- 304_LITTLE_LAW.md -->

# Little Law

## What / Why
Concurrency roughly throughput times latency.

## Mental Model
```text
Little Law → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Little Law:** Concurrency roughly throughput times latency.


---

<!-- 305_FLATMAP_CONCURRENCY.md -->

# flatMap Concurrency

## What / Why
Bound async fan-out.

## Mental Model
```text
flatMap Concurrency → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **flatMap Concurrency:** Bound async fan-out.


---

<!-- 306_COLLECTLIST_MEMORY_RISK.md -->

# collectList Memory Risk

## What / Why
Aggregation defeats streaming.

## Mental Model
```text
collectList Memory Risk → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **collectList Memory Risk:** Aggregation defeats streaming.


---

<!-- 307_SCHEDULER_HOP_COST.md -->

# Scheduler Hop Cost

## What / Why
Each async boundary adds queue/context-switch overhead.

## Mental Model
```text
Scheduler Hop Cost → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Scheduler Hop Cost:** Each async boundary adds queue/context-switch overhead.


---

<!-- 308_TAIL_LATENCY.md -->

# Tail Latency

## What / Why
p95/p99 expose saturation.

## Mental Model
```text
Tail Latency → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Tail Latency:** p95/p99 expose saturation.


---

<!-- 309_LOAD_TESTING_REACTIVE.md -->

# Load Testing Reactive

## What / Why
Test concurrency, slow downstreams, streaming and failures.

## Mental Model
```text
Load Testing Reactive → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Load Testing Reactive:** Test concurrency, slow downstreams, streaming and failures.


---

<!-- 310_KOTLIN_COROUTINES_WEBFLUX.md -->

# Kotlin Coroutines WebFlux

## What / Why
Spring supports suspend functions and Flow.

## Mental Model
```text
Kotlin Coroutines WebFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Kotlin Coroutines WebFlux:** Spring supports suspend functions and Flow.


---

<!-- 311_SUSPEND_CONTROLLER.md -->

# suspend Controller

## What / Why
Coroutine controller method.

## Mental Model
```text
suspend Controller → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **suspend Controller:** Coroutine controller method.


---

<!-- 312_KOTLIN_FLOW.md -->

# Kotlin Flow

## What / Why
Cold coroutine stream.

## Mental Model
```text
Kotlin Flow → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Kotlin Flow:** Cold coroutine stream.


---

<!-- 313_AWAITSINGLE.md -->

# awaitSingle

## What / Why
Await Mono without blocking thread.

## Mental Model
```text
awaitSingle → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **awaitSingle:** Await Mono without blocking thread.


---

<!-- 314_FLUX_ASFLOW.md -->

# Flux asFlow

## What / Why
Adapt Flux to Flow.

## Mental Model
```text
Flux asFlow → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Flux asFlow:** Adapt Flux to Flow.


---

<!-- 315_FLOW_ASFLUX.md -->

# Flow asFlux

## What / Why
Adapt Flow to Flux.

## Mental Model
```text
Flow asFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Flow asFlux:** Adapt Flow to Flux.


---

<!-- 316_COROUTINES_VS_REACTOR.md -->

# Coroutines vs Reactor

## What / Why
Different syntax over non-blocking async infrastructure.

## Mental Model
```text
Coroutines vs Reactor → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Coroutines vs Reactor:** Different syntax over non-blocking async infrastructure.


---

<!-- 317_REACTIVE_VS_VIRTUAL_THREADS.md -->

# Reactive vs Virtual Threads

## What / Why
Event-loop continuation model vs lightweight thread-per-task.

## Mental Model
```text
Reactive vs Virtual Threads → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive vs Virtual Threads:** Event-loop continuation model vs lightweight thread-per-task.


---

<!-- 318_VIRTUAL_THREADS_STRENGTH.md -->

# Virtual Threads Strength

## What / Why
Simplify imperative blocking-style services.

## Mental Model
```text
Virtual Threads Strength → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Virtual Threads Strength:** Simplify imperative blocking-style services.


---

<!-- 319_REACTIVE_STRENGTH.md -->

# Reactive Strength

## What / Why
Streaming, backpressure and async composition.

## Mental Model
```text
Reactive Strength → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive Strength:** Streaming, backpressure and async composition.


---

<!-- 320_BACKPRESSURE_DIFFERENCE.md -->

# Backpressure Difference

## What / Why
Virtual threads do not supply Reactive Streams demand.

## Mental Model
```text
Backpressure Difference → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Backpressure Difference:** Virtual threads do not supply Reactive Streams demand.


---

<!-- 321_HYBRID_ARCHITECTURE.md -->

# Hybrid Architecture

## What / Why
Choose model per service/workload deliberately.

## Mental Model
```text
Hybrid Architecture → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Hybrid Architecture:** Choose model per service/workload deliberately.


---

<!-- 322_NESTED_SUBSCRIBE_ANTI_PATTERN.md -->

# Nested Subscribe Anti Pattern

## What / Why
Compose publishers instead of subscribing inside service code.

## Mental Model
```text
Nested Subscribe Anti Pattern → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Nested Subscribe Anti Pattern:** Compose publishers instead of subscribing inside service code.


---

<!-- 323_BLOCK_IN_EVENT_LOOP.md -->

# Block in Event Loop

## What / Why
Never block Netty event-loop threads.

## Mental Model
```text
Block in Event Loop → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Block in Event Loop:** Never block Netty event-loop threads.


---

<!-- 324_BOUNDEDELASTIC_EVERYWHERE.md -->

# boundedElastic Everywhere

## What / Why
Hides blocking architecture instead of fixing it.

## Mental Model
```text
boundedElastic Everywhere → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **boundedElastic Everywhere:** Hides blocking architecture instead of fixing it.


---

<!-- 325_UNBOUNDED_FLATMAP.md -->

# Unbounded flatMap

## What / Why
Unlimited concurrent inner work.

## Mental Model
```text
Unbounded flatMap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Unbounded flatMap:** Unlimited concurrent inner work.


---

<!-- 326_UNBOUNDED_BUFFER.md -->

# Unbounded Buffer

## What / Why
Can OOM under slow downstream.

## Mental Model
```text
Unbounded Buffer → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Unbounded Buffer:** Can OOM under slow downstream.


---

<!-- 327_COLLECTLIST_EVERYWHERE.md -->

# collectList Everywhere

## What / Why
Destroys streaming.

## Mental Model
```text
collectList Everywhere → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **collectList Everywhere:** Destroys streaming.


---

<!-- 328_SWALLOWED_ERROR.md -->

# Swallowed Error

## What / Why
Do not convert every error to empty.

## Mental Model
```text
Swallowed Error → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Swallowed Error:** Do not convert every error to empty.


---

<!-- 329_RETRY_EVERYTHING.md -->

# Retry Everything

## What / Why
Permanent/non-idempotent errors must not retry blindly.

## Mental Model
```text
Retry Everything → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Retry Everything:** Permanent/non-idempotent errors must not retry blindly.


---

<!-- 330_THREADLOCAL_CONTEXT.md -->

# ThreadLocal Context

## What / Why
Do not rely on thread-affinity.

## Mental Model
```text
ThreadLocal Context → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **ThreadLocal Context:** Do not rely on thread-affinity.


---

<!-- 331_SUBSCRIBE_IN_CONTROLLER.md -->

# subscribe in Controller

## What / Why
Framework subscribes to controller return publisher.

## Mental Model
```text
subscribe in Controller → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **subscribe in Controller:** Framework subscribes to controller return publisher.


---

<!-- 332_WEBFLUX_REQUEST_HANGS.md -->

# WebFlux Request Hangs

## What / Why
Check never source, blocking event loop, missing timeout or pool saturation.

## Mental Model
```text
WebFlux Request Hangs → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebFlux Request Hangs:** Check never source, blocking event loop, missing timeout or pool saturation.


---

<!-- 333_ILLEGALSTATEEXCEPTION_BLOCK.md -->

# IllegalStateException block

## What / Why
Blocking call detected on non-blocking thread.

## Mental Model
```text
IllegalStateException block → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **IllegalStateException block:** Blocking call detected on non-blocking thread.


---

<!-- 334_CONNECTION_POOL_TIMEOUT.md -->

# Connection Pool Timeout

## What / Why
Outbound pool exhausted.

## Mental Model
```text
Connection Pool Timeout → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Connection Pool Timeout:** Outbound pool exhausted.


---

<!-- 335_R2DBC_POOL_EXHAUSTED.md -->

# R2DBC Pool Exhausted

## What / Why
DB connections saturated.

## Mental Model
```text
R2DBC Pool Exhausted → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **R2DBC Pool Exhausted:** DB connections saturated.


---

<!-- 336_GROUPBY_HANGS.md -->

# groupBy Hangs

## What / Why
Groups not consumed with enough concurrency.

## Mental Model
```text
groupBy Hangs → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **groupBy Hangs:** Groups not consumed with enough concurrency.


---

<!-- 337_SSE_STOPS.md -->

# SSE Stops

## What / Why
Proxy timeout/buffering/client disconnect.

## Mental Model
```text
SSE Stops → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **SSE Stops:** Proxy timeout/buffering/client disconnect.


---

<!-- 338_CONTEXT_MISSING.md -->

# Context Missing

## What / Why
contextWrite placement or bridge broke propagation.

## Mental Model
```text
Context Missing → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Context Missing:** contextWrite placement or bridge broke propagation.


---

<!-- 339_RETRY_STORM_DIAGNOSIS.md -->

# Retry Storm Diagnosis

## What / Why
Inspect retry rate, concurrency and downstream failures.

## Mental Model
```text
Retry Storm Diagnosis → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Retry Storm Diagnosis:** Inspect retry rate, concurrency and downstream failures.


---

<!-- 340_POOLED_BUFFER_LEAK.md -->

# Pooled Buffer Leak

## What / Why
DataBuffer ownership/release error.

## Mental Model
```text
Pooled Buffer Leak → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Pooled Buffer Leak:** DataBuffer ownership/release error.


---

<!-- 341_ZIP_EMPTY_TRAP.md -->

# zip Empty Trap

## What / Why
An empty Mono prevents combined zip value.

## Mental Model
```text
zip Empty Trap → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **zip Empty Trap:** An empty Mono prevents combined zip value.


---

<!-- 342_SWITCHIFEMPTY_EAGERNESS.md -->

# switchIfEmpty Eagerness

## What / Why
Use defer when fallback creation must be lazy.

## Mental Model
```text
switchIfEmpty Eagerness → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **switchIfEmpty Eagerness:** Use defer when fallback creation must be lazy.


---

<!-- 343_GOLDEN_DEBUG_FLOW.md -->

# Golden Debug Flow

## What / Why
Signals → scheduler → demand → pools → context → cleanup.

## Mental Model
```text
Golden Debug Flow → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Golden Debug Flow:** Signals → scheduler → demand → pools → context → cleanup.


---

<!-- 344_DESIGN_HIGH_CONCURRENCY_API.md -->

# Design High Concurrency API

## What / Why
WebFlux + non-blocking dependencies + bounded resources.

## Mental Model
```text
Design High Concurrency API → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Design High Concurrency API:** WebFlux + non-blocking dependencies + bounded resources.


---

<!-- 345_DESIGN_SSE_SERVICE.md -->

# Design SSE Service

## What / Why
Flux SSE + heartbeat + cancellation + proxy tuning.

## Mental Model
```text
Design SSE Service → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Design SSE Service:** Flux SSE + heartbeat + cancellation + proxy tuning.


---

<!-- 346_DESIGN_WEBSOCKET_SERVICE.md -->

# Design WebSocket Service

## What / Why
Session lifecycle + fanout + slow-consumer handling.

## Mental Model
```text
Design WebSocket Service → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Design WebSocket Service:** Session lifecycle + fanout + slow-consumer handling.


---

<!-- 347_DESIGN_AGGREGATOR.md -->

# Design Aggregator

## What / Why
Parallel WebClient calls + timeout + bounded concurrency.

## Mental Model
```text
Design Aggregator → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Design Aggregator:** Parallel WebClient calls + timeout + bounded concurrency.


---

<!-- 348_DESIGN_REACTIVE_CRUD.md -->

# Design Reactive CRUD

## What / Why
WebFlux + R2DBC + reactive transactions.

## Mental Model
```text
Design Reactive CRUD → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Design Reactive CRUD:** WebFlux + R2DBC + reactive transactions.


---

<!-- 349_DESIGN_STREAMING_DB_API.md -->

# Design Streaming DB API

## What / Why
R2DBC Flux → NDJSON/SSE.

## Mental Model
```text
Design Streaming DB API → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Design Streaming DB API:** R2DBC Flux → NDJSON/SSE.


---

<!-- 350_DESIGN_REACTIVE_GATEWAY.md -->

# Design Reactive Gateway

## What / Why
Non-blocking routing + auth + limits + safe retries.

## Mental Model
```text
Design Reactive Gateway → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Design Reactive Gateway:** Non-blocking routing + auth + limits + safe retries.


---

<!-- 350_HIGH_VALUE_COMPARISONS.md -->

# High-Value Comparisons

| A | B | Key difference |
|---|---|---|
| Mono | Flux | 0..1 vs 0..N |
| map | flatMap | sync transform vs async Publisher flatten |
| flatMap | concatMap | concurrent completion-order vs sequential source-order |
| publishOn | subscribeOn | downstream boundary vs source subscription context |
| Cold | Hot | per-subscriber source vs shared/live source |
| WebFlux | MVC | reactive non-blocking vs Servlet imperative |
| WebClient | RestClient | reactive vs synchronous HTTP client |
| R2DBC | JDBC | reactive SPI vs blocking API |
| Reactor Context | ThreadLocal | subscription-scoped vs thread-scoped |
| Reactive | Virtual Threads | async continuation/backpressure vs lightweight blocking model |


---

<!-- 351_DESIGN_BLOCKING_INTEGRATION.md -->

# Design Blocking Integration

## What / Why
boundedElastic + bulkhead + timeout + migration.

## Mental Model
```text
Design Blocking Integration → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Design Blocking Integration:** boundedElastic + bulkhead + timeout + migration.


---

<!-- 351_INTERVIEW_TRAPS.md -->

# Spring Reactive Interview Traps

1. Reactive is not automatically faster.
2. Async does not mean non-blocking.
3. Do not call `subscribe()` inside normal service/controller composition.
4. `flatMap` does not preserve order.
5. `publishOn` affects downstream; `subscribeOn` affects subscription/source execution.
6. `boundedElastic` is a blocking boundary, not a default scheduler.
7. Backpressure is not rate limiting.
8. `collectList()` destroys streaming.
9. Retry resubscribes and can repeat side effects.
10. Cancellation is normal and must clean up resources.
11. Reactor Context is not ThreadLocal.
12. WebClient `.block()` on event-loop threads is dangerous.
13. JDBC/JPA are still blocking even in a WebFlux project.
14. R2DBC transactions bind through Reactor Context.
15. Parallel DB work can violate single-transaction assumptions.
16. WebSocket itself does not provide Reactive Streams demand.
17. RSocket has explicit reactive interaction/flow-control semantics.
18. Virtual threads and WebFlux are different concurrency models.
19. Unbounded `flatMap`, buffers, replay or cache can cause memory/resource collapse.
20. Use WebFlux when the workload benefits from it, not because it is newer.


---

<!-- 352_MONO_VS_FLUX_INTERVIEW.md -->

# Mono vs Flux Interview

## What / Why
0..1 vs 0..N.

## Mental Model
```text
Mono vs Flux Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Mono vs Flux Interview:** 0..1 vs 0..N.


---

<!-- 352_PRODUCTION_CHECKLIST.md -->

# Production Checklist

## Pipeline
- no nested subscribe
- no block/sleep on event loop
- bounded flatMap concurrency
- bounded buffers/cache/replay
- explicit error and empty semantics
- cancellation-safe cleanup

## HTTP
- connect/response timeout strategy
- bounded connection pool
- streaming media types where needed
- codec memory limits
- retries only for safe/idempotent work

## Data
- R2DBC driver verified
- DB pool bounded
- transactions short
- no JDBC/JPA on event loop

## Operations
- p95/p99 latency
- Netty pool saturation
- R2DBC pool saturation
- retry rate
- event-loop blocking detection
- trace/context propagation


---

<!-- 353_MAP_VS_FLATMAP_INTERVIEW.md -->

# map vs flatMap Interview

## What / Why
sync mapping vs async Publisher flattening.

## Mental Model
```text
map vs flatMap Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **map vs flatMap Interview:** sync mapping vs async Publisher flattening.


---

<!-- 353_SOURCES.md -->

# Sources & Accuracy Notes

Primary baseline: official Spring Framework 7.0.9 reference and Project Reactor Core 3.8.7 documentation.

Verified current facts:
- Spring Framework 7.0.9 is the current stable Framework reference line.
- Reactor Core 3.8.7 is the current Reactor Core release.
- WebFlux is fully non-blocking and Reactive Streams backpressure-aware.
- WebClient is Reactor-based, non-blocking and streaming-capable.
- Spring Framework includes R2DBC support and reactive transaction infrastructure.

Align versions through Spring Boot dependency management unless a documented compatibility requirement says otherwise.


---

<!-- 354_FLATMAP_VS_CONCATMAP_INTERVIEW.md -->

# flatMap vs concatMap Interview

## What / Why
concurrent unordered vs sequential ordered.

## Mental Model
```text
flatMap vs concatMap Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **flatMap vs concatMap Interview:** concurrent unordered vs sequential ordered.


---

<!-- 355_PUBLISHON_VS_SUBSCRIBEON_INTERVIEW.md -->

# publishOn vs subscribeOn Interview

## What / Why
downstream boundary vs source subscription context.

## Mental Model
```text
publishOn vs subscribeOn Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **publishOn vs subscribeOn Interview:** downstream boundary vs source subscription context.


---

<!-- 356_HOT_VS_COLD_INTERVIEW.md -->

# Hot vs Cold Interview

## What / Why
shared live source vs per-subscriber source.

## Mental Model
```text
Hot vs Cold Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Hot vs Cold Interview:** shared live source vs per-subscriber source.


---

<!-- 357_BACKPRESSURE_INTERVIEW.md -->

# Backpressure Interview

## What / Why
demand-based flow control.

## Mental Model
```text
Backpressure Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Backpressure Interview:** demand-based flow control.


---

<!-- 358_WEBFLUX_VS_MVC_INTERVIEW.md -->

# WebFlux vs MVC Interview

## What / Why
reactive non-blocking vs Servlet imperative.

## Mental Model
```text
WebFlux vs MVC Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebFlux vs MVC Interview:** reactive non-blocking vs Servlet imperative.


---

<!-- 359_WEBCLIENT_VS_RESTCLIENT_INTERVIEW.md -->

# WebClient vs RestClient Interview

## What / Why
reactive client vs synchronous client.

## Mental Model
```text
WebClient vs RestClient Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **WebClient vs RestClient Interview:** reactive client vs synchronous client.


---

<!-- 360_R2DBC_VS_JDBC_INTERVIEW.md -->

# R2DBC vs JDBC Interview

## What / Why
reactive driver SPI vs blocking JDBC.

## Mental Model
```text
R2DBC vs JDBC Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **R2DBC vs JDBC Interview:** reactive driver SPI vs blocking JDBC.


---

<!-- 361_REACTIVE_VS_VIRTUAL_THREADS_INTERVIEW.md -->

# Reactive vs Virtual Threads Interview

## What / Why
continuations/backpressure vs lightweight blocking style.

## Mental Model
```text
Reactive vs Virtual Threads Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive vs Virtual Threads Interview:** continuations/backpressure vs lightweight blocking style.


---

<!-- 362_CONTEXT_VS_THREADLOCAL_INTERVIEW.md -->

# Context vs ThreadLocal Interview

## What / Why
subscription state vs thread state.

## Mental Model
```text
Context vs ThreadLocal Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Context vs ThreadLocal Interview:** subscription state vs thread state.


---

<!-- 363_REACTIVE_TRANSACTION_INTERVIEW.md -->

# Reactive Transaction Interview

## What / Why
transaction state in Reactor Context.

## Mental Model
```text
Reactive Transaction Interview → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive Transaction Interview:** transaction state in Reactor Context.


---

<!-- 364_WHEN_NOT_TO_USE_WEBFLUX.md -->

# When Not to Use WebFlux

## What / Why
Mostly blocking dependencies and modest concurrency.

## Mental Model
```text
When Not to Use WebFlux → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **When Not to Use WebFlux:** Mostly blocking dependencies and modest concurrency.


---

<!-- 365_REACTIVE_INTERVIEW_TRAPS.md -->

# Reactive Interview Traps

## What / Why
Operator, scheduler, demand, context and blocking misconceptions.

## Mental Model
```text
Reactive Interview Traps → source → signals → demand → execution → terminal outcome
```

## Production Questions
- Is the source truly non-blocking?
- What is the expected cardinality?
- Where is demand/backpressure enforced?
- Which scheduler/thread executes the stage?
- What happens on error, timeout and cancellation?
- Are concurrency and buffers bounded?
- Does Context/security/transaction state remain in the chain?

## Common Trap
Wrapping blocking code in `Mono` or `Flux` does not make the underlying operation non-blocking.

## 20-Second Recall
> **Reactive Interview Traps:** Operator, scheduler, demand, context and blocking misconceptions.
