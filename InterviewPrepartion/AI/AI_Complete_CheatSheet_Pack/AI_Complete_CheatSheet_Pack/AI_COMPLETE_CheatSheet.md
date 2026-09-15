# AI — Complete Cheat Sheet (Combined Edition)

> Fast revision companion for AI, ML, Deep Learning, GenAI, RAG, Agents, MLOps, Security and AI Architecture.


---

<!-- 005_AI_MENTAL_MODEL.md -->

# AI Mental Model

## What / Why

Artificial Intelligence builds systems that perform tasks requiring perception, reasoning, learning, generation, decision-making, or action.

## Mental Model

```text
Data + Model + Objective + Feedback → Intelligent behavior
```

## When to Use

Use this as the broad umbrella for ML, DL, GenAI and agents.

## Common Mistake / Interview Trap

AI is broader than Machine Learning.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI Mental Model:** Artificial Intelligence builds systems that perform tasks requiring perception, reasoning, learning, generation, decision-making, or action.


---

<!-- 006_AI_VS_ML_VS_DL_VS_GENAI.md -->

# AI vs ML vs DL vs GenAI

## What / Why

AI is the umbrella; ML learns patterns; DL uses multi-layer neural networks; GenAI produces new content.

## Mental Model

```text
AI → ML → DL; GenAI overlaps DL/Foundation Models
```

## When to Use

Use to explain scope clearly.

## Common Mistake / Interview Trap

Do not use AI, ML, DL and GenAI as synonyms.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI vs ML vs DL vs GenAI:** AI is the umbrella; ML learns patterns; DL uses multi-layer neural networks; GenAI produces new content.


---

<!-- 007_NARROW_AI_VS_AGI.md -->

# Narrow AI vs AGI

## What / Why

Narrow AI is optimized for bounded tasks; AGI is a hypothetical broader general capability.

## Mental Model

```text
Task-specific ↔ general capability
```

## When to Use

Use precise terminology.

## Common Mistake / Interview Trap

Current deployed systems should not be casually labeled AGI.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Narrow AI vs AGI:** Narrow AI is optimized for bounded tasks; AGI is a hypothetical broader general capability.


---

<!-- 008_SUPERVISED_LEARNING.md -->

# Supervised Learning

## What / Why

Learn mapping from labeled inputs to outputs.

## Mental Model

```text
(X,y) → train → predictor
```

## When to Use

Use classification/regression with labels.

## Common Mistake / Interview Trap

Labels can encode bias/noise.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Supervised Learning:** Learn mapping from labeled inputs to outputs.


---

<!-- 009_UNSUPERVISED_LEARNING.md -->

# Unsupervised Learning

## What / Why

Discover structure without explicit labels.

## Mental Model

```text
X → clusters/embeddings/anomalies
```

## When to Use

Use clustering, dimensionality reduction, representation learning.

## Common Mistake / Interview Trap

Unsupervised does not mean objective-free.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Unsupervised Learning:** Discover structure without explicit labels.


---

<!-- 00_MASTER_INDEX.md -->

# AI — Complete Cheat Sheet Pack

**Scope:** AI foundations → ML → Deep Learning → NLP/CV → LLMs → GenAI → Embeddings → RAG → Fine-Tuning → Agents → Evaluation/Safety → MLOps/LLMOps → Security → Cloud AI → Architecture → Business → Interviews.

**Design principle:** vendor-neutral core first; cloud/provider adapters second.

## Fast Revision

- `01_30_SECOND_RECALL.md`
- `02_AI_LANDSCAPE_2026.md`
- `03_AI_DECISION_TREE.md`
- `04_AI_SYSTEM_REFERENCE_ARCHITECTURE.md`

## AI Foundations

- AI Mental Model — `005_AI_MENTAL_MODEL.md`
- AI vs ML vs DL vs GenAI — `006_AI_VS_ML_VS_DL_VS_GENAI.md`
- Narrow AI vs AGI — `007_NARROW_AI_VS_AGI.md`
- Supervised Learning — `008_SUPERVISED_LEARNING.md`
- Unsupervised Learning — `009_UNSUPERVISED_LEARNING.md`
- Self-Supervised Learning — `010_SELF_SUPERVISED_LEARNING.md`
- Reinforcement Learning — `011_REINFORCEMENT_LEARNING.md`
- Training vs Inference — `012_TRAINING_VS_INFERENCE.md`
- Parameters vs Hyperparameters — `013_PARAMETERS_VS_HYPERPARAMETERS.md`
- Bias Variance — `014_BIAS_VARIANCE.md`
- Overfitting — `015_OVERFITTING.md`
- Underfitting — `016_UNDERFITTING.md`
- Train Validation Test Split — `017_TRAIN_VALIDATION_TEST_SPLIT.md`
- Cross Validation — `018_CROSS_VALIDATION.md`
- Data Leakage — `019_DATA_LEAKAGE.md`

## Math & Statistics

- Vectors and Matrices — `020_VECTORS_AND_MATRICES.md`
- Dot Product — `021_DOT_PRODUCT.md`
- Matrix Multiplication — `022_MATRIX_MULTIPLICATION.md`
- Mean Variance Standard Deviation — `023_MEAN_VARIANCE_STANDARD_DEVIATION.md`
- Probability — `024_PROBABILITY.md`
- Bayes Theorem — `025_BAYES_THEOREM.md`
- Distributions — `026_DISTRIBUTIONS.md`
- Expectation — `027_EXPECTATION.md`
- Covariance Correlation — `028_COVARIANCE_CORRELATION.md`
- Entropy — `029_ENTROPY.md`
- Cross Entropy — `030_CROSS_ENTROPY.md`
- KL Divergence — `031_KL_DIVERGENCE.md`
- Gradient — `032_GRADIENT.md`
- Chain Rule — `033_CHAIN_RULE.md`
- Gradient Descent — `034_GRADIENT_DESCENT.md`
- Normalization vs Standardization — `035_NORMALIZATION_VS_STANDARDIZATION.md`

## Classical ML

- Linear Regression — `036_LINEAR_REGRESSION.md`
- Logistic Regression — `037_LOGISTIC_REGRESSION.md`
- Decision Tree — `038_DECISION_TREE.md`
- Random Forest — `039_RANDOM_FOREST.md`
- Gradient Boosting — `040_GRADIENT_BOOSTING.md`
- K Nearest Neighbors — `041_K_NEAREST_NEIGHBORS.md`
- Naive Bayes — `042_NAIVE_BAYES.md`
- SVM — `043_SVM.md`
- K Means — `044_K_MEANS.md`
- Hierarchical Clustering — `045_HIERARCHICAL_CLUSTERING.md`
- DBSCAN — `046_DBSCAN.md`
- PCA — `047_PCA.md`
- Feature Engineering — `048_FEATURE_ENGINEERING.md`
- Categorical Encoding — `049_CATEGORICAL_ENCODING.md`
- Imbalanced Classification — `050_IMBALANCED_CLASSIFICATION.md`
- Hyperparameter Tuning — `051_HYPERPARAMETER_TUNING.md`
- Ensemble Learning — `052_ENSEMBLE_LEARNING.md`

## Evaluation & Metrics

- Confusion Matrix — `053_CONFUSION_MATRIX.md`
- Accuracy — `054_ACCURACY.md`
- Precision — `055_PRECISION.md`
- Recall — `056_RECALL.md`
- F1 Score — `057_F1_SCORE.md`
- ROC AUC — `058_ROC_AUC.md`
- PR AUC — `059_PR_AUC.md`
- MAE — `060_MAE.md`
- MSE RMSE — `061_MSE_RMSE.md`
- R Squared — `062_R_SQUARED.md`
- Calibration — `063_CALIBRATION.md`
- Threshold Selection — `064_THRESHOLD_SELECTION.md`
- Offline vs Online Evaluation — `065_OFFLINE_VS_ONLINE_EVALUATION.md`
- A B Testing — `066_A_B_TESTING.md`
- Error Analysis — `067_ERROR_ANALYSIS.md`

## Deep Learning

- Neural Network — `068_NEURAL_NETWORK.md`
- Dense Layer — `069_DENSE_LAYER.md`
- Activation Functions — `070_ACTIVATION_FUNCTIONS.md`
- Backpropagation — `071_BACKPROPAGATION.md`
- Optimizer SGD — `072_OPTIMIZER_SGD.md`
- Adam AdamW — `073_ADAM_ADAMW.md`
- Learning Rate — `074_LEARNING_RATE.md`
- Batch Size — `075_BATCH_SIZE.md`
- Epoch Step — `076_EPOCH_STEP.md`
- Loss Function — `077_LOSS_FUNCTION.md`
- Regularization — `078_REGULARIZATION.md`
- Dropout — `079_DROPOUT.md`
- Batch Normalization — `080_BATCH_NORMALIZATION.md`
- Layer Normalization — `081_LAYER_NORMALIZATION.md`
- Residual Connection — `082_RESIDUAL_CONNECTION.md`
- Initialization — `083_INITIALIZATION.md`
- Vanishing Exploding Gradients — `084_VANISHING_EXPLODING_GRADIENTS.md`
- Gradient Clipping — `085_GRADIENT_CLIPPING.md`
- Early Stopping — `086_EARLY_STOPPING.md`

## Computer Vision

- CNN — `087_CNN.md`
- Convolution — `088_CONVOLUTION.md`
- Pooling — `089_POOLING.md`
- Image Classification — `090_IMAGE_CLASSIFICATION.md`
- Object Detection — `091_OBJECT_DETECTION.md`
- Image Segmentation — `092_IMAGE_SEGMENTATION.md`
- Vision Transformer — `093_VISION_TRANSFORMER.md`
- Image Augmentation — `094_IMAGE_AUGMENTATION.md`
- Transfer Learning Vision — `095_TRANSFER_LEARNING_VISION.md`
- Multimodal Vision Language — `096_MULTIMODAL_VISION_LANGUAGE.md`

## NLP & Language

- Tokenization — `097_TOKENIZATION.md`
- Bag of Words — `098_BAG_OF_WORDS.md`
- TF IDF — `099_TF_IDF.md`
- Word Embeddings — `100_WORD_EMBEDDINGS.md`
- Sequence Models — `101_SEQUENCE_MODELS.md`
- Attention — `102_ATTENTION.md`
- Self Attention — `103_SELF_ATTENTION.md`
- Transformer — `104_TRANSFORMER.md`
- Encoder Decoder — `105_ENCODER_DECODER.md`
- Decoder Only Model — `106_DECODER_ONLY_MODEL.md`
- Masked Language Modeling — `107_MASKED_LANGUAGE_MODELING.md`

## Transformers & LLM Internals

- LLM Mental Model — `108_LLM_MENTAL_MODEL.md`
- Embeddings Layer — `109_EMBEDDINGS_LAYER.md`
- Positional Encoding — `110_POSITIONAL_ENCODING.md`
- Q K V — `111_Q_K_V.md`
- Multi Head Attention — `112_MULTI_HEAD_ATTENTION.md`
- Feed Forward Network — `113_FEED_FORWARD_NETWORK.md`
- Causal Mask — `114_CAUSAL_MASK.md`
- Context Window — `115_CONTEXT_WINDOW.md`
- KV Cache — `116_KV_CACHE.md`
- Logits — `117_LOGITS.md`
- Temperature — `118_TEMPERATURE.md`
- Top P — `119_TOP_P.md`
- Greedy Decoding — `120_GREEDY_DECODING.md`
- Beam Search — `121_BEAM_SEARCH.md`
- Hallucination — `122_HALLUCINATION.md`
- Scaling Laws — `123_SCALING_LAWS.md`
- Mixture of Experts — `124_MIXTURE_OF_EXPERTS.md`
- Quantization — `125_QUANTIZATION.md`
- Distillation — `126_DISTILLATION.md`
- Speculative Decoding — `127_SPECULATIVE_DECODING.md`

## Foundation Models & GenAI

- Foundation Model — `128_FOUNDATION_MODEL.md`
- Generative AI — `129_GENERATIVE_AI.md`
- Prompt — `130_PROMPT.md`
- System Instruction — `131_SYSTEM_INSTRUCTION.md`
- Few Shot Prompting — `132_FEW_SHOT_PROMPTING.md`
- Chain of Thought Concept — `133_CHAIN_OF_THOUGHT_CONCEPT.md`
- Structured Output — `134_STRUCTURED_OUTPUT.md`
- Tool Calling — `135_TOOL_CALLING.md`
- Function Calling — `136_FUNCTION_CALLING.md`
- Multimodal Model — `137_MULTIMODAL_MODEL.md`
- Grounding — `138_GROUNDING.md`
- Prompt Caching — `139_PROMPT_CACHING.md`
- Context Engineering — `140_CONTEXT_ENGINEERING.md`
- Model Routing — `141_MODEL_ROUTING.md`
- Fallback Model — `142_FALLBACK_MODEL.md`
- Small Language Model — `143_SMALL_LANGUAGE_MODEL.md`

## Embeddings & Vector Search

- Embedding — `144_EMBEDDING.md`
- Cosine Similarity — `145_COSINE_SIMILARITY.md`
- Euclidean Distance — `146_EUCLIDEAN_DISTANCE.md`
- Vector Database — `147_VECTOR_DATABASE.md`
- ANN Search — `148_ANN_SEARCH.md`
- HNSW — `149_HNSW.md`
- IVF — `150_IVF.md`
- Metadata Filtering — `151_METADATA_FILTERING.md`
- Hybrid Search — `152_HYBRID_SEARCH.md`
- Reranking — `153_RERANKING.md`
- Chunking — `154_CHUNKING.md`
- Chunk Overlap — `155_CHUNK_OVERLAP.md`
- Semantic Chunking — `156_SEMANTIC_CHUNKING.md`
- Embedding Dimension — `157_EMBEDDING_DIMENSION.md`
- Vector Normalization — `158_VECTOR_NORMALIZATION.md`
- Recall at K — `159_RECALL_AT_K.md`

## RAG

- RAG Mental Model — `160_RAG_MENTAL_MODEL.md`
- RAG Pipeline — `161_RAG_PIPELINE.md`
- Ingestion — `162_INGESTION.md`
- Document Parsing — `163_DOCUMENT_PARSING.md`
- Chunking Strategy — `164_CHUNKING_STRATEGY.md`
- Embedding Model Selection — `165_EMBEDDING_MODEL_SELECTION.md`
- Query Rewriting — `166_QUERY_REWRITING.md`
- Multi Query Retrieval — `167_MULTI_QUERY_RETRIEVAL.md`
- HyDE — `168_HYDE.md`
- Hybrid Retrieval — `169_HYBRID_RETRIEVAL.md`
- Reranker — `170_RERANKER.md`
- Context Assembly — `171_CONTEXT_ASSEMBLY.md`
- Grounded Generation — `172_GROUNDED_GENERATION.md`
- Citations — `173_CITATIONS.md`
- RAG Evaluation — `174_RAG_EVALUATION.md`
- Faithfulness — `175_FAITHFULNESS.md`
- Answer Relevance — `176_ANSWER_RELEVANCE.md`
- Retrieval Precision — `177_RETRIEVAL_PRECISION.md`
- Knowledge Freshness — `178_KNOWLEDGE_FRESHNESS.md`
- Access Controlled RAG — `179_ACCESS_CONTROLLED_RAG.md`
- Graph RAG — `180_GRAPH_RAG.md`
- Agentic RAG — `181_AGENTIC_RAG.md`
- RAG vs Fine Tuning — `182_RAG_VS_FINE_TUNING.md`

## Prompt Engineering

- Prompt Anatomy — `183_PROMPT_ANATOMY.md`
- Role Prompting — `184_ROLE_PROMPTING.md`
- Delimiters — `185_DELIMITERS.md`
- Few Shot Examples — `186_FEW_SHOT_EXAMPLES.md`
- Negative Constraints — `187_NEGATIVE_CONSTRAINTS.md`
- Output Schema — `188_OUTPUT_SCHEMA.md`
- Decomposition — `189_DECOMPOSITION.md`
- Self Check — `190_SELF_CHECK.md`
- Prompt Injection — `191_PROMPT_INJECTION.md`
- System Prompt Leakage — `192_SYSTEM_PROMPT_LEAKAGE.md`
- Jailbreak Resistance — `193_JAILBREAK_RESISTANCE.md`
- Prompt Versioning — `194_PROMPT_VERSIONING.md`
- Prompt Evaluation — `195_PROMPT_EVALUATION.md`

## Fine Tuning & Adaptation

- Fine Tuning — `196_FINE_TUNING.md`
- Supervised Fine Tuning — `197_SUPERVISED_FINE_TUNING.md`
- Instruction Tuning — `198_INSTRUCTION_TUNING.md`
- LoRA — `199_LORA.md`
- QLoRA — `200_QLORA.md`
- PEFT — `201_PEFT.md`
- DPO — `202_DPO.md`
- RLHF — `203_RLHF.md`
- Synthetic Data — `204_SYNTHETIC_DATA.md`
- Data Curation — `205_DATA_CURATION.md`
- Fine Tune Evaluation — `206_FINE_TUNE_EVALUATION.md`
- Catastrophic Forgetting — `207_CATASTROPHIC_FORGETTING.md`
- Model Merge Adapters — `208_MODEL_MERGE_ADAPTERS.md`

## Agents & Agentic AI

- Agent Mental Model — `209_AGENT_MENTAL_MODEL.md`
- Agent vs Workflow — `210_AGENT_VS_WORKFLOW.md`
- Tool Use — `211_TOOL_USE.md`
- Agent Loop — `212_AGENT_LOOP.md`
- Planning — `213_PLANNING.md`
- Reflection — `214_REFLECTION.md`
- Memory — `215_MEMORY.md`
- Short Term Memory — `216_SHORT_TERM_MEMORY.md`
- Long Term Memory — `217_LONG_TERM_MEMORY.md`
- Tool Registry — `218_TOOL_REGISTRY.md`
- Tool Search — `219_TOOL_SEARCH.md`
- MCP Concept — `220_MCP_CONCEPT.md`
- Agent Handoff — `221_AGENT_HANDOFF.md`
- Multi Agent — `222_MULTI_AGENT.md`
- Supervisor Pattern — `223_SUPERVISOR_PATTERN.md`
- Swarm Pattern — `224_SWARM_PATTERN.md`
- Sandbox — `225_SANDBOX.md`
- Computer Use — `226_COMPUTER_USE.md`
- Human in the Loop — `227_HUMAN_IN_THE_LOOP.md`
- Approval Gates — `228_APPROVAL_GATES.md`
- Agent Termination — `229_AGENT_TERMINATION.md`
- Agent Observability — `230_AGENT_OBSERVABILITY.md`
- Agent Evaluation — `231_AGENT_EVALUATION.md`
- Agent Reliability — `232_AGENT_RELIABILITY.md`
- Agent Security — `233_AGENT_SECURITY.md`
- Long Running Agent — `234_LONG_RUNNING_AGENT.md`

## Agent Patterns

- ReAct Pattern — `235_REACT_PATTERN.md`
- Plan Execute Pattern — `236_PLAN_EXECUTE_PATTERN.md`
- Planner Executor — `237_PLANNER_EXECUTOR.md`
- Router Agent — `238_ROUTER_AGENT.md`
- Parallel Fan Out — `239_PARALLEL_FAN_OUT.md`
- Map Reduce Agent — `240_MAP_REDUCE_AGENT.md`
- Critic Reviewer — `241_CRITIC_REVIEWER.md`
- Debate Pattern — `242_DEBATE_PATTERN.md`
- Toolformer Pattern Concept — `243_TOOLFORMER_PATTERN_CONCEPT.md`
- Deterministic Outer Loop — `244_DETERMINISTIC_OUTER_LOOP.md`
- Durable Agent Workflow — `245_DURABLE_AGENT_WORKFLOW.md`
- Event Driven Agent — `246_EVENT_DRIVEN_AGENT.md`
- Scheduled Agent — `247_SCHEDULED_AGENT.md`
- Multi Tenant Agent — `248_MULTI_TENANT_AGENT.md`

## Evaluation, Safety & Guardrails

- LLM Evaluation — `249_LLM_EVALUATION.md`
- Golden Dataset — `250_GOLDEN_DATASET.md`
- Human Evaluation — `251_HUMAN_EVALUATION.md`
- LLM as Judge — `252_LLM_AS_JUDGE.md`
- Pairwise Evaluation — `253_PAIRWISE_EVALUATION.md`
- Task Success Metric — `254_TASK_SUCCESS_METRIC.md`
- Faithfulness Evaluation — `255_FAITHFULNESS_EVALUATION.md`
- Groundedness — `256_GROUNDEDNESS.md`
- Toxicity Safety Eval — `257_TOXICITY_SAFETY_EVAL.md`
- Prompt Injection Eval — `258_PROMPT_INJECTION_EVAL.md`
- Red Teaming — `259_RED_TEAMING.md`
- Guardrails — `260_GUARDRAILS.md`
- Input Guardrail — `261_INPUT_GUARDRAIL.md`
- Output Guardrail — `262_OUTPUT_GUARDRAIL.md`
- Tool Guardrail — `263_TOOL_GUARDRAIL.md`
- PII Detection — `264_PII_DETECTION.md`
- Data Loss Prevention — `265_DATA_LOSS_PREVENTION.md`
- Policy as Code — `266_POLICY_AS_CODE.md`
- Model Risk Management — `267_MODEL_RISK_MANAGEMENT.md`
- Responsible AI — `268_RESPONSIBLE_AI.md`

## MLOps & LLMOps

- MLOps Mental Model — `269_MLOPS_MENTAL_MODEL.md`
- Experiment Tracking — `270_EXPERIMENT_TRACKING.md`
- Data Versioning — `271_DATA_VERSIONING.md`
- Model Registry — `272_MODEL_REGISTRY.md`
- Feature Store — `273_FEATURE_STORE.md`
- Training Pipeline — `274_TRAINING_PIPELINE.md`
- Model Serving — `275_MODEL_SERVING.md`
- Batch Inference — `276_BATCH_INFERENCE.md`
- Online Inference — `277_ONLINE_INFERENCE.md`
- Canary Model — `278_CANARY_MODEL.md`
- Shadow Deployment — `279_SHADOW_DEPLOYMENT.md`
- A B Model Deployment — `280_A_B_MODEL_DEPLOYMENT.md`
- Model Monitoring — `281_MODEL_MONITORING.md`
- Data Drift — `282_DATA_DRIFT.md`
- Concept Drift — `283_CONCEPT_DRIFT.md`
- Model Drift — `284_MODEL_DRIFT.md`
- LLMOps — `285_LLMOPS.md`
- Prompt Registry — `286_PROMPT_REGISTRY.md`
- Evaluation Pipeline — `287_EVALUATION_PIPELINE.md`
- Token Cost Monitoring — `288_TOKEN_COST_MONITORING.md`
- Latency Budget — `289_LATENCY_BUDGET.md`
- Caching Strategy — `290_CACHING_STRATEGY.md`
- Observability — `291_OBSERVABILITY.md`

