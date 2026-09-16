# Results and Run Items

## Result Types

Runner methods return:
- `RunResult`
- `RunResultStreaming`

## Useful Surfaces

Important result properties/helpers include:
- `final_output`
- `new_items`
- `last_agent`
- `raw_responses`
- `to_input_list()`
- `to_state()`

## Streaming Result

Streaming results add:
- event streaming;
- current-agent visibility;
- completion state;
- cancellation controls.

## Interview Point

> The result contains much more than the final text; it is also the audit/debug surface for what happened during the run.
