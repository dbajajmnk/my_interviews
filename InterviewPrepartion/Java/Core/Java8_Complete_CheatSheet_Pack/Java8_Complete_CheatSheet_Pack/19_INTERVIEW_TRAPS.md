# Java 8 Interview Traps

1. Lambda requires a functional-interface target type.
2. Functional interface can still contain default/static methods.
3. Captured local variables must be final/effectively final.
4. `this` in a lambda refers to the enclosing object.
5. Stream intermediate operations are generally lazy.
6. A consumed stream cannot normally be reused.
7. Stream does not modify the source unless your own side effects do.
8. `map()` != `flatMap()`.
9. `peek()` is not meant as the main business side-effect mechanism.
10. Parallel stream is not automatically faster.
11. Avoid shared mutable state in parallel pipelines.
12. `Optional.of(null)` throws.
13. `orElse()` may evaluate fallback even when value is present.
14. `LocalDateTime` has no zone.
15. `Instant` represents a machine timestamp.
16. Default methods mainly enabled interface evolution.
17. Class methods override conflicting interface defaults.
18. `thenApply` != `thenCompose`.
19. CompletableFuture default executor strategy matters.
20. Base64 is not encryption.
21. Metaspace replaced PermGen.
22. Nashorn is historical, not a current recommendation.
