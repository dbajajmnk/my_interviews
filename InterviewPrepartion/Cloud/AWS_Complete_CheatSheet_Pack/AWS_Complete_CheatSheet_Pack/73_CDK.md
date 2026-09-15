# AWS CDK

## What

Define cloud infrastructure using programming languages and synthesize CloudFormation.

## Flow

```text
CDK Code
 ↓
Constructs
 ↓
Synthesis
 ↓
CloudFormation
 ↓
AWS
```

## Good Fit

Teams preferring code abstractions/reuse.

## Trap

High-level constructs can hide generated infrastructure—review synthesized output/security.
