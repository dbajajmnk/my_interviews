# AWS Microservices Reference

```text
Client
 ↓
CloudFront/WAF
 ↓
API Gateway / ALB
 ↓
ECS/EKS Services
 ├── Order
 ├── Payment
 └── Inventory
       │
       └── Events → EventBridge/MSK
                       ↓
                     SQS
                       ↓
                  Consumers
```

## Data

```text
service-owned RDS/Aurora/DynamoDB
```

## Cross-Cutting

```text
CloudWatch
tracing
IAM roles
Secrets Manager
Service discovery
autoscaling
```