## AI Security

- AI Threat Model — `292_AI_THREAT_MODEL.md`
- Prompt Injection Security — `293_PROMPT_INJECTION_SECURITY.md`
- Indirect Prompt Injection — `294_INDIRECT_PROMPT_INJECTION.md`
- Data Exfiltration — `295_DATA_EXFILTRATION.md`
- Tool Abuse — `296_TOOL_ABUSE.md`
- Model Supply Chain — `297_MODEL_SUPPLY_CHAIN.md`
- Training Data Poisoning — `298_TRAINING_DATA_POISONING.md`
- RAG Poisoning — `299_RAG_POISONING.md`
- Model Extraction — `300_MODEL_EXTRACTION.md`
- Membership Inference — `301_MEMBERSHIP_INFERENCE.md`
- Adversarial Examples — `302_ADVERSARIAL_EXAMPLES.md`
- Sandboxing — `303_SANDBOXING.md`
- Least Privilege — `304_LEAST_PRIVILEGE.md`
- Credential Isolation — `305_CREDENTIAL_ISOLATION.md`
- Egress Control — `306_EGRESS_CONTROL.md`
- Audit Trail — `307_AUDIT_TRAIL.md`

## AI Architecture Patterns

- AI Application Layering — `308_AI_APPLICATION_LAYERING.md`
- Model Gateway — `309_MODEL_GATEWAY.md`
- Model Router — `310_MODEL_ROUTER.md`
- RAG Service — `311_RAG_SERVICE.md`
- Agent Orchestrator — `312_AGENT_ORCHESTRATOR.md`
- Human Approval Service — `313_HUMAN_APPROVAL_SERVICE.md`
- AI BFF — `314_AI_BFF.md`
- Streaming Response — `315_STREAMING_RESPONSE.md`
- Async Job Pattern — `316_ASYNC_JOB_PATTERN.md`
- Event Driven AI — `317_EVENT_DRIVEN_AI.md`
- Batch AI Pipeline — `318_BATCH_AI_PIPELINE.md`
- Semantic Cache — `319_SEMANTIC_CACHE.md`
- Response Cache — `320_RESPONSE_CACHE.md`
- Embedding Service — `321_EMBEDDING_SERVICE.md`
- Evaluation Gateway — `322_EVALUATION_GATEWAY.md`
- Multi Region AI — `323_MULTI_REGION_AI.md`
- Provider Abstraction — `324_PROVIDER_ABSTRACTION.md`
- BYOM Model Endpoint — `325_BYOM_MODEL_ENDPOINT.md`

## Cloud AI Platforms

- Azure AI Foundry Concept — `326_AZURE_AI_FOUNDRY_CONCEPT.md`
- Azure OpenAI Concept — `327_AZURE_OPENAI_CONCEPT.md`
- AWS Bedrock Concept — `328_AWS_BEDROCK_CONCEPT.md`
- AWS Bedrock Knowledge Bases — `329_AWS_BEDROCK_KNOWLEDGE_BASES.md`
- AWS Bedrock Guardrails — `330_AWS_BEDROCK_GUARDRAILS.md`
- AWS AgentCore — `331_AWS_AGENTCORE.md`
- Google Vertex AI Concept — `332_GOOGLE_VERTEX_AI_CONCEPT.md`
- Gemini API Concept — `333_GEMINI_API_CONCEPT.md`
- OpenAI Responses API — `334_OPENAI_RESPONSES_API.md`
- OpenAI Agents SDK — `335_OPENAI_AGENTS_SDK.md`
- OpenAI Agents API — `336_OPENAI_AGENTS_API.md`
- Anthropic API Concept — `337_ANTHROPIC_API_CONCEPT.md`
- Hugging Face Ecosystem — `338_HUGGING_FACE_ECOSYSTEM.md`

## AI Product & Business

- AI Use Case Selection — `339_AI_USE_CASE_SELECTION.md`
- Automation vs Augmentation — `340_AUTOMATION_VS_AUGMENTATION.md`
- Business KPI — `341_BUSINESS_KPI.md`
- AI ROI — `342_AI_ROI.md`
- Build vs Buy — `343_BUILD_VS_BUY.md`
- Model Selection Matrix — `344_MODEL_SELECTION_MATRIX.md`
- Human Workflow Design — `345_HUMAN_WORKFLOW_DESIGN.md`
- Adoption Metrics — `346_ADOPTION_METRICS.md`
- Change Management — `347_CHANGE_MANAGEMENT.md`
- AI Governance — `348_AI_GOVERNANCE.md`

## Interview & Troubleshooting

- AI vs ML Interview — `349_AI_VS_ML_INTERVIEW.md`
- RAG vs Fine Tune Interview — `350_RAG_VS_FINE_TUNE_INTERVIEW.md`
- Agent vs Workflow Interview — `351_AGENT_VS_WORKFLOW_INTERVIEW.md`
- Embedding vs LLM — `352_EMBEDDING_VS_LLM.md`
- Prompt vs Context — `353_PROMPT_VS_CONTEXT.md`
- Hallucination Troubleshooting — `354_HALLUCINATION_TROUBLESHOOTING.md`
- RAG No Answer — `355_RAG_NO_ANSWER.md`
- RAG Wrong Citation — `356_RAG_WRONG_CITATION.md`
- Agent Looping — `357_AGENT_LOOPING.md`
- Agent Wrong Tool — `358_AGENT_WRONG_TOOL.md`
- Agent Unsafe Action — `359_AGENT_UNSAFE_ACTION.md`
- High LLM Cost — `360_HIGH_LLM_COST.md`
- High Latency — `361_HIGH_LATENCY.md`
- Context Overflow — `362_CONTEXT_OVERFLOW.md`
- Evaluation Drift — `363_EVALUATION_DRIFT.md`
- Data Drift Troubleshooting — `364_DATA_DRIFT_TROUBLESHOOTING.md`
- Model Regression — `365_MODEL_REGRESSION.md`
- GPU OOM — `366_GPU_OOM.md`
- Training Divergence — `367_TRAINING_DIVERGENCE.md`
- Interview Traps — `368_INTERVIEW_TRAPS.md`


---

<!-- 010_SELF_SUPERVISED_LEARNING.md -->

# Self-Supervised Learning

## What / Why

Create learning signal from the data itself.

## Mental Model

```text
masked/next-token prediction
```

## When to Use

Use for foundation-model pretraining.

## Common Mistake / Interview Trap

Different from unsupervised only in how objectives are constructed.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Self-Supervised Learning:** Create learning signal from the data itself.


---

<!-- 011_REINFORCEMENT_LEARNING.md -->

# Reinforcement Learning

## What / Why

Agent learns actions from reward signals and environment feedback.

## Mental Model

```text
state → action → reward → policy update
```

## When to Use

Use sequential decision problems.

## Common Mistake / Interview Trap

Reward design can create unintended behavior.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Reinforcement Learning:** Agent learns actions from reward signals and environment feedback.


---

<!-- 012_TRAINING_VS_INFERENCE.md -->

# Training vs Inference

## What / Why

Training updates model parameters; inference uses learned parameters to produce predictions/outputs.

## Mental Model

```text
Train → frozen/served model → infer
```

## When to Use

Use to explain cost/latency differences.

## Common Mistake / Interview Trap

Fine-tuning is training, prompting is inference.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Training vs Inference:** Training updates model parameters; inference uses learned parameters to produce predictions/outputs.


---

<!-- 013_PARAMETERS_VS_HYPERPARAMETERS.md -->

# Parameters vs Hyperparameters

## What / Why

Parameters are learned; hyperparameters control learning/model setup.

## Mental Model

```text
weights vs learning rate/batch size
```

## When to Use

Use in ML interviews.

## Common Mistake / Interview Trap

Do not confuse model weights with tuning settings.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Parameters vs Hyperparameters:** Parameters are learned; hyperparameters control learning/model setup.


---

<!-- 014_BIAS_VARIANCE.md -->

# Bias Variance

## What / Why

Bias reflects underfitting; variance reflects sensitivity/overfitting.

## Mental Model

```text
underfit ↔ good fit ↔ overfit
```

## When to Use

Use to reason about generalization.

## Common Mistake / Interview Trap

More complex model is not always better.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Bias Variance:** Bias reflects underfitting; variance reflects sensitivity/overfitting.


---

<!-- 015_OVERFITTING.md -->

# Overfitting

## What / Why

Model memorizes training patterns and generalizes poorly.

## Mental Model

```text
train high / validation low
```

## When to Use

Use regularization, more data, simpler model, validation.

## Common Mistake / Interview Trap

Training accuracy alone is meaningless.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Overfitting:** Model memorizes training patterns and generalizes poorly.


---

<!-- 016_UNDERFITTING.md -->

# Underfitting

## What / Why

Model cannot capture important patterns.

## Mental Model

```text
train low / validation low
```

## When to Use

Use better features/model/capacity/training.

## Common Mistake / Interview Trap

More data alone may not fix high bias.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Underfitting:** Model cannot capture important patterns.


---

<!-- 017_TRAIN_VALIDATION_TEST_SPLIT.md -->

# Train Validation Test Split

## What / Why

Separate fitting, tuning and unbiased final evaluation.

## Mental Model

```text
train / validation / test
```

## When to Use

Use every supervised workflow.

## Common Mistake / Interview Trap

Do not repeatedly tune on the test set.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Train Validation Test Split:** Separate fitting, tuning and unbiased final evaluation.


---

<!-- 018_CROSS_VALIDATION.md -->

# Cross Validation

## What / Why

Rotate validation folds to estimate generalization robustly.

## Mental Model

```text
K folds → repeated train/validate
```

## When to Use

Use with limited tabular data.

## Common Mistake / Interview Trap

Expensive for large deep models.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Cross Validation:** Rotate validation folds to estimate generalization robustly.


---

<!-- 019_DATA_LEAKAGE.md -->

# Data Leakage

## What / Why

Information from future/test/target leaks into training features.

## Mental Model

```text
future/target → feature pipeline
```

## When to Use

Use leakage checks in every pipeline.

## Common Mistake / Interview Trap

Leakage can make a useless model look excellent.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Data Leakage:** Information from future/test/target leaks into training features.


---

<!-- 01_30_SECOND_RECALL.md -->

# AI — 30-Second Recall

## AI Stack

```text
Business Problem
     ↓
Data / Knowledge / Tools
     ↓
Model
 ├── Classical ML
 ├── Deep Learning
 └── Foundation Model / LLM
     ↓
Application Pattern
 ├── Prediction
 ├── Generation
 ├── RAG
 └── Agent / Workflow
     ↓
Evaluation + Guardrails
     ↓
Deployment + Observability
     ↓
Business Outcome
```

## Fast Distinctions

```text
AI > ML > DL
GenAI → creates content
LLM → language foundation model
Embedding → vector representation
RAG → retrieve knowledge + generate
Fine-tuning → change model behavior/weights
Agent → model + tools + loop + state + policy
Workflow → deterministic control flow
```

## Production Rule

```text
Quality
+ Safety
+ Security
+ Latency
+ Cost
+ Observability
+ Governance
= Production AI
```


---

<!-- 020_VECTORS_AND_MATRICES.md -->

# Vectors and Matrices

## What / Why

Vectors represent features/embeddings; matrices represent datasets/linear transforms.

## Mental Model

```text
x ∈ R^n, W ∈ R^(m×n)
```

## When to Use

Use throughout ML/DL.

## Common Mistake / Interview Trap

Dimensions must align.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Vectors and Matrices:** Vectors represent features/embeddings; matrices represent datasets/linear transforms.


---

<!-- 021_DOT_PRODUCT.md -->

# Dot Product

## What / Why

Measures weighted alignment/similarity.

## Mental Model

```text
a·b = Σ ai bi
```

## When to Use

Use linear models and cosine similarity.

## Common Mistake / Interview Trap

Magnitude affects raw dot product.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Dot Product:** Measures weighted alignment/similarity.


---

<!-- 022_MATRIX_MULTIPLICATION.md -->

# Matrix Multiplication

## What / Why

Composes linear transformations.

## Mental Model

```text
Y = XW
```

## When to Use

Use neural layers and batch operations.

## Common Mistake / Interview Trap

Order matters.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Matrix Multiplication:** Composes linear transformations.


---

<!-- 023_MEAN_VARIANCE_STANDARD_DEVIATION.md -->

# Mean Variance Standard Deviation

## What / Why

Basic measures of center and spread.

## Mental Model

```text
μ, σ², σ
```

## When to Use

Use normalization and data analysis.

## Common Mistake / Interview Trap

Outliers can distort mean/std.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Mean Variance Standard Deviation:** Basic measures of center and spread.


---

<!-- 024_PROBABILITY.md -->

# Probability

## What / Why

Quantifies uncertainty over outcomes.

## Mental Model

```text
P(A), P(A|B)
```

## When to Use

Use prediction/calibration/Bayes.

## Common Mistake / Interview Trap

Probability estimates should be calibrated when decisions depend on confidence.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Probability:** Quantifies uncertainty over outcomes.


---

<!-- 025_BAYES_THEOREM.md -->

# Bayes Theorem

## What / Why

Updates beliefs with evidence.

## Mental Model

```text
P(A|B)=P(B|A)P(A)/P(B)
```

## When to Use

Use Bayesian reasoning/classifiers.

## Common Mistake / Interview Trap

Base rates matter.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Bayes Theorem:** Updates beliefs with evidence.


---

<!-- 026_DISTRIBUTIONS.md -->

# Distributions

## What / Why

Model uncertainty and data-generating patterns.

## Mental Model

```text
Normal/Bernoulli/Categorical/etc.
```

## When to Use

Use to choose likelihood/loss assumptions.

## Common Mistake / Interview Trap

Real data may violate textbook assumptions.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Distributions:** Model uncertainty and data-generating patterns.


---

<!-- 027_EXPECTATION.md -->

# Expectation

## What / Why

Probability-weighted average outcome.

## Mental Model

```text
E[X]
```

## When to Use

Use losses/reward/statistics.

## Common Mistake / Interview Trap

Expected value can hide tail risk.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Expectation:** Probability-weighted average outcome.


---

<!-- 028_COVARIANCE_CORRELATION.md -->

# Covariance Correlation

## What / Why

Measures joint variation and normalized association.

## Mental Model

```text
cov(X,Y), corr(X,Y)
```

## When to Use

Use feature analysis.

## Common Mistake / Interview Trap

Correlation is not causation.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Covariance Correlation:** Measures joint variation and normalized association.


---

<!-- 029_ENTROPY.md -->

# Entropy

## What / Why

Measures uncertainty/information content.

## Mental Model

```text
H(p)=-Σp log p
```

## When to Use

Use decision trees, classification, information theory.

## Common Mistake / Interview Trap

Lower entropy means more certainty.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Entropy:** Measures uncertainty/information content.


---

<!-- 02_AI_LANDSCAPE_2026.md -->

# AI Landscape — 2026

## Core Architecture Direction

Production AI is increasingly organized around:

```text
Foundation Models
+ Retrieval / Knowledge
+ Tools
+ Agent Harnesses
+ Sandboxes
+ Memory / Context Management
+ Evals
+ Guardrails
+ Observability
```

## Current Platform Direction

### OpenAI
- Responses API remains a key direct model/tool API primitive.
- Agents SDK supports application-side agent orchestration.
- Agents API (public beta, September 2026) provides a managed long-running agent harness with tools, environments, context management and multi-agent support.

### AWS
- Amazon Bedrock remains the foundation-model platform.
- Knowledge Bases remain a managed RAG capability.
- Guardrails evaluate model inputs/outputs.
- Bedrock Agents Classic entered maintenance mode for new customers in July 2026.
- AgentCore is AWS's recommended direction for new agent workloads.

### Google
- Gemini APIs continue to support multimodal model workflows and context caching.
- Model/version names change rapidly; production designs should capability-test instead of hard-coding assumptions.

## Rule

Do not architecture around one model name.

Architecture around capabilities:

```text
generate
reason
embed
retrieve
tool-call
multimodal
structured-output
latency
cost
security
residency
```


---

<!-- 030_CROSS_ENTROPY.md -->

# Cross Entropy

## What / Why

Measures mismatch between target distribution and predictions.

## Mental Model

```text
-Σ y log p
```

## When to Use

Use classification/LLM training.

## Common Mistake / Interview Trap

Very confident wrong predictions are heavily penalized.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Cross Entropy:** Measures mismatch between target distribution and predictions.


---

<!-- 031_KL_DIVERGENCE.md -->

# KL Divergence

## What / Why

Measures how one distribution differs from another.

## Mental Model

```text
KL(P||Q)
```

## When to Use

Use distillation, variational methods, RLHF-like objectives.

## Common Mistake / Interview Trap

KL is asymmetric.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **KL Divergence:** Measures how one distribution differs from another.


---

<!-- 032_GRADIENT.md -->

# Gradient

## What / Why

Vector of partial derivatives showing steepest local increase.

## Mental Model

```text
∇L
```

## When to Use

Use optimization.

## Common Mistake / Interview Trap

Zero gradient may be min/max/saddle.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Gradient:** Vector of partial derivatives showing steepest local increase.


---

<!-- 033_CHAIN_RULE.md -->

# Chain Rule

## What / Why

Propagates derivatives through composed functions.

## Mental Model

```text
dy/dx = dy/du * du/dx
```

## When to Use

Basis of backpropagation.

## Common Mistake / Interview Trap

Vanishing/exploding gradients arise through repeated multiplication.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Chain Rule:** Propagates derivatives through composed functions.


---

<!-- 034_GRADIENT_DESCENT.md -->

# Gradient Descent

## What / Why

Iteratively updates parameters opposite gradient.

## Mental Model

```text
θ ← θ - η∇L
```

## When to Use

Use model training.

## Common Mistake / Interview Trap

Learning rate is critical.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Gradient Descent:** Iteratively updates parameters opposite gradient.


---

<!-- 035_NORMALIZATION_VS_STANDARDIZATION.md -->

# Normalization vs Standardization

## What / Why

Normalization rescales range; standardization centers/scales by std.

## Mental Model

```text
0-1 vs z-score
```

## When to Use

Use based on model/data.

## Common Mistake / Interview Trap

Tree models usually need less scaling than distance/gradient models.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Normalization vs Standardization:** Normalization rescales range; standardization centers/scales by std.


---

<!-- 036_LINEAR_REGRESSION.md -->

# Linear Regression

## What / Why

Predict continuous target with linear combination.

## Mental Model

```text
ŷ = w·x + b
```

## When to Use

Use interpretable continuous prediction baseline.

## Common Mistake / Interview Trap

Outliers/nonlinearity can hurt.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Linear Regression:** Predict continuous target with linear combination.


---

<!-- 037_LOGISTIC_REGRESSION.md -->

# Logistic Regression

## What / Why

Predict class probability through logistic link.

## Mental Model

```text
p=σ(w·x+b)
```

## When to Use

Use interpretable binary classification baseline.

## Common Mistake / Interview Trap

Despite the name it is a classifier.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Logistic Regression:** Predict class probability through logistic link.


---

<!-- 038_DECISION_TREE.md -->

# Decision Tree

## What / Why

Recursive feature splits create predictions.

## Mental Model

```text
feature split → branches → leaf
```

## When to Use

Use interpretable nonlinear rules.

## Common Mistake / Interview Trap

Deep trees overfit.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Decision Tree:** Recursive feature splits create predictions.


---

<!-- 039_RANDOM_FOREST.md -->

# Random Forest

## What / Why

Ensemble of decorrelated decision trees.

## Mental Model

```text
many trees → vote/average
```

## When to Use

Use strong tabular baseline.

## Common Mistake / Interview Trap

Less interpretable than one tree.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Random Forest:** Ensemble of decorrelated decision trees.


---

<!-- 03_AI_DECISION_TREE.md -->

# AI Decision Tree

## Is the output a prediction from structured data?

```text
Yes → classical ML / gradient boosting / simple neural model
```

## Is the input unstructured image/audio/text at scale?

```text
Yes → deep learning / foundation model
```

## Need generated text/code/image/audio?

```text
Yes → Generative AI
```

## Need private/current facts?

```text
Yes → RAG / tools
```

## Need consistent behavior/style/format learned from many examples?

```text
Yes → Fine-tuning may help
```

## Need external actions?

```text
Known fixed steps → deterministic workflow + LLM nodes
Dynamic uncertain steps → agent with bounded tools/policies
```

## Need shared enterprise platform?

```text
Model Gateway
+ RAG Service
+ Agent Orchestrator
+ Evaluation
+ Policy/Guardrails
+ Observability
```


---

<!-- 040_GRADIENT_BOOSTING.md -->

# Gradient Boosting

## What / Why

Sequential trees correct prior errors.

## Mental Model

```text
tree1 + tree2 + ...
```

## When to Use

Use tabular data; XGBoost/LightGBM/CatBoost family.

## Common Mistake / Interview Trap

Tune leakage, depth, learning rate carefully.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Gradient Boosting:** Sequential trees correct prior errors.


---

<!-- 041_K_NEAREST_NEIGHBORS.md -->

# K Nearest Neighbors

## What / Why

Predict from nearby training examples.

## Mental Model

```text
distance → nearest K
```

## When to Use

Use simple low-dimensional baseline.

## Common Mistake / Interview Trap

Inference and scaling become costly at size.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **K Nearest Neighbors:** Predict from nearby training examples.


---

<!-- 042_NAIVE_BAYES.md -->

# Naive Bayes

## What / Why

Bayesian classifier with conditional independence assumption.

## Mental Model

```text
P(y)ΠP(xi|y)
```

## When to Use

Use text/simple high-dimensional data.

## Common Mistake / Interview Trap

Independence assumption is strong.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Naive Bayes:** Bayesian classifier with conditional independence assumption.


---

<!-- 043_SVM.md -->

# SVM

## What / Why

