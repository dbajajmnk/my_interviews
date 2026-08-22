# AI-01 / File 01 — GenAI, LLM & Transformer Foundations

**Priority:** P0  
**Suggested Time:** 65 minutes  
**GOJ Mapping:** Emerging AI Core

---

# 1. Objective

Master:

- AI vs ML vs deep learning vs GenAI;
- LLM definition;
- transformer concept;
- attention intuition;
- pretraining;
- instruction tuning/alignment awareness;
- inference;
- fine-tuning vs prompting;
- deterministic software vs probabilistic model behavior.

---

# 2. 5W+H

## What?

A large language model is a neural model trained on large amounts of text/code to predict and generate sequences of tokens.

## Why?

It can perform many language tasks using one general model:

- generation;
- summarization;
- extraction;
- classification;
- reasoning-like assistance;
- code generation.

## Where?

Assistants, search, coding, support, document analysis, enterprise automation.

## When?

Use when language understanding/generation creates real value and deterministic rules alone are insufficient.

## How?

Input text → tokens → model processes context using transformer layers → probability distribution over next token → generation repeats.

---

# 3. Real-Life Analogy

An LLM is like a highly trained autocomplete system with a very broad learned model of language and patterns.

That analogy is incomplete—but much safer than saying:

> “It thinks exactly like a human.”

---

# 4. Visualization

```text
Prompt
  ↓
Tokenizer
  ↓
Token IDs
  ↓
Transformer Layers
  ├── Attention
  ├── Feed-forward processing
  └── Repeated transformations
  ↓
Next-token probabilities
  ↓
Sampling / Selection
  ↓
Generated token
  ↓
Repeat
```

---

# 5. Mind Map

```text
Generative AI
│
├── LLM
├── Transformer
│   ├── Attention
│   └── Layers
├── Pretraining
├── Instruction Tuning
├── Inference
├── Prompting
└── Fine-Tuning
```

---

# 6. Core Concepts

## 6.1 AI → ML → Deep Learning → GenAI

Simplified relationship:

```text
AI
└── Machine Learning
    └── Deep Learning
        └── Modern Generative Models / LLMs
```

Generative AI focuses on producing new content.

---

## 6.2 What Is an LLM?

Interview-ready answer:

> An LLM is a transformer-based neural network trained over large token sequences to model the probability of language. During inference it generates output token by token based on the supplied context and learned parameters.

---

## 6.3 Transformer

Transformers process token representations using attention and feed-forward layers.

Key advantage historically:

> attention-based architecture handles relationships among tokens efficiently and supports scalable training.

Do not claim:

> Transformer understands text exactly like a human.

---

## 6.4 Attention

Plain English:

> Attention lets the model assign different importance to different parts of the current context when computing token representations.

Example:

```text
"The bank approved the loan because it had enough capital."
```

The model needs relationships between words to interpret "bank" and "capital."

---

## 6.5 Self-Attention

Tokens attend to other tokens within the sequence.

Conceptually:

```text
Query
Key
Value
```

You do not need to derive matrix equations unless specifically asked.

---

## 6.6 Pretraining

Model learns broad statistical/language/code patterns from large datasets through self-supervised objectives.

The exact objective/model family can vary.

---

## 6.7 Instruction Tuning / Alignment Awareness

After base pretraining, models may be further trained to:

- follow instructions;
- produce safer/useful responses;
- align with desired behavior.

Implementation varies across providers.

---

## 6.8 Inference

Inference is using the trained model to generate/predict outputs.

Training changes model parameters.

Inference normally does not.

---

## 6.9 Prompting vs Fine-Tuning

### Prompting

Change instructions/context without changing model weights.

### Fine-tuning

Further train model weights on task/domain examples.

### Retrieval

Bring external information into the context at runtime.

This distinction is critical.

---

## 6.10 Probabilistic Output

Traditional code:

```python
2 + 2 == 4
```

LLM generation:

> predicts likely next tokens from probability distributions.

