# IAM / Federation / Roles

## Preferred Human Access

```text
Identity Provider
  ↓
IAM Identity Center / federation
  ↓
temporary credentials
```

## Preferred Workload Access

```text
EC2 / Lambda / ECS / EKS workload
  ↓
IAM Role
  ↓
temporary credentials
```

## Avoid

Long-lived access keys when roles/federation can be used.

## Core Concepts

```text
User
Group
Role
Policy
Resource Policy
Permission Boundary
Session Policy
```

## Best Practices

```text
MFA
least privilege
temporary credentials
Access Analyzer
remove unused access
protect root
```
