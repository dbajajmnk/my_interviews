# Sources & Accuracy Notes

Baseline verified against current RabbitMQ 4.3 official documentation.

Current facts used:
- RabbitMQ 4.3.5 released August 17, 2026.
- RabbitMQ 4.x documentation supports AMQP 0-9-1, AMQP 1.0 and RabbitMQ Streams.
- Quorum Queues are Raft-based and the recommended default when a replicated HA queue is needed.
- Classic queue mirroring was removed in RabbitMQ 4.0.
- Publisher confirms and consumer acknowledgements are separate data-safety mechanisms.
- Quorum Queue confirms occur after a publish is safely replicated to a quorum.
- Streams are better suited than quorum queues for very long backlogs and large fanouts.

Always verify exact 4.3.x patch docs and client-library semantics before production changes.
