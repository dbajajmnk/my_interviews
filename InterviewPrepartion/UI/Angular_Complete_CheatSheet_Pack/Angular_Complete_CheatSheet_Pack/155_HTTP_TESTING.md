# HTTP Testing

## What / Why

Use HttpTestingController/provideHttpClientTesting.

## Mental Model

```text
expectOne → flush
```

## Example / Recall

```ts
// Minimal recall example for: HTTP Testing
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use to verify requests deterministically.

## Common Mistake / Interview Trap

Do not hit real APIs in unit tests.

## Production Questions

```text
Who owns this state/behavior?
What triggers change detection?
Is this Signal state or RxJS stream state?
What happens during SSR/hydration?
How is this tested?
What is the loading/error state?
Does this create unnecessary coupling or subscriptions?
```

## 20-Second Recall

> **HTTP Testing:** Use HttpTestingController/provideHttpClientTesting.
