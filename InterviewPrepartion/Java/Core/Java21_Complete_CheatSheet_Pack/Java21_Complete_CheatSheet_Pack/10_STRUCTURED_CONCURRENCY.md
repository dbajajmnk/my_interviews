# Structured Concurrency — Preview in Java 21

## Problem

Unstructured async code can scatter task lifecycle management.

## Goal

Treat a group of related concurrent tasks as one unit.

## Mental Model

```text
Parent Task
 ├── Child Task A
 ├── Child Task B
 └── Child Task C

Parent waits / fails / cancels as a unit
```

## Why

Improves:

- cancellation
- failure handling
- observability
- lifecycle management
- reasoning about concurrent work

## Example Concept

A request may need:

```text
Load User
Load Orders
Load Recommendations
```

These tasks conceptually belong to one parent request scope.

## Compared With CompletableFuture

Structured concurrency emphasizes **task lifetime structure**.

CompletableFuture emphasizes **completion-stage composition**.

## Trap

Structured Concurrency is preview in Java 21.
