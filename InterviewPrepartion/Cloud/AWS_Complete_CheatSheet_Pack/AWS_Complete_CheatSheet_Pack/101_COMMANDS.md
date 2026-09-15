# AWS CLI / Commands Recall

## Identity

```bash
aws sts get-caller-identity
```

## Regions

```bash
aws ec2 describe-regions
```

## S3

```bash
aws s3 ls
aws s3 cp file.txt s3://bucket/
aws s3 sync ./dist s3://bucket/
```

## EC2

```bash
aws ec2 describe-instances
```

## CloudFormation

```bash
aws cloudformation describe-stacks
```

## Lambda

```bash
aws lambda list-functions
```

## ECS

```bash
aws ecs list-clusters
```

## EKS

```bash
aws eks list-clusters
```

## Logs

```bash
aws logs describe-log-groups
```

## Rule

Use named profiles/SSO/federation rather than embedding static credentials in scripts.
