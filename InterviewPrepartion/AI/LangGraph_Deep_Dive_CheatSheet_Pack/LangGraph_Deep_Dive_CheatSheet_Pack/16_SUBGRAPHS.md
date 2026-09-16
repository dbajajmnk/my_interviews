# Subgraphs

## What

A subgraph is a graph embedded inside another graph.

## Why

Subgraphs help isolate:
- reusable workflows;
- specialized agents;
- bounded business domains;
- nested orchestration.

## Architecture

```text
Parent Graph
 ├─ validation
 ├─ Support Subgraph
 │    ├─ classify
 │    └─ resolve
 └─ finalization
```

## Design Rule

Use subgraphs when a workflow has a meaningful independent boundary. Do not split every two nodes into a subgraph.
