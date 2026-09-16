# Authentication and Authorization

## Authentication

Who is the user/workload?

## Authorization

What is that identity allowed to do?

## Tool Flow

```text
Authenticated identity
      ↓
Requested tool
      ↓
Permission check
      ↓
Allowed?
 ├─ no → deny
 └─ yes → execute
```

## Rule

The model must never be the final source of truth for permissions.

## Least Privilege

Use narrow credentials and scopes per tool.
