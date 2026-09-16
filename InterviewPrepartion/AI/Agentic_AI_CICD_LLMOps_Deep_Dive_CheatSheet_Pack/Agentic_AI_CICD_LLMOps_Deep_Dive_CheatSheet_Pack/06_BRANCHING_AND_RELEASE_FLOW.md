# Branching and Release Flow

## Simple Flow

```text
feature/*
   ↓ PR
develop
   ↓ tested promotion
uat/staging
   ↓ approval
main/master
   ↓ release tag
production
```

## Rule

Use the lightest branching model that still provides review, traceability and environment control.
