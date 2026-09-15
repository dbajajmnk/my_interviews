# RDS/Aurora vs DynamoDB

| RDS/Aurora | DynamoDB |
|---|---|
| relational | key-value/document |
| SQL | API/query patterns |
| joins | denormalized access patterns |
| schema constraints | flexible items |
| relational transactions | DynamoDB transactions |
| vertical/read scaling patterns | horizontal managed scale |

## Choose Relational When

```text
joins
complex queries
relational integrity
```

## Choose DynamoDB When

```text
known access patterns
massive scale
predictable low latency
serverless model
```
