# Import Maps

## What

Map JavaScript module specifiers to URLs at runtime.

## Example

```html
<script type="importmap">
{
  "imports": {
    "@company/cart":
      "https://cdn.example.com/cart/v42/cart.js"
  }
}
</script>
```

## Benefit

Runtime redirection without rebuilding every consumer.

## Good Uses

```text
MFE loading
shared library mapping
local development overrides
progressive deployment
```

## Trap

Import maps solve module resolution, not orchestration, ownership, or state design.
