# Direct Connect / Site-to-Site VPN

## VPN

Encrypted connectivity over the internet.

## Direct Connect

Dedicated network connection into AWS.

## Hybrid Pattern

```text
On-Prem
 ├── Direct Connect → AWS
 └── VPN backup      → AWS
```

## Decision

Use based on:

```text
bandwidth
latency consistency
cost
setup time
resilience
security requirements
```

## Trap

Direct Connect by itself is not encryption.
