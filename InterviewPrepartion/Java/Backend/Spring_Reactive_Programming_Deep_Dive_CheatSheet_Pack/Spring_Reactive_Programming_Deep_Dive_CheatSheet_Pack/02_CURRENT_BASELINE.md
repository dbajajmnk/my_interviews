# Current Baseline — September 2026

- **Spring Framework 7.0.9** — latest stable in current official reference.
- **Reactor Core 3.8.7** — current Reactor Core release.
- WebFlux remains fully non-blocking and Reactive Streams backpressure-aware.
- WebClient is non-blocking, Reactor-based and supports streaming.

Prefer Spring Boot dependency management instead of manually mixing Reactor/Spring Framework versions.
