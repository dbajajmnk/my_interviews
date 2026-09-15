# AWS Architecture Decision Tree

## Compute

```text
Function/event? → Lambda
Container? → ECS/EKS
Need VM/OS control? → EC2
```

## Container Platform

```text
Need Kubernetes? → EKS
AWS-native simplicity? → ECS
No nodes? → Fargate
```

## Data

```text
Relational? → RDS/Aurora
Key-value/document scale? → DynamoDB
Search? → OpenSearch
Warehouse? → Redshift
Graph? → Neptune
```

## Storage

```text
Object? → S3
Block? → EBS
Shared file? → EFS/FSx
```

## Messaging

```text
Queue? → SQS
Fan-out? → SNS
Event routing? → EventBridge
Streaming? → Kinesis/MSK
```

## Global Delivery

```text
Cache HTTP content? → CloudFront
Static anycast/global network? → Global Accelerator
DNS routing? → Route 53
```
