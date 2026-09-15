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
