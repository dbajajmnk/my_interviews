# Day 09 — ES Modules, CommonJS, npm, package.json, SemVer, Lockfiles & Build Tooling

**Module:** M08 — Modules, Packages, Build & Dependency Management  
**Duration:** 2 Hours  
**Priority:** P0

---

# 1. Objective

Complete the topic units below, then integrate them into one interview-ready JavaScript mental model.

## Topic Units

1. [ES modules](01-ES-modules.md)
2. [import and export](02-import-and-export.md)
3. [CommonJS awareness](03-CommonJS-awareness.md)
4. [ESM vs CommonJS interoperability](04-ESM-vs-CommonJS-interoperability.md)
5. [package.json](05-package-json.md)
6. [package type](06-package-type.md)
7. [exports field awareness](07-exports-field-awareness.md)
8. [npm scripts](08-npm-scripts.md)
9. [Semantic versioning](09-Semantic-versioning.md)
10. [Dependencies vs devDependencies](10-Dependencies-vs-devDependencies.md)
11. [Peer dependencies awareness](11-Peer-dependencies-awareness.md)
12. [Lockfiles](12-Lockfiles.md)
13. [npm install vs npm ci](13-npm-install-vs-npm-ci.md)
14. [Package resolution](14-Package-resolution.md)
15. [Bundlers awareness](15-Bundlers-awareness.md)
16. [Tree shaking](16-Tree-shaking.md)
17. [Code splitting awareness](17-Code-splitting-awareness.md)
18. [Source maps](18-Source-maps.md)
19. [Dependency supply-chain risk](19-Dependency-supply-chain-risk.md)

---

# 2. Real-Life Analogy

`package.json` and the lockfile are the shipping manifest and exact parts list for your application.

---

# 3. Visualization

```text
Source → ESM/CJS → package.json + lockfile → build/bundle → runtime
```

---

# 4. Mind Map

```text
ES Modules, CommonJS, npm, package.json, SemVer, Lockfiles & Build Tooling
├── Language / Runtime Semantics
├── Syntax / APIs
├── Internal Working
├── Browser / Node Boundary
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
105–115 min Interview questions/follow-ups
115–120 min Readiness gate + repair note
```

For broad days, cover P1 topics at awareness depth first. Do not sacrifice P0 correctness for low-value trivia.

---

# 6. Engineering Integration

For today's topics, connect:

> **Concept → ECMAScript Guarantee → Browser/Node/Engine Boundary → Code → Failure → Debug Evidence → Review Rule → Production Trade-Off**

---

# 7. Hands-On Integration

Create a small ESM project with two packages/modules, lockfile, tests, and a build script. Inspect dependency tree and explain reproducible installation.

---

# 8. Google Interview Drill

Production fails with `ERR_REQUIRE_ESM` after dependency upgrade. Diagnose module format, package metadata, import style, runtime version, and migration options.

Use:

> **Clarify → First/Brute Force Approach → Improve → Code/Design → Test → Edge Cases → Complexity/Cost → Failure → Trade-Off → Follow-Up → Defend**

---

# 9. Day-Level Common Mistakes

- Mixing ECMAScript language semantics with browser/Node host APIs.
- Memorizing output without being able to derive it.
- Hiding async behavior or mutation.
- Adding framework/package complexity before the language/runtime model is clear.
- Ignoring failure, security, or production observability.

---

# 10. Day-Level Best Practices

- Explain semantics before framework behavior.
- Use explicit, readable JavaScript.
- Keep async ownership, cancellation, and errors visible.
- Prefer measured evidence over performance folklore.
- Keep security boundaries deterministic.
- Use Evidence First / No Bluff in project discussion.

---

# 11. Interview Questions

1. Explain the three most important concepts from today in 60 seconds each.
2. Show one runnable example and predict its output before executing.
3. What is one production failure caused by misunderstanding today's topic?
4. What is one code-review smell?
5. What is one AI-generated-code risk?
6. What trade-off would make you choose a different design?

---

# 12. Google-Level Follow-Ups

1. What changes in browser vs Node.js?
2. What changes under 10× traffic or data size?
3. What if the operation becomes asynchronous?
4. What if input is attacker-controlled?
5. What would you measure in production?
6. What would you change if the runtime/framework version differs?

---

# 13. Quick Revision

```text
What is it?
Why?
What does ECMAScript guarantee?
What is host/engine specific?
Show code.
What breaks?
How do I debug it?
What do I review?
How do I evaluate AI-generated code?
What is the trade-off?
```

---

# 14. Day Readiness Gate

- [ ] Every P0 topic unit is READY.
- [ ] I can explain the visualization without notes.
- [ ] I completed the hands-on exercise.
- [ ] I completed the Google drill.
- [ ] I can answer follow-ups without restarting my solution.
- [ ] I can separate ECMAScript vs host/runtime behavior.
- [ ] I did not invent project evidence.

**DAY READY:** 80%+ and no P0 failure.  
**DAY REPAIR:** reopen only failed topic files.
