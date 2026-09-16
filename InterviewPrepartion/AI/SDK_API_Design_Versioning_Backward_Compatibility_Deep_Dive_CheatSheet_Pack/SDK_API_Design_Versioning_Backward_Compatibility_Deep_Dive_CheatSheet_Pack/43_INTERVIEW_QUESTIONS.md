# SDK API Design & Versioning — Interview Q&A

## 1. How do you keep an SDK stable?

Small public surface, additive evolution, deprecation, SemVer, contract tests.

## 2. What is behavioral compatibility?

Same call continues to mean the same thing.

## 3. Why can adding enum value be breaking?

Consumers may use exhaustive switches.

## 4. What is capability negotiation?

Discovering supported behavior rather than guessing from version.

## 5. How do you evolve schemas?

Add optional fields, tolerate unknown fields, avoid reusing semantics.

## 6. How do you evolve tool schemas?

Prefer optional additions; version breaking arg/result changes.

## 7. What is a compatibility shim?

Adapter preserving old calls while delegating to new implementation.

## 8. Why are defaults dangerous?

Changing defaults can change behavior without compile errors.

## 9. Source vs binary compatibility?

Source means code recompiles; binary means already compiled clients still run.

## 10. How do you deprecate?

Announce, mark, replace, document migration, remove later.

## 11. How do you handle old server/new client?

Capability detection and graceful degradation.

## 12. What should be in release notes?

Added/changed/deprecated/removed/fixed plus migration impact.

## 13. Why keep provider types private?

Provider churn should not force public SDK churn.

## 14. How do you test compatibility?

Golden wire fixtures, old/new version matrix, contract tests.

## 15. One-line principle?

> Evolve additively, deprecate deliberately, and break only with a migration path.
