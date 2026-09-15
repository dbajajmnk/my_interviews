# Caching / CDN

## Recommended Asset Model

```text
immutable hashed asset
+
long cache lifetime
```

Example:

```text
catalog.a1b2c3.js
```

## Runtime Manifest

Keep dynamic mapping separately cache-controlled.

## CDN Benefits

```text
edge delivery
availability
cache
latency
```

## Trap

Overwriting a versioned remote asset breaks rollback safety.
