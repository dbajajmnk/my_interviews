# Python Reference Tests

## Example

```python
def test_router_sends_billing_to_billing_agent():
    router = Router(model=FakeModel("billing"))
    result = router.route("refund issue")
    assert result.agent == "billing"

def test_write_tool_is_idempotent():
    tool = FakeCreateTicketTool()
    a = tool.create("k1")
    b = tool.create("k1")
    assert a.id == b.id
    assert tool.write_count == 1
```
