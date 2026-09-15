# AI Architecture — Complete Cheat Sheet

> Enterprise AI architecture, RAG, agents, security, platform engineering and system design.


---

<!-- 005_AI_ARCHITECTURE_MENTAL_MODEL.md -->

# AI Architecture Mental Model

## Problem / Intent

Treat the model as one probabilistic component inside a secure, observable distributed system.

## Architecture View

```text
Experience → Policy → Orchestration → Models/Knowledge/Tools → Guardrails → Outcome
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Architecture Mental Model:** Treat the model as one probabilistic component inside a secure, observable distributed system.


---

<!-- 006_ARCHITECTURE_DRIVERS.md -->

# Architecture Drivers

## Problem / Intent

Derive architecture from business value, quality, latency, cost, risk, data residency, scale and operability.

## Architecture View

```text
Requirements → trade-offs → architecture
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Architecture Drivers:** Derive architecture from business value, quality, latency, cost, risk, data residency, scale and operability.


---

<!-- 007_AI_WORKLOAD_CLASSIFICATION.md -->

# AI Workload Classification

## Problem / Intent

Classify workloads as prediction, generation, retrieval, extraction, multimodal, agentic, batch or real-time.

## Architecture View

```text
Workload type → architecture pattern
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Workload Classification:** Classify workloads as prediction, generation, retrieval, extraction, multimodal, agentic, batch or real-time.


---

<!-- 008_DETERMINISTIC_VS_PROBABILISTIC_COMPONENTS.md -->

# Deterministic vs Probabilistic Components

## Problem / Intent

Keep authorization, transactions and invariants deterministic; use models for ambiguous reasoning/generation.

## Architecture View

```text
Deterministic shell around probabilistic core
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Deterministic vs Probabilistic Components:** Keep authorization, transactions and invariants deterministic; use models for ambiguous reasoning/generation.


---

<!-- 009_BUILD_VS_BUY.md -->

# Build vs Buy

## Problem / Intent

Choose managed API, managed platform, self-hosted model or hybrid based on differentiation and constraints.

## Architecture View

```text
Capability × control × cost × risk
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Build vs Buy:** Choose managed API, managed platform, self-hosted model or hybrid based on differentiation and constraints.


---

<!-- 00_MASTER_INDEX.md -->

# AI Architecture — Complete Cheat Sheet Pack

**Purpose:** Enterprise AI system design, RAG, agents, model platforms, security, observability, cost, cloud adapters, and architecture interviews.

**Core principle:** The model is a probabilistic component inside a deterministic, secure, observable distributed architecture.

## Fast Revision

- `01_30_SECOND_RECALL.md`
- `02_REFERENCE_ARCHITECTURE.md`
- `03_ARCHITECTURE_DECISION_TREE.md`
- `04_ENTERPRISE_AI_PLATFORM.md`

## Architecture Foundations

- AI Architecture Mental Model — `005_AI_ARCHITECTURE_MENTAL_MODEL.md`
- Architecture Drivers — `006_ARCHITECTURE_DRIVERS.md`
- AI Workload Classification — `007_AI_WORKLOAD_CLASSIFICATION.md`
- Deterministic vs Probabilistic Components — `008_DETERMINISTIC_VS_PROBABILISTIC_COMPONENTS.md`
- Build vs Buy — `009_BUILD_VS_BUY.md`
- Reference Architecture Layers — `010_REFERENCE_ARCHITECTURE_LAYERS.md`
- Capability-Based Architecture — `011_CAPABILITY_BASED_ARCHITECTURE.md`
- Architecture Decision Records — `012_ARCHITECTURE_DECISION_RECORDS.md`
- AI Nonfunctional Requirements — `013_AI_NONFUNCTIONAL_REQUIREMENTS.md`
- AI Failure Domains — `014_AI_FAILURE_DOMAINS.md`

## Experience & API Layer

- AI BFF — `015_AI_BFF.md`
- Conversation API — `016_CONVERSATION_API.md`
- Streaming Architecture — `017_STREAMING_ARCHITECTURE.md`
- Async Job Architecture — `018_ASYNC_JOB_ARCHITECTURE.md`
- Webhook Callback Pattern — `019_WEBHOOK_CALLBACK_PATTERN.md`
- Realtime Voice Architecture — `020_REALTIME_VOICE_ARCHITECTURE.md`
- Mobile AI Architecture — `021_MOBILE_AI_ARCHITECTURE.md`
- Multimodal Request Architecture — `022_MULTIMODAL_REQUEST_ARCHITECTURE.md`
- Session Management — `023_SESSION_MANAGEMENT.md`
- Rate Limiting & Quotas — `024_RATE_LIMITING_QUOTAS.md`

## Identity, Security & Policy

- Identity Propagation — `025_IDENTITY_PROPAGATION.md`
- Authorization Boundary — `026_AUTHORIZATION_BOUNDARY.md`
- Least Privilege Tooling — `027_LEAST_PRIVILEGE_TOOLING.md`
- Secrets Architecture — `028_SECRETS_ARCHITECTURE.md`
- Network Isolation — `029_NETWORK_ISOLATION.md`
- Egress Control — `030_EGRESS_CONTROL.md`
- Data Classification — `031_DATA_CLASSIFICATION.md`
- PII Redaction — `032_PII_REDACTION.md`
- Tenant Isolation — `033_TENANT_ISOLATION.md`
- Prompt Injection Defense — `034_PROMPT_INJECTION_DEFENSE.md`
- Indirect Prompt Injection — `035_INDIRECT_PROMPT_INJECTION.md`
- Tool Authorization — `036_TOOL_AUTHORIZATION.md`
- Human Approval Gate — `037_HUMAN_APPROVAL_GATE.md`
- Sandbox Architecture — `038_SANDBOX_ARCHITECTURE.md`
- Audit Architecture — `039_AUDIT_ARCHITECTURE.md`
- Policy as Code — `040_POLICY_AS_CODE.md`
- Zero Trust AI — `041_ZERO_TRUST_AI.md`

## Model Gateway & Model Layer

- Model Gateway — `042_MODEL_GATEWAY.md`
- Provider Abstraction — `043_PROVIDER_ABSTRACTION.md`
- Model Router — `044_MODEL_ROUTER.md`
- Tiered Model Strategy — `045_TIERED_MODEL_STRATEGY.md`
- Fallback Provider — `046_FALLBACK_PROVIDER.md`
- Model Version Pinning — `047_MODEL_VERSION_PINNING.md`
- Model Capability Registry — `048_MODEL_CAPABILITY_REGISTRY.md`
- Model Health Checks — `049_MODEL_HEALTH_CHECKS.md`
- Inference Concurrency — `050_INFERENCE_CONCURRENCY.md`
- Batch Inference Architecture — `051_BATCH_INFERENCE_ARCHITECTURE.md`
- Self-Hosted Model Serving — `052_SELF_HOSTED_MODEL_SERVING.md`
- GPU Serving Architecture — `053_GPU_SERVING_ARCHITECTURE.md`
- Quantized Serving — `054_QUANTIZED_SERVING.md`
- Semantic Cache — `055_SEMANTIC_CACHE.md`
- Exact Response Cache — `056_EXACT_RESPONSE_CACHE.md`
- Prompt Cache Architecture — `057_PROMPT_CACHE_ARCHITECTURE.md`

## Prompt & Context Architecture

- Prompt Registry — `058_PROMPT_REGISTRY.md`
- Prompt Composition — `059_PROMPT_COMPOSITION.md`
- Context Budgeting — `060_CONTEXT_BUDGETING.md`
- Context Selection — `061_CONTEXT_SELECTION.md`
- Conversation Summarization — `062_CONVERSATION_SUMMARIZATION.md`
- Context Compression — `063_CONTEXT_COMPRESSION.md`
- Structured Output Contract — `064_STRUCTURED_OUTPUT_CONTRACT.md`
- Prompt Version Compatibility — `065_PROMPT_VERSION_COMPATIBILITY.md`
- Instruction Hierarchy — `066_INSTRUCTION_HIERARCHY.md`
- Context Freshness — `067_CONTEXT_FRESHNESS.md`

## Knowledge & RAG Architecture

- Enterprise RAG Reference — `068_ENTERPRISE_RAG_REFERENCE.md`
- Ingestion Architecture — `069_INGESTION_ARCHITECTURE.md`
- Parsing Pipeline — `070_PARSING_PIPELINE.md`
- Chunking Service — `071_CHUNKING_SERVICE.md`
- Embedding Service — `072_EMBEDDING_SERVICE.md`
- Vector Store — `073_VECTOR_STORE.md`
- Lexical Search — `074_LEXICAL_SEARCH.md`
- Hybrid Retrieval — `075_HYBRID_RETRIEVAL.md`
- Reranking Layer — `076_RERANKING_LAYER.md`
- Query Rewrite Layer — `077_QUERY_REWRITE_LAYER.md`
- Multi-Query Retrieval — `078_MULTI_QUERY_RETRIEVAL.md`
- Metadata Filtering — `079_METADATA_FILTERING.md`
- Permission-Aware Retrieval — `080_PERMISSION_AWARE_RETRIEVAL.md`
- Knowledge Freshness Pipeline — `081_KNOWLEDGE_FRESHNESS_PIPELINE.md`
- Citation Architecture — `082_CITATION_ARCHITECTURE.md`
- RAG Evaluation Architecture — `083_RAG_EVALUATION_ARCHITECTURE.md`
- Graph RAG Architecture — `084_GRAPH_RAG_ARCHITECTURE.md`
- SQL/Structured RAG — `085_SQL_STRUCTURED_RAG.md`
- Federated Retrieval — `086_FEDERATED_RETRIEVAL.md`
- RAG Gateway — `087_RAG_GATEWAY.md`

## Agent Architecture

- Agent Reference Architecture — `088_AGENT_REFERENCE_ARCHITECTURE.md`
- Agent Runtime — `089_AGENT_RUNTIME.md`
- Agent vs Workflow Boundary — `090_AGENT_VS_WORKFLOW_BOUNDARY.md`
- Tool Gateway — `091_TOOL_GATEWAY.md`
- Tool Registry — `092_TOOL_REGISTRY.md`
- Dynamic Tool Search — `093_DYNAMIC_TOOL_SEARCH.md`
- MCP Architecture — `094_MCP_ARCHITECTURE.md`
- Agent Memory Service — `095_AGENT_MEMORY_SERVICE.md`
- Agent Checkpointing — `096_AGENT_CHECKPOINTING.md`
- Durable Agent Execution — `097_DURABLE_AGENT_EXECUTION.md`
- Agent Idempotency — `098_AGENT_IDEMPOTENCY.md`
- Compensation Pattern — `099_COMPENSATION_PATTERN.md`
- Agent Stop Conditions — `100_AGENT_STOP_CONDITIONS.md`
- Agent Budget Controller — `101_AGENT_BUDGET_CONTROLLER.md`
- Agent Handoff — `102_AGENT_HANDOFF.md`
- Supervisor Multi-Agent — `103_SUPERVISOR_MULTI_AGENT.md`
- Parallel Agent Fanout — `104_PARALLEL_AGENT_FANOUT.md`
- Agent-to-Agent Contract — `105_AGENT_TO_AGENT_CONTRACT.md`
- Human-in-the-Loop Agent — `106_HUMAN_IN_THE_LOOP_AGENT.md`
- Agent Sandbox — `107_AGENT_SANDBOX.md`
- Agent Observability — `108_AGENT_OBSERVABILITY.md`
- Agent Evaluation Harness — `109_AGENT_EVALUATION_HARNESS.md`
- Agent Rollback Strategy — `110_AGENT_ROLLBACK_STRATEGY.md`
- Long-Running Agent Session — `111_LONG_RUNNING_AGENT_SESSION.md`

## Memory Architecture

- Memory Taxonomy — `112_MEMORY_TAXONOMY.md`
- Short-Term Memory — `113_SHORT_TERM_MEMORY.md`
- Long-Term User Memory — `114_LONG_TERM_USER_MEMORY.md`
- Episodic Memory — `115_EPISODIC_MEMORY.md`
- Semantic Memory — `116_SEMANTIC_MEMORY.md`
- Memory Extraction — `117_MEMORY_EXTRACTION.md`
- Memory Retrieval — `118_MEMORY_RETRIEVAL.md`
- Memory Forgetting — `119_MEMORY_FORGETTING.md`
- Memory Privacy — `120_MEMORY_PRIVACY.md`
- Memory Poisoning Defense — `121_MEMORY_POISONING_DEFENSE.md`
- Memory vs RAG — `122_MEMORY_VS_RAG.md`

## Workflow & Orchestration

- AI Workflow Engine — `123_AI_WORKFLOW_ENGINE.md`
- Deterministic Outer Loop — `124_DETERMINISTIC_OUTER_LOOP.md`
- Saga for AI Actions — `125_SAGA_FOR_AI_ACTIONS.md`
- Event-Driven AI — `126_EVENT_DRIVEN_AI.md`
- Scheduled AI — `127_SCHEDULED_AI.md`
- Queue-Based AI Workers — `128_QUEUE_BASED_AI_WORKERS.md`
- Backpressure — `129_BACKPRESSURE.md`
- Retry Architecture — `130_RETRY_ARCHITECTURE.md`
- Circuit Breaker — `131_CIRCUIT_BREAKER.md`
- Dead Letter Queue — `132_DEAD_LETTER_QUEUE.md`
- Priority Queue — `133_PRIORITY_QUEUE.md`

## Evaluation & Quality Architecture

- Evaluation Platform — `134_EVALUATION_PLATFORM.md`
- Golden Dataset — `135_GOLDEN_DATASET.md`
- Online Evaluation — `136_ONLINE_EVALUATION.md`
- Offline Evaluation — `137_OFFLINE_EVALUATION.md`
- Human Evaluation Queue — `138_HUMAN_EVALUATION_QUEUE.md`
- LLM Judge Service — `139_LLM_JUDGE_SERVICE.md`
- Pairwise Evaluation — `140_PAIRWISE_EVALUATION.md`
- RAG Quality Dashboard — `141_RAG_QUALITY_DASHBOARD.md`
- Agent Success Metrics — `142_AGENT_SUCCESS_METRICS.md`
- Safety Evaluation — `143_SAFETY_EVALUATION.md`
- Release Quality Gate — `144_RELEASE_QUALITY_GATE.md`
- Continuous Failure Mining — `145_CONTINUOUS_FAILURE_MINING.md`

## Guardrails & Responsible AI

- Guardrail Pipeline — `146_GUARDRAIL_PIPELINE.md`
- Input Classifier — `147_INPUT_CLASSIFIER.md`
- Output Validator — `148_OUTPUT_VALIDATOR.md`
- Tool Guardrail — `149_TOOL_GUARDRAIL.md`
- Grounding Guardrail — `150_GROUNDING_GUARDRAIL.md`
- Confidence & Abstention — `151_CONFIDENCE_ABSTENTION.md`
- Responsible AI Review — `152_RESPONSIBLE_AI_REVIEW.md`
- Bias Monitoring — `153_BIAS_MONITORING.md`
- Explainability Layer — `154_EXPLAINABILITY_LAYER.md`
- Model Risk Tiering — `155_MODEL_RISK_TIERING.md`

## Observability & Operations

- AI Distributed Tracing — `156_AI_DISTRIBUTED_TRACING.md`
- Prompt Telemetry — `157_PROMPT_TELEMETRY.md`
- Model Telemetry — `158_MODEL_TELEMETRY.md`
- Retrieval Telemetry — `159_RETRIEVAL_TELEMETRY.md`
- Tool Telemetry — `160_TOOL_TELEMETRY.md`
- Cost Attribution — `161_COST_ATTRIBUTION.md`
- Latency Budget — `162_LATENCY_BUDGET.md`
- SLO Architecture — `163_SLO_ARCHITECTURE.md`
- AI Incident Response — `164_AI_INCIDENT_RESPONSE.md`
- Quality Monitoring — `165_QUALITY_MONITORING.md`
- Capacity Planning — `166_CAPACITY_PLANNING.md`
- Operational Runbooks — `167_OPERATIONAL_RUNBOOKS.md`

## Cost & Performance Architecture

- AI Cost Model — `168_AI_COST_MODEL.md`
- Model Right-Sizing — `169_MODEL_RIGHT_SIZING.md`
- Token Optimization — `170_TOKEN_OPTIMIZATION.md`
- Parallelization — `171_PARALLELIZATION.md`
- Speculative Execution — `172_SPECULATIVE_EXECUTION.md`
- Caching Layers — `173_CACHING_LAYERS.md`
- Batching — `174_BATCHING.md`
- Autoscaling — `175_AUTOSCALING.md`
- GPU Utilization — `176_GPU_UTILIZATION.md`
- Latency vs Quality Tradeoff — `177_LATENCY_VS_QUALITY_TRADEOFF.md`
- Cost Budget Enforcement — `178_COST_BUDGET_ENFORCEMENT.md`

## Data & Storage Architecture

- Conversation Store — `179_CONVERSATION_STORE.md`
- Object Store — `180_OBJECT_STORE.md`
- Vector Store Architecture — `181_VECTOR_STORE_ARCHITECTURE.md`
- Metadata Store — `182_METADATA_STORE.md`
- Checkpoint Store — `183_CHECKPOINT_STORE.md`
- Feature Store — `184_FEATURE_STORE.md`
- Model Registry — `185_MODEL_REGISTRY.md`
- Artifact Registry — `186_ARTIFACT_REGISTRY.md`
- Data Residency — `187_DATA_RESIDENCY.md`
- Retention Policy — `188_RETENTION_POLICY.md`

## Deployment & Platform Engineering

- AI Platform Team — `189_AI_PLATFORM_TEAM.md`
- Paved Road — `190_PAVED_ROAD.md`
- Infrastructure as Code — `191_INFRASTRUCTURE_AS_CODE.md`
- Environment Strategy — `192_ENVIRONMENT_STRATEGY.md`
- Prompt CI CD — `193_PROMPT_CI_CD.md`
- RAG CI CD — `194_RAG_CI_CD.md`
- Agent CI CD — `195_AGENT_CI_CD.md`
- Canary AI Release — `196_CANARY_AI_RELEASE.md`
- Shadow AI Release — `197_SHADOW_AI_RELEASE.md`
- Blue Green AI — `198_BLUE_GREEN_AI.md`
- Rollback — `199_ROLLBACK.md`
- Multi-Region Architecture — `200_MULTI_REGION_ARCHITECTURE.md`
- Multi-Provider Architecture — `201_MULTI_PROVIDER_ARCHITECTURE.md`
- Disaster Recovery — `202_DISASTER_RECOVERY.md`

## Cloud & Provider Adapters

- AWS AI Architecture — `203_AWS_AI_ARCHITECTURE.md`
- AWS AgentCore Runtime — `204_AWS_AGENTCORE_RUNTIME.md`
- AWS AgentCore Gateway — `205_AWS_AGENTCORE_GATEWAY.md`
- AWS AgentCore Memory — `206_AWS_AGENTCORE_MEMORY.md`
- Azure Foundry Architecture — `207_AZURE_FOUNDRY_ARCHITECTURE.md`
- Microsoft Foundry Agent Service — `208_MICROSOFT_FOUNDRY_AGENT_SERVICE.md`
- Azure Knowledge Architecture — `209_AZURE_KNOWLEDGE_ARCHITECTURE.md`
- Google Vertex AI Architecture — `210_GOOGLE_VERTEX_AI_ARCHITECTURE.md`
- OpenAI Architecture — `211_OPENAI_ARCHITECTURE.md`
- Open Source AI Architecture — `212_OPEN_SOURCE_AI_ARCHITECTURE.md`
- Hybrid Cloud AI — `213_HYBRID_CLOUD_AI.md`

## Enterprise Governance

- AI Service Catalog — `214_AI_SERVICE_CATALOG.md`
- AI Inventory — `215_AI_INVENTORY.md`
- Architecture Review Board — `216_ARCHITECTURE_REVIEW_BOARD.md`
- Model Approval Workflow — `217_MODEL_APPROVAL_WORKFLOW.md`
- Tool Approval Workflow — `218_TOOL_APPROVAL_WORKFLOW.md`
- Data Governance — `219_DATA_GOVERNANCE.md`
- Change Governance — `220_CHANGE_GOVERNANCE.md`
- Vendor Risk — `221_VENDOR_RISK.md`
- Exit Strategy — `222_EXIT_STRATEGY.md`
- FinOps for AI — `223_FINOPS_FOR_AI.md`

## System Design & Interview

- Design Enterprise RAG — `224_DESIGN_ENTERPRISE_RAG.md`
- Design AI Chat Platform — `225_DESIGN_AI_CHAT_PLATFORM.md`
- Design Coding Agent — `226_DESIGN_CODING_AGENT.md`
- Design Customer Support Agent — `227_DESIGN_CUSTOMER_SUPPORT_AGENT.md`
- Design Document Intelligence — `228_DESIGN_DOCUMENT_INTELLIGENCE.md`
- Design Voice Agent — `229_DESIGN_VOICE_AGENT.md`
- Design Multi-Agent Research — `230_DESIGN_MULTI_AGENT_RESEARCH.md`
- Design AI Platform — `231_DESIGN_AI_PLATFORM.md`
- RAG vs Long Context — `232_RAG_VS_LONG_CONTEXT.md`
- Agent vs Microservice — `233_AGENT_VS_MICROSERVICE.md`
- Architecture Anti-Patterns — `234_ARCHITECTURE_ANTI_PATTERNS.md`
- AI Architecture Interview Traps — `235_AI_ARCHITECTURE_INTERVIEW_TRAPS.md`


---

<!-- 010_REFERENCE_ARCHITECTURE_LAYERS.md -->

# Reference Architecture Layers

## Problem / Intent

Separate experience, gateway, orchestration, intelligence, knowledge, tools, policy and operations.

## Architecture View

```text
Layered AI platform
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Reference Architecture Layers:** Separate experience, gateway, orchestration, intelligence, knowledge, tools, policy and operations.


