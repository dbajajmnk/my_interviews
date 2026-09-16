# Streaming Structured Outputs

## Challenge

Partial JSON is not a complete typed object.

## Approaches

1. stream raw/token deltas and parse only at completion;
2. stream structured field/event updates when the framework supports it;
3. aggregate then deserialize.

## Production Rule

Do not trigger irreversible downstream actions from partially streamed structured data.
