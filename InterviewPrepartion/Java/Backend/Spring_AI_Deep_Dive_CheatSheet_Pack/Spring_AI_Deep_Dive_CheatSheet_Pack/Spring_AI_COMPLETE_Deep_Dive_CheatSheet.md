# Spring AI — Complete Deep-Dive Cheat Sheet


---

<!-- 005_SPRING_AI_MENTAL_MODEL.md -->

# Spring AI Mental Model

## What / Why
Spring AI provides portable Spring-style abstractions for models, prompts, tools, vector stores, RAG, memory, evaluation and observability.

## Mental Model
```text
Spring AI Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI Mental Model:** Spring AI provides portable Spring-style abstractions for models, prompts, tools, vector stores, RAG, memory, evaluation and observability.


---

<!-- 006_SPRING_AI_2_0_ARCHITECTURE.md -->

# Spring AI 2.0 Architecture

## What / Why
2.0.x is the current major line, with 2.0.1 as the latest release baseline.

## Mental Model
```text
Spring AI 2.0 Architecture → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI 2.0 Architecture:** 2.0.x is the current major line, with 2.0.1 as the latest release baseline.


---

<!-- 007_MODEL_ABSTRACTION.md -->

# Model Abstraction

## What / Why
Provider-neutral model interfaces hide common provider differences while preserving access to provider-specific options.

## Mental Model
```text
Model Abstraction → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Model Abstraction:** Provider-neutral model interfaces hide common provider differences while preserving access to provider-specific options.


---

<!-- 008_PROVIDER_ADAPTER.md -->

# Provider Adapter

## What / Why
Each provider integration maps Spring AI model abstractions to native provider APIs.

## Mental Model
```text
Provider Adapter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Provider Adapter:** Each provider integration maps Spring AI model abstractions to native provider APIs.


---

<!-- 009_PORTABLE_CORE_VS_PROVIDER_FEATURES.md -->

# Portable Core vs Provider Features

## What / Why
Use portable abstractions for common behavior and drop down to provider-specific options only when needed.

## Mental Model
```text
Portable Core vs Provider Features → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Portable Core vs Provider Features:** Use portable abstractions for common behavior and drop down to provider-specific options only when needed.


---

<!-- 00_MASTER_INDEX.md -->

# Spring AI — Dedicated Deep-Dive Cheat Sheet Pack

**Current stable baseline:** Spring AI 2.0.1 (released August 21, 2026).

**Scope:** Model API, ChatModel, ChatClient, prompt templates, structured output, Advisors, tool calling, MCP, memory, embeddings, vector stores, modular RAG, ETL, evaluation, observability, multimodality, provider adapters, resilience, security, testing, architecture and troubleshooting.

## Fast Revision
- `01_30_SECOND_RECALL.md`
- `02_CURRENT_BASELINE.md`
- `03_REFERENCE_ARCHITECTURE.md`
- `04_AI_DECISION_TREE.md`

## Foundations & Architecture

- Spring AI Mental Model — `005_SPRING_AI_MENTAL_MODEL.md`
- Spring AI 2.0 Architecture — `006_SPRING_AI_2_0_ARCHITECTURE.md`
- Model Abstraction — `007_MODEL_ABSTRACTION.md`
- Provider Adapter — `008_PROVIDER_ADAPTER.md`
- Portable Core vs Provider Features — `009_PORTABLE_CORE_VS_PROVIDER_FEATURES.md`
- Auto Configuration — `010_AUTO_CONFIGURATION.md`
- Starter Modules — `011_STARTER_MODULES.md`
- BOM — `012_BOM.md`
- Sync vs Streaming — `013_SYNC_VS_STREAMING.md`
- Production Architecture — `014_PRODUCTION_ARCHITECTURE.md`
- AI Boundary — `015_AI_BOUNDARY.md`

## Model API

- Model Interface — `016_MODEL_INTERFACE.md`
- ModelRequest — `017_MODELREQUEST.md`
- ModelResponse — `018_MODELRESPONSE.md`
- ChatModel — `019_CHATMODEL.md`
- StreamingChatModel — `020_STREAMINGCHATMODEL.md`
- EmbeddingModel — `021_EMBEDDINGMODEL.md`
- ImageModel — `022_IMAGEMODEL.md`
- Audio Transcription Model — `023_AUDIO_TRANSCRIPTION_MODEL.md`
- Audio Speech Model — `024_AUDIO_SPEECH_MODEL.md`
- Moderation Model — `025_MODERATION_MODEL.md`
- Model Options — `026_MODEL_OPTIONS.md`
- Startup Options — `027_STARTUP_OPTIONS.md`
- Runtime Options — `028_RUNTIME_OPTIONS.md`
- Provider Native Options — `029_PROVIDER_NATIVE_OPTIONS.md`
- Model Capability Matrix — `030_MODEL_CAPABILITY_MATRIX.md`

## ChatModel

- ChatModel Flow — `031_CHATMODEL_FLOW.md`
- Prompt — `032_PROMPT.md`
- ChatResponse — `033_CHATRESPONSE.md`
- Generation — `034_GENERATION.md`
- AssistantMessage — `035_ASSISTANTMESSAGE.md`
- UserMessage — `036_USERMESSAGE.md`
- SystemMessage — `037_SYSTEMMESSAGE.md`
- ToolResponseMessage — `038_TOOLRESPONSEMESSAGE.md`
- Media — `039_MEDIA.md`
- Chat Options — `040_CHAT_OPTIONS.md`
- Temperature — `041_TEMPERATURE.md`
- Max Tokens — `042_MAX_TOKENS.md`
- Stop Sequences — `043_STOP_SEQUENCES.md`
- Top P — `044_TOP_P.md`
- Reasoning Content — `045_REASONING_CONTENT.md`
- Usage Metadata — `046_USAGE_METADATA.md`

## ChatClient

- ChatClient Mental Model — `047_CHATCLIENT_MENTAL_MODEL.md`
- ChatClient Builder — `048_CHATCLIENT_BUILDER.md`
- ChatClient create — `049_CHATCLIENT_CREATE.md`
- defaultSystem — `050_DEFAULTSYSTEM.md`
- defaultUser — `051_DEFAULTUSER.md`
- defaultOptions — `052_DEFAULTOPTIONS.md`
- defaultAdvisors — `053_DEFAULTADVISORS.md`
- defaultTools — `054_DEFAULTTOOLS.md`
- prompt — `055_PROMPT.md`
- system — `056_SYSTEM.md`
- user — `057_USER.md`
- options — `058_OPTIONS.md`
- advisors — `059_ADVISORS.md`
- tools — `060_TOOLS.md`
- call — `061_CALL.md`
- stream — `062_STREAM.md`
- content — `063_CONTENT.md`
- chatResponse — `064_CHATRESPONSE.md`
- entity — `065_ENTITY.md`
- responseEntity — `066_RESPONSEENTITY.md`
- mutate — `067_MUTATE.md`
- TemplateRenderer — `068_TEMPLATERENDERER.md`
- ChatClient Advisor Order — `069_CHATCLIENT_ADVISOR_ORDER.md`
- Conversation ID Param — `070_CONVERSATION_ID_PARAM.md`

## Prompt Engineering

- Prompt Engineering in Spring AI — `071_PROMPT_ENGINEERING_IN_SPRING_AI.md`
- PromptTemplate — `072_PROMPTTEMPLATE.md`
- SystemPromptTemplate — `073_SYSTEMPROMPTTEMPLATE.md`
- User Prompt Template — `074_USER_PROMPT_TEMPLATE.md`
- Template Variables — `075_TEMPLATE_VARIABLES.md`
- StringTemplate Renderer — `076_STRINGTEMPLATE_RENDERER.md`
- Custom Template Renderer — `077_CUSTOM_TEMPLATE_RENDERER.md`
- Prompt Resource — `078_PROMPT_RESOURCE.md`
- Prompt Versioning — `079_PROMPT_VERSIONING.md`
- Prompt Injection Boundary — `080_PROMPT_INJECTION_BOUNDARY.md`
- Prompt Composition — `081_PROMPT_COMPOSITION.md`
- Prompt Regression — `082_PROMPT_REGRESSION.md`

## Structured Output

- Structured Output Mental Model — `083_STRUCTURED_OUTPUT_MENTAL_MODEL.md`
- entity Class — `084_ENTITY_CLASS.md`
- Parameterized Type Reference — `085_PARAMETERIZED_TYPE_REFERENCE.md`
- BeanOutputConverter — `086_BEANOUTPUTCONVERTER.md`
- ListOutputConverter — `087_LISTOUTPUTCONVERTER.md`
- MapOutputConverter — `088_MAPOUTPUTCONVERTER.md`
- JSON Schema Generation — `089_JSON_SCHEMA_GENERATION.md`
- Schema Validation — `090_SCHEMA_VALIDATION.md`
- Self Correction — `091_SELF_CORRECTION.md`
- Provider Native Structured Output — `092_PROVIDER_NATIVE_STRUCTURED_OUTPUT.md`
- Structured Output Portability — `093_STRUCTURED_OUTPUT_PORTABILITY.md`
- Semantic Validation — `094_SEMANTIC_VALIDATION.md`

## Advisors

- Advisor Mental Model — `095_ADVISOR_MENTAL_MODEL.md`
- CallAdvisor — `096_CALLADVISOR.md`
- StreamAdvisor — `097_STREAMADVISOR.md`
- Advisor Order — `098_ADVISOR_ORDER.md`
- Advisor Context — `099_ADVISOR_CONTEXT.md`
- SimpleLoggerAdvisor — `100_SIMPLELOGGERADVISOR.md`
- MessageChatMemoryAdvisor — `101_MESSAGECHATMEMORYADVISOR.md`
- PromptChatMemoryAdvisor — `102_PROMPTCHATMEMORYADVISOR.md`
- VectorStoreChatMemoryAdvisor — `103_VECTORSTORECHATMEMORYADVISOR.md`
- QuestionAnswerAdvisor — `104_QUESTIONANSWERADVISOR.md`
- RetrievalAugmentationAdvisor — `105_RETRIEVALAUGMENTATIONADVISOR.md`
- ReReadingAdvisor — `106_REREADINGADVISOR.md`
- ToolCallingAdvisor — `107_TOOLCALLINGADVISOR.md`
- Custom Advisor — `108_CUSTOM_ADVISOR.md`
- Advisor Composition — `109_ADVISOR_COMPOSITION.md`
- Advisor Security — `110_ADVISOR_SECURITY.md`

## Tool Calling

- Tool Calling Mental Model — `111_TOOL_CALLING_MENTAL_MODEL.md`
- @Tool — `112_TOOL.md`
- Tool Description — `113_TOOL_DESCRIPTION.md`
- Tool Parameter Schema — `114_TOOL_PARAMETER_SCHEMA.md`
- ToolCallback — `115_TOOLCALLBACK.md`
- ToolCallbackProvider — `116_TOOLCALLBACKPROVIDER.md`
- Function Tool — `117_FUNCTION_TOOL.md`
- defaultTools — `118_DEFAULTTOOLS.md`
- Per Call Tools — `119_PER_CALL_TOOLS.md`
- Tool Union Semantics — `120_TOOL_UNION_SEMANTICS.md`
- Tool Calling Loop — `121_TOOL_CALLING_LOOP.md`
- Tool Call Limit — `122_TOOL_CALL_LIMIT.md`
- Tool Result — `123_TOOL_RESULT.md`
- User Controlled Tool Execution — `124_USER_CONTROLLED_TOOL_EXECUTION.md`
- Tool Error Handling — `125_TOOL_ERROR_HANDLING.md`
- Tool Authorization — `126_TOOL_AUTHORIZATION.md`
- Tool Idempotency — `127_TOOL_IDEMPOTENCY.md`
- Destructive Tool — `128_DESTRUCTIVE_TOOL.md`
- Tool Observability — `129_TOOL_OBSERVABILITY.md`

## MCP

- MCP Mental Model — `130_MCP_MENTAL_MODEL.md`
- Spring AI MCP — `131_SPRING_AI_MCP.md`
- MCP Client — `132_MCP_CLIENT.md`
- MCP Server — `133_MCP_SERVER.md`
- MCP Tool — `134_MCP_TOOL.md`
- MCP Resource — `135_MCP_RESOURCE.md`
- MCP Prompt — `136_MCP_PROMPT.md`
- MCP Transport — `137_MCP_TRANSPORT.md`
- Streamable HTTP — `138_STREAMABLE_HTTP.md`
- SSE Legacy Awareness — `139_SSE_LEGACY_AWARENESS.md`
- MCP Security Boundary — `140_MCP_SECURITY_BOUNDARY.md`
- MCP Tool Discovery — `141_MCP_TOOL_DISCOVERY.md`
- MCP vs ToolCallback — `142_MCP_VS_TOOLCALLBACK.md`
- MCP Version Compatibility — `143_MCP_VERSION_COMPATIBILITY.md`

## Chat Memory

- Chat Memory Mental Model — `144_CHAT_MEMORY_MENTAL_MODEL.md`
- ChatMemory — `145_CHATMEMORY.md`
- ChatMemoryRepository — `146_CHATMEMORYREPOSITORY.md`
- Message Window Memory — `147_MESSAGE_WINDOW_MEMORY.md`
- InMemoryChatMemoryRepository — `148_INMEMORYCHATMEMORYREPOSITORY.md`
- JdbcChatMemoryRepository — `149_JDBCCHATMEMORYREPOSITORY.md`
- Cassandra Chat Memory — `150_CASSANDRA_CHAT_MEMORY.md`
- CosmosDB Chat Memory — `151_COSMOSDB_CHAT_MEMORY.md`
- Neo4j Chat Memory — `152_NEO4J_CHAT_MEMORY.md`
- Mongo Chat Memory — `153_MONGO_CHAT_MEMORY.md`
- Conversation ID — `154_CONVERSATION_ID.md`
- Memory Window Size — `155_MEMORY_WINDOW_SIZE.md`
- Memory vs Full Chat History — `156_MEMORY_VS_FULL_CHAT_HISTORY.md`
- Memory vs RAG — `157_MEMORY_VS_RAG.md`
- Memory Privacy — `158_MEMORY_PRIVACY.md`
- Memory Poisoning — `159_MEMORY_POISONING.md`

## Embeddings

- Embedding Mental Model — `160_EMBEDDING_MENTAL_MODEL.md`
- EmbeddingModel call — `161_EMBEDDINGMODEL_CALL.md`
- EmbeddingRequest — `162_EMBEDDINGREQUEST.md`
- EmbeddingResponse — `163_EMBEDDINGRESPONSE.md`
- Embedding — `164_EMBEDDING.md`
- Embedding Dimension — `165_EMBEDDING_DIMENSION.md`
- Document Embedding — `166_DOCUMENT_EMBEDDING.md`
- Query Embedding — `167_QUERY_EMBEDDING.md`
- Batch Embedding — `168_BATCH_EMBEDDING.md`
- Embedding Normalization — `169_EMBEDDING_NORMALIZATION.md`
- Embedding Model Change — `170_EMBEDDING_MODEL_CHANGE.md`
- Embedding Cost — `171_EMBEDDING_COST.md`
- Embedding Observability — `172_EMBEDDING_OBSERVABILITY.md`

## Vector Store

- VectorStore Mental Model — `173_VECTORSTORE_MENTAL_MODEL.md`
- VectorStore add — `174_VECTORSTORE_ADD.md`
- VectorStore delete — `175_VECTORSTORE_DELETE.md`
- similaritySearch — `176_SIMILARITYSEARCH.md`
- SearchRequest — `177_SEARCHREQUEST.md`
- topK — `178_TOPK.md`
- Similarity Threshold — `179_SIMILARITY_THRESHOLD.md`
- Filter Expression — `180_FILTER_EXPRESSION.md`
- FilterExpressionBuilder — `181_FILTEREXPRESSIONBUILDER.md`
- Dynamic Filter — `182_DYNAMIC_FILTER.md`
- VectorStoreRetriever — `183_VECTORSTORERETRIEVER.md`
- Document — `184_DOCUMENT.md`
- Metadata — `185_METADATA.md`
- Vector Store Initialization — `186_VECTOR_STORE_INITIALIZATION.md`
- Vector Store Portability — `187_VECTOR_STORE_PORTABILITY.md`
- Tenant Filter — `188_TENANT_FILTER.md`

## Vector Store Providers

- PGvector — `189_PGVECTOR.md`
- Pinecone — `190_PINECONE.md`
- Milvus — `191_MILVUS.md`
- Qdrant — `192_QDRANT.md`
- Redis — `193_REDIS.md`
- Elasticsearch — `194_ELASTICSEARCH.md`
- OpenSearch — `195_OPENSEARCH.md`
- MongoDB Atlas Vector — `196_MONGODB_ATLAS_VECTOR.md`
- Neo4j Vector — `197_NEO4J_VECTOR.md`
- Cassandra Vector — `198_CASSANDRA_VECTOR.md`
- Azure Vector Stores — `199_AZURE_VECTOR_STORES.md`
- Chroma — `200_CHROMA.md`
- Weaviate — `201_WEAVIATE.md`
- Vector Store Selection — `202_VECTOR_STORE_SELECTION.md`

## RAG Foundations

- RAG Mental Model — `203_RAG_MENTAL_MODEL.md`
- RAG Pipeline — `204_RAG_PIPELINE.md`
- Naive RAG — `205_NAIVE_RAG.md`
- QuestionAnswerAdvisor RAG — `206_QUESTIONANSWERADVISOR_RAG.md`
- RetrievalAugmentationAdvisor — `207_RETRIEVALAUGMENTATIONADVISOR.md`
- RAG Empty Context — `208_RAG_EMPTY_CONTEXT.md`
- RAG Filter Param — `209_RAG_FILTER_PARAM.md`
- RAG Similarity Threshold — `210_RAG_SIMILARITY_THRESHOLD.md`
- RAG topK — `211_RAG_TOPK.md`
- RAG Security — `212_RAG_SECURITY.md`
- RAG Citation Strategy — `213_RAG_CITATION_STRATEGY.md`
- RAG Evaluation — `214_RAG_EVALUATION.md`

## Modular RAG - Pre Retrieval

- Query — `215_QUERY.md`
- QueryTransformer — `216_QUERYTRANSFORMER.md`
- RewriteQueryTransformer — `217_REWRITEQUERYTRANSFORMER.md`
- CompressionQueryTransformer — `218_COMPRESSIONQUERYTRANSFORMER.md`
- TranslationQueryTransformer — `219_TRANSLATIONQUERYTRANSFORMER.md`
- QueryExpander — `220_QUERYEXPANDER.md`
- MultiQueryExpander — `221_MULTIQUERYEXPANDER.md`
- Low Temperature Query Transform — `222_LOW_TEMPERATURE_QUERY_TRANSFORM.md`
- Pre Retrieval Risk — `223_PRE_RETRIEVAL_RISK.md`

## Modular RAG - Retrieval

- DocumentRetriever — `224_DOCUMENTRETRIEVER.md`
- VectorStoreDocumentRetriever — `225_VECTORSTOREDOCUMENTRETRIEVER.md`
- Retriever Threshold — `226_RETRIEVER_THRESHOLD.md`
- Retriever topK — `227_RETRIEVER_TOPK.md`
- Retriever Filter — `228_RETRIEVER_FILTER.md`
- Supplier Filter — `229_SUPPLIER_FILTER.md`
- Federated Retriever Pattern — `230_FEDERATED_RETRIEVER_PATTERN.md`
- Read Only Retriever — `231_READ_ONLY_RETRIEVER.md`

## Modular RAG - Post Retrieval

- DocumentPostProcessor — `232_DOCUMENTPOSTPROCESSOR.md`
- Reranking — `233_RERANKING.md`
- Deduplication — `234_DEDUPLICATION.md`
- Context Compression — `235_CONTEXT_COMPRESSION.md`
- Source Prioritization — `236_SOURCE_PRIORITIZATION.md`
- Post Retrieval Evaluation — `237_POST_RETRIEVAL_EVALUATION.md`

## Modular RAG - Generation

- QueryAugmenter — `238_QUERYAUGMENTER.md`
- ContextualQueryAugmenter — `239_CONTEXTUALQUERYAUGMENTER.md`
- Allow Empty Context — `240_ALLOW_EMPTY_CONTEXT.md`
- Custom RAG PromptTemplate — `241_CUSTOM_RAG_PROMPTTEMPLATE.md`
- question_answer_context — `242_QUESTION_ANSWER_CONTEXT.md`
- query Placeholder — `243_QUERY_PLACEHOLDER.md`
- Grounding Instruction — `244_GROUNDING_INSTRUCTION.md`

## ETL & Document Ingestion

- ETL Mental Model — `245_ETL_MENTAL_MODEL.md`
- DocumentReader — `246_DOCUMENTREADER.md`
- DocumentTransformer — `247_DOCUMENTTRANSFORMER.md`
- DocumentWriter — `248_DOCUMENTWRITER.md`
- TextReader — `249_TEXTREADER.md`
- JsonReader — `250_JSONREADER.md`
- PagePdfDocumentReader — `251_PAGEPDFDOCUMENTREADER.md`
- ParagraphPdfDocumentReader — `252_PARAGRAPHPDFDOCUMENTREADER.md`
- TikaDocumentReader — `253_TIKADOCUMENTREADER.md`
- TokenTextSplitter — `254_TOKENTEXTSPLITTER.md`
- Metadata Enrichment — `255_METADATA_ENRICHMENT.md`
- Chunk ID — `256_CHUNK_ID.md`
- Incremental Ingestion — `257_INCREMENTAL_INGESTION.md`
- Ingestion Idempotency — `258_INGESTION_IDEMPOTENCY.md`
- Ingestion Pipeline Version — `259_INGESTION_PIPELINE_VERSION.md`
- Page Range PDF — `260_PAGE_RANGE_PDF.md`

## Evaluation

- Evaluation Mental Model — `261_EVALUATION_MENTAL_MODEL.md`
- Evaluator — `262_EVALUATOR.md`
- RelevancyEvaluator — `263_RELEVANCYEVALUATOR.md`
- FactCheckingEvaluator — `264_FACTCHECKINGEVALUATOR.md`
- EvaluationRequest — `265_EVALUATIONREQUEST.md`
- EvaluationResponse — `266_EVALUATIONRESPONSE.md`
- RAG Faithfulness — `267_RAG_FAITHFULNESS.md`
- Golden Dataset — `268_GOLDEN_DATASET.md`
- Regression Evaluation — `269_REGRESSION_EVALUATION.md`
- LLM Judge Risk — `270_LLM_JUDGE_RISK.md`
- Human Evaluation — `271_HUMAN_EVALUATION.md`
- Online Evaluation — `272_ONLINE_EVALUATION.md`

## Observability

- Spring AI Observability — `273_SPRING_AI_OBSERVABILITY.md`
- Chat Model Observation — `274_CHAT_MODEL_OBSERVATION.md`
- Embedding Model Observation — `275_EMBEDDING_MODEL_OBSERVATION.md`
- Vector Store Observation — `276_VECTOR_STORE_OBSERVATION.md`
- Tool Calling Observation — `277_TOOL_CALLING_OBSERVATION.md`
- Advisor Observation — `278_ADVISOR_OBSERVATION.md`
- Prompt Logging Risk — `279_PROMPT_LOGGING_RISK.md`
- Completion Logging Risk — `280_COMPLETION_LOGGING_RISK.md`
- Token Usage — `281_TOKEN_USAGE.md`
- AI Cost Attribution — `282_AI_COST_ATTRIBUTION.md`
- Trace Correlation — `283_TRACE_CORRELATION.md`
- Low Cardinality Tags — `284_LOW_CARDINALITY_TAGS.md`
- Observation Convention — `285_OBSERVATION_CONVENTION.md`

## Multimodality

- Multimodal Prompt — `286_MULTIMODAL_PROMPT.md`
- Media Type — `287_MEDIA_TYPE.md`
- Image Input — `288_IMAGE_INPUT.md`
- Audio Input — `289_AUDIO_INPUT.md`
- Text to Image — `290_TEXT_TO_IMAGE.md`
- Speech to Text — `291_SPEECH_TO_TEXT.md`
- Text to Speech — `292_TEXT_TO_SPEECH.md`
- Streaming Speech — `293_STREAMING_SPEECH.md`
- Multimodal Portability — `294_MULTIMODAL_PORTABILITY.md`
- Large Media — `295_LARGE_MEDIA.md`

## Provider - OpenAI

- OpenAI Chat — `296_OPENAI_CHAT.md`
- OpenAI Chat Options — `297_OPENAI_CHAT_OPTIONS.md`
- OpenAI Embeddings — `298_OPENAI_EMBEDDINGS.md`
- OpenAI Image — `299_OPENAI_IMAGE.md`
- OpenAI Audio — `300_OPENAI_AUDIO.md`
- OpenAI Structured Output — `301_OPENAI_STRUCTURED_OUTPUT.md`
- OpenAI Tool Calling — `302_OPENAI_TOOL_CALLING.md`
- OpenAI Streaming — `303_OPENAI_STREAMING.md`
- OpenAI Compatibility — `304_OPENAI_COMPATIBILITY.md`

## Provider - Anthropic

- Anthropic Chat — `305_ANTHROPIC_CHAT.md`
- Anthropic Options — `306_ANTHROPIC_OPTIONS.md`
- Anthropic Tool Calling — `307_ANTHROPIC_TOOL_CALLING.md`
- Anthropic Streaming — `308_ANTHROPIC_STREAMING.md`
- Anthropic Prompt Caching Awareness — `309_ANTHROPIC_PROMPT_CACHING_AWARENESS.md`

## Provider - Google

- Google GenAI — `310_GOOGLE_GENAI.md`
- Gemini Chat — `311_GEMINI_CHAT.md`
- Google Tool Calling — `312_GOOGLE_TOOL_CALLING.md`
- Google Multimodality — `313_GOOGLE_MULTIMODALITY.md`
- Google Embeddings — `314_GOOGLE_EMBEDDINGS.md`

## Provider - Azure OpenAI

- Azure OpenAI — `315_AZURE_OPENAI.md`
- Deployment Name — `316_DEPLOYMENT_NAME.md`
- Azure Credentials — `317_AZURE_CREDENTIALS.md`
- Azure Endpoint — `318_AZURE_ENDPOINT.md`
- Azure OpenAI Options — `319_AZURE_OPENAI_OPTIONS.md`

## Provider - Bedrock

- Bedrock Converse — `320_BEDROCK_CONVERSE.md`
- Bedrock Model IDs — `321_BEDROCK_MODEL_IDS.md`
- Bedrock Credentials — `322_BEDROCK_CREDENTIALS.md`
- Bedrock Tool Calling — `323_BEDROCK_TOOL_CALLING.md`
- Bedrock Streaming — `324_BEDROCK_STREAMING.md`

## Provider - Ollama & Local Models

- Ollama — `325_OLLAMA.md`
- Ollama Chat — `326_OLLAMA_CHAT.md`
- Ollama Embeddings — `327_OLLAMA_EMBEDDINGS.md`
- Ollama Tool Calling — `328_OLLAMA_TOOL_CALLING.md`
- Ollama Thinking — `329_OLLAMA_THINKING.md`
- Local Model Tradeoff — `330_LOCAL_MODEL_TRADEOFF.md`

## Provider Ecosystem

- DeepSeek — `331_DEEPSEEK.md`
- Mistral AI — `332_MISTRAL_AI.md`
- Groq — `333_GROQ.md`
- NVIDIA — `334_NVIDIA.md`
- OCI GenAI — `335_OCI_GENAI.md`
- Perplexity — `336_PERPLEXITY.md`
- MiniMax — `337_MINIMAX.md`
- Provider Migration — `338_PROVIDER_MIGRATION.md`

## Streaming

- Streaming Mental Model — `339_STREAMING_MENTAL_MODEL.md`
- ChatClient stream content — `340_CHATCLIENT_STREAM_CONTENT.md`
- Streaming ChatResponse — `341_STREAMING_CHATRESPONSE.md`
- Backpressure Caveat — `342_BACKPRESSURE_CAVEAT.md`
- Streaming Tool Calls — `343_STREAMING_TOOL_CALLS.md`
- Streaming Usage — `344_STREAMING_USAGE.md`
- SSE Endpoint — `345_SSE_ENDPOINT.md`
- Streaming Cancellation — `346_STREAMING_CANCELLATION.md`
- Streaming Error — `347_STREAMING_ERROR.md`
- Moderate UX — `348_MODERATE_UX.md`

## Resilience & Rate Limits

- Model Timeout — `349_MODEL_TIMEOUT.md`
- Retry — `350_RETRY.md`
- Rate Limit — `351_RATE_LIMIT.md`
- Backoff — `352_BACKOFF.md`
- Jitter — `353_JITTER.md`
- Circuit Breaker — `354_CIRCUIT_BREAKER.md`
- Bulkhead — `355_BULKHEAD.md`
- Fallback Model — `356_FALLBACK_MODEL.md`
- Fallback Provider — `357_FALLBACK_PROVIDER.md`
- Token Budget — `358_TOKEN_BUDGET.md`
- Tool Call Budget — `359_TOOL_CALL_BUDGET.md`
- RAG Budget — `360_RAG_BUDGET.md`
- Cost Guardrail — `361_COST_GUARDRAIL.md`

## Security

- Spring AI Security Model — `362_SPRING_AI_SECURITY_MODEL.md`
- API Key Management — `363_API_KEY_MANAGEMENT.md`
- Prompt Injection — `364_PROMPT_INJECTION.md`
- Indirect Prompt Injection — `365_INDIRECT_PROMPT_INJECTION.md`
- Tool Abuse — `366_TOOL_ABUSE.md`
- Least Privilege Tools — `367_LEAST_PRIVILEGE_TOOLS.md`
- Tool Input Validation — `368_TOOL_INPUT_VALIDATION.md`
- Tool Authorization — `369_TOOL_AUTHORIZATION.md`
- Data Exfiltration — `370_DATA_EXFILTRATION.md`
- Tenant RAG Isolation — `371_TENANT_RAG_ISOLATION.md`
- PII Redaction — `372_PII_REDACTION.md`
- Provider Data Policy — `373_PROVIDER_DATA_POLICY.md`
- Prompt Logging Disabled by Default — `374_PROMPT_LOGGING_DISABLED_BY_DEFAULT.md`
- MCP Trust — `375_MCP_TRUST.md`
- Model Output Validation — `376_MODEL_OUTPUT_VALIDATION.md`
- HTML Markdown Safety — `377_HTML_MARKDOWN_SAFETY.md`

## Testing

- Unit Test Prompt Builder — `378_UNIT_TEST_PROMPT_BUILDER.md`
- Mock ChatModel — `379_MOCK_CHATMODEL.md`
- ChatClient Test — `380_CHATCLIENT_TEST.md`
- Tool Unit Test — `381_TOOL_UNIT_TEST.md`
- Tool Integration Test — `382_TOOL_INTEGRATION_TEST.md`
- RAG Retrieval Test — `383_RAG_RETRIEVAL_TEST.md`
- RAG Answer Test — `384_RAG_ANSWER_TEST.md`
- Vector Store Integration Test — `385_VECTOR_STORE_INTEGRATION_TEST.md`
- Provider Contract Test — `386_PROVIDER_CONTRACT_TEST.md`
- Structured Output Test — `387_STRUCTURED_OUTPUT_TEST.md`
- Streaming Test — `388_STREAMING_TEST.md`
- Memory Isolation Test — `389_MEMORY_ISOLATION_TEST.md`
- Evaluation in CI — `390_EVALUATION_IN_CI.md`

## Architecture Patterns

- AI BFF — `391_AI_BFF.md`
- Provider Gateway — `392_PROVIDER_GATEWAY.md`
- RAG Service — `393_RAG_SERVICE.md`
- Tool Gateway — `394_TOOL_GATEWAY.md`
- Agentic Loop — `395_AGENTIC_LOOP.md`
- Deterministic Outer Workflow — `396_DETERMINISTIC_OUTER_WORKFLOW.md`
- Human Approval — `397_HUMAN_APPROVAL.md`
- Model Router — `398_MODEL_ROUTER.md`
- Semantic Cache — `399_SEMANTIC_CACHE.md`
- Async AI Job — `400_ASYNC_AI_JOB.md`
- Streaming Chat Endpoint — `401_STREAMING_CHAT_ENDPOINT.md`
- Multi Tenant RAG — `402_MULTI_TENANT_RAG.md`
- Prompt Registry — `403_PROMPT_REGISTRY.md`
- Evaluation Gateway — `404_EVALUATION_GATEWAY.md`

## Integration with Spring Ecosystem

- Spring Boot — `405_SPRING_BOOT.md`
- Spring WebFlux — `406_SPRING_WEBFLUX.md`
- Spring MVC — `407_SPRING_MVC.md`
- Spring Security — `408_SPRING_SECURITY.md`
- Spring Data — `409_SPRING_DATA.md`
- Spring Batch — `410_SPRING_BATCH.md`
- Spring Integration — `411_SPRING_INTEGRATION.md`
- Spring Cloud — `412_SPRING_CLOUD.md`
- Micrometer — `413_MICROMETER.md`
- Testcontainers — `414_TESTCONTAINERS.md`

## Migration 1.x to 2.x

- Spring AI 2.0 Migration — `415_SPRING_AI_2_0_MIGRATION.md`
- Starter Naming — `416_STARTER_NAMING.md`
- Tool API Changes — `417_TOOL_API_CHANGES.md`
- ToolCallingAdvisor Auto Registration — `418_TOOLCALLINGADVISOR_AUTO_REGISTRATION.md`
- Structured Output Changes — `419_STRUCTURED_OUTPUT_CHANGES.md`
- Prompt Options Replacement — `420_PROMPT_OPTIONS_REPLACEMENT.md`
- Jackson Alignment — `421_JACKSON_ALIGNMENT.md`
- Provider Model Retirement — `422_PROVIDER_MODEL_RETIREMENT.md`
- Upgrade Regression Suite — `423_UPGRADE_REGRESSION_SUITE.md`

## Troubleshooting

- No ChatModel Bean — `424_NO_CHATMODEL_BEAN.md`
- 401 Provider — `425_401_PROVIDER.md`
- 429 Rate Limit — `426_429_RATE_LIMIT.md`
- Chat Timeout — `427_CHAT_TIMEOUT.md`
- Streaming Stops — `428_STREAMING_STOPS.md`
- Tool Not Called — `429_TOOL_NOT_CALLED.md`
- Wrong Tool Called — `430_WRONG_TOOL_CALLED.md`
- Tool Loop — `431_TOOL_LOOP.md`
- Conversation Memory Missing — `432_CONVERSATION_MEMORY_MISSING.md`
- Conversation Leak — `433_CONVERSATION_LEAK.md`
- RAG No Results — `434_RAG_NO_RESULTS.md`
- RAG Wrong Results — `435_RAG_WRONG_RESULTS.md`
- Vector Store Filter Failure — `436_VECTOR_STORE_FILTER_FAILURE.md`
- Structured Output Parse Error — `437_STRUCTURED_OUTPUT_PARSE_ERROR.md`
- Schema Validation Failure — `438_SCHEMA_VALIDATION_FAILURE.md`
- MCP Connection Failure — `439_MCP_CONNECTION_FAILURE.md`
- Context Too Large — `440_CONTEXT_TOO_LARGE.md`
- High Token Cost — `441_HIGH_TOKEN_COST.md`
- High Latency — `442_HIGH_LATENCY.md`
- Wrong Model Behavior After Provider Switch — `443_WRONG_MODEL_BEHAVIOR_AFTER_PROVIDER_SWITCH.md`
- Prompt Injection Success — `444_PROMPT_INJECTION_SUCCESS.md`
- Golden Debug Flow — `445_GOLDEN_DEBUG_FLOW.md`

## System Design & Interviews

- Design Spring AI Chat App — `446_DESIGN_SPRING_AI_CHAT_APP.md`
- Design Enterprise RAG — `447_DESIGN_ENTERPRISE_RAG.md`
- Design Tool Calling Assistant — `448_DESIGN_TOOL_CALLING_ASSISTANT.md`
- Design MCP Client App — `449_DESIGN_MCP_CLIENT_APP.md`
- Design MCP Server — `450_DESIGN_MCP_SERVER.md`
- Design Multi Provider AI — `451_DESIGN_MULTI_PROVIDER_AI.md`
- Design AI Document Ingestion — `452_DESIGN_AI_DOCUMENT_INGESTION.md`
- Design AI Evaluation Pipeline — `453_DESIGN_AI_EVALUATION_PIPELINE.md`
- Design Multi Tenant RAG — `454_DESIGN_MULTI_TENANT_RAG.md`
- Design Streaming Copilot — `455_DESIGN_STREAMING_COPILOT.md`
- Design Local AI — `456_DESIGN_LOCAL_AI.md`
- ChatModel vs ChatClient — `457_CHATMODEL_VS_CHATCLIENT.md`
- Advisor vs Filter — `458_ADVISOR_VS_FILTER.md`
- Tool vs MCP Tool — `459_TOOL_VS_MCP_TOOL.md`
- ChatMemory vs RAG — `460_CHATMEMORY_VS_RAG.md`
- VectorStore vs Vector DB — `461_VECTORSTORE_VS_VECTOR_DB.md`
- Structured Output vs Tool Calling — `462_STRUCTURED_OUTPUT_VS_TOOL_CALLING.md`
- RAG vs Fine Tuning — `463_RAG_VS_FINE_TUNING.md`
- Spring AI vs LangChain — `464_SPRING_AI_VS_LANGCHAIN.md`
- Spring AI vs Semantic Kernel — `465_SPRING_AI_VS_SEMANTIC_KERNEL.md`
- When Not to Use Spring AI — `466_WHEN_NOT_TO_USE_SPRING_AI.md`
- Spring AI Anti Patterns — `467_SPRING_AI_ANTI_PATTERNS.md`
- Spring AI Interview Traps — `468_SPRING_AI_INTERVIEW_TRAPS.md`


---

<!-- 010_AUTO_CONFIGURATION.md -->

# Auto Configuration

## What / Why
Spring Boot starters auto-configure models, vector stores and supporting components.

## Mental Model
```text
Auto Configuration → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Auto Configuration:** Spring Boot starters auto-configure models, vector stores and supporting components.


