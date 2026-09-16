# Offline vs Online Evaluation

## Offline

Run test datasets before deployment.

Use for:
- regression;
- model comparison;
- prompt changes;
- tool/schema changes;
- release gates.

## Online

Measure real production behavior.

Use for:
- user success;
- failure rates;
- escalation rates;
- live latency/cost;
- drift.

## Rule

Offline tells you whether a release is safe enough to ship; online tells you whether it actually works for users.
