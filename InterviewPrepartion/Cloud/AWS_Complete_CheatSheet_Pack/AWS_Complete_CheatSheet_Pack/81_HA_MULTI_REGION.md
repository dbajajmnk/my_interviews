# HA / Multi-AZ / Multi-Region

## Multi-AZ

Protects from AZ-level failure.

## Multi-Region

Protects against broader regional disaster and can improve global latency.

## Pattern

```text
Region A
 ├── AZ1
 └── AZ2

Region B
 ├── AZ1
 └── AZ2
```

## Cost

Multi-Region adds:

```text
data replication
consistency complexity
deployment complexity
testing
traffic management
cost
```

## Rule

Do not build active-active multi-Region without a business RTO/RPO/availability requirement.
