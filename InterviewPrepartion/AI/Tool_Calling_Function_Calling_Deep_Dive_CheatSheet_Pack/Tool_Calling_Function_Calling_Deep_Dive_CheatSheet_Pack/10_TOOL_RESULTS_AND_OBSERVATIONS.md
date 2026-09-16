# Tool Results and Observations

## Result

A tool returns an observation to the agent loop.

## Good Result Design

Return:
- status;
- structured data;
- errors;
- source/reference IDs;
- minimal necessary context.

## Avoid Huge Payloads

Large raw outputs:
- increase token cost;
- degrade reasoning;
- may leak sensitive data.

Normalize and summarize tool responses before sending them back to the model when appropriate.

## Security

Treat tool output as untrusted data. It can contain malicious or misleading instructions.