Find maximum-margin separating hyperplane; kernels enable nonlinear boundaries.

## Mental Model

```text
margin maximization
```

## When to Use

Use medium-sized high-dimensional problems.

## Common Mistake / Interview Trap

Scaling to massive datasets can be hard.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **SVM:** Find maximum-margin separating hyperplane; kernels enable nonlinear boundaries.


---

<!-- 044_K_MEANS.md -->

# K Means

## What / Why

Partitions points into K clusters by centroid distance.

## Mental Model

```text
assign → update centroids
```

## When to Use

Use exploratory clustering.

## Common Mistake / Interview Trap

Need K and roughly spherical cluster assumptions.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **K Means:** Partitions points into K clusters by centroid distance.


---

<!-- 045_HIERARCHICAL_CLUSTERING.md -->

# Hierarchical Clustering

## What / Why

Builds cluster tree by merging/splitting groups.

## Mental Model

```text
dendrogram
```

## When to Use

Use when hierarchy is informative.

## Common Mistake / Interview Trap

Scaling is expensive.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Hierarchical Clustering:** Builds cluster tree by merging/splitting groups.


---

<!-- 046_DBSCAN.md -->

# DBSCAN

## What / Why

Density-based clustering with noise detection.

## Mental Model

```text
dense neighborhoods → clusters
```

## When to Use

Use irregular cluster shapes/outliers.

## Common Mistake / Interview Trap

Sensitive to distance scale/epsilon.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **DBSCAN:** Density-based clustering with noise detection.


---

<!-- 047_PCA.md -->

# PCA

## What / Why

Projects data onto directions of maximum variance.

## Mental Model

```text
X → principal components
```

## When to Use

Use dimensionality reduction/visualization.

## Common Mistake / Interview Trap

Components may be hard to interpret.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **PCA:** Projects data onto directions of maximum variance.


---

<!-- 048_FEATURE_ENGINEERING.md -->

# Feature Engineering

## What / Why

Transforms raw data into informative model inputs.

## Mental Model

```text
raw → clean/encode/aggregate
```

## When to Use

Critical for classical ML.

## Common Mistake / Interview Trap

Feature leakage is dangerous.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Feature Engineering:** Transforms raw data into informative model inputs.


---

<!-- 049_CATEGORICAL_ENCODING.md -->

# Categorical Encoding

## What / Why

Transforms categorical values to model-readable representation.

## Mental Model

```text
one-hot/ordinal/target/etc.
```

## When to Use

Use based on cardinality/model.

## Common Mistake / Interview Trap

Target encoding can leak labels.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Categorical Encoding:** Transforms categorical values to model-readable representation.


---

<!-- 04_AI_SYSTEM_REFERENCE_ARCHITECTURE.md -->

# AI System Reference Architecture

```text
Client / Product
      ↓
AI BFF / API Gateway
      ↓
Policy + Auth + Rate Limit
      ↓
AI Orchestrator
 ├── Model Router
 │    ├── Large Model
 │    └── Small Model
 ├── RAG
 │    ├── Query Rewrite
 │    ├── Hybrid Retrieval
 │    ├── Reranker
 │    └── Vector / Search Store
 ├── Tools
 │    ├── Internal APIs
 │    ├── Search
 │    └── Actions
 └── Agent Runtime / Workflow
      ↓
Output Validation / Guardrails
      ↓
User

Cross-cutting:
Identity
Audit
Evals
Tracing
Cost
Secrets
Human Approval
Data Governance
```

## Golden Rule

The model is a probabilistic component inside a deterministic, observable, secure application architecture.


---

<!-- 050_IMBALANCED_CLASSIFICATION.md -->

# Imbalanced Classification

## What / Why

Positive/negative classes differ greatly.

## Mental Model

```text
class weighting / resampling / threshold
```

## When to Use

Use precision-recall metrics.

## Common Mistake / Interview Trap

Accuracy can be misleading.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Imbalanced Classification:** Positive/negative classes differ greatly.


---

<!-- 051_HYPERPARAMETER_TUNING.md -->

# Hyperparameter Tuning

## What / Why

Search configuration space using validation performance.

## Mental Model

```text
grid/random/Bayesian
```

## When to Use

Use after solid baseline.

## Common Mistake / Interview Trap

Do not tune before fixing data quality/leakage.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Hyperparameter Tuning:** Search configuration space using validation performance.


---

<!-- 052_ENSEMBLE_LEARNING.md -->

# Ensemble Learning

## What / Why

Combine diverse models to improve robustness.

## Mental Model

```text
bagging/boosting/stacking
```

## When to Use

Use when marginal accuracy matters.

## Common Mistake / Interview Trap

Operational complexity increases.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Ensemble Learning:** Combine diverse models to improve robustness.


---

<!-- 053_CONFUSION_MATRIX.md -->

# Confusion Matrix

## What / Why

Counts TP, TN, FP, FN.

## Mental Model

```text
actual × predicted
```

## When to Use

Use to understand classification error types.

## Common Mistake / Interview Trap

Threshold changes entries.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Confusion Matrix:** Counts TP, TN, FP, FN.


---

<!-- 054_ACCURACY.md -->

# Accuracy

## What / Why

Fraction of predictions correct.

## Mental Model

```text
correct/total
```

## When to Use

Use balanced classes/costs.

## Common Mistake / Interview Trap

Bad metric for severe imbalance.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Accuracy:** Fraction of predictions correct.


---

<!-- 055_PRECISION.md -->

# Precision

## What / Why

Of predicted positives, how many are correct.

## Mental Model

```text
TP/(TP+FP)
```

## When to Use

Use when false positives are costly.

## Common Mistake / Interview Trap

High precision can reduce recall.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Precision:** Of predicted positives, how many are correct.


---

<!-- 056_RECALL.md -->

# Recall

## What / Why

Of actual positives, how many found.

## Mental Model

```text
TP/(TP+FN)
```

## When to Use

Use when missing positives is costly.

## Common Mistake / Interview Trap

High recall can increase false positives.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Recall:** Of actual positives, how many found.


---

<!-- 057_F1_SCORE.md -->

# F1 Score

## What / Why

Harmonic mean of precision and recall.

## Mental Model

```text
2PR/(P+R)
```

## When to Use

Use balanced precision/recall trade-off.

## Common Mistake / Interview Trap

Still ignores TN and business costs.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **F1 Score:** Harmonic mean of precision and recall.


---

<!-- 058_ROC_AUC.md -->

# ROC AUC

## What / Why

Measures ranking performance across thresholds.

## Mental Model

```text
TPR vs FPR
```

## When to Use

Use general binary ranking evaluation.

## Common Mistake / Interview Trap

Can look optimistic with heavy imbalance.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **ROC AUC:** Measures ranking performance across thresholds.


---

<!-- 059_PR_AUC.md -->

# PR AUC

## What / Why

Precision-recall area across thresholds.

## Mental Model

```text
precision vs recall
```

## When to Use

Use imbalanced positive-class problems.

## Common Mistake / Interview Trap

Baseline depends on prevalence.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **PR AUC:** Precision-recall area across thresholds.


---

<!-- 060_MAE.md -->

# MAE

## What / Why

Mean absolute regression error.

## Mental Model

```text
mean |y-ŷ|
```

## When to Use

Use interpretable robust-ish errors.

## Common Mistake / Interview Trap

Treats all deviations linearly.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **MAE:** Mean absolute regression error.


---

<!-- 061_MSE_RMSE.md -->

# MSE RMSE

## What / Why

Squared error; RMSE restores target units.

## Mental Model

```text
mean (y-ŷ)^2
```

## When to Use

Use when large errors should be penalized.

## Common Mistake / Interview Trap

Sensitive to outliers.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **MSE RMSE:** Squared error; RMSE restores target units.


---

<!-- 062_R_SQUARED.md -->

# R Squared

## What / Why

Fraction of variance explained relative to mean baseline.

## Mental Model

```text
1-SSE/SST
```

## When to Use

Use regression comparison.

## Common Mistake / Interview Trap

Can be negative out-of-sample.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **R Squared:** Fraction of variance explained relative to mean baseline.


---

<!-- 063_CALIBRATION.md -->

# Calibration

## What / Why

Checks whether predicted probabilities match observed frequency.

## Mental Model

```text
0.8 confidence ≈ 80% correct
```

## When to Use

Use risk/decision systems.

## Common Mistake / Interview Trap

Good ranking does not imply good calibration.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Calibration:** Checks whether predicted probabilities match observed frequency.


---

<!-- 064_THRESHOLD_SELECTION.md -->

# Threshold Selection

## What / Why

Choose decision threshold from business costs.

## Mental Model

```text
probability → threshold → class
```

## When to Use

Tune using validation/business utility.

## Common Mistake / Interview Trap

0.5 is not always optimal.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Threshold Selection:** Choose decision threshold from business costs.


---

<!-- 065_OFFLINE_VS_ONLINE_EVALUATION.md -->

# Offline vs Online Evaluation

## What / Why

Offline evaluates datasets; online evaluates live user/business behavior.

## Mental Model

```text
benchmark → A/B/live metrics
```

## When to Use

Use both for production AI.

## Common Mistake / Interview Trap

Offline gain may not improve user outcomes.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Offline vs Online Evaluation:** Offline evaluates datasets; online evaluates live user/business behavior.


---

<!-- 066_A_B_TESTING.md -->

# A B Testing

## What / Why

Randomized experiment compares deployed variants.

## Mental Model

```text
control vs treatment
```

## When to Use

Use for measurable product impact.

## Common Mistake / Interview Trap

Watch sample size, novelty, interference.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **A B Testing:** Randomized experiment compares deployed variants.


---

<!-- 067_ERROR_ANALYSIS.md -->

# Error Analysis

## What / Why

Manually/systematically categorize failures.

## Mental Model

```text
errors → taxonomy → fixes
```

## When to Use

Use after every evaluation cycle.

## Common Mistake / Interview Trap

Aggregate metric alone hides important failure modes.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Error Analysis:** Manually/systematically categorize failures.


---

<!-- 068_NEURAL_NETWORK.md -->

# Neural Network

## What / Why

Layers of parameterized transformations learn nonlinear mappings.

## Mental Model

```text
x → layers → y
```

## When to Use

Use high-dimensional unstructured data.

## Common Mistake / Interview Trap

Needs data/compute and careful regularization.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Neural Network:** Layers of parameterized transformations learn nonlinear mappings.


---

<!-- 069_DENSE_LAYER.md -->

# Dense Layer

## What / Why

Linear transformation plus activation.

## Mental Model

```text
y=σ(Wx+b)
```

## When to Use

Core building block.

## Common Mistake / Interview Trap

Too many dense parameters scale poorly.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Dense Layer:** Linear transformation plus activation.


---

<!-- 070_ACTIVATION_FUNCTIONS.md -->

# Activation Functions

## What / Why

Introduce nonlinearity.

## Mental Model

```text
ReLU/GELU/Sigmoid/Tanh
```

## When to Use

Use architecture-specific activations.

## Common Mistake / Interview Trap

Saturating activations can weaken gradients.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Activation Functions:** Introduce nonlinearity.


---

<!-- 071_BACKPROPAGATION.md -->

# Backpropagation

## What / Why

Computes gradients through computation graph.

## Mental Model

```text
loss → chain rule → parameter grads
```

## When to Use

Use neural training.

## Common Mistake / Interview Trap

Numerical instability and gradient issues matter.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Backpropagation:** Computes gradients through computation graph.


---

<!-- 072_OPTIMIZER_SGD.md -->

# Optimizer SGD

## What / Why

Gradient update with optional momentum.

## Mental Model

```text
θ←θ-ηg
```

## When to Use

Use strong baseline.

## Common Mistake / Interview Trap

Learning-rate schedule matters.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Optimizer SGD:** Gradient update with optional momentum.


---

<!-- 073_ADAM_ADAMW.md -->

# Adam AdamW

## What / Why

Adaptive optimizer; AdamW decouples weight decay.

## Mental Model

```text
adaptive moments
```

## When to Use

Common transformer/deep-learning optimizer.

## Common Mistake / Interview Trap

Not automatically best for every problem.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Adam AdamW:** Adaptive optimizer; AdamW decouples weight decay.


---

<!-- 074_LEARNING_RATE.md -->

# Learning Rate

## What / Why

Controls step size.

## Mental Model

```text
η
```

## When to Use

Most important training hyperparameter.

## Common Mistake / Interview Trap

Too high diverges; too low stalls.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Learning Rate:** Controls step size.


---

<!-- 075_BATCH_SIZE.md -->

# Batch Size

## What / Why

Examples per gradient step.

## Mental Model

```text
mini-batch
```

## When to Use

Balance throughput/noise/memory.

## Common Mistake / Interview Trap

Large batch changes optimization dynamics.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Batch Size:** Examples per gradient step.


---

<!-- 076_EPOCH_STEP.md -->

# Epoch Step

## What / Why

Epoch = pass through dataset; step = one optimizer update.

## Mental Model

```text
dataset / batch
```

## When to Use

Use training schedules.

## Common Mistake / Interview Trap

Streaming/pretraining may be step-based rather than epoch-based.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Epoch Step:** Epoch = pass through dataset; step = one optimizer update.


---

<!-- 077_LOSS_FUNCTION.md -->

# Loss Function

## What / Why

Objective minimized during training.

## Mental Model

```text
MSE/CrossEntropy/etc.
```

## When to Use

Match task/probabilistic assumptions.

## Common Mistake / Interview Trap

Metric and loss need not be identical.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Loss Function:** Objective minimized during training.


---

<!-- 078_REGULARIZATION.md -->

# Regularization

## What / Why

Techniques reduce overfitting.

## Mental Model

```text
weight decay/dropout/data augmentation
```

## When to Use

Use based on model/task.

## Common Mistake / Interview Trap

Too much regularization underfits.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Regularization:** Techniques reduce overfitting.


---

<!-- 079_DROPOUT.md -->

# Dropout

## What / Why

Randomly zeros activations during training.

## Mental Model

```text
mask activations
```

## When to Use

Use where architecture benefits.

## Common Mistake / Interview Trap

Disabled at inference.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Dropout:** Randomly zeros activations during training.


---

<!-- 080_BATCH_NORMALIZATION.md -->

# Batch Normalization

## What / Why

Normalizes intermediate activations using batch statistics.

## Mental Model

```text
normalize → scale/shift
```

## When to Use

Common CNN training.

## Common Mistake / Interview Trap

Small batches can be problematic.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Batch Normalization:** Normalizes intermediate activations using batch statistics.


---

<!-- 081_LAYER_NORMALIZATION.md -->

# Layer Normalization

## What / Why

Normalizes features within each example/token.

## Mental Model

```text
normalize hidden dimension
```

## When to Use

Core transformer component.

## Common Mistake / Interview Trap

Different axis/behavior from batch norm.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Layer Normalization:** Normalizes features within each example/token.


---

<!-- 082_RESIDUAL_CONNECTION.md -->

# Residual Connection

## What / Why

Adds layer input to output.

## Mental Model

```text
y=x+F(x)
```

## When to Use

Helps deep optimization.

## Common Mistake / Interview Trap

Dimensions must match/project.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Residual Connection:** Adds layer input to output.


---

<!-- 083_INITIALIZATION.md -->

# Initialization

## What / Why

Chooses starting weights.

## Mental Model

```text
Xavier/He/etc.
```

## When to Use

Critical for stable deep training.

## Common Mistake / Interview Trap

Bad init can explode/vanish.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Initialization:** Chooses starting weights.


---

<!-- 084_VANISHING_EXPLODING_GRADIENTS.md -->

# Vanishing Exploding Gradients

## What / Why

Gradients shrink/explode through deep computation.

## Mental Model

```text
product of derivatives
```

## When to Use

Use residuals/norm/init/clipping.

## Common Mistake / Interview Trap

Can destabilize training silently.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Vanishing Exploding Gradients:** Gradients shrink/explode through deep computation.


---

<!-- 085_GRADIENT_CLIPPING.md -->

# Gradient Clipping

## What / Why

Caps gradient norm/value.

## Mental Model

```text
clip(g)
```

## When to Use

Use RNN/transformer stability.

## Common Mistake / Interview Trap

Does not fix fundamentally bad optimization.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Gradient Clipping:** Caps gradient norm/value.


---

<!-- 086_EARLY_STOPPING.md -->

# Early Stopping

## What / Why

Stop when validation stops improving.

## Mental Model

```text
patience
```

## When to Use

Use smaller supervised datasets.

## Common Mistake / Interview Trap

Validation noise can trigger premature stop.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Early Stopping:** Stop when validation stops improving.


---

<!-- 087_CNN.md -->

# CNN

## What / Why

Convolutional network learns spatial filters.

## Mental Model

```text
image → conv → feature maps
```

## When to Use

Use vision tasks and compact image models.

## Common Mistake / Interview Trap

Transformers are also common; CNNs remain useful.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **CNN:** Convolutional network learns spatial filters.


---

<!-- 088_CONVOLUTION.md -->

# Convolution

## What / Why

Sliding learned kernel computes local features.

## Mental Model

```text
kernel * image
```

## When to Use

Use spatial locality.

## Common Mistake / Interview Trap

Stride/padding control resolution.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Convolution:** Sliding learned kernel computes local features.


---

<!-- 089_POOLING.md -->

# Pooling

## What / Why

Reduces spatial resolution.

## Mental Model

```text
max/avg pool
```

## When to Use

Use invariance/downsampling.

## Common Mistake / Interview Trap

Can discard detail.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Pooling:** Reduces spatial resolution.


---

<!-- 090_IMAGE_CLASSIFICATION.md -->

# Image Classification

## What / Why

Assign one/multiple labels to image.

## Mental Model

```text
image → label probabilities
```

## When to Use

Use product/category/diagnostic tasks.

## Common Mistake / Interview Trap

Dataset bias is critical.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Image Classification:** Assign one/multiple labels to image.


---

<!-- 091_OBJECT_DETECTION.md -->

# Object Detection

## What / Why

Find classes and bounding boxes.

## Mental Model

```text
image → boxes + labels
```

## When to Use

Use localization tasks.

## Common Mistake / Interview Trap

Evaluate with IoU/mAP.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Object Detection:** Find classes and bounding boxes.


---

<!-- 092_IMAGE_SEGMENTATION.md -->

# Image Segmentation

## What / Why

Assign label per pixel.

## Mental Model

```text
image → mask
```

## When to Use

Use medical/autonomous/scene tasks.

## Common Mistake / Interview Trap

Annotation is expensive.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Image Segmentation:** Assign label per pixel.


---

<!-- 093_VISION_TRANSFORMER.md -->

# Vision Transformer

## What / Why

Treat image patches as tokens processed by attention.

## Mental Model

```text
patches → transformer
```

## When to Use

Use large-scale vision/foundation models.

## Common Mistake / Interview Trap

Compute/data requirements can be high.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Vision Transformer:** Treat image patches as tokens processed by attention.


---

<!-- 094_IMAGE_AUGMENTATION.md -->

# Image Augmentation

## What / Why

Generate label-preserving transforms.

## Mental Model

```text
crop/flip/color/etc.
```

## When to Use

Use regularization.

## Common Mistake / Interview Trap

Transforms must preserve task semantics.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Image Augmentation:** Generate label-preserving transforms.


---

<!-- 095_TRANSFER_LEARNING_VISION.md -->

# Transfer Learning Vision

## What / Why

Reuse pretrained visual representation.

## Mental Model

```text
pretrained → fine-tune
```

## When to Use

Use limited data.

## Common Mistake / Interview Trap

Domain shift matters.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Transfer Learning Vision:** Reuse pretrained visual representation.


---

<!-- 096_MULTIMODAL_VISION_LANGUAGE.md -->

# Multimodal Vision Language

## What / Why

Models jointly process images and text.

## Mental Model

```text
image + prompt → response
```

## When to Use

Use OCR/Q&A/document understanding.

## Common Mistake / Interview Trap

Grounding and hallucination still matter.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Multimodal Vision Language:** Models jointly process images and text.


---

<!-- 097_TOKENIZATION.md -->

# Tokenization

## What / Why

Converts text into model tokens.

## Mental Model

```text
text → token IDs
```

## When to Use

Use all language models.

## Common Mistake / Interview Trap

Tokens are not words; cost/context depend on tokenizer.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Tokenization:** Converts text into model tokens.


---

<!-- 098_BAG_OF_WORDS.md -->

# Bag of Words

## What / Why

Represents text by token counts.

## Mental Model

```text
document → sparse vector
```

## When to Use

Use classical NLP baseline.

## Common Mistake / Interview Trap

Ignores order.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Bag of Words:** Represents text by token counts.


---

<!-- 099_TF_IDF.md -->

# TF IDF

## What / Why

Weights terms by local frequency and corpus rarity.

## Mental Model

```text
TF × IDF
```

## When to Use

Use search/classification baseline.

## Common Mistake / Interview Trap

Still lexical, not semantic.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **TF IDF:** Weights terms by local frequency and corpus rarity.


---

<!-- 100_WORD_EMBEDDINGS.md -->

# Word Embeddings

## What / Why

Map words/tokens into dense vectors.

## Mental Model

```text
word → vector
```

## When to Use

Use semantic similarity/features.

## Common Mistake / Interview Trap

Static embeddings miss context.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Word Embeddings:** Map words/tokens into dense vectors.


---

<!-- 101_SEQUENCE_MODELS.md -->

# Sequence Models

## What / Why

RNN/LSTM/GRU process ordered data recurrently.

## Mental Model

```text
token_t + state → state
```

## When to Use

Know pre-transformer NLP.

## Common Mistake / Interview Trap

Harder to parallelize and long-range modeling is limited.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Sequence Models:** RNN/LSTM/GRU process ordered data recurrently.


---

<!-- 102_ATTENTION.md -->

# Attention

## What / Why

Computes weighted interactions between elements.

## Mental Model

```text
QKᵀ → weights → V
```

## When to Use

Core transformer concept.

## Common Mistake / Interview Trap

Attention is not explanation by default.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Attention:** Computes weighted interactions between elements.


---

<!-- 103_SELF_ATTENTION.md -->

# Self Attention

## What / Why

Tokens attend to other tokens in same sequence.

## Mental Model

```text
sequence → Q,K,V
```

## When to Use

Use contextual representation.

## Common Mistake / Interview Trap

Quadratic attention cost matters for long sequences.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Self Attention:** Tokens attend to other tokens in same sequence.


