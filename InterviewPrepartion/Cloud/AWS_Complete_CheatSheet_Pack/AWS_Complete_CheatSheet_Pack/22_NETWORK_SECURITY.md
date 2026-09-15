# Network Firewall / WAF / Shield

## AWS WAF

Layer 7 web request filtering.

## AWS Shield

DDoS protection capabilities.

## AWS Network Firewall

Managed network firewall for VPC traffic.

## Placement

```text
Internet
 ↓
CloudFront / ALB / API Gateway
 ↓ WAF
Application
```

and/or

```text
VPC traffic path
 ↓
Network Firewall
```

## Trap

WAF is not a replacement for secure application code or IAM.