---

<!-- 011_CAPABILITY_BASED_ARCHITECTURE.md -->

# Capability-Based Architecture

## Problem / Intent

Architect to capabilities such as generate/embed/retrieve/tool-call rather than vendor model names.

## Architecture View

```text
Capability contract → provider adapter
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Capability-Based Architecture:** Architect to capabilities such as generate/embed/retrieve/tool-call rather than vendor model names.


---

<!-- 012_ARCHITECTURE_DECISION_RECORDS.md -->

# Architecture Decision Records

## Problem / Intent

Record model/platform/data/security decisions and trade-offs.

## Architecture View

```text
Decision → context → alternatives → consequence
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Architecture Decision Records:** Record model/platform/data/security decisions and trade-offs.


---

<!-- 013_AI_NONFUNCTIONAL_REQUIREMENTS.md -->

# AI Nonfunctional Requirements

## Problem / Intent

Define quality, availability, latency, throughput, privacy, safety, cost and explainability targets.

## Architecture View

```text
NFRs → SLOs
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Nonfunctional Requirements:** Define quality, availability, latency, throughput, privacy, safety, cost and explainability targets.


---

<!-- 014_AI_FAILURE_DOMAINS.md -->

# AI Failure Domains

## Problem / Intent

Identify failure domains for model, retrieval, tool, policy, network, provider and user context.

## Architecture View

```text
Failure map → isolation/fallback
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Failure Domains:** Identify failure domains for model, retrieval, tool, policy, network, provider and user context.


---

<!-- 015_AI_BFF.md -->

# AI BFF

## Problem / Intent

Use a backend-for-frontend to manage sessions, streaming, model calls, tools and policy without exposing provider secrets.

## Architecture View

```text
Web/Mobile → AI BFF → AI platform
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI BFF:** Use a backend-for-frontend to manage sessions, streaming, model calls, tools and policy without exposing provider secrets.


---

<!-- 016_CONVERSATION_API.md -->

# Conversation API

## Problem / Intent

Model conversations as explicit sessions/messages/responses instead of raw provider history.

## Architecture View

```text
Client → session API → context service
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Conversation API:** Model conversations as explicit sessions/messages/responses instead of raw provider history.


---

<!-- 017_STREAMING_ARCHITECTURE.md -->

# Streaming Architecture

## Problem / Intent

Stream tokens/events progressively with cancellation, backpressure and reconnect semantics.

## Architecture View

```text
Model stream → gateway → SSE/WebSocket → UI
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Streaming Architecture:** Stream tokens/events progressively with cancellation, backpressure and reconnect semantics.


---

<!-- 018_ASYNC_JOB_ARCHITECTURE.md -->

# Async Job Architecture

## Problem / Intent

Queue long-running generation/agent work and return job handles.

## Architecture View

```text
Request → queue → worker → result store
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Async Job Architecture:** Queue long-running generation/agent work and return job handles.


---

<!-- 019_WEBHOOK_CALLBACK_PATTERN.md -->

# Webhook Callback Pattern

## Problem / Intent

Notify external systems when long AI work completes.

## Architecture View

