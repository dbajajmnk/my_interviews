# Saga vs 2PC

| Saga | 2PC |
|---|---|
| local transactions | distributed atomic transaction |
| compensation | rollback |
| eventual consistency | strong atomic outcome |
| scalable/decentralized | coordinator-heavy |
| business-level recovery | infrastructure-level coordination |

## Rule
Saga is usually preferred in loosely coupled microservices.
