# Retrieval / RAG Spans

## Capture

- retriever/index;
- query class;
- top-k;
- filters;
- latency;
- result count;
- reranker latency.

## Avoid

Do not dump whole confidential document chunks into span attributes by default.

## Benefit

Separates retrieval failure from generation failure.