```text
Job → callback/webhook
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Webhook Callback Pattern:** Notify external systems when long AI work completes.


---

<!-- 01_30_SECOND_RECALL.md -->

# AI Architecture — 30-Second Recall

```text
Experience / Channels
        ↓
API Gateway / AI BFF
        ↓
Identity + Policy + Quotas
        ↓
AI Orchestration
 ├── Model Gateway / Router
 ├── RAG / Knowledge
 ├── Agent Runtime
 └── Tool Gateway
        ↓
Guardrails / Output Validation
        ↓
User / Business Action

Cross-Cutting:
Evals • Tracing • Audit • Cost • Security • Governance
```

## Golden Rules

1. Model ≠ application architecture.
2. Authorization stays deterministic.
3. Retrieve only authorized evidence.
4. Tools get least privilege.
5. Agents are bounded by steps/time/cost.
6. Every release is evaluated.
7. Every production call is observable.
8. Architect to capabilities, not vendor model names.


---

<!-- 020_REALTIME_VOICE_ARCHITECTURE.md -->

# Realtime Voice Architecture

## Problem / Intent

Separate media transport, speech/model session and business tool layer.

## Architecture View

```text
Audio stream → realtime model → tools
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Realtime Voice Architecture:** Separate media transport, speech/model session and business tool layer.


---

<!-- 021_MOBILE_AI_ARCHITECTURE.md -->

# Mobile AI Architecture

## Problem / Intent

Use thin mobile client, secure backend token exchange, bandwidth-aware streaming and offline-safe UX.

## Architecture View

```text
Mobile → BFF → AI services
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Mobile AI Architecture:** Use thin mobile client, secure backend token exchange, bandwidth-aware streaming and offline-safe UX.


---

<!-- 022_MULTIMODAL_REQUEST_ARCHITECTURE.md -->

# Multimodal Request Architecture

## Problem / Intent

Normalize text/image/audio/video inputs into governed model request pipeline.

## Architecture View

```text
Media ingest → preprocessing → model
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Multimodal Request Architecture:** Normalize text/image/audio/video inputs into governed model request pipeline.


---

<!-- 023_SESSION_MANAGEMENT.md -->

# Session Management

## Problem / Intent

Keep user/session identity separate from provider conversation identifiers.

## Architecture View

```text
User session ↔ AI session ↔ provider session
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Session Management:** Keep user/session identity separate from provider conversation identifiers.


---

<!-- 024_RATE_LIMITING_QUOTAS.md -->

# Rate Limiting & Quotas

## Problem / Intent

Apply per-user/tenant/model/tool quotas at trusted gateway.

## Architecture View

```text
Identity → quota → request
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Rate Limiting & Quotas:** Apply per-user/tenant/model/tool quotas at trusted gateway.


---

<!-- 025_IDENTITY_PROPAGATION.md -->

# Identity Propagation

## Problem / Intent

Carry authenticated identity through retrieval, tools and audit without embedding raw secrets in prompts.

## Architecture View

```text
User identity → policy context → downstream
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Identity Propagation:** Carry authenticated identity through retrieval, tools and audit without embedding raw secrets in prompts.


---

<!-- 026_AUTHORIZATION_BOUNDARY.md -->

# Authorization Boundary

## Problem / Intent

Enforce access deterministically before data retrieval or tool execution.

## Architecture View

```text
Model intent → policy engine → action
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Authorization Boundary:** Enforce access deterministically before data retrieval or tool execution.


---

<!-- 027_LEAST_PRIVILEGE_TOOLING.md -->

# Least Privilege Tooling

## Problem / Intent

Give each agent/tool minimal scoped credentials.

## Architecture View

```text
Agent → scoped identity → tool
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Least Privilege Tooling:** Give each agent/tool minimal scoped credentials.


---

<!-- 028_SECRETS_ARCHITECTURE.md -->

# Secrets Architecture

## Problem / Intent

Keep secrets in vault/executor boundary, never model context.

## Architecture View

```text
Model requests action → executor injects secret
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Secrets Architecture:** Keep secrets in vault/executor boundary, never model context.


---

<!-- 029_NETWORK_ISOLATION.md -->

# Network Isolation

## Problem / Intent

Use private endpoints/VPC/VNet, controlled egress and service segmentation where needed.

## Architecture View

```text
Private app → private AI/data endpoints
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Network Isolation:** Use private endpoints/VPC/VNet, controlled egress and service segmentation where needed.


---

<!-- 02_REFERENCE_ARCHITECTURE.md -->

# Enterprise AI Reference Architecture

```text
┌─────────────────────────────────────────┐
│ Web • Mobile • API • Voice • Copilot   │
└────────────────────┬────────────────────┘
                     ↓
          API Gateway / AI BFF
                     ↓
       Identity • Quota • Policy • DLP
                     ↓
             AI Orchestrator
        ┌────────────┼────────────┐
        ↓            ↓            ↓
 Model Gateway   Knowledge/RAG   Agent Runtime
        │            │            │
 Models/SLMs     Search/Vector    Tool Gateway
                                  │
                              APIs/MCP/Apps
        └────────────┬────────────┘
                     ↓
       Guardrails • Schema Validation
                     ↓
                 Response/Action

Data Plane:
Documents • Metadata • Memory • Conversations • Checkpoints

Ops Plane:
Evals • Traces • Audit • Cost • SLOs • Release Registry
```

## Principle

Keep business invariants, authorization, payment/deletion/deployment controls, and transactional guarantees outside model reasoning.


---

<!-- 030_EGRESS_CONTROL.md -->

# Egress Control

## Problem / Intent

Restrict sandbox/agent outbound destinations.

## Architecture View

```text
Sandbox → egress proxy/allowlist
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Egress Control:** Restrict sandbox/agent outbound destinations.


---

<!-- 031_DATA_CLASSIFICATION.md -->

# Data Classification

## Problem / Intent

Classify input/context/output and route controls based on sensitivity.

## Architecture View

```text
Data class → policy
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Data Classification:** Classify input/context/output and route controls based on sensitivity.


---

<!-- 032_PII_REDACTION.md -->

# PII Redaction

## Problem / Intent

Redact/tokenize sensitive fields before model/logging where business permits.

## Architecture View

```text
Input → DLP/redaction → model
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **PII Redaction:** Redact/tokenize sensitive fields before model/logging where business permits.


---

<!-- 033_TENANT_ISOLATION.md -->

# Tenant Isolation

## Problem / Intent

Isolate memory, retrieval indexes, credentials, logs and quotas by tenant.

## Architecture View

```text
Tenant ID → isolated data/tools
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Tenant Isolation:** Isolate memory, retrieval indexes, credentials, logs and quotas by tenant.


---

<!-- 034_PROMPT_INJECTION_DEFENSE.md -->

# Prompt Injection Defense

## Problem / Intent

Treat retrieved/web/tool content as untrusted data and separate from authority.

## Architecture View

```text
Trusted instructions + untrusted content
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Prompt Injection Defense:** Treat retrieved/web/tool content as untrusted data and separate from authority.


---

<!-- 035_INDIRECT_PROMPT_INJECTION.md -->

# Indirect Prompt Injection

## Problem / Intent

Apply the same threat model to documents, emails, web pages and tool results.

## Architecture View

```text
External content → untrusted context
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Indirect Prompt Injection:** Apply the same threat model to documents, emails, web pages and tool results.


---

<!-- 036_TOOL_AUTHORIZATION.md -->

# Tool Authorization

## Problem / Intent

Validate tool name, arguments, resource scope and user permission outside the model.

## Architecture View

```text
Tool proposal → deterministic auth → execute
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Tool Authorization:** Validate tool name, arguments, resource scope and user permission outside the model.


---

<!-- 037_HUMAN_APPROVAL_GATE.md -->

# Human Approval Gate

## Problem / Intent

Bind approval to an exact proposed high-impact action.

## Architecture View

```text
Agent proposal → signed approval → executor
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Human Approval Gate:** Bind approval to an exact proposed high-impact action.


---

<!-- 038_SANDBOX_ARCHITECTURE.md -->

# Sandbox Architecture

## Problem / Intent

Run generated code/browser/file operations in isolated environments with resource/network limits.

## Architecture View

```text
Agent → sandbox → controlled resources
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Sandbox Architecture:** Run generated code/browser/file operations in isolated environments with resource/network limits.


---

<!-- 039_AUDIT_ARCHITECTURE.md -->

# Audit Architecture

## Problem / Intent

Record user, model, prompt version, retrieval, tool, approval and outcome metadata.

## Architecture View

```text
Trace/Audit event stream
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Audit Architecture:** Record user, model, prompt version, retrieval, tool, approval and outcome metadata.


---

<!-- 03_ARCHITECTURE_DECISION_TREE.md -->

# AI Architecture Decision Tree

```text
Need only prediction from structured data?
→ ML service

Need generated content/reasoning?
→ Foundation model

Need private/current knowledge?
→ RAG

Need external actions?
├─ Known steps → deterministic workflow + AI nodes
└─ Unknown dynamic steps → bounded agent

Need many models/providers?
→ Model Gateway + Capability Registry

Need many enterprise tools?
→ Tool Gateway + Registry + Policy

Need long-running work?
→ Queue/Workflow + Checkpoints + Agent Runtime

High-impact action?
→ Human Approval + deterministic authorization
```


---

<!-- 040_POLICY_AS_CODE.md -->

# Policy as Code

## Problem / Intent

Represent AI security/compliance rules in deterministic policy service.

## Architecture View

```text
Request/action → policy engine
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Policy as Code:** Represent AI security/compliance rules in deterministic policy service.


---

<!-- 041_ZERO_TRUST_AI.md -->

# Zero Trust AI

## Problem / Intent

Authenticate and authorize every service/data/tool boundary regardless of network location.

## Architecture View

```text
Identity + policy at every hop
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Zero Trust AI:** Authenticate and authorize every service/data/tool boundary regardless of network location.


---

<!-- 042_MODEL_GATEWAY.md -->

# Model Gateway

## Problem / Intent

Centralize model access, routing, retries, telemetry, policy and provider adapters.

## Architecture View

```text
Apps → Model Gateway → providers
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Gateway:** Centralize model access, routing, retries, telemetry, policy and provider adapters.


---

<!-- 043_PROVIDER_ABSTRACTION.md -->

# Provider Abstraction

## Problem / Intent

Expose capability interfaces instead of raw provider APIs.

## Architecture View

```text
generate/embed/rerank → adapters
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Provider Abstraction:** Expose capability interfaces instead of raw provider APIs.


---

<!-- 044_MODEL_ROUTER.md -->

# Model Router

## Problem / Intent

Route by task, risk, modality, latency, availability and cost.

## Architecture View

```text
Request → router → model
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Router:** Route by task, risk, modality, latency, availability and cost.


---

<!-- 045_TIERED_MODEL_STRATEGY.md -->

# Tiered Model Strategy

## Problem / Intent

Use small/fast model first and escalate to stronger model when needed.

## Architecture View

```text
SLM → LLM escalation
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Tiered Model Strategy:** Use small/fast model first and escalate to stronger model when needed.


---

<!-- 046_FALLBACK_PROVIDER.md -->

# Fallback Provider

## Problem / Intent

Fail over to compatible provider/model after policy-approved failures.

## Architecture View

```text
Primary → fallback
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Fallback Provider:** Fail over to compatible provider/model after policy-approved failures.


---

<!-- 047_MODEL_VERSION_PINNING.md -->

# Model Version Pinning

## Problem / Intent

Pin deployable versions and record aliases resolved at runtime.

## Architecture View

```text
Logical model → exact version
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Version Pinning:** Pin deployable versions and record aliases resolved at runtime.


---

<!-- 048_MODEL_CAPABILITY_REGISTRY.md -->

# Model Capability Registry

## Problem / Intent

Store context size, modality, tools, residency, cost and eval results.

## Architecture View

```text
Registry → router
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Capability Registry:** Store context size, modality, tools, residency, cost and eval results.


---

<!-- 049_MODEL_HEALTH_CHECKS.md -->

# Model Health Checks

## Problem / Intent

Continuously probe availability, latency and behavioral quality.

## Architecture View

