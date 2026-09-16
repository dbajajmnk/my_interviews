# Progress and Custom Events

## Purpose

Long-running tools/workflows benefit from explicit progress events.

## Examples

- 3/10 documents processed;
- report section completed;
- indexing complete;
- waiting for approval.

## Rule

Emit business-meaningful progress, not arbitrary internal noise.

## Custom Event

```json
{
  "type": "progress",
  "data": {
    "phase": "document_analysis",
    "completed": 3,
    "total": 10
  }
}
```
