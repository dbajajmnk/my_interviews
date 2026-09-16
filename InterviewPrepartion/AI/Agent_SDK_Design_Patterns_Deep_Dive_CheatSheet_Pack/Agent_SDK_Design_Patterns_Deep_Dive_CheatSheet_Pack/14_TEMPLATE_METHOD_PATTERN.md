# Template Method for Run Lifecycle

## Intent

Define the skeleton of an algorithm while allowing certain steps to vary.

## Agent Run Template

```text
initialize()
buildContext()
invokeModel()
validateDecision()
executeAction()
updateState()
checkStop()
finalizeRun()
```

## Use

Useful when multiple agent runtimes share the same lifecycle but customize:
- context assembly;
- policy;
- model invocation;
- stop rules.

## Caution

Prefer composition over deep inheritance if behavior becomes highly variable.
