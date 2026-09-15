# Host / Remote / Shared Dependencies

## Concepts

```text
Host
 = consuming application

Remote
 = runtime-provided module

Shared
 = dependency reused across builds
```

## Typical Shared Dependencies

```text
react
react-dom
angular core
vue
router/runtime libraries
```

## Risks

```text
version mismatch
singleton assumptions
hidden coupling
remote unavailable
```

## Rule

Share only dependencies where duplication is costly and compatibility is well-governed.
