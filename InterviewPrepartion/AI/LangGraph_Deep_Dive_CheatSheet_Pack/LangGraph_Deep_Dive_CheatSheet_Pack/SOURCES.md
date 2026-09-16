# Official Source Notes

## Verified Against Current LangGraph Reference

This pack was cross-checked against current LangGraph reference material for:
- LangGraph overview
- `StateGraph`
- `CompiledStateGraph`
- `Send`
- `Command`
- `interrupt`
- checkpointing
- stream modes
- Functional API `entrypoint` and `task`
- retry, timeout, and cache policies

## Important Current Details

Current reference material describes LangGraph as a low-level orchestration framework for long-running, stateful agents.

`StateGraph` is a builder and must be compiled before execution. Nodes read state and return partial state updates. Reducers merge state-key updates. `Send` supports dynamic fan-out. Interrupts require persistence and are resumed through `Command`.

## Currency Note

LangGraph evolves quickly. For production coding, verify exact imports and signatures against the current official reference.
