# Prompt Design for Structured Outputs

## Good Prompting

Even with schema constraints, instructions should explain field semantics.

## Example

Bad:
> Return priority.

Better:
> `priority` means operational urgency, not customer sentiment. Use `high` only when service is blocked or there is financial impact.

## Why

Schema constrains the allowed shape; prompt/instructions clarify the meaning of values.
