# SDK Versioning & Compatibility — 60-Second Recall

## Formula

```text
Small Surface + Additive Evolution + SemVer + Deprecation + Capabilities + Contract Tests
```

## 60-Second Answer

> I classify compatibility across source, binary, behavior, and wire format. I prefer additive changes, deprecate before removal, use capability negotiation in mixed-version environments, and test old/new client-runtime combinations.

## Recall Points

- Changing defaults can break behavior.
- Enum additions can break exhaustive consumers.
- Version event/tool schemas.
- Breaking change needs migration path.
