# AWS Troubleshooting Matrix

| Symptom | First Checks | Likely Area |
|---|---|---|
| EC2 no internet | route/public IP/SG/NACL | VPC |
| Private EC2 no outbound | NAT route/NAT health | networking |
| ALB 502 | target health/app port | compute |
| Lambda timeout | logs/downstream/VPC | app/network |
| S3 AccessDenied | IAM/bucket policy/KMS | security |
| RDS connection fail | SG/subnet/DNS/secret | database |
| DynamoDB throttle | capacity/hot partition | data model |
| SQS duplicates | idempotency | consumer |
| High API latency | trace/dependencies | performance |
| CloudFront stale | cache policy/invalidation | CDN |
| EKS pod pending | resources/scheduler/IAM | Kubernetes |
| Cost spike | Cost Explorer/tags/usage | FinOps |

## Debug Rule

```text
Identity
→ Network
→ Resource health
→ Application
→ Dependency
→ Quota
→ Cost
```
