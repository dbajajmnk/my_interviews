# Key Derivation Function API — Final in Java 25

## What

KDF APIs derive one or more cryptographic keys from secret key material plus context/data.

## Concept

```text
Input Secret
 + Salt / Context
 + Parameters
      ↓
     KDF
      ↓
Derived Key Material
```

## Why

Used in modern protocols and cryptographic constructions.

Examples include HKDF-based workflows.

## Important Distinction

```text
KDF → derives keys
KEM → establishes/encapsulates shared secret
Encryption → protects data confidentiality
```

## Security Rule

Use standard algorithms and trusted providers.

Never invent your own derivation protocol.

## Interview Trap

PBKDF2 and KDF use cases overlap conceptually but are not automatically the same API migration story.
