# Amazon EBS

## What

Persistent block storage for EC2.

## Use

```text
OS disks
databases
low-latency block workloads
```

## Concepts

```text
volume type
IOPS
throughput
snapshot
encryption
AZ scope
```

## Snapshot

Backed by AWS-managed storage service and useful for backup/restore workflows.

## Trap

An EBS volume is Availability-Zone scoped; architecture must account for AZ placement.