---

<!-- 011_STARTER_MODULES.md -->

# Starter Modules

## What / Why
Use provider-specific starters for model/vector-store integrations.

## Mental Model
```text
Starter Modules → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Starter Modules:** Use provider-specific starters for model/vector-store integrations.


---

<!-- 012_BOM.md -->

# BOM

## What / Why
Spring AI BOM aligns module versions.

## Mental Model
```text
BOM → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **BOM:** Spring AI BOM aligns module versions.


---

<!-- 013_SYNC_VS_STREAMING.md -->

# Sync vs Streaming

## What / Why
Spring AI supports synchronous and streaming model interaction.

## Mental Model
```text
Sync vs Streaming → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Sync vs Streaming:** Spring AI supports synchronous and streaming model interaction.


---

<!-- 014_PRODUCTION_ARCHITECTURE.md -->

# Production Architecture

## What / Why
Treat model calls as remote dependencies with latency, cost, rate limits, fallbacks and observability.

## Mental Model
```text
Production Architecture → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Production Architecture:** Treat model calls as remote dependencies with latency, cost, rate limits, fallbacks and observability.


---

<!-- 015_AI_BOUNDARY.md -->

# AI Boundary

## What / Why
Spring AI is application integration infrastructure; model capability, safety and data quality remain separate concerns.

## Mental Model
```text
AI Boundary → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **AI Boundary:** Spring AI is application integration infrastructure; model capability, safety and data quality remain separate concerns.


---

<!-- 016_MODEL_INTERFACE.md -->

# Model Interface

## What / Why
Common request-response model abstraction.

## Mental Model
```text
Model Interface → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Model Interface:** Common request-response model abstraction.


---

<!-- 017_MODELREQUEST.md -->

# ModelRequest

## What / Why
Input payload plus options.

## Mental Model
```text
ModelRequest → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ModelRequest:** Input payload plus options.


---

<!-- 018_MODELRESPONSE.md -->

# ModelResponse

## What / Why
Standardized response abstraction.

## Mental Model
```text
ModelResponse → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ModelResponse:** Standardized response abstraction.


---

<!-- 019_CHATMODEL.md -->

# ChatModel

## What / Why
Portable chat completion/model interface.

## Mental Model
```text
ChatModel → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatModel:** Portable chat completion/model interface.


---

<!-- 01_30_SECOND_RECALL.md -->

# Spring AI — 30-Second Recall

```text
Application
   ↓
ChatClient
 ├─ Prompt
 ├─ Advisors
 │   ├─ Memory
 │   ├─ RAG
 │   └─ ToolCalling
 ├─ Tools / MCP
 └─ ChatModel
      ↓
   AI Provider
```

## RAG
```text
Documents
→ Reader
→ Splitter/Transformer
→ EmbeddingModel
→ VectorStore

Question
→ Retriever
→ Context
→ ChatModel
→ Grounded Answer
```

## Core APIs
```text
ChatModel
ChatClient
Advisor
ToolCallback / @Tool
EmbeddingModel
VectorStore
ChatMemory
Evaluator
MCP
```


---

<!-- 020_STREAMINGCHATMODEL.md -->

# StreamingChatModel

## What / Why
Streaming chat abstraction.

## Mental Model
```text
StreamingChatModel → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **StreamingChatModel:** Streaming chat abstraction.


---

<!-- 021_EMBEDDINGMODEL.md -->

# EmbeddingModel

## What / Why
Produces vector embeddings.

## Mental Model
```text
EmbeddingModel → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **EmbeddingModel:** Produces vector embeddings.


---

<!-- 022_IMAGEMODEL.md -->

# ImageModel

## What / Why
Generates images where provider supports it.

## Mental Model
```text
ImageModel → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ImageModel:** Generates images where provider supports it.


---

<!-- 023_AUDIO_TRANSCRIPTION_MODEL.md -->

# Audio Transcription Model

## What / Why
Speech-to-text model abstraction.

