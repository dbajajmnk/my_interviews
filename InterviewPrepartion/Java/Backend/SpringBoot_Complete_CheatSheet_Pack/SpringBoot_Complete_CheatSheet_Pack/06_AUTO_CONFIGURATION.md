# Auto-configuration & Conditional Configuration

## Formula
```text
Classpath + Properties + Existing Beans + Application Type
              ↓
        Conditional Matching
              ↓
      Auto-configured Beans
```

## Conditions
```java
@ConditionalOnClass
@ConditionalOnMissingBean
@ConditionalOnBean
@ConditionalOnProperty
@ConditionalOnWebApplication
```

## Back-Off
Boot commonly backs off when your application provides its own compatible bean/configuration.

## Debug
```properties
debug=true
```
Use the condition evaluation report to see why configuration matched or did not match.

## Interview Answer
Auto-configuration is conditional configuration, not magic.
