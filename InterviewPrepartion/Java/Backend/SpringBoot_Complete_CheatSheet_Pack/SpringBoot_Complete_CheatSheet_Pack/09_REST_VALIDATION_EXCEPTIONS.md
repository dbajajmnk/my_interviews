# REST APIs, Validation & Exception Handling

## Boundary
```text
JSON → Request DTO → Validation → Service/Domain → Response DTO → JSON
```
Avoid exposing persistence entities directly as public API contracts.

## Validation
```java
public record CreateUserRequest(@NotBlank String name, @Email String email) {}

@PostMapping
ResponseEntity<UserResponse> create(@Valid @RequestBody CreateUserRequest request) { ... }
```

## Central Error Handling
```java
@RestControllerAdvice
class ApiExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    ResponseEntity<ApiError> notFound(NotFoundException ex) { ... }
}
```

## Error Contract
Prefer stable fields: `code`, `message`, `timestamp`, `path`, `correlationId`, validation errors.

## Rule
Validate boundaries, hide internal stack/SQL details, and use predictable HTTP semantics.
