# Highly Available Web App Reference

```text
Users
 ↓
Route 53
 ↓
CloudFront + WAF
 ↓
ALB
 ├───────────────┐
 ↓               ↓
App AZ-A       App AZ-B
 ↓               ↓
       Aurora/RDS Multi-AZ
              ↓
             S3
```

## Cross-Cutting

```text
IAM
KMS
CloudWatch
CloudTrail
Secrets Manager
Auto Scaling
Backup
```
