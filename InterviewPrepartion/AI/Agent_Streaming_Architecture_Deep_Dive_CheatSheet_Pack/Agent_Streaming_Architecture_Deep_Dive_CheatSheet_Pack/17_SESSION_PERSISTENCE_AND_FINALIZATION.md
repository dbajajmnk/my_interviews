# Session Persistence and Finalization

## Issue

Final visible text can arrive before:
- session write;
- state compaction;
- audit persistence;
- approval bookkeeping;
- final usage accounting.

## Rule

Only mark the run complete after runtime finalization succeeds.

## UI

Separate:
- “answer text finished”
from
- “run completed”
when the distinction matters.
