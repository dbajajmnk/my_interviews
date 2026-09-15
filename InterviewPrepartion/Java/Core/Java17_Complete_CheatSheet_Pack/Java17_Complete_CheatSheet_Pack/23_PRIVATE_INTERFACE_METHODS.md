# Private Interface Methods

## Why

Interfaces with multiple default methods can share implementation without exposing helper methods publicly.

## Example

```java
interface LoggerSupport {

    default void info(String msg) {
        log("INFO", msg);
    }

    default void error(String msg) {
        log("ERROR", msg);
    }

    private void log(String level, String msg) {
        System.out.println(level + ": " + msg);
    }
}
```

## Benefit

Avoid duplicated default-method implementation logic.

## Trap

Private interface methods are implementation details and cannot be invoked by implementing classes.
