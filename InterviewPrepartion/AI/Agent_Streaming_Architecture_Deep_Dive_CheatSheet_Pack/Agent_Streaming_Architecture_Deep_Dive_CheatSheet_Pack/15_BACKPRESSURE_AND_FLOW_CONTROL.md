# Backpressure and Flow Control

## Problem

Producer can emit events faster than consumer can process them.

## Controls

- bounded buffers;
- batching;
- throttling;
- dropping low-value events;
- reactive backpressure;
- slow-consumer disconnect policy.

## Rule

Never let debug-level token/event volume exhaust server memory.
