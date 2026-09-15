# DomSanitizer

## What / Why

Explicitly sanitizes or marks values trusted.

## Mental Model

```text
DomSanitizer
```

## Example / Recall

```ts
// Minimal recall example for: DomSanitizer
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use only when integrating trusted content/resource URLs.

## Common Mistake / Interview Trap

bypassSecurityTrust* transfers security responsibility to you.

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

> **DomSanitizer:** Explicitly sanitizes or marks values trusted.
