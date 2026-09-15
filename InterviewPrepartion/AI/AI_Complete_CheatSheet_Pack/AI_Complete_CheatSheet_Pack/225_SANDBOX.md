# Sandbox

## What / Why

Isolated environment for code/files/browser/tool execution.

## Mental Model

```text
agent → sandbox
```

## When to Use

Use risky/untrusted execution.

## Common Mistake / Interview Trap

Sandbox does not remove data exfiltration risk.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Sandbox:** Isolated environment for code/files/browser/tool execution.
