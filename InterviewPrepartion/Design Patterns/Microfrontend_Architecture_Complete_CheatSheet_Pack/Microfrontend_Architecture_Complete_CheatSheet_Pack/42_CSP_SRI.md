# CSP / SRI / Trusted Sources

## CSP

Restrict where resources/scripts can load from.

## SRI

Integrity metadata can verify static third-party assets where applicable.

## Runtime Federation Challenge

Dynamic remote locations require deliberate trust management.

## Checklist

```text
trusted CDN
HTTPS
CSP
allowlist
asset immutability
signed/reviewed pipeline
```

## Trap

Allowing arbitrary remote script origins defeats frontend supply-chain controls.
