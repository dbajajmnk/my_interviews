# PEM Practical Recall

## PEM Shape

```text
-----BEGIN PUBLIC KEY-----
...
-----END PUBLIC KEY-----
```

## PEM Usually Wraps

DER-encoded binary material represented textually.

## Common Developer Tasks

```text
read certificate
read public/private key
write certificate
exchange key material
```

## Java 25 Advantage

Preview API aims to reduce hand-written PEM parsing/encoding.

## Security Rule

Encoding a private key as PEM does not make it safe.

Protect access and encrypt sensitive key material appropriately.
