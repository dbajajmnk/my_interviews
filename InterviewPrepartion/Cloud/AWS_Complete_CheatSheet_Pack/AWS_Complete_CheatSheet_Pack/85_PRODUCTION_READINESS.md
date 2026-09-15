# AWS Production Readiness Checklist

## Identity

- [ ] federation / IAM Identity Center
- [ ] MFA
- [ ] workload roles
- [ ] least privilege
- [ ] root protected

## Network

- [ ] multi-AZ
- [ ] minimal public exposure
- [ ] VPC endpoints where useful
- [ ] SG reviewed
- [ ] DNS/failover tested

## Data

- [ ] encryption
- [ ] backup
- [ ] restore tested
- [ ] retention/lifecycle
- [ ] RTO/RPO

## Operations

- [ ] metrics/logs/traces
- [ ] alarms
- [ ] CloudTrail
- [ ] patching
- [ ] runbooks

## Delivery

- [ ] IaC
- [ ] CI/CD
- [ ] rollback
- [ ] canary/blue-green

## Cost

- [ ] tags
- [ ] budgets
- [ ] right-sizing
- [ ] data-transfer review
