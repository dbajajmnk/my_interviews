# Microservices Anti-Patterns

## Distributed Monolith

Services deploy independently in theory, but must release together.

## Shared Database

Multiple services modify the same tables.

## Nano-Services

Services too small to own meaningful business capability.

## Chatty Services

Excessive sync calls.

## God Gateway

Gateway contains domain logic.

## Event Soup

Hundreds of undocumented events with unclear ownership.

## Retry Storm

Every layer retries the same failing dependency.

## Shared Library Coupling

Massive common library forces synchronized upgrades.

## Trap

The biggest microservice failure is usually poor boundaries, not technology choice.
