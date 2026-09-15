# Java 21 Interview Traps

1. Virtual threads are final in Java 21.
2. Virtual threads do not make CPU-bound code faster.
3. Virtual threads do not remove DB pool limits.
4. Pattern Matching for switch is final in Java 21.
5. Record Patterns are final in Java 21.
6. Scoped Values are preview in Java 21.
7. Structured Concurrency is preview in Java 21.
8. FFM API is third preview in Java 21.
9. Vector API is sixth incubator in Java 21.
10. String Templates are preview in Java 21, not final.
11. String Templates were later withdrawn before finalization.
12. Unnamed Patterns/Variables are preview in Java 21.
13. Unnamed Classes/Instance Main are preview in Java 21.
14. Sequenced collections add common first/last/reverse semantics.
15. `reversed()` may be a view.
16. Generational ZGC is about GC efficiency/latency, not application logic.
17. KEM is about key establishment/encapsulation.
18. Randomness/crypto APIs must be selected based on security requirements.
19. Dynamic agent loading behavior is tightening.
20. Preview features require explicit compile/runtime flags.
21. LTS does not mean every feature inside the release is final.
22. Migration to Java 21 does not require immediate adoption of every Java 21 feature.
