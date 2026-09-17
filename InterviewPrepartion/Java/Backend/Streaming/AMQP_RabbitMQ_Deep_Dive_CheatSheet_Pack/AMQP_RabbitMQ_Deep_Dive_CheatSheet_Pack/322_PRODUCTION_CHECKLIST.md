# RabbitMQ Production Readiness Checklist

## Topology
- exchange type
- routing keys/bindings
- queue type
- durability
- ownership/naming
- policies

## Publishing
- persistent messages if required
- publisher confirms
- mandatory/return handling where needed
- blocked connection handling
- idempotent retry strategy

## Consuming
- manual ack for critical processing
- prefetch tuned
- idempotent handler
- bounded retries
- DLX/DLQ
- consumer timeout / poison handling

## HA
- quorum queue / stream replicas
- majority/failure tolerance
- leader balance
- cluster partition design

## Security
- TLS
- service identities
- vhosts
- narrow configure/write/read permissions
- secrets rotation
- management endpoint protection

## Operations
- queue depth
- unacked count
- redelivery
- confirms
- node memory/disk
- alarms
- capacity/failure headroom
- tested DR
