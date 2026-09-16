# Tool Selection Flow

## Flow

```text
Goal
 ↓
Available tool definitions
 ↓
Model evaluates intent
 ↓
Choose tool(s)
 ↓
Generate arguments
 ↓
Application validation/execution
```

## Dynamic Tool Availability

Do not expose every tool to every user or every run.

Filter by:
- role;
- tenant;
- workflow phase;
- risk;
- task type.

## Security Note

Not showing a tool to the model is useful, but it is not a substitute for backend authorization.
