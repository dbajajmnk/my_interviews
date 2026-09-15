# High-Value Comparison Matrix

## Saga vs 2PC

| Saga | 2PC |
|---|---|
| local transactions | distributed atomic protocol |
| compensation | rollback |
| scalable | coordination heavy |
| eventual consistency | strong atomicity |

## CQRS vs CRUD

| CQRS | CRUD |
|---|---|
| separate models | one model |
| complex | simple |
| scalable reads/writes | lower complexity |

## Choreography vs Orchestration

| Choreography | Orchestration |
|---|---|
| decentralized | centralized workflow |
| event-driven | coordinator |
| loose coupling | clearer flow |
| harder tracing | orchestrator complexity |

## REST vs Messaging

| REST/gRPC | Messaging |
|---|---|
| immediate response | decoupled |
| runtime dependency | temporal decoupling |
| simpler | resilient buffering |

## API Gateway vs Service Mesh

| Gateway | Mesh |
|---|---|
| north-south | east-west |
| client entry | service-to-service |
| API concerns | network policy |
