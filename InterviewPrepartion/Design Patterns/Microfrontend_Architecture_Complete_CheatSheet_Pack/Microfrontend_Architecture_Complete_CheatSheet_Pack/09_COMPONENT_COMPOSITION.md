# Component-Based Composition

## Example

One page:

```text
Dashboard
 ├── Sales MFE
 ├── Alerts MFE
 ├── Activity MFE
 └── Recommendations MFE
```

## Benefits

Fine-grained composition.

## Costs

```text
more communication
shared layout coupling
more runtime dependencies
harder testing
harder performance control
```

## Rule

Use when component ownership truly needs independent deployment.

## Trap

Do not split purely reusable widgets into independently deployed MFEs.
