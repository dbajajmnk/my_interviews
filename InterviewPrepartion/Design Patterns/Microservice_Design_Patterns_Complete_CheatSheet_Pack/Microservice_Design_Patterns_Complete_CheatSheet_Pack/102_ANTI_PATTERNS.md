# Microservice Design Anti-Patterns

## Distributed Monolith
Independent processes, coordinated everything.

## Shared Database
Multiple services directly own same data.

## Chatty Services
Too many tiny synchronous calls.

## Nano-Services
Boundaries too small.

## Retry Storm
Every layer retries.

## God Gateway
Gateway contains business logic.

## Event Soup
Unowned, undocumented events.

## Shared Common Library
Business coupling hidden in package dependency.

## Dual Write
DB + broker written independently.

## One Giant Global Transaction
Trying to preserve monolith ACID across services.
