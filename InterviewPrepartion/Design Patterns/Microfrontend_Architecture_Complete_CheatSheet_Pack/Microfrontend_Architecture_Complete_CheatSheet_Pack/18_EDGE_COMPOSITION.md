# Server / Edge Composition

## Flow

```text
Browser Request
      ↓
Edge / Server Composer
 ├── Header fragment
 ├── Catalog fragment
 └── Account fragment
      ↓
Combined HTML
```

## Benefits

- early HTML
- SEO
- reduced client bootstrap

## Challenges

- fragment latency
- cache strategy
- failures
- hydration coordination

## Trap

The slowest fragment can dominate server-side composition latency unless designed carefully.
