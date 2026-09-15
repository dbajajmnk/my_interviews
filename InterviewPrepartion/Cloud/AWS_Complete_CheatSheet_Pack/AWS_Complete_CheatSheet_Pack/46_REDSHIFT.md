# Amazon Redshift

## What

Managed cloud data warehouse.

## Good Fits

```text
analytics
BI
large scans
warehouse queries
structured/semi-structured analytics
```

## Architecture

```text
Data Sources
 ↓
ETL/ELT
 ↓
Redshift
 ↓
BI / Analytics
```

## Trap

Do not use a warehouse as an OLTP application database.
