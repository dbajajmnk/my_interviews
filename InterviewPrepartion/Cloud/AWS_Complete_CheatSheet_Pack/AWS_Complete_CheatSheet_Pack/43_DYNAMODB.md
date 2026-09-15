# Amazon DynamoDB

## What

Managed NoSQL key-value/document database.

## Model

```text
Table
 ├── Partition Key
 └── optional Sort Key
```

## Strengths

```text
predictable low latency
automatic scaling options
serverless operations
global tables
streams
TTL
transactions
```

## Data Modeling

Design access patterns first.

## Global Tables

Multi-Region replicas enable global applications.

## Trap

DynamoDB should not be modeled like an RDBMS with arbitrary joins.
