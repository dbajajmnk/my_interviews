# Hosting and Self-Hosting

## Self-Hosting

Agent Framework can be hosted in application-owned services.

## Session Storage

Default process-local session storage is suitable for development only. Production should use Redis, database, blob storage, or another durable store as appropriate.

## A2A Hosting

Framework hosting packages can expose agents through the A2A protocol.

## Production Requirements

- authentication;
- durable sessions;
- distributed state;
- rate limits;
- health checks;
- deployment scaling;
- trace/metrics;
- protocol versioning.
