# Versioning / Backward Compatibility

## Public Interface

Each MFE should expose the smallest possible public contract.

## Compatibility

Prefer:

```text
additive changes
optional fields
stable events
semantic versioning where appropriate
```

## Runtime Concern

Old host may meet new remote.

New host may meet old remote.

Design for overlap.

## Trap

Runtime federation creates temporal version compatibility requirements.
