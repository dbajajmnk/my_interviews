# Kafka — High-Value Comparisons

| Topic | A | B |
|---|---|---|
| Consumer vs Share Group | exclusive partition ownership | record-oriented shared consumption |
| Retention vs Compaction | time/size history | latest value per key |
| Idempotence vs Transaction | retry dedupe | atomic multi-record/offset transaction |
| KStream vs KTable | event stream | changelog/table |
| Kafka vs RabbitMQ | partitioned durable log | exchange/queue broker |
| Kafka vs JMS | concrete streaming platform | Java messaging API specification |
| Kafka vs Pulsar | Kafka broker/log architecture | Pulsar broker/BookKeeper architecture |
