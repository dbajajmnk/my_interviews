# Performance Decision Guide

## Compute

```text
CPU-bound → compute-optimized / scale
memory-bound → memory-optimized
burst → serverless/autoscale
GPU → accelerated
```

## Data

```text
cache hot data
use right DB
use read replicas
design DynamoDB keys
CDN global content
```

## Network

```text
reduce cross-AZ/Region hops
CloudFront
Global Accelerator
private connectivity
```

## Rule

Measure before optimizing.
