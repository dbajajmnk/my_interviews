# Multi-Language Agent SDK Engineering — 30-Second Recall

## Recall

```text
Multi-Language SDK =
One Semantic Contract
+ Four Idiomatic APIs
+ Shared Compatibility Rules
+ Shared Fixtures
+ Per-Language Packaging
+ Release Parity
```

## 30-Second Interview Answer

> I design one canonical semantic contract for Agent, Tool, Run, Context, Events, Errors and Results, then map it idiomatically into Python, Java, C# and TypeScript. I do not force identical syntax across languages. Instead I preserve equivalent behavior, shared wire formats, consistent error semantics, streaming/cancellation support, and common contract fixtures. Each SDK is packaged and released through its native ecosystem, with parity tests and a compatibility matrix preventing drift.

## Do Not Forget

- Same semantics ≠ same method signatures.
- Async models differ by language.
- Streaming abstractions differ by ecosystem.
- Error models must normalize provider/runtime failures consistently.
- Public types should be provider-neutral.
- Release parity needs automation.
