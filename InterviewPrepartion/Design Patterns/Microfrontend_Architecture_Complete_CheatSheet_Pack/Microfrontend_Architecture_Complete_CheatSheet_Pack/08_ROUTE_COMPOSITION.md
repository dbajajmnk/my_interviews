# Route-Based Composition

## Example

```text
/products/*  → Product MFE
/cart/*      → Cart MFE
/account/*   → Account MFE
/admin/*     → Admin MFE
```

## Benefits

- strong isolation
- minimal shared UI state
- clear ownership
- lazy loading
- easier independent deployment

## Best Default

For many large apps, route-level splitting is the cleanest first boundary.

## Trap

Do not create cross-route hidden state dependencies.
