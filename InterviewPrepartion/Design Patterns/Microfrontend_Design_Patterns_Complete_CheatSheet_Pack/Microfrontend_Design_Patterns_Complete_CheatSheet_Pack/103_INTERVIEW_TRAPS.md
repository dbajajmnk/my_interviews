# Microfrontend Design Pattern Interview Traps

1. Microfrontend != Module Federation.
2. Route composition is an architecture pattern; Module Federation is an implementation mechanism.
3. single-spa and Module Federation can be used together.
4. Web Components solve interoperability, not full application orchestration.
5. Iframes remain valid when strong isolation is required.
6. Local state should be the default.
7. One global Redux store usually recreates monolithic coupling.
8. URL is a powerful cross-MFE contract.
9. Independent repository != independent deployment.
10. Thin shell should not contain domain business logic.
11. Shared design system should not contain business logic.
12. CSS isolation is an architecture concern.
13. Runtime composition requires compatibility across concurrently deployed versions.
14. Immutable assets make CDN caching and rollback safer.
15. Runtime manifests/import maps enable fast canary and rollback.
16. Route-oriented boundaries generally reduce cross-MFE communication.
17. Shared dependencies can improve performance while increasing version coupling.
18. Dependency duplication can be the correct trade-off.
19. Multi-framework capability is not a reason to use multiple frameworks.
20. Strangler migration is usually safer than a full rewrite.
21. Same-page MFE boundaries are not automatically security boundaries.
22. Total page performance matters more than one MFE's local bundle score.
23. Accessibility must be coherent across all slices.
24. Feature flags require lifecycle/removal governance.
25. Platform teams should enable autonomy, not become release gates.
