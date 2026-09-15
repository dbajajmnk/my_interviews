# AWS Organizations / OUs / SCPs

## Organizations

Centrally manages AWS accounts.

## Organizational Unit

Groups accounts for governance.

## SCP

Service Control Policy defines maximum available permissions for accounts/OUs.

## Important

```text
SCP does not grant permission.
```

Effective access still requires IAM permissions.

## Mental Model

```text
SCP boundary
   ∩
IAM permissions
   ∩
resource policies
   ∩
other policy controls
=
effective permission
```

## Trap

An Allow in an SCP does not itself give a user access.
