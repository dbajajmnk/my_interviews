# Tool Schema Design

## Schema Components

A good tool definition has:
- stable name;
- concise description;
- typed input schema;
- optional output schema;
- clear required vs optional fields;
- bounded enumerations where possible.

## Bad Schema

```text
tool: do_stuff
args:
  data: string
```

## Better Schema

```text
tool: create_support_ticket

arguments:
  customer_id: string
  category: enum[billing, technical, account]
  priority: enum[low, medium, high]
  summary: string
```

## Rule

Prefer constrained, typed schemas over giant free-form string inputs.
