# Python Example — Tool Calling Pattern

## Example

```python
from dataclasses import dataclass

@dataclass
class ToolContext:
    user_id: str
    tenant_id: str

def create_ticket(ctx: ToolContext, customer_id: str, summary: str):
    authorize(ctx.user_id, "ticket:create")
    validate_customer(customer_id)
    return ticket_service.create(
        tenant_id=ctx.tenant_id,
        customer_id=customer_id,
        summary=summary,
    )
```

## Architecture Point

Model arguments should not include trusted identity fields when the runtime already knows them.
