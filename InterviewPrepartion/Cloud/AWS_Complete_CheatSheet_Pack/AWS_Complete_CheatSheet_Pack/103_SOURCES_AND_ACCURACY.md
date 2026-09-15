# Sources & Accuracy Notes

This pack is based on current AWS architecture practices and official AWS documentation.

Primary reference areas:

- AWS Well-Architected Framework
- AWS IAM best practices
- AWS Organizations / Control Tower
- Amazon VPC documentation
- Amazon EC2 / Lambda / ECS / EKS / Fargate
- Amazon S3 / EBS / EFS / FSx
- Amazon RDS / Aurora / DynamoDB
- Amazon SQS / SNS / EventBridge / Step Functions
- Amazon CloudWatch / CloudTrail / Config
- AWS security services
- Amazon Bedrock / Knowledge Bases / Guardrails / evaluation

## Verified Current Guidance

### Well-Architected
AWS Well-Architected has six pillars:

```text
Operational Excellence
Security
Reliability
Performance Efficiency
Cost Optimization
Sustainability
```

### IAM
Current AWS guidance emphasizes:

```text
federation for human access
temporary credentials
IAM roles for workloads
MFA
least privilege
root-user protection
```

### Multi-Account
AWS recommends multiple accounts as isolation/resource boundaries and Control Tower as a landing-zone governance option.

### Networking
A public subnet is a subnet whose route table routes internet-bound traffic to an Internet Gateway.

### Messaging
AWS's decision guidance distinguishes:

```text
SQS → queue
SNS → pub/sub
EventBridge → event routing
```

### DynamoDB
Global tables support multi-Region replication. Modern global-table capabilities continue to evolve, so confirm exact consistency/Region features for the target deployment.

### Bedrock
Bedrock includes capabilities for foundation-model applications, Knowledge Bases/RAG, Guardrails, and evaluation.

## Accuracy Rule

AWS evolves continuously.

Before production design, verify:
- target Region availability
- service quotas
- pricing
- feature release date
- exact SLA
- current API/version documentation