---

<!-- 104_TRANSFORMER.md -->

# Transformer

## What / Why

Stacks attention and feed-forward blocks.

## Mental Model

```text
tokens → transformer blocks
```

## When to Use

Foundation of modern LLMs.

## Common Mistake / Interview Trap

Architecture variants differ significantly.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Transformer:** Stacks attention and feed-forward blocks.


---

<!-- 105_ENCODER_DECODER.md -->

# Encoder Decoder

## What / Why

Encoder builds representation; decoder generates output.

## Mental Model

```text
source → encoder → decoder → target
```

## When to Use

Use translation/seq2seq models.

## Common Mistake / Interview Trap

Decoder-only LLMs use different architecture.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Encoder Decoder:** Encoder builds representation; decoder generates output.


---

<!-- 106_DECODER_ONLY_MODEL.md -->

# Decoder Only Model

## What / Why

Autoregressively predicts next tokens.

## Mental Model

```text
prefix → next token → repeat
```

## When to Use

Common LLM architecture.

## Common Mistake / Interview Trap

Generation is probabilistic decoding over token distributions.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Decoder Only Model:** Autoregressively predicts next tokens.


---

<!-- 107_MASKED_LANGUAGE_MODELING.md -->

# Masked Language Modeling

## What / Why

Predict masked tokens from context.

## Mental Model

```text
masked sequence → token recovery
```

## When to Use

Used in encoder pretraining.

## Common Mistake / Interview Trap

Different from autoregressive next-token training.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Masked Language Modeling:** Predict masked tokens from context.


---

<!-- 108_LLM_MENTAL_MODEL.md -->

# LLM Mental Model

## What / Why

An LLM predicts token distributions conditioned on context and learned representations.

## Mental Model

```text
tokens → embeddings → transformer → logits → decoding
```

## When to Use

Use to demystify LLM behavior.

## Common Mistake / Interview Trap

LLM output is not a database lookup.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **LLM Mental Model:** An LLM predicts token distributions conditioned on context and learned representations.


---

<!-- 109_EMBEDDINGS_LAYER.md -->

# Embeddings Layer

## What / Why

Maps token IDs to dense vectors.

## Mental Model

```text
token id → embedding
```

## When to Use

Input representation for transformers.

## Common Mistake / Interview Trap

Model embeddings differ from retrieval embedding models.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Embeddings Layer:** Maps token IDs to dense vectors.


---

<!-- 110_POSITIONAL_ENCODING.md -->

# Positional Encoding

## What / Why

Injects token position information.

## Mental Model

```text
token embedding + position
```

## When to Use

Required because attention alone is order-agnostic.

## Common Mistake / Interview Trap

Different models use RoPE/learned/other schemes.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Positional Encoding:** Injects token position information.


---

<!-- 111_Q_K_V.md -->

# Q K V

## What / Why

Queries, Keys and Values implement attention.

## Mental Model

```text
softmax(QKᵀ/√d)V
```

## When to Use

Core transformer interview topic.

## Common Mistake / Interview Trap

Q/K/V are learned projections, not literal database query/key/value.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Q K V:** Queries, Keys and Values implement attention.


---

<!-- 112_MULTI_HEAD_ATTENTION.md -->

# Multi Head Attention

## What / Why

Runs multiple attention subspaces in parallel.

## Mental Model

```text
heads → concat/project
```

## When to Use

Captures varied relationships.

## Common Mistake / Interview Trap

More heads alone does not guarantee quality.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Multi Head Attention:** Runs multiple attention subspaces in parallel.


---

<!-- 113_FEED_FORWARD_NETWORK.md -->

# Feed Forward Network

## What / Why

Per-token MLP transformation within transformer block.

## Mental Model

```text
hidden → expand/activate/project
```

## When to Use

Core block component.

## Common Mistake / Interview Trap

Often consumes large parameter share.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Feed Forward Network:** Per-token MLP transformation within transformer block.


---

<!-- 114_CAUSAL_MASK.md -->

# Causal Mask

## What / Why

Prevents decoder from attending to future tokens.

## Mental Model

```text
triangular attention mask
```

## When to Use

Required for autoregressive training.

## Common Mistake / Interview Trap

Does not itself guarantee factuality.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Causal Mask:** Prevents decoder from attending to future tokens.


---

<!-- 115_CONTEXT_WINDOW.md -->

# Context Window

## What / Why

Maximum/usable token context model can process.

## Mental Model

```text
prompt + history + retrieved data + output
```

## When to Use

Budget context deliberately.

## Common Mistake / Interview Trap

Large context is not free memory or guaranteed recall.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Context Window:** Maximum/usable token context model can process.


---

<!-- 116_KV_CACHE.md -->

# KV Cache

## What / Why

Caches attention key/value states during autoregressive decoding.

## Mental Model

```text
past K/V reused
```

## When to Use

Improves generation efficiency.

## Common Mistake / Interview Trap

Consumes memory proportional to sequence/layers.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **KV Cache:** Caches attention key/value states during autoregressive decoding.


---

<!-- 117_LOGITS.md -->

# Logits

## What / Why

Raw model scores before softmax.

## Mental Model

```text
hidden → vocabulary logits
```

## When to Use

Used for decoding.

## Common Mistake / Interview Trap

Logits are not calibrated probabilities by default.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Logits:** Raw model scores before softmax.


---

<!-- 118_TEMPERATURE.md -->

# Temperature

## What / Why

Scales logits before sampling.

## Mental Model

```text
softmax(logits/T)
```

## When to Use

Use to adjust randomness.

## Common Mistake / Interview Trap

Higher temperature generally increases diversity/uncertainty.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Temperature:** Scales logits before sampling.


---

<!-- 119_TOP_P.md -->

# Top P

## What / Why

Samples from smallest token set reaching cumulative probability p.

## Mental Model

```text
nucleus sampling
```

## When to Use

Use creative/open-ended generation.

## Common Mistake / Interview Trap

Deterministic business tasks often prefer lower variance.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Top P:** Samples from smallest token set reaching cumulative probability p.


---

<!-- 120_GREEDY_DECODING.md -->

# Greedy Decoding

## What / Why

Choose highest probability token each step.

## Mental Model

```text
argmax
```

## When to Use

Use deterministic-ish generation baseline.

## Common Mistake / Interview Trap

May produce repetitive/suboptimal sequences.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Greedy Decoding:** Choose highest probability token each step.


---

<!-- 121_BEAM_SEARCH.md -->

# Beam Search

## What / Why

Keeps multiple candidate sequences.

## Mental Model

```text
beam candidates
```

## When to Use

Useful in structured seq2seq tasks.

## Common Mistake / Interview Trap

Less common for open-ended chat LLMs.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Beam Search:** Keeps multiple candidate sequences.


---

<!-- 122_HALLUCINATION.md -->

# Hallucination

## What / Why

Model produces unsupported/incorrect content confidently.

## Mental Model

```text
plausible ≠ grounded
```

## When to Use

Mitigate with retrieval, tools, constraints, evaluation.

## Common Mistake / Interview Trap

Cannot be eliminated by prompting alone.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Hallucination:** Model produces unsupported/incorrect content confidently.


---

<!-- 123_SCALING_LAWS.md -->

# Scaling Laws

## What / Why

Performance often improves predictably with data/compute/model scale under regimes.

## Mental Model

```text
scale → loss trend
```

## When to Use

Useful for training economics.

## Common Mistake / Interview Trap

Quality depends on architecture/data/objective too.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Scaling Laws:** Performance often improves predictably with data/compute/model scale under regimes.


---

<!-- 124_MIXTURE_OF_EXPERTS.md -->

# Mixture of Experts

## What / Why

Routes tokens to subset of expert networks.

## Mental Model

```text
router → selected experts
```

## When to Use

Increases capacity with sparse compute.

## Common Mistake / Interview Trap

Routing/load balance add complexity.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Mixture of Experts:** Routes tokens to subset of expert networks.


---

<!-- 125_QUANTIZATION.md -->

# Quantization

## What / Why

Stores/executes weights/activations at lower precision.

## Mental Model

```text
FP16/BF16/INT8/INT4
```

## When to Use

Use inference/training efficiency.

## Common Mistake / Interview Trap

Accuracy/hardware trade-offs vary.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Quantization:** Stores/executes weights/activations at lower precision.


---

<!-- 126_DISTILLATION.md -->

# Distillation

## What / Why

Train smaller model to imitate stronger teacher.

## Mental Model

```text
teacher outputs → student
```

## When to Use

Use lower latency/cost.

## Common Mistake / Interview Trap

Student inherits teacher limitations/bias.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Distillation:** Train smaller model to imitate stronger teacher.


---

<!-- 127_SPECULATIVE_DECODING.md -->

# Speculative Decoding

## What / Why

Draft model proposes tokens, target model verifies.

## Mental Model

```text
draft → verify
```

## When to Use

Use faster decoding.

## Common Mistake / Interview Trap

Benefit depends on acceptance/hardware.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Speculative Decoding:** Draft model proposes tokens, target model verifies.


---

<!-- 128_FOUNDATION_MODEL.md -->

# Foundation Model

## What / Why

Large pretrained model adaptable to many downstream tasks.

## Mental Model

```text
pretrain → prompt/fine-tune/tools
```

## When to Use

Use as reusable general capability.

## Common Mistake / Interview Trap

Capability does not imply domain correctness.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Foundation Model:** Large pretrained model adaptable to many downstream tasks.


---

<!-- 129_GENERATIVE_AI.md -->

# Generative AI

## What / Why

Models create text/images/audio/video/code or structured outputs.

## Mental Model

```text
prompt/context → generated content
```

## When to Use

Use content/synthesis/reasoning workflows.

## Common Mistake / Interview Trap

Always design verification for high-stakes output.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Generative AI:** Models create text/images/audio/video/code or structured outputs.


---

<!-- 130_PROMPT.md -->

# Prompt

## What / Why

Instructions and context provided to a model.

## Mental Model

```text
system/developer/user/context
```

## When to Use

Use clear task, constraints, inputs and output format.

## Common Mistake / Interview Trap

Prompting is one layer, not full application architecture.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt:** Instructions and context provided to a model.


---

<!-- 131_SYSTEM_INSTRUCTION.md -->

# System Instruction

## What / Why

Highest application-level behavioral guidance in many model APIs.

## Mental Model

```text
policy/persona/task constraints
```

## When to Use

Use stable global behavior.

## Common Mistake / Interview Trap

Never place secrets in prompts.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **System Instruction:** Highest application-level behavioral guidance in many model APIs.


---

<!-- 132_FEW_SHOT_PROMPTING.md -->

# Few Shot Prompting

## What / Why

Provide examples of desired input/output.

## Mental Model

```text
examples → new task
```

## When to Use

Use formatting/style/task induction.

## Common Mistake / Interview Trap

Examples consume context and can encode bias.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Few Shot Prompting:** Provide examples of desired input/output.


---

<!-- 133_CHAIN_OF_THOUGHT_CONCEPT.md -->

# Chain of Thought Concept

## What / Why

Models may use internal reasoning to solve multi-step tasks.

## Mental Model

```text
problem → reasoning → answer
```

## When to Use

Use reasoning-capable models for hard tasks.

## Common Mistake / Interview Trap

Do not require exposing hidden chain-of-thought; request concise rationale or verifiable steps.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Chain of Thought Concept:** Models may use internal reasoning to solve multi-step tasks.


---

<!-- 134_STRUCTURED_OUTPUT.md -->

# Structured Output

## What / Why

Constrain output to schema/typed structure.

## Mental Model

```text
schema → JSON/object
```

## When to Use

Use integrations/automation.

## Common Mistake / Interview Trap

Still validate output semantically.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Structured Output:** Constrain output to schema/typed structure.


---

<!-- 135_TOOL_CALLING.md -->

# Tool Calling

## What / Why

Model selects external functions/tools.

## Mental Model

```text
LLM → tool call → result → LLM
```

## When to Use

Use actions/current data/calculation.

## Common Mistake / Interview Trap

Tool execution must enforce auth and validation.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Tool Calling:** Model selects external functions/tools.


---

<!-- 136_FUNCTION_CALLING.md -->

# Function Calling

## What / Why

Typed tool invocation using defined function schema.

## Mental Model

```text
name + args JSON
```

## When to Use

Use deterministic integration boundaries.

## Common Mistake / Interview Trap

Schema validity does not ensure business safety.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Function Calling:** Typed tool invocation using defined function schema.


---

<!-- 137_MULTIMODAL_MODEL.md -->

# Multimodal Model

## What / Why

Processes/generates multiple modalities.

## Mental Model

```text
text+image+audio/video
```

## When to Use

Use rich interfaces.

## Common Mistake / Interview Trap

Each modality has separate failure modes.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Multimodal Model:** Processes/generates multiple modalities.


---

<!-- 138_GROUNDING.md -->

# Grounding

## What / Why

Connect generation to external evidence or tools.

## Mental Model

```text
model + source evidence
```

## When to Use

Use factual enterprise/current-data tasks.

## Common Mistake / Interview Trap

Grounded context can still be misinterpreted.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Grounding:** Connect generation to external evidence or tools.


---

<!-- 139_PROMPT_CACHING.md -->

# Prompt Caching

## What / Why

Reuse common prompt prefix computation to reduce latency/cost where platform supports it.

## Mental Model

```text
shared prefix → cache hit
```

## When to Use

Use large repeated instructions/context.

## Common Mistake / Interview Trap

Cache semantics differ by vendor/model.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt Caching:** Reuse common prompt prefix computation to reduce latency/cost where platform supports it.


---

<!-- 140_CONTEXT_ENGINEERING.md -->

# Context Engineering

## What / Why

Design what information, tools, memory, summaries and instructions enter model context.

## Mental Model

```text
select → compress → order → context
```

## When to Use

Critical for agents/RAG.

## Common Mistake / Interview Trap

More context can reduce quality if noisy.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Context Engineering:** Design what information, tools, memory, summaries and instructions enter model context.


---

<!-- 141_MODEL_ROUTING.md -->

# Model Routing

## What / Why

Select model by task/cost/latency/risk.

## Mental Model

```text
task → classifier/router → model
```

## When to Use

Use heterogeneous workloads.

## Common Mistake / Interview Trap

Routing adds evaluation and fallback complexity.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Routing:** Select model by task/cost/latency/risk.


---

<!-- 142_FALLBACK_MODEL.md -->

# Fallback Model

## What / Why

Use alternate model/provider on failure or policy.

## Mental Model

```text
primary → fallback
```

## When to Use

Use resilience/cost strategies.

## Common Mistake / Interview Trap

Behavior changes across models must be evaluated.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Fallback Model:** Use alternate model/provider on failure or policy.


---

<!-- 143_SMALL_LANGUAGE_MODEL.md -->

# Small Language Model

## What / Why

Smaller model optimized for lower cost/latency/on-device or narrow tasks.

## Mental Model

```text
SLM
```

## When to Use

Use classification/extraction/simple agents.

## Common Mistake / Interview Trap

Benchmark rather than assume large model needed.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Small Language Model:** Smaller model optimized for lower cost/latency/on-device or narrow tasks.


---

<!-- 144_EMBEDDING.md -->

# Embedding

## What / Why

Dense vector representing semantic features.

## Mental Model

```text
content → vector
```

## When to Use

Use semantic search/clustering/recommendation.

## Common Mistake / Interview Trap

Embedding similarity is model/task dependent.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Embedding:** Dense vector representing semantic features.


---

<!-- 145_COSINE_SIMILARITY.md -->

# Cosine Similarity

## What / Why

Compares vector direction.

## Mental Model

```text
a·b/(||a||||b||)
```

## When to Use

Common embedding similarity.

## Common Mistake / Interview Trap

Normalize/model guidance matters.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Cosine Similarity:** Compares vector direction.


---

<!-- 146_EUCLIDEAN_DISTANCE.md -->

# Euclidean Distance

## What / Why

Measures geometric distance.

## Mental Model

```text
||a-b||
```

## When to Use

Use where embedding/index expects it.

## Common Mistake / Interview Trap

Metric must match model/index behavior.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Euclidean Distance:** Measures geometric distance.


---

<!-- 147_VECTOR_DATABASE.md -->

# Vector Database

## What / Why

Stores vectors plus metadata and supports nearest-neighbor search.

## Mental Model

```text
embedding → ANN index → neighbors
```

## When to Use

Use RAG/recommendation/semantic search.

## Common Mistake / Interview Trap

Vector DB is not automatically the source of truth.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Vector Database:** Stores vectors plus metadata and supports nearest-neighbor search.


---

<!-- 148_ANN_SEARCH.md -->

# ANN Search

## What / Why

Approximate nearest-neighbor algorithms trade tiny recall for speed.

## Mental Model

```text
HNSW/IVF/etc.
```

## When to Use

Use large vector collections.

## Common Mistake / Interview Trap

Tune latency/recall/memory.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **ANN Search:** Approximate nearest-neighbor algorithms trade tiny recall for speed.


---

<!-- 149_HNSW.md -->

# HNSW

## What / Why

Graph-based ANN index.

## Mental Model

```text
navigable small-world graph
```

## When to Use

Use high-recall low-latency retrieval.

## Common Mistake / Interview Trap

Memory-heavy.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **HNSW:** Graph-based ANN index.


---

<!-- 150_IVF.md -->

# IVF

## What / Why

Partitions vector space into coarse clusters for search.

## Mental Model

```text
centroids → candidate lists
```

## When to Use

Use scalable ANN systems.

## Common Mistake / Interview Trap

Needs training/tuning; lower probes can reduce recall.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **IVF:** Partitions vector space into coarse clusters for search.


---

<!-- 151_METADATA_FILTERING.md -->

# Metadata Filtering

## What / Why

Filter candidates by attributes before/with vector search.

## Mental Model

```text
tenant/type/date filters
```

## When to Use

Use multi-tenant/domain constraints.

## Common Mistake / Interview Trap

Incorrect filter design can eliminate relevant evidence.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Metadata Filtering:** Filter candidates by attributes before/with vector search.


---

<!-- 152_HYBRID_SEARCH.md -->

# Hybrid Search

## What / Why

Combine lexical and semantic retrieval.

## Mental Model

```text
BM25 + vector → fusion
```

## When to Use

Use exact terms + semantic meaning.

## Common Mistake / Interview Trap

Score normalization/fusion matters.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Hybrid Search:** Combine lexical and semantic retrieval.


---

<!-- 153_RERANKING.md -->

# Reranking

## What / Why

Second-stage model reorders retrieved candidates.

## Mental Model

```text
retrieve K → rerank → top N
```

## When to Use

Use to improve precision.

## Common Mistake / Interview Trap

Adds latency/cost.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Reranking:** Second-stage model reorders retrieved candidates.


---

<!-- 154_CHUNKING.md -->

# Chunking

## What / Why

Split documents into retrievable units.

## Mental Model

```text
document → chunks
```

## When to Use

Use RAG indexing.

## Common Mistake / Interview Trap

Chunk boundaries strongly affect retrieval.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Chunking:** Split documents into retrievable units.


---

<!-- 155_CHUNK_OVERLAP.md -->

# Chunk Overlap

## What / Why

Repeat neighboring text across chunks.

## Mental Model

```text
chunk + overlap
```

## When to Use

Use when context crosses boundaries.

## Common Mistake / Interview Trap

Too much overlap inflates index and duplicates evidence.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Chunk Overlap:** Repeat neighboring text across chunks.


---

<!-- 156_SEMANTIC_CHUNKING.md -->

# Semantic Chunking

## What / Why

Split based on meaning/structure rather than fixed length.

## Mental Model

```text
headings/semantic shifts
```

## When to Use

Use complex documents.

## Common Mistake / Interview Trap

More preprocessing complexity.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Semantic Chunking:** Split based on meaning/structure rather than fixed length.


---

<!-- 157_EMBEDDING_DIMENSION.md -->

# Embedding Dimension

## What / Why

Vector length produced by model.

## Mental Model

```text
d dimensions
```

## When to Use

Affects storage/index/cost.

## Common Mistake / Interview Trap

Higher dimension is not automatically better.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Embedding Dimension:** Vector length produced by model.


---

<!-- 158_VECTOR_NORMALIZATION.md -->

# Vector Normalization

## What / Why

Scale vectors, often to unit norm.

## Mental Model

```text
v/||v||
```

## When to Use

Use when similarity/index expects.

## Common Mistake / Interview Trap

Follow embedding model recommendation.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Vector Normalization:** Scale vectors, often to unit norm.


---

<!-- 159_RECALL_AT_K.md -->

# Recall at K

## What / Why

Fraction of relevant items found in top K.

## Mental Model

```text
relevant retrieved / relevant total
```

## When to Use

Use retrieval evaluation.

## Common Mistake / Interview Trap

High retrieval recall does not guarantee final answer quality.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Recall at K:** Fraction of relevant items found in top K.


---

<!-- 160_RAG_MENTAL_MODEL.md -->

# RAG Mental Model

## What / Why

Retrieve relevant external evidence and include it in generation.

## Mental Model

```text
Query → Retrieve → Context → Generate
```

## When to Use

Use private/current/domain knowledge.

## Common Mistake / Interview Trap

RAG is not fine-tuning.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG Mental Model:** Retrieve relevant external evidence and include it in generation.


---

<!-- 161_RAG_PIPELINE.md -->

# RAG Pipeline

## What / Why

Ingest → parse → chunk → embed → index → retrieve → rerank → prompt → generate → cite/evaluate.

## Mental Model

```text
end-to-end pipeline
```

## When to Use

Use as production checklist.

## Common Mistake / Interview Trap

Every stage can degrade quality.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG Pipeline:** Ingest → parse → chunk → embed → index → retrieve → rerank → prompt → generate → cite/evaluate.


---

<!-- 162_INGESTION.md -->

# Ingestion

## What / Why

Load and normalize source data.

## Mental Model

```text
files/APIs/DB → canonical docs
```

## When to Use

Use reliable incremental ingestion.

## Common Mistake / Interview Trap

Garbage in → garbage out.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Ingestion:** Load and normalize source data.


---

<!-- 163_DOCUMENT_PARSING.md -->

# Document Parsing

## What / Why

Extract text, tables, metadata and structure.

## Mental Model

```text
PDF/HTML/Office → structured content
```

## When to Use

Use layout-aware parsers where needed.

## Common Mistake / Interview Trap

Plain text extraction can destroy table/context structure.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Document Parsing:** Extract text, tables, metadata and structure.


