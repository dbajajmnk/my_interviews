# High-Value AWS Comparison Matrix

## CloudWatch vs CloudTrail vs Config

| CloudWatch | CloudTrail | Config |
|---|---|---|
| operations | API audit | configuration |
| metrics/logs | who did what | state/compliance |
| alarms | investigations | rules/history |

## ALB vs API Gateway

| ALB | API Gateway |
|---|---|
| L7 load balancer | API management |
| containers/EC2 | serverless/API front door |
| target groups | API stages/routes |

## SQS vs SNS vs EventBridge

| SQS | SNS | EventBridge |
|---|---|---|
| queue | pub/sub | event bus |

## S3 vs EBS vs EFS

| Object | Block | File |
|---|---|---|
| S3 | EBS | EFS |

## RDS vs DynamoDB

| Relational | NoSQL |
|---|---|
| joins/SQL | access-pattern design |
| relational schema | key-value/document |

## CloudFront vs Global Accelerator

| CloudFront | Global Accelerator |
|---|---|
| CDN/cache | network acceleration |
| HTTP content | TCP/UDP/global endpoints |
