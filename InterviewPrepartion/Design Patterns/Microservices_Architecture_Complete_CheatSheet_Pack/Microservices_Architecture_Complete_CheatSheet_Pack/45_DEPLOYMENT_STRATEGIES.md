# Deployment Strategies

## Rolling

Replace instances gradually.

## Blue-Green

```text
Blue = current
Green = new
switch traffic
```

## Canary

Send small traffic percentage to new version.

## Feature Flag

Deploy code separately from feature release.

## Trap

Database changes must be backward-compatible during mixed-version deployments.
