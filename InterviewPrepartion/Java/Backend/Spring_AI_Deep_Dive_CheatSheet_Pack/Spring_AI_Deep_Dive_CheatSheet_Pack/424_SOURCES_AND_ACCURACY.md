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
