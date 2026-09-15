# Regions, Availability Zones & Edge

## Region

A geographic AWS area containing multiple isolated Availability Zones.

## Availability Zone

One or more discrete data centers with independent infrastructure.

## Edge

Used by services such as:

```text
CloudFront
Route 53
Global Accelerator
```

## Availability Pattern

```text
Region
 ├── AZ-A
 ├── AZ-B
 └── AZ-C
```

## Rule

For production regional workloads, distribute across multiple AZs unless requirements clearly justify otherwise.

## Trap

Multi-AZ protects against AZ failure; it does not provide full Region-failure protection.
