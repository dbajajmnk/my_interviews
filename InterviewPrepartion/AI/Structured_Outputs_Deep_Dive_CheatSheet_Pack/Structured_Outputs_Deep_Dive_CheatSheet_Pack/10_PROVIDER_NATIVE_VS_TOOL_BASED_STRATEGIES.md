# Provider-Native vs Tool-Based Structured Output

## Provider-Native

The model/provider directly enforces a response schema.

## Tool-Based

A framework can emulate structured output by asking the model to call a synthetic tool/function whose arguments represent the desired result.

## Trade-Off

Provider-native:
- cleaner;
- usually more direct;
- capability-dependent.

Tool-based:
- broader fallback;
- may add tool-call semantics/overhead.

## Rule

Prefer provider-native schema enforcement when supported and reliable; use tool-based fallback when portability requires it.
