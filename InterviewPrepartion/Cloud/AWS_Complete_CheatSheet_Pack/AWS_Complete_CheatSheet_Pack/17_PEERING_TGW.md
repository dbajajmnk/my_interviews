# VPC Peering vs Transit Gateway

| VPC Peering | Transit Gateway |
|---|---|
| point-to-point | hub-and-spoke |
| simple few VPCs | scalable many networks |
| non-transitive | transitive routing hub |
| lower architecture overhead | centralized routing |

## Transit Gateway

```text
VPC A ─┐
VPC B ─┼→ TGW → VPN/DX
VPC C ─┘
```

## Trap

VPC peering is not transitive.