```text
Synthetic probes → model SLO
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Health Checks:** Continuously probe availability, latency and behavioral quality.


---

<!-- 04_ENTERPRISE_AI_PLATFORM.md -->

# Enterprise AI Platform — Paved Road

## Shared Services

```text
Model Gateway
RAG Service
Embedding Service
Tool Gateway
Agent Runtime
Memory Service
Prompt Registry
Evaluation Platform
Guardrail/Policy Service
Observability
Cost/Quota Service
Secrets/Identity
```

## Product Teams Own

```text
Business use case
UX
Domain workflow
Domain tools
Domain knowledge
Acceptance criteria
Business KPIs
```

## Platform Team Owns

```text
Secure defaults
Reusable infrastructure
Provider adapters
Governance hooks
Observability
Release/evaluation mechanisms
```


---

<!-- 050_INFERENCE_CONCURRENCY.md -->

# Inference Concurrency

## Problem / Intent

Control requests, queues and provider quotas.

## Architecture View

```text
Ingress → queue/concurrency limiter → model
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Inference Concurrency:** Control requests, queues and provider quotas.


---

<!-- 051_BATCH_INFERENCE_ARCHITECTURE.md -->

# Batch Inference Architecture

## Problem / Intent

Use offline workers for high-volume noninteractive AI.

## Architecture View

```text
Dataset → batch workers → result store
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Batch Inference Architecture:** Use offline workers for high-volume noninteractive AI.


---

<!-- 052_SELF_HOSTED_MODEL_SERVING.md -->

# Self-Hosted Model Serving

## Problem / Intent

Serve open/owned models behind autoscaled inference endpoints.

## Architecture View

```text
Gateway → inference cluster
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Self-Hosted Model Serving:** Serve open/owned models behind autoscaled inference endpoints.


---

<!-- 053_GPU_SERVING_ARCHITECTURE.md -->

# GPU Serving Architecture

## Problem / Intent

Separate scheduler, model server, GPU pool, cache and autoscaling.

## Architecture View

```text
Request queue → GPU serving
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **GPU Serving Architecture:** Separate scheduler, model server, GPU pool, cache and autoscaling.


---

<!-- 054_QUANTIZED_SERVING.md -->

# Quantized Serving

## Problem / Intent

Use lower-precision model variants when quality/latency economics justify.

## Architecture View

```text
FP/BF → INT8/INT4
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Quantized Serving:** Use lower-precision model variants when quality/latency economics justify.


---

<!-- 055_SEMANTIC_CACHE.md -->

# Semantic Cache

## Problem / Intent

Cache semantically equivalent low-risk requests behind policy/version keys.

## Architecture View

```text
Query → embedding → semantic cache
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Semantic Cache:** Cache semantically equivalent low-risk requests behind policy/version keys.


---

<!-- 056_EXACT_RESPONSE_CACHE.md -->

# Exact Response Cache

## Problem / Intent

Cache deterministic requests by model/prompt/context version.

## Architecture View

```text
Cache key → response
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Exact Response Cache:** Cache deterministic requests by model/prompt/context version.


---

<!-- 057_PROMPT_CACHE_ARCHITECTURE.md -->

# Prompt Cache Architecture

## Problem / Intent

Exploit provider prefix/context caching for repeated long instructions.

## Architecture View

```text
Shared prefix → cached compute
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Prompt Cache Architecture:** Exploit provider prefix/context caching for repeated long instructions.


---

<!-- 058_PROMPT_REGISTRY.md -->

# Prompt Registry

## Problem / Intent

Version system prompts, templates, schemas and policies as deployable artifacts.

## Architecture View

```text
Prompt vN → release
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Prompt Registry:** Version system prompts, templates, schemas and policies as deployable artifacts.


---

<!-- 059_PROMPT_COMPOSITION.md -->

# Prompt Composition

## Problem / Intent

Assemble instructions from stable policy, task template and user/context blocks.

## Architecture View

```text
System + task + data + user
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Prompt Composition:** Assemble instructions from stable policy, task template and user/context blocks.


---

<!-- 060_CONTEXT_BUDGETING.md -->

# Context Budgeting

## Problem / Intent

Allocate token budget across instruction, history, retrieval, tools and output.

## Architecture View

```text
Context budget → sections
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Context Budgeting:** Allocate token budget across instruction, history, retrieval, tools and output.


---

<!-- 061_CONTEXT_SELECTION.md -->

# Context Selection

## Problem / Intent

Choose only task-relevant history/knowledge/tools.

## Architecture View

```text
Full state → selector → compact context
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Context Selection:** Choose only task-relevant history/knowledge/tools.


---

<!-- 062_CONVERSATION_SUMMARIZATION.md -->

# Conversation Summarization

## Problem / Intent

Compress older history into structured summaries.

## Architecture View

```text
History → summary + recent turns
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Conversation Summarization:** Compress older history into structured summaries.


---

<!-- 063_CONTEXT_COMPRESSION.md -->

# Context Compression

## Problem / Intent

Compress retrieved/tool content while preserving evidence.

## Architecture View

```text
Documents → compressor → context
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Context Compression:** Compress retrieved/tool content while preserving evidence.


---

<!-- 064_STRUCTURED_OUTPUT_CONTRACT.md -->

# Structured Output Contract

## Problem / Intent

Use schema validation between model and application.

## Architecture View

```text
Model → JSON schema → validator
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Structured Output Contract:** Use schema validation between model and application.


---

<!-- 065_PROMPT_VERSION_COMPATIBILITY.md -->

# Prompt Version Compatibility

## Problem / Intent

Tie evals and downstream parsers to prompt/schema versions.

## Architecture View

```text
Prompt v → contract v
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Prompt Version Compatibility:** Tie evals and downstream parsers to prompt/schema versions.


---

<!-- 066_INSTRUCTION_HIERARCHY.md -->

# Instruction Hierarchy

## Problem / Intent

Separate trusted application instructions from user and retrieved content.

## Architecture View

```text
Authority layers
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Instruction Hierarchy:** Separate trusted application instructions from user and retrieved content.


---

<!-- 067_CONTEXT_FRESHNESS.md -->

# Context Freshness

## Problem / Intent

Tag context with timestamps/source versions and enforce freshness rules.

## Architecture View

```text
Evidence version → context
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Context Freshness:** Tag context with timestamps/source versions and enforce freshness rules.


---

<!-- 068_ENTERPRISE_RAG_REFERENCE.md -->

# Enterprise RAG Reference

## Problem / Intent

Ingest authoritative content, index, permission-filter, retrieve, rerank, assemble and cite.

## Architecture View

```text
Sources → ingestion → index → retrieval → LLM
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Enterprise RAG Reference:** Ingest authoritative content, index, permission-filter, retrieve, rerank, assemble and cite.


---

<!-- 069_INGESTION_ARCHITECTURE.md -->

# Ingestion Architecture

## Problem / Intent

Use connectors/events/batches to normalize source content.

## Architecture View

```text
Sources → canonical document model
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Ingestion Architecture:** Use connectors/events/batches to normalize source content.


---

<!-- 070_PARSING_PIPELINE.md -->

# Parsing Pipeline

## Problem / Intent

Extract text, tables, layout, images and metadata with document-type-aware parsers.

## Architecture View

```text
File → structured content
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Parsing Pipeline:** Extract text, tables, layout, images and metadata with document-type-aware parsers.


---

<!-- 071_CHUNKING_SERVICE.md -->

# Chunking Service

## Problem / Intent

Centralize chunk policies by document type and retrieval task.

## Architecture View

```text
Document → chunks + metadata
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Chunking Service:** Centralize chunk policies by document type and retrieval task.


---

<!-- 072_EMBEDDING_SERVICE.md -->

# Embedding Service

## Problem / Intent

Version and serve embeddings independently of applications.

## Architecture View

```text
Content → embedding API
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Embedding Service:** Version and serve embeddings independently of applications.


---

<!-- 073_VECTOR_STORE.md -->

# Vector Store

## Problem / Intent

Store embeddings with metadata and tenancy/access attributes.

## Architecture View

```text
Vector + metadata → ANN index
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Vector Store:** Store embeddings with metadata and tenancy/access attributes.


---

<!-- 074_LEXICAL_SEARCH.md -->

# Lexical Search

## Problem / Intent

Retain keyword/BM25 index for exact terms, IDs and jargon.

## Architecture View

```text
Corpus → inverted index
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Lexical Search:** Retain keyword/BM25 index for exact terms, IDs and jargon.


---

<!-- 075_HYBRID_RETRIEVAL.md -->

# Hybrid Retrieval

## Problem / Intent

Fuse lexical and vector retrieval.

## Architecture View

```text
BM25 + ANN → rank fusion
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Hybrid Retrieval:** Fuse lexical and vector retrieval.


---

<!-- 076_RERANKING_LAYER.md -->

# Reranking Layer

## Problem / Intent

Apply stronger relevance model to candidate passages.

## Architecture View

```text
Top K → reranker → top N
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Reranking Layer:** Apply stronger relevance model to candidate passages.


---

<!-- 077_QUERY_REWRITE_LAYER.md -->

# Query Rewrite Layer

## Problem / Intent

Rewrite conversational questions into retrieval-ready searches.

## Architecture View

```text
Conversation → search query
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Query Rewrite Layer:** Rewrite conversational questions into retrieval-ready searches.


---

<!-- 078_MULTI_QUERY_RETRIEVAL.md -->

# Multi-Query Retrieval

## Problem / Intent

Generate several queries and fuse evidence.

## Architecture View

```text
Q → q1/q2/q3 → fusion
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Multi-Query Retrieval:** Generate several queries and fuse evidence.


---

<!-- 079_METADATA_FILTERING.md -->

# Metadata Filtering

## Problem / Intent

Apply tenant, ACL, date, type and business filters before returning evidence.

## Architecture View

```text
Identity/filter → retrieval
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Metadata Filtering:** Apply tenant, ACL, date, type and business filters before returning evidence.


---

<!-- 080_PERMISSION_AWARE_RETRIEVAL.md -->

# Permission-Aware Retrieval

## Problem / Intent

Ensure unauthorized evidence never enters model context.

## Architecture View

```text
User ACL → retrieval
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Permission-Aware Retrieval:** Ensure unauthorized evidence never enters model context.


---

<!-- 081_KNOWLEDGE_FRESHNESS_PIPELINE.md -->

# Knowledge Freshness Pipeline

## Problem / Intent

Detect source changes and incrementally reprocess/index.

## Architecture View

```text
Change event → reingest
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Knowledge Freshness Pipeline:** Detect source changes and incrementally reprocess/index.


---

<!-- 082_CITATION_ARCHITECTURE.md -->

# Citation Architecture

## Problem / Intent

Carry source IDs/page/offsets through retrieval to answer rendering.

## Architecture View

```text
Chunk metadata → citation
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Citation Architecture:** Carry source IDs/page/offsets through retrieval to answer rendering.


---

<!-- 083_RAG_EVALUATION_ARCHITECTURE.md -->

# RAG Evaluation Architecture

## Problem / Intent

Evaluate retrieval and generation separately.

## Architecture View

```text
Query set → retrieval metrics + answer metrics
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **RAG Evaluation Architecture:** Evaluate retrieval and generation separately.


---

<!-- 084_GRAPH_RAG_ARCHITECTURE.md -->

# Graph RAG Architecture

## Problem / Intent

Combine graph traversal/entities with semantic retrieval.

## Architecture View

```text
Query → graph + vector → context
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Graph RAG Architecture:** Combine graph traversal/entities with semantic retrieval.


---

<!-- 085_SQL_STRUCTURED_RAG.md -->

# SQL/Structured RAG

## Problem / Intent

Use generated/validated queries against governed structured stores.

## Architecture View

```text
Question → query planner → SQL → rows → LLM
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **SQL/Structured RAG:** Use generated/validated queries against governed structured stores.


---

<!-- 086_FEDERATED_RETRIEVAL.md -->

# Federated Retrieval

## Problem / Intent

Query multiple specialized stores then normalize/rerank.

## Architecture View

```text
Search routers → domain indexes → fusion
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Federated Retrieval:** Query multiple specialized stores then normalize/rerank.


---

<!-- 087_RAG_GATEWAY.md -->

# RAG Gateway

## Problem / Intent

Expose shared retrieval capabilities as a platform service.

## Architecture View

```text
Apps/agents → RAG API
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **RAG Gateway:** Expose shared retrieval capabilities as a platform service.


---

<!-- 088_AGENT_REFERENCE_ARCHITECTURE.md -->

# Agent Reference Architecture

## Problem / Intent

Combine model, tools, context/memory, policies, runtime, checkpoints and observability.

## Architecture View

```text
Goal → Agent Runtime → Model/Tools → outcome
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Reference Architecture:** Combine model, tools, context/memory, policies, runtime, checkpoints and observability.


---

<!-- 089_AGENT_RUNTIME.md -->

# Agent Runtime

## Problem / Intent

Own loop execution, tool calls, state and termination.

## Architecture View

