# Claim Check

## Problem
Message payload is too large.

## Pattern
```text
Producer
 ↓ store payload
Object Store
 ↓ returns reference
Small Message with reference
 ↓
Consumer fetches payload
```

## Good
Large files/documents.

## Trap
Manage lifecycle/security of the stored payload.
