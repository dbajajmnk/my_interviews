# Durable Execution and Fencing

## Need

long-running jobs survive crashes/restarts.

## Critical Invariant

An old execution attempt must never mutate or finalize state owned by a newer attempt.

## Mechanisms

checkpoint + lease + attempt token/fencing + conditional update.
