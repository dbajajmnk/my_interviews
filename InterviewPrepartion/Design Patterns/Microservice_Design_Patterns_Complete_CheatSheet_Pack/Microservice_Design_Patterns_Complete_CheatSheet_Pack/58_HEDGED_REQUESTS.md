# Hedged Requests

## Intent
Send a duplicate request after a delay to reduce tail latency.

## Risk
Additional load.

## Use
Only for idempotent/safe operations with careful thresholds.
