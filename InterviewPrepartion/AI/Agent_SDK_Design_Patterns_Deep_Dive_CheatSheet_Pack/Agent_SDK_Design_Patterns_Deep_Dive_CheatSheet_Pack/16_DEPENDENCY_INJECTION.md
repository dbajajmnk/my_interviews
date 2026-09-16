# Dependency Injection

## Purpose

Dependency Injection is the glue that makes patterns practical.

## Without DI

```java
class AgentRuntime {
    private final AzureOpenAIProvider provider = new AzureOpenAIProvider();
}
```

## With DI

```java
class AgentRuntime {
    private final ModelProvider provider;

    AgentRuntime(ModelProvider provider) {
        this.provider = provider;
    }
}
```

## Benefits

- provider replacement;
- test doubles;
- easier configuration;
- clearer dependencies;
- reduced coupling.

## Interview Point

> Patterns isolate variability; DI makes that variability injectable.