## Mental Model
```text
Audio Transcription Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Audio Transcription Model:** Speech-to-text model abstraction.


---

<!-- 024_AUDIO_SPEECH_MODEL.md -->

# Audio Speech Model

## What / Why
Text-to-speech model abstraction.

## Mental Model
```text
Audio Speech Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Audio Speech Model:** Text-to-speech model abstraction.


---

<!-- 025_MODERATION_MODEL.md -->

# Moderation Model

## What / Why
Provider moderation abstraction where available.

## Mental Model
```text
Moderation Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Moderation Model:** Provider moderation abstraction where available.


---

<!-- 026_MODEL_OPTIONS.md -->

# Model Options

## What / Why
Runtime options control temperature, tokens, model-specific settings and tool behavior.

## Mental Model
```text
Model Options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Model Options:** Runtime options control temperature, tokens, model-specific settings and tool behavior.


---

<!-- 027_STARTUP_OPTIONS.md -->

# Startup Options

## What / Why
Default model options configured at bean construction.

## Mental Model
```text
Startup Options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Startup Options:** Default model options configured at bean construction.


---

<!-- 028_RUNTIME_OPTIONS.md -->

# Runtime Options

## What / Why
Per-request prompt options override startup options.

## Mental Model
```text
Runtime Options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Runtime Options:** Per-request prompt options override startup options.


---

<!-- 029_PROVIDER_NATIVE_OPTIONS.md -->

# Provider Native Options

## What / Why
Provider-specific option classes expose capabilities beyond common API.

## Mental Model
```text
Provider Native Options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Provider Native Options:** Provider-specific option classes expose capabilities beyond common API.


---

<!-- 02_CURRENT_BASELINE.md -->

# Spring AI 2.0.1 — Current Baseline

## Release
**Spring AI 2.0.1** is the current latest release baseline used by this pack.

Release date:
```text
August 21, 2026
```

## Core 2.0.1 Capabilities
- Model API
- ChatModel / StreamingChatModel
- ChatClient
- Structured output
- Advisors
- Chat memory
- Tool calling
- MCP client/server integration
- Embeddings
- VectorStore and VectorStoreRetriever
- Modular RAG
- ETL document ingestion
- Evaluation
- Observability
- Image/audio/transcription/speech APIs
- Spring Boot auto-configuration/starters

## Important 2.0-era Behavior
- `ToolCallingAdvisor` is auto-registered by ChatClient unless explicitly disabled.
- Runtime-injected tools can participate in the same tool-calling loop.
- Per-call `.tools(...)` appends to default tools.
- Risky/destructive tools should not normally be exposed as global defaults.
- Conversation ID must be supplied for memory-advisor calls that require it.
- `VectorStoreRetriever` provides a read-only least-privilege retrieval surface.


---

<!-- 030_MODEL_CAPABILITY_MATRIX.md -->

# Model Capability Matrix

## What / Why
Not every provider supports tools, media, JSON schema, reasoning or streaming identically.

## Mental Model
```text
Model Capability Matrix → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Model Capability Matrix:** Not every provider supports tools, media, JSON schema, reasoning or streaming identically.


---

<!-- 031_CHATMODEL_FLOW.md -->

# ChatModel Flow

## What / Why
Prompt → provider conversion → model call → standardized ChatResponse.

## Mental Model
```text
ChatModel Flow → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatModel Flow:** Prompt → provider conversion → model call → standardized ChatResponse.


---

<!-- 032_PROMPT.md -->

# Prompt

## What / Why
Collection of instructions/messages plus runtime options.

## Mental Model
```text
Prompt → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt:** Collection of instructions/messages plus runtime options.


---

<!-- 033_CHATRESPONSE.md -->

# ChatResponse

## What / Why
Standard model response containing generations and metadata.

## Mental Model
```text
ChatResponse → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatResponse:** Standard model response containing generations and metadata.


---

<!-- 034_GENERATION.md -->

# Generation

## What / Why
One model output choice plus metadata.

## Mental Model
```text
Generation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Generation:** One model output choice plus metadata.


---

<!-- 035_ASSISTANTMESSAGE.md -->

# AssistantMessage

## What / Why
Assistant response message.

## Mental Model
```text
AssistantMessage → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **AssistantMessage:** Assistant response message.


---

<!-- 036_USERMESSAGE.md -->

# UserMessage

## What / Why
User instruction/content.

## Mental Model
```text
UserMessage → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **UserMessage:** User instruction/content.


---

<!-- 037_SYSTEMMESSAGE.md -->

# SystemMessage

## What / Why
System-level instruction.

## Mental Model
```text
SystemMessage → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **SystemMessage:** System-level instruction.


---

<!-- 038_TOOLRESPONSEMESSAGE.md -->

# ToolResponseMessage

## What / Why
Represents tool execution results returned to the model.

## Mental Model
```text
ToolResponseMessage → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ToolResponseMessage:** Represents tool execution results returned to the model.


---

<!-- 039_MEDIA.md -->

# Media

## What / Why
Represents multimodal content attached to messages.

## Mental Model
```text
Media → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Media:** Represents multimodal content attached to messages.


---

<!-- 03_REFERENCE_ARCHITECTURE.md -->

# Spring AI Reference Architecture

```text
Client / API
     ↓
Spring Security / Tenant Context
     ↓
AI Application Service
     ↓
ChatClient
 ┌────┼───────────────┐
 ↓    ↓               ↓
Memory Advisors    RAG Advisors     ToolCallingAdvisor
      │               │               │
      ▼               ▼               ▼
ChatMemory       VectorStore       Tools / MCP
                      │
                EmbeddingModel
                      │
                      ▼
                  ChatModel
                      │
                      ▼
                AI Provider(s)

Cross-cutting:
Evaluation
Observability
Security
Rate limits
Cost controls
Prompt/version management
```


---

<!-- 040_CHAT_OPTIONS.md -->

# Chat Options

## What / Why
Common chat configuration contract.

## Mental Model
```text
Chat Options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Chat Options:** Common chat configuration contract.


---

<!-- 041_TEMPERATURE.md -->

# Temperature

## What / Why
Controls output sampling randomness where provider supports it.

## Mental Model
```text
Temperature → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Temperature:** Controls output sampling randomness where provider supports it.


---

<!-- 042_MAX_TOKENS.md -->

# Max Tokens

## What / Why
Bounds output tokens where supported.

## Mental Model
```text
Max Tokens → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Max Tokens:** Bounds output tokens where supported.


---

<!-- 043_STOP_SEQUENCES.md -->

# Stop Sequences

## What / Why
Terminate generation on configured text.

## Mental Model
```text
Stop Sequences → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Stop Sequences:** Terminate generation on configured text.


---

<!-- 044_TOP_P.md -->

# Top P

## What / Why
Nucleus sampling option where supported.

## Mental Model
```text
Top P → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Top P:** Nucleus sampling option where supported.


---

<!-- 045_REASONING_CONTENT.md -->

# Reasoning Content

## What / Why
Provider/model-specific reasoning metadata may be exposed separately from final answer.

## Mental Model
```text
Reasoning Content → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Reasoning Content:** Provider/model-specific reasoning metadata may be exposed separately from final answer.


---

<!-- 046_USAGE_METADATA.md -->

# Usage Metadata

## What / Why
Token usage can be available in response metadata.

## Mental Model
```text
Usage Metadata → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Usage Metadata:** Token usage can be available in response metadata.


---

<!-- 047_CHATCLIENT_MENTAL_MODEL.md -->

# ChatClient Mental Model

## What / Why
Fluent high-level API for building prompts and invoking ChatModel.

## Mental Model
```text
ChatClient Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatClient Mental Model:** Fluent high-level API for building prompts and invoking ChatModel.


---

<!-- 048_CHATCLIENT_BUILDER.md -->

# ChatClient Builder

## What / Why
Creates reusable client with defaults.

## Mental Model
```text
ChatClient Builder → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatClient Builder:** Creates reusable client with defaults.


---

<!-- 049_CHATCLIENT_CREATE.md -->

# ChatClient create

## What / Why
Convenience factory around ChatModel.

## Mental Model
```text
ChatClient create → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatClient create:** Convenience factory around ChatModel.


---

<!-- 04_AI_DECISION_TREE.md -->

# Spring AI Decision Tree

```text
Need simple LLM request?
→ ChatClient / ChatModel

Need typed result?
→ ChatClient.entity(...)

Need conversation context?
→ ChatMemory + Memory Advisor

Need private/current knowledge?
→ VectorStore + RAG Advisor

Need dynamic enterprise actions?
→ @Tool / ToolCallback + ToolCallingAdvisor

Need external standardized tools/resources?
→ MCP

Need large document ingestion?
→ ETL readers + splitter + embeddings + VectorStore

Need model-quality regression checks?
→ Evaluators + golden dataset

Need multiple providers?
→ common Model APIs + provider adapters + router
```


---

<!-- 050_DEFAULTSYSTEM.md -->

# defaultSystem

## What / Why
Set reusable system instruction.

## Mental Model
```text
defaultSystem → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **defaultSystem:** Set reusable system instruction.


---

<!-- 051_DEFAULTUSER.md -->

# defaultUser

## What / Why
Set reusable user prompt template.

## Mental Model
```text
defaultUser → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **defaultUser:** Set reusable user prompt template.


---

<!-- 052_DEFAULTOPTIONS.md -->

# defaultOptions

## What / Why
Set reusable ChatOptions.

## Mental Model
```text
defaultOptions → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **defaultOptions:** Set reusable ChatOptions.


---

<!-- 053_DEFAULTADVISORS.md -->

# defaultAdvisors

## What / Why
Attach Advisors to every request.

## Mental Model
```text
defaultAdvisors → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **defaultAdvisors:** Attach Advisors to every request.


---

<!-- 054_DEFAULTTOOLS.md -->

# defaultTools

## What / Why
Attach default tools to every request.

## Mental Model
```text
defaultTools → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **defaultTools:** Attach default tools to every request.


---

<!-- 055_PROMPT.md -->

# prompt

## What / Why
Begins per-request prompt specification.

## Mental Model
```text
prompt → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **prompt:** Begins per-request prompt specification.


---

<!-- 056_SYSTEM.md -->

# system

## What / Why
Set system message for request.

## Mental Model
```text
system → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **system:** Set system message for request.


---

<!-- 057_USER.md -->

# user

## What / Why
Set user message for request.

## Mental Model
```text
user → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **user:** Set user message for request.


---

<!-- 058_OPTIONS.md -->

# options

## What / Why
Set runtime chat options.

## Mental Model
```text
options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **options:** Set runtime chat options.


---

<!-- 059_ADVISORS.md -->

# advisors

## What / Why
Add advisors per request.

## Mental Model
```text
advisors → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **advisors:** Add advisors per request.


---

<!-- 060_TOOLS.md -->

# tools

## What / Why
Add tools per request.

## Mental Model
```text
tools → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **tools:** Add tools per request.


---

<!-- 061_CALL.md -->

# call

## What / Why
Execute blocking/synchronous model interaction.

## Mental Model
```text
call → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **call:** Execute blocking/synchronous model interaction.


---

<!-- 062_STREAM.md -->

# stream

## What / Why
Execute streaming interaction.

## Mental Model
```text
stream → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **stream:** Execute streaming interaction.


---

<!-- 063_CONTENT.md -->

# content

## What / Why
Extract simple text content.

## Mental Model
```text
content → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **content:** Extract simple text content.


---

<!-- 064_CHATRESPONSE.md -->

# chatResponse

## What / Why
Return full ChatResponse.

## Mental Model
```text
chatResponse → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **chatResponse:** Return full ChatResponse.


---

<!-- 065_ENTITY.md -->

# entity

## What / Why
Convert structured output into Java type.

## Mental Model
```text
entity → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **entity:** Convert structured output into Java type.


---

<!-- 066_RESPONSEENTITY.md -->

# responseEntity

## What / Why
Structured output plus response metadata where supported by API.

## Mental Model
```text
responseEntity → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **responseEntity:** Structured output plus response metadata where supported by API.


---

<!-- 067_MUTATE.md -->

# mutate

## What / Why
Create modified client/builder configuration.

## Mental Model
```text
mutate → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **mutate:** Create modified client/builder configuration.


---

<!-- 068_TEMPLATERENDERER.md -->

# TemplateRenderer

## What / Why
Controls prompt-template rendering.

## Mental Model
```text
TemplateRenderer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **TemplateRenderer:** Controls prompt-template rendering.


---

<!-- 069_CHATCLIENT_ADVISOR_ORDER.md -->

# ChatClient Advisor Order

## What / Why
Advisor execution order changes prompt/tool/memory/RAG semantics.

## Mental Model
```text
ChatClient Advisor Order → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatClient Advisor Order:** Advisor execution order changes prompt/tool/memory/RAG semantics.


---

<!-- 070_CONVERSATION_ID_PARAM.md -->

# Conversation ID Param

## What / Why
Memory advisors require conversation ID to scope stored context.

## Mental Model
```text
Conversation ID Param → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Conversation ID Param:** Memory advisors require conversation ID to scope stored context.


---

<!-- 071_PROMPT_ENGINEERING_IN_SPRING_AI.md -->

# Prompt Engineering in Spring AI

## What / Why
Prompts are first-class objects/templates rather than ad hoc strings.

## Mental Model
```text
Prompt Engineering in Spring AI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Engineering in Spring AI:** Prompts are first-class objects/templates rather than ad hoc strings.


---

<!-- 072_PROMPTTEMPLATE.md -->

# PromptTemplate

## What / Why
Template plus variables rendered into prompt text.

## Mental Model
```text
PromptTemplate → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **PromptTemplate:** Template plus variables rendered into prompt text.


---

<!-- 073_SYSTEMPROMPTTEMPLATE.md -->

# SystemPromptTemplate

## What / Why
System-message-oriented prompt template.

## Mental Model
```text
SystemPromptTemplate → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **SystemPromptTemplate:** System-message-oriented prompt template.


---

<!-- 074_USER_PROMPT_TEMPLATE.md -->

# User Prompt Template

## What / Why
Parameterized user message template.

## Mental Model
```text
User Prompt Template → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **User Prompt Template:** Parameterized user message template.


---

<!-- 075_TEMPLATE_VARIABLES.md -->

# Template Variables

## What / Why
Named values injected into template.

## Mental Model
```text
Template Variables → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Template Variables:** Named values injected into template.


---

<!-- 076_STRINGTEMPLATE_RENDERER.md -->

# StringTemplate Renderer

## What / Why
Default template renderer uses StringTemplate-based implementation.

## Mental Model
```text
StringTemplate Renderer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **StringTemplate Renderer:** Default template renderer uses StringTemplate-based implementation.


---

<!-- 077_CUSTOM_TEMPLATE_RENDERER.md -->

# Custom Template Renderer

## What / Why
Swap renderer for application-specific templating.

## Mental Model
```text
Custom Template Renderer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Custom Template Renderer:** Swap renderer for application-specific templating.


---

<!-- 078_PROMPT_RESOURCE.md -->

# Prompt Resource

## What / Why
Load prompts from classpath/resource files.

## Mental Model
```text
Prompt Resource → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Resource:** Load prompts from classpath/resource files.


---

<!-- 079_PROMPT_VERSIONING.md -->

# Prompt Versioning

## What / Why
Keep templates versioned and covered by evals.

## Mental Model
```text
Prompt Versioning → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Versioning:** Keep templates versioned and covered by evals.


---

<!-- 080_PROMPT_INJECTION_BOUNDARY.md -->

# Prompt Injection Boundary

## What / Why
Never merge untrusted retrieved content into authority-level instructions.

## Mental Model
```text
Prompt Injection Boundary → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Injection Boundary:** Never merge untrusted retrieved content into authority-level instructions.


---

<!-- 081_PROMPT_COMPOSITION.md -->

# Prompt Composition

## What / Why
Separate system rules, user request, evidence and tool results.

## Mental Model
```text
Prompt Composition → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Composition:** Separate system rules, user request, evidence and tool results.


---

<!-- 082_PROMPT_REGRESSION.md -->

# Prompt Regression

## What / Why
Treat prompt changes as code changes requiring evaluation.

## Mental Model
```text
Prompt Regression → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Regression:** Treat prompt changes as code changes requiring evaluation.


---

<!-- 083_STRUCTURED_OUTPUT_MENTAL_MODEL.md -->

# Structured Output Mental Model

## What / Why
Convert model text into schema-constrained typed Java objects.

## Mental Model
```text
Structured Output Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Structured Output Mental Model:** Convert model text into schema-constrained typed Java objects.


---

<!-- 084_ENTITY_CLASS.md -->

# entity Class

## What / Why
ChatClient `.entity(MyType.class)` generates schema guidance and deserializes.

## Mental Model
```text
entity Class → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **entity Class:** ChatClient `.entity(MyType.class)` generates schema guidance and deserializes.


---

<!-- 085_PARAMETERIZED_TYPE_REFERENCE.md -->

# Parameterized Type Reference

## What / Why
Handle generic structured output types.

## Mental Model
```text
Parameterized Type Reference → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Parameterized Type Reference:** Handle generic structured output types.


---

<!-- 086_BEANOUTPUTCONVERTER.md -->

# BeanOutputConverter

## What / Why
Converts model output into Java object using generated schema.

## Mental Model
```text
BeanOutputConverter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **BeanOutputConverter:** Converts model output into Java object using generated schema.


---

<!-- 087_LISTOUTPUTCONVERTER.md -->

# ListOutputConverter

## What / Why
Converts delimited/list output.

## Mental Model
```text
ListOutputConverter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ListOutputConverter:** Converts delimited/list output.


---

<!-- 088_MAPOUTPUTCONVERTER.md -->

# MapOutputConverter

## What / Why
Converts map-like output.

## Mental Model
```text
MapOutputConverter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MapOutputConverter:** Converts map-like output.


---

<!-- 089_JSON_SCHEMA_GENERATION.md -->

# JSON Schema Generation

## What / Why
Spring AI can derive JSON schema from Java target type.

## Mental Model
```text
JSON Schema Generation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **JSON Schema Generation:** Spring AI can derive JSON schema from Java target type.


---

<!-- 090_SCHEMA_VALIDATION.md -->

# Schema Validation

## What / Why
Validate structured output against generated schema.

## Mental Model
```text
Schema Validation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Schema Validation:** Validate structured output against generated schema.


---

<!-- 091_SELF_CORRECTION.md -->

# Self Correction

## What / Why
Retry/correct malformed structured output where configured.

## Mental Model
```text
Self Correction → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Self Correction:** Retry/correct malformed structured output where configured.


---

<!-- 092_PROVIDER_NATIVE_STRUCTURED_OUTPUT.md -->

# Provider Native Structured Output

## What / Why
Use provider-level schema enforcement where supported.

## Mental Model
```text
Provider Native Structured Output → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Provider Native Structured Output:** Use provider-level schema enforcement where supported.


---

<!-- 093_STRUCTURED_OUTPUT_PORTABILITY.md -->

# Structured Output Portability

## What / Why
Schema enforcement strength varies by provider.

## Mental Model
```text
Structured Output Portability → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Structured Output Portability:** Schema enforcement strength varies by provider.


---

<!-- 094_SEMANTIC_VALIDATION.md -->

# Semantic Validation

## What / Why
Typed JSON validity does not prove business correctness.

## Mental Model
```text
Semantic Validation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Semantic Validation:** Typed JSON validity does not prove business correctness.


---

<!-- 095_ADVISOR_MENTAL_MODEL.md -->

# Advisor Mental Model

## What / Why
Advisor intercepts and transforms AI request/response flow around ChatClient.

## Mental Model
```text
Advisor Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Advisor Mental Model:** Advisor intercepts and transforms AI request/response flow around ChatClient.


---

<!-- 096_CALLADVISOR.md -->

# CallAdvisor

## What / Why
Advisor for synchronous call chain.

## Mental Model
```text
CallAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **CallAdvisor:** Advisor for synchronous call chain.


---

<!-- 097_STREAMADVISOR.md -->

# StreamAdvisor

## What / Why
Advisor for streaming chain.

## Mental Model
```text
StreamAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **StreamAdvisor:** Advisor for streaming chain.


---

<!-- 098_ADVISOR_ORDER.md -->

# Advisor Order

## What / Why
Lower/higher order changes execution sequence and resulting context.

## Mental Model
```text
Advisor Order → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Advisor Order:** Lower/higher order changes execution sequence and resulting context.


---

<!-- 099_ADVISOR_CONTEXT.md -->

# Advisor Context

## What / Why
Per-request context/parameters shared with advisors.

## Mental Model
```text
Advisor Context → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Advisor Context:** Per-request context/parameters shared with advisors.


---

<!-- 100_SIMPLELOGGERADVISOR.md -->

# SimpleLoggerAdvisor

## What / Why
Logs request/response for debugging; sensitive-data caution.

## Mental Model
```text
SimpleLoggerAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **SimpleLoggerAdvisor:** Logs request/response for debugging; sensitive-data caution.


---

<!-- 101_MESSAGECHATMEMORYADVISOR.md -->

# MessageChatMemoryAdvisor

## What / Why
Adds conversation history as messages.

