# Key Encapsulation Mechanism (KEM) API — Final in Java 21

## What

KEM APIs support cryptographic key encapsulation workflows.

## Conceptual Flow

```text
Receiver Key Pair
      ↓
Sender Encapsulates
      ↓
Shared Secret + Encapsulation Message
      ↓
Receiver Decapsulates
      ↓
Same Shared Secret
```

## Why

KEM is important in modern cryptographic protocol design, including post-quantum cryptography work.

## Security Rule

Use vetted algorithms/providers and protocol standards.

Do not invent cryptographic protocols.

## Interview Recall

KEM solves **shared-key establishment/encapsulation**, not general-purpose data encryption by itself.
