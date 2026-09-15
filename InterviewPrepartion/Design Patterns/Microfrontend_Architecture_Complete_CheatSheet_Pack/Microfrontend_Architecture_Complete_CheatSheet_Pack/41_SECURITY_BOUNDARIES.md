# Security Boundaries

## Browser Reality

MFEs running in the same page often share the same JavaScript security context.

## Risks

```text
XSS
malicious remote
token theft
DOM tampering
dependency compromise
```

## Stronger Isolation

Use iframe/origin boundaries when required.

## Rule

Microfrontend boundaries are organizational/runtime boundaries, not necessarily security boundaries.
