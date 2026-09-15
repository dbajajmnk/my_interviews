# Compact Headers & Memory Density

## Why Object Headers Matter

Object-heavy applications pay header overhead for every object.

Example mental math:

```text
4 bytes saved
× 10,000,000 objects
≈ 40 MB
```

(actual results vary)

## Potential Benefits

```text
smaller heap
better cache locality
higher deployment density
less memory bandwidth
```

## Validate

Run representative benchmarks.

Check:

```text
heap
GC
CPU
throughput
latency
```
