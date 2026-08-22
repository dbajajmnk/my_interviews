# Day 09 — Modules, ESM/CommonJS, npm, tsconfig Paths, Project References & Build Tooling

**Module:** M08 — Modules, Packages, Build & Dependency Management  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units and integrate them into one interview-ready TypeScript mental model.

## Topic Units

1. [ES modules](01-ES-modules.md)
2. [CommonJS awareness](02-CommonJS-awareness.md)
3. [TypeScript module emit](03-TypeScript-module-emit.md)
4. [moduleResolution modes](04-moduleResolution-modes.md)
5. [package.json type](05-package-json-type.md)
6. [exports and types fields awareness](06-exports-and-types-fields-awareness.md)
7. [DefinitelyTyped](07-DefinitelyTyped.md)
8. [@types packages](08-types-packages.md)
9. [Ambient declarations](09-Ambient-declarations.md)
10. [Declaration files](10-Declaration-files.md)
11. [npm dependencies](11-npm-dependencies.md)
12. [devDependencies](12-devDependencies.md)
13. [peerDependencies awareness](13-peerDependencies-awareness.md)
14. [SemVer](14-SemVer.md)
15. [Lockfiles](15-Lockfiles.md)
16. [npm ci](16-npm-ci.md)
17. [Path aliases](17-Path-aliases.md)
18. [baseUrl awareness](18-baseUrl-awareness.md)
19. [Project references](19-Project-references.md)
20. [Composite projects](20-Composite-projects.md)
21. [Incremental builds](21-Incremental-builds.md)
22. [Bundlers awareness](22-Bundlers-awareness.md)
23. [Tree shaking](23-Tree-shaking.md)
24. [Source maps](24-Source-maps.md)
25. [Supply-chain risk](25-Supply-chain-risk.md)

---

# 2. Real-Life Analogy

The compiler and runtime each need to resolve modules correctly; a path alias understood only by TypeScript is like a nickname unknown to the delivery driver.

---

# 3. Visualization

```text
Import → TS Module Resolution → Emit → Node/Bundler Resolution → Runtime
```

---

# 4. Mind Map

```text
Modules, ESM/CommonJS, npm, tsconfig Paths, Project References & Build Tooling
├── Type-System Guarantee
├── Emitted JavaScript
├── Runtime Validation Boundary
├── Implementation
├── Failure / Edge Cases
├── Debugging
├── Code Review
├── AI Evaluation
├── Production Usage
└── Interview Defense
```

---

# 5. Two-Hour Execution Plan

```text
00–15 min  Rapid recall / topic scan
15–55 min  P0 topic units + examples
55–85 min  Hands-on implementation/debugging
85–105 min Google interview drill
105–115 min Questions/follow-ups
115–120 min Readiness gate + repair note
```

Broad P1 topics are awareness-first. Do not sacrifice P0 correctness to memorize type-system trivia.

---

# 6. Engineering Integration

Connect:

> **Requirement → Static Type Invariant → Runtime Boundary → JavaScript Behavior → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Build a multi-package TypeScript project with project references, ESM output, declaration files, and reproducible npm install.

---

# 8. Google Interview Drill

Production runtime cannot resolve a `paths` alias that TypeScript accepted. Explain compiler path mapping vs runtime/bundler resolution.

Use:

> **Clarify → First Approach → Improve → Code/Design → Type-Check → Run/Test → Edge Cases → Runtime Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Treating TypeScript types as runtime guards.
- Replacing evidence with `any`, assertions, or `!`.
- Forgetting JavaScript event-loop/memory/module behavior.
- Sharing internal types across boundaries without runtime/schema contracts.
- Building type-level complexity that exceeds business value.
- Ignoring framework/package/runtime version differences.

---

# 10. Day-Level Best Practices

- Strict mode by default.
- `unknown` at uncertain boundaries.
- Runtime validation at external boundaries.
- Keep types readable and stable.
- Preserve JavaScript/Node runtime literacy.
- Use type-level abstraction only when it reduces real duplication/risk.
- Evidence First / No Bluff.

---

# 11. Interview Questions

1. Explain the three most important topics from today in 60 seconds each.
2. Which parts disappear after compilation?
3. What could still fail at runtime?
4. What boundary needs runtime validation?
5. What would you review in AI-generated code?
6. What trade-off would make you simplify the type design?

---

# 12. Google-Level Follow-Ups

1. What changes if the input comes from JSON/network/database?
2. What changes if strict mode is enabled?
3. What changes for a library vs an application?
4. What happens if JavaScript callers bypass your types?
5. What would you measure if compiler performance is slow?
6. What would you measure if runtime performance is slow?

---

# 13. Quick Revision

```text
What does the type checker know?
What gets emitted?
What exists at runtime?
Where is data validated?
What can still fail?
How do I debug it?
What do I review?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed hands-on work.
- [ ] I completed the Google drill.
- [ ] I can distinguish static vs runtime guarantees.
- [ ] I can survive two follow-up changes.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topics.
