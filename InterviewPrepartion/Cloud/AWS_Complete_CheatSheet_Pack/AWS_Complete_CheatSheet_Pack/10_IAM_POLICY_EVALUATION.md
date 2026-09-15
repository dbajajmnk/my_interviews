# IAM Policy Evaluation

## Policy Components

```json
{
  "Effect": "Allow",
  "Action": "s3:GetObject",
  "Resource": "arn:aws:s3:::bucket/*"
}
```

## Key Rule

```text
Explicit Deny
beats
Allow
```

## Decision Concept

```text
Identity Policy
Resource Policy
SCP
Permission Boundary
Session Policy
Conditions
        ↓
Effective Access
```

## Conditions

Use for:

```text
source IP
VPC endpoint
MFA
tags
principal
region
```

## Trap

IAM debugging requires evaluating all applicable policy types, not only the user/role policy.
