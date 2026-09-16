# Tool Error Model

## Normalize Errors

Useful categories:
- ValidationError
- AuthenticationError
- AuthorizationError
- NotFoundError
- RateLimitError
- TimeoutError
- DependencyError
- ConflictError
- PolicyDeniedError

## Why Normalize

The model/runtime should receive stable error semantics instead of raw provider-specific stack traces.

## Model-Facing Error

Return enough information for recovery without leaking:
- secrets;
- internal stack traces;
- sensitive identifiers.
