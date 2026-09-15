# Saga / Orchestration on AWS

## Orchestration

Commonly modeled with:

```text
Step Functions
```

## Choreography

Commonly uses:

```text
EventBridge
SNS
SQS
Kafka/MSK
```

## Example

```text
Create Order
 ↓
Reserve Inventory
 ↓
Charge Payment
 ↓
Arrange Shipping
```

Failure:

```text
Compensate Payment
Release Inventory
Cancel Order
```

## Trap

Compensation is domain logic, not an automatic database rollback.
