# Error Handling and Retry

## Failure Categories

- JSON parse failure;
- schema validation failure;
- business validation failure;
- refusal;
- incomplete generation;
- provider error;
- timeout.

## Retry

Retry only when a different attempt can realistically succeed.

## Repair Strategy

Possible recovery:
- simplify schema;
- provide clearer examples;
- retry transient failures;
- ask model to regenerate;
- split task into smaller structured subtasks.

## Rule

Do not create infinite 'repair JSON' loops.