---

<!-- 164_CHUNKING_STRATEGY.md -->

# Chunking Strategy

## What / Why

Choose size/boundary/overlap aligned to retrieval task.

## Mental Model

```text
semantic/fixed/section chunks
```

## When to Use

Tune empirically.

## Common Mistake / Interview Trap

One chunk size does not fit all document types.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Chunking Strategy:** Choose size/boundary/overlap aligned to retrieval task.


---

<!-- 165_EMBEDDING_MODEL_SELECTION.md -->

# Embedding Model Selection

## What / Why

Choose embedding model based on language/domain/cost/quality.

## Mental Model

```text
documents + query → same compatible vector space
```

## When to Use

Benchmark retrieval.

## Common Mistake / Interview Trap

Changing embedding model usually requires reindexing.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Embedding Model Selection:** Choose embedding model based on language/domain/cost/quality.


---

<!-- 166_QUERY_REWRITING.md -->

# Query Rewriting

## What / Why

Transform user query for better retrieval.

## Mental Model

```text
user query → search query
```

## When to Use

Use conversational/ambiguous questions.

## Common Mistake / Interview Trap

Rewrite can distort user intent.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Query Rewriting:** Transform user query for better retrieval.


---

<!-- 167_MULTI_QUERY_RETRIEVAL.md -->

# Multi Query Retrieval

## What / Why

Generate multiple search queries and merge results.

## Mental Model

```text
query → q1/q2/q3 → retrieve → fuse
```

## When to Use

Use broad/complex questions.

## Common Mistake / Interview Trap

Adds cost and duplicate results.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Multi Query Retrieval:** Generate multiple search queries and merge results.


---

<!-- 168_HYDE.md -->

# HyDE

## What / Why

Generate hypothetical answer/document then embed it for retrieval.

## Mental Model

```text
query → hypothetical passage → vector search
```

## When to Use

Use when query vocabulary differs from corpus.

## Common Mistake / Interview Trap

Generated hypothesis can bias retrieval.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **HyDE:** Generate hypothetical answer/document then embed it for retrieval.


---

<!-- 169_HYBRID_RETRIEVAL.md -->

# Hybrid Retrieval

## What / Why

Fuse lexical and semantic retrieval.

## Mental Model

```text
BM25 + embeddings
```

## When to Use

Strong enterprise default.

## Common Mistake / Interview Trap

Need rank fusion/tuning.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Hybrid Retrieval:** Fuse lexical and semantic retrieval.


---

<!-- 170_RERANKER.md -->

# Reranker

## What / Why

Score query-passage relevance with stronger model.

## Mental Model

```text
candidate K → reranker → top N
```

## When to Use

Use when vector search is noisy.

## Common Mistake / Interview Trap

Latency/cost trade-off.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Reranker:** Score query-passage relevance with stronger model.


---

<!-- 171_CONTEXT_ASSEMBLY.md -->

# Context Assembly

## What / Why

Select, dedupe, order and format evidence.

## Mental Model

```text
top passages → context block
```

## When to Use

Use citations and source metadata.

## Common Mistake / Interview Trap

Too much context can distract model.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Context Assembly:** Select, dedupe, order and format evidence.


---

<!-- 172_GROUNDED_GENERATION.md -->

# Grounded Generation

## What / Why

Tell model to answer from supplied evidence and abstain when unsupported.

## Mental Model

```text
evidence → constrained answer
```

## When to Use

Use factual RAG.

## Common Mistake / Interview Trap

Prompt alone cannot force correctness.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Grounded Generation:** Tell model to answer from supplied evidence and abstain when unsupported.


---

<!-- 173_CITATIONS.md -->

# Citations

## What / Why

Attach answer claims to source evidence.

## Mental Model

```text
claim → source id/page/url
```

## When to Use

Use enterprise trust/audit.

## Common Mistake / Interview Trap

Citation presence does not guarantee citation correctness.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Citations:** Attach answer claims to source evidence.


---

<!-- 174_RAG_EVALUATION.md -->

# RAG Evaluation

## What / Why

Measure retrieval and generation separately.

## Mental Model

```text
retrieval recall/precision + faithfulness/answer relevance
```

## When to Use

Use before production.

## Common Mistake / Interview Trap

End-to-end score alone hides root cause.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG Evaluation:** Measure retrieval and generation separately.


---

<!-- 175_FAITHFULNESS.md -->

# Faithfulness

## What / Why

How well answer is supported by retrieved evidence.

## Mental Model

```text
answer claims vs context
```

## When to Use

Core RAG metric.

## Common Mistake / Interview Trap

An answer can be relevant but unfaithful.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Faithfulness:** How well answer is supported by retrieved evidence.


---

<!-- 176_ANSWER_RELEVANCE.md -->

# Answer Relevance

## What / Why

How directly answer addresses query.

## Mental Model

```text
query ↔ answer
```

## When to Use

Use generation evaluation.

## Common Mistake / Interview Trap

Relevant answer can still be factually wrong.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Answer Relevance:** How directly answer addresses query.


---

<!-- 177_RETRIEVAL_PRECISION.md -->

# Retrieval Precision

## What / Why

Fraction of retrieved items that are relevant.

## Mental Model

```text
relevant in topK / K
```

## When to Use

Use to reduce noise.

## Common Mistake / Interview Trap

Higher precision can lower recall.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Retrieval Precision:** Fraction of retrieved items that are relevant.


---

<!-- 178_KNOWLEDGE_FRESHNESS.md -->

# Knowledge Freshness

## What / Why

Ensure index reflects latest authoritative source.

## Mental Model

```text
source change → reingest
```

## When to Use

Use operational SLAs.

## Common Mistake / Interview Trap

Stale RAG is confidently stale.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Knowledge Freshness:** Ensure index reflects latest authoritative source.


---

<!-- 179_ACCESS_CONTROLLED_RAG.md -->

# Access Controlled RAG

## What / Why

Apply document/row/tenant permissions before retrieval/generation.

## Mental Model

```text
identity → ACL filter → retrieval
```

## When to Use

Mandatory for enterprise multi-user RAG.

## Common Mistake / Interview Trap

Never retrieve unauthorized content then ask model to hide it.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Access Controlled RAG:** Apply document/row/tenant permissions before retrieval/generation.


---

<!-- 180_GRAPH_RAG.md -->

# Graph RAG

## What / Why

Combine graph relationships with retrieval/generation.

## Mental Model

```text
entities/relations → graph traversal + LLM
```

## When to Use

Use relationship-heavy domains.

## Common Mistake / Interview Trap

Graph construction/maintenance can be expensive.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Graph RAG:** Combine graph relationships with retrieval/generation.


---

<!-- 181_AGENTIC_RAG.md -->

# Agentic RAG

## What / Why

Agent decides search/retrieval/tool steps iteratively.

## Mental Model

```text
plan → retrieve → inspect → refine
```

## When to Use

Use complex multi-hop questions.

## Common Mistake / Interview Trap

Latency/cost/loop control matter.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agentic RAG:** Agent decides search/retrieval/tool steps iteratively.


---

<!-- 182_RAG_VS_FINE_TUNING.md -->

# RAG vs Fine Tuning

## What / Why

RAG changes context/knowledge; fine-tuning changes model behavior/weights.

## Mental Model

```text
external knowledge vs learned behavior
```

## When to Use

Use together when needed.

## Common Mistake / Interview Trap

Fine-tuning is poor fit for frequently changing facts.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG vs Fine Tuning:** RAG changes context/knowledge; fine-tuning changes model behavior/weights.


---

<!-- 183_PROMPT_ANATOMY.md -->

# Prompt Anatomy

## What / Why

Instruction + context + input + constraints + output format + examples.

## Mental Model

```text
clear sections
```

## When to Use

Use explicit structure.

## Common Mistake / Interview Trap

Long prompts can conflict internally.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt Anatomy:** Instruction + context + input + constraints + output format + examples.


---

<!-- 184_ROLE_PROMPTING.md -->

# Role Prompting

## What / Why

Assign relevant operating role/persona.

## Mental Model

```text
You are a ...
```

## When to Use

Use style/task framing.

## Common Mistake / Interview Trap

Role alone does not create missing expertise/data.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Role Prompting:** Assign relevant operating role/persona.


---

<!-- 185_DELIMITERS.md -->

# Delimiters

## What / Why

Separate instructions, data and examples clearly.

## Mental Model

```text
XML/Markdown delimiters
```

## When to Use

Use to reduce ambiguity.

## Common Mistake / Interview Trap

Untrusted content may contain prompt injection.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Delimiters:** Separate instructions, data and examples clearly.


---

<!-- 186_FEW_SHOT_EXAMPLES.md -->

# Few Shot Examples

## What / Why

Show high-quality representative demonstrations.

## Mental Model

```text
example pairs
```

## When to Use

Use difficult formatting/classification.

## Common Mistake / Interview Trap

Poor examples teach poor behavior.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Few Shot Examples:** Show high-quality representative demonstrations.


---

<!-- 187_NEGATIVE_CONSTRAINTS.md -->

# Negative Constraints

## What / Why

Specify prohibited behavior carefully.

## Mental Model

```text
do not X
```

## When to Use

Use with positive desired behavior.

## Common Mistake / Interview Trap

Only negative instructions can be brittle.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Negative Constraints:** Specify prohibited behavior carefully.


---

<!-- 188_OUTPUT_SCHEMA.md -->

# Output Schema

## What / Why

Require structured fields/types.

## Mental Model

```text
JSON schema
```

## When to Use

Use downstream parsing.

## Common Mistake / Interview Trap

Validate both syntax and semantics.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Output Schema:** Require structured fields/types.


---

<!-- 189_DECOMPOSITION.md -->

# Decomposition

## What / Why

Break complex task into explicit subproblems.

## Mental Model

```text
plan → solve → verify
```

## When to Use

Use complex reasoning/workflows.

## Common Mistake / Interview Trap

Do not over-decompose simple tasks.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Decomposition:** Break complex task into explicit subproblems.


---

<!-- 190_SELF_CHECK.md -->

# Self Check

## What / Why

Ask model to verify against criteria/evidence.

## Mental Model

```text
draft → check → revise
```

## When to Use

Use quality improvement.

## Common Mistake / Interview Trap

Model self-critique is not independent ground truth.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Self Check:** Ask model to verify against criteria/evidence.


---

<!-- 191_PROMPT_INJECTION.md -->

# Prompt Injection

## What / Why

Untrusted content attempts to override instructions or induce unsafe tool use.

## Mental Model

```text
data contains malicious instruction
```

## When to Use

Treat external content as data, not authority.

## Common Mistake / Interview Trap

Prompt filtering alone is insufficient.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt Injection:** Untrusted content attempts to override instructions or induce unsafe tool use.


---

<!-- 192_SYSTEM_PROMPT_LEAKAGE.md -->

# System Prompt Leakage

## What / Why

Model may reveal or infer hidden instructions.

## Mental Model

```text
attack → prompt disclosure attempt
```

## When to Use

Minimize secrets/instruction sensitivity.

## Common Mistake / Interview Trap

Never put credentials/secrets in prompts.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **System Prompt Leakage:** Model may reveal or infer hidden instructions.


---

<!-- 193_JAILBREAK_RESISTANCE.md -->

# Jailbreak Resistance

## What / Why

Layer policy, tool controls, classifiers/guardrails and monitoring.

## Mental Model

```text
input → policy layers → model/tool
```

## When to Use

Use defense in depth.

## Common Mistake / Interview Trap

No single prompt is a complete safety boundary.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Jailbreak Resistance:** Layer policy, tool controls, classifiers/guardrails and monitoring.


---

<!-- 194_PROMPT_VERSIONING.md -->

# Prompt Versioning

## What / Why

Store prompts as versioned artifacts with tests.

## Mental Model

```text
prompt v17 → eval suite
```

## When to Use

Use production changes.

## Common Mistake / Interview Trap

Prompt edits are code changes.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt Versioning:** Store prompts as versioned artifacts with tests.


---

<!-- 195_PROMPT_EVALUATION.md -->

# Prompt Evaluation

## What / Why

Compare prompt versions over fixed datasets.

## Mental Model

```text
prompt A/B → metrics
```

## When to Use

Use CI/evaluation gates.

## Common Mistake / Interview Trap

Anecdotal manual testing is not enough.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt Evaluation:** Compare prompt versions over fixed datasets.


---

<!-- 196_FINE_TUNING.md -->

# Fine Tuning

## What / Why

Continue training a pretrained model on task/domain examples.

## Mental Model

```text
base model + dataset → tuned model
```

## When to Use

Use behavior/style/task specialization.

## Common Mistake / Interview Trap

Not the first choice for changing factual knowledge.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Fine Tuning:** Continue training a pretrained model on task/domain examples.


---

<!-- 197_SUPERVISED_FINE_TUNING.md -->

# Supervised Fine Tuning

## What / Why

Train on prompt/desired-response examples.

## Mental Model

```text
input → target response
```

## When to Use

Use consistent format/behavior.

## Common Mistake / Interview Trap

Dataset quality dominates.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Supervised Fine Tuning:** Train on prompt/desired-response examples.


---

<!-- 198_INSTRUCTION_TUNING.md -->

# Instruction Tuning

## What / Why

Fine-tune on diverse instruction-response tasks.

## Mental Model

```text
many tasks → general instruction following
```

## When to Use

Used in foundation model alignment.

## Common Mistake / Interview Trap

Requires broad high-quality data.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Instruction Tuning:** Fine-tune on diverse instruction-response tasks.


---

<!-- 199_LORA.md -->

# LoRA

## What / Why

Low-rank adapters train small matrices instead of all weights.

## Mental Model

```text
W + BA
```

## When to Use

Use efficient fine-tuning.

## Common Mistake / Interview Trap

Adapter compatibility/versioning matters.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **LoRA:** Low-rank adapters train small matrices instead of all weights.


---

<!-- 200_QLORA.md -->

# QLoRA

## What / Why

Fine-tune low-rank adapters on quantized base model.

## Mental Model

```text
quantized base + LoRA
```

## When to Use

Use memory-efficient tuning.

## Common Mistake / Interview Trap

Training/inference precision trade-offs.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **QLoRA:** Fine-tune low-rank adapters on quantized base model.


---

<!-- 201_PEFT.md -->

# PEFT

## What / Why

Parameter-efficient fine-tuning family.

## Mental Model

```text
LoRA/adapters/prefix etc.
```

## When to Use

Use when full fine-tune is expensive.

## Common Mistake / Interview Trap

Technique selection depends on task/model.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **PEFT:** Parameter-efficient fine-tuning family.


---

<!-- 202_DPO.md -->

# DPO

## What / Why

Preference optimization from chosen vs rejected responses.

## Mental Model

```text
preferred > rejected
```

## When to Use

Use alignment without full RL loop.

## Common Mistake / Interview Trap

Preference data quality/bias matters.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **DPO:** Preference optimization from chosen vs rejected responses.


---

<!-- 203_RLHF.md -->

# RLHF

## What / Why

Use human preference/reward modeling + RL-style optimization.

## Mental Model

```text
human prefs → reward → policy optimization
```

## When to Use

Know alignment pipeline.

## Common Mistake / Interview Trap

Complex and expensive; not usually application-level tuning.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RLHF:** Use human preference/reward modeling + RL-style optimization.


---

<!-- 204_SYNTHETIC_DATA.md -->

# Synthetic Data

## What / Why

Generate training examples using models/simulators.

## Mental Model

```text
seed → generate → filter
```

## When to Use

Use data expansion/rare cases.

## Common Mistake / Interview Trap

Can amplify model errors and reduce diversity.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Synthetic Data:** Generate training examples using models/simulators.


---

<!-- 205_DATA_CURATION.md -->

# Data Curation

## What / Why

Deduplicate/filter/label/balance training examples.

## Mental Model

```text
raw → curated
```

## When to Use

Most important tuning step.

## Common Mistake / Interview Trap

More low-quality data can hurt.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Data Curation:** Deduplicate/filter/label/balance training examples.


---

<!-- 206_FINE_TUNE_EVALUATION.md -->

# Fine Tune Evaluation

## What / Why

Compare base vs tuned on held-out representative tasks.

## Mental Model

```text
base/tuned → eval suite
```

## When to Use

Use regression checks.

## Common Mistake / Interview Trap

Check capability loss and safety regressions.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Fine Tune Evaluation:** Compare base vs tuned on held-out representative tasks.


---

<!-- 207_CATASTROPHIC_FORGETTING.md -->

# Catastrophic Forgetting

## What / Why

Fine-tuning can degrade prior capabilities.

## Mental Model

```text
specialize → lose general skill
```

## When to Use

Use conservative training/mixed data.

## Common Mistake / Interview Trap

Evaluate broad regressions.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Catastrophic Forgetting:** Fine-tuning can degrade prior capabilities.


---

<!-- 208_MODEL_MERGE_ADAPTERS.md -->

# Model Merge Adapters

## What / Why

Combine or switch specialized adapters/models.

## Mental Model

```text
base + adapters
```

## When to Use

Use multi-domain deployment carefully.

## Common Mistake / Interview Trap

Interactions between adapters can be unstable.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Merge Adapters:** Combine or switch specialized adapters/models.


---

<!-- 209_AGENT_MENTAL_MODEL.md -->

# Agent Mental Model

## What / Why

An agent uses a model plus tools, state/context, control loop and policies to pursue a goal.

## Mental Model

```text
Goal → Think/Plan → Tool → Observe → Continue/Stop
```

## When to Use

Use when task requires multi-step decisions/actions.

## Common Mistake / Interview Trap

Do not use an agent when deterministic workflow is enough.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Mental Model:** An agent uses a model plus tools, state/context, control loop and policies to pursue a goal.


---

<!-- 210_AGENT_VS_WORKFLOW.md -->

# Agent vs Workflow

## What / Why

Workflow has predefined control flow; agent chooses next action dynamically.

## Mental Model

```text
deterministic DAG vs model-directed loop
```

## When to Use

Use workflow for predictable business processes, agent for ambiguity.

## Common Mistake / Interview Trap

Agentic freedom increases risk/cost.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent vs Workflow:** Workflow has predefined control flow; agent chooses next action dynamically.


---

<!-- 211_TOOL_USE.md -->

# Tool Use

## What / Why

Agent invokes typed external capabilities.

## Mental Model

```text
model → tool → result
```

## When to Use

Use current data/actions.

## Common Mistake / Interview Trap

Tool layer must authenticate/authorize independently.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Tool Use:** Agent invokes typed external capabilities.


---

<!-- 212_AGENT_LOOP.md -->

# Agent Loop

## What / Why

Repeatedly decide, act, observe until complete or stopped.

## Mental Model

```text
plan → act → observe → loop
```

## When to Use

Use bounded iteration.

## Common Mistake / Interview Trap

Always enforce max steps/time/cost.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Loop:** Repeatedly decide, act, observe until complete or stopped.


---

<!-- 213_PLANNING.md -->

# Planning

## What / Why

Agent decomposes goal into steps.

## Mental Model

```text
goal → plan
```

## When to Use

Use complex tasks.

## Common Mistake / Interview Trap

Plans can be wrong; re-plan from evidence.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Planning:** Agent decomposes goal into steps.


---

<!-- 214_REFLECTION.md -->

# Reflection

## What / Why

Agent critiques/revises prior attempt.

## Mental Model

```text
attempt → evaluate → revise
```

## When to Use

Use selectively for hard tasks.

## Common Mistake / Interview Trap

Can waste tokens without independent signals.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Reflection:** Agent critiques/revises prior attempt.


---

<!-- 215_MEMORY.md -->

# Memory

## What / Why

Stores information beyond immediate prompt/context.

## Mental Model

```text
short-term / long-term / episodic
```

## When to Use

Use only needed user/task knowledge.

## Common Mistake / Interview Trap

Memory raises privacy, staleness and poisoning risks.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Memory:** Stores information beyond immediate prompt/context.


---

<!-- 216_SHORT_TERM_MEMORY.md -->

# Short Term Memory

## What / Why

Conversation/session/task state.

## Mental Model

```text
messages/scratch summary
```

## When to Use

Use current workflow.

## Common Mistake / Interview Trap

Context window is not durable memory.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Short Term Memory:** Conversation/session/task state.


---

<!-- 217_LONG_TERM_MEMORY.md -->

# Long Term Memory

## What / Why

Persist facts/preferences/history externally.

## Mental Model

```text
DB/vector/knowledge store
```

## When to Use

Use with explicit governance.

## Common Mistake / Interview Trap

Retrieved memory may be wrong/outdated.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Long Term Memory:** Persist facts/preferences/history externally.


---

<!-- 218_TOOL_REGISTRY.md -->

# Tool Registry

## What / Why

Catalog of available tool schemas/capabilities.

## Mental Model

```text
agent → relevant tools
```

## When to Use

Use many-tool systems.

## Common Mistake / Interview Trap

Loading all tools can increase context/cost/confusion.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Tool Registry:** Catalog of available tool schemas/capabilities.


---

<!-- 219_TOOL_SEARCH.md -->

# Tool Search

## What / Why

Dynamically load relevant tool definitions.

## Mental Model

```text
query/task → tool discovery
```

## When to Use

Useful for large tool ecosystems.

## Common Mistake / Interview Trap

Tool discovery itself needs security boundaries.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Tool Search:** Dynamically load relevant tool definitions.


---

<!-- 220_MCP_CONCEPT.md -->

# MCP Concept

## What / Why

Model Context Protocol-style tool/resource integration provides standardized connector interfaces.

## Mental Model

```text
model client ↔ MCP server ↔ tools/resources
```

## When to Use

Use interoperable tool ecosystems.

## Common Mistake / Interview Trap

Trust and permissions remain application responsibility.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **MCP Concept:** Model Context Protocol-style tool/resource integration provides standardized connector interfaces.


---

<!-- 221_AGENT_HANDOFF.md -->

# Agent Handoff

## What / Why

One agent delegates/transfers to specialized agent.

## Mental Model

```text
triage → specialist
```

## When to Use

Use clear specialization.

## Common Mistake / Interview Trap

Handoffs create context and ownership complexity.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Handoff:** One agent delegates/transfers to specialized agent.


---

<!-- 222_MULTI_AGENT.md -->

# Multi Agent

## What / Why

Multiple agents collaborate or parallelize subproblems.

## Mental Model

```text
coordinator ↔ subagents
```

## When to Use

