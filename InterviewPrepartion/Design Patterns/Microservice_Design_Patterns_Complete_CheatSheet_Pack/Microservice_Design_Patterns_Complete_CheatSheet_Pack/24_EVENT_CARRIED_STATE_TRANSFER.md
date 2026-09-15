# Event-Carried State Transfer

## Intent
Include useful state in events so consumers need not call producer.

Example:
```json
{
  "type":"CustomerUpdated",
  "customerId":"C1",
  "name":"Deepak",
  "tier":"Gold"
}
```

## Benefit
Consumer autonomy.

## Cost
Larger events and schema evolution complexity.
