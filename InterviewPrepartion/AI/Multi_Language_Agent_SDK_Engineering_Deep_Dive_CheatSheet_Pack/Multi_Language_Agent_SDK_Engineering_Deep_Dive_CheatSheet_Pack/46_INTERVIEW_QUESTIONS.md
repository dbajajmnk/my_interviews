# Multi-Language Agent SDK Engineering — Interview Q&A

## 1. How do you design one SDK for four languages?

Define one canonical semantic contract, then implement idiomatic APIs per language.

## 2. Should method names/signatures be identical?

No. Semantics should match; syntax should feel native.

## 3. How do you normalize streaming?

Common event model mapped to AsyncIterator, Flow.Publisher, IAsyncEnumerable and AsyncIterable.

## 4. How do you normalize cancellation?

Common cancellation semantics mapped to each language's native mechanism.

## 5. How do you handle errors?

Shared error taxonomy/code/retryability with native exception mechanisms.

## 6. What belongs in public API?

Stable Agent, Tool, Run, Context, Result, Events and adapter abstractions.

## 7. Why provider adapters?

To isolate vendor changes and keep public contracts neutral.

## 8. Codegen or handwritten?

Generate transport/mechanical types; handcraft developer-facing APIs.

## 9. How do you guarantee parity?

Shared fixtures, contract tests, feature matrix and CI parity gate.

## 10. How do you publish?

Native registries: PyPI, Maven, NuGet, npm.

## 11. How do you version?

SemVer with explicit compatibility matrix and deprecation policy.

## 12. How do you test cross-language serialization?

Canonical JSON/wire fixtures executed by every SDK.

## 13. How do you handle structured output?

Canonical schema with idiomatic typed wrappers plus runtime validation.

## 14. What is the biggest mistake?

Forcing one language's design style onto every ecosystem.

## 15. One-line principle?

> One semantic contract, four idiomatic developer experiences.