## Mental Model
```text
MessageChatMemoryAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MessageChatMemoryAdvisor:** Adds conversation history as messages.


---

<!-- 102_PROMPTCHATMEMORYADVISOR.md -->

# PromptChatMemoryAdvisor

## What / Why
Injects memory into prompt text.

## Mental Model
```text
PromptChatMemoryAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **PromptChatMemoryAdvisor:** Injects memory into prompt text.


---

<!-- 103_VECTORSTORECHATMEMORYADVISOR.md -->

# VectorStoreChatMemoryAdvisor

## What / Why
Stores/retrieves conversation memory through vector store.

## Mental Model
```text
VectorStoreChatMemoryAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **VectorStoreChatMemoryAdvisor:** Stores/retrieves conversation memory through vector store.


---

<!-- 104_QUESTIONANSWERADVISOR.md -->

# QuestionAnswerAdvisor

## What / Why
Naive RAG advisor using VectorStore.

## Mental Model
```text
QuestionAnswerAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **QuestionAnswerAdvisor:** Naive RAG advisor using VectorStore.


---

<!-- 105_RETRIEVALAUGMENTATIONADVISOR.md -->

# RetrievalAugmentationAdvisor

## What / Why
Modular RAG orchestration advisor.

## Mental Model
```text
RetrievalAugmentationAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RetrievalAugmentationAdvisor:** Modular RAG orchestration advisor.


---

<!-- 106_REREADINGADVISOR.md -->

# ReReadingAdvisor

## What / Why
Reasoning-oriented rereading strategy.

## Mental Model
```text
ReReadingAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ReReadingAdvisor:** Reasoning-oriented rereading strategy.


---

<!-- 107_TOOLCALLINGADVISOR.md -->

# ToolCallingAdvisor

## What / Why
Executes tool-calling loop and is auto-registered by ChatClient unless disabled.

## Mental Model
```text
ToolCallingAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ToolCallingAdvisor:** Executes tool-calling loop and is auto-registered by ChatClient unless disabled.


---

<!-- 108_CUSTOM_ADVISOR.md -->

# Custom Advisor

## What / Why
Build reusable cross-cutting AI behavior.

## Mental Model
```text
Custom Advisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Custom Advisor:** Build reusable cross-cutting AI behavior.


---

<!-- 109_ADVISOR_COMPOSITION.md -->

# Advisor Composition

## What / Why
Combine memory, RAG, tools, logging and policies deliberately.

## Mental Model
```text
Advisor Composition → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Advisor Composition:** Combine memory, RAG, tools, logging and policies deliberately.


---

<!-- 110_ADVISOR_SECURITY.md -->

# Advisor Security

## What / Why
An advisor that injects tools/context can materially change capability and trust boundary.

## Mental Model
```text
Advisor Security → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Advisor Security:** An advisor that injects tools/context can materially change capability and trust boundary.


---

<!-- 111_TOOL_CALLING_MENTAL_MODEL.md -->

# Tool Calling Mental Model

## What / Why
Model proposes a typed tool call; application executes trusted code and returns result to model.

## Mental Model
```text
Tool Calling Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Calling Mental Model:** Model proposes a typed tool call; application executes trusted code and returns result to model.


---

<!-- 112_TOOL.md -->

# @Tool

## What / Why
Annotates Java method as callable AI tool.

## Mental Model
```text
@Tool → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **@Tool:** Annotates Java method as callable AI tool.


---

<!-- 113_TOOL_DESCRIPTION.md -->

# Tool Description

## What / Why
Name/description guides model tool selection.

## Mental Model
```text
Tool Description → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Description:** Name/description guides model tool selection.


---

<!-- 114_TOOL_PARAMETER_SCHEMA.md -->

# Tool Parameter Schema

## What / Why
Method/POJO signature becomes tool input schema.

## Mental Model
```text
Tool Parameter Schema → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Parameter Schema:** Method/POJO signature becomes tool input schema.


---

<!-- 115_TOOLCALLBACK.md -->

# ToolCallback

## What / Why
Programmatic tool callback abstraction.

## Mental Model
```text
ToolCallback → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ToolCallback:** Programmatic tool callback abstraction.


---

<!-- 116_TOOLCALLBACKPROVIDER.md -->

# ToolCallbackProvider

## What / Why
Provides sets of dynamic tools.

## Mental Model
```text
ToolCallbackProvider → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ToolCallbackProvider:** Provides sets of dynamic tools.


---

<!-- 117_FUNCTION_TOOL.md -->

# Function Tool

## What / Why
Java Function/POJO can be exposed as a tool.

## Mental Model
```text
Function Tool → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Function Tool:** Java Function/POJO can be exposed as a tool.


---

<!-- 118_DEFAULTTOOLS.md -->

# defaultTools

## What / Why
Tools always available to a ChatClient.

## Mental Model
```text
defaultTools → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **defaultTools:** Tools always available to a ChatClient.


---

<!-- 119_PER_CALL_TOOLS.md -->

# Per Call Tools

## What / Why
Tools supplied for only one request.

## Mental Model
```text
Per Call Tools → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Per Call Tools:** Tools supplied for only one request.


---

<!-- 120_TOOL_UNION_SEMANTICS.md -->

# Tool Union Semantics

## What / Why
Per-call tools append to defaults rather than replace them.

## Mental Model
```text
Tool Union Semantics → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Union Semantics:** Per-call tools append to defaults rather than replace them.


---

<!-- 121_TOOL_CALLING_LOOP.md -->

# Tool Calling Loop

## What / Why
ToolCallingAdvisor repeatedly executes requested tools and returns results until model stops requesting tools.

## Mental Model
```text
Tool Calling Loop → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Calling Loop:** ToolCallingAdvisor repeatedly executes requested tools and returns results until model stops requesting tools.


---

<!-- 122_TOOL_CALL_LIMIT.md -->

# Tool Call Limit

## What / Why
2.0.1 supports configurable limits on tool calls.

## Mental Model
```text
Tool Call Limit → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Call Limit:** 2.0.1 supports configurable limits on tool calls.


---

<!-- 123_TOOL_RESULT.md -->

# Tool Result

## What / Why
Application serializes tool output back to model.

## Mental Model
```text
Tool Result → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Result:** Application serializes tool output back to model.


---

<!-- 124_USER_CONTROLLED_TOOL_EXECUTION.md -->

# User Controlled Tool Execution

## What / Why
Application may choose to intercept/approve tool execution.

## Mental Model
```text
User Controlled Tool Execution → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **User Controlled Tool Execution:** Application may choose to intercept/approve tool execution.


---

<!-- 125_TOOL_ERROR_HANDLING.md -->

# Tool Error Handling

## What / Why
Map tool exceptions/timeouts into controlled model-visible result.

## Mental Model
```text
Tool Error Handling → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Error Handling:** Map tool exceptions/timeouts into controlled model-visible result.


---

<!-- 126_TOOL_AUTHORIZATION.md -->

# Tool Authorization

## What / Why
Never let model selection itself grant permission to execute high-impact operation.

## Mental Model
```text
Tool Authorization → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Authorization:** Never let model selection itself grant permission to execute high-impact operation.


---

<!-- 127_TOOL_IDEMPOTENCY.md -->

# Tool Idempotency

## What / Why
Side-effecting tools need idempotency keys/duplicate protection.

## Mental Model
```text
Tool Idempotency → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Idempotency:** Side-effecting tools need idempotency keys/duplicate protection.


---

<!-- 128_DESTRUCTIVE_TOOL.md -->

# Destructive Tool

## What / Why
Add high-risk tools per call and behind approval rather than global default.

## Mental Model
```text
Destructive Tool → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Destructive Tool:** Add high-risk tools per call and behind approval rather than global default.


---

<!-- 129_TOOL_OBSERVABILITY.md -->

# Tool Observability

## What / Why
Trace tool name, args classification, latency, outcome and model iteration.

## Mental Model
```text
Tool Observability → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Observability:** Trace tool name, args classification, latency, outcome and model iteration.


---

<!-- 130_MCP_MENTAL_MODEL.md -->

# MCP Mental Model

## What / Why
Model Context Protocol standardizes access to tools/resources/prompts between AI applications and servers.

## Mental Model
```text
MCP Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Mental Model:** Model Context Protocol standardizes access to tools/resources/prompts between AI applications and servers.


---

<!-- 131_SPRING_AI_MCP.md -->

# Spring AI MCP

## What / Why
Spring AI can act as MCP client or expose Spring-based MCP servers.

## Mental Model
```text
Spring AI MCP → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI MCP:** Spring AI can act as MCP client or expose Spring-based MCP servers.


---

<!-- 132_MCP_CLIENT.md -->

# MCP Client

## What / Why
Consumes remote MCP capabilities.

## Mental Model
```text
MCP Client → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Client:** Consumes remote MCP capabilities.


---

<!-- 133_MCP_SERVER.md -->

# MCP Server

## What / Why
Exposes tools/resources/prompts to AI clients.

## Mental Model
```text
MCP Server → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Server:** Exposes tools/resources/prompts to AI clients.


---

<!-- 134_MCP_TOOL.md -->

# MCP Tool

## What / Why
Callable capability exposed over MCP.

## Mental Model
```text
MCP Tool → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Tool:** Callable capability exposed over MCP.


---

<!-- 135_MCP_RESOURCE.md -->

# MCP Resource

## What / Why
Read-oriented contextual resource exposed by server.

## Mental Model
```text
MCP Resource → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Resource:** Read-oriented contextual resource exposed by server.


---

<!-- 136_MCP_PROMPT.md -->

# MCP Prompt

## What / Why
Reusable prompt template exposed by server.

## Mental Model
```text
MCP Prompt → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Prompt:** Reusable prompt template exposed by server.


---

<!-- 137_MCP_TRANSPORT.md -->

# MCP Transport

## What / Why
Supported transports depend on MCP SDK/integration.

## Mental Model
```text
MCP Transport → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Transport:** Supported transports depend on MCP SDK/integration.


---

<!-- 138_STREAMABLE_HTTP.md -->

# Streamable HTTP

## What / Why
Modern MCP HTTP transport option.

## Mental Model
```text
Streamable HTTP → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streamable HTTP:** Modern MCP HTTP transport option.


---

<!-- 139_SSE_LEGACY_AWARENESS.md -->

# SSE Legacy Awareness

## What / Why
Older MCP transport patterns may use SSE.

## Mental Model
```text
SSE Legacy Awareness → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **SSE Legacy Awareness:** Older MCP transport patterns may use SSE.


---

<!-- 140_MCP_SECURITY_BOUNDARY.md -->

# MCP Security Boundary

## What / Why
Treat MCP server as external trust boundary with authentication, authorization and egress policy.

## Mental Model
```text
MCP Security Boundary → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Security Boundary:** Treat MCP server as external trust boundary with authentication, authorization and egress policy.


---

<!-- 141_MCP_TOOL_DISCOVERY.md -->

# MCP Tool Discovery

## What / Why
Dynamic tool availability reduces static prompt/tool bloat.

## Mental Model
```text
MCP Tool Discovery → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Tool Discovery:** Dynamic tool availability reduces static prompt/tool bloat.


---

<!-- 142_MCP_VS_TOOLCALLBACK.md -->

# MCP vs ToolCallback

## What / Why
MCP is protocol boundary; ToolCallback is local Spring AI tool abstraction.

## Mental Model
```text
MCP vs ToolCallback → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP vs ToolCallback:** MCP is protocol boundary; ToolCallback is local Spring AI tool abstraction.


---

<!-- 143_MCP_VERSION_COMPATIBILITY.md -->

# MCP Version Compatibility

## What / Why
MCP SDK/protocol versions move quickly; pin and test interoperability.

## Mental Model
```text
MCP Version Compatibility → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Version Compatibility:** MCP SDK/protocol versions move quickly; pin and test interoperability.


---

<!-- 144_CHAT_MEMORY_MENTAL_MODEL.md -->

# Chat Memory Mental Model

## What / Why
Stores conversational context for future model requests.

## Mental Model
```text
Chat Memory Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Chat Memory Mental Model:** Stores conversational context for future model requests.


---

<!-- 145_CHATMEMORY.md -->

# ChatMemory

## What / Why
Core memory abstraction.

## Mental Model
```text
ChatMemory → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatMemory:** Core memory abstraction.


---

<!-- 146_CHATMEMORYREPOSITORY.md -->

# ChatMemoryRepository

## What / Why
Persistence abstraction for memory messages.

## Mental Model
```text
ChatMemoryRepository → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatMemoryRepository:** Persistence abstraction for memory messages.


---

<!-- 147_MESSAGE_WINDOW_MEMORY.md -->

# Message Window Memory

## What / Why
Keeps bounded recent message window.

## Mental Model
```text
Message Window Memory → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Message Window Memory:** Keeps bounded recent message window.


---

<!-- 148_INMEMORYCHATMEMORYREPOSITORY.md -->

# InMemoryChatMemoryRepository

## What / Why
Simple in-memory repository.

## Mental Model
```text
InMemoryChatMemoryRepository → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **InMemoryChatMemoryRepository:** Simple in-memory repository.


---

<!-- 149_JDBCCHATMEMORYREPOSITORY.md -->

# JdbcChatMemoryRepository

## What / Why
JDBC-backed memory repository.

## Mental Model
```text
JdbcChatMemoryRepository → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **JdbcChatMemoryRepository:** JDBC-backed memory repository.


---

<!-- 150_CASSANDRA_CHAT_MEMORY.md -->

# Cassandra Chat Memory

## What / Why
Provider-backed repository where supported.

## Mental Model
```text
Cassandra Chat Memory → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Cassandra Chat Memory:** Provider-backed repository where supported.


---

<!-- 151_COSMOSDB_CHAT_MEMORY.md -->

# CosmosDB Chat Memory

## What / Why
Provider-backed repository where supported.

## Mental Model
```text
CosmosDB Chat Memory → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **CosmosDB Chat Memory:** Provider-backed repository where supported.


---

<!-- 152_NEO4J_CHAT_MEMORY.md -->

# Neo4j Chat Memory

## What / Why
Graph-backed repository where supported.

## Mental Model
```text
Neo4j Chat Memory → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Neo4j Chat Memory:** Graph-backed repository where supported.


---

<!-- 153_MONGO_CHAT_MEMORY.md -->

# Mongo Chat Memory

## What / Why
Document-backed repository where supported.

## Mental Model
```text
Mongo Chat Memory → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Mongo Chat Memory:** Document-backed repository where supported.


---

<!-- 154_CONVERSATION_ID.md -->

# Conversation ID

## What / Why
Key that scopes memory; required on requests using memory advisor.

## Mental Model
```text
Conversation ID → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Conversation ID:** Key that scopes memory; required on requests using memory advisor.


---

<!-- 155_MEMORY_WINDOW_SIZE.md -->

# Memory Window Size

## What / Why
Limit history to fit context/cost.

## Mental Model
```text
Memory Window Size → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Memory Window Size:** Limit history to fit context/cost.


---

<!-- 156_MEMORY_VS_FULL_CHAT_HISTORY.md -->

# Memory vs Full Chat History

## What / Why
ChatMemory may maintain only selected history rather than complete audit history.

## Mental Model
```text
Memory vs Full Chat History → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Memory vs Full Chat History:** ChatMemory may maintain only selected history rather than complete audit history.


---

<!-- 157_MEMORY_VS_RAG.md -->

# Memory vs RAG

## What / Why
Conversation memory is user/session context; RAG is external authoritative knowledge.

## Mental Model
```text
Memory vs RAG → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Memory vs RAG:** Conversation memory is user/session context; RAG is external authoritative knowledge.


---

<!-- 158_MEMORY_PRIVACY.md -->

# Memory Privacy

## What / Why
Apply tenant isolation, retention and deletion policies.

## Mental Model
```text
Memory Privacy → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Memory Privacy:** Apply tenant isolation, retention and deletion policies.


---

<!-- 159_MEMORY_POISONING.md -->

# Memory Poisoning

## What / Why
Do not persist arbitrary model/user content as trusted fact without policy.

## Mental Model
```text
Memory Poisoning → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Memory Poisoning:** Do not persist arbitrary model/user content as trusted fact without policy.


---

<!-- 160_EMBEDDING_MENTAL_MODEL.md -->

# Embedding Mental Model

## What / Why
Map content into numerical vector for semantic similarity.

## Mental Model
```text
Embedding Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Embedding Mental Model:** Map content into numerical vector for semantic similarity.


---

<!-- 161_EMBEDDINGMODEL_CALL.md -->

# EmbeddingModel call

## What / Why
Generate embeddings for text/documents.

## Mental Model
```text
EmbeddingModel call → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **EmbeddingModel call:** Generate embeddings for text/documents.


---

<!-- 162_EMBEDDINGREQUEST.md -->

# EmbeddingRequest

## What / Why
Batch embedding input plus options.

## Mental Model
```text
EmbeddingRequest → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **EmbeddingRequest:** Batch embedding input plus options.


---

<!-- 163_EMBEDDINGRESPONSE.md -->

# EmbeddingResponse

## What / Why
Vectors plus metadata.

## Mental Model
```text
EmbeddingResponse → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **EmbeddingResponse:** Vectors plus metadata.


---

<!-- 164_EMBEDDING.md -->

# Embedding

## What / Why
One vector result.

## Mental Model
```text
Embedding → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Embedding:** One vector result.


---

<!-- 165_EMBEDDING_DIMENSION.md -->

# Embedding Dimension

## What / Why
Vector length depends on model.

## Mental Model
```text
Embedding Dimension → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Embedding Dimension:** Vector length depends on model.


---

<!-- 166_DOCUMENT_EMBEDDING.md -->

# Document Embedding

## What / Why
Embed chunk/document content for search.

## Mental Model
```text
Document Embedding → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Document Embedding:** Embed chunk/document content for search.


---

<!-- 167_QUERY_EMBEDDING.md -->

# Query Embedding

## What / Why
Embed user query into same compatible space.

## Mental Model
```text
Query Embedding → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Query Embedding:** Embed user query into same compatible space.


---

<!-- 168_BATCH_EMBEDDING.md -->

# Batch Embedding

## What / Why
Batch inputs for throughput/cost efficiency.

## Mental Model
```text
Batch Embedding → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Batch Embedding:** Batch inputs for throughput/cost efficiency.


---

<!-- 169_EMBEDDING_NORMALIZATION.md -->

# Embedding Normalization

## What / Why
Similarity behavior depends on model/vector-store metric.

## Mental Model
```text
Embedding Normalization → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Embedding Normalization:** Similarity behavior depends on model/vector-store metric.


---

<!-- 170_EMBEDDING_MODEL_CHANGE.md -->

# Embedding Model Change

## What / Why
Changing model usually requires re-embedding/index rebuild.

## Mental Model
```text
Embedding Model Change → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Embedding Model Change:** Changing model usually requires re-embedding/index rebuild.


---

<!-- 171_EMBEDDING_COST.md -->

# Embedding Cost

## What / Why
Ingestion and query embeddings contribute AI cost.

## Mental Model
```text
Embedding Cost → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Embedding Cost:** Ingestion and query embeddings contribute AI cost.


---

<!-- 172_EMBEDDING_OBSERVABILITY.md -->

# Embedding Observability

## What / Why
Measure latency, token/input size and batch behavior.

## Mental Model
```text
Embedding Observability → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Embedding Observability:** Measure latency, token/input size and batch behavior.


---

<!-- 173_VECTORSTORE_MENTAL_MODEL.md -->

# VectorStore Mental Model

## What / Why
Portable abstraction for storing Documents and semantic similarity retrieval.

## Mental Model
```text
VectorStore Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **VectorStore Mental Model:** Portable abstraction for storing Documents and semantic similarity retrieval.


---

<!-- 174_VECTORSTORE_ADD.md -->

# VectorStore add

## What / Why
Insert documents/embeddings.

## Mental Model
```text
VectorStore add → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **VectorStore add:** Insert documents/embeddings.


---

<!-- 175_VECTORSTORE_DELETE.md -->

# VectorStore delete

## What / Why
Remove documents.

## Mental Model
```text
VectorStore delete → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **VectorStore delete:** Remove documents.


---

<!-- 176_SIMILARITYSEARCH.md -->

# similaritySearch

## What / Why
Retrieve semantically similar Documents.

## Mental Model
```text
similaritySearch → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **similaritySearch:** Retrieve semantically similar Documents.


---

<!-- 177_SEARCHREQUEST.md -->

# SearchRequest

## What / Why
Query plus topK/threshold/filter.

## Mental Model
```text
SearchRequest → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **SearchRequest:** Query plus topK/threshold/filter.


---

<!-- 178_TOPK.md -->

# topK

## What / Why
Number of retrieved candidates.

## Mental Model
```text
topK → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **topK:** Number of retrieved candidates.


---

<!-- 179_SIMILARITY_THRESHOLD.md -->

# Similarity Threshold

## What / Why
Minimum relevance cutoff.

## Mental Model
```text
Similarity Threshold → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Similarity Threshold:** Minimum relevance cutoff.


---

<!-- 180_FILTER_EXPRESSION.md -->

# Filter Expression

## What / Why
Portable SQL-like metadata filter expression.

## Mental Model
```text
Filter Expression → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Filter Expression:** Portable SQL-like metadata filter expression.


---

<!-- 181_FILTEREXPRESSIONBUILDER.md -->

