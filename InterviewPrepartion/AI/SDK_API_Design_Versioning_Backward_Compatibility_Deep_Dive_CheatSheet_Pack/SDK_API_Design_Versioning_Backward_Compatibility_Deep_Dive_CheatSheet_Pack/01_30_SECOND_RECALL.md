# SDK API Design & Versioning — 30-Second Recall

## Recall

```text
Stable SDK =
Small Public Surface
+ Additive Evolution
+ Semantic Versioning
+ Deprecation
+ Capability Negotiation
+ Contract Tests
+ Migration Guides
```

## 30-Second Interview Answer

> I keep the public Agent SDK surface deliberately small and provider-neutral. I prefer additive evolution, use semantic versioning, deprecate before removing, keep error/event/schema changes backward compatible, and expose capability negotiation when server or provider features vary. Every release runs compatibility tests across supported versions and languages, and major breaking changes ship with migration adapters and explicit guides.

## Do Not Forget

- Public API is a contract.
- Behavioral breakage matters even when code compiles.
- Adding an enum value can break consumers.
- Changing defaults can be breaking.
- Server/client compatibility needs explicit policy.
- Deprecation without migration path is poor SDK design.
