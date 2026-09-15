# Shell / Container Architecture

## Role

The shell provides application-wide composition.

```text
Shell
 ├── navigation
 ├── route orchestration
 ├── authentication bootstrap
 ├── global error handling
 ├── telemetry bootstrap
 └── MFE loading
```

## Avoid

Putting domain logic into shell.

## Rule

Shell should be:

```text
thin
stable
platform-oriented
```

## Trap

A fat shell becomes the new frontend monolith.
