# Cache-Aside vs Materialized View

| Cache-Aside | Materialized View |
|---|---|
| copies source result | derived read model |
| transient acceleration | query-specific projection |
| invalidation | rebuild/update |
| usually key-based | richer read model |
