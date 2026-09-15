# Content-Based Router

## Intent
Route messages based on content.

```text
Event
 ↓
Router
 ├── high-value → Queue A
 └── normal → Queue B
```

## Trap
Do not let routing rules become an invisible business-rule engine.
