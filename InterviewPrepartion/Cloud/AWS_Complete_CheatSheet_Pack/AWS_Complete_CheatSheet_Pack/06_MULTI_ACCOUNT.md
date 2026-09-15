# Multi-Account Strategy

## Why Multiple Accounts

AWS accounts are strong isolation and governance boundaries.

Use them for:

```text
production
non-production
security
logging
shared services
networking
sandbox
business units
```

## Benefits

```text
blast-radius reduction
billing separation
quota isolation
policy boundaries
security isolation
```

## Typical Shape

```text
Organization
 ├── Security OU
 ├── Infrastructure OU
 ├── Workloads-Prod OU
 ├── Workloads-Test OU
 └── Sandbox OU
```

## Trap

One giant AWS account for an enterprise creates avoidable security, quota, billing, and operational coupling.
