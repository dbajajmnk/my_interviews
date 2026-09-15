# ALB vs NLB vs GWLB

| ALB | NLB | GWLB |
|---|---|---|
| Layer 7 | Layer 4 | network virtual appliances |
| HTTP/HTTPS | TCP/UDP/TLS | service insertion |
| host/path routing | very high network performance | firewall/appliance fleets |
| web/apps | low-level network workloads | security appliances |

## Rule

Choose the lowest layer that meets the routing/application requirement.

## Trap

ALB path routing is an HTTP feature; NLB does not provide the same L7 routing behavior.
