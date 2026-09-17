# RabbitMQ 4.3 — Current Baseline

## Current Release Used
**RabbitMQ 4.3.5**, released **August 17, 2026**.

## Current Architecture Facts
- RabbitMQ 4.x supports AMQP 0-9-1 and AMQP 1.0.
- Current RabbitMQ tutorials explicitly separate AMQP 1.0, AMQP 0-9-1 and Streams.
- Quorum Queues are RabbitMQ's modern Raft-based replicated queue type and should be the default when a replicated highly available queue is required.
- Classic queue mirroring was removed starting with RabbitMQ 4.0.
- Streams are the other major replicated RabbitMQ data structure and are a better fit for very large backlogs/fanout/replay.
- Publisher confirms and consumer acknowledgements are separate reliability mechanisms.
- Quorum Queue publisher confirms are emitted after a publish is safely replicated to a quorum.
- Manual consumer acknowledgements are recommended for reliable processing.

## Version Rule
Do not apply RabbitMQ 3.x HA/mirrored-classic-queue guidance blindly to RabbitMQ 4.x.
