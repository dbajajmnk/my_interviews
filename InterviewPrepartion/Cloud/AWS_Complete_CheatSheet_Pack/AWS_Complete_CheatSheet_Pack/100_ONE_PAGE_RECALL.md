# AWS — One-Page Architecture Recall

```text
                        Users
                          │
                       Route 53
                          │
                 CloudFront + WAF
                          │
              ┌───────────┴───────────┐
              ▼                       ▼
         API Gateway                 ALB
              │                       │
           Lambda              ECS / EKS / EC2
              │                       │
              ├──────────┬────────────┤
              ▼          ▼            ▼
          DynamoDB    Aurora/RDS      S3
              │
         EventBridge
              │
             SQS
              │
          Consumers
```

## Security

```text
Organizations / Control Tower
IAM / Identity Center
SCP
KMS
Secrets Manager
WAF / Shield
GuardDuty / Security Hub
CloudTrail / Config
```

## Reliability

```text
Multi-AZ
Auto Scaling
Backup
Retry/queue
Route 53
DR / Multi-Region when justified
```

## Operations

```text
CloudWatch
Tracing
IaC
CI/CD
Budgets
```
