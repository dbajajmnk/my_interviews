# Sources & Accuracy Notes

This pack is vendor-neutral in its core concepts and includes current 2026 platform adapters.

Primary reference families:
- foundational ML/deep-learning/statistics literature
- transformer/attention research
- retrieval/RAG and information retrieval practices
- OpenAI platform documentation and product updates
- AWS Bedrock / AgentCore documentation
- Google Gemini / Vertex AI documentation
- Anthropic developer documentation
- Azure AI platform documentation
- Hugging Face ecosystem documentation

## Current 2026 Platform Notes

### OpenAI
OpenAI introduced the Agents API in public beta in September 2026 for managed long-running cloud agents with hosted/self-managed environments, context management, tool search and multi-agent capabilities. The Agents SDK remains an application-side orchestration option.

### AWS
Amazon Bedrock Agents is now called Agents Classic and is in maintenance mode for new customers as of July 30, 2026. AWS recommends AgentCore for new agent capabilities. Bedrock Knowledge Bases and Guardrails remain supported.

### Google
Gemini APIs provide model/tool/caching capabilities; model names and preview/stable states change quickly.

## Accuracy Rule

For any real implementation, re-check:
- model/version availability,
- stable vs preview/beta status,
- context limits,
- tool support,
- pricing,
- regional availability,
- data retention/privacy settings,
- API deprecation/migration guidance.
