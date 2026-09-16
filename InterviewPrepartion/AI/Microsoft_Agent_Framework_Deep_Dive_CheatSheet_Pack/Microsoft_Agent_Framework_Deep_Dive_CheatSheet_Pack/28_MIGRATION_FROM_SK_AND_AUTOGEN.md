# Migration from Semantic Kernel and AutoGen

## Why Migration Matters

Many enterprise codebases already use Semantic Kernel or AutoGen.

Do not assume greenfield development.

## Semantic Kernel Migration Themes

Current Microsoft guidance emphasizes:
- simplified agent creation;
- unified interfaces;
- updated namespaces;
- session creation;
- tool registration changes;
- streaming/non-streaming invocation;
- DI changes;
- agent type consolidation.

## AutoGen Migration Themes

Agent Framework carries forward multi-agent concepts while providing a new unified foundation with stronger enterprise runtime/workflow features.

## Interview Answer

> I would migrate incrementally: inventory current agents/tools, map session and tool abstractions, preserve behavioral tests, introduce the new common agent interface, then migrate orchestration and persistence separately rather than doing a big-bang rewrite.
