# Build-Time vs Runtime Integration

## Build-Time

```text
npm package
 ↓
host build
 ↓
single deployment artifact
```

### Benefits
- simple runtime
- easy typing
- predictable dependency graph

### Cost
- host rebuild needed

## Runtime

```text
Host
 ↓ runtime lookup
Remote bundle
```

### Benefits
- independent deployment
- late binding

### Cost
- runtime failures
- version compatibility
- observability complexity

## Rule

Choose runtime composition only when independent runtime release is genuinely required.
