# Token Budget and Context Window

## Problem

Every model has finite context capacity and practical latency/cost limits.

## Budget Categories

Reserve budget for:
- instructions;
- history;
- retrieval;
- tool results;
- expected output.

## Rule

Do not fill the entire context window with input; preserve output headroom.

## Interview Phrase

> Context window size is a capacity limit, not a target.
