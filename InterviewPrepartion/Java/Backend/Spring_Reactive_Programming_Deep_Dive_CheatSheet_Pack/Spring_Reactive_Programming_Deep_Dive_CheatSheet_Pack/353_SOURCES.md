# Sources & Accuracy Notes

Primary baseline: official Spring Framework 7.0.9 reference and Project Reactor Core 3.8.7 documentation.

Verified current facts:
- Spring Framework 7.0.9 is the current stable Framework reference line.
- Reactor Core 3.8.7 is the current Reactor Core release.
- WebFlux is fully non-blocking and Reactive Streams backpressure-aware.
- WebClient is Reactor-based, non-blocking and streaming-capable.
- Spring Framework includes R2DBC support and reactive transaction infrastructure.

Align versions through Spring Boot dependency management unless a documented compatibility requirement says otherwise.
