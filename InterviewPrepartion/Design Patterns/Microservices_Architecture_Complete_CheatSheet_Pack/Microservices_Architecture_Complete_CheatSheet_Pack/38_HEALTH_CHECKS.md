# Health Checks

## Liveness

```text
Should process be restarted?
```

## Readiness

```text
Can this instance serve traffic?
```

## Startup

```text
Has initialization completed?
```

## Trap

Do not make liveness depend on every remote service; one dependency failure can trigger restart storms.
