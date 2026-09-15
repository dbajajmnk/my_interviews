# Spring Boot Mental Model

## What
Spring Boot is an opinionated way to build stand-alone, production-grade Spring applications with minimal setup.

## Why
It reduces repeated setup for dependency versions, web runtime, serialization, data sources, framework beans, health/metrics, and environment configuration.

## Visual
```text
Your Code
 ├─ Controllers
 ├─ Services
 ├─ Repositories
 └─ Configuration
       ↓
Spring Framework
(IoC, DI, AOP, MVC, Transactions)
       ↓
Spring Boot
(Starters, Auto-config, Runtime, External Config, Actuator)
       ↓
JVM + Infrastructure
```

## Analogy
Spring Framework = engineering system and building materials.  
Spring Boot = a professionally preconfigured building kit using those materials.

## Production Question
Whenever Boot appears to do something automatically, ask: **Which dependency, property, bean and condition caused which auto-configured bean to be created?**
