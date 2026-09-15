# Cross-MFE Communication

## Options

```text
URL / route
CustomEvent
pub/sub
shared utility module
shared browser API
backend-mediated state
```

## Prefer

Contracts that are:

```text
small
typed
versioned
asynchronous where useful
```

## Event Example

```javascript
window.dispatchEvent(
  new CustomEvent("cart:item-added", {
    detail: { productId: "P1" }
  })
);
```

## Trap

Global event buses can become invisible coupling.
