# Summarization and Compaction

## Why

Long conversations can be compressed into shorter summaries.

## Compaction Pipeline

```text
Old messages
 ↓
Summarizer
 ↓
Compact state
 + recent messages
 ↓
Next model call
```

## Risk

Summaries can:
- lose details;
- introduce mistakes;
- accumulate drift.

## Rule

Preserve source references or critical facts separately when accuracy matters.
