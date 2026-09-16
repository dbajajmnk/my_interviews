# Model, Instructions, Tools & Context

## Model

The model transforms current context into:
- text;
- structured output;
- tool selection;
- plan/next action.

It should not be treated as the system of record.

## Instructions

Instructions define behavior:
- objective;
- role;
- constraints;
- allowed/forbidden actions;
- output schema;
- escalation rules.

Keep policy-critical rules in code/policy services too. Do not rely only on prompts.

## Tools

Tools expose controlled capabilities:
```text
search_customer
create_ticket
get_invoice
send_email
run_query
```

A tool should have:
- name;
- description;
- input schema;
- authentication;
- authorization;
- timeout;
- validation;
- auditability.

## Context

Context is everything the model sees at a decision point.

Possible sources:
- system instructions;
- conversation;
- task state;
- retrieved documents;
- tool results;
- user profile;
- policies.

More context is not always better. Context should be relevant, current, and bounded.

## Core Interview Point

> Tool calling should be treated as privileged application execution. The model proposes an action; the application validates and executes it.
