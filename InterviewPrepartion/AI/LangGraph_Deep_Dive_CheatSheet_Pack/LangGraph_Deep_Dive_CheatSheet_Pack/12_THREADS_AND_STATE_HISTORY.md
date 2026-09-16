# Threads and State History

## Thread

A thread identifies a logical sequence of graph state revisions.

## History

You can inspect previous checkpoints to understand how the graph evolved.

## Uses

- debugging;
- audit;
- resume;
- user conversation continuity;
- rollback/time travel.

## Enterprise Design

Keep tenant/user/thread identifiers explicit and avoid accidental cross-tenant state sharing.