# FilterExpressionBuilder

## What / Why
Programmatic metadata-filter construction.

## Mental Model
```text
FilterExpressionBuilder → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **FilterExpressionBuilder:** Programmatic metadata-filter construction.


---

<!-- 182_DYNAMIC_FILTER.md -->

# Dynamic Filter

## What / Why
Inject request-specific tenant/security/domain filtering.

## Mental Model
```text
Dynamic Filter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Dynamic Filter:** Inject request-specific tenant/security/domain filtering.


---

<!-- 183_VECTORSTORERETRIEVER.md -->

# VectorStoreRetriever

## What / Why
Read-only retrieval interface following least privilege.

## Mental Model
```text
VectorStoreRetriever → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **VectorStoreRetriever:** Read-only retrieval interface following least privilege.


---

<!-- 184_DOCUMENT.md -->

# Document

## What / Why
Text plus metadata/id used across RAG/ETL.

## Mental Model
```text
Document → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Document:** Text plus metadata/id used across RAG/ETL.


---

<!-- 185_METADATA.md -->

# Metadata

## What / Why
Structured fields used for filtering/source provenance.

## Mental Model
```text
Metadata → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Metadata:** Structured fields used for filtering/source provenance.


---

<!-- 186_VECTOR_STORE_INITIALIZATION.md -->

# Vector Store Initialization

## What / Why
Schema/index initialization depends on implementation.

## Mental Model
```text
Vector Store Initialization → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Vector Store Initialization:** Schema/index initialization depends on implementation.


---

<!-- 187_VECTOR_STORE_PORTABILITY.md -->

# Vector Store Portability

## What / Why
Capabilities and filtering/performance differ across providers.

## Mental Model
```text
Vector Store Portability → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Vector Store Portability:** Capabilities and filtering/performance differ across providers.


---

<!-- 188_TENANT_FILTER.md -->

# Tenant Filter

## What / Why
Always restrict retrieval by tenant/ACL before context is sent to model.

## Mental Model
```text
Tenant Filter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tenant Filter:** Always restrict retrieval by tenant/ACL before context is sent to model.


---

<!-- 189_PGVECTOR.md -->

# PGvector

## What / Why
PostgreSQL extension-backed vector store.

## Mental Model
```text
PGvector → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **PGvector:** PostgreSQL extension-backed vector store.


---

<!-- 190_PINECONE.md -->

# Pinecone

## What / Why
Managed vector database adapter.

## Mental Model
```text
Pinecone → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Pinecone:** Managed vector database adapter.


---

<!-- 191_MILVUS.md -->

# Milvus

## What / Why
Distributed vector database adapter.

## Mental Model
```text
Milvus → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Milvus:** Distributed vector database adapter.


---

<!-- 192_QDRANT.md -->

# Qdrant

## What / Why
Vector database adapter.

## Mental Model
```text
Qdrant → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Qdrant:** Vector database adapter.


---

<!-- 193_REDIS.md -->

# Redis

## What / Why
Redis vector/search integration.

## Mental Model
```text
Redis → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Redis:** Redis vector/search integration.


---

<!-- 194_ELASTICSEARCH.md -->

# Elasticsearch

## What / Why
Search/vector integration.

## Mental Model
```text
Elasticsearch → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Elasticsearch:** Search/vector integration.


---

<!-- 195_OPENSEARCH.md -->

# OpenSearch

## What / Why
OpenSearch vector integration.

## Mental Model
```text
OpenSearch → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenSearch:** OpenSearch vector integration.


---

<!-- 196_MONGODB_ATLAS_VECTOR.md -->

# MongoDB Atlas Vector

## What / Why
MongoDB vector-search integration.

## Mental Model
```text
MongoDB Atlas Vector → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MongoDB Atlas Vector:** MongoDB vector-search integration.


---

<!-- 197_NEO4J_VECTOR.md -->

# Neo4j Vector

## What / Why
Graph/vector retrieval integration.

## Mental Model
```text
Neo4j Vector → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Neo4j Vector:** Graph/vector retrieval integration.


---

<!-- 198_CASSANDRA_VECTOR.md -->

# Cassandra Vector

## What / Why
Cassandra vector capabilities where supported.

## Mental Model
```text
Cassandra Vector → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Cassandra Vector:** Cassandra vector capabilities where supported.


---

<!-- 199_AZURE_VECTOR_STORES.md -->

# Azure Vector Stores

## What / Why
Azure-oriented integrations such as AI Search/Cosmos variants.

## Mental Model
```text
Azure Vector Stores → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Azure Vector Stores:** Azure-oriented integrations such as AI Search/Cosmos variants.


---

<!-- 200_CHROMA.md -->

# Chroma

## What / Why
Chroma vector-store integration.

## Mental Model
```text
Chroma → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Chroma:** Chroma vector-store integration.


---

<!-- 201_WEAVIATE.md -->

# Weaviate

## What / Why
Weaviate integration.

## Mental Model
```text
Weaviate → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Weaviate:** Weaviate integration.


---

<!-- 202_VECTOR_STORE_SELECTION.md -->

# Vector Store Selection

## What / Why
Choose by filtering, hybrid search, tenancy, operations, scale and cloud ecosystem.

## Mental Model
```text
Vector Store Selection → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Vector Store Selection:** Choose by filtering, hybrid search, tenancy, operations, scale and cloud ecosystem.


---

<!-- 203_RAG_MENTAL_MODEL.md -->

# RAG Mental Model

## What / Why
Retrieve relevant external documents, add them to prompt context, then generate grounded answer.

## Mental Model
```text
RAG Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Mental Model:** Retrieve relevant external documents, add them to prompt context, then generate grounded answer.


---

<!-- 204_RAG_PIPELINE.md -->

# RAG Pipeline

## What / Why
Ingest → split → embed → store → retrieve → postprocess → augment → generate.

## Mental Model
```text
RAG Pipeline → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Pipeline:** Ingest → split → embed → store → retrieve → postprocess → augment → generate.


---

<!-- 205_NAIVE_RAG.md -->

# Naive RAG

## What / Why
One query → vector search → context → model.

## Mental Model
```text
Naive RAG → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Naive RAG:** One query → vector search → context → model.


---

<!-- 206_QUESTIONANSWERADVISOR_RAG.md -->

# QuestionAnswerAdvisor RAG

## What / Why
High-level vector-store RAG advisor.

## Mental Model
```text
QuestionAnswerAdvisor RAG → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **QuestionAnswerAdvisor RAG:** High-level vector-store RAG advisor.


---

<!-- 207_RETRIEVALAUGMENTATIONADVISOR.md -->

# RetrievalAugmentationAdvisor

## What / Why
Modular RAG implementation composed from transformers/retrievers/postprocessors/augmenters.

## Mental Model
```text
RetrievalAugmentationAdvisor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RetrievalAugmentationAdvisor:** Modular RAG implementation composed from transformers/retrievers/postprocessors/augmenters.


---

<!-- 208_RAG_EMPTY_CONTEXT.md -->

# RAG Empty Context

## What / Why
Default modular advisor can refuse answering when no context is found.

## Mental Model
```text
RAG Empty Context → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Empty Context:** Default modular advisor can refuse answering when no context is found.


---

<!-- 209_RAG_FILTER_PARAM.md -->

# RAG Filter Param

## What / Why
Advisor context can carry dynamic filter expression.

## Mental Model
```text
RAG Filter Param → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Filter Param:** Advisor context can carry dynamic filter expression.


---

<!-- 210_RAG_SIMILARITY_THRESHOLD.md -->

# RAG Similarity Threshold

## What / Why
Tune threshold using evaluation data.

## Mental Model
```text
RAG Similarity Threshold → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Similarity Threshold:** Tune threshold using evaluation data.


---

<!-- 211_RAG_TOPK.md -->

# RAG topK

## What / Why
Tune candidate count based on retrieval quality/context size.

## Mental Model
```text
RAG topK → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG topK:** Tune candidate count based on retrieval quality/context size.


---

<!-- 212_RAG_SECURITY.md -->

# RAG Security

## What / Why
Apply ACL/tenant filtering before retrieved documents enter model context.

## Mental Model
```text
RAG Security → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Security:** Apply ACL/tenant filtering before retrieved documents enter model context.


---

<!-- 213_RAG_CITATION_STRATEGY.md -->

# RAG Citation Strategy

## What / Why
Carry document source/page/ID metadata into answer rendering.

## Mental Model
```text
RAG Citation Strategy → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Citation Strategy:** Carry document source/page/ID metadata into answer rendering.


---

<!-- 214_RAG_EVALUATION.md -->

# RAG Evaluation

## What / Why
Evaluate retrieval and answer quality separately.

## Mental Model
```text
RAG Evaluation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Evaluation:** Evaluate retrieval and answer quality separately.


---

<!-- 215_QUERY.md -->

# Query

## What / Why
RAG query object including text/context/parameters.

## Mental Model
```text
Query → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Query:** RAG query object including text/context/parameters.


---

<!-- 216_QUERYTRANSFORMER.md -->

# QueryTransformer

## What / Why
Transforms incoming query before retrieval.

## Mental Model
```text
QueryTransformer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **QueryTransformer:** Transforms incoming query before retrieval.


---

<!-- 217_REWRITEQUERYTRANSFORMER.md -->

# RewriteQueryTransformer

## What / Why
Rewrites query for better search.

## Mental Model
```text
RewriteQueryTransformer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RewriteQueryTransformer:** Rewrites query for better search.


---

<!-- 218_COMPRESSIONQUERYTRANSFORMER.md -->

# CompressionQueryTransformer

## What / Why
Compresses conversation + follow-up into standalone query.

## Mental Model
```text
CompressionQueryTransformer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **CompressionQueryTransformer:** Compresses conversation + follow-up into standalone query.


---

<!-- 219_TRANSLATIONQUERYTRANSFORMER.md -->

# TranslationQueryTransformer

## What / Why
Translates query when cross-language retrieval is needed.

## Mental Model
```text
TranslationQueryTransformer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **TranslationQueryTransformer:** Translates query when cross-language retrieval is needed.


---

<!-- 220_QUERYEXPANDER.md -->

# QueryExpander

## What / Why
Generates multiple related queries.

## Mental Model
```text
QueryExpander → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **QueryExpander:** Generates multiple related queries.


---

<!-- 221_MULTIQUERYEXPANDER.md -->

# MultiQueryExpander

## What / Why
Creates alternative queries and optionally includes original.

## Mental Model
```text
MultiQueryExpander → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MultiQueryExpander:** Creates alternative queries and optionally includes original.


---

<!-- 222_LOW_TEMPERATURE_QUERY_TRANSFORM.md -->

# Low Temperature Query Transform

## What / Why
Use deterministic model settings for query transformation.

## Mental Model
```text
Low Temperature Query Transform → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Low Temperature Query Transform:** Use deterministic model settings for query transformation.


---

<!-- 223_PRE_RETRIEVAL_RISK.md -->

# Pre Retrieval Risk

## What / Why
Query rewrite can distort intent; log/evaluate transformed query.

## Mental Model
```text
Pre Retrieval Risk → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Pre Retrieval Risk:** Query rewrite can distort intent; log/evaluate transformed query.


---

<!-- 224_DOCUMENTRETRIEVER.md -->

# DocumentRetriever

## What / Why
Retrieves Documents from a knowledge source.

## Mental Model
```text
DocumentRetriever → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **DocumentRetriever:** Retrieves Documents from a knowledge source.


---

<!-- 225_VECTORSTOREDOCUMENTRETRIEVER.md -->

# VectorStoreDocumentRetriever

## What / Why
VectorStore-based retriever.

## Mental Model
```text
VectorStoreDocumentRetriever → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **VectorStoreDocumentRetriever:** VectorStore-based retriever.


---

<!-- 226_RETRIEVER_THRESHOLD.md -->

# Retriever Threshold

## What / Why
Similarity threshold in retriever.

## Mental Model
```text
Retriever Threshold → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Retriever Threshold:** Similarity threshold in retriever.


---

<!-- 227_RETRIEVER_TOPK.md -->

# Retriever topK

## What / Why
Candidate count.

## Mental Model
```text
Retriever topK → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Retriever topK:** Candidate count.


---

<!-- 228_RETRIEVER_FILTER.md -->

# Retriever Filter

## What / Why
Static/dynamic metadata filter.

## Mental Model
```text
Retriever Filter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Retriever Filter:** Static/dynamic metadata filter.


---

<!-- 229_SUPPLIER_FILTER.md -->

# Supplier Filter

## What / Why
Compute filter dynamically per request.

## Mental Model
```text
Supplier Filter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Supplier Filter:** Compute filter dynamically per request.


---

<!-- 230_FEDERATED_RETRIEVER_PATTERN.md -->

# Federated Retriever Pattern

## What / Why
Combine multiple domain retrievers behind custom DocumentRetriever.

## Mental Model
```text
Federated Retriever Pattern → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Federated Retriever Pattern:** Combine multiple domain retrievers behind custom DocumentRetriever.


---

<!-- 231_READ_ONLY_RETRIEVER.md -->

# Read Only Retriever

## What / Why
Prefer VectorStoreRetriever where mutation is not needed.

## Mental Model
```text
Read Only Retriever → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Read Only Retriever:** Prefer VectorStoreRetriever where mutation is not needed.


---

<!-- 232_DOCUMENTPOSTPROCESSOR.md -->

# DocumentPostProcessor

## What / Why
Transforms/reranks/compresses retrieved documents.

## Mental Model
```text
DocumentPostProcessor → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **DocumentPostProcessor:** Transforms/reranks/compresses retrieved documents.


---

<!-- 233_RERANKING.md -->

# Reranking

## What / Why
Use stronger relevance model to reorder candidates.

## Mental Model
```text
Reranking → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Reranking:** Use stronger relevance model to reorder candidates.


---

<!-- 234_DEDUPLICATION.md -->

# Deduplication

## What / Why
Remove redundant chunks.

## Mental Model
```text
Deduplication → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Deduplication:** Remove redundant chunks.


---

<!-- 235_CONTEXT_COMPRESSION.md -->

# Context Compression

## What / Why
Reduce noise/token usage while preserving evidence.

## Mental Model
```text
Context Compression → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Context Compression:** Reduce noise/token usage while preserving evidence.


---

<!-- 236_SOURCE_PRIORITIZATION.md -->

# Source Prioritization

## What / Why
Prefer trusted/fresh sources.

## Mental Model
```text
Source Prioritization → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Source Prioritization:** Prefer trusted/fresh sources.


---

<!-- 237_POST_RETRIEVAL_EVALUATION.md -->

# Post Retrieval Evaluation

## What / Why
Measure whether postprocessing improves precision without damaging recall.

## Mental Model
```text
Post Retrieval Evaluation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Post Retrieval Evaluation:** Measure whether postprocessing improves precision without damaging recall.


---

<!-- 238_QUERYAUGMENTER.md -->

# QueryAugmenter

## What / Why
Augments prompt with retrieved context.

## Mental Model
```text
QueryAugmenter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **QueryAugmenter:** Augments prompt with retrieved context.


---

<!-- 239_CONTEXTUALQUERYAUGMENTER.md -->

# ContextualQueryAugmenter

## What / Why
Default-style augmentation with context.

## Mental Model
```text
ContextualQueryAugmenter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ContextualQueryAugmenter:** Default-style augmentation with context.


---

<!-- 240_ALLOW_EMPTY_CONTEXT.md -->

# Allow Empty Context

## What / Why
Configure whether model may answer without retrieved evidence.

## Mental Model
```text
Allow Empty Context → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Allow Empty Context:** Configure whether model may answer without retrieved evidence.


---

<!-- 241_CUSTOM_RAG_PROMPTTEMPLATE.md -->

# Custom RAG PromptTemplate

## What / Why
Control how query and retrieved context are merged.

## Mental Model
```text
Custom RAG PromptTemplate → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Custom RAG PromptTemplate:** Control how query and retrieved context are merged.


---

<!-- 242_QUESTION_ANSWER_CONTEXT.md -->

# question_answer_context

## What / Why
Required placeholder in custom QuestionAnswerAdvisor prompt template.

## Mental Model
```text
question_answer_context → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **question_answer_context:** Required placeholder in custom QuestionAnswerAdvisor prompt template.


---

<!-- 243_QUERY_PLACEHOLDER.md -->

# query Placeholder

## What / Why
Required query placeholder in custom RAG prompt.

## Mental Model
```text
query Placeholder → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **query Placeholder:** Required query placeholder in custom RAG prompt.


---

<!-- 244_GROUNDING_INSTRUCTION.md -->

# Grounding Instruction

## What / Why
Explicitly constrain answer to retrieved evidence where business requires.

## Mental Model
```text
Grounding Instruction → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Grounding Instruction:** Explicitly constrain answer to retrieved evidence where business requires.


---

<!-- 245_ETL_MENTAL_MODEL.md -->

# ETL Mental Model

## What / Why
Extract documents → transform/split/enrich → write to vector store.

## Mental Model
```text
ETL Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ETL Mental Model:** Extract documents → transform/split/enrich → write to vector store.


---

<!-- 246_DOCUMENTREADER.md -->

# DocumentReader

## What / Why
Reads source content into Documents.

## Mental Model
```text
DocumentReader → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **DocumentReader:** Reads source content into Documents.


---

<!-- 247_DOCUMENTTRANSFORMER.md -->

# DocumentTransformer

## What / Why
Transforms/splits/enriches Documents.

## Mental Model
```text
DocumentTransformer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **DocumentTransformer:** Transforms/splits/enriches Documents.


---

<!-- 248_DOCUMENTWRITER.md -->

# DocumentWriter

## What / Why
Writes Documents to destination/vector store.

## Mental Model
```text
DocumentWriter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **DocumentWriter:** Writes Documents to destination/vector store.


---

<!-- 249_TEXTREADER.md -->

# TextReader

## What / Why
Reads text resources.

## Mental Model
```text
TextReader → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **TextReader:** Reads text resources.


---

<!-- 250_JSONREADER.md -->

# JsonReader

## What / Why
Reads JSON content.

## Mental Model
```text
JsonReader → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **JsonReader:** Reads JSON content.


---

<!-- 251_PAGEPDFDOCUMENTREADER.md -->

# PagePdfDocumentReader

## What / Why
Page-oriented PDF extraction.

## Mental Model
```text
PagePdfDocumentReader → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **PagePdfDocumentReader:** Page-oriented PDF extraction.


---

<!-- 252_PARAGRAPHPDFDOCUMENTREADER.md -->

# ParagraphPdfDocumentReader

## What / Why
Paragraph-oriented PDF extraction.

## Mental Model
```text
ParagraphPdfDocumentReader → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ParagraphPdfDocumentReader:** Paragraph-oriented PDF extraction.


---

<!-- 253_TIKADOCUMENTREADER.md -->

# TikaDocumentReader

## What / Why
Apache Tika-based multi-format extraction.

## Mental Model
```text
TikaDocumentReader → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **TikaDocumentReader:** Apache Tika-based multi-format extraction.


---

<!-- 254_TOKENTEXTSPLITTER.md -->

# TokenTextSplitter

## What / Why
Splits content by token count.

## Mental Model
```text
TokenTextSplitter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **TokenTextSplitter:** Splits content by token count.


---

<!-- 255_METADATA_ENRICHMENT.md -->

# Metadata Enrichment

## What / Why
Attach source, tenant, version, page, permissions and timestamps.

## Mental Model
```text
Metadata Enrichment → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Metadata Enrichment:** Attach source, tenant, version, page, permissions and timestamps.


---

<!-- 256_CHUNK_ID.md -->

# Chunk ID

## What / Why
Stable document/chunk IDs help incremental update/delete.

## Mental Model
```text
Chunk ID → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Chunk ID:** Stable document/chunk IDs help incremental update/delete.


---

<!-- 257_INCREMENTAL_INGESTION.md -->

# Incremental Ingestion

## What / Why
Only reprocess changed source material.

## Mental Model
```text
Incremental Ingestion → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Incremental Ingestion:** Only reprocess changed source material.


---

<!-- 258_INGESTION_IDEMPOTENCY.md -->

# Ingestion Idempotency

## What / Why
Repeated ingestion should not duplicate uncontrolled vectors.

## Mental Model
```text
Ingestion Idempotency → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Ingestion Idempotency:** Repeated ingestion should not duplicate uncontrolled vectors.


---

<!-- 259_INGESTION_PIPELINE_VERSION.md -->

# Ingestion Pipeline Version

## What / Why
Track parser/splitter/embedding versions.

## Mental Model
```text
Ingestion Pipeline Version → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Ingestion Pipeline Version:** Track parser/splitter/embedding versions.


---

<!-- 260_PAGE_RANGE_PDF.md -->

# Page Range PDF

## What / Why
2.0.1 supports configurable page ranges in PagePdfDocumentReader.

## Mental Model
```text
Page Range PDF → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Page Range PDF:** 2.0.1 supports configurable page ranges in PagePdfDocumentReader.


---

<!-- 261_EVALUATION_MENTAL_MODEL.md -->

# Evaluation Mental Model

## What / Why
Measure AI output against explicit quality/grounding criteria before and after deployment.

