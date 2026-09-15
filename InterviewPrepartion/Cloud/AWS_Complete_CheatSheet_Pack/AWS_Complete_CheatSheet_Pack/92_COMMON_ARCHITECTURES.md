# Common AWS Architectures

## Three-Tier Web

```text
Route 53
 ↓
CloudFront/WAF
 ↓
ALB
 ↓
EC2/ECS
 ↓
RDS/Aurora
```

## Serverless

```text
CloudFront
 ↓
API Gateway
 ↓
Lambda
 ↓
DynamoDB
```

## Event-Driven

```text
Service
 ↓
EventBridge
 ↓
SQS
 ↓
Lambda/ECS Consumer
```

## Container Platform

```text
ALB
 ↓
ECS/EKS
 ↓
RDS/DynamoDB
```
