# Data Exfiltration

## What / Why

Agent/model leaks secrets/private data through output/tool/network.

## Mental Model

```text
sensitive context → output
```

## When to Use

Use least data, DLP, egress controls.

## Common Mistake / Interview Trap

Never give unnecessary secrets to model context.

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

> **Data Exfiltration:** Agent/model leaks secrets/private data through output/tool/network.