Use when decomposition has real independence/specialization.

## Common Mistake / Interview Trap

More agents do not automatically improve quality.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Multi Agent:** Multiple agents collaborate or parallelize subproblems.


---

<!-- 223_SUPERVISOR_PATTERN.md -->

# Supervisor Pattern

## What / Why

Coordinator assigns tasks and combines results.

## Mental Model

```text
supervisor → workers → synthesis
```

## When to Use

Use multi-agent orchestration.

## Common Mistake / Interview Trap

Supervisor can become bottleneck/single point of error.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Supervisor Pattern:** Coordinator assigns tasks and combines results.


---

<!-- 224_SWARM_PATTERN.md -->

# Swarm Pattern

## What / Why

Peers coordinate through decentralized handoffs/messages.

## Mental Model

```text
agents ↔ agents
```

## When to Use

Use experimental/loosely coupled collaboration.

## Common Mistake / Interview Trap

Harder to debug/govern.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Swarm Pattern:** Peers coordinate through decentralized handoffs/messages.


---

<!-- 225_SANDBOX.md -->

# Sandbox

## What / Why

Isolated environment for code/files/browser/tool execution.

## Mental Model

```text
agent → sandbox
```

## When to Use

Use risky/untrusted execution.

## Common Mistake / Interview Trap

Sandbox does not remove data exfiltration risk.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Sandbox:** Isolated environment for code/files/browser/tool execution.


---

<!-- 226_COMPUTER_USE.md -->

# Computer Use

## What / Why

Agent operates GUI/browser/computer tools.

## Mental Model

```text
observe screen → click/type → observe
```

## When to Use

Use legacy UI workflows.

## Common Mistake / Interview Trap

High risk; require approval boundaries and monitoring.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Computer Use:** Agent operates GUI/browser/computer tools.


---

<!-- 227_HUMAN_IN_THE_LOOP.md -->

# Human in the Loop

## What / Why

Require human approval/review at defined points.

## Mental Model

```text
agent → approval → action
```

## When to Use

Use high-impact actions.

## Common Mistake / Interview Trap

Human review must see enough evidence/context.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Human in the Loop:** Require human approval/review at defined points.


---

<!-- 228_APPROVAL_GATES.md -->

# Approval Gates

## What / Why

Policy blocks sensitive tool execution until approved.

## Mental Model

```text
payment/delete/deploy → approve
```

## When to Use

Use financial, destructive, external communication actions.

## Common Mistake / Interview Trap

Do not rely on model self-classification alone.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Approval Gates:** Policy blocks sensitive tool execution until approved.


---

<!-- 229_AGENT_TERMINATION.md -->

# Agent Termination

## What / Why

Define completion, stop, escalation and loop limits.

## Mental Model

```text
success/fail/max steps
```

## When to Use

Mandatory.

## Common Mistake / Interview Trap

Unbounded loops waste cost and may act repeatedly.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Termination:** Define completion, stop, escalation and loop limits.


---

<!-- 230_AGENT_OBSERVABILITY.md -->

# Agent Observability

## What / Why

Trace model calls, tools, latency, decisions, errors and cost.

## Mental Model

```text
trace → spans/events
```

## When to Use

Use every production agent.

## Common Mistake / Interview Trap

Logs must avoid secrets/sensitive chain-of-thought.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Observability:** Trace model calls, tools, latency, decisions, errors and cost.


---

<!-- 231_AGENT_EVALUATION.md -->

# Agent Evaluation

## What / Why

Test task success, tool correctness, safety, latency and cost.

## Mental Model

```text
scenario suite → agent runs
```

## When to Use

Use regression gates.

## Common Mistake / Interview Trap

LLM judge alone is not enough.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Evaluation:** Test task success, tool correctness, safety, latency and cost.


---

<!-- 232_AGENT_RELIABILITY.md -->

# Agent Reliability

## What / Why

Use retries/idempotency/checkpoints/compensation for actions.

## Mental Model

```text
state machine + durable execution
```

## When to Use

Use long-running agents.

## Common Mistake / Interview Trap

Agent reasoning cannot substitute for transaction semantics.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Reliability:** Use retries/idempotency/checkpoints/compensation for actions.


---

<!-- 233_AGENT_SECURITY.md -->

# Agent Security

## What / Why

Apply least privilege, tool allowlists, sandboxing, auth, approval and data boundaries.

## Mental Model

```text
identity → policy → tools
```

## When to Use

Mandatory.

## Common Mistake / Interview Trap

Prompt instructions are not authorization.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Security:** Apply least privilege, tool allowlists, sandboxing, auth, approval and data boundaries.


---

<!-- 234_LONG_RUNNING_AGENT.md -->

# Long Running Agent

## What / Why

Persists context/checkpoints across long tasks and environments.

## Mental Model

```text
session → checkpoints → resume
```

## When to Use

Use research/coding/ops tasks lasting many turns.

## Common Mistake / Interview Trap

Need cancellation, budgets and durable state.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Long Running Agent:** Persists context/checkpoints across long tasks and environments.


---

<!-- 235_REACT_PATTERN.md -->

# ReAct Pattern

## What / Why

Interleave reasoning decisions and actions/observations.

## Mental Model

```text
reason → act → observe
```

## When to Use

Use tool-using tasks.

## Common Mistake / Interview Trap

Loop needs limits and robust tool errors.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **ReAct Pattern:** Interleave reasoning decisions and actions/observations.


---

<!-- 236_PLAN_EXECUTE_PATTERN.md -->

# Plan Execute Pattern

## What / Why

Create plan then execute steps.

## Mental Model

```text
plan → step1→step2
```

## When to Use

Use complex but decomposable tasks.

## Common Mistake / Interview Trap

Static plan can become stale.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Plan Execute Pattern:** Create plan then execute steps.


---

<!-- 237_PLANNER_EXECUTOR.md -->

# Planner Executor

## What / Why

Separate planning model/agent from execution agent.

## Mental Model

```text
planner → executor
```

## When to Use

Use role specialization.

## Common Mistake / Interview Trap

Adds latency and coordination.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Planner Executor:** Separate planning model/agent from execution agent.


---

<!-- 238_ROUTER_AGENT.md -->

# Router Agent

## What / Why

Classifies task and sends to specialist/tool/workflow.

## Mental Model

```text
input → router → specialist
```

## When to Use

Use heterogeneous tasks.

## Common Mistake / Interview Trap

Routing errors need fallback.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Router Agent:** Classifies task and sends to specialist/tool/workflow.


---

<!-- 239_PARALLEL_FAN_OUT.md -->

# Parallel Fan Out

## What / Why

Delegate independent subtasks concurrently.

## Mental Model

```text
coordinator → A/B/C → merge
```

## When to Use

Use research/comparison.

## Common Mistake / Interview Trap

Merge conflicts/evidence quality matter.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Parallel Fan Out:** Delegate independent subtasks concurrently.


---

<!-- 240_MAP_REDUCE_AGENT.md -->

# Map Reduce Agent

## What / Why

Map subproblems/documents then reduce summaries/results.

## Mental Model

```text
map workers → reducer
```

## When to Use

Use large corpus tasks.

## Common Mistake / Interview Trap

Reducer may lose important details.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Map Reduce Agent:** Map subproblems/documents then reduce summaries/results.


---

<!-- 241_CRITIC_REVIEWER.md -->

# Critic Reviewer

## What / Why

Worker produces result; critic checks criteria.

## Mental Model

```text
draft → critic → revise
```

## When to Use

Use quality gates.

## Common Mistake / Interview Trap

Critic can share same blind spots.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Critic Reviewer:** Worker produces result; critic checks criteria.


---

<!-- 242_DEBATE_PATTERN.md -->

# Debate Pattern

## What / Why

Multiple agents propose/critique alternatives.

## Mental Model

```text
A↔B → judge
```

## When to Use

Use ambiguous reasoning experiments.

## Common Mistake / Interview Trap

Expensive and not reliably superior.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Debate Pattern:** Multiple agents propose/critique alternatives.


---

<!-- 243_TOOLFORMER_PATTERN_CONCEPT.md -->

# Toolformer Pattern Concept

## What / Why

Model learns/selects when external tools improve output.

## Mental Model

```text
text ↔ tool calls
```

## When to Use

Know tool-augmented model concept.

## Common Mistake / Interview Trap

Application agent tool use is often prompt/policy-driven, not trained Toolformer.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Toolformer Pattern Concept:** Model learns/selects when external tools improve output.


---

<!-- 244_DETERMINISTIC_OUTER_LOOP.md -->

# Deterministic Outer Loop

## What / Why

Application controls workflow while model handles bounded decisions/content.

## Mental Model

```text
code state machine → LLM nodes
```

## When to Use

Strong enterprise default.

## Common Mistake / Interview Trap

Prefer over fully autonomous loop for critical processes.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Deterministic Outer Loop:** Application controls workflow while model handles bounded decisions/content.


---

<!-- 245_DURABLE_AGENT_WORKFLOW.md -->

# Durable Agent Workflow

## What / Why

Persist step state/checkpoints between model/tool calls.

## Mental Model

```text
workflow engine + agent nodes
```

## When to Use

Use long-running/retriable operations.

## Common Mistake / Interview Trap

Exactly-once business effects require idempotency.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Durable Agent Workflow:** Persist step state/checkpoints between model/tool calls.


---

<!-- 246_EVENT_DRIVEN_AGENT.md -->

# Event Driven Agent

## What / Why

Events trigger agents/workflows.

## Mental Model

```text
event → agent task
```

## When to Use

Use monitoring/support/ops.

## Common Mistake / Interview Trap

Prevent duplicate event effects.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Event Driven Agent:** Events trigger agents/workflows.


---

<!-- 247_SCHEDULED_AGENT.md -->

# Scheduled Agent

## What / Why

Time-based trigger runs agent workflow.

## Mental Model

```text
schedule → task
```

## When to Use

Use reports/checks.

## Common Mistake / Interview Trap

Make repeated actions idempotent.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Scheduled Agent:** Time-based trigger runs agent workflow.


---

<!-- 248_MULTI_TENANT_AGENT.md -->

# Multi Tenant Agent

## What / Why

Isolate prompts, memory, tools and data per tenant.

## Mental Model

```text
tenant identity → isolated context/tools
```

## When to Use

Use SaaS.

## Common Mistake / Interview Trap

Cross-tenant leakage is critical risk.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Multi Tenant Agent:** Isolate prompts, memory, tools and data per tenant.


---

<!-- 249_LLM_EVALUATION.md -->

# LLM Evaluation

## What / Why

Measure model/app behavior over representative tasks.

## Mental Model

```text
dataset → model/app → metrics
```

## When to Use

Use continuous regression testing.

## Common Mistake / Interview Trap

One benchmark score is not production quality.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **LLM Evaluation:** Measure model/app behavior over representative tasks.


---

<!-- 250_COMPARISON_MATRIX.md -->

# AI High-Value Comparison Matrix

## RAG vs Fine-Tuning

| RAG | Fine-Tuning |
|---|---|
| external/current knowledge | learned behavior |
| no weight change | weight/adaptor change |
| citations possible | no source citation by default |
| update index/data | retrain/tune |
| good for changing facts | good for style/task specialization |

## Agent vs Workflow

| Agent | Workflow |
|---|---|
| model chooses next action | predefined control flow |
| flexible | predictable |
| higher risk/cost | easier governance |
| ambiguous tasks | repeatable processes |

## Signal Types

| Embedding | LLM Generation |
|---|---|
| vector | tokens/content |
| similarity/retrieval | reasoning/generation |
| cheap per item | costlier inference |

## Prompting vs RAG vs Fine-Tune

| Prompt | RAG | Fine-Tune |
|---|---|---|
| instruction/context | external knowledge | learned behavior |
| immediate | needs index | needs training |
| limited by context | fresh data | stable specialization |

## Classical ML vs LLM

| Classical ML | LLM |
|---|---|
| structured prediction | language/general reasoning |
| lower cost | higher capability |
| easier interpretability | richer unstructured tasks |
| task-specific | general foundation model |

## Vector Search vs Keyword Search

| Vector | Keyword |
|---|---|
| semantic | lexical |
| paraphrases | exact terms |
| embeddings | inverted index |
| best combined often | best combined often |


---

<!-- 250_GOLDEN_DATASET.md -->

# Golden Dataset

## What / Why

Curated examples with expected behavior/criteria.

## Mental Model

```text
cases + labels/rubrics
```

## When to Use

Use CI regression.

## Common Mistake / Interview Trap

Keep representative and versioned.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Golden Dataset:** Curated examples with expected behavior/criteria.


---

<!-- 251_HUMAN_EVALUATION.md -->

# Human Evaluation

## What / Why

People judge quality/safety/usefulness.

## Mental Model

```text
rubric → reviewers
```

## When to Use

Use nuanced/high-stakes tasks.

## Common Mistake / Interview Trap

Inter-rater consistency matters.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Human Evaluation:** People judge quality/safety/usefulness.


---

<!-- 251_INTERVIEW_TRAPS.md -->

# AI Interview Traps

1. AI is broader than ML.
2. Deep Learning is a subset of ML.
3. GenAI is not synonymous with LLM.
4. Training and inference are different.
5. Accuracy is often wrong for imbalanced classification.
6. Correlation is not causation.
7. More parameters do not guarantee better task performance.
8. Temperature 0 does not guarantee truth.
9. Large context windows are not durable memory.
10. Attention is not automatically explanation.
11. Embeddings are not generated text.
12. Vector DB is not a source-of-truth database by default.
13. RAG does not update model weights.
14. Fine-tuning is not the right way to keep changing facts current.
15. CQ: RAG and fine-tuning can be combined.
16. Hybrid retrieval often beats vector-only enterprise search.
17. Chunking is part of model quality.
18. Citation presence does not guarantee citation correctness.
19. Agent != chatbot.
20. Agent != deterministic workflow.
21. More agents do not automatically improve results.
22. Tool schema validation does not equal authorization.
23. Prompt instructions are not a security boundary.
24. Prompt injection cannot be solved only with better prompting.
25. Retrieved documents are untrusted input.
26. Guardrails have false positives and false negatives.
27. Human-in-the-loop needs exact action/evidence review.
28. LLM-as-judge needs calibration.
29. One benchmark score does not equal production quality.
30. Offline eval gain may not improve business KPIs.
31. Model drift and data drift are different.
32. Server/client cost includes retrieval/tools/retries, not only tokens.
33. Small models can be better for simple/high-volume tasks.
34. Model routing requires per-route evaluation.
35. Open-source model hosting has real operations cost.
36. RAG failures are often retrieval failures, not model failures.
37. Agent looping requires deterministic stop/budget controls.
38. Long-running agents need durable checkpoints and idempotent actions.
39. AWS Bedrock Agents Classic is not the current recommended new-agent direction in 2026; AgentCore is.
40. Provider model names and previews change quickly; architecture by capability.


---

<!-- 252_LLM_AS_JUDGE.md -->

# LLM as Judge

## What / Why

Use a model to score outputs against rubric.

## Mental Model

```text
candidate + rubric → judge
```

## When to Use

Use scalable evaluation with calibration.

## Common Mistake / Interview Trap

Judge bias/self-preference must be checked.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **LLM as Judge:** Use a model to score outputs against rubric.


---

<!-- 252_TROUBLESHOOTING_MATRIX.md -->

# AI Troubleshooting Matrix

| Symptom | First Check | Likely Cause |
|---|---|---|
| Hallucination | evidence/tool trace | no grounding / bad context |
| RAG no answer | retrieval recall | chunk/embed/filter/query |
| Wrong citation | claim-context mapping | noisy/duplicate context |
| Agent loops | trace/stop condition | vague goal/tool failure |
| Wrong tool | tool schema/descriptions | ambiguity/router issue |
| Unsafe action | policy executor | missing auth/approval |
| High cost | token/tool trace | huge context/loops/model |
| High latency | span timings | model/tools/retries |
| Context overflow | context budget | too much history/evidence |
| Poor classifier recall | threshold/imbalance | wrong metric/training |
| Model overfits | train vs val | leakage/capacity/data |
| Training diverges | loss/gradients/LR | optimizer/data/numerics |
| GPU OOM | memory profile | batch/context/model size |
| Drift | input/perf distribution | changed production data |
| Prompt regression | eval suite | prompt/model change |
| Retrieval stale | ingestion freshness | sync/index pipeline |
| Cross-tenant leak | ACL/filter/audit | authorization failure |

## Debug Flow

```text
Reproduce
→ identify AI layer
→ inspect trace
→ data/evidence
→ model/prompt
→ retrieval/tools
→ policy
→ latency/cost
→ eval regression
→ fix
→ rerun eval suite
```


---

<!-- 253_ONE_PAGE_RECALL.md -->

# AI — One-Page Recall

## Traditional AI / ML

```text
Data
→ Features
→ Train
→ Validate/Test
→ Register
→ Deploy
→ Monitor
```

## Generative AI

```text
Prompt + Context
      ↓
Foundation Model
      ↓
Generated Output
      ↓
Validate / Guardrail
```

## RAG

```text
Documents → Chunk → Embed → Index
                         ↑
Query → Rewrite → Retrieve → Rerank
                         ↓
                     Context
                         ↓
                       LLM
                         ↓
                 Answer + Citations
```

## Agent

```text
Goal
 ↓
Agent Harness
 ├── Context/Memory
 ├── Model
 ├── Tools
 ├── Policies
 ├── Sandbox
 ├── Checkpoints
 └── Human Approval
 ↓
Outcome
```

## Production

```text
Evals
Security
Guardrails
Observability
Cost
Latency
Governance
Business KPI
```


---

<!-- 253_PAIRWISE_EVALUATION.md -->

# Pairwise Evaluation

## What / Why

Judge which of two outputs is better.

## Mental Model

```text
A vs B
```

## When to Use

Use model/prompt comparisons.

## Common Mistake / Interview Trap

Ordering bias exists.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Pairwise Evaluation:** Judge which of two outputs is better.


---

<!-- 254_PRODUCTION_CHECKLIST.md -->

# AI Production Readiness Checklist

## Business
- [ ] measurable use case
- [ ] owner
- [ ] success KPI
- [ ] acceptable failure behavior

## Data
- [ ] source authority
- [ ] privacy/classification
- [ ] lineage
- [ ] freshness
- [ ] access controls

## Model
- [ ] benchmark on own workload
- [ ] fallback/routing
- [ ] version pinned where possible
- [ ] latency/cost measured

## RAG
- [ ] chunking evaluated
- [ ] hybrid retrieval considered
- [ ] reranking evaluated
- [ ] ACL before retrieval
- [ ] citations validated
- [ ] freshness SLA

## Agents
- [ ] tool allowlist
- [ ] least privilege
- [ ] deterministic authorization
- [ ] step/time/cost limits
- [ ] durable checkpoints
- [ ] idempotent actions
- [ ] human approval for high impact

## Safety/Security
- [ ] prompt-injection tests
- [ ] DLP/PII controls
- [ ] output validation
- [ ] sandbox/egress controls
- [ ] audit trail

## Operations
- [ ] traces
- [ ] eval dashboard
- [ ] token/cost metrics
- [ ] SLOs
- [ ] rollback
- [ ] model/prompt/index/tool versions recorded


---

<!-- 254_TASK_SUCCESS_METRIC.md -->

# Task Success Metric

## What / Why

Whether user/business goal was achieved.

## Mental Model

```text
success/fail/partial
```

## When to Use

Core agent metric.

## Common Mistake / Interview Trap

Proxy text quality may not equal success.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Task Success Metric:** Whether user/business goal was achieved.


---

<!-- 255_FAITHFULNESS_EVALUATION.md -->

# Faithfulness Evaluation

## What / Why

Check claims against source evidence.

## Mental Model

```text
claims ↔ evidence
```

## When to Use

Core RAG metric.

## Common Mistake / Interview Trap

Use claim-level checks where possible.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Faithfulness Evaluation:** Check claims against source evidence.


---

<!-- 255_PRACTICE_QUESTIONS.md -->

# AI Practice Questions

1. AI vs ML vs Deep Learning?
2. Supervised vs unsupervised vs self-supervised?
3. Bias vs variance?
4. Overfitting vs underfitting?
5. What is data leakage?
6. Precision vs recall?
7. ROC AUC vs PR AUC?
8. Calibration?
9. Gradient descent?
10. Backpropagation?
11. AdamW?
12. CNN vs Vision Transformer?
13. What is attention?
14. Q/K/V?
15. Why positional encoding?
16. What is a context window?
17. What is KV cache?
18. Temperature vs top-p?
19. What is hallucination?
20. What is a foundation model?
21. Embedding vs LLM?
22. Cosine similarity?
23. ANN/HNSW?
24. Hybrid search?
25. What is reranking?
26. Explain complete RAG pipeline.
27. Chunk size trade-off?
28. RAG vs fine-tuning?
29. What is faithfulness?
30. What is agentic RAG?
31. What is tool calling?
32. What is prompt injection?
33. What is context engineering?
34. What is LoRA?
35. QLoRA?
36. DPO vs RLHF?
37. Agent vs workflow?
38. What is ReAct?
39. Planner-executor?
40. Why multi-agent?
41. Human-in-the-loop?
42. How do you secure agent tools?
43. MCP concept?
44. What is LLM-as-judge?
45. Why golden datasets?
46. What is red teaming?
47. Data drift vs concept drift?
48. What is LLMOps?
49. Model gateway?
50. How would you design enterprise AI architecture?


---

<!-- 256_GROUNDEDNESS.md -->

# Groundedness

## What / Why

Measures dependence on supplied authoritative context.

## Mental Model

```text
answer supported by context
```

## When to Use

Use enterprise QA.

## Common Mistake / Interview Trap

Grounded but incomplete can still be poor.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Groundedness:** Measures dependence on supplied authoritative context.


---

<!-- 256_SOURCES_AND_ACCURACY.md -->

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


---

<!-- 257_TOXICITY_SAFETY_EVAL.md -->

# Toxicity Safety Eval

## What / Why

Measure harmful/abusive output rates.

## Mental Model

```text
red-team dataset
```

## When to Use

Use safety regression.

## Common Mistake / Interview Trap

Taxonomy must match application.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Toxicity Safety Eval:** Measure harmful/abusive output rates.


---

<!-- 258_PROMPT_INJECTION_EVAL.md -->

# Prompt Injection Eval

## What / Why

Test malicious instructions embedded in content/tools.

## Mental Model

