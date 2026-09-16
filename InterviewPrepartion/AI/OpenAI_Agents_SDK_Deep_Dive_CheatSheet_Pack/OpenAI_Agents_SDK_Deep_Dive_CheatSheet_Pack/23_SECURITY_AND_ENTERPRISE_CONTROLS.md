# Security and Enterprise Controls

## Identity

Propagate real user/workload identity to enterprise tools where possible.

## Tool Security

For each tool define:
- read/write risk;
- permission scope;
- approval requirement;
- timeout;
- audit policy.

## Model Output

Treat model output and tool arguments as untrusted input until validated.

## Guardrail vs Authorization

Guardrail = AI/application validation layer.  
Authorization = enforceable permission boundary.

Do not confuse them.

## Sensitive Data

Apply:
- redaction;
- least privilege;
- tenant isolation;
- secret management;
- retention controls.
