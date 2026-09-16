# Backend API Streaming Patterns

## SSE Endpoint

```text
POST /runs
 → returns run_id

GET /runs/{id}/events
 → SSE stream
```

## Alternative

Single-request streaming:
```text
POST /agent/stream
→ SSE/chunked stream
```

## Long-Running Enterprise Pattern

Prefer:
- create run;
- persist run;
- subscribe separately;
- reconnect by run ID.
