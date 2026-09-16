# Sequential and Parallel Tool Calls

## Sequential

Use when call B depends on call A.

## Example

```text
find_customer
 ↓
get_customer_orders
 ↓
get_order_status
```

## Parallel

Use when operations are independent.

## Example

```text
          ┌─ get_weather(city A)
request ──┼─ get_weather(city B)
          └─ get_weather(city C)
```

## Caution

Do not parallelize operations that:
- mutate shared state;
- depend on each other;
- have ordering guarantees.
