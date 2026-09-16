# Trimming and Message Selection

## Strategies

- keep latest N turns;
- remove low-value tool traces;
- drop redundant system data;
- keep unresolved requirements;
- preserve safety-critical instructions.

## Risk

Naive truncation can remove:
- user constraints;
- commitments;
- identifiers;
- unresolved decisions.

## Rule

Trim by semantic importance, not just by age.
