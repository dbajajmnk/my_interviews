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
