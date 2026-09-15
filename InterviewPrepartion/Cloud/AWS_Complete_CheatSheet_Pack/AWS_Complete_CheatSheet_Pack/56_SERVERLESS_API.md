# Lambda + API Gateway Reference

```text
Client
 ↓
Route 53
 ↓
CloudFront/WAF (optional)
 ↓
API Gateway
 ↓
Lambda
 ↓
DynamoDB / Aurora / S3
```

## Add

```text
Cognito/authorizer
CloudWatch
X-Ray/OTel
SQS for async work
DLQ
```

## Good Fit

```text
bursty API
low operations
event-driven backend
```

## Trap

Protect downstream capacity from sudden Lambda concurrency.