```text
attack corpus
```

## When to Use

Mandatory for RAG/agents.

## Common Mistake / Interview Trap

Need tool/data exfiltration scenarios, not just textual jailbreaks.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt Injection Eval:** Test malicious instructions embedded in content/tools.


---

<!-- 259_RED_TEAMING.md -->

# Red Teaming

## What / Why

Adversarially probe safety/security/reliability.

## Mental Model

```text
attack scenarios → findings
```

## When to Use

Use pre-launch and continuously.

## Common Mistake / Interview Trap

Automated red teaming complements humans.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Red Teaming:** Adversarially probe safety/security/reliability.


---

<!-- 260_GUARDRAILS.md -->

# Guardrails

## What / Why

Input/output/tool policies constrain unsafe or noncompliant behavior.

## Mental Model

```text
input → policies → model/tools → output policies
```

## When to Use

Use layered safeguards.

## Common Mistake / Interview Trap

Guardrails can have false positives/negatives.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Guardrails:** Input/output/tool policies constrain unsafe or noncompliant behavior.


---

<!-- 261_INPUT_GUARDRAIL.md -->

# Input Guardrail

## What / Why

Validate/filter user/context before model/tool use.

## Mental Model

```text
classify/PII/injection/schema
```

## When to Use

Use early.

## Common Mistake / Interview Trap

Do not destroy legitimate user intent.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Input Guardrail:** Validate/filter user/context before model/tool use.


---

<!-- 262_OUTPUT_GUARDRAIL.md -->

# Output Guardrail

## What / Why

Validate generated output before delivery/action.

## Mental Model

```text
schema/safety/factuality
```

## When to Use

Use high-risk domains.

## Common Mistake / Interview Trap

Post-filtering cannot undo already executed unsafe tool action.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Output Guardrail:** Validate generated output before delivery/action.


---

<!-- 263_TOOL_GUARDRAIL.md -->

# Tool Guardrail

## What / Why

Authorize tool/arguments/action separately.

## Mental Model

```text
model request → policy → tool
```

## When to Use

Critical for agents.

## Common Mistake / Interview Trap

Never let model choose its own permission.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Tool Guardrail:** Authorize tool/arguments/action separately.


---

<!-- 264_PII_DETECTION.md -->

# PII Detection

## What / Why

Identify sensitive personal data.

## Mental Model

```text
input/output → detector
```

## When to Use

Use privacy controls.

## Common Mistake / Interview Trap

Detection is imperfect; minimize data collection too.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **PII Detection:** Identify sensitive personal data.


---

<!-- 265_DATA_LOSS_PREVENTION.md -->

# Data Loss Prevention

## What / Why

Prevent sensitive data from entering/exiting model/tool boundaries.

## Mental Model

```text
DLP policy
```

## When to Use

Use enterprise AI.

## Common Mistake / Interview Trap

Need logging/redaction governance.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Data Loss Prevention:** Prevent sensitive data from entering/exiting model/tool boundaries.


---

<!-- 266_POLICY_AS_CODE.md -->

# Policy as Code

## What / Why

Represent AI action/data rules in deterministic policy layer.

## Mental Model

```text
request → policy engine
```

## When to Use

Use auditable enterprise systems.

## Common Mistake / Interview Trap

Do not bury compliance solely in prompt text.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Policy as Code:** Represent AI action/data rules in deterministic policy layer.


---

<!-- 267_MODEL_RISK_MANAGEMENT.md -->

# Model Risk Management

## What / Why

Inventory use case/model/data, validate, monitor, govern changes.

## Mental Model

```text
risk tier → controls
```

## When to Use

Use regulated/high-impact deployments.

## Common Mistake / Interview Trap

Model risk is application-specific.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Risk Management:** Inventory use case/model/data, validate, monitor, govern changes.


---

<!-- 268_RESPONSIBLE_AI.md -->

# Responsible AI

## What / Why

Design fairness, transparency, accountability, privacy, safety and human oversight.

## Mental Model

```text
principles → lifecycle controls
```

## When to Use

Use entire AI lifecycle.

## Common Mistake / Interview Trap

Principles need measurable implementation.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Responsible AI:** Design fairness, transparency, accountability, privacy, safety and human oversight.


---

<!-- 269_MLOPS_MENTAL_MODEL.md -->

# MLOps Mental Model

## What / Why

Operationalize data, training, models, deployment, monitoring and governance.

## Mental Model

```text
data → train → registry → deploy → monitor → retrain
```

## When to Use

Use production ML.

## Common Mistake / Interview Trap

Notebook success is not production.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **MLOps Mental Model:** Operationalize data, training, models, deployment, monitoring and governance.


---

<!-- 270_EXPERIMENT_TRACKING.md -->

# Experiment Tracking

## What / Why

Record code/data/hyperparameters/metrics/artifacts.

## Mental Model

```text
run → metadata
```

## When to Use

Use reproducibility.

## Common Mistake / Interview Trap

Untracked experiments cannot be audited.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Experiment Tracking:** Record code/data/hyperparameters/metrics/artifacts.


---

<!-- 271_DATA_VERSIONING.md -->

# Data Versioning

## What / Why

Version datasets/features/schemas.

## Mental Model

```text
data v1/v2
```

## When to Use

Use reproducibility/governance.

## Common Mistake / Interview Trap

Model version without data version is incomplete.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Data Versioning:** Version datasets/features/schemas.


---

<!-- 272_MODEL_REGISTRY.md -->

# Model Registry

## What / Why

Store approved model artifacts and metadata.

## Mental Model

```text
candidate → staging → prod
```

## When to Use

Use controlled promotion.

## Common Mistake / Interview Trap

Registry entry should include evaluation lineage.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Registry:** Store approved model artifacts and metadata.


---

<!-- 273_FEATURE_STORE.md -->

# Feature Store

## What / Why

Centralize reusable feature definitions/serving.

## Mental Model

```text
offline/online features
```

## When to Use

Use repeated production ML features.

## Common Mistake / Interview Trap

Adds complexity; not needed for every system.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Feature Store:** Centralize reusable feature definitions/serving.


---

<!-- 274_TRAINING_PIPELINE.md -->

# Training Pipeline

## What / Why

Automate data prep/train/evaluate/register.

## Mental Model

```text
pipeline DAG
```

## When to Use

Use repeatable ML.

## Common Mistake / Interview Trap

Keep deterministic seeds/environment where possible.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Training Pipeline:** Automate data prep/train/evaluate/register.


---

<!-- 275_MODEL_SERVING.md -->

# Model Serving

## What / Why

Expose model via batch/online/stream endpoint.

## Mental Model

```text
request → inference server
```

## When to Use

Choose latency/throughput needs.

## Common Mistake / Interview Trap

GPU utilization and queueing dominate cost.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Serving:** Expose model via batch/online/stream endpoint.


---

<!-- 276_BATCH_INFERENCE.md -->

# Batch Inference

## What / Why

Run predictions over dataset periodically.

## Mental Model

```text
data batch → model → outputs
```

## When to Use

Use non-real-time scoring.

## Common Mistake / Interview Trap

Freshness latency trade-off.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Batch Inference:** Run predictions over dataset periodically.


---

<!-- 277_ONLINE_INFERENCE.md -->

# Online Inference

## What / Why

Serve request-time predictions.

## Mental Model

```text
API → model
```

## When to Use

Use interactive systems.

## Common Mistake / Interview Trap

Need autoscaling/latency/error SLOs.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Online Inference:** Serve request-time predictions.


---

<!-- 278_CANARY_MODEL.md -->

# Canary Model

## What / Why

Send small traffic to new model.

## Mental Model

```text
5% → new model
```

## When to Use

Use safe rollout.

## Common Mistake / Interview Trap

Compare model/business metrics.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Canary Model:** Send small traffic to new model.


---

<!-- 279_SHADOW_DEPLOYMENT.md -->

# Shadow Deployment

## What / Why

New model observes live inputs but does not affect user response.

## Mental Model

```text
production traffic → shadow model
```

## When to Use

Use validation.

## Common Mistake / Interview Trap

Handle sensitive data and cost.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Shadow Deployment:** New model observes live inputs but does not affect user response.


---

<!-- 280_A_B_MODEL_DEPLOYMENT.md -->

# A B Model Deployment

## What / Why

Randomly route users to model variants.

## Mental Model

```text
A/B
```

## When to Use

Use business evaluation.

## Common Mistake / Interview Trap

Control confounding.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **A B Model Deployment:** Randomly route users to model variants.


---

<!-- 281_MODEL_MONITORING.md -->

# Model Monitoring

## What / Why

Track latency/errors/resource use and prediction quality.

## Mental Model

```text
metrics + drift
```

## When to Use

Use production ML.

## Common Mistake / Interview Trap

Ground truth may arrive late.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Monitoring:** Track latency/errors/resource use and prediction quality.


---

<!-- 282_DATA_DRIFT.md -->

# Data Drift

## What / Why

Input distribution changes.

## Mental Model

```text
P_train(X) ≠ P_prod(X)
```

## When to Use

Monitor feature distributions.

## Common Mistake / Interview Trap

Drift does not always mean performance drop.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Data Drift:** Input distribution changes.


---

<!-- 283_CONCEPT_DRIFT.md -->

# Concept Drift

## What / Why

Relationship between inputs and target changes.

## Mental Model

```text
P(y|X) changes
```

## When to Use

Use retraining/adaptation.

## Common Mistake / Interview Trap

Harder to detect without labels.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Concept Drift:** Relationship between inputs and target changes.


---

<!-- 284_MODEL_DRIFT.md -->

# Model Drift

## What / Why

Observed model performance degrades over time.

## Mental Model

```text
metric ↓
```

## When to Use

Monitor with real labels/proxies.

## Common Mistake / Interview Trap

Diagnose data vs concept vs operational cause.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Drift:** Observed model performance degrades over time.


---

<!-- 285_LLMOPS.md -->

# LLMOps

## What / Why

Operational practices for prompts/models/RAG/agents/evals/guardrails/cost.

## Mental Model

```text
prompt/model/index/agent versions
```

## When to Use

Use GenAI production.

## Common Mistake / Interview Trap

Traditional MLOps alone misses prompt/retrieval/tool layers.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **LLMOps:** Operational practices for prompts/models/RAG/agents/evals/guardrails/cost.


---

<!-- 286_PROMPT_REGISTRY.md -->

# Prompt Registry

## What / Why

Version prompts, schemas and policies.

## Mental Model

```text
prompt vN
```

## When to Use

Use CI/deploy rollback.

## Common Mistake / Interview Trap

Prompt change can be breaking change.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt Registry:** Version prompts, schemas and policies.


---

<!-- 287_EVALUATION_PIPELINE.md -->

# Evaluation Pipeline

## What / Why

Run automatic/human eval suites before deployment.

## Mental Model

```text
candidate → eval gate
```

## When to Use

Use every model/prompt/RAG change.

## Common Mistake / Interview Trap

Eval set must evolve with failures.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Evaluation Pipeline:** Run automatic/human eval suites before deployment.


---

<!-- 288_TOKEN_COST_MONITORING.md -->

# Token Cost Monitoring

## What / Why

Track input/output/cache/tool costs per feature/user/task.

## Mental Model

```text
cost/request
```

## When to Use

Use budgets and routing.

## Common Mistake / Interview Trap

Optimize business value per cost, not token count alone.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Token Cost Monitoring:** Track input/output/cache/tool costs per feature/user/task.


---

<!-- 289_LATENCY_BUDGET.md -->

# Latency Budget

## What / Why

Allocate total response time across retrieval/model/tools.

## Mental Model

```text
T_total = retrieve + model + tools
```

## When to Use

Use UX SLOs.

## Common Mistake / Interview Trap

Long agent chains multiply tail latency.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Latency Budget:** Allocate total response time across retrieval/model/tools.


---

<!-- 290_CACHING_STRATEGY.md -->

# Caching Strategy

## What / Why

Cache deterministic/common model, embedding, retrieval or prompt prefixes appropriately.

## Mental Model

```text
request → cache layers
```

## When to Use

Use cost/latency optimization.

## Common Mistake / Interview Trap

Avoid caching sensitive/personalized stale answers incorrectly.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Caching Strategy:** Cache deterministic/common model, embedding, retrieval or prompt prefixes appropriately.


---

<!-- 291_OBSERVABILITY.md -->

# Observability

## What / Why

Trace prompts, retrieval, model, tool calls, tokens, errors and outcomes.

## Mental Model

```text
distributed trace
```

## When to Use

Use production LLM apps.

## Common Mistake / Interview Trap

Redact sensitive content.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Observability:** Trace prompts, retrieval, model, tool calls, tokens, errors and outcomes.


---

<!-- 292_AI_THREAT_MODEL.md -->

# AI Threat Model

## What / Why

Identify assets, trust boundaries, attacker goals and model/tool/data risks.

## Mental Model

```text
user/content/model/tools/data
```

## When to Use

Use before deployment.

## Common Mistake / Interview Trap

Treat model as untrusted decision component for security.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI Threat Model:** Identify assets, trust boundaries, attacker goals and model/tool/data risks.


---

<!-- 293_PROMPT_INJECTION_SECURITY.md -->

# Prompt Injection Security

## What / Why

Malicious content alters model behavior/tool decisions.

## Mental Model

```text
untrusted text → model
```

## When to Use

Separate instructions/data, restrict tools, validate actions.

## Common Mistake / Interview Trap

Cannot be solved only by prompt wording.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt Injection Security:** Malicious content alters model behavior/tool decisions.


---

<!-- 294_INDIRECT_PROMPT_INJECTION.md -->

# Indirect Prompt Injection

## What / Why

Injected instructions arrive through retrieved/web/email/document content.

## Mental Model

```text
external data → RAG/agent
```

## When to Use

Critical for agents.

## Common Mistake / Interview Trap

Mark content untrusted and restrict tool consequences.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Indirect Prompt Injection:** Injected instructions arrive through retrieved/web/email/document content.


---

<!-- 295_DATA_EXFILTRATION.md -->

# Data Exfiltration

## What / Why

Agent/model leaks secrets/private data through output/tool/network.

## Mental Model

```text
sensitive context → output
```

## When to Use

Use least data, DLP, egress controls.

## Common Mistake / Interview Trap

Never give unnecessary secrets to model context.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Data Exfiltration:** Agent/model leaks secrets/private data through output/tool/network.


---

<!-- 296_TOOL_ABUSE.md -->

# Tool Abuse

## What / Why

Model calls legitimate tool with dangerous args.

## Mental Model

```text
tool call → delete/pay/send
```

## When to Use

Authorize each action/argument.

## Common Mistake / Interview Trap

Schema validation alone is insufficient.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Tool Abuse:** Model calls legitimate tool with dangerous args.


---

<!-- 297_MODEL_SUPPLY_CHAIN.md -->

# Model Supply Chain

## What / Why

Risks in model weights, packages, datasets, adapters and endpoints.

## Mental Model

```text
artifact provenance
```

## When to Use

Use trusted registries/signatures/scanning.

## Common Mistake / Interview Trap

Third-party models can contain backdoors or licenses.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Supply Chain:** Risks in model weights, packages, datasets, adapters and endpoints.


---

<!-- 298_TRAINING_DATA_POISONING.md -->

# Training Data Poisoning

## What / Why

Adversary corrupts training/fine-tuning data.

## Mental Model

```text
poisoned examples → model behavior
```

## When to Use

Use provenance/filtering/anomaly review.

## Common Mistake / Interview Trap

Small targeted poison can have outsized effect.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Training Data Poisoning:** Adversary corrupts training/fine-tuning data.


---

<!-- 299_RAG_POISONING.md -->

# RAG Poisoning

## What / Why

Malicious document enters knowledge base and influences answers/tools.

## Mental Model

```text
poison doc → retrieval
```

## When to Use

Use source trust, access, signatures, review.

## Common Mistake / Interview Trap

Freshness pipelines can ingest attacks quickly.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG Poisoning:** Malicious document enters knowledge base and influences answers/tools.


---

<!-- 300_MODEL_EXTRACTION.md -->

# Model Extraction

## What / Why

Repeated queries approximate proprietary model behavior.

## Mental Model

```text
API → attacker distillation
```

## When to Use

Use rate limits/monitoring/legal controls.

## Common Mistake / Interview Trap

Hard to fully prevent.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Extraction:** Repeated queries approximate proprietary model behavior.


---

<!-- 301_MEMBERSHIP_INFERENCE.md -->

# Membership Inference

## What / Why

Infer whether a record was in training data.

## Mental Model

```text
query → confidence signal
```

## When to Use

Consider privacy-sensitive training.

## Common Mistake / Interview Trap

Differential privacy and data minimization can help.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Membership Inference:** Infer whether a record was in training data.


---

<!-- 302_ADVERSARIAL_EXAMPLES.md -->

# Adversarial Examples

## What / Why

Small crafted input changes cause wrong predictions.

## Mental Model

```text
x + perturbation
```

## When to Use

Relevant to vision/audio/classifiers.

## Common Mistake / Interview Trap

Robustness differs by domain.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Adversarial Examples:** Small crafted input changes cause wrong predictions.


---

<!-- 303_SANDBOXING.md -->

# Sandboxing

## What / Why

Run generated code/actions in isolated environment.

## Mental Model

```text
agent → sandbox
```

## When to Use

Use code execution.

## Common Mistake / Interview Trap

Limit network/files/secrets/resources.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Sandboxing:** Run generated code/actions in isolated environment.


---

<!-- 304_LEAST_PRIVILEGE.md -->

# Least Privilege

## What / Why

Agent tools receive minimum permissions for task.

## Mental Model

```text
scoped token/tool
```

## When to Use

Mandatory.

## Common Mistake / Interview Trap

Do not give broad admin credentials to an agent.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Least Privilege:** Agent tools receive minimum permissions for task.


---

<!-- 305_CREDENTIAL_ISOLATION.md -->

# Credential Isolation

## What / Why

Keep secrets outside prompt/model output; inject only at tool boundary.

## Mental Model

```text
model requests action → trusted executor uses secret
```

## When to Use

Use all agent systems.

## Common Mistake / Interview Trap

Never expose raw credentials to model.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Credential Isolation:** Keep secrets outside prompt/model output; inject only at tool boundary.


---

<!-- 306_EGRESS_CONTROL.md -->

# Egress Control

## What / Why

Restrict network destinations from agent/sandbox.

## Mental Model

```text
allowlist domains
```

## When to Use

Use high-security agents.

## Common Mistake / Interview Trap

Prevents simple exfil paths.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Egress Control:** Restrict network destinations from agent/sandbox.


---

<!-- 307_AUDIT_TRAIL.md -->

# Audit Trail

## What / Why

Record approved actions, tool calls, data access and outcomes.

## Mental Model

```text
who/what/when/result
```

## When to Use

Use compliance/incident response.

## Common Mistake / Interview Trap

Protect logs from sensitive data leakage.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Audit Trail:** Record approved actions, tool calls, data access and outcomes.


---

<!-- 308_AI_APPLICATION_LAYERING.md -->

# AI Application Layering

## What / Why

Separate UX/orchestration/model/data/tools/policy/observability.

## Mental Model

```text
client → orchestration → model/tools/data
```

## When to Use

Use maintainable systems.

## Common Mistake / Interview Trap

Do not call model directly from every UI component.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI Application Layering:** Separate UX/orchestration/model/data/tools/policy/observability.


---

<!-- 309_MODEL_GATEWAY.md -->

# Model Gateway

## What / Why

Central service abstracts providers/models, policy, telemetry and routing.

## Mental Model

```text
apps → gateway → providers
```

## When to Use

Use multi-model enterprise platforms.

## Common Mistake / Interview Trap

Can become bottleneck; keep contracts clean.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Gateway:** Central service abstracts providers/models, policy, telemetry and routing.


---

<!-- 310_MODEL_ROUTER.md -->

# Model Router

## What / Why

Choose model dynamically by task/risk/cost.

## Mental Model

```text
request → router → model
```

## When to Use

Use workload segmentation.

## Common Mistake / Interview Trap

Requires per-route evals.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Router:** Choose model dynamically by task/risk/cost.


---

<!-- 311_RAG_SERVICE.md -->

# RAG Service

## What / Why

Dedicated retrieval/context service.

## Mental Model

```text
query → retrieval API → evidence
```

## When to Use

Use shared enterprise knowledge access.

## Common Mistake / Interview Trap

Avoid one universal index for unrelated domains.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG Service:** Dedicated retrieval/context service.


---

<!-- 312_AGENT_ORCHESTRATOR.md -->

# Agent Orchestrator

## What / Why

Controls agent lifecycle, tools, checkpoints and policies.

## Mental Model

```text
task → orchestrator → model/tools
```

## When to Use

Use production agents.

## Common Mistake / Interview Trap

Do not put auth solely inside model prompt.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Orchestrator:** Controls agent lifecycle, tools, checkpoints and policies.


---

<!-- 313_HUMAN_APPROVAL_SERVICE.md -->

# Human Approval Service

## What / Why

Deterministic approval workflow outside model.

## Mental Model

```text
agent action → approval service → execute
```

## When to Use

Use high-impact actions.

## Common Mistake / Interview Trap

Approval should bind to exact action payload.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Human Approval Service:** Deterministic approval workflow outside model.


---

<!-- 314_AI_BFF.md -->

# AI BFF

## What / Why

Backend-for-frontend shapes AI streaming/session/tools for UI.

## Mental Model

```text
UI → AI BFF → model stack
```

## When to Use

Use web/mobile apps.

## Common Mistake / Interview Trap

Never expose provider secrets client-side.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI BFF:** Backend-for-frontend shapes AI streaming/session/tools for UI.


---

<!-- 315_STREAMING_RESPONSE.md -->

# Streaming Response

## What / Why

Stream partial tokens/events to improve responsiveness.

## Mental Model

```text
model stream → UI
```

## When to Use

Use chat/long generation.

## Common Mistake / Interview Trap

Need cancel/error/reconnect semantics.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Streaming Response:** Stream partial tokens/events to improve responsiveness.


---

<!-- 316_ASYNC_JOB_PATTERN.md -->

# Async Job Pattern

## What / Why

Queue long AI work and notify/poll later.

## Mental Model

```text
request → queue → worker → result
```

## When to Use

Use long document/video/agent tasks.

## Common Mistake / Interview Trap

Do not hold HTTP request indefinitely.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Async Job Pattern:** Queue long AI work and notify/poll later.


