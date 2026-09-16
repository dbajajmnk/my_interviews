# Python Example — Typed Structured Output

## Example

```python
from pydantic import BaseModel

class TicketClassification(BaseModel):
    category: str
    priority: str
    confidence: float

def validate_business_rules(x: TicketClassification):
    if not 0.0 <= x.confidence <= 1.0:
        raise ValueError("confidence out of range")
```

## Pattern

Model → typed parse → business validation → downstream logic.
