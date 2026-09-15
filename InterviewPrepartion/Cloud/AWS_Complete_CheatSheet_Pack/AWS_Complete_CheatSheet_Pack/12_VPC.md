# VPC Mental Model

## VPC

Logically isolated virtual network.

```text
VPC 10.0.0.0/16
 ├── Public Subnet AZ-A
 ├── Private App AZ-A
 ├── Private DB AZ-A
 ├── Public Subnet AZ-B
 ├── Private App AZ-B
 └── Private DB AZ-B
```

## Building Blocks

```text
CIDR
subnet
route table
IGW
NAT
Security Group
NACL
VPC Endpoint
DNS
```

## Rule

Plan CIDR space with future connectivity in mind.

## Trap

Overlapping CIDRs make VPC-to-VPC/hybrid networking painful.