```text
State → decide → act → observe
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Runtime:** Own loop execution, tool calls, state and termination.


---

<!-- 090_AGENT_VS_WORKFLOW_BOUNDARY.md -->

# Agent vs Workflow Boundary

## Problem / Intent

Keep deterministic business flow outside model when known; allow bounded agent decisions inside.

## Architecture View

```text
State machine with agent nodes
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent vs Workflow Boundary:** Keep deterministic business flow outside model when known; allow bounded agent decisions inside.


---

<!-- 091_TOOL_GATEWAY.md -->

# Tool Gateway

## Problem / Intent

Provide agents one governed discovery/execution boundary for tools.

## Architecture View

```text
Agent → Tool Gateway → APIs/MCP
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Tool Gateway:** Provide agents one governed discovery/execution boundary for tools.


---

<!-- 092_TOOL_REGISTRY.md -->

# Tool Registry

## Problem / Intent

Store tool schemas, ownership, auth and risk metadata.

## Architecture View

```text
Registry → tool search
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Tool Registry:** Store tool schemas, ownership, auth and risk metadata.


---

<!-- 093_DYNAMIC_TOOL_SEARCH.md -->

# Dynamic Tool Search

## Problem / Intent

Load only task-relevant tools into context.

## Architecture View

```text
Task → tool retrieval → selected tools
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Dynamic Tool Search:** Load only task-relevant tools into context.


---

<!-- 094_MCP_ARCHITECTURE.md -->

# MCP Architecture

## Problem / Intent

Use MCP-style servers as standardized tool/resource boundaries where appropriate.

## Architecture View

```text
Agent client ↔ MCP gateway/servers
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **MCP Architecture:** Use MCP-style servers as standardized tool/resource boundaries where appropriate.


---

<!-- 095_AGENT_MEMORY_SERVICE.md -->

# Agent Memory Service

## Problem / Intent

Separate short-term session memory from durable long-term memory.

## Architecture View

```text
Session context ↔ memory service
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Memory Service:** Separate short-term session memory from durable long-term memory.


---

<!-- 096_AGENT_CHECKPOINTING.md -->

# Agent Checkpointing

## Problem / Intent

Persist workflow/agent state after meaningful steps.

## Architecture View

```text
Step → checkpoint store
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Checkpointing:** Persist workflow/agent state after meaningful steps.


---

<!-- 097_DURABLE_AGENT_EXECUTION.md -->

# Durable Agent Execution

## Problem / Intent

Resume long-running agents across failures/restarts.

## Architecture View

```text
Runtime → durable state → resume
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Durable Agent Execution:** Resume long-running agents across failures/restarts.


---

<!-- 098_AGENT_IDEMPOTENCY.md -->

# Agent Idempotency

## Problem / Intent

Assign action IDs/idempotency keys to side-effecting tool operations.

## Architecture View

```text
Action ID → tool
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Idempotency:** Assign action IDs/idempotency keys to side-effecting tool operations.


---

<!-- 099_COMPENSATION_PATTERN.md -->

# Compensation Pattern

## Problem / Intent

Define compensating operations for partially completed agent workflows.

## Architecture View

```text
Action sequence → compensation
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Compensation Pattern:** Define compensating operations for partially completed agent workflows.


---

<!-- 100_AGENT_STOP_CONDITIONS.md -->

# Agent Stop Conditions

## Problem / Intent

Set success, failure, step, time and cost termination conditions.

## Architecture View

```text
Loop → bounded termination
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Stop Conditions:** Set success, failure, step, time and cost termination conditions.


---

<!-- 101_AGENT_BUDGET_CONTROLLER.md -->

# Agent Budget Controller

## Problem / Intent

Enforce token, tool, time and money limits.

## Architecture View

```text
Budget → runtime
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Budget Controller:** Enforce token, tool, time and money limits.


---

<!-- 102_AGENT_HANDOFF.md -->

# Agent Handoff

## Problem / Intent

Transfer state/goal to specialist agent through explicit contract.

## Architecture View

```text
Triage → specialist
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Handoff:** Transfer state/goal to specialist agent through explicit contract.


---

<!-- 103_SUPERVISOR_MULTI_AGENT.md -->

# Supervisor Multi-Agent

## Problem / Intent

Coordinator delegates independent specialized tasks and synthesizes.

## Architecture View

```text
Supervisor → workers → merge
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Supervisor Multi-Agent:** Coordinator delegates independent specialized tasks and synthesizes.


---

<!-- 104_PARALLEL_AGENT_FANOUT.md -->

# Parallel Agent Fanout

## Problem / Intent

Execute independent research/work subtasks concurrently.

## Architecture View

```text
Coordinator → parallel agents
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Parallel Agent Fanout:** Execute independent research/work subtasks concurrently.


---

<!-- 105_AGENT_TO_AGENT_CONTRACT.md -->

# Agent-to-Agent Contract

## Problem / Intent

Use structured task/result schema between agents.

## Architecture View

```text
Task schema ↔ result schema
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent-to-Agent Contract:** Use structured task/result schema between agents.


---

<!-- 106_HUMAN_IN_THE_LOOP_AGENT.md -->

# Human-in-the-Loop Agent

## Problem / Intent

Insert approval/review nodes before irreversible or low-confidence actions.

## Architecture View

```text
Agent → human → continue
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Human-in-the-Loop Agent:** Insert approval/review nodes before irreversible or low-confidence actions.


---

<!-- 107_AGENT_SANDBOX.md -->

# Agent Sandbox

## Problem / Intent

Isolate code/computer execution from control plane.

## Architecture View

```text
Agent runtime → sandbox
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Sandbox:** Isolate code/computer execution from control plane.


---

<!-- 108_AGENT_OBSERVABILITY.md -->

# Agent Observability

## Problem / Intent

Trace every model/tool/handoff/checkpoint/approval event.

## Architecture View

```text
Agent trace tree
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Observability:** Trace every model/tool/handoff/checkpoint/approval event.


---

<!-- 109_AGENT_EVALUATION_HARNESS.md -->

# Agent Evaluation Harness

## Problem / Intent

Replay scenario suites against full agent system.

## Architecture View

```text
Scenarios → agent → task/safety/cost scores
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Evaluation Harness:** Replay scenario suites against full agent system.


---

<!-- 110_AGENT_ROLLBACK_STRATEGY.md -->

# Agent Rollback Strategy

## Problem / Intent

Version instructions/tools/models and revert independently.

## Architecture View

```text
Agent release → component versions
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Rollback Strategy:** Version instructions/tools/models and revert independently.


---

<!-- 111_LONG_RUNNING_AGENT_SESSION.md -->

# Long-Running Agent Session

## Problem / Intent

Manage sessions that span minutes/hours/days with durable context.

## Architecture View

```text
Session → checkpoints/memory/events
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Long-Running Agent Session:** Manage sessions that span minutes/hours/days with durable context.


---

<!-- 112_MEMORY_TAXONOMY.md -->

# Memory Taxonomy

## Problem / Intent

Separate conversation state, working memory, episodic memory, semantic memory and enterprise knowledge.

## Architecture View

```text
Short-term vs long-term vs RAG
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Memory Taxonomy:** Separate conversation state, working memory, episodic memory, semantic memory and enterprise knowledge.


---

<!-- 113_SHORT_TERM_MEMORY.md -->

# Short-Term Memory

## Problem / Intent

Maintain task/session state required for current interaction.

## Architecture View

```text
Conversation store
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Short-Term Memory:** Maintain task/session state required for current interaction.


---

<!-- 114_LONG_TERM_USER_MEMORY.md -->

# Long-Term User Memory

## Problem / Intent

Persist approved stable facts/preferences with provenance.

## Architecture View

```text
Memory records → retrieval
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Long-Term User Memory:** Persist approved stable facts/preferences with provenance.


---

<!-- 115_EPISODIC_MEMORY.md -->

# Episodic Memory

## Problem / Intent

Store prior task episodes/outcomes for future retrieval.

## Architecture View

```text
Episode → summary/outcome
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Episodic Memory:** Store prior task episodes/outcomes for future retrieval.


---

<!-- 116_SEMANTIC_MEMORY.md -->

# Semantic Memory

## Problem / Intent

Persist normalized facts/concepts extracted from episodes.

## Architecture View

```text
Facts → memory store
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Semantic Memory:** Persist normalized facts/concepts extracted from episodes.


---

<!-- 117_MEMORY_EXTRACTION.md -->

# Memory Extraction

## Problem / Intent

Use deterministic/model-assisted pipeline to decide what deserves persistence.

## Architecture View

```text
Conversation → candidate → policy → memory
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Memory Extraction:** Use deterministic/model-assisted pipeline to decide what deserves persistence.


---

<!-- 118_MEMORY_RETRIEVAL.md -->

# Memory Retrieval

## Problem / Intent

Retrieve only memory relevant to current task/user.

## Architecture View

```text
Task → memory search
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Memory Retrieval:** Retrieve only memory relevant to current task/user.


---

<!-- 119_MEMORY_FORGETTING.md -->

# Memory Forgetting

## Problem / Intent

Expire/delete stale or user-requested memory.

## Architecture View

```text
TTL/delete policy
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Memory Forgetting:** Expire/delete stale or user-requested memory.


---

<!-- 120_MEMORY_PRIVACY.md -->

# Memory Privacy

## Problem / Intent

Apply purpose limitation, access, encryption and deletion controls.

## Architecture View

```text
PII memory → policy
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Memory Privacy:** Apply purpose limitation, access, encryption and deletion controls.


---

<!-- 121_MEMORY_POISONING_DEFENSE.md -->

# Memory Poisoning Defense

## Problem / Intent

Validate provenance and user scope before storing/reusing memory.

## Architecture View

```text
Candidate → trust check
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Memory Poisoning Defense:** Validate provenance and user scope before storing/reusing memory.


---

<!-- 122_MEMORY_VS_RAG.md -->

# Memory vs RAG

## Problem / Intent

Use memory for user/task continuity; RAG for authoritative knowledge.

## Architecture View

```text
Personal history vs knowledge base
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Memory vs RAG:** Use memory for user/task continuity; RAG for authoritative knowledge.


---

<!-- 123_AI_WORKFLOW_ENGINE.md -->

# AI Workflow Engine

## Problem / Intent

Use durable workflow/state-machine infrastructure around AI calls.

## Architecture View

```text
Workflow engine → LLM/tool activities
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Workflow Engine:** Use durable workflow/state-machine infrastructure around AI calls.


---

<!-- 124_DETERMINISTIC_OUTER_LOOP.md -->

# Deterministic Outer Loop

## Problem / Intent

Let code control lifecycle while models handle bounded reasoning.

## Architecture View

```text
State machine → LLM node
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Deterministic Outer Loop:** Let code control lifecycle while models handle bounded reasoning.


---

<!-- 125_SAGA_FOR_AI_ACTIONS.md -->

# Saga for AI Actions

## Problem / Intent

Use saga/compensation for multi-system business actions triggered by AI.

## Architecture View

```text
Local actions + compensation
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Saga for AI Actions:** Use saga/compensation for multi-system business actions triggered by AI.


---

<!-- 126_EVENT_DRIVEN_AI.md -->

# Event-Driven AI

## Problem / Intent

Trigger AI processing from events with idempotent consumers.

## Architecture View

```text
Event bus → AI worker
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Event-Driven AI:** Trigger AI processing from events with idempotent consumers.


---

<!-- 127_SCHEDULED_AI.md -->

# Scheduled AI

## Problem / Intent

Run reports/checks/enrichment on schedules.

## Architecture View

```text
Scheduler → AI job
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Scheduled AI:** Run reports/checks/enrichment on schedules.


---

<!-- 128_QUEUE_BASED_AI_WORKERS.md -->

# Queue-Based AI Workers

## Problem / Intent

Buffer bursty requests behind queues.

## Architecture View

```text
API → queue → AI workers
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Queue-Based AI Workers:** Buffer bursty requests behind queues.


---

<!-- 129_BACKPRESSURE.md -->

# Backpressure

## Problem / Intent

Limit incoming workload when models/tools cannot keep up.

## Architecture View

```text
Queue/concurrency limits
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Backpressure:** Limit incoming workload when models/tools cannot keep up.


---

<!-- 130_RETRY_ARCHITECTURE.md -->

# Retry Architecture

## Problem / Intent

Retry transient infrastructure/model failures with bounded backoff.

## Architecture View

```text
Failure → backoff → retry
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Retry Architecture:** Retry transient infrastructure/model failures with bounded backoff.


---

<!-- 131_CIRCUIT_BREAKER.md -->

# Circuit Breaker

## Problem / Intent

Stop repeated calls to failing provider/tool temporarily.

## Architecture View

