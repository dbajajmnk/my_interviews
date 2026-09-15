# VPC Endpoints / PrivateLink

## Goal

Access supported services without traversing the public internet.

## Gateway Endpoints

Commonly:

```text
S3
DynamoDB
```

## Interface Endpoints

Powered by AWS PrivateLink.

```text
VPC
 ↓
Private ENI endpoint
 ↓
AWS/partner/private service
```

## Benefits

```text
private connectivity
security
reduced NAT dependence for supported traffic
```

## Trap

Endpoint policies and service/resource policies still matter.
