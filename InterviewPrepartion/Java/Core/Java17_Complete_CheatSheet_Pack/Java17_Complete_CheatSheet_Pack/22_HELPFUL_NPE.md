# Helpful NullPointerExceptions

## Before

Historically:

```text
NullPointerException
```

gave limited information.

## Modern Java

A helpful NPE can identify the failed dereference path more precisely.

Example concept:

```text
Cannot invoke "Address.city()" because
"user.address()" is null
```

## Why

Faster debugging.

## Trap

Better NPE messages do not justify poor null-design or missing validation.
