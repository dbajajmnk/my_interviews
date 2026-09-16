# Strategy Pattern in Agent SDKs

## Intent

Encapsulate interchangeable algorithms or policies.

## Examples

Strategies may control:
- model selection;
- retry;
- routing;
- tool selection policy;
- memory selection;
- retrieval ranking;
- termination rules.

## Example

```text
RoutingStrategy
 ├─ CostOptimized
 ├─ LatencyOptimized
 ├─ QualityOptimized
 └─ ComplianceOptimized
```

## Java Sketch

```java
interface RoutingStrategy {
    ModelProvider choose(RunContext context);
}
```

## Adapter vs Strategy

- **Adapter:** makes incompatible APIs compatible.
- **Strategy:** changes how a decision is made.

This distinction is a common interview question.
