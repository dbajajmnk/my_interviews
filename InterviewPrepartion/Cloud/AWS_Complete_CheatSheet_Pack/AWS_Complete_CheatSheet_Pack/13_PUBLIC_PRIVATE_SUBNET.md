# Public vs Private Subnets

## Public Subnet

A subnet whose route table has a route to an Internet Gateway.

```text
0.0.0.0/0 → IGW
```

## Private Subnet

No direct route to IGW.

May use:

```text
NAT Gateway
VPC endpoints
Transit Gateway
VPN
Direct Connect
```

## Important

An EC2 instance in a public subnet typically still needs a public IPv4/Elastic IP for IPv4 internet communication.

## Trap

“Public subnet” describes routing—not whether every resource is automatically publicly reachable.
