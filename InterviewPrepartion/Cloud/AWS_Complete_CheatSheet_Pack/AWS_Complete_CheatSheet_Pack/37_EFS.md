# Amazon EFS

## What

Managed shared file storage using NFS semantics.

## Use

```text
multiple EC2 instances
shared web content
Linux shared filesystem
container persistent shared file access
```

## Compare

```text
EBS → block / typically one-AZ volume
EFS → shared regional file system
S3  → object
```

## Trap

Use object storage instead of EFS when filesystem semantics are not required.
