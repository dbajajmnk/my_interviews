# Raw vs Semantic Events

## Raw Events

Provider-native events:
- token deltas;
- response lifecycle;
- low-level wire events.

## Semantic Events

Application/runtime normalized events:
- message completed;
- tool started/completed;
- agent changed;
- approval required.

## Design Rule

Expose semantic events to most application consumers. Keep raw events available for advanced diagnostics or highly custom UIs.

## Reason

Provider-native event shapes can change or differ across models/providers.
