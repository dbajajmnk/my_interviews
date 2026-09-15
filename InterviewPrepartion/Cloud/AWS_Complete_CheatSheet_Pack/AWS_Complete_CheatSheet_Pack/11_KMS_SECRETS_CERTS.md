# KMS / Secrets / Certificates

## AWS KMS

Manages encryption keys and cryptographic operations.

## Secrets Manager

Stores and can rotate secrets.

## ACM

Manages TLS certificates for integrated AWS services.

## Pattern

```text
Application
  ↓ IAM
Secrets Manager
  ↓
encrypted with KMS
```

## Rule

Do not hardcode:

```text
passwords
API keys
private keys
DB credentials
```

## Trap

KMS encrypts/protects key usage; it is not a general secret-store replacement.
