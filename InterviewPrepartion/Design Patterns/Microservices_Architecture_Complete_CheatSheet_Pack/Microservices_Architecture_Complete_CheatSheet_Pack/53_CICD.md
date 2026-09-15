# CI/CD for Microservices

## Pipeline

```text
Commit
 ↓
Build
 ↓
Unit
 ↓
Security Scan
 ↓
Contract Tests
 ↓
Integration
 ↓
Package
 ↓
Deploy
 ↓
Canary
 ↓
Observe
```

## Goal

Independent deployability requires independent pipelines.

## Trap

If every service release requires a synchronized mega-release, autonomy is lost.
