# Java Reference Tests

## Example

```java
@Test
void unauthorizedToolCallIsRejected() {
    var context = new ToolContext("user-1", "tenant-a");
    when(auth.can(context, "delete")).thenReturn(false);

    assertThrows(
        AuthorizationException.class,
        () -> tool.execute(input, context)
    );
}
```

## Pattern

JUnit + mocks/fakes + deterministic domain assertions.
