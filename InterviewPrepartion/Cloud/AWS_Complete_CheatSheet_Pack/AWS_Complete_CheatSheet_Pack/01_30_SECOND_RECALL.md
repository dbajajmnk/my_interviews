# AWS — 30-Second Recall

## Formula

**AWS Architecture = Identity + Network + Compute + Data + Resilience + Observability + Automation + Cost Governance**

## Core Flow

```text
Users
  ↓
Route 53
  ↓
CloudFront + WAF
  ↓
ALB / API Gateway
  ↓
EC2 / ECS / EKS / Lambda
  ↓
RDS / Aurora / DynamoDB / S3
```

## Must Remember

```text
IAM Role > long-term access key
Multi-AZ ≠ Multi-Region
Security Group = stateful
NACL = stateless
Public subnet = route to IGW
NAT Gateway = outbound internet for private IPv4 workloads
S3 = object
EBS = block
EFS = shared file
ALB = Layer 7
NLB = Layer 4
SQS = queue
SNS = pub/sub
EventBridge = event routing
CloudWatch = observability
CloudTrail = API audit
```

## Well-Architected Pillars

```text
Operational Excellence
Security
Reliability
Performance Efficiency
Cost Optimization
Sustainability
```

## Interview Traps

- Public subnet alone does not give an EC2 instance internet access.
- NAT Gateway does not make a private instance inbound-public.
- IAM role uses temporary credentials.
- Read Replica is not the same as Multi-AZ standby.
- S3 is not a file system.
- Lambda is not always cheaper than EC2/containers.
