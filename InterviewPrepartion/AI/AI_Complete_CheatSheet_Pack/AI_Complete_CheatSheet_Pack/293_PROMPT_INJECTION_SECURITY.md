# Prompt Injection Security

## What / Why

Malicious content alters model behavior/tool decisions.

## Mental Model

```text
untrusted text → model
```

## When to Use

Separate instructions/data, restrict tools, validate actions.

## Common Mistake / Interview Trap

Cannot be solved only by prompt wording.

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

> **Prompt Injection Security:** Malicious content alters model behavior/tool decisions.
