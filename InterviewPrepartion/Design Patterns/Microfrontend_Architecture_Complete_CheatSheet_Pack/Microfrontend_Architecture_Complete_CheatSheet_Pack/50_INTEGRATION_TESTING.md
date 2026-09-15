# Integration Testing

## Verify

```text
shell + one MFE
MFE + auth utility
MFE + design system
MFE + deployed dependencies
```

## Strategy

Test one changed MFE against stable deployed versions of others when possible.

## Trap

Spinning up every repository locally for every test destroys developer speed.
