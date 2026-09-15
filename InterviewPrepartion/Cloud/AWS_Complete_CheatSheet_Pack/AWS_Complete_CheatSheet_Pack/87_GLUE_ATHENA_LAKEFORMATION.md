# Glue / Athena / Lake Formation

## AWS Glue

Data integration / catalog / ETL capabilities.

## Athena

Serverless SQL query over supported data sources, commonly S3-backed analytics.

## Lake Formation

Data-lake governance/access management capabilities.

## Pattern

```text
S3
 ↓
Glue Catalog
 ↓
Lake Formation Governance
 ↓
Athena / Analytics
```

## Trap

Partitioning and file format strongly affect query cost/performance.
