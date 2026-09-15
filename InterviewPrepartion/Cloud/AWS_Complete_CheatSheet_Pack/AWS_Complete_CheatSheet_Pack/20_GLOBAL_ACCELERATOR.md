# AWS Global Accelerator

## What

Uses AWS global network and anycast static IPs to route users to healthy regional endpoints.

## Good Fits

```text
TCP/UDP applications
static global IP requirement
multi-Region failover
global performance
```

## Compare

```text
CloudFront → CDN / HTTP content caching
Global Accelerator → network traffic acceleration / static anycast IP
```

## Trap

Global Accelerator does not cache application content like CloudFront.
