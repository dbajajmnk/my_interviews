# Topic 13 — Discriminated unions as State modeling

**Course:** GOJ TypeScript Interview Mastery Course V1  
**Day:** 06 — GoF Behavioral Patterns & TypeScript-Native Pattern Design  
**Module:** M05 — Design Principles & Gang of Four Patterns  
**Priority:** P0  
**Standard:** GOJ Signature Topic Sequence

---

# 1. What

**Discriminated unions as State modeling** is union whose members carry a common literal discriminator.

---

# 2. Why

Interviewers use **Discriminated unions as State modeling** to test whether you understand both TypeScript's compile-time guarantees and the emitted JavaScript/runtime behavior. Senior answers must distinguish static safety from runtime truth.

---

# 3. Plain English

Plain English: **Discriminated unions as State modeling** means union whose members carry a common literal discriminator. TypeScript can prove some relationships before execution, but it cannot make unvalidated external data or runtime effects safe by declaration alone.

---

# 4. Engineering Explanation

switch/if on discriminator narrows to exact variant and enables exhaustiveness

Senior response model:

> **Static Guarantee → Runtime Boundary → Cost → Failure → Alternative → Production Evidence**

Always separate:

- TypeScript checker behavior;
- emitted JavaScript;
- JavaScript/Node/browser runtime behavior;
- framework/library behavior;
- real runtime data.

---

# 5. Syntax

```typescript
type Result={kind:'ok';value:string}|{kind:'err';error:Error};
```

Explain what remains after emit and whether this syntax creates any runtime guard or object.

---

# 6. Internal Working

- switch/if on discriminator narrows to exact variant and enables exhaustiveness
- Identify which part exists only in the type checker and which part exists at runtime.
- For generics/mapped/conditional types, explain inference/assignability rather than pretending the runtime knows the generic type.
- For external data, state where runtime validation establishes the invariant.
- For performance, distinguish compiler/editor cost from JavaScript runtime cost.
- For framework decorators or generated code, identify actual emitted/runtime behavior.

---

# 7. Example

```typescript
type Result={kind:'ok';value:string}|{kind:'err';error:Error};
```

Explain:

1. What static type does the compiler see?
2. What JavaScript value/object exists at runtime?
3. What is erased?
4. What can still fail?
5. Which assertion or runtime validator, if any, establishes truth?
6. What is the relevant complexity/resource cost?

---

# 8. Real Project Usage

In real TypeScript systems, this matters for state/result/event modeling.

**Evidence First:** course knowledge is conceptual unless supported by your real project evidence. Never convert the example into a fabricated client claim.

---

# 9. Best Practices

- Prefer `strict` TypeScript and explicit trust boundaries.
- Use inference when it remains obvious; annotate public/stable contracts deliberately.
- Prefer `unknown` over `any` at uncertain boundaries.
- Validate runtime data before treating it as a trusted domain type.
- Keep advanced types simpler than the business API they describe.
- Preserve JavaScript runtime literacy.

---

# 10. Common Mistakes

1. Treating TypeScript as runtime validation.
2. Using `as`, `!`, or `any` to silence evidence rather than prove an invariant.
3. Confusing interface/type aliases with runtime objects.
4. Overengineering generic/conditional types.
5. Ignoring JavaScript async, memory, security, or module behavior.
6. Accepting generated types/packages/APIs without verification.

---

# 11. Debugging

- Reproduce the smallest case involving **Discriminated unions as State modeling**.
- Decide whether the problem is parser/resolution/checker/emit/runtime/data/framework related.
- Use `tsc --noEmit`, source maps, module-resolution diagnostics, tests, runtime stack traces, profiles, or network/DB traces as appropriate.
- Remove unsafe assertions temporarily when they hide the real boundary.
- Add a regression test or runtime schema check where the invariant enters the system.

> **Debug Flow:** Reproduce → Classify Static vs Runtime → Evidence → Hypothesis → Isolate → Fix → Regression → Observe

---

# 12. Code Review

- Does the type express a real invariant or only make code look safe?
- Where does untrusted runtime data enter?
- Is `any` or an assertion leaking unsafety?
- Are generics/utility types simpler than duplicated/manual alternatives?
- Is async behavior, mutation, and error propagation correct?
- What is the runtime performance/security consequence?
- Would a smaller public type surface reduce coupling?

> **Review Priority:** Runtime Correctness → Security → Async/Data → Type Soundness at Boundaries → Failure → Performance → API/Architecture → Tests → Maintainability → Style

---

# 13. AI Evaluation

- Verify generated TypeScript against the actual compiler version and framework/package versions.
- Check invented types, packages, decorators, utility types, and APIs.
- Reject fake runtime safety such as `JSON.parse(...) as DomainType`.
- Run `tsc --noEmit`, tests, lint/security checks, and runtime validation tests.
- Inspect `any`, non-null assertions, casts, and type-level overengineering.
- Verdict: **Accept / Repair / Reject** with evidence.

---

# 14. Interview Questions

1. What is **Discriminated unions as State modeling**?
2. What does TypeScript guarantee here?
3. What remains purely runtime JavaScript behavior?
4. What is a common misuse of **Discriminated unions as State modeling**?
5. Where would you use **Discriminated unions as State modeling** in a real system?
6. What is the main trade-off or alternative?

---

# 15. Practice

Create the smallest strict TypeScript example demonstrating **Discriminated unions as State modeling**. Inspect or reason about the emitted JavaScript. Then introduce one realistic misuse, reproduce the compiler/runtime failure, fix it, and explain which review rule would have caught it.

Use:

> **Clarify → First Approach → Improve → Code → Type-Check → Run/Test → Edge Cases → Complexity/Cost → Trade-Off → Follow-Up → Defend**

---

# 16. Topic Readiness Gate

- [ ] I can define **Discriminated unions as State modeling** in plain English.
- [ ] I can explain the compile-time guarantee.
- [ ] I can explain the runtime JavaScript behavior.
- [ ] I can write/read a minimal example.
- [ ] I can state what is erased.
- [ ] I can identify one common misuse.
- [ ] I can debug one compiler/runtime failure.
- [ ] I can evaluate AI-generated TypeScript involving this topic.
- [ ] I can answer at least 4/6 interview questions without notes.
- [ ] I can state one trade-off.

**READY:** 80%+ with no critical misconception.  
**REPAIR:** fix only this topic before continuing.

---

# 17. Official References

- [TypeScript Handbook](https://www.typescriptlang.org/docs/handbook/intro.html)
- [TypeScript TSConfig Reference](https://www.typescriptlang.org/tsconfig/)
- [ECMAScript Specification](https://tc39.es/ecma262/)
- [Refactoring.Guru Design Patterns (supplementary)](https://refactoring.guru/design-patterns)
