# Architecture Review Checklist

Ask:

```text
Why is this a separate service?
What business capability does it own?
Who owns it?
What data does it own?
What are its invariants?
What happens if it is unavailable?
How are transactions coordinated?
What are sync dependencies?
What are async dependencies?
How is idempotency handled?
What is the SLO?
How is it observed?
How is it secured?
How is it deployed?
How is it rolled back?
```

## Rule

If these questions cannot be answered, the service boundary is probably premature.
