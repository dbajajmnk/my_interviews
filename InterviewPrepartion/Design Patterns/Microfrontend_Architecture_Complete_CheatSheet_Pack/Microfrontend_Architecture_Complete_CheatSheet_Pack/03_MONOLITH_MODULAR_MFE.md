# Monolithic Frontend vs Modular Frontend vs Microfrontend

| Area | Monolith | Modular Frontend | Microfrontend |
|---|---|---|---|
| Deployment | one | one | independent |
| Team ownership | shared | module-based | capability-based |
| Runtime | one app | one app | composed apps |
| Failure isolation | low | medium | higher potential |
| Complexity | low | medium | high |
| Dependency management | simple | manageable | distributed |
| Release autonomy | low | low-medium | high |

## Rule

Prefer a modular frontend until independent deployment/team autonomy creates enough value to justify runtime distribution.
