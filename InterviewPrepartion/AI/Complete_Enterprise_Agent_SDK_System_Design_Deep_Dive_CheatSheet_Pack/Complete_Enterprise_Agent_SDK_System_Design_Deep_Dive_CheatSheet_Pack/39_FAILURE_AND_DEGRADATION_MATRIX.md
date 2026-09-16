# Failure and Degradation Matrix

## Matrix

| Dependency | Failure | Response |
|---|---|---|
| Model | 429/5xx | retry/circuit/fallback |
| Tool | timeout | retry/idempotent or degrade |
| RAG | unavailable | alternate/no-grounded-answer |
| Memory | unavailable | continue stateless if safe |
| OTel | unavailable | do not fail business run |
