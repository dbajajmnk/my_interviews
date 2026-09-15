# Java 17 Interview Traps

1. Sealed classes control inheritance, not immutability.
2. Records are shallowly immutable.
3. Records can implement interfaces.
4. Records cannot extend arbitrary classes.
5. Pattern matching for `switch` is preview in Java 17.
6. Pattern matching for `instanceof` is final before Java 17.
7. `var` is compile-time inference, not dynamic typing.
8. `var` cannot be used for fields.
9. `List.of()` is unmodifiable.
10. Unmodifiable does not mean deep immutable.
11. Stream `toList()` should not be assumed equivalent to mutable collectors.
12. JPMS module != Maven module.
13. `exports` != `opens`.
14. Strong encapsulation may break reflective legacy libraries.
15. `--add-opens` is a bridge, not ideal permanent design.
16. HTTP Client supports async calls with CompletableFuture.
17. `LocalDateTime` still has no timezone.
18. Helpful NPE improves diagnostics, not null-safety.
19. Security Manager is deprecated for removal in Java 17.
20. RandomGenerator is not automatically cryptographically secure.
21. Modern Java syntax does not automatically improve performance.
22. Java 17 migration risk is frequently library/framework compatibility.
