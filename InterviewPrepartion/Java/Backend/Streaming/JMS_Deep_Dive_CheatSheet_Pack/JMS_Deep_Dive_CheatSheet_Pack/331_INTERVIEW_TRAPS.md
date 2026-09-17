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