```text
Closed/Open/Half-open
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Circuit Breaker:** Stop repeated calls to failing provider/tool temporarily.


---

<!-- 132_DEAD_LETTER_QUEUE.md -->

# Dead Letter Queue

## Problem / Intent

Capture AI jobs that exceed retry policy.

## Architecture View

```text
Job → DLQ
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Dead Letter Queue:** Capture AI jobs that exceed retry policy.


---

<!-- 133_PRIORITY_QUEUE.md -->

# Priority Queue

## Problem / Intent

Prioritize interactive/high-value work over batch work.

## Architecture View

```text
Priority → workers
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Priority Queue:** Prioritize interactive/high-value work over batch work.


---

<!-- 134_EVALUATION_PLATFORM.md -->

# Evaluation Platform

## Problem / Intent

Centralize datasets, runners, scorers, comparisons and release gates.

## Architecture View

```text
Eval set → candidates → metrics
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Evaluation Platform:** Centralize datasets, runners, scorers, comparisons and release gates.


---

<!-- 135_GOLDEN_DATASET.md -->

# Golden Dataset

## Problem / Intent

Version representative real tasks with expected criteria.

## Architecture View

```text
Dataset vN
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Golden Dataset:** Version representative real tasks with expected criteria.


---

<!-- 136_ONLINE_EVALUATION.md -->

# Online Evaluation

## Problem / Intent

Sample production traffic for quality scoring and failure mining.

## Architecture View

```text
Prod traces → eval
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Online Evaluation:** Sample production traffic for quality scoring and failure mining.


---

<!-- 137_OFFLINE_EVALUATION.md -->

# Offline Evaluation

## Problem / Intent

Run deterministic regression suites before release.

## Architecture View

```text
Candidate → eval suite
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Offline Evaluation:** Run deterministic regression suites before release.


---

<!-- 138_HUMAN_EVALUATION_QUEUE.md -->

# Human Evaluation Queue

## Problem / Intent

Route ambiguous/high-risk samples to reviewers.

## Architecture View

```text
Sample → reviewer rubric
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Human Evaluation Queue:** Route ambiguous/high-risk samples to reviewers.


---

<!-- 139_LLM_JUDGE_SERVICE.md -->

# LLM Judge Service

## Problem / Intent

Centralize calibrated model-based scoring behind versioned rubrics.

## Architecture View

```text
Output → judge → score
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **LLM Judge Service:** Centralize calibrated model-based scoring behind versioned rubrics.


---

<!-- 140_PAIRWISE_EVALUATION.md -->

# Pairwise Evaluation

## Problem / Intent

Compare candidate outputs to baseline.

## Architecture View

```text
A vs B
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Pairwise Evaluation:** Compare candidate outputs to baseline.


---

<!-- 141_RAG_QUALITY_DASHBOARD.md -->

# RAG Quality Dashboard

## Problem / Intent

Track recall, precision, reranking, faithfulness and citation accuracy.

## Architecture View

```text
RAG metrics
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **RAG Quality Dashboard:** Track recall, precision, reranking, faithfulness and citation accuracy.


---

<!-- 142_AGENT_SUCCESS_METRICS.md -->

# Agent Success Metrics

## Problem / Intent

Measure task success, tool correctness, step count, human escalation and cost.

## Architecture View

```text
Agent KPI set
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent Success Metrics:** Measure task success, tool correctness, step count, human escalation and cost.


---

<!-- 143_SAFETY_EVALUATION.md -->

# Safety Evaluation

## Problem / Intent

Run jailbreak, injection, privacy and unsafe-action suites.

## Architecture View

```text
Red-team cases
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Safety Evaluation:** Run jailbreak, injection, privacy and unsafe-action suites.


---

<!-- 144_RELEASE_QUALITY_GATE.md -->

# Release Quality Gate

## Problem / Intent

Block model/prompt/index/tool release if required eval thresholds fail.

## Architecture View

```text
CI/CD → eval gate
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Release Quality Gate:** Block model/prompt/index/tool release if required eval thresholds fail.


---

<!-- 145_CONTINUOUS_FAILURE_MINING.md -->

# Continuous Failure Mining

## Problem / Intent

Convert production failures into new eval cases.

## Architecture View

```text
Incident → golden set
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Continuous Failure Mining:** Convert production failures into new eval cases.


---

<!-- 146_GUARDRAIL_PIPELINE.md -->

# Guardrail Pipeline

## Problem / Intent

Place input, context, tool and output controls at appropriate stages.

## Architecture View

```text
Input → context → model → tool/output checks
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Guardrail Pipeline:** Place input, context, tool and output controls at appropriate stages.


---

<!-- 147_INPUT_CLASSIFIER.md -->

# Input Classifier

## Problem / Intent

Detect unsafe/sensitive requests before expensive processing.

## Architecture View

```text
Request → classifier
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Input Classifier:** Detect unsafe/sensitive requests before expensive processing.


---

<!-- 148_OUTPUT_VALIDATOR.md -->

# Output Validator

## Problem / Intent

Validate schema, safety, factuality/business constraints before delivery.

## Architecture View

```text
Output → validators
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Output Validator:** Validate schema, safety, factuality/business constraints before delivery.


---

<!-- 149_TOOL_GUARDRAIL.md -->

# Tool Guardrail

## Problem / Intent

Validate proposed action against business policy.

## Architecture View

```text
Tool call → policy
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Tool Guardrail:** Validate proposed action against business policy.


---

<!-- 150_GROUNDING_GUARDRAIL.md -->

# Grounding Guardrail

## Problem / Intent

Require evidence for factual enterprise answers.

## Architecture View

```text
Claims → evidence
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Grounding Guardrail:** Require evidence for factual enterprise answers.


---

<!-- 151_CONFIDENCE_ABSTENTION.md -->

# Confidence & Abstention

## Problem / Intent

Provide fallback/escalation when system lacks evidence/certainty.

## Architecture View

```text
Low confidence → abstain/human
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Confidence & Abstention:** Provide fallback/escalation when system lacks evidence/certainty.


---

<!-- 152_RESPONSIBLE_AI_REVIEW.md -->

# Responsible AI Review

## Problem / Intent

Review fairness, transparency, accountability, privacy and human impact.

## Architecture View

```text
Use case → risk review
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Responsible AI Review:** Review fairness, transparency, accountability, privacy and human impact.


---

<!-- 153_BIAS_MONITORING.md -->

# Bias Monitoring

## Problem / Intent

Measure disparate behavior across relevant cohorts where lawful/appropriate.

## Architecture View

```text
Outputs → fairness metrics
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Bias Monitoring:** Measure disparate behavior across relevant cohorts where lawful/appropriate.


---

<!-- 154_EXPLAINABILITY_LAYER.md -->

# Explainability Layer

## Problem / Intent

Provide evidence, factors or model explanations appropriate to model/use case.

## Architecture View

```text
Decision → explanation
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Explainability Layer:** Provide evidence, factors or model explanations appropriate to model/use case.


---

<!-- 155_MODEL_RISK_TIERING.md -->

# Model Risk Tiering

## Problem / Intent

Apply stronger controls to higher-impact use cases.

## Architecture View

```text
Risk tier → control set
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Risk Tiering:** Apply stronger controls to higher-impact use cases.


---

<!-- 156_AI_DISTRIBUTED_TRACING.md -->

# AI Distributed Tracing

## Problem / Intent

Trace request across gateway, retrieval, model, tools and agents.

## Architecture View

```text
Trace → nested spans
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Distributed Tracing:** Trace request across gateway, retrieval, model, tools and agents.


---

<!-- 157_PROMPT_TELEMETRY.md -->

# Prompt Telemetry

## Problem / Intent

Record prompt/template version and safe metadata, not secrets.

## Architecture View

```text
Prompt v → trace
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Prompt Telemetry:** Record prompt/template version and safe metadata, not secrets.


---

<!-- 158_MODEL_TELEMETRY.md -->

# Model Telemetry

## Problem / Intent

Capture model/version, tokens, latency, finish reason and errors.

## Architecture View

```text
Model span
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Telemetry:** Capture model/version, tokens, latency, finish reason and errors.


---

<!-- 159_RETRIEVAL_TELEMETRY.md -->

# Retrieval Telemetry

## Problem / Intent

Capture query, index version, filters, topK and relevance scores safely.

## Architecture View

```text
Retrieval span
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Retrieval Telemetry:** Capture query, index version, filters, topK and relevance scores safely.


---

<!-- 160_TOOL_TELEMETRY.md -->

# Tool Telemetry

## Problem / Intent

Capture tool/action/latency/result category and authorization outcome.

## Architecture View

```text
Tool span
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Tool Telemetry:** Capture tool/action/latency/result category and authorization outcome.


---

<!-- 161_COST_ATTRIBUTION.md -->

# Cost Attribution

## Problem / Intent

Allocate tokens/models/tools/storage costs by tenant/product/use case.

## Architecture View

```text
Trace → cost ledger
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Cost Attribution:** Allocate tokens/models/tools/storage costs by tenant/product/use case.


---

<!-- 162_LATENCY_BUDGET.md -->

# Latency Budget

## Problem / Intent

Set per-layer time budgets.

## Architecture View

```text
Gateway+RAG+Model+Tools ≤ SLO
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Latency Budget:** Set per-layer time budgets.


---

<!-- 163_SLO_ARCHITECTURE.md -->

# SLO Architecture

## Problem / Intent

Define availability, latency and task-quality SLOs.

## Architecture View

```text
SLI → SLO
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **SLO Architecture:** Define availability, latency and task-quality SLOs.


---

<!-- 164_AI_INCIDENT_RESPONSE.md -->

# AI Incident Response

## Problem / Intent

Use trace/version/audit evidence to diagnose quality/safety/provider incidents.

## Architecture View

```text
Alert → trace → rollback
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Incident Response:** Use trace/version/audit evidence to diagnose quality/safety/provider incidents.


---

<!-- 165_QUALITY_MONITORING.md -->

# Quality Monitoring

## Problem / Intent

Continuously watch production quality samples and business KPIs.

## Architecture View

```text
Prod → eval → dashboard
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Quality Monitoring:** Continuously watch production quality samples and business KPIs.


---

<!-- 166_CAPACITY_PLANNING.md -->

# Capacity Planning

## Problem / Intent

Plan provider quotas, GPU capacity, vector search and worker concurrency.

## Architecture View

```text
Demand → capacity
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Capacity Planning:** Plan provider quotas, GPU capacity, vector search and worker concurrency.


---

<!-- 167_OPERATIONAL_RUNBOOKS.md -->

# Operational Runbooks

## Problem / Intent

Document provider outage, bad model release, index corruption, prompt regression and unsafe tool response.

## Architecture View

```text
Incident type → runbook
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Operational Runbooks:** Document provider outage, bad model release, index corruption, prompt regression and unsafe tool response.


---

<!-- 168_AI_COST_MODEL.md -->

# AI Cost Model

## Problem / Intent

Model cost across tokens, embeddings, vector search, reranking, tools, GPUs and human review.

## Architecture View

```text
Total cost/request
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Cost Model:** Model cost across tokens, embeddings, vector search, reranking, tools, GPUs and human review.


---

<!-- 169_MODEL_RIGHT_SIZING.md -->

# Model Right-Sizing

## Problem / Intent

Use smallest model meeting quality requirement.

## Architecture View

```text
Eval → model tier
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Right-Sizing:** Use smallest model meeting quality requirement.


---

<!-- 170_TOKEN_OPTIMIZATION.md -->

# Token Optimization

## Problem / Intent

Reduce irrelevant history/context and verbose tool schemas.

## Architecture View

```text
Context selector
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Token Optimization:** Reduce irrelevant history/context and verbose tool schemas.


---

<!-- 171_PARALLELIZATION.md -->

# Parallelization

## Problem / Intent

Run independent retrieval/tool tasks concurrently.

## Architecture View

```text
Parallel branches
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Parallelization:** Run independent retrieval/tool tasks concurrently.


---

<!-- 172_SPECULATIVE_EXECUTION.md -->

# Speculative Execution

## Problem / Intent

Start likely useful work in parallel when economics justify.

## Architecture View

```text
Predict → parallel work
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Speculative Execution:** Start likely useful work in parallel when economics justify.


---

<!-- 173_CACHING_LAYERS.md -->

# Caching Layers

## Problem / Intent

Use prompt/exact/semantic/retrieval/tool caches appropriately.

## Architecture View

```text
Multi-layer cache
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Caching Layers:** Use prompt/exact/semantic/retrieval/tool caches appropriately.


---

<!-- 174_BATCHING.md -->

# Batching

## Problem / Intent

Batch embeddings/inference where latency permits.

## Architecture View

```text
Requests → batch
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Batching:** Batch embeddings/inference where latency permits.