## Mental Model
```text
Evaluation Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Evaluation Mental Model:** Measure AI output against explicit quality/grounding criteria before and after deployment.


---

<!-- 262_EVALUATOR.md -->

# Evaluator

## What / Why
Spring AI evaluation abstraction.

## Mental Model
```text
Evaluator → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Evaluator:** Spring AI evaluation abstraction.


---

<!-- 263_RELEVANCYEVALUATOR.md -->

# RelevancyEvaluator

## What / Why
Scores answer relevance.

## Mental Model
```text
RelevancyEvaluator → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RelevancyEvaluator:** Scores answer relevance.


---

<!-- 264_FACTCHECKINGEVALUATOR.md -->

# FactCheckingEvaluator

## What / Why
Checks response against supplied context/evidence.

## Mental Model
```text
FactCheckingEvaluator → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **FactCheckingEvaluator:** Checks response against supplied context/evidence.


---

<!-- 265_EVALUATIONREQUEST.md -->

# EvaluationRequest

## What / Why
Input to evaluator including query/response/context.

## Mental Model
```text
EvaluationRequest → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **EvaluationRequest:** Input to evaluator including query/response/context.


---

<!-- 266_EVALUATIONRESPONSE.md -->

# EvaluationResponse

## What / Why
Evaluation result/score/passing state.

## Mental Model
```text
EvaluationResponse → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **EvaluationResponse:** Evaluation result/score/passing state.


---

<!-- 267_RAG_FAITHFULNESS.md -->

# RAG Faithfulness

## What / Why
Check answer claims against retrieved documents.

## Mental Model
```text
RAG Faithfulness → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Faithfulness:** Check answer claims against retrieved documents.


---

<!-- 268_GOLDEN_DATASET.md -->

# Golden Dataset

## What / Why
Version representative prompts/expected criteria.

## Mental Model
```text
Golden Dataset → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Golden Dataset:** Version representative prompts/expected criteria.


---

<!-- 269_REGRESSION_EVALUATION.md -->

# Regression Evaluation

## What / Why
Run same evaluation suite across model/prompt/RAG changes.

## Mental Model
```text
Regression Evaluation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Regression Evaluation:** Run same evaluation suite across model/prompt/RAG changes.


---

<!-- 270_LLM_JUDGE_RISK.md -->

# LLM Judge Risk

## What / Why
Model-based evaluators need calibration and cannot be sole high-stakes validator.

## Mental Model
```text
LLM Judge Risk → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **LLM Judge Risk:** Model-based evaluators need calibration and cannot be sole high-stakes validator.


---

<!-- 271_HUMAN_EVALUATION.md -->

# Human Evaluation

## What / Why
Use human review for nuanced/critical cases.

## Mental Model
```text
Human Evaluation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Human Evaluation:** Use human review for nuanced/critical cases.


---

<!-- 272_ONLINE_EVALUATION.md -->

# Online Evaluation

## What / Why
Sample production traces for quality analysis.

## Mental Model
```text
Online Evaluation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Online Evaluation:** Sample production traces for quality analysis.


---

<!-- 273_SPRING_AI_OBSERVABILITY.md -->

# Spring AI Observability

## What / Why
Micrometer-based observations around model/vector-store/tool operations.

## Mental Model
```text
Spring AI Observability → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI Observability:** Micrometer-based observations around model/vector-store/tool operations.


---

<!-- 274_CHAT_MODEL_OBSERVATION.md -->

# Chat Model Observation

## What / Why
Captures model operation timing/metadata.

## Mental Model
```text
Chat Model Observation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Chat Model Observation:** Captures model operation timing/metadata.


---

<!-- 275_EMBEDDING_MODEL_OBSERVATION.md -->

# Embedding Model Observation

## What / Why
Captures embedding operations.

## Mental Model
```text
Embedding Model Observation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Embedding Model Observation:** Captures embedding operations.


---

<!-- 276_VECTOR_STORE_OBSERVATION.md -->

# Vector Store Observation

## What / Why
Captures vector-store operations.

## Mental Model
```text
Vector Store Observation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Vector Store Observation:** Captures vector-store operations.


---

<!-- 277_TOOL_CALLING_OBSERVATION.md -->

# Tool Calling Observation

## What / Why
Trace tool execution and model tool loop.

## Mental Model
```text
Tool Calling Observation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Calling Observation:** Trace tool execution and model tool loop.


---

<!-- 278_ADVISOR_OBSERVATION.md -->

# Advisor Observation

## What / Why
Observe advisor chain where supported.

## Mental Model
```text
Advisor Observation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Advisor Observation:** Observe advisor chain where supported.


---

<!-- 279_PROMPT_LOGGING_RISK.md -->

# Prompt Logging Risk

## What / Why
Prompts may contain secrets/PII; logging requires explicit policy.

## Mental Model
```text
Prompt Logging Risk → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Logging Risk:** Prompts may contain secrets/PII; logging requires explicit policy.


---

<!-- 280_COMPLETION_LOGGING_RISK.md -->

# Completion Logging Risk

## What / Why
Model outputs may contain sensitive or generated unsafe content.

## Mental Model
```text
Completion Logging Risk → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Completion Logging Risk:** Model outputs may contain sensitive or generated unsafe content.


---

<!-- 281_TOKEN_USAGE.md -->

# Token Usage

## What / Why
Track input/output/total token usage where provider supplies it.

## Mental Model
```text
Token Usage → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Token Usage:** Track input/output/total token usage where provider supplies it.


---

<!-- 282_AI_COST_ATTRIBUTION.md -->

# AI Cost Attribution

## What / Why
Combine usage metadata with model pricing outside/alongside observations.

## Mental Model
```text
AI Cost Attribution → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **AI Cost Attribution:** Combine usage metadata with model pricing outside/alongside observations.


---

<!-- 283_TRACE_CORRELATION.md -->

# Trace Correlation

## What / Why
Link HTTP request → ChatClient → RAG → model → tools.

## Mental Model
```text
Trace Correlation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Trace Correlation:** Link HTTP request → ChatClient → RAG → model → tools.


---

<!-- 284_LOW_CARDINALITY_TAGS.md -->

# Low Cardinality Tags

## What / Why
Avoid prompt/user text as metric labels.

## Mental Model
```text
Low Cardinality Tags → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Low Cardinality Tags:** Avoid prompt/user text as metric labels.


---

<!-- 285_OBSERVATION_CONVENTION.md -->

# Observation Convention

## What / Why
Customize observation metadata carefully.

## Mental Model
```text
Observation Convention → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Observation Convention:** Customize observation metadata carefully.


---

<!-- 286_MULTIMODAL_PROMPT.md -->

# Multimodal Prompt

## What / Why
Messages may contain text plus image/audio/file media depending provider.

## Mental Model
```text
Multimodal Prompt → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Multimodal Prompt:** Messages may contain text plus image/audio/file media depending provider.


---

<!-- 287_MEDIA_TYPE.md -->

# Media Type

## What / Why
Media carries MIME type and data/resource/url.

## Mental Model
```text
Media Type → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Media Type:** Media carries MIME type and data/resource/url.


---

<!-- 288_IMAGE_INPUT.md -->

# Image Input

## What / Why
Vision-capable chat models can process images.

## Mental Model
```text
Image Input → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Image Input:** Vision-capable chat models can process images.


---

<!-- 289_AUDIO_INPUT.md -->

# Audio Input

## What / Why
Provider/model-specific chat or audio APIs can process audio.

## Mental Model
```text
Audio Input → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Audio Input:** Provider/model-specific chat or audio APIs can process audio.


---

<!-- 290_TEXT_TO_IMAGE.md -->

# Text to Image

## What / Why
ImageModel generates visual output.

## Mental Model
```text
Text to Image → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Text to Image:** ImageModel generates visual output.


---

<!-- 291_SPEECH_TO_TEXT.md -->

# Speech to Text

## What / Why
Transcription model converts audio to text.

## Mental Model
```text
Speech to Text → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Speech to Text:** Transcription model converts audio to text.


---

<!-- 292_TEXT_TO_SPEECH.md -->

# Text to Speech

## What / Why
AudioSpeechModel generates speech.

## Mental Model
```text
Text to Speech → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Text to Speech:** AudioSpeechModel generates speech.


---

<!-- 293_STREAMING_SPEECH.md -->

# Streaming Speech

## What / Why
Spring AI 2.0.1 adds audio streaming support for OpenAI speech model.

## Mental Model
```text
Streaming Speech → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Speech:** Spring AI 2.0.1 adds audio streaming support for OpenAI speech model.


---

<!-- 294_MULTIMODAL_PORTABILITY.md -->

# Multimodal Portability

## What / Why
Media support varies significantly between providers.

## Mental Model
```text
Multimodal Portability → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Multimodal Portability:** Media support varies significantly between providers.


---

<!-- 295_LARGE_MEDIA.md -->

# Large Media

## What / Why
Prefer references/object storage where provider supports instead of loading huge binaries in JVM memory.

## Mental Model
```text
Large Media → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Large Media:** Prefer references/object storage where provider supports instead of loading huge binaries in JVM memory.


---

<!-- 296_OPENAI_CHAT.md -->

# OpenAI Chat

## What / Why
Spring AI adapter for OpenAI-compatible chat APIs.

## Mental Model
```text
OpenAI Chat → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Chat:** Spring AI adapter for OpenAI-compatible chat APIs.


---

<!-- 297_OPENAI_CHAT_OPTIONS.md -->

# OpenAI Chat Options

## What / Why
Provider-specific model/temperature/tool/response options.

## Mental Model
```text
OpenAI Chat Options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Chat Options:** Provider-specific model/temperature/tool/response options.


---

<!-- 298_OPENAI_EMBEDDINGS.md -->

# OpenAI Embeddings

## What / Why
Embedding model integration.

## Mental Model
```text
OpenAI Embeddings → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Embeddings:** Embedding model integration.


---

<!-- 299_OPENAI_IMAGE.md -->

# OpenAI Image

## What / Why
Image generation integration.

## Mental Model
```text
OpenAI Image → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Image:** Image generation integration.


---

<!-- 300_OPENAI_AUDIO.md -->

# OpenAI Audio

## What / Why
Speech/transcription integration.

## Mental Model
```text
OpenAI Audio → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Audio:** Speech/transcription integration.


---

<!-- 301_OPENAI_STRUCTURED_OUTPUT.md -->

# OpenAI Structured Output

## What / Why
Provider-native structured-output support where model/API allows.

## Mental Model
```text
OpenAI Structured Output → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Structured Output:** Provider-native structured-output support where model/API allows.


---

<!-- 302_OPENAI_TOOL_CALLING.md -->

# OpenAI Tool Calling

## What / Why
Native function/tool call mapping.

## Mental Model
```text
OpenAI Tool Calling → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Tool Calling:** Native function/tool call mapping.


---

<!-- 303_OPENAI_STREAMING.md -->

# OpenAI Streaming

## What / Why
Flux-based response streaming.

## Mental Model
```text
OpenAI Streaming → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Streaming:** Flux-based response streaming.


---

<!-- 304_OPENAI_COMPATIBILITY.md -->

# OpenAI Compatibility

## What / Why
OpenAI-compatible third-party endpoints may differ in supported fields.

## Mental Model
```text
OpenAI Compatibility → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OpenAI Compatibility:** OpenAI-compatible third-party endpoints may differ in supported fields.


---

<!-- 305_ANTHROPIC_CHAT.md -->

# Anthropic Chat

## What / Why
Claude model adapter.

## Mental Model
```text
Anthropic Chat → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Anthropic Chat:** Claude model adapter.


---

<!-- 306_ANTHROPIC_OPTIONS.md -->

# Anthropic Options

## What / Why
Provider-specific model/thinking/tool options.

## Mental Model
```text
Anthropic Options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Anthropic Options:** Provider-specific model/thinking/tool options.


---

<!-- 307_ANTHROPIC_TOOL_CALLING.md -->

# Anthropic Tool Calling

## What / Why
Tool-use mapping.

## Mental Model
```text
Anthropic Tool Calling → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Anthropic Tool Calling:** Tool-use mapping.


---

<!-- 308_ANTHROPIC_STREAMING.md -->

# Anthropic Streaming

## What / Why
Streaming content blocks mapped into Spring AI responses.

## Mental Model
```text
Anthropic Streaming → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Anthropic Streaming:** Streaming content blocks mapped into Spring AI responses.


---

<!-- 309_ANTHROPIC_PROMPT_CACHING_AWARENESS.md -->

# Anthropic Prompt Caching Awareness

## What / Why
Provider-native cache capabilities require provider-specific options.

## Mental Model
```text
Anthropic Prompt Caching Awareness → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Anthropic Prompt Caching Awareness:** Provider-native cache capabilities require provider-specific options.


---

<!-- 310_GOOGLE_GENAI.md -->

# Google GenAI

## What / Why
Google GenAI model adapter.

## Mental Model
```text
Google GenAI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Google GenAI:** Google GenAI model adapter.


---

<!-- 311_GEMINI_CHAT.md -->

# Gemini Chat

## What / Why
Gemini family through Google GenAI integration.

## Mental Model
```text
Gemini Chat → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Gemini Chat:** Gemini family through Google GenAI integration.


---

<!-- 312_GOOGLE_TOOL_CALLING.md -->

# Google Tool Calling

## What / Why
ToolChoice and tool calling support.

## Mental Model
```text
Google Tool Calling → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Google Tool Calling:** ToolChoice and tool calling support.


---

<!-- 313_GOOGLE_MULTIMODALITY.md -->

# Google Multimodality

## What / Why
Gemini media capabilities.

## Mental Model
```text
Google Multimodality → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Google Multimodality:** Gemini media capabilities.


---

<!-- 314_GOOGLE_EMBEDDINGS.md -->

# Google Embeddings

## What / Why
Embedding integration where supported.

## Mental Model
```text
Google Embeddings → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Google Embeddings:** Embedding integration where supported.


---

<!-- 315_AZURE_OPENAI.md -->

# Azure OpenAI

## What / Why
Azure-hosted OpenAI model integration.

## Mental Model
```text
Azure OpenAI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Azure OpenAI:** Azure-hosted OpenAI model integration.


---

<!-- 316_DEPLOYMENT_NAME.md -->

# Deployment Name

## What / Why
Azure often routes through deployment identifiers rather than direct public model name.

## Mental Model
```text
Deployment Name → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Deployment Name:** Azure often routes through deployment identifiers rather than direct public model name.


---

<!-- 317_AZURE_CREDENTIALS.md -->

# Azure Credentials

## What / Why
API key or Azure identity patterns depending integration.

## Mental Model
```text
Azure Credentials → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Azure Credentials:** API key or Azure identity patterns depending integration.


---

<!-- 318_AZURE_ENDPOINT.md -->

# Azure Endpoint

## What / Why
Resource/deployment endpoint configuration.

## Mental Model
```text
Azure Endpoint → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Azure Endpoint:** Resource/deployment endpoint configuration.


---

<!-- 319_AZURE_OPENAI_OPTIONS.md -->

# Azure OpenAI Options

## What / Why
Provider-specific configuration.

## Mental Model
```text
Azure OpenAI Options → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Azure OpenAI Options:** Provider-specific configuration.


---

<!-- 320_BEDROCK_CONVERSE.md -->

# Bedrock Converse

## What / Why
Amazon Bedrock Converse API integration.

## Mental Model
```text
Bedrock Converse → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Bedrock Converse:** Amazon Bedrock Converse API integration.


---

<!-- 321_BEDROCK_MODEL_IDS.md -->

# Bedrock Model IDs

## What / Why
Provider/model identifiers vary across Bedrock foundation models.

## Mental Model
```text
Bedrock Model IDs → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Bedrock Model IDs:** Provider/model identifiers vary across Bedrock foundation models.


---

<!-- 322_BEDROCK_CREDENTIALS.md -->

# Bedrock Credentials

## What / Why
AWS credential provider chain.

## Mental Model
```text
Bedrock Credentials → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Bedrock Credentials:** AWS credential provider chain.


---

<!-- 323_BEDROCK_TOOL_CALLING.md -->

# Bedrock Tool Calling

## What / Why
Converse tool-use mapping where model supports it.

## Mental Model
```text
Bedrock Tool Calling → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Bedrock Tool Calling:** Converse tool-use mapping where model supports it.


---

<!-- 324_BEDROCK_STREAMING.md -->

# Bedrock Streaming

## What / Why
Streaming Converse responses.

## Mental Model
```text
Bedrock Streaming → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Bedrock Streaming:** Streaming Converse responses.


---

<!-- 325_OLLAMA.md -->

# Ollama

## What / Why
Local/self-hosted model adapter.

## Mental Model
```text
Ollama → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Ollama:** Local/self-hosted model adapter.


---

<!-- 326_OLLAMA_CHAT.md -->

# Ollama Chat

## What / Why
Chat model integration.

## Mental Model
```text
Ollama Chat → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Ollama Chat:** Chat model integration.


---

<!-- 327_OLLAMA_EMBEDDINGS.md -->

# Ollama Embeddings

## What / Why
Local embedding integration.

## Mental Model
```text
Ollama Embeddings → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Ollama Embeddings:** Local embedding integration.


---

<!-- 328_OLLAMA_TOOL_CALLING.md -->

# Ollama Tool Calling

## What / Why
Depends on model and Ollama capabilities.

## Mental Model
```text
Ollama Tool Calling → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Ollama Tool Calling:** Depends on model and Ollama capabilities.


---

<!-- 329_OLLAMA_THINKING.md -->

# Ollama Thinking

## What / Why
Reasoning/thinking metadata options for compatible models.

## Mental Model
```text
Ollama Thinking → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Ollama Thinking:** Reasoning/thinking metadata options for compatible models.


---

<!-- 330_LOCAL_MODEL_TRADEOFF.md -->

# Local Model Tradeoff

## What / Why
Privacy/control vs local compute, model quality and operations.

## Mental Model
```text
Local Model Tradeoff → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Local Model Tradeoff:** Privacy/control vs local compute, model quality and operations.


---

<!-- 331_DEEPSEEK.md -->

# DeepSeek

## What / Why
Spring AI chat integration.

## Mental Model
```text
DeepSeek → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **DeepSeek:** Spring AI chat integration.


---

<!-- 332_MISTRAL_AI.md -->

# Mistral AI

## What / Why
Mistral model integration.

## Mental Model
```text
Mistral AI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Mistral AI:** Mistral model integration.


---

<!-- 333_GROQ.md -->

# Groq

## What / Why
Low-latency inference provider integration.

## Mental Model
```text
Groq → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Groq:** Low-latency inference provider integration.


---

<!-- 334_NVIDIA.md -->

# NVIDIA

## What / Why
NVIDIA model/inference integration.

## Mental Model
```text
NVIDIA → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **NVIDIA:** NVIDIA model/inference integration.


---

<!-- 335_OCI_GENAI.md -->

# OCI GenAI

## What / Why
Oracle Cloud GenAI integration.

## Mental Model
```text
OCI GenAI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **OCI GenAI:** Oracle Cloud GenAI integration.


---

<!-- 336_PERPLEXITY.md -->

# Perplexity

## What / Why
Search-oriented model provider integration.

## Mental Model
```text
Perplexity → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Perplexity:** Search-oriented model provider integration.


---

<!-- 337_MINIMAX.md -->

# MiniMax

## What / Why
Provider integration.

## Mental Model
```text
MiniMax → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MiniMax:** Provider integration.


---

<!-- 338_PROVIDER_MIGRATION.md -->

# Provider Migration

## What / Why
Use portable ChatClient/Model APIs but regression-test prompts/tools/structured output when switching provider.

## Mental Model
```text
Provider Migration → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Provider Migration:** Use portable ChatClient/Model APIs but regression-test prompts/tools/structured output when switching provider.


---

<!-- 339_STREAMING_MENTAL_MODEL.md -->

# Streaming Mental Model

## What / Why
Streaming exposes incremental model output as Flux.

## Mental Model
```text
Streaming Mental Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Mental Model:** Streaming exposes incremental model output as Flux.


---

<!-- 340_CHATCLIENT_STREAM_CONTENT.md -->

# ChatClient stream content

## What / Why
Returns Flux of content chunks.

## Mental Model
```text
ChatClient stream content → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatClient stream content:** Returns Flux of content chunks.


---

<!-- 341_STREAMING_CHATRESPONSE.md -->

# Streaming ChatResponse

## What / Why
Expose richer streamed response objects.

## Mental Model
```text
Streaming ChatResponse → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming ChatResponse:** Expose richer streamed response objects.


---

<!-- 342_BACKPRESSURE_CAVEAT.md -->

# Backpressure Caveat

## What / Why
Provider token streams are network push-like; Reactive Streams buffering still exists between layers.

## Mental Model
```text
Backpressure Caveat → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Backpressure Caveat:** Provider token streams are network push-like; Reactive Streams buffering still exists between layers.


---

<!-- 343_STREAMING_TOOL_CALLS.md -->

# Streaming Tool Calls

## What / Why
Tool call arguments/results may arrive across deltas and require framework aggregation.

