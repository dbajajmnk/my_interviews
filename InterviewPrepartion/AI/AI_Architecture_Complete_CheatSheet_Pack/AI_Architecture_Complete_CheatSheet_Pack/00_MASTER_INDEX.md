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
