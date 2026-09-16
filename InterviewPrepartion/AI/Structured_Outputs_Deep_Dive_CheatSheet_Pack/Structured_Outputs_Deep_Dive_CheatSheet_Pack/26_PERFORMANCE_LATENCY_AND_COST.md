# Performance, Latency and Cost

## Latency

Complex schemas can add generation/constrained-decoding overhead.

## First-Schema Cost

Some providers may preprocess/cache schema representations, making the first use of a new schema slower than subsequent uses.

## Optimization

- reuse stable schemas;
- avoid unnecessary complexity;
- keep response objects small;
- avoid asking for fields you do not consume.

## Rule

Schema complexity has runtime cost; design contracts for application needs, not theoretical completeness.
