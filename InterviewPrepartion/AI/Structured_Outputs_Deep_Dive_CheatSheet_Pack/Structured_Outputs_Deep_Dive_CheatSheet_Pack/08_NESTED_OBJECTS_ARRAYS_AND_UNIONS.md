# Nested Objects, Arrays and Unions

## Nested Objects

Use nested objects when the domain naturally has grouped sub-entities.

## Arrays

Use arrays for repeated items:
```json
{
  "items": [
    {"id":"A1","score":0.9},
    {"id":"A2","score":0.8}
  ]
}
```

## Unions

Union/variant schemas can model multiple result types, but they increase complexity.

## Rule

Start simple. Complex schemas increase generation difficulty and maintenance burden.
