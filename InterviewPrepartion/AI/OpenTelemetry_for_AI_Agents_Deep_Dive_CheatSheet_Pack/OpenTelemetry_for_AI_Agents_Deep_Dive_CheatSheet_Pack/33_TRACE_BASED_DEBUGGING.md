# Trace-Based Debugging

## Debug Questions

- Which agent made the bad decision?
- Which tool failed?
- Why was there a retry?
- Which retrieval returned poor evidence?
- Where was latency added?

## Method

Start at root span, follow critical path, compare input/output metadata and status at each semantic operation.
