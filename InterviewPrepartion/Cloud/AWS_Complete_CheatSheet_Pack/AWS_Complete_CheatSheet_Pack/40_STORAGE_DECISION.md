# S3 vs EBS vs EFS

| S3 | EBS | EFS |
|---|---|---|
| object | block | file |
| API access | disk semantics | NFS |
| massive scale | EC2 storage | shared Linux file |
| regional service | AZ volume | regional file service |

## Quick Decision

```text
Objects? → S3
Disk? → EBS
Shared filesystem? → EFS
```
