# Microfrontend Anti-Patterns

## Nano Frontends
Every small component becomes an MFE.

## Shared Global Store
All MFEs depend on one mutable schema.

## Fat Shell
Shell contains domain business logic.

## Framework Zoo
Every team chooses a different framework without business reason.

## Shared Everything Package
One giant common dependency.

## Runtime Dependency Chain
MFE A loads B which loads C which loads D.

## Central Release Train
All MFEs deploy together.

## Invisible Events
Unversioned global event bus.

## Global CSS
One team's styles break another.

## Trap

The most common failure is too much coupling disguised as distribution.
