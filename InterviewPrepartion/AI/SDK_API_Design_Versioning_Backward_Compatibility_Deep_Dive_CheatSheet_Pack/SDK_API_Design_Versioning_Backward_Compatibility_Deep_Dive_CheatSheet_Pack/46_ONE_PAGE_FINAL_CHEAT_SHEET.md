# SDK API Design, Versioning & Backward Compatibility — One-Page Final Cheat Sheet

## Formula

```text
Stable SDK =
Small Public Surface
+ Additive Changes
+ SemVer
+ Deprecation
+ Capability Negotiation
+ Compatibility Tests
+ Migration Path
```

## Compatibility Types

- Source
- Binary
- Behavioral
- Wire

## Production Rules

1. Every public symbol is a contract.
2. Prefer additive changes.
3. Do not leak provider types.
4. Version schemas/events/errors deliberately.
5. Unknown fields/events should be tolerated where extensible.
6. Changing defaults can be breaking.
7. Deprecate before remove.
8. Use capability negotiation for mixed environments.
9. Test old/new combinations.
10. Every breaking change needs a migration path.

## 30-Second Answer

> I keep the public Agent SDK surface small, provider-neutral and intentionally stable. I classify changes across source, binary, behavioral and wire compatibility, prefer additive evolution, use semantic versioning, deprecate before removal, and expose capability negotiation for mixed server/provider versions. Schema, event, error and tool-contract changes are covered by compatibility tests across supported languages and versions, and any breaking major release ships with adapters, release notes and a clear migration guide.

## Recall Line

> **Evolve additively, deprecate deliberately, and break only with a migration path.**
