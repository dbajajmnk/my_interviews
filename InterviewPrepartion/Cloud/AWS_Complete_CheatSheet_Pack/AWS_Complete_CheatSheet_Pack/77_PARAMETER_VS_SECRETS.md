# Parameter Store vs Secrets Manager

| Parameter Store | Secrets Manager |
|---|---|
| configuration/parameters | secret lifecycle |
| secure strings supported | secret rotation capabilities |
| Systems Manager feature | dedicated secret service |

## Use

```text
non-secret config → Parameter Store/app config approach
rotating DB/API secret → Secrets Manager
```

## Trap

Do not choose only by price; lifecycle/rotation/access requirements matter.
