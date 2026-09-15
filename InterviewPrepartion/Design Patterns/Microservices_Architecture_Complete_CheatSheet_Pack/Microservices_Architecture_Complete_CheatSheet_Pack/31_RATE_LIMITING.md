# Rate Limiting

## Why

Protect:

```text
CPU
DB
downstream APIs
business quotas
```

## Algorithms

```text
Token Bucket
Leaky Bucket
Fixed Window
Sliding Window
```

## Placement

```text
Gateway
Service
Shared infrastructure
```

## Trap

Rate limiting and throttling policies should align with business identity, not only IP address.
