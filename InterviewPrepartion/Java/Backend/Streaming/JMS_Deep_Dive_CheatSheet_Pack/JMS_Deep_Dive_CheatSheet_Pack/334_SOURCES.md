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
