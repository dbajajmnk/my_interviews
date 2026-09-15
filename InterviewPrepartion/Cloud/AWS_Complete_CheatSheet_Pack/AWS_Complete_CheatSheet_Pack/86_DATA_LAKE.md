# AWS Data Lake Architecture

## Common Pattern

```text
Sources
 ↓
Ingestion
 ↓
S3 Data Lake
 ↓
Catalog / Governance
 ↓
Processing
 ↓
Athena / Redshift / ML / BI
```

## Design Zones

```text
raw
curated
consumption
```

## Concerns

```text
schema
partitioning
governance
security
catalog
lineage
cost
```

## Trap

An S3 bucket full of files is not automatically a governed data lake.
