# Route Tables / IGW / NAT

## Internet Gateway

Provides VPC internet routing target.

## NAT Gateway

Allows private IPv4 resources to initiate outbound connections through a public NAT Gateway.

## Pattern

```text
Private EC2
   ↓
Private Route Table
0.0.0.0/0 → NAT Gateway
   ↓
Public Subnet
   ↓
IGW
   ↓
Internet
```

## High Availability

Use NAT architecture aligned to AZ/resilience requirements.

## Trap

NAT Gateway does not accept unsolicited inbound internet connections to private workloads.
