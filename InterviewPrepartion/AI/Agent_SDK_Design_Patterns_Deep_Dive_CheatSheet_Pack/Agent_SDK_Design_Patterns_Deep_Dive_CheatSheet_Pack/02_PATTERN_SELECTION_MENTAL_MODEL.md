# Pattern Selection Mental Model

## Ask What Is Changing

Choose patterns by change axis:

| Change Axis | Useful Pattern |
|---|---|
| Model provider | Adapter |
| Routing policy | Strategy |
| Object creation | Factory |
| Complex config | Builder |
| Tool execution | Command |
| Events/telemetry | Observer |
| Cross-cutting logic | Decorator |
| Guardrail pipeline | Chain |
| Runtime lifecycle | State / Template Method |
| External service access | Proxy |

## Do Not Pattern-Match Blindly

Do not say “we use all GoF patterns.”

Say:
> I first identify volatility: provider, policy, lifecycle, cross-cutting concerns, and public contracts. Then I choose the smallest pattern that isolates that volatility.

## Architectural Heuristic

- External variability → Adapter
- Behavioral variability → Strategy
- Creation variability → Factory
- Configuration complexity → Builder
- Action as data → Command
- Notifications → Observer
- Cross-cutting concerns → Decorator
- Sequential policy checks → Chain