## Mental Model
```text
Streaming Tool Calls → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Tool Calls:** Tool call arguments/results may arrive across deltas and require framework aggregation.


---

<!-- 344_STREAMING_USAGE.md -->

# Streaming Usage

## What / Why
Usage metadata can differ from non-streaming behavior/provider.

## Mental Model
```text
Streaming Usage → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Usage:** Usage metadata can differ from non-streaming behavior/provider.


---

<!-- 345_SSE_ENDPOINT.md -->

# SSE Endpoint

## What / Why
Expose model Flux through WebFlux SSE.

## Mental Model
```text
SSE Endpoint → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **SSE Endpoint:** Expose model Flux through WebFlux SSE.


---

<!-- 346_STREAMING_CANCELLATION.md -->

# Streaming Cancellation

## What / Why
Client disconnect should cancel upstream model request where transport/provider supports it.

## Mental Model
```text
Streaming Cancellation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Cancellation:** Client disconnect should cancel upstream model request where transport/provider supports it.


---

<!-- 347_STREAMING_ERROR.md -->

# Streaming Error

## What / Why
Partial output may already have been delivered before failure.

## Mental Model
```text
Streaming Error → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Error:** Partial output may already have been delivered before failure.


---

<!-- 348_MODERATE_UX.md -->

# Moderate UX

## What / Why
Streaming reduces perceived latency but complicates safety/moderation/output validation.

## Mental Model
```text
Moderate UX → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Moderate UX:** Streaming reduces perceived latency but complicates safety/moderation/output validation.


---

<!-- 349_MODEL_TIMEOUT.md -->

# Model Timeout

## What / Why
Bound provider calls.

## Mental Model
```text
Model Timeout → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Model Timeout:** Bound provider calls.


---

<!-- 350_RETRY.md -->

# Retry

## What / Why
Retry only transient provider failures.

## Mental Model
```text
Retry → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Retry:** Retry only transient provider failures.


---

<!-- 351_RATE_LIMIT.md -->

# Rate Limit

## What / Why
Handle provider 429 with backoff and budgets.

## Mental Model
```text
Rate Limit → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Rate Limit:** Handle provider 429 with backoff and budgets.


---

<!-- 352_BACKOFF.md -->

# Backoff

## What / Why
Exponential delay for transient capacity errors.

## Mental Model
```text
Backoff → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Backoff:** Exponential delay for transient capacity errors.


---

<!-- 353_JITTER.md -->

# Jitter

## What / Why
Avoid synchronized retries.

## Mental Model
```text
Jitter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Jitter:** Avoid synchronized retries.


---

<!-- 354_CIRCUIT_BREAKER.md -->

# Circuit Breaker

## What / Why
Stop repeated calls to failing provider.

## Mental Model
```text
Circuit Breaker → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Circuit Breaker:** Stop repeated calls to failing provider.


---

<!-- 355_BULKHEAD.md -->

# Bulkhead

## What / Why
Limit concurrent model calls.

## Mental Model
```text
Bulkhead → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Bulkhead:** Limit concurrent model calls.


---

<!-- 356_FALLBACK_MODEL.md -->

# Fallback Model

## What / Why
Route to alternate model only after compatibility/evaluation.

## Mental Model
```text
Fallback Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Fallback Model:** Route to alternate model only after compatibility/evaluation.


---

<!-- 357_FALLBACK_PROVIDER.md -->

# Fallback Provider

## What / Why
Provider failover changes behavior and must be regression-tested.

## Mental Model
```text
Fallback Provider → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Fallback Provider:** Provider failover changes behavior and must be regression-tested.


---

<!-- 358_TOKEN_BUDGET.md -->

# Token Budget

## What / Why
Cap prompt/output/tool iterations.

## Mental Model
```text
Token Budget → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Token Budget:** Cap prompt/output/tool iterations.


---

<!-- 359_TOOL_CALL_BUDGET.md -->

# Tool Call Budget

## What / Why
2.0.1 supports configurable tool-call limits.

## Mental Model
```text
Tool Call Budget → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Call Budget:** 2.0.1 supports configurable tool-call limits.


---

<!-- 360_RAG_BUDGET.md -->

# RAG Budget

## What / Why
Limit topK, context size and reranking calls.

## Mental Model
```text
RAG Budget → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Budget:** Limit topK, context size and reranking calls.


---

<!-- 361_COST_GUARDRAIL.md -->

# Cost Guardrail

## What / Why
Reject/escalate requests that exceed expected cost.

## Mental Model
```text
Cost Guardrail → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Cost Guardrail:** Reject/escalate requests that exceed expected cost.


---

<!-- 362_SPRING_AI_SECURITY_MODEL.md -->

# Spring AI Security Model

## What / Why
Secure model credentials, user data, retrieved knowledge, tool execution and logs.

## Mental Model
```text
Spring AI Security Model → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI Security Model:** Secure model credentials, user data, retrieved knowledge, tool execution and logs.


---

<!-- 363_API_KEY_MANAGEMENT.md -->

# API Key Management

## What / Why
Store provider credentials in secret management.

## Mental Model
```text
API Key Management → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **API Key Management:** Store provider credentials in secret management.


---

<!-- 364_PROMPT_INJECTION.md -->

# Prompt Injection

## What / Why
Retrieved/user content may attempt to override trusted instructions.

## Mental Model
```text
Prompt Injection → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Injection:** Retrieved/user content may attempt to override trusted instructions.


---

<!-- 365_INDIRECT_PROMPT_INJECTION.md -->

# Indirect Prompt Injection

## What / Why
Documents/web/MCP/tool results are untrusted data.

## Mental Model
```text
Indirect Prompt Injection → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Indirect Prompt Injection:** Documents/web/MCP/tool results are untrusted data.


---

<!-- 366_TOOL_ABUSE.md -->

# Tool Abuse

## What / Why
Model may propose dangerous valid tool calls.

## Mental Model
```text
Tool Abuse → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Abuse:** Model may propose dangerous valid tool calls.


---

<!-- 367_LEAST_PRIVILEGE_TOOLS.md -->

# Least Privilege Tools

## What / Why
Expose minimum tool set per request.

## Mental Model
```text
Least Privilege Tools → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Least Privilege Tools:** Expose minimum tool set per request.


---

<!-- 368_TOOL_INPUT_VALIDATION.md -->

# Tool Input Validation

## What / Why
Validate tool args independently of model schema generation.

## Mental Model
```text
Tool Input Validation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Input Validation:** Validate tool args independently of model schema generation.


---

<!-- 369_TOOL_AUTHORIZATION.md -->

# Tool Authorization

## What / Why
Check principal/tenant/business permission before action.

## Mental Model
```text
Tool Authorization → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Authorization:** Check principal/tenant/business permission before action.


---

<!-- 370_DATA_EXFILTRATION.md -->

# Data Exfiltration

## What / Why
Prevent sensitive context from being sent to unauthorized providers/tools.

## Mental Model
```text
Data Exfiltration → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Data Exfiltration:** Prevent sensitive context from being sent to unauthorized providers/tools.


---

<!-- 371_TENANT_RAG_ISOLATION.md -->

# Tenant RAG Isolation

## What / Why
Apply tenant/ACL filters before similarity search results reach model.

## Mental Model
```text
Tenant RAG Isolation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tenant RAG Isolation:** Apply tenant/ACL filters before similarity search results reach model.


---

<!-- 372_PII_REDACTION.md -->

# PII Redaction

## What / Why
Minimize/redact sensitive data before model/logging when required.

## Mental Model
```text
PII Redaction → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **PII Redaction:** Minimize/redact sensitive data before model/logging when required.


---

<!-- 373_PROVIDER_DATA_POLICY.md -->

# Provider Data Policy

## What / Why
Review retention/training/regional processing policy per provider.

## Mental Model
```text
Provider Data Policy → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Provider Data Policy:** Review retention/training/regional processing policy per provider.


---

<!-- 374_PROMPT_LOGGING_DISABLED_BY_DEFAULT.md -->

# Prompt Logging Disabled by Default

## What / Why
Avoid turning on sensitive logging casually.

## Mental Model
```text
Prompt Logging Disabled by Default → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Logging Disabled by Default:** Avoid turning on sensitive logging casually.


---

<!-- 375_MCP_TRUST.md -->

# MCP Trust

## What / Why
Authenticate/authorize MCP servers and restrict network/tool reach.

## Mental Model
```text
MCP Trust → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Trust:** Authenticate/authorize MCP servers and restrict network/tool reach.


---

<!-- 376_MODEL_OUTPUT_VALIDATION.md -->

# Model Output Validation

## What / Why
Treat generated content as untrusted input to downstream systems.

## Mental Model
```text
Model Output Validation → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Model Output Validation:** Treat generated content as untrusted input to downstream systems.


---

<!-- 377_HTML_MARKDOWN_SAFETY.md -->

# HTML Markdown Safety

## What / Why
Sanitize generated markup before rendering.

## Mental Model
```text
HTML Markdown Safety → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **HTML Markdown Safety:** Sanitize generated markup before rendering.


---

<!-- 378_UNIT_TEST_PROMPT_BUILDER.md -->

# Unit Test Prompt Builder

## What / Why
Test prompt/template composition without calling real model.

## Mental Model
```text
Unit Test Prompt Builder → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Unit Test Prompt Builder:** Test prompt/template composition without calling real model.


---

<!-- 379_MOCK_CHATMODEL.md -->

# Mock ChatModel

## What / Why
Use test stub/mock model for deterministic application tests.

## Mental Model
```text
Mock ChatModel → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Mock ChatModel:** Use test stub/mock model for deterministic application tests.


---

<!-- 380_CHATCLIENT_TEST.md -->

# ChatClient Test

## What / Why
Test advisors/options/tools around stubbed model.

## Mental Model
```text
ChatClient Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatClient Test:** Test advisors/options/tools around stubbed model.


---

<!-- 381_TOOL_UNIT_TEST.md -->

# Tool Unit Test

## What / Why
Call tool method directly for business behavior.

## Mental Model
```text
Tool Unit Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Unit Test:** Call tool method directly for business behavior.


---

<!-- 382_TOOL_INTEGRATION_TEST.md -->

# Tool Integration Test

## What / Why
Verify tool schema/argument mapping and auth wrapper.

## Mental Model
```text
Tool Integration Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Integration Test:** Verify tool schema/argument mapping and auth wrapper.


---

<!-- 383_RAG_RETRIEVAL_TEST.md -->

# RAG Retrieval Test

## What / Why
Test query → expected document IDs.

## Mental Model
```text
RAG Retrieval Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Retrieval Test:** Test query → expected document IDs.


---

<!-- 384_RAG_ANSWER_TEST.md -->

# RAG Answer Test

## What / Why
Test answer grounded in retrieved evidence.

## Mental Model
```text
RAG Answer Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Answer Test:** Test answer grounded in retrieved evidence.


---

<!-- 385_VECTOR_STORE_INTEGRATION_TEST.md -->

# Vector Store Integration Test

## What / Why
Run against actual selected vector DB in Testcontainers where possible.

## Mental Model
```text
Vector Store Integration Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Vector Store Integration Test:** Run against actual selected vector DB in Testcontainers where possible.


---

<!-- 386_PROVIDER_CONTRACT_TEST.md -->

# Provider Contract Test

## What / Why
Small suite validates real provider/model capability.

## Mental Model
```text
Provider Contract Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Provider Contract Test:** Small suite validates real provider/model capability.


---

<!-- 387_STRUCTURED_OUTPUT_TEST.md -->

# Structured Output Test

## What / Why
Validate valid and malformed provider outputs.

## Mental Model
```text
Structured Output Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Structured Output Test:** Validate valid and malformed provider outputs.


---

<!-- 388_STREAMING_TEST.md -->

# Streaming Test

## What / Why
Use StepVerifier/WebTestClient for streamed Flux.

## Mental Model
```text
Streaming Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Test:** Use StepVerifier/WebTestClient for streamed Flux.


---

<!-- 389_MEMORY_ISOLATION_TEST.md -->

# Memory Isolation Test

## What / Why
Ensure conversation/tenant IDs do not cross-contaminate.

## Mental Model
```text
Memory Isolation Test → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Memory Isolation Test:** Ensure conversation/tenant IDs do not cross-contaminate.


---

<!-- 390_EVALUATION_IN_CI.md -->

# Evaluation in CI

## What / Why
Run golden eval suite on prompt/model/RAG changes.

## Mental Model
```text
Evaluation in CI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Evaluation in CI:** Run golden eval suite on prompt/model/RAG changes.


---

<!-- 391_AI_BFF.md -->

# AI BFF

## What / Why
Spring service fronts model providers and owns sessions/policy/tools.

## Mental Model
```text
AI BFF → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **AI BFF:** Spring service fronts model providers and owns sessions/policy/tools.


---

<!-- 392_PROVIDER_GATEWAY.md -->

# Provider Gateway

## What / Why
Wrap multiple ChatModels behind task-based routing.

## Mental Model
```text
Provider Gateway → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Provider Gateway:** Wrap multiple ChatModels behind task-based routing.


---

<!-- 393_RAG_SERVICE.md -->

# RAG Service

## What / Why
Dedicated Spring component owns ingestion/retrieval/evaluation.

## Mental Model
```text
RAG Service → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Service:** Dedicated Spring component owns ingestion/retrieval/evaluation.


---

<!-- 394_TOOL_GATEWAY.md -->

# Tool Gateway

## What / Why
Wrap enterprise actions behind authorized tool facade.

## Mental Model
```text
Tool Gateway → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Gateway:** Wrap enterprise actions behind authorized tool facade.


---

<!-- 395_AGENTIC_LOOP.md -->

# Agentic Loop

## What / Why
ChatClient + ToolCallingAdvisor can implement bounded model-tool loops.

## Mental Model
```text
Agentic Loop → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Agentic Loop:** ChatClient + ToolCallingAdvisor can implement bounded model-tool loops.


---

<!-- 396_DETERMINISTIC_OUTER_WORKFLOW.md -->

# Deterministic Outer Workflow

## What / Why
Use code/state machine to control lifecycle and Spring AI only for bounded reasoning/tool choice.

## Mental Model
```text
Deterministic Outer Workflow → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Deterministic Outer Workflow:** Use code/state machine to control lifecycle and Spring AI only for bounded reasoning/tool choice.


---

<!-- 397_HUMAN_APPROVAL.md -->

# Human Approval

## What / Why
Pause before high-impact tool execution.

## Mental Model
```text
Human Approval → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Human Approval:** Pause before high-impact tool execution.


---

<!-- 398_MODEL_ROUTER.md -->

# Model Router

## What / Why
Select model based on task/cost/latency/risk.

## Mental Model
```text
Model Router → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Model Router:** Select model based on task/cost/latency/risk.


---

<!-- 399_SEMANTIC_CACHE.md -->

# Semantic Cache

## What / Why
Cache semantically equivalent safe responses outside model API.

## Mental Model
```text
Semantic Cache → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Semantic Cache:** Cache semantically equivalent safe responses outside model API.


---

<!-- 400_ASYNC_AI_JOB.md -->

# Async AI Job

## What / Why
Queue long document/agent processing rather than hold request.

## Mental Model
```text
Async AI Job → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Async AI Job:** Queue long document/agent processing rather than hold request.


---

<!-- 401_STREAMING_CHAT_ENDPOINT.md -->

# Streaming Chat Endpoint

## What / Why
WebFlux/SSE around ChatClient stream.

## Mental Model
```text
Streaming Chat Endpoint → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Chat Endpoint:** WebFlux/SSE around ChatClient stream.


---

<!-- 402_MULTI_TENANT_RAG.md -->

# Multi Tenant RAG

## What / Why
Tenant filter + tenant-specific metadata/vector namespaces.

## Mental Model
```text
Multi Tenant RAG → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Multi Tenant RAG:** Tenant filter + tenant-specific metadata/vector namespaces.


---

<!-- 403_PROMPT_REGISTRY.md -->

# Prompt Registry

## What / Why
Version prompt resources separately from code deployment.

## Mental Model
```text
Prompt Registry → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Registry:** Version prompt resources separately from code deployment.


---

<!-- 404_EVALUATION_GATEWAY.md -->

# Evaluation Gateway

## What / Why
Run evaluation before promoting prompt/model/RAG release.

## Mental Model
```text
Evaluation Gateway → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Evaluation Gateway:** Run evaluation before promoting prompt/model/RAG release.


---

<!-- 405_SPRING_BOOT.md -->

# Spring Boot

## What / Why
Auto-configuration and starters.

## Mental Model
```text
Spring Boot → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring Boot:** Auto-configuration and starters.


---

<!-- 406_SPRING_WEBFLUX.md -->

# Spring WebFlux

## What / Why
Expose streaming ChatClient calls and non-blocking API endpoints.

## Mental Model
```text
Spring WebFlux → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring WebFlux:** Expose streaming ChatClient calls and non-blocking API endpoints.


---

<!-- 407_SPRING_MVC.md -->

# Spring MVC

## What / Why
Use synchronous ChatClient comfortably for traditional request-response.

## Mental Model
```text
Spring MVC → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring MVC:** Use synchronous ChatClient comfortably for traditional request-response.


---

<!-- 408_SPRING_SECURITY.md -->

# Spring Security

## What / Why
Use authenticated principal/tenant to authorize RAG and tools.

## Mental Model
```text
Spring Security → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring Security:** Use authenticated principal/tenant to authorize RAG and tools.


---

<!-- 409_SPRING_DATA.md -->

# Spring Data

## What / Why
Persist memory, documents, audit and app state.

## Mental Model
```text
Spring Data → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring Data:** Persist memory, documents, audit and app state.


---

<!-- 410_SPRING_BATCH.md -->

# Spring Batch

## What / Why
Batch document ingestion, embedding and evaluation workloads.

## Mental Model
```text
Spring Batch → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring Batch:** Batch document ingestion, embedding and evaluation workloads.


---

<!-- 411_SPRING_INTEGRATION.md -->

# Spring Integration

## What / Why
Coordinate enterprise messaging/integration flows.

## Mental Model
```text
Spring Integration → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring Integration:** Coordinate enterprise messaging/integration flows.


---

<!-- 412_SPRING_CLOUD.md -->

# Spring Cloud

## What / Why
External config, gateways, resilience and service patterns.

## Mental Model
```text
Spring Cloud → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring Cloud:** External config, gateways, resilience and service patterns.


---

<!-- 413_MICROMETER.md -->

# Micrometer

## What / Why
Observability foundation.

## Mental Model
```text
Micrometer → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Micrometer:** Observability foundation.


---

<!-- 414_TESTCONTAINERS.md -->

# Testcontainers

## What / Why
Real vector DB/provider-adjacent integration tests.

## Mental Model
```text
Testcontainers → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Testcontainers:** Real vector DB/provider-adjacent integration tests.


---

<!-- 415_SPRING_AI_2_0_MIGRATION.md -->

# Spring AI 2.0 Migration

## What / Why
Review module names, package/API changes and Boot alignment.

## Mental Model
```text
Spring AI 2.0 Migration → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI 2.0 Migration:** Review module names, package/API changes and Boot alignment.


---

<!-- 416_STARTER_NAMING.md -->

# Starter Naming

## What / Why
2.0 continues standardized starter naming; verify upgrade guide.

## Mental Model
```text
Starter Naming → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Starter Naming:** 2.0 continues standardized starter naming; verify upgrade guide.


---

<!-- 417_TOOL_API_CHANGES.md -->

# Tool API Changes

## What / Why
Tool calling APIs/advisor behavior evolved significantly.

## Mental Model
```text
Tool API Changes → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool API Changes:** Tool calling APIs/advisor behavior evolved significantly.


---

<!-- 418_TOOLCALLINGADVISOR_AUTO_REGISTRATION.md -->

# ToolCallingAdvisor Auto Registration

## What / Why
ChatClient auto-registers tool-calling advisor unless disabled.

## Mental Model
```text
ToolCallingAdvisor Auto Registration → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ToolCallingAdvisor Auto Registration:** ChatClient auto-registers tool-calling advisor unless disabled.


---

<!-- 419_STRUCTURED_OUTPUT_CHANGES.md -->

# Structured Output Changes

## What / Why
Use modern ChatClient entity/schema APIs.

## Mental Model
```text
Structured Output Changes → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Structured Output Changes:** Use modern ChatClient entity/schema APIs.


---

<!-- 420_HIGH_VALUE_COMPARISONS.md -->

# Spring AI — High-Value Comparisons

## ChatModel vs ChatClient
| ChatModel | ChatClient |
|---|---|
| lower-level portable model API | fluent high-level orchestration |
| request/response model contract | prompts/advisors/tools/entity extraction |

## ChatMemory vs RAG
| ChatMemory | RAG |
|---|---|
| conversation continuity | external authoritative knowledge |
| user/session scope | corpus/domain scope |
| recent messages | retrieved documents |

## Tool Calling vs Structured Output
| Tool Calling | Structured Output |
|---|---|
| model requests application action | model returns typed result |
| invokes trusted code | schema-constrained data |
| authorization required | semantic validation required |

## Advisor vs Tool
| Advisor | Tool |
|---|---|
| transforms/orchestrates model interaction | callable business/external capability |
| memory/RAG/logging/tool loop | side effects/data access |

## VectorStore vs VectorStoreRetriever
| VectorStore | VectorStoreRetriever |
|---|---|
| read + mutation | retrieval only |
| ingestion/admin | least-privilege RAG component |

## Spring AI vs Native SDK
| Spring AI | Native provider SDK |
|---|---|
| portability/Spring ecosystem | fastest provider-specific capability access |
| common abstractions | direct provider model |


---

<!-- 420_PROMPT_OPTIONS_REPLACEMENT.md -->

# Prompt Options Replacement

## What / Why
Runtime model options replace startup options rather than merging in ChatModel semantics.

## Mental Model
```text
Prompt Options Replacement → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Options Replacement:** Runtime model options replace startup options rather than merging in ChatModel semantics.


