# Angular Interview Traps — Modern Angular 22

1. Angular is a full web framework, not only a component library.
2. Standalone is the modern default; NgModules still exist.
3. Do not set `standalone: true` by habit in modern Angular where it is already default.
4. Angular is zoneless by default in v21+.
5. ZoneJS is not mandatory in a new Angular 22 application.
6. OnPush is the default change-detection strategy in Angular 22.
7. `ChangeDetectionStrategy.Eager` is the explicit eager mode.
8. `ChangeDetectionStrategy.Default` is now a deprecated alias for Eager.
9. Signals do not make RxJS obsolete.
10. `computed` is for derived state; `effect` is for side effects/synchronization.
11. `resource` is intended for asynchronous read operations, not mutations.
12. `httpResource` is a signal-based reactive wrapper around HttpClient for read workflows.
13. Signal Forms are stable in Angular 22.
14. Reactive Forms remain valid and important.
15. Template-driven forms are still supported.
16. `@if/@for/@switch` are built-in modern control flow.
17. `track` identity in `@for` is important.
18. `@defer` provides deferred loading/rendering and code splitting.
19. Route guards are not backend authorization.
20. Frontend environment files are not secret storage.
21. HttpClient Observables can execute more than once with multiple subscriptions.
22. switchMap is correct only when prior inner work may be cancelled.
23. `AsyncPipe` handles subscription lifecycle and change-detection notification.
24. `takeUntilDestroyed` is preferred for imperative Angular subscriptions.
25. `inject()` requires an injection context.
26. Providing the same service at child scopes can create multiple instances.
27. View encapsulation is not a security boundary.
28. DomSanitizer bypass APIs move XSS responsibility to you.
29. SSR code cannot assume `window`/`document` always exist.
30. Hydration requires compatible server/client DOM.
31. Incremental hydration and event replay improve SSR interactivity.
32. Vitest is the default runner for new Angular CLI projects.
33. Karma is legacy but still relevant in existing codebases.
34. Angular Aria is stable in v22 for headless accessible patterns.
35. `ng update` is the supported framework migration path.
