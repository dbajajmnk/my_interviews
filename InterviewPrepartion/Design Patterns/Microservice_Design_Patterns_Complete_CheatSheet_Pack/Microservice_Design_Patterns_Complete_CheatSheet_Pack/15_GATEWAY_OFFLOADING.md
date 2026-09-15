# Gateway Offloading

## Intent
Move common edge work out of services.

Examples:
```text
TLS
authentication checks
rate limiting
compression
CORS
request logging
```

## Benefit
Reduces duplication.

## Trap
Security-sensitive decisions still need backend enforcement where appropriate.