---

<!-- 421_INTERVIEW_TRAPS.md -->

# Spring AI Interview Traps

1. Spring AI is not an LLM itself.
2. ChatClient and ChatModel are different abstraction levels.
3. Provider portability does not imply identical provider behavior.
4. Runtime ChatOptions can override startup defaults.
5. Structured output is not the same as tool calling.
6. Typed output does not guarantee business correctness.
7. Advisor ordering changes behavior.
8. Chat memory and RAG solve different problems.
9. Conversation ID must be scoped per user/session when memory is used.
10. RAG quality depends heavily on ingestion/chunking/filtering, not only LLM quality.
11. Tenant filters must be applied before retrieved data enters model context.
12. VectorStoreRetriever is intentionally read-only.
13. Tool schema validation is not authorization.
14. `ToolCallingAdvisor` is auto-registered in current ChatClient unless disabled.
15. Per-call tools append to default tools.
16. Destructive tools should not normally be default tools.
17. Tool loops must have time/step/cost limits.
18. MCP is a protocol boundary; ToolCallback is a local Java abstraction.
19. MCP servers must be treated as external trust boundaries.
20. Prompt injection can arrive through RAG, tools and MCP resources.
21. Spring AI evaluation utilities are not a replacement for human validation on high-stakes use cases.
22. Observability must not leak raw prompts/tokens/PII.
23. Changing embedding model commonly requires reindexing vectors.
24. Similarity threshold/topK are workload-specific, not universal constants.
25. Provider model switch requires regression evaluation.
26. Streaming may emit partial output before an error occurs.
27. Blocking ChatClient calls in WebFlux request threads must be isolated or use streaming/reactive support appropriately.
28. RAG and fine-tuning are complementary, not interchangeable.
29. A vector database is not the application's source of truth by default.
30. Cost/latency are architecture requirements, not post-production optimizations.


---

<!-- 421_JACKSON_ALIGNMENT.md -->

# Jackson Alignment

## What / Why
Spring AI 2.0 aligns with current Spring/Jackson ecosystem changes.

## Mental Model
```text
Jackson Alignment → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Jackson Alignment:** Spring AI 2.0 aligns with current Spring/Jackson ecosystem changes.


---

<!-- 422_PRODUCTION_CHECKLIST.md -->

# Spring AI Production Checklist

## Model
- exact provider/model version known
- quality benchmark on own workload
- timeout
- retry policy
- fallback tested
- token/output limits

## Prompt
- versioned
- injection-aware
- regression evaluated
- no secrets embedded

## RAG
- source authority
- stable chunk IDs
- embedding version
- tenant/ACL filtering
- topK/threshold evaluated
- citations/source metadata
- freshness pipeline

## Tools
- least privilege
- per-call exposure for risky tools
- input validation
- authorization
- idempotency
- timeout
- tool-call budget
- human approval where needed

## Memory
- conversation ID isolation
- retention/deletion
- privacy
- bounded context window

## Operations
- observations/traces
- token/cost metrics
- model/tool/RAG latency
- golden evaluation suite
- provider rate-limit alerts
- rollback strategy


---

<!-- 422_PROVIDER_MODEL_RETIREMENT.md -->

# Provider Model Retirement

## What / Why
2.0.1 retired deprecated Mistral model options/integrations where applicable.

## Mental Model
```text
Provider Model Retirement → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Provider Model Retirement:** 2.0.1 retired deprecated Mistral model options/integrations where applicable.


---

<!-- 423_TROUBLESHOOTING_FLOW.md -->

# Spring AI Troubleshooting — Golden Flow

```text
1. ChatClient / Prompt
   ├─ correct system/user text?
   ├─ options?
   └─ prompt rendering?

2. Advisors
   ├─ order?
   ├─ memory conversation ID?
   ├─ RAG context?
   └─ tool calling?

3. Model Provider
   ├─ credentials?
   ├─ model exists?
   ├─ capability supported?
   ├─ 429 / timeout?
   └─ streaming errors?

4. RAG
   ├─ documents ingested?
   ├─ embeddings compatible?
   ├─ filter excludes everything?
   ├─ topK/threshold?
   └─ chunk quality?

5. Tools / MCP
   ├─ tool advertised?
   ├─ schema?
   ├─ authorization?
   ├─ transport?
   └─ loop limit?

6. Output
   ├─ structured schema?
   ├─ validation?
   └─ evaluator result?
```


---

<!-- 423_UPGRADE_REGRESSION_SUITE.md -->

# Upgrade Regression Suite

## What / Why
Run tool/RAG/structured-output/eval tests after upgrade.

## Mental Model
```text
Upgrade Regression Suite → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Upgrade Regression Suite:** Run tool/RAG/structured-output/eval tests after upgrade.


---

<!-- 424_NO_CHATMODEL_BEAN.md -->

# No ChatModel Bean

## What / Why
Wrong starter/properties/credentials or auto-config condition.

## Mental Model
```text
No ChatModel Bean → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **No ChatModel Bean:** Wrong starter/properties/credentials or auto-config condition.


---

<!-- 424_SOURCES_AND_ACCURACY.md -->

# Sources & Accuracy Notes

Primary current references:
- Spring AI 2.0.1 reference documentation
- Spring AI release notes
- ChatClient API
- Advisors API
- Tool Calling API
- RAG reference
- Vector Store API
- Structured Output API

Current verified baseline:
- Spring AI 2.0.1 is the latest listed release.
- Released August 21, 2026.
- Spring AI provides portable Model APIs for chat, image, transcription, speech and embeddings.
- ChatClient is the high-level fluent model interaction API.
- Advisors cover reusable memory/RAG/tool/reasoning patterns.
- ToolCallingAdvisor is auto-registered unless disabled.
- VectorStoreRetriever is a read-only retrieval abstraction.
- RAG supports QuestionAnswerAdvisor and modular RetrievalAugmentationAdvisor.
- Structured output is available directly from ChatClient using typed entity conversion and provider-native schema support where available.
- Spring AI includes MCP client/server integration, ETL ingestion, evaluation and observability.

Provider APIs and model capabilities evolve faster than Spring AI itself. Always verify the exact provider/model documentation before production deployment.


---

<!-- 425_401_PROVIDER.md -->

# 401 Provider

## What / Why
Invalid API key/identity/endpoint.

## Mental Model
```text
401 Provider → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **401 Provider:** Invalid API key/identity/endpoint.


---

<!-- 426_429_RATE_LIMIT.md -->

# 429 Rate Limit

## What / Why
Provider quota/concurrency exceeded.

## Mental Model
```text
429 Rate Limit → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **429 Rate Limit:** Provider quota/concurrency exceeded.


---

<!-- 427_CHAT_TIMEOUT.md -->

# Chat Timeout

## What / Why
Provider latency/network/retry/tool loop too long.

## Mental Model
```text
Chat Timeout → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Chat Timeout:** Provider latency/network/retry/tool loop too long.


---

<!-- 428_STREAMING_STOPS.md -->

# Streaming Stops

## What / Why
Provider stream/network/proxy/client cancellation.

## Mental Model
```text
Streaming Stops → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Streaming Stops:** Provider stream/network/proxy/client cancellation.


---

<!-- 429_TOOL_NOT_CALLED.md -->

# Tool Not Called

## What / Why
Description/schema/model capability/tool choice/advisor configuration.

## Mental Model
```text
Tool Not Called → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Not Called:** Description/schema/model capability/tool choice/advisor configuration.


---

<!-- 430_WRONG_TOOL_CALLED.md -->

# Wrong Tool Called

## What / Why
Ambiguous descriptions or too many similar tools.

## Mental Model
```text
Wrong Tool Called → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Wrong Tool Called:** Ambiguous descriptions or too many similar tools.


---

<!-- 431_TOOL_LOOP.md -->

# Tool Loop

## What / Why
Missing stop criteria/tool-call budget/tool result not satisfying model.

## Mental Model
```text
Tool Loop → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool Loop:** Missing stop criteria/tool-call budget/tool result not satisfying model.


---

<!-- 432_CONVERSATION_MEMORY_MISSING.md -->

# Conversation Memory Missing

## What / Why
Conversation ID not supplied to memory advisor.

## Mental Model
```text
Conversation Memory Missing → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Conversation Memory Missing:** Conversation ID not supplied to memory advisor.


---

<!-- 433_CONVERSATION_LEAK.md -->

# Conversation Leak

## What / Why
Same conversation ID or repository partition reused across users/tenants.

## Mental Model
```text
Conversation Leak → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Conversation Leak:** Same conversation ID or repository partition reused across users/tenants.


---

<!-- 434_RAG_NO_RESULTS.md -->

# RAG No Results

## What / Why
Embedding mismatch/filter/topK/threshold/chunking/ingestion issue.

## Mental Model
```text
RAG No Results → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG No Results:** Embedding mismatch/filter/topK/threshold/chunking/ingestion issue.


---

<!-- 435_RAG_WRONG_RESULTS.md -->

# RAG Wrong Results

## What / Why
Poor chunks/metadata/query rewrite/vector model/reranking.

## Mental Model
```text
RAG Wrong Results → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG Wrong Results:** Poor chunks/metadata/query rewrite/vector model/reranking.


---

<!-- 436_VECTOR_STORE_FILTER_FAILURE.md -->

# Vector Store Filter Failure

## What / Why
Provider-specific filter capability/schema mismatch.

## Mental Model
```text
Vector Store Filter Failure → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Vector Store Filter Failure:** Provider-specific filter capability/schema mismatch.


---

<!-- 437_STRUCTURED_OUTPUT_PARSE_ERROR.md -->

# Structured Output Parse Error

## What / Why
Model output violates expected schema.

## Mental Model
```text
Structured Output Parse Error → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Structured Output Parse Error:** Model output violates expected schema.


---

<!-- 438_SCHEMA_VALIDATION_FAILURE.md -->

# Schema Validation Failure

## What / Why
Provider output syntactically structured but incompatible.

## Mental Model
```text
Schema Validation Failure → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Schema Validation Failure:** Provider output syntactically structured but incompatible.


---

<!-- 439_MCP_CONNECTION_FAILURE.md -->

# MCP Connection Failure

## What / Why
Transport/version/auth/network mismatch.

## Mental Model
```text
MCP Connection Failure → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **MCP Connection Failure:** Transport/version/auth/network mismatch.


---

<!-- 440_CONTEXT_TOO_LARGE.md -->

# Context Too Large

## What / Why
Memory + RAG + tools + system prompt exceed model context.

## Mental Model
```text
Context Too Large → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Context Too Large:** Memory + RAG + tools + system prompt exceed model context.


---

<!-- 441_HIGH_TOKEN_COST.md -->

# High Token Cost

## What / Why
Verbose memory/RAG, too many tool schemas, large output.

## Mental Model
```text
High Token Cost → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **High Token Cost:** Verbose memory/RAG, too many tool schemas, large output.


---

<!-- 442_HIGH_LATENCY.md -->

# High Latency

## What / Why
Multiple model calls, RAG, reranking, tools, provider queueing.

## Mental Model
```text
High Latency → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **High Latency:** Multiple model calls, RAG, reranking, tools, provider queueing.


---

<!-- 443_WRONG_MODEL_BEHAVIOR_AFTER_PROVIDER_SWITCH.md -->

# Wrong Model Behavior After Provider Switch

## What / Why
Portable API does not guarantee behavioral equivalence.

## Mental Model
```text
Wrong Model Behavior After Provider Switch → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Wrong Model Behavior After Provider Switch:** Portable API does not guarantee behavioral equivalence.


---

<!-- 444_PROMPT_INJECTION_SUCCESS.md -->

# Prompt Injection Success

## What / Why
Trusted/untrusted context mixed or tool policies too weak.

## Mental Model
```text
Prompt Injection Success → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Prompt Injection Success:** Trusted/untrusted context mixed or tool policies too weak.


---

<!-- 445_GOLDEN_DEBUG_FLOW.md -->

# Golden Debug Flow

## What / Why
Prompt → Advisors → RAG/Memory → Model → Tool Loop → Structured Output → Observation.

## Mental Model
```text
Golden Debug Flow → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Golden Debug Flow:** Prompt → Advisors → RAG/Memory → Model → Tool Loop → Structured Output → Observation.


---

<!-- 446_DESIGN_SPRING_AI_CHAT_APP.md -->

# Design Spring AI Chat App

## What / Why
ChatClient + memory + model + streaming + security + observability.

## Mental Model
```text
Design Spring AI Chat App → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design Spring AI Chat App:** ChatClient + memory + model + streaming + security + observability.


---

<!-- 447_DESIGN_ENTERPRISE_RAG.md -->

# Design Enterprise RAG

## What / Why
ETL + VectorStore + filters + RetrievalAugmentationAdvisor + citations + evals.

## Mental Model
```text
Design Enterprise RAG → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design Enterprise RAG:** ETL + VectorStore + filters + RetrievalAugmentationAdvisor + citations + evals.


---

<!-- 448_DESIGN_TOOL_CALLING_ASSISTANT.md -->

# Design Tool Calling Assistant

## What / Why
Authorized tools + ToolCallingAdvisor + limits + audit + human approval.

## Mental Model
```text
Design Tool Calling Assistant → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design Tool Calling Assistant:** Authorized tools + ToolCallingAdvisor + limits + audit + human approval.


---

<!-- 449_DESIGN_MCP_CLIENT_APP.md -->

# Design MCP Client App

## What / Why
Spring AI MCP client + trusted server registry + auth + tool restrictions.

## Mental Model
```text
Design MCP Client App → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design MCP Client App:** Spring AI MCP client + trusted server registry + auth + tool restrictions.


---

<!-- 450_DESIGN_MCP_SERVER.md -->

# Design MCP Server

## What / Why
Expose bounded Spring services as MCP tools/resources.

## Mental Model
```text
Design MCP Server → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design MCP Server:** Expose bounded Spring services as MCP tools/resources.


---

<!-- 451_DESIGN_MULTI_PROVIDER_AI.md -->

# Design Multi Provider AI

## What / Why
ChatModel adapters + router + regression eval + cost/latency metrics.

## Mental Model
```text
Design Multi Provider AI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design Multi Provider AI:** ChatModel adapters + router + regression eval + cost/latency metrics.


---

<!-- 452_DESIGN_AI_DOCUMENT_INGESTION.md -->

# Design AI Document Ingestion

## What / Why
Readers + splitter + metadata + embedding + vector store + incremental sync.

## Mental Model
```text
Design AI Document Ingestion → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design AI Document Ingestion:** Readers + splitter + metadata + embedding + vector store + incremental sync.


---

<!-- 453_DESIGN_AI_EVALUATION_PIPELINE.md -->

# Design AI Evaluation Pipeline

## What / Why
Golden set + evaluators + provider candidates + release gate.

## Mental Model
```text
Design AI Evaluation Pipeline → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design AI Evaluation Pipeline:** Golden set + evaluators + provider candidates + release gate.


---

<!-- 454_DESIGN_MULTI_TENANT_RAG.md -->

# Design Multi Tenant RAG

## What / Why
Tenant identity → filter expression → retriever → model.

## Mental Model
```text
Design Multi Tenant RAG → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design Multi Tenant RAG:** Tenant identity → filter expression → retriever → model.


---

<!-- 455_DESIGN_STREAMING_COPILOT.md -->

# Design Streaming Copilot

## What / Why
WebFlux SSE + ChatClient stream + cancellation + observability.

## Mental Model
```text
Design Streaming Copilot → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design Streaming Copilot:** WebFlux SSE + ChatClient stream + cancellation + observability.


---

<!-- 456_DESIGN_LOCAL_AI.md -->

# Design Local AI

## What / Why
Ollama/local model + local vector DB + offline data controls.

## Mental Model
```text
Design Local AI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Design Local AI:** Ollama/local model + local vector DB + offline data controls.


---

<!-- 457_CHATMODEL_VS_CHATCLIENT.md -->

# ChatModel vs ChatClient

## What / Why
Low-level portable model API vs high-level fluent orchestration client.

## Mental Model
```text
ChatModel vs ChatClient → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatModel vs ChatClient:** Low-level portable model API vs high-level fluent orchestration client.


---

<!-- 458_ADVISOR_VS_FILTER.md -->

# Advisor vs Filter

## What / Why
Advisor is AI interaction pipeline component, not HTTP servlet filter.

## Mental Model
```text
Advisor vs Filter → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Advisor vs Filter:** Advisor is AI interaction pipeline component, not HTTP servlet filter.


---

<!-- 459_TOOL_VS_MCP_TOOL.md -->

# Tool vs MCP Tool

## What / Why
Local callback vs protocol-exposed external capability.

## Mental Model
```text
Tool vs MCP Tool → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Tool vs MCP Tool:** Local callback vs protocol-exposed external capability.


---

<!-- 460_CHATMEMORY_VS_RAG.md -->

# ChatMemory vs RAG

## What / Why
Conversation continuity vs external knowledge retrieval.

## Mental Model
```text
ChatMemory vs RAG → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **ChatMemory vs RAG:** Conversation continuity vs external knowledge retrieval.


---

<!-- 461_VECTORSTORE_VS_VECTOR_DB.md -->

# VectorStore vs Vector DB

## What / Why
Spring interface vs concrete storage engine.

## Mental Model
```text
VectorStore vs Vector DB → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **VectorStore vs Vector DB:** Spring interface vs concrete storage engine.


---

<!-- 462_STRUCTURED_OUTPUT_VS_TOOL_CALLING.md -->

# Structured Output vs Tool Calling

## What / Why
Typed model response vs model-invoked application action.

## Mental Model
```text
Structured Output vs Tool Calling → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Structured Output vs Tool Calling:** Typed model response vs model-invoked application action.


---

<!-- 463_RAG_VS_FINE_TUNING.md -->

# RAG vs Fine Tuning

## What / Why
External context retrieval vs model-weight adaptation.

## Mental Model
```text
RAG vs Fine Tuning → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **RAG vs Fine Tuning:** External context retrieval vs model-weight adaptation.


---

<!-- 464_SPRING_AI_VS_LANGCHAIN.md -->

# Spring AI vs LangChain

## What / Why
Spring-native Java abstraction/ecosystem vs broader language/framework ecosystem.

## Mental Model
```text
Spring AI vs LangChain → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI vs LangChain:** Spring-native Java abstraction/ecosystem vs broader language/framework ecosystem.


---

<!-- 465_SPRING_AI_VS_SEMANTIC_KERNEL.md -->

# Spring AI vs Semantic Kernel

## What / Why
Spring-centric Java stack vs Microsoft-oriented orchestration SDK ecosystem.

## Mental Model
```text
Spring AI vs Semantic Kernel → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI vs Semantic Kernel:** Spring-centric Java stack vs Microsoft-oriented orchestration SDK ecosystem.


---

<!-- 466_WHEN_NOT_TO_USE_SPRING_AI.md -->

# When Not to Use Spring AI

## What / Why
Non-Java stack, direct provider SDK needed everywhere, or unsupported critical provider feature may favor native SDK.

## Mental Model
```text
When Not to Use Spring AI → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **When Not to Use Spring AI:** Non-Java stack, direct provider SDK needed everywhere, or unsupported critical provider feature may favor native SDK.


---

<!-- 467_SPRING_AI_ANTI_PATTERNS.md -->

# Spring AI Anti Patterns

## What / Why
One giant prompt, default destructive tools, no evals, no tenant filter, logging prompts, unbounded tool loops.

## Mental Model
```text
Spring AI Anti Patterns → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI Anti Patterns:** One giant prompt, default destructive tools, no evals, no tenant filter, logging prompts, unbounded tool loops.


---

<!-- 468_SPRING_AI_INTERVIEW_TRAPS.md -->

# Spring AI Interview Traps

## What / Why
High-value model/RAG/tool/MCP/memory/observability misconceptions.

## Mental Model
```text
Spring AI Interview Traps → Spring AI abstraction → provider / data / tool boundary
```

## How to Think About It
1. Is this portable Spring AI behavior or provider-specific behavior?
2. What enters the model context?
3. What data/tool permissions are required?
4. What is the failure, timeout and retry behavior?
5. What is observable and measurable?
6. How will this be evaluated after changes?

## Production Questions
```text
Model/provider?
Prompt version?
Token budget?
Tenant/security filter?
Tool authorization?
Timeout/retry?
Evaluation?
Observability?
Cost?
Fallback?
```

## Common Trap
A clean Spring abstraction does not remove model/provider differences. Always evaluate the exact model, prompt, tools and retrieval configuration used in production.

## 20-Second Recall
> **Spring AI Interview Traps:** High-value model/RAG/tool/MCP/memory/observability misconceptions.
