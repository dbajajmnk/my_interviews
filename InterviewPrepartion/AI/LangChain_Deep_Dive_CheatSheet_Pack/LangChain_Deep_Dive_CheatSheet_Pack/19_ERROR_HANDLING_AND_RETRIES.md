# Error Handling and Retries

## Failure Categories

- model/provider failure;
- rate limit;
- tool failure;
- validation failure;
- timeout;
- policy rejection;
- retrieval failure.

## Retry Rule

Retry transient failures with bounded backoff.

Do not retry blindly:
- authorization errors;
- invalid structured output without a correction strategy;
- non-idempotent side effects.

## Middleware

LangChain provides middleware patterns for model/tool retry and context management.

## Interview Phrase

> Retry policy should depend on failure category and idempotency, not on a global 'retry everything' flag.
