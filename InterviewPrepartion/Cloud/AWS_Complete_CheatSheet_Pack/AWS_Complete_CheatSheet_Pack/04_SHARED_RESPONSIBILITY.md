# Shared Responsibility Model

## AWS — Security **of** the Cloud

Examples:

```text
physical facilities
hardware
core infrastructure
managed-service underlying platform
```

## Customer — Security **in** the Cloud

Examples:

```text
IAM
data
network configuration
application security
OS patching on EC2
encryption choices
```

## Responsibility Changes by Service

```text
EC2 → customer manages more
RDS → AWS manages OS/database infrastructure
Lambda → AWS manages more runtime infrastructure
```

## Trap

Managed service does not mean AWS owns your data-access policy or application security.
