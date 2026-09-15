# Microfrontend Design Anti-Patterns

## Nano Frontends
Every small component becomes independently deployed.

## Fat Shell
The shell accumulates domain logic and becomes the new monolith.

## One Global Store
All MFEs depend on one mutable state schema.

## Shared-Everything Library
A common package hides domain models and business rules.

## Framework Zoo
Every team chooses a framework without a real business/migration reason.

## Central Release Train
All MFEs still have to deploy together.

## Runtime Dependency Chain
MFE A loads B, B loads C, C loads D.

## Global CSS
One team's styles can break another MFE.

## Invisible Event Bus
Cross-MFE contracts are undocumented and unversioned.

## Mutable Remote URLs
Existing URLs are overwritten, making cache and rollback unsafe.

## No Failure Boundary
One remote failure blanks the whole page.

## State Synchronization Web
Every MFE continuously mirrors other MFE state.

## Key Rule

If autonomy requires constant coordination, the boundary is probably wrong.