---

<!-- 175_AUTOSCALING.md -->

# Autoscaling

## Problem / Intent

Scale workers/model serving by queue depth/concurrency/utilization.

## Architecture View

```text
Metrics → scale
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Autoscaling:** Scale workers/model serving by queue depth/concurrency/utilization.


---

<!-- 176_GPU_UTILIZATION.md -->

# GPU Utilization

## Problem / Intent

Use batching, KV-cache strategy and scheduler to improve expensive accelerator use.

## Architecture View

```text
GPU scheduler
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **GPU Utilization:** Use batching, KV-cache strategy and scheduler to improve expensive accelerator use.


---

<!-- 177_LATENCY_VS_QUALITY_TRADEOFF.md -->

# Latency vs Quality Tradeoff

## Problem / Intent

Choose retrieval depth, model tier and agent steps to fit SLO.

## Architecture View

```text
Quality ↔ latency
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Latency vs Quality Tradeoff:** Choose retrieval depth, model tier and agent steps to fit SLO.


---

<!-- 178_COST_BUDGET_ENFORCEMENT.md -->

# Cost Budget Enforcement

## Problem / Intent

Stop/escalate requests when monetary budget is exceeded.

## Architecture View

```text
Budget meter → stop/fallback
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Cost Budget Enforcement:** Stop/escalate requests when monetary budget is exceeded.


---

<!-- 179_CONVERSATION_STORE.md -->

# Conversation Store

## Problem / Intent

Persist messages/session metadata independently from provider.

## Architecture View

```text
Session DB
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Conversation Store:** Persist messages/session metadata independently from provider.


---

<!-- 180_OBJECT_STORE.md -->

# Object Store

## Problem / Intent

Store documents, generated artifacts and large tool outputs.

## Architecture View

```text
Object storage
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Object Store:** Store documents, generated artifacts and large tool outputs.


---

<!-- 181_VECTOR_STORE_ARCHITECTURE.md -->

# Vector Store Architecture

## Problem / Intent

Choose managed/self-hosted vector/search store based on scale, filters, consistency and operations.

## Architecture View

```text
ANN store
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Vector Store Architecture:** Choose managed/self-hosted vector/search store based on scale, filters, consistency and operations.


---

<!-- 182_METADATA_STORE.md -->

# Metadata Store

## Problem / Intent

Keep source, ACL, version, lineage and chunk metadata.

## Architecture View

```text
Relational/document metadata DB
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Metadata Store:** Keep source, ACL, version, lineage and chunk metadata.


---

<!-- 183_CHECKPOINT_STORE.md -->

# Checkpoint Store

## Problem / Intent

Persist long-running agent/workflow state.

## Architecture View

```text
Checkpoint DB
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Checkpoint Store:** Persist long-running agent/workflow state.


---

<!-- 184_FEATURE_STORE.md -->

# Feature Store

## Problem / Intent

Use when traditional ML needs consistent offline/online features.

## Architecture View

```text
Feature platform
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Feature Store:** Use when traditional ML needs consistent offline/online features.


---

<!-- 185_MODEL_REGISTRY.md -->

# Model Registry

## Problem / Intent

Track model artifacts/versions/approvals.

## Architecture View

```text
Registry
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Registry:** Track model artifacts/versions/approvals.


---

<!-- 186_ARTIFACT_REGISTRY.md -->

# Artifact Registry

## Problem / Intent

Store prompt/tool/agent configurations and packaged code.

## Architecture View

```text
Artifacts
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Artifact Registry:** Store prompt/tool/agent configurations and packaged code.


---

<!-- 187_DATA_RESIDENCY.md -->

# Data Residency

## Problem / Intent

Place model/data/index/log storage according to regional requirements.

## Architecture View

```text
Region policy
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Data Residency:** Place model/data/index/log storage according to regional requirements.


---

<!-- 188_RETENTION_POLICY.md -->

# Retention Policy

## Problem / Intent

Define retention/deletion for prompts, conversations, memory, traces and artifacts.

## Architecture View

```text
Data class → TTL
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Retention Policy:** Define retention/deletion for prompts, conversations, memory, traces and artifacts.


---

<!-- 189_AI_PLATFORM_TEAM.md -->

# AI Platform Team

## Problem / Intent

Provide model gateway, RAG, agent runtime, evals, security and observability paved roads.

## Architecture View

```text
Platform → product teams
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Platform Team:** Provide model gateway, RAG, agent runtime, evals, security and observability paved roads.


---

<!-- 190_PAVED_ROAD.md -->

# Paved Road

## Problem / Intent

Offer secure defaults/templates so teams avoid rebuilding core AI infrastructure.

## Architecture View

```text
Template/SDK/service
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Paved Road:** Offer secure defaults/templates so teams avoid rebuilding core AI infrastructure.


---

<!-- 191_INFRASTRUCTURE_AS_CODE.md -->

# Infrastructure as Code

## Problem / Intent

Provision AI/data/network/security resources reproducibly.

## Architecture View

```text
IaC → environments
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Infrastructure as Code:** Provision AI/data/network/security resources reproducibly.


---

<!-- 192_ENVIRONMENT_STRATEGY.md -->

# Environment Strategy

## Problem / Intent

Separate dev/test/UAT/prod data, indexes, prompts, agents and credentials.

## Architecture View

```text
Environment isolation
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Environment Strategy:** Separate dev/test/UAT/prod data, indexes, prompts, agents and credentials.


---

<!-- 193_PROMPT_CI_CD.md -->

# Prompt CI CD

## Problem / Intent

Treat prompts/schemas as versioned deployables with eval gates.

## Architecture View

```text
Commit → eval → deploy
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Prompt CI CD:** Treat prompts/schemas as versioned deployables with eval gates.


---

<!-- 194_RAG_CI_CD.md -->

# RAG CI CD

## Problem / Intent

Version ingestion/chunk/embed/index and test retrieval before promotion.

## Architecture View

```text
Index pipeline
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **RAG CI CD:** Version ingestion/chunk/embed/index and test retrieval before promotion.


---

<!-- 195_AGENT_CI_CD.md -->

# Agent CI CD

## Problem / Intent

Version model, instructions, tool registry and policy independently.

## Architecture View

```text
Agent release manifest
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent CI CD:** Version model, instructions, tool registry and policy independently.


---

<!-- 196_CANARY_AI_RELEASE.md -->

# Canary AI Release

## Problem / Intent

Send small traffic to new model/prompt/agent.

## Architecture View

```text
Canary cohort
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Canary AI Release:** Send small traffic to new model/prompt/agent.


---

<!-- 197_SHADOW_AI_RELEASE.md -->

# Shadow AI Release

## Problem / Intent

Evaluate candidate on live traffic without affecting response/action.

## Architecture View

```text
Shadow path
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Shadow AI Release:** Evaluate candidate on live traffic without affecting response/action.


---

<!-- 198_BLUE_GREEN_AI.md -->

# Blue Green AI

## Problem / Intent

Switch between complete AI stack versions.

## Architecture View

```text
Blue ↔ Green
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Blue Green AI:** Switch between complete AI stack versions.


---

<!-- 199_ROLLBACK.md -->

# Rollback

## Problem / Intent

Keep last known-good model/prompt/index/tool configurations.

## Architecture View

```text
Release → rollback manifest
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Rollback:** Keep last known-good model/prompt/index/tool configurations.


---

<!-- 200_MULTI_REGION_ARCHITECTURE.md -->

# Multi-Region Architecture

## Problem / Intent

Replicate/route AI services by availability, residency and latency.

## Architecture View

```text
Global router → regions
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Multi-Region Architecture:** Replicate/route AI services by availability, residency and latency.


---

<!-- 201_MULTI_PROVIDER_ARCHITECTURE.md -->

# Multi-Provider Architecture

## Problem / Intent

Use capability gateway and tested fallback across providers.

## Architecture View

```text
Gateway → Provider A/B
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Multi-Provider Architecture:** Use capability gateway and tested fallback across providers.


---

<!-- 202_DISASTER_RECOVERY.md -->

# Disaster Recovery

## Problem / Intent

Define RTO/RPO for indexes, memories, configs and model serving dependencies.

## Architecture View

```text
Backup/replication → recovery
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Disaster Recovery:** Define RTO/RPO for indexes, memories, configs and model serving dependencies.


---

<!-- 203_AWS_AI_ARCHITECTURE.md -->

# AWS AI Architecture

## Problem / Intent

Map vendor-neutral layers to Bedrock, AgentCore, Knowledge Bases, Guardrails and AWS data/security services.

## Architecture View

```text
AWS adapter
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AWS AI Architecture:** Map vendor-neutral layers to Bedrock, AgentCore, Knowledge Bases, Guardrails and AWS data/security services.


---

<!-- 204_AWS_AGENTCORE_RUNTIME.md -->

# AWS AgentCore Runtime

## Problem / Intent

Use managed secure agent runtime for new AWS agent workloads when appropriate.

## Architecture View

```text
Agent → AgentCore Runtime
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AWS AgentCore Runtime:** Use managed secure agent runtime for new AWS agent workloads when appropriate.


---

<!-- 205_AWS_AGENTCORE_GATEWAY.md -->

# AWS AgentCore Gateway

## Problem / Intent

Expose governed tools/models/agents through AgentCore Gateway.

## Architecture View

```text
Agent → Gateway → MCP/HTTP/inference
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AWS AgentCore Gateway:** Expose governed tools/models/agents through AgentCore Gateway.


---

<!-- 206_AWS_AGENTCORE_MEMORY.md -->

# AWS AgentCore Memory

## Problem / Intent

Separate short-term and long-term agent memory.

## Architecture View

```text
Agent ↔ AgentCore Memory
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AWS AgentCore Memory:** Separate short-term and long-term agent memory.


---

<!-- 207_AZURE_FOUNDRY_ARCHITECTURE.md -->

# Azure Foundry Architecture

## Problem / Intent

Use Foundry resource/project hierarchy with models, tools, search, storage, identity and observability.

## Architecture View

```text
Foundry → projects → AI resources
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Azure Foundry Architecture:** Use Foundry resource/project hierarchy with models, tools, search, storage, identity and observability.


---

<!-- 208_MICROSOFT_FOUNDRY_AGENT_SERVICE.md -->

# Microsoft Foundry Agent Service

## Problem / Intent

Use managed runtime/toolboxes/models/observability/identity for agents.

## Architecture View

```text
Agent Service
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Microsoft Foundry Agent Service:** Use managed runtime/toolboxes/models/observability/identity for agents.


---

<!-- 209_AZURE_KNOWLEDGE_ARCHITECTURE.md -->

# Azure Knowledge Architecture

## Problem / Intent

Use Azure AI Search/Foundry knowledge capabilities behind permission-aware retrieval.

## Architecture View

```text
Foundry/Search knowledge layer
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Azure Knowledge Architecture:** Use Azure AI Search/Foundry knowledge capabilities behind permission-aware retrieval.


---

<!-- 210_GOOGLE_VERTEX_AI_ARCHITECTURE.md -->

# Google Vertex AI Architecture

## Problem / Intent

Map models, retrieval, agents, data, evals and MLOps to Vertex AI/GCP services.

## Architecture View

```text
Vertex adapter
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Google Vertex AI Architecture:** Map models, retrieval, agents, data, evals and MLOps to Vertex AI/GCP services.


---

<!-- 211_OPENAI_ARCHITECTURE.md -->

# OpenAI Architecture

## Problem / Intent

Use Responses/Agents capabilities behind your own identity, policy, data and orchestration layers.

## Architecture View

```text
App platform → OpenAI
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **OpenAI Architecture:** Use Responses/Agents capabilities behind your own identity, policy, data and orchestration layers.


---

<!-- 212_OPEN_SOURCE_AI_ARCHITECTURE.md -->

# Open Source AI Architecture

## Problem / Intent

Use self-hosted inference, open embeddings, vector stores and agent frameworks behind common platform contracts.

## Architecture View

```text
Open stack
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Open Source AI Architecture:** Use self-hosted inference, open embeddings, vector stores and agent frameworks behind common platform contracts.


---

<!-- 213_HYBRID_CLOUD_AI.md -->

# Hybrid Cloud AI

## Problem / Intent

Keep sensitive data/on-prem tools private while consuming managed models through controlled gateways.

## Architecture View

