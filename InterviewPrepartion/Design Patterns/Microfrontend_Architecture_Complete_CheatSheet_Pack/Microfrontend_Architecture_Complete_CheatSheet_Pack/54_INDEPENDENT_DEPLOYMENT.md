# Independent Deployment

## True Independence

Team can deploy:

```text
MFE A v42
```

without rebuilding:

```text
MFE B
MFE C
Shell
```

provided contracts remain compatible.

## Requires

```text
runtime mapping
stable contracts
backward compatibility
independent CI
observability
rollback
```

## Trap

Independent repository != independent deployment.
