# Microfrontend Interview Traps

1. Microfrontend != component library.
2. Microfrontend != Module Federation.
3. Module Federation is an implementation mechanism.
4. Route-based boundaries are often cleaner than tiny component splits.
5. Independent repository != independent deployment.
6. Shared global Redux store creates coupling.
7. Cross-MFE UI state should be minimal.
8. Web Components solve interoperability, not orchestration.
9. single-spa and Module Federation can complement each other.
10. Iframes provide stronger isolation than same-page JS MFEs.
11. Different frameworks are possible, not automatically desirable.
12. Shared design system != shared business logic.
13. Shared dependencies can create runtime coupling.
14. Runtime integration requires compatibility across deployed versions.
15. Shell should remain thin.
16. Top-level routing needs one owner.
17. CSS is a cross-team contract.
18. Backend authorization cannot be replaced by frontend checks.
19. CSP matters for runtime-loaded remotes.
20. Total page performance matters more than local MFE performance.
21. SSR makes MFE composition harder, not impossible.
22. Contract testing is important for independent deployment.
23. One failing MFE should degrade gracefully where possible.
24. Platform team should enable, not centralize feature delivery.
25. Modular monolith frontend can be the correct solution.