```text
Private data ↔ managed models
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Hybrid Cloud AI:** Keep sensitive data/on-prem tools private while consuming managed models through controlled gateways.


---

<!-- 214_AI_SERVICE_CATALOG.md -->

# AI Service Catalog

## Problem / Intent

Publish approved models, embeddings, tools, indexes and agent templates.

## Architecture View

```text
Catalog
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Service Catalog:** Publish approved models, embeddings, tools, indexes and agent templates.


---

<!-- 215_AI_INVENTORY.md -->

# AI Inventory

## Problem / Intent

Track all AI use cases, owners, data classes, models and risk tiers.

## Architecture View

```text
Inventory
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Inventory:** Track all AI use cases, owners, data classes, models and risk tiers.


---

<!-- 216_ARCHITECTURE_REVIEW_BOARD.md -->

# Architecture Review Board

## Problem / Intent

Review high-risk or cross-platform AI decisions.

## Architecture View

```text
Design → review
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Architecture Review Board:** Review high-risk or cross-platform AI decisions.


---

<!-- 217_MODEL_APPROVAL_WORKFLOW.md -->

# Model Approval Workflow

## Problem / Intent

Require eval/security/legal approval before production use.

## Architecture View

```text
Candidate → approval
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Model Approval Workflow:** Require eval/security/legal approval before production use.


---

<!-- 218_TOOL_APPROVAL_WORKFLOW.md -->

# Tool Approval Workflow

## Problem / Intent

Register tool risk, scopes and owners before agent use.

## Architecture View

```text
Tool → registry approval
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Tool Approval Workflow:** Register tool risk, scopes and owners before agent use.


---

<!-- 219_DATA_GOVERNANCE.md -->

# Data Governance

## Problem / Intent

Apply source ownership, quality, ACL, lineage, residency and deletion.

## Architecture View

```text
Data lifecycle
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Data Governance:** Apply source ownership, quality, ACL, lineage, residency and deletion.


---

<!-- 220_CHANGE_GOVERNANCE.md -->

# Change Governance

## Problem / Intent

Treat provider/model/prompt/index/tool changes as controlled releases.

## Architecture View

```text
Change → eval → approve
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Change Governance:** Treat provider/model/prompt/index/tool changes as controlled releases.


---

<!-- 220_HIGH_VALUE_COMPARISONS.md -->

# AI Architecture — High-Value Comparisons

## RAG vs Fine-Tuning
| RAG | Fine-Tuning |
|---|---|
| external/current knowledge | learned behavior |
| index update | training |
| citations possible | no evidence by default |
| permission filters possible | knowledge embedded in weights |

## Agent vs Workflow
| Agent | Workflow |
|---|---|
| model chooses next step | code chooses next step |
| flexible | predictable |
| harder to test | easier to govern |
| dynamic tasks | repeatable business process |

## Model Gateway vs Direct Provider
| Gateway | Direct |
|---|---|
| centralized policy/routing | simpler |
| multi-provider | vendor coupling |
| observability/quotas | app-specific controls |

## Memory vs RAG
| Memory | RAG |
|---|---|
| user/task continuity | authoritative knowledge |
| personal/episodic | enterprise corpus |
| selective persistence | document retrieval |

## Long Context vs RAG
| Long Context | RAG |
|---|---|
| simple bounded corpus | large/fresh corpus |
| no retrieval stack | permission/filter/ranking |
| potentially expensive | selective context |


---

<!-- 221_ANTI_PATTERNS.md -->

# AI Architecture Anti-Patterns

1. Client directly calls model provider with secret key.
2. One giant system prompt contains policy, data, memory and business rules.
3. Authorization delegated to the model.
4. Retrieve unauthorized content and ask model not to reveal it.
5. One vector database/index for unrelated domains without governance.
6. Every business process converted into an autonomous agent.
7. Agent given administrator credentials.
8. Unbounded agent loops.
9. Tool side effects without idempotency.
10. Prompt edits deployed without evaluation.
11. Model aliases changed without version traceability.
12. No separation between memory and authoritative knowledge.
13. Full conversation history sent forever.
14. Logging raw sensitive prompts/tool results.
15. Multi-agent architecture without measurable need.
16. Provider abstraction reduced to lowest-common-denominator too early.
17. RAG used to compensate for bad source data.
18. No rollback for prompt/index/tool changes.
19. Evaluation based only on demo examples.
20. Token cost optimized without business-quality metrics.


---

<!-- 221_VENDOR_RISK.md -->

# Vendor Risk

## Problem / Intent

Assess provider retention, training use, availability, lock-in and compliance.

## Architecture View

```text
Vendor scorecard
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Vendor Risk:** Assess provider retention, training use, availability, lock-in and compliance.


---

<!-- 222_EXIT_STRATEGY.md -->

# Exit Strategy

## Problem / Intent

Preserve capability contracts/data portability to change providers.

## Architecture View

```text
Provider abstraction + exportable data
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Exit Strategy:** Preserve capability contracts/data portability to change providers.


---

<!-- 222_INTERVIEW_TRAPS.md -->

# AI Architecture Interview Traps

1. LLM is not the architecture.
2. RAG is not a vector database.
3. Vector database is not automatically source of truth.
4. Fine-tuning is not a substitute for frequently changing knowledge.
5. Long context does not eliminate permission-aware retrieval.
6. Agent is not the same as workflow.
7. Multi-agent is not automatically better than single-agent.
8. Tool schema is not authorization.
9. Prompt is not policy enforcement.
10. Human approval must bind to the exact action.
11. Memory and RAG solve different problems.
12. More context can make answers worse.
13. Provider fallback must be behaviorally evaluated.
14. Retry on side-effecting tools requires idempotency.
15. Model gateway adds value only when shared concerns justify it.
16. RAG quality must be split into retrieval and generation metrics.
17. Citations can be wrong even when present.
18. Observability must include model, retrieval and tool layers.
19. Agent production readiness requires stop/time/cost limits.
20. AI security must assume external retrieved content is untrusted.


---

<!-- 223_FINOPS_FOR_AI.md -->

# FinOps for AI

## Problem / Intent

Budget, attribute and optimize AI spend by business value.

## Architecture View

```text
Cost → owner/KPI
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **FinOps for AI:** Budget, attribute and optimize AI spend by business value.


---

<!-- 223_SYSTEM_DESIGN_CHECKLIST.md -->

# AI Architecture System Design Checklist

## Requirements
- business outcome
- users/tenants
- modalities
- quality metric
- latency/throughput
- availability
- cost
- privacy/residency
- human approval

## Architecture
- BFF/gateway
- identity/policy
- orchestration
- model gateway
- RAG
- tools
- agents/workflows
- memory
- storage

## Reliability
- timeout
- retry
- circuit breaker
- queue
- fallback
- checkpoint
- idempotency
- compensation

## Security
- least privilege
- ACL-before-retrieval
- prompt injection
- DLP
- secrets
- egress
- sandbox
- audit

## Operations
- evals
- traces
- SLOs
- cost
- canary/shadow
- rollback
- incident runbooks


---

<!-- 224_DESIGN_ENTERPRISE_RAG.md -->

# Design Enterprise RAG

## Problem / Intent

Reference answer for a secure scalable permission-aware RAG system.

## Architecture View

```text
User → BFF → RAG → model → cited answer
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Design Enterprise RAG:** Reference answer for a secure scalable permission-aware RAG system.


---

<!-- 224_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

This pack uses a vendor-neutral architecture core and current 2026 cloud/platform adapters.

## Current Platform Signals

### Microsoft Foundry
Microsoft's current Foundry architecture separates governance/resources/projects from models, knowledge/search, storage, security and observability. Foundry Agent Service exposes managed agent runtime, toolboxes, models, observability, identity/security and publishing.

### AWS AgentCore
AWS describes AgentCore as modular services for secure agent runtime, tools/gateway, memory and production operations. AgentCore Gateway provides a governed access point to MCP, HTTP and inference targets. AgentCore Memory separates immediate conversational context from durable memory.

## Accuracy Rule

Before implementation verify current:
- provider API/SDK status,
- GA vs preview/beta,
- model versions/context limits,
- regional availability,
- pricing/quotas,
- data retention and training policies,
- cloud security/network features.


---

<!-- 225_DESIGN_AI_CHAT_PLATFORM.md -->

# Design AI Chat Platform

## Problem / Intent

Reference architecture for multi-tenant chat with model routing and memory.

## Architecture View

```text
Clients → gateway → sessions → model platform
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Design AI Chat Platform:** Reference architecture for multi-tenant chat with model routing and memory.


---

<!-- 226_DESIGN_CODING_AGENT.md -->

# Design Coding Agent

## Problem / Intent

Sandboxed agent with repo tools, checkpoints, approvals and tracing.

## Architecture View

```text
Agent → repo/sandbox/tools
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Design Coding Agent:** Sandboxed agent with repo tools, checkpoints, approvals and tracing.


---

<!-- 227_DESIGN_CUSTOMER_SUPPORT_AGENT.md -->

# Design Customer Support Agent

## Problem / Intent

RAG + CRM tools + approvals + escalation.

## Architecture View

```text
Customer → agent → KB/CRM/human
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Design Customer Support Agent:** RAG + CRM tools + approvals + escalation.


---

<!-- 228_DESIGN_DOCUMENT_INTELLIGENCE.md -->

# Design Document Intelligence

## Problem / Intent

Ingest/OCR/layout → extraction/model → validation → workflow.

## Architecture View

```text
Docs → AI pipeline
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Design Document Intelligence:** Ingest/OCR/layout → extraction/model → validation → workflow.


---

<!-- 229_DESIGN_VOICE_AGENT.md -->

# Design Voice Agent

## Problem / Intent

Realtime media → speech/model → tools → handoff.

## Architecture View

```text
Voice stream architecture
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Design Voice Agent:** Realtime media → speech/model → tools → handoff.


---

<!-- 230_DESIGN_MULTI_AGENT_RESEARCH.md -->

# Design Multi-Agent Research

## Problem / Intent

Supervisor + parallel researchers + evidence store + synthesis.

## Architecture View

```text
Supervisor → researchers
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Design Multi-Agent Research:** Supervisor + parallel researchers + evidence store + synthesis.


---

<!-- 231_DESIGN_AI_PLATFORM.md -->

# Design AI Platform

## Problem / Intent

Shared enterprise services for models, RAG, agents, evals, governance.

## Architecture View

```text
Platform layers
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Design AI Platform:** Shared enterprise services for models, RAG, agents, evals, governance.


---

<!-- 232_RAG_VS_LONG_CONTEXT.md -->

# RAG vs Long Context

## Problem / Intent

Choose retrieval when relevance/security/freshness matter; long context for bounded coherent corpus.

## Architecture View

```text
Retrieve vs stuff context
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **RAG vs Long Context:** Choose retrieval when relevance/security/freshness matter; long context for bounded coherent corpus.


---

<!-- 233_AGENT_VS_MICROSERVICE.md -->

# Agent vs Microservice

## Problem / Intent

Agent reasons dynamically; microservice provides deterministic contract.

## Architecture View

```text
Probabilistic orchestrator vs deterministic service
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Agent vs Microservice:** Agent reasons dynamically; microservice provides deterministic contract.


---

<!-- 234_ARCHITECTURE_ANTI_PATTERNS.md -->

# Architecture Anti-Patterns

## Problem / Intent

Identify direct-to-model clients, giant prompts, global vector DB, over-agentification and missing policy.

## Architecture View

```text
Anti-pattern checklist
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **Architecture Anti-Patterns:** Identify direct-to-model clients, giant prompts, global vector DB, over-agentification and missing policy.


---

<!-- 235_AI_ARCHITECTURE_INTERVIEW_TRAPS.md -->

# AI Architecture Interview Traps

## Problem / Intent

Recall high-value misconceptions.

## Architecture View

```text
Final recall
```

## Design Guidance

- Keep ownership and trust boundaries explicit.
- Define the source of truth for state and data.
- Treat model output as untrusted until validated.
- Make retry, timeout, failure, and fallback behavior explicit.
- Version models, prompts, retrieval indexes, tools, and policies independently.
- Attach trace, cost, security, and evaluation signals to the boundary.

## When to Use

Use this pattern when the architectural driver described above is present and measurable.

## Avoid / Trade-Off

Do not introduce the layer only because it is fashionable. Each distributed AI layer adds latency, operational cost, compatibility work, and another failure mode.

## Security Review

```text
Identity?
Authorization?
Sensitive data?
Prompt injection?
Tool permissions?
Audit?
Tenant isolation?
```

## Production Review

```text
Quality SLO
Latency SLO
Availability
Cost/request
Fallback
Observability
Rollback
```

## Interview Recall

> **AI Architecture Interview Traps:** Recall high-value misconceptions.
