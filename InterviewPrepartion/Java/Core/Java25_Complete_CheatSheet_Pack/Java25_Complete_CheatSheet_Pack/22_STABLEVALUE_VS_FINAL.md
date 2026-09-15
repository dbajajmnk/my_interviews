# StableValue vs `final`

| `final` field | StableValue |
|---|---|
| assigned during initialization | can be initialized later |
| constant reference after assignment | set at most once |
| simple and final API | preview API |
| ideal default | useful for deferred constants |

## Core Idea

```text
final
= immediate immutability

StableValue
= deferred immutability
```

## Rule

Prefer `final` when eager initialization is practical.

Do not introduce preview complexity without a real lazy-initialization need.
