# JSON / Jackson Cheat Sheet

## Flow
```text
JSON Request → HttpMessageConverter → Jackson → Java DTO
Java DTO → Jackson → JSON Response
```

## Common Annotations
`@JsonProperty`, `@JsonIgnore`, `@JsonInclude`, `@JsonFormat`, `@JsonCreator`.

## Watch For
- recursive entity relationships
- lazy JPA proxies
- sensitive fields
- timezone ambiguity
- accidental breaking contract changes

## Rule
Serialization is part of the external API contract, not a cosmetic detail.