---

<!-- 317_EVENT_DRIVEN_AI.md -->

# Event Driven AI

## What / Why

Events trigger classification/generation/agents.

## Mental Model

```text
event bus → AI worker
```

## When to Use

Use automation.

## Common Mistake / Interview Trap

Idempotency and duplicate events matter.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Event Driven AI:** Events trigger classification/generation/agents.


---

<!-- 318_BATCH_AI_PIPELINE.md -->

# Batch AI Pipeline

## What / Why

Process large datasets offline.

## Mental Model

```text
dataset → batch inference → outputs
```

## When to Use

Use enrichment/classification.

## Common Mistake / Interview Trap

Cost controls and retry checkpoints.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Batch AI Pipeline:** Process large datasets offline.


---

<!-- 319_SEMANTIC_CACHE.md -->

# Semantic Cache

## What / Why

Reuse responses for semantically similar queries.

## Mental Model

```text
query embedding → cache lookup
```

## When to Use

Use repetitive low-risk Q&A.

## Common Mistake / Interview Trap

Wrong semantic match can return incorrect answer.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Semantic Cache:** Reuse responses for semantically similar queries.


---

<!-- 320_RESPONSE_CACHE.md -->

# Response Cache

## What / Why

Cache exact deterministic responses.

## Mental Model

```text
key(prompt/model/version)
```

## When to Use

Use stable tasks.

## Common Mistake / Interview Trap

Include model/prompt/context version in key.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Response Cache:** Cache exact deterministic responses.


---

<!-- 321_EMBEDDING_SERVICE.md -->

# Embedding Service

## What / Why

Centralize embedding generation/versioning.

## Mental Model

```text
text → embedding API
```

## When to Use

Use shared search/RAG platform.

## Common Mistake / Interview Trap

Embedding model change affects all indexes.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Embedding Service:** Centralize embedding generation/versioning.


---

<!-- 322_EVALUATION_GATEWAY.md -->

# Evaluation Gateway

## What / Why

Mirror/sample requests into evaluation/quality pipeline.

## Mental Model

```text
prod samples → eval
```

## When to Use

Use continuous quality monitoring.

## Common Mistake / Interview Trap

Protect user privacy.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Evaluation Gateway:** Mirror/sample requests into evaluation/quality pipeline.


---

<!-- 323_MULTI_REGION_AI.md -->

# Multi Region AI

## What / Why

Route across regions/providers for resilience/data residency.

## Mental Model

```text
region router → regional stack
```

## When to Use

Use global/regulated apps.

## Common Mistake / Interview Trap

Model availability and data residency differ.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Multi Region AI:** Route across regions/providers for resilience/data residency.


---

<!-- 324_PROVIDER_ABSTRACTION.md -->

# Provider Abstraction

## What / Why

Wrap vendor API behind capability-based interface.

## Mental Model

```text
generate/embed/tool/cost
```

## When to Use

Use portability/selective fallback.

## Common Mistake / Interview Trap

Lowest-common-denominator abstraction can hide useful features.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Provider Abstraction:** Wrap vendor API behind capability-based interface.


---

<!-- 325_BYOM_MODEL_ENDPOINT.md -->

# BYOM Model Endpoint

## What / Why

Bring self-hosted/open model behind common gateway.

## Mental Model

```text
gateway → hosted OSS model
```

## When to Use

Use control/privacy/cost needs.

## Common Mistake / Interview Trap

Operating model infrastructure is nontrivial.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **BYOM Model Endpoint:** Bring self-hosted/open model behind common gateway.


---

<!-- 326_AZURE_AI_FOUNDRY_CONCEPT.md -->

# Azure AI Foundry Concept

## What / Why

Microsoft cloud platform for building, evaluating, governing and deploying AI/agent solutions.

## Mental Model

```text
Azure AI platform → models/agents/evals
```

## When to Use

Use Azure enterprise ecosystems.

## Common Mistake / Interview Trap

Service names evolve; verify current Foundry/agent APIs.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Azure AI Foundry Concept:** Microsoft cloud platform for building, evaluating, governing and deploying AI/agent solutions.


---

<!-- 327_AZURE_OPENAI_CONCEPT.md -->

# Azure OpenAI Concept

## What / Why

Managed Azure access to supported OpenAI model families with Azure controls.

## Mental Model

```text
app → Azure endpoint
```

## When to Use

Use Azure identity/network/compliance requirements.

## Common Mistake / Interview Trap

Model availability/version differs from OpenAI direct.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Azure OpenAI Concept:** Managed Azure access to supported OpenAI model families with Azure controls.


---

<!-- 328_AWS_BEDROCK_CONCEPT.md -->

# AWS Bedrock Concept

## What / Why

AWS managed foundation-model platform with model access, Knowledge Bases, Guardrails and agent tooling.

## Mental Model

```text
app → Bedrock
```

## When to Use

Use AWS-native GenAI.

## Common Mistake / Interview Trap

Know current AgentCore vs Agents Classic status.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AWS Bedrock Concept:** AWS managed foundation-model platform with model access, Knowledge Bases, Guardrails and agent tooling.


---

<!-- 329_AWS_BEDROCK_KNOWLEDGE_BASES.md -->

# AWS Bedrock Knowledge Bases

## What / Why

Managed RAG capability around data sources, embeddings/vector stores and retrieve/generate.

## Mental Model

```text
data → KB → retrieval
```

## When to Use

Use AWS-managed RAG.

## Common Mistake / Interview Trap

Still evaluate chunking/retrieval/access control.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AWS Bedrock Knowledge Bases:** Managed RAG capability around data sources, embeddings/vector stores and retrieve/generate.


---

<!-- 330_AWS_BEDROCK_GUARDRAILS.md -->

# AWS Bedrock Guardrails

## What / Why

Configurable policies evaluate model inputs/outputs for safety/privacy controls.

## Mental Model

```text
input/output → guardrail
```

## When to Use

Use across supported Bedrock flows.

## Common Mistake / Interview Trap

Guardrails require continued testing.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AWS Bedrock Guardrails:** Configurable policies evaluate model inputs/outputs for safety/privacy controls.


---

<!-- 331_AWS_AGENTCORE.md -->

# AWS AgentCore

## What / Why

AWS platform direction for building/connect/operate AI agents.

## Mental Model

```text
agent runtime/tools/memory/identity/observability
```

## When to Use

Use new AWS agent workloads.

## Common Mistake / Interview Trap

Do not start new designs on Agents Classic.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AWS AgentCore:** AWS platform direction for building/connect/operate AI agents.


---

<!-- 332_GOOGLE_VERTEX_AI_CONCEPT.md -->

# Google Vertex AI Concept

## What / Why

Google Cloud platform for models, data, tuning, RAG, agents and MLOps.

## Mental Model

```text
GCP → Vertex AI
```

## When to Use

Use GCP ecosystem.

## Common Mistake / Interview Trap

Exact Gemini/Vertex APIs vary by model/version.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Google Vertex AI Concept:** Google Cloud platform for models, data, tuning, RAG, agents and MLOps.


---

<!-- 333_GEMINI_API_CONCEPT.md -->

# Gemini API Concept

## What / Why

Google developer API for Gemini multimodal models, tools and caching.

## Mental Model

```text
app → Gemini API
```

## When to Use

Use Google model ecosystem.

## Common Mistake / Interview Trap

Stable vs preview model names change often.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Gemini API Concept:** Google developer API for Gemini multimodal models, tools and caching.


---

<!-- 334_OPENAI_RESPONSES_API.md -->

# OpenAI Responses API

## What / Why

General OpenAI API primitive for model responses and built-in tool use.

## Mental Model

```text
request → model/tools → response
```

## When to Use

Use direct OpenAI agent/tool applications.

## Common Mistake / Interview Trap

Check current migration guidance for older APIs.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **OpenAI Responses API:** General OpenAI API primitive for model responses and built-in tool use.


---

<!-- 335_OPENAI_AGENTS_SDK.md -->

# OpenAI Agents SDK

## What / Why

Open-source orchestration SDK for agents, tools, handoffs, guardrails and tracing.

## Mental Model

```text
agent → runner/tools/handoffs
```

## When to Use

Use application-managed agent orchestration.

## Common Mistake / Interview Trap

Distinguish SDK from hosted Agents API.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **OpenAI Agents SDK:** Open-source orchestration SDK for agents, tools, handoffs, guardrails and tracing.


---

<!-- 336_OPENAI_AGENTS_API.md -->

# OpenAI Agents API

## What / Why

Hosted long-running agent harness with tools, environments, context management and multi-agent support.

## Mental Model

```text
task → hosted agent session
```

## When to Use

Use long-running managed agents where suitable.

## Common Mistake / Interview Trap

Public beta features may evolve.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **OpenAI Agents API:** Hosted long-running agent harness with tools, environments, context management and multi-agent support.


---

<!-- 337_ANTHROPIC_API_CONCEPT.md -->

# Anthropic API Concept

## What / Why

Claude APIs provide model generation/tool-use capabilities.

## Mental Model

```text
app → Claude
```

## When to Use

Use Anthropic ecosystem.

## Common Mistake / Interview Trap

Check model/tool/version details at implementation time.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Anthropic API Concept:** Claude APIs provide model generation/tool-use capabilities.


---

<!-- 338_HUGGING_FACE_ECOSYSTEM.md -->

# Hugging Face Ecosystem

## What / Why

Hub + Transformers/Datasets/PEFT/Inference ecosystem for open models.

## Mental Model

```text
models/datasets/libs
```

## When to Use

Use open-source experimentation/deployment.

## Common Mistake / Interview Trap

Model license/security vary.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Hugging Face Ecosystem:** Hub + Transformers/Datasets/PEFT/Inference ecosystem for open models.


---

<!-- 339_AI_USE_CASE_SELECTION.md -->

# AI Use Case Selection

## What / Why

Choose problems with measurable value, available data, acceptable risk and feasible workflow integration.

## Mental Model

```text
value × feasibility × risk
```

## When to Use

Use portfolio prioritization.

## Common Mistake / Interview Trap

Do not start from model hype.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI Use Case Selection:** Choose problems with measurable value, available data, acceptable risk and feasible workflow integration.


---

<!-- 340_AUTOMATION_VS_AUGMENTATION.md -->

# Automation vs Augmentation

## What / Why

Automation replaces steps; augmentation assists human decisions/work.

## Mental Model

```text
AI acts vs AI assists
```

## When to Use

Choose based on risk and task ambiguity.

## Common Mistake / Interview Trap

High-stakes ambiguity often favors augmentation.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Automation vs Augmentation:** Automation replaces steps; augmentation assists human decisions/work.


---

<!-- 341_BUSINESS_KPI.md -->

# Business KPI

## What / Why

Tie AI metrics to business outcome.

## Mental Model

```text
quality → time saved / revenue / defects
```

## When to Use

Use decision-ready reporting.

## Common Mistake / Interview Trap

Token accuracy alone is not ROI.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Business KPI:** Tie AI metrics to business outcome.


---

<!-- 342_AI_ROI.md -->

# AI ROI

## What / Why

Compare benefit against build, inference, data, review and operations cost.

## Mental Model

```text
benefit - total cost
```

## When to Use

Use production business cases.

## Common Mistake / Interview Trap

Ignore human review/maintenance at your peril.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI ROI:** Compare benefit against build, inference, data, review and operations cost.


---

<!-- 343_BUILD_VS_BUY.md -->

# Build vs Buy

## What / Why

Compare vendor capability, differentiation, data/privacy, cost and speed.

## Mental Model

```text
managed API vs self-host
```

## When to Use

Use architecture decision.

## Common Mistake / Interview Trap

Open-source is not automatically cheaper.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Build vs Buy:** Compare vendor capability, differentiation, data/privacy, cost and speed.


---

<!-- 344_MODEL_SELECTION_MATRIX.md -->

# Model Selection Matrix

## What / Why

Evaluate quality, latency, cost, context, modality, tool support, residency and safety.

## Mental Model

```text
requirements → model scorecard
```

## When to Use

Use multi-model evaluation.

## Common Mistake / Interview Trap

Leaderboard rank is not workload performance.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Selection Matrix:** Evaluate quality, latency, cost, context, modality, tool support, residency and safety.


---

<!-- 345_HUMAN_WORKFLOW_DESIGN.md -->

# Human Workflow Design

## What / Why

Redesign process around AI, not just insert chatbot.

## Mental Model

```text
current flow → AI-assisted flow
```

## When to Use

Use productivity projects.

## Common Mistake / Interview Trap

Poor workflow integration kills adoption.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Human Workflow Design:** Redesign process around AI, not just insert chatbot.


---

<!-- 346_ADOPTION_METRICS.md -->

# Adoption Metrics

## What / Why

Track usage, completion, override, satisfaction and time saved.

## Mental Model

```text
product telemetry
```

## When to Use

Use rollout management.

## Common Mistake / Interview Trap

High usage can still mean low quality.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Adoption Metrics:** Track usage, completion, override, satisfaction and time saved.


---

<!-- 347_CHANGE_MANAGEMENT.md -->

# Change Management

## What / Why

Train users, set expectations, support new workflows and governance.

## Mental Model

```text
people + process + tech
```

## When to Use

Use enterprise AI.

## Common Mistake / Interview Trap

Model deployment alone does not create value.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Change Management:** Train users, set expectations, support new workflows and governance.


---

<!-- 348_AI_GOVERNANCE.md -->

# AI Governance

## What / Why

Define ownership, inventory, risk tiers, approvals, data/model policies and monitoring.

## Mental Model

```text
governance lifecycle
```

## When to Use

Use organization-wide AI.

## Common Mistake / Interview Trap

Governance must enable safe delivery, not only paperwork.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI Governance:** Define ownership, inventory, risk tiers, approvals, data/model policies and monitoring.


---

<!-- 349_AI_VS_ML_INTERVIEW.md -->

# AI vs ML Interview

## What / Why

AI umbrella; ML learns from data; DL neural ML; GenAI generates content.

## Mental Model

```text
hierarchy
```

## When to Use

Use concise definitions.

## Common Mistake / Interview Trap

Avoid buzzword soup.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **AI vs ML Interview:** AI umbrella; ML learns from data; DL neural ML; GenAI generates content.


---

<!-- 350_RAG_VS_FINE_TUNE_INTERVIEW.md -->

# RAG vs Fine Tune Interview

## What / Why

RAG injects external knowledge at inference; fine-tuning modifies learned behavior/weights.

## Mental Model

```text
knowledge vs behavior
```

## When to Use

Use decision matrix.

## Common Mistake / Interview Trap

They can be complementary.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG vs Fine Tune Interview:** RAG injects external knowledge at inference; fine-tuning modifies learned behavior/weights.


---

<!-- 351_AGENT_VS_WORKFLOW_INTERVIEW.md -->

# Agent vs Workflow Interview

## What / Why

Agent dynamically chooses actions; workflow follows predefined control.

## Mental Model

```text
dynamic vs deterministic
```

## When to Use

Use risk/complexity framing.

## Common Mistake / Interview Trap

Do not make everything agentic.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent vs Workflow Interview:** Agent dynamically chooses actions; workflow follows predefined control.


---

<!-- 352_EMBEDDING_VS_LLM.md -->

# Embedding vs LLM

## What / Why

Embedding model maps content to vectors; LLM generates/reasons over tokens.

## Mental Model

```text
vectorization vs generation
```

## When to Use

Use RAG architecture.

## Common Mistake / Interview Trap

An LLM endpoint is not automatically a good embedding endpoint.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Embedding vs LLM:** Embedding model maps content to vectors; LLM generates/reasons over tokens.


---

<!-- 353_PROMPT_VS_CONTEXT.md -->

# Prompt vs Context

## What / Why

Prompt is instructions/input; context is total information available to model.

## Mental Model

```text
instructions subset of context
```

## When to Use

Use context engineering.

## Common Mistake / Interview Trap

Huge context can reduce relevance.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Prompt vs Context:** Prompt is instructions/input; context is total information available to model.


---

<!-- 354_HALLUCINATION_TROUBLESHOOTING.md -->

# Hallucination Troubleshooting

## What / Why

Check missing evidence, retrieval quality, ambiguity, stale data, prompt/model behavior.

## Mental Model

```text
error → classify cause
```

## When to Use

Use RAG/eval traces.

## Common Mistake / Interview Trap

Temperature=0 does not eliminate hallucination.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Hallucination Troubleshooting:** Check missing evidence, retrieval quality, ambiguity, stale data, prompt/model behavior.


---

<!-- 355_RAG_NO_ANSWER.md -->

# RAG No Answer

## What / Why

Check query rewrite, chunking, embedding, filters, topK, reranker, source ingestion.

## Mental Model

```text
query → retrieval trace
```

## When to Use

Use retrieval metrics.

## Common Mistake / Interview Trap

Changing LLM won't fix missing evidence.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG No Answer:** Check query rewrite, chunking, embedding, filters, topK, reranker, source ingestion.


---

<!-- 356_RAG_WRONG_CITATION.md -->

# RAG Wrong Citation

## What / Why

Inspect context ordering, source IDs, claim-citation mapping and duplicated chunks.

## Mental Model

```text
answer ↔ evidence
```

## When to Use

Use claim-level evaluation.

## Common Mistake / Interview Trap

Citation syntax alone is not correctness.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **RAG Wrong Citation:** Inspect context ordering, source IDs, claim-citation mapping and duplicated chunks.


---

<!-- 357_AGENT_LOOPING.md -->

# Agent Looping

## What / Why

Check stop conditions, repeated tool errors, vague goal, stale observation.

## Mental Model

```text
trace → repeated state
```

## When to Use

Add bounded steps, tool error handling, explicit completion.

## Common Mistake / Interview Trap

Never allow unbounded loops.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Looping:** Check stop conditions, repeated tool errors, vague goal, stale observation.


---

<!-- 358_AGENT_WRONG_TOOL.md -->

# Agent Wrong Tool

## What / Why

Check tool descriptions/schema/search/routing and similar tool ambiguity.

## Mental Model

```text
decision trace
```

## When to Use

Improve tool taxonomy and evals.

## Common Mistake / Interview Trap

Model cleverness cannot fix indistinguishable tools.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Wrong Tool:** Check tool descriptions/schema/search/routing and similar tool ambiguity.


---

<!-- 359_AGENT_UNSAFE_ACTION.md -->

# Agent Unsafe Action

## What / Why

Check auth/policy/approval/argument validation at executor.

## Mental Model

```text
model request → policy
```

## When to Use

Block deterministically.

## Common Mistake / Interview Trap

Do not patch only system prompt.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Agent Unsafe Action:** Check auth/policy/approval/argument validation at executor.


---

<!-- 360_HIGH_LLM_COST.md -->

# High LLM Cost

## What / Why

Inspect prompt length, repeated context, model size, retrieval K, tool loops, cache hit.

## Mental Model

```text
cost trace
```

## When to Use

Route models, cache, compress context, bound loops.

## Common Mistake / Interview Trap

Do not optimize token cost at expense of business quality.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **High LLM Cost:** Inspect prompt length, repeated context, model size, retrieval K, tool loops, cache hit.


---

<!-- 361_HIGH_LATENCY.md -->

# High Latency

## What / Why

Break down retrieval/model/tool/queue/network timings.

## Mental Model

```text
latency trace
```

## When to Use

Parallelize, cache, route, stream.

## Common Mistake / Interview Trap

Tail latency often comes from tools/retries.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **High Latency:** Break down retrieval/model/tool/queue/network timings.


---

<!-- 362_CONTEXT_OVERFLOW.md -->

# Context Overflow

## What / Why

Summarize/prune/retrieve selectively; avoid full history dumps.

## Mental Model

```text
context budget
```

## When to Use

Use memory/context management.

## Common Mistake / Interview Trap

Large context windows are finite and costly.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Context Overflow:** Summarize/prune/retrieve selectively; avoid full history dumps.


---

<!-- 363_EVALUATION_DRIFT.md -->

# Evaluation Drift

## What / Why

Production failures differ from benchmark.

## Mental Model

```text
prod samples → update eval set
```

## When to Use

Continuously expand golden set.

## Common Mistake / Interview Trap

Static eval suites become stale.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Evaluation Drift:** Production failures differ from benchmark.


---

<!-- 364_DATA_DRIFT_TROUBLESHOOTING.md -->

# Data Drift Troubleshooting

## What / Why

Compare feature/input distributions and downstream performance.

## Mental Model

```text
train vs prod
```

## When to Use

Use monitoring/root cause.

## Common Mistake / Interview Trap

Drift can be harmless.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Data Drift Troubleshooting:** Compare feature/input distributions and downstream performance.


---

<!-- 365_MODEL_REGRESSION.md -->

# Model Regression

## What / Why

Compare model/prompt/index/tool versions using fixed evals.

## Mental Model

```text
version diff → metrics
```

## When to Use

Use rollback gates.

## Common Mistake / Interview Trap

Vendor model alias changes can affect behavior.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Model Regression:** Compare model/prompt/index/tool versions using fixed evals.


---

<!-- 366_GPU_OOM.md -->

# GPU OOM

## What / Why

Reduce batch/context/model size, quantize, checkpoint, shard.

## Mental Model

```text
memory budget
```

## When to Use

Use profiling.

## Common Mistake / Interview Trap

More GPU is not always first fix.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **GPU OOM:** Reduce batch/context/model size, quantize, checkpoint, shard.


---

<!-- 367_TRAINING_DIVERGENCE.md -->

# Training Divergence

## What / Why

Check LR, data, loss, precision, gradients, initialization.

## Mental Model

```text
loss NaN/explode
```

## When to Use

Use logging and gradient checks.

## Common Mistake / Interview Trap

Bad data can look like optimizer problem.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Training Divergence:** Check LR, data, loss, precision, gradients, initialization.


---

<!-- 368_INTERVIEW_TRAPS.md -->

# Interview Traps

## What / Why

High-value misconceptions across AI/ML/GenAI/RAG/agents.

## Mental Model

```text
final recall
```

## When to Use

Use last-minute prep.

## Common Mistake / Interview Trap

See dedicated traps sheet.

## Production Questions

```text
What business problem does this solve?
What data/evidence is required?
What is the evaluation metric?
What happens when it is wrong?
What are latency and cost limits?
What security/privacy controls apply?
How is this monitored and versioned?
```

## 20-Second Recall

> **Interview Traps:** High-value misconceptions across AI/ML/GenAI/RAG/agents.
