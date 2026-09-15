# Amazon Route 53

## Capabilities

```text
DNS
domain registration
health checks
routing policies
```

## Routing Policies

```text
Simple
Weighted
Latency
Failover
Geolocation
Geoproximity
Multi-value
```

## Architecture

```text
example.com
  ↓ Route 53
CloudFront / ALB / API endpoint
```

## Trap

DNS failover is influenced by DNS caching/TTL; it is not instant request-by-request failover.
