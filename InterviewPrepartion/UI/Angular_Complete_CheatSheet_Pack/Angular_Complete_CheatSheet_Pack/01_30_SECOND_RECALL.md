# Angular — 30-Second Recall

## Formula

```text
Component
+ Template
+ Signals/RxJS
+ DI
+ Router
+ Forms
+ HttpClient
+ Change Detection
= Angular Application
```

## Angular 22 Modern Baseline

```text
Standalone default
Zoneless default
OnPush default
Signals first-class
Signal Forms stable
resource / httpResource stable
Vitest default
Built-in @if / @for / @switch / @defer
SSR + hydration + incremental hydration
```

## Request / UI Flow

```text
User Event / HTTP / Signal Update
           ↓
Angular receives notification
           ↓
OnPush-targeted change detection
           ↓
Template bindings update
           ↓
DOM
```

## 10-Second Interview Answer

> Angular is a full TypeScript web framework with components, templates, fine-grained signal reactivity, RxJS interoperability, dependency injection, router, forms, HTTP, SSR/hydration, testing, and first-party CLI tooling.
