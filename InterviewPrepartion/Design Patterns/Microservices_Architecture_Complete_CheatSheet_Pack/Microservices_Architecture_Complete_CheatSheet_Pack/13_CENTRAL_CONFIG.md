# Centralized Configuration

## Goal

Externalize environment-specific configuration.

```text
Code
+
Config
+
Secrets
```

## Config Examples

```text
timeouts
feature flags
URLs
pool sizes
environment values
```

## Secrets

Keep separate:

```text
passwords
tokens
certificates
keys
```

## Trap

A central config system becomes a critical dependency; design caching, availability, and bootstrap carefully.
