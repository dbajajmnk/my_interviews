# Artifacts You Must Version

## Version

- application code;
- agent instructions/prompts;
- model/provider config;
- temperature/reasoning settings;
- tool schemas;
- structured-output schemas;
- retriever config;
- chunking strategy;
- embedding model;
- guardrail policy;
- memory policy;
- eval datasets;
- infrastructure;
- dependencies.

## Rule

If a change can alter agent behavior, it should be traceable to a version.
