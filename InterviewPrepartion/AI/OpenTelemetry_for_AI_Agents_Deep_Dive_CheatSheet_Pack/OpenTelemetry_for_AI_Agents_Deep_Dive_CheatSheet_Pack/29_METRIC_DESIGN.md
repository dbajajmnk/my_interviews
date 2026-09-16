# Metric Design

## Good Metrics

- agent runs;
- task success proxy;
- model calls/run;
- tool calls/run;
- error rate;
- retry rate;
- latency;
- token use;
- cost.

## Cardinality

Avoid labels such as raw prompt, user text, document IDs at massive cardinality.

## Rule

Metrics must remain aggregatable and operationally affordable.
