# Security Recall Matrix

## Matrix

| Risk | Primary Control |
|---|---|
| Prompt injection | deterministic policy + restricted tools |
| Tool abuse | authz + validation + risk tiers |
| Secret leakage | vault/managed identity |
| Cross-tenant data | trusted tenant scope everywhere |
| RAG poisoning | source trust + ACL + provenance |
| Memory poisoning | write policy + provenance + expiry |
| Dangerous action | HITL + least privilege |
