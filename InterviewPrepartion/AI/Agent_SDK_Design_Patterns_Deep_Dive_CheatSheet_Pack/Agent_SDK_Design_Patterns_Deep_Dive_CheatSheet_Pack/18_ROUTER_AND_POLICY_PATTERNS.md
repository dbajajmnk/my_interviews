# Router & Policy Patterns

## Router

A router chooses one path/provider/agent based on runtime context.

## Examples

- route coding tasks to one model;
- route low-cost tasks to smaller model;
- route sensitive workloads to approved region/provider.

## Policy Pattern

Encapsulate rules that decide:
- allowed tools;
- approval requirement;
- data access;
- model eligibility.

## Separation

Routing answers **where should this go?**

Policy answers **is this allowed?**
