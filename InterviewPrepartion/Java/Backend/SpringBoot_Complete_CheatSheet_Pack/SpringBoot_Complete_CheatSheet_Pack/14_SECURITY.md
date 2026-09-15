# Spring Security Essentials

## Flow
```text
Request → Security Filter Chain → Authentication → SecurityContext
→ Authorization → Controller
```

## Modern Configuration Shape
```java
@Bean
SecurityFilterChain security(HttpSecurity http) throws Exception {
    return http.authorizeHttpRequests(auth -> auth
        .requestMatchers("/actuator/health").permitAll()
        .anyRequest().authenticated()).build();
}
```

## Concepts
Authentication, authorization, principal, roles/authorities, password encoding, session vs token, CSRF, CORS.

## API Checklist
TLS, token validation, least privilege, secret protection, safe errors, rate limiting where appropriate, audit critical actions.

## Trap
CORS and CSRF solve different problems.