Therefore:

- wording may vary;
- factual errors can occur;
- output needs evaluation.

---

# 7. Engineering Depth

## 7.1 LLM Is Not a Database

Model parameters encode learned statistical patterns.

Do not treat them as a reliable, updateable source of enterprise truth.

Use external data systems for authoritative/current information.

---

## 7.2 LLM Is Not a Rules Engine

If business logic must be exact:

```text
tax calculation
authorization
accounting invariant
```

use deterministic logic.

LLM can assist around language interpretation, not own critical invariant by default.

---

## 7.3 When Not to Use LLM

Avoid or minimize when:

- simple deterministic rule solves it;
- exact result required and no validation possible;
- data cannot legally leave boundary;
- latency/cost unacceptable;
- output risk is too high.

---

# 8. Implementation / Code

Pseudo integration:

```python
def generate_answer(client, prompt):
    response = client.generate(
        model="chosen-model",
        input=prompt,
    )
    return response
```

Architecture—not SDK syntax—is the interview focus.

---

# 9. Hands-On Practice

Explain which are good LLM candidates:

1. summarize support ticket;
2. calculate GST exactly;
3. classify customer complaint;
4. retrieve latest account balance;
5. draft email.

Suggested reasoning:

- 1 yes;
- 2 deterministic rules;
- 3 yes with evaluation;
- 4 query source of truth, maybe LLM for explanation;
- 5 yes with review/constraints.

---

# 10. Google Interview Drill

## Problem — Should We Use an LLM?

Client asks:

> “Use AI to calculate employee payroll.”

### Clarify

What part?

- exact payroll math?
- interpret free-text policy?
- answer HR questions?
- generate payslip explanation?

### First Approach

Use LLM for whole payroll calculation.

High risk.

### Improve

```text
Deterministic payroll engine
      ↑
Policy/config data
      │
LLM layer
- explain results
- answer policy questions
- parse limited text with validation
```

### Edge Cases

- hallucinated policy;
- outdated rules;
- sensitive salary data;
- audit requirements.

### Goal

> Show that architect knows when **not** to give control to an LLM.

---

# 11. Common Mistakes

1. “LLM understands exactly like humans.”
2. “LLM stores all training data like a database.”
3. Confusing training and inference.
4. Confusing fine-tuning and RAG.
5. Using LLM for deterministic business rules.
6. Assuming larger model always better.
7. Assuming output is factual because it sounds confident.

---

# 12. Best Practices

- use LLM where probabilistic language capability adds value;
- keep deterministic invariants outside model;
- externalize authoritative data;
- validate high-impact output;
- choose smallest sufficient model.

---

# 13. Interview Questions

1. What is generative AI?
2. What is an LLM?
3. What is a transformer?
4. What is attention?
5. What is self-attention?
6. Pretraining vs inference?
7. Prompting vs fine-tuning?
8. RAG vs fine-tuning at high level?
9. Why are LLM outputs probabilistic?
10. When should you not use an LLM?

---

# 14. Google-Level Follow-Ups

1. deterministic output required?
2. model outdated?
3. confidential data?
4. lower latency?
5. smaller model?
6. multilingual?
7. structured output?
8. auditability?

---

# 15. Quick Revision

```text
LLM = transformer-based token predictor/generator
Attention = weigh context relationships
Pretraining changes parameters
Inference uses trained parameters
Prompting changes context
Fine-tuning changes weights
Retrieval adds external runtime knowledge
LLM ≠ database
LLM ≠ deterministic rules engine
```

---

# 16. Readiness Gate

- [ ] AI/ML/GenAI distinction.
- [ ] LLM definition.
- [ ] Transformer/attention.
- [ ] Training vs inference.
- [ ] Prompt vs fine-tune vs retrieval.
- [ ] Probabilistic behavior.
- [ ] Payroll drill.

**Gate:** READY / REPAIR

---

# 17. References

- Transformer architecture literature
- Provider-neutral LLM documentation
