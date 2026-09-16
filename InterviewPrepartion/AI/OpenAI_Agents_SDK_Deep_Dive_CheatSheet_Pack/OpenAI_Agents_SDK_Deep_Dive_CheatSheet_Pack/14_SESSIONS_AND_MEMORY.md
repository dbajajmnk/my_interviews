# Sessions and Memory

## Session Purpose

Sessions provide persistent conversation memory across multiple Agent SDK runs.

## Behavior

With a session:
1. prior history is loaded before a run;
2. new items from the run are stored afterward;
3. later runs with the same session continue the conversation.

## Mental Model

```text
Run 1 ─┐
       ├─ Session("conversation_123")
Run 2 ─┤
Run 3 ─┘
```

## Important Distinction

Session memory is different from local `RunContextWrapper` context.

- Session → conversation history.
- Run context → application dependencies/state for runtime code.

## Continuation Choice

Do not blindly stack multiple continuation mechanisms. Choose session-managed history or appropriate server-managed continuation based on your architecture.
