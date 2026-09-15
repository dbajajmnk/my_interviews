# Serverless Reference Architecture

```text
Web/Mobile
 ↓
CloudFront
 ↓
API Gateway
 ↓
Lambda
 ├── DynamoDB
 ├── S3
 └── EventBridge
        ↓
       SQS
        ↓
      Lambda
```

## Security

```text
Cognito / federation
IAM roles
KMS
WAF
Secrets
```

## Reliability

```text
DLQ
idempotency
retry control
reserved concurrency
alarms
```
