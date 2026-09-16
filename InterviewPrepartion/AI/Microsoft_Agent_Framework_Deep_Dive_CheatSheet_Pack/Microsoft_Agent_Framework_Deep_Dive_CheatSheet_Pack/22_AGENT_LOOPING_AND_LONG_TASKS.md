# Agent Looping and Long Tasks

## Looping

Agent looping re-invokes an agent until a completion condition is satisfied.

## Use Cases

- iterative refinement;
- todo completion;
- waiting for background work;
- evaluator-driven completion.

## Critical Rule

Always bound autonomous loops.

## Controls

- maximum iterations;
- completion predicate;
- progress injection;
- fresh-context option;
- approval escape.

## Experimental Note

Agent looping is currently marked experimental in the framework documentation.
