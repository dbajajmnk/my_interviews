# Amazon CloudFront

## What

Content delivery network (CDN).

## Flow

```text
User
 ↓
Edge Location
 ↓ cache miss
Origin
(S3 / ALB / API / custom)
```

## Benefits

```text
lower latency
caching
TLS
WAF integration
origin protection patterns
```

## Good Fits

```text
static web
downloads
APIs
media
global content
```

## Trap

Cache behavior, cache keys, headers, cookies, and query strings must be designed deliberately.
