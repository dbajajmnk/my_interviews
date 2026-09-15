# CI/CD on AWS

## Generic Pipeline

```text
Source
 ↓
Build
 ↓
Test
 ↓
Security Scan
 ↓
Package
 ↓
Deploy
 ↓
Canary
 ↓
Observe
```

## AWS Services

Commonly:

```text
CodePipeline
CodeBuild
CodeDeploy
ECR
CloudFormation/CDK
```

plus external CI systems.

## Rule

Deployment automation should include rollback and observability.
