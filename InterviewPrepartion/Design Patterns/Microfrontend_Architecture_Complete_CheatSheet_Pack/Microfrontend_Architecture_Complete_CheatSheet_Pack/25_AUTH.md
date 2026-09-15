# Authentication / Authorization

## Recommended Shape

```text
Identity Provider
      ↓
Shell / Auth Utility
      ↓
Stable Auth Context
      ↓
MFEs
```

## Shared

```text
user identity
access token strategy
permissions / entitlements
logout lifecycle
```

## Avoid

Each MFE implementing independent auth login logic.

## Security Rule

Authorization must still be enforced by backend services.

Frontend checks are UX controls, not security boundaries.
