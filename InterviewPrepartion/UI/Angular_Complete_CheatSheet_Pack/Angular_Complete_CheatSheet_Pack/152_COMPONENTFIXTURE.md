# ComponentFixture

## What / Why

Provides test component instance and DOM/native element.

## Mental Model

```text
fixture.componentInstance
```

## Example / Recall

```ts
// Minimal recall example for: ComponentFixture
// Prefer the concrete Angular API described in the section above.
```

## When to Use

Use when testing Angular rendering.

## Common Mistake / Interview Trap

In zoneless tests, prefer natural stabilization over forcing detectChanges everywhere.

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

> **ComponentFixture:** Provides test component instance and DOM/native element.
