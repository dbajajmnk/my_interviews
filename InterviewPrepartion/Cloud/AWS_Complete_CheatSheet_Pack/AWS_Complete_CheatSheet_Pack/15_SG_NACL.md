# Security Group vs NACL

| Security Group | NACL |
|---|---|
| resource/ENI level | subnet level |
| stateful | stateless |
| allow rules | allow + deny |
| return traffic automatic | return rules required |
| primary workload firewall | coarse subnet guardrail |

## Rule

Use Security Groups as the primary workload-level network control.

## Trap

NACL rule order matters; Security Groups do not use ordered deny rules.
